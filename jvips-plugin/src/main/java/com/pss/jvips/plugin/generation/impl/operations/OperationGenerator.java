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

import com.pss.jvips.plugin.context.OperationContext;
import com.pss.jvips.plugin.generation.CodeGenerator;
import com.pss.jvips.plugin.naming.JavaTypeMapping;
import com.pss.jvips.plugin.service.executables.CombinedExecutableDTO;
import com.pss.jvips.plugin.service.executables.arguments.*;
import com.squareup.javapoet.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.lang.model.element.Modifier;
import java.nio.file.Path;
import java.util.*;

import static com.pss.jvips.plugin.naming.JavaTypeMapping.*;
import static com.pss.jvips.plugin.util.Utils.addDocumentation;
import static com.pss.jvips.plugin.util.Utils.error;

public abstract class OperationGenerator<A extends OperationGenerator.OperationGeneratorContext> extends CodeGenerator<A> {

    public enum OptionalType{NONE, SINGLE, DTO}

    private static final Logger log = LoggerFactory.getLogger(OperationGenerator.class);

    protected final OperationContext context;


    public OperationGenerator(Path path, OperationContext context) {
        super(path);
        this.context = context;
    }

    protected List<Modifier> modifiers(){
        return List.of(Modifier.PUBLIC);
    }

    protected TypeSpec.Builder customize(TypeSpec.Builder builder){
        return builder;
    }

    protected TypeSpec.Builder getTypeSpec(A arguments, ClassName className) {
        return customize(TypeSpec.classBuilder(className).addModifiers(modifiers()));
    }


    @Override
    protected void runInternal(TypeSpec.Builder typeSpec, A arguments, ClassName className) {
        addConstructorAndFields(typeSpec);
        for (CombinedExecutableDTO executable : arguments.getExecutables()) {
            addExecutables(arguments, typeSpec, executable);
        }
    }


    protected abstract void addExecutables(A arguments, TypeSpec.Builder typeSpec, CombinedExecutableDTO executable,
                                           MethodSpec.Builder methodSpec, OptionalType optionalType);

    protected final void addExecutables(A arguments, TypeSpec.Builder typeSpec, CombinedExecutableDTO executable) {
        log.debug("Entering Executable: {}", executable.getName());
        MethodSpec.Builder method = MethodSpec
                .methodBuilder(executable.javaName())
                .addModifiers(Modifier.PUBLIC)
                .addAnnotation(generateNativeAnnotationSpec(executable))
                .addException(JavaTypeMapping.VipsException_class);

        executable.documentation().ifPresent(method::addJavadoc);

        for (IntrospectedArgumentDTO callParameter : executable.getCallParameters()) {
            log.trace("Entering Executable: {}, param: {}", executable.nativeName(), callParameter.nativeName());
            if(callParameter instanceof ComposedArgumentDTO cad){
                for (IntrospectedArgumentDTO composed : cad.getComposed()) {
                    if(composed instanceof CompleteArgumentDTO completed){
                        addParameter(method, completed);
                    } else {
                        error("Error in executable: `%s(..%s...) argument inside of `%s` must be an instance of `%s`",
                                executable.nativeName(), callParameter.nativeName(),
                                ComposedArgumentDTO.class, CompleteArgumentDTO.class);
                    }
                }
            } else if(callParameter instanceof CompleteArgumentDTO completed){
                addParameter(method, completed);
            } else {
                error("Error in executable: `%s(..%s...) argument at build stage must be instance of : `%s` or `%s`",
                        executable.nativeName(), callParameter.nativeName(),
                        CompleteArgumentDTO.class, ComposedArgumentDTO.class);
            }
        }

        OptionalArgumentDTO optionalArgument = executable.getOptionalArgument();
        if(optionalArgument != null){
            if(optionalArgument.isSingular()){
                OptionalArgumentParameterDTO argument = optionalArgument.getSingularArgument();
                var param = ParameterSpec.builder(argument.getType(), argument.javaName())
                        .addAnnotation(
                                AnnotationSpec.builder(JavaTypeMapping.OptionalParameter_class)
                                    .addMember("value", "$S", argument.nativeName())
                                    .build()
                        );
                addDocumentation(argument, param);
                method.addParameter(param.build());
                addExecutables(arguments, typeSpec, executable, method, OptionalType.SINGLE);
            } else {
                var param = ParameterSpec.builder(optionalArgument.getType(), "arg")
                        .addAnnotation(AnnotationSpec.builder(JavaTypeMapping.OptionalParameter_class).build());
                addDocumentation(optionalArgument, param);
                method.addParameter(param.build());
                addExecutables(arguments, typeSpec, executable, method, OptionalType.DTO);
            }
        } else {
            addExecutables(arguments, typeSpec, executable, method, OptionalType.NONE);
        }
        method.returns(executable.getResult().getType());
    }

    private static void addParameter(MethodSpec.Builder method, CompleteArgumentDTO completed) {
        var param = ParameterSpec.builder(completed.getType(), completed.javaName());
        addDocumentation(completed, param);
        method.addParameter(param.build());
    }

    protected void addConstructorAndFields(TypeSpec.Builder typeSpec){

    }

    protected MethodSpec.Builder createAbstractConstructor(){
        return createConstructor(JavaTypeMapping.VipsOperationContext_class, DataType_TypeVariable, JavaTypeMapping.UnderlyingSession_TypeVariable, CodeBlock.of("this.context = context"));
    }

    protected MethodSpec.Builder createSuperConstructor(TypeName type, TypeName type2){
        return createConstructor(JavaTypeMapping.VipsOperationContext_class, type, type2, CodeBlock.of("super(context)"));
    }

    protected MethodSpec.Builder createConstructor(ClassName type, TypeName param, TypeName param2, CodeBlock body){
        return MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC)
                .addParameter(ParameterSpec.builder(ParameterizedTypeName.get(type, param, param2), "context").build())
                .addStatement(body);
    }



    protected void customize(MethodSpec.Builder builder){

    }



    protected AnnotationSpec generateNativeAnnotationSpec(CombinedExecutableDTO executable){
        AnnotationSpec.Builder annotationSpec = AnnotationSpec.builder(JavaTypeMapping.NativeExecutable_class)
                .addMember("name", "$S", executable.nativeName())
                .addMember("returns", "$S", executable.getResult().getNativeType());

        for (IntrospectedArgumentDTO parameter : executable.getCallParameters()) {
            annotationSpec.addMember("parameters", "@$T(value = $S, type = $S)", NativeParameter_class, parameter.getName(), parameter.getType());
        }
        return annotationSpec.build();
    }



    public static class OperationGeneratorContext {
        private final List<CombinedExecutableDTO> executables;

        public OperationGeneratorContext(List<CombinedExecutableDTO> executables) {
            this.executables = executables;
        }

        public List<CombinedExecutableDTO> getExecutables() {
            return executables;
        }
    }
}
