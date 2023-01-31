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
import com.pss.jvips.plugin.model.dto.parameters.WritableParameter;
import com.pss.jvips.plugin.model.xml.executable.AbstractExecutable;
import com.pss.jvips.plugin.service.executables.CombinedExecutableDTO;
import com.pss.jvips.plugin.service.executables.arguments.ComposedArgumentDTO;
import com.pss.jvips.plugin.util.Utils;
import com.squareup.javapoet.*;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.lang.model.element.Modifier;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.pss.jvips.plugin.naming.JavaTypeMapping.*;

public class GenerateAbstractOperations extends OperationGenerator<OperationGenerator.OperationGeneratorContext> {

    private static final Logger log = LoggerFactory.getLogger(GenerateAbstractOperations.class);

    public GenerateAbstractOperations(Path path, OperationContext context) {
        super(path, context);
    }

    @Override
    protected List<Modifier> modifiers() {
        return List.of(Modifier.PUBLIC, Modifier.ABSTRACT);
    }

    @Override
    protected void addExecutables(OperationGeneratorContext arguments, TypeSpec.Builder typeSpec,
                                  CombinedExecutableDTO executable, MethodSpec.Builder methodSpec, OptionalType optionalType) {
        methodSpec.addModifiers(Modifier.ABSTRACT);
        MethodSpec build = methodSpec.build();
        typeSpec.addMethod(build);
        if(optionalType != OptionalType.NONE){
            MethodSpec.Builder overloaded = build.toBuilder();
            overloaded.parameters.remove(overloaded.parameters.size() - 1);
            overloaded.clearJavaDoc();
            overloaded.annotations.clear();
            overloaded.modifiers.remove(Modifier.ABSTRACT);
            overloaded.modifiers.add(Modifier.FINAL);
            CodeBlock callTypes = executable.getNonParameterizedCallSignature()
                    .stream()
                    .map(t -> CodeBlock.of("$T", t))
                    .collect(CodeBlock.joining(","));
            CodeBlock callParams = overloaded.parameters.stream().map(x -> CodeBlock.of("$L", x.name)).collect(CodeBlock.joining(","));
            CodeBlock.Builder call = CodeBlock.builder();
            if(!TypeName.VOID.equals(executable.getResult().getType())){
                call.add("return ");
            }
            call.add("$L($L, null)", executable.javaName(), callParams);
            overloaded.addJavadoc("@see $T#$L($L)", VipsOperations_class, executable.javaName(), callTypes);
            typeSpec.addMethod(overloaded.build());
        }
    }



    @Override
    protected TypeSpec.Builder customize(TypeSpec.Builder builder){
        return builder.addTypeVariables(List.of(DataType_TypeVariable, UnderlyingSession_TypeVariable));
    }



    @Override
    protected void addConstructorAndFields(TypeSpec.Builder typeSpec) {
        typeSpec.addField(FieldSpec.builder(VipsOperationContextAccess_class, "access", Modifier.FINAL, Modifier.STATIC, Modifier.PROTECTED)
                .initializer("$T.getContextAccess()", VipsSharedSecret_class).build());
        typeSpec.addField(context.getContext(), "context", Modifier.PROTECTED, Modifier.FINAL);
        typeSpec.addMethod(createAbstractConstructor().build());
        typeSpec.addMethod(newFromFile().addModifiers(Modifier.ABSTRACT).build());
    }
    protected MethodSpec.Builder newFromFile(){
        return MethodSpec.methodBuilder("newImageFromFile").addParameter(ParameterSpec.builder(String_class, "fileName").build()).addModifiers(Modifier.PUBLIC)
                .addException(VipsException_class)
                .returns(context.getImage());
    }

    @Override
    protected void customize(MethodSpec.Builder builder) {
        builder.addModifiers(Modifier.ABSTRACT);
    }


}
