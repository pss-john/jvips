/*
 * jvips, a Java implementation that interfaces to libvips
 *
 * Copyright (C) 2023 Jonathan Strauss
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * https://www.gnu.org/licenses/old-licenses/lgpl-2.1-standalone.html
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package com.pss.jvips.plugin.generation.impl.operations;

import com.pss.jvips.plugin.context.GlobalPluginContext;
import com.pss.jvips.plugin.context.OperationContext;
import com.pss.jvips.plugin.model.dto.parameters.WritableParameter;
import com.pss.jvips.plugin.model.xml.executable.AbstractExecutable;
import com.pss.jvips.plugin.model.xml.types.Direction;
import com.pss.jvips.plugin.service.executables.CombinedExecutableDTO;
import com.pss.jvips.plugin.service.executables.arguments.CompleteArgumentDTO;
import com.pss.jvips.plugin.util.Constants;
import com.pss.jvips.plugin.util.OutParam;
import com.pss.jvips.plugin.util.Utils;
import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static com.pss.jvips.plugin.naming.JavaTypeMapping.*;
import static com.pss.jvips.plugin.util.Constants.*;

public class GenerateJniOperations extends OperationGenerator<OperationGenerator.OperationGeneratorContext> {


    public GenerateJniOperations(Path task, GlobalPluginContext context) {
        super(task, context, OperationContext.JNI);
    }

    @Override
    protected ParameterizedTypeName parameterizedContextClass() {
        return VipsOperationContext_Long_class;
    }

    @Override
    protected ParameterizedTypeName parameterizedOperationClass() {
        return VipsOperations_Long_class;
    }

    @Override
    protected ParameterizedTypeName parameterizedImageClass() {
        return JVipsImage_Long_class;
    }

    @Override
    protected ClassName className() {
        return JniVipsOperations_class;
    }

    @Override
    protected List<Modifier> modifiers() {
        return List.of(Modifier.PUBLIC);
    }

    @Override
    protected void addExecutables(OperationGeneratorContext arguments, TypeSpec.Builder typeSpec,
                                  CombinedExecutableDTO executable, MethodSpec.Builder methodSpec, OptionalType optionalType) {
        List<CompleteArgumentDTO> requiredInput = executable.getRequiredInput();
        List<CompleteArgumentDTO> requiredOutput = executable.getRequiredOutput();
        CodeBlock inSize = switch (optionalType){
            case NONE -> CodeBlock.of("$L", requiredInput.size() * 2);
            case SINGLE -> {
                if(executable.getOptionalArgument().getSingularArgument().getDirection() == Direction.IN){
                    yield CodeBlock.of("($L + ($L == null ? 0 : 1)) * 2", requiredInput.size(), executable.getOptionalArgument().getSingularArgument().javaName());
                } else {
                    yield CodeBlock.of("$L", requiredInput.size() * 2);
                }

            }
            case DTO -> CodeBlock.of("($L + ($L == null ? 0 : $L.getInSize())) * 2", requiredInput.size(), "arg", "arg");
        };
        CodeBlock outSize = switch (optionalType){
            case NONE -> CodeBlock.of("$L", requiredOutput.size() * 2);
            case SINGLE -> {
                if(executable.getOptionalArgument().getSingularArgument().getDirection() == Direction.OUT){
                    yield CodeBlock.of("($L + ($L == null ? 0 : 1)) * 2", requiredOutput.size(), executable.getOptionalArgument().getSingularArgument().javaName());
                } else {
                    yield CodeBlock.of("$L", requiredOutput.size() * 2);
                }
            }
            case DTO -> CodeBlock.of("($L + ($L == null ? 0 : $L.getOutSize())) * 2", requiredOutput.size(), "arg", "arg");
        };

        var inArray = CodeBlock.of("Object[] $L = new Object[$L]", in$params, inSize);
        var outArray = CodeBlock.of("Object[] $L = new Object[$L]", out$params, outSize);
        List<String> lockNames = new ArrayList<>();
        executable.getImageInput().forEach(x-> lockNames.add(x.javaName()));
        executable.getImageArrayInput().forEach(x-> lockNames.add(x.javaName()));
    }


    @Override
    protected TypeSpec.Builder customize(TypeSpec.Builder typeSpec) {
        return typeSpec.superclass(parameterizedOperationClass());
    }


    protected void addConstructor(TypeSpec.Builder typeSpec) {
        typeSpec.addMethod(createSuperConstructor(Long_class, VOID).build());
        MethodSpec.Builder newImage = newFromFile();

        newImage
                .addStatement("long $L = access.getNewId(context)", "out$id")
                .addStatement("return access.createImage(context, $L, $T.newImageFromFile($L, $L) , Thread.currentThread())", "out$id", VipsNative_class, "fileName","out$id");
        typeSpec.addMethod(newImage.build());
    }

    protected void buildInternal(TypeSpec.Builder typeSpec,
                                 MethodSpec.Builder method, AbstractExecutable executable,
                                 List<WritableParameter> writableParams, TypeName type) {



        CodeBlock.Builder builder = CodeBlock.builder();
        writableParams.forEach(x-> x.addPreInit(method));
        var iterator = writableParams.iterator();
        if(iterator.hasNext()){
            iterator.next().addArrayInitializer(0,0, builder, iterator);
        }
        List<CodeBlock> locks = new ArrayList<>();
        Set<OutParam> outParams = new LinkedHashSet<>();
        writableParams.forEach(x-> x.registerOutParams(outParams));
        writableParams.forEach(x-> x.addImageLocks(locks));
        writableParams.forEach(x-> x.addImageArrayLocks(locks));
        CodeBlock lockParameters = CodeBlock.join(locks, ", ");

        boolean requiresLock = false;
        boolean drawMethod = Utils.requiresWriteLock(executable);

        if(!writableParams.isEmpty()){
            iterator = writableParams.iterator();
            requiresLock = iterator.next().requiresLock(iterator);
        }


        if(!writableParams.isEmpty()) {

            builder.addStatement("String[] message = new String[1]");
            builder.addStatement("int $L = -1", in$index);
            builder.addStatement("int $L = -1", out$index);

            writableParams.forEach(x -> x.writeJniInArray(builder));
            writableParams.forEach(x -> x.writeJniOutArray(builder));


            builder.addStatement("$T.call($S, $L, $L, $L)", VipsNative_class, executable.getName(), in$params, out$params, "message");
            CodeBlock.Builder outLoop = CodeBlock.builder();

            builder.addStatement("$L = 2", out$index);
            writableParams.forEach(x -> x.addPostInit(builder));


            if (!drawMethod) { // Draw methods are void

                if (type.isPrimitive()) {
                    builder.beginControlFlow("if($S.equals($L[0]) && $L[2] != null)", "out", out$params, out$params)
                            .addStatement("return ($T) $L[2]", type, out$params)
                            .endControlFlow()
                            .addStatement("throw new VipsException($S)", "Return value was null");
                } else if (parameterizedImageClass().equals(type)) {

                    builder.beginControlFlow("if($S.equals($L[0]) && $L[2] != null)", "out", out$params, out$params)
                            .addStatement("return access.createImage(context, $L, (Long) $L[2], Thread.currentThread())", "out$id", out$params)
                            .endControlFlow()
                            .addStatement("throw new VipsException($S)", "Return value was null");
                } else if(Utils.isType(type, JVipsBlob_class)){
                    builder.beginControlFlow("if($L[2] != null)",  out$params)
                            .addStatement("return access.createBlob(context, access.getNewId(context), (Long) $L[2], Thread.currentThread())", out$params)
                            .endControlFlow()
                            .addStatement("throw new VipsException($S)", "Return value was null");
                } else if (outParams.size() > 1) {
                    //impl.beginControlFlow("for(int i = 0; i < $L.length; i +=3)", out$params);
                    String $name = "$name";
                    List<CodeBlock> blocks = new ArrayList<>();
                    int i = 0;
                    for (OutParam outParam : outParams) {
                        if (JVipsImage_class.equals(type)) {
                            blocks.add(
                                    CodeBlock.of("context.createImage($L, (Long) $L[$L], Thread.currentThread())", outParam.name() + "$id", out$params, i)
                            );
                        } else {
                            blocks.add(
                                    CodeBlock.of("($T) $L[$L]", outParam.type(), out$params, i)
                            );
                        }
                        i += 3;
                    }
                    CodeBlock joined = CodeBlock.join(blocks, ", ");
                    builder.addStatement("return new $T($L)", type, joined);
                }
            }
        }

        if(requiresLock && drawMethod) {
            method.addCode("$T.writeLock($L, ()-> { \n$>$L $<\n});", Locking_class, lockParameters, builder.build());
        } else if(requiresLock && outParams.isEmpty()){
            method.addCode("$T.lock($L, ()-> { \n$>$L $<\n});", Locking_class, lockParameters, builder.build());
        } else if(requiresLock){
            method.addCode("return $T.lock($L, ()-> { \n$>$L $<\n});", Locking_class, lockParameters, builder.build());
        } else {
            method.addCode("$L", builder.build());
        }

        typeSpec.addMethod(method.build());
    }



}
