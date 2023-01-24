package com.pss.jvips.plugin.service.executables.arguments.types;

import com.pss.jvips.plugin.service.executables.arguments.ComposedArgumentDTO;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;


public interface IntrospectedArgument {

    @Nullable
    String getDocumentation();

    default Optional<String> documentation(){
        return Optional.ofNullable(getDocumentation());
    }

}
