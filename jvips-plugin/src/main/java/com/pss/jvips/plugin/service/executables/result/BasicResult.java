package com.pss.jvips.plugin.service.executables.result;

import com.squareup.javapoet.TypeName;
import org.immutables.value.Value;

@Value.Immutable
public interface BasicResult extends Result<TypeName, TypeName> {

}
