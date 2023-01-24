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

package com.pss.jvips.plugin.service.executables;

import com.google.common.base.Preconditions;
import com.pss.jvips.plugin.model.xml.executable.AbstractExecutable;
import com.pss.jvips.plugin.model.xml.executable.Parameter;
import com.pss.jvips.plugin.model.xml.types.Direction;
import com.pss.jvips.plugin.naming.JavaCaseFormat;
import com.pss.jvips.plugin.service.VersionedService;
import com.pss.jvips.plugin.service.executables.arguments.*;
import com.pss.jvips.plugin.service.executables.arguments.types.BaseArgument;
import com.pss.jvips.plugin.service.naming.method.MethodAndParameterNamingService;
import com.pss.jvips.plugin.service.types.TypeMappingService;
import com.pss.jvips.plugin.util.History;
import com.pss.jvips.plugin.util.Utils;
import com.squareup.javapoet.TypeName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExecutableModelBuilderImpl implements VersionedService {

    private static final Logger log = LoggerFactory.getLogger(ExecutableModelBuilderImpl.class);

    // Parameter names that are out params that refer to size
    public static final List<String> POSSIBLE_LENGTH_OR_SIZE = List.of("n", "length", "sizeof_type", "len", "size");


    private final TypeMappingService typeMappingService;
    private final MethodAndParameterNamingService namingService;

    public ExecutableModelBuilderImpl(TypeMappingService typeMappingService, MethodAndParameterNamingService namingService) {
        this.typeMappingService = typeMappingService;
        this.namingService = namingService;
    }

    public CombinedExecutableDTO build(AbstractExecutable executable, MacroExecutableDTO firstDto, OptionalArgumentDTO optionalArguments){
        List<IntrospectedArgumentDTO> arrayParams = new ArrayList<>();
        List<IntrospectedArgumentDTO> parameters = new ArrayList<>();

        ImmutableCombinedExecutableDTO.Builder combined = ImmutableCombinedExecutableDTO.builder();
        ImmutableExecutableDTO.Builder jni = ImmutableExecutableDTO.builder();
        ImmutableExecutableDTO.Builder panama = ImmutableExecutableDTO.builder();

        Map<String, Parameter> nativeCallParams = Utils.toLinkedHashMap(executable.getParameters(), Parameter::getName);
        Map<String, MacroArgumentDTO> allRequired = Utils.toLinkedHashMap(firstDto.getAllRequired(), BaseArgument::getName);

        for (Parameter parameter : nativeCallParams.values()) {
            if(!parameter.isVarArg()) {
                MacroArgumentDTO macroArgument = allRequired.get(parameter.getName());
                History<TypeName> type = typeMappingService.getType(parameter.getType());
                if(macroArgument != null) {
                    Preconditions.checkArgument(type.target().equals(macroArgument.getType()),
                            "Types differ for parameter %s in  %s, introspected:  %s, macro:  %s",
                            parameter.getName(), executable.getName(), type.target(), macroArgument.getType());
                    if (parameter.isArrayType()) {
                        var builder = ImmutableCompleteArgumentDTO.builder()
                                .macro(macroArgument);
                        parameter.documentation().ifPresent(builder::documentation);
                        arrayParams.add(builder.build());
                    } else {
                        var builder = ImmutableCompleteArgumentDTO.builder()
                                .macro(macroArgument);
                        parameter.documentation().ifPresent(builder::documentation);
                        parameters.add(builder.build());
                    }
                } else if(POSSIBLE_LENGTH_OR_SIZE.contains(parameter.getName())){
                    Preconditions.checkArgument(!arrayParams.isEmpty(),
                            "Length param detected in %s named %s but no array arguments were found",
                            executable.getName(), parameter.getName());
                    History<JavaCaseFormat> parameterName = namingService.getParameterName(parameter.getName());
                    var builder = ImmutableIntrospectedArgumentDTO.builder()
                            .formattedName(parameterName.target())
                            .name(parameter.getName())
                            .direction(Direction.IN)
                            .isDeprecated(false)
                            .isImage(false)
                            .isRequired(true)
                            .type(type.target());
                    parameter.documentation().ifPresent(builder::documentation);
                    var composed = ImmutableComposedArgumentDTO.builder()
                            .argumentDTO(builder.build())
                            .addAllComposed(arrayParams).build();
                    arrayParams.clear();
                    parameters.add(composed);
                }
            }
        }
        Preconditions.checkArgument(arrayParams.isEmpty(),
                "Array Params still has values for method: %s, %s", executable.getName(), arrayParams);

        return null;
    }

}
