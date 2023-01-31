package com.pss.jvips.plugin.service.executables.arguments;

import com.google.common.base.Preconditions;
import com.pss.jvips.plugin.service.executables.arguments.types.IntrospectedArgument;
import com.squareup.javapoet.TypeName;
import org.immutables.value.Value;

import java.util.List;

public interface OptionalArgumentDTO<T extends TypeName> extends IntrospectedArgument {

    List<OptionalArgumentParameterDTO> getArguments();

    T getType();

    default boolean isSingular() {
        return getArguments().size() == 1;
    }

    default OptionalArgumentParameterDTO getSingularArgument(){
        Preconditions.checkArgument(isSingular());
        return getArguments().get(0);
    }


}
