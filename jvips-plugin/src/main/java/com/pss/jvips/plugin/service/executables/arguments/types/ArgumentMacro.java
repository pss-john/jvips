package com.pss.jvips.plugin.service.executables.arguments.types;

import com.pss.jvips.plugin.antlr.csource.MacroType;
import com.pss.jvips.plugin.antlr.csource.ValueHolder;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public interface ArgumentMacro {

    MacroType getMacroType();

    String getLabel();

    String getDescription();

    @Nullable
    ValueHolder getDefaultValue();

    @Nullable
    ValueHolder getMinValue();

    @Nullable
    ValueHolder getMaxValue();

    default Optional<ValueHolder> defaultValue(){
        return Optional.ofNullable(getDefaultValue());
    }

    default Optional<ValueHolder> minValue(){
        return Optional.ofNullable(getMinValue());
    }

    default Optional<ValueHolder> maxValue(){
        return Optional.ofNullable(getMaxValue());
    }
}
