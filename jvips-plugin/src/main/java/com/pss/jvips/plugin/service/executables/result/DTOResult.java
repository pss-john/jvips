package com.pss.jvips.plugin.service.executables.result;

import com.pss.jvips.plugin.service.executables.arguments.IntrospectedArgumentDTO;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.TypeName;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface DTOResult<N extends TypeName> extends Result<ClassName, N> {

    List<IntrospectedArgumentDTO> getOutParameters();
}
