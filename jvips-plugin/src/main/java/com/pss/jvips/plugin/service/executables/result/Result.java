package com.pss.jvips.plugin.service.executables.result;

import com.squareup.javapoet.TypeName;

public interface Result<J extends TypeName, N extends TypeName> {

    J getType();

    N getNativeType();

}
