package com.pss.jvips.plugin.service.executables.arguments;

import com.pss.jvips.plugin.antlr.csource.MacroType;
import com.pss.jvips.plugin.antlr.csource.ValueHolder;
import com.pss.jvips.plugin.model.xml.types.Direction;
import com.pss.jvips.plugin.naming.JavaCaseFormat;
import com.pss.jvips.plugin.service.executables.arguments.types.ArgumentMacro;
import com.squareup.javapoet.TypeName;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

@Value.Immutable
public interface CompleteArgumentDTO extends IntrospectedArgumentDTO, ArgumentMacro {

    MacroArgumentDTO getMacro();

    @Override
    default MacroType getMacroType() {
        return getMacro().getMacroType();
    }

    @Override
    default String getLabel() {
        return getMacro().getLabel();
    }

    @Override
    default String getDescription() {
        return getMacro().getDescription();
    }

    @Override
    default @Nullable ValueHolder getDefaultValue() {
        return getMacro().getDefaultValue();
    }

    @Override
    default @Nullable ValueHolder getMinValue() {
        return getMacro().getMinValue();
    }

    @Override
    default @Nullable ValueHolder getMaxValue() {
        return getMacro().getMaxValue();
    }

    @Override
    default TypeName getType() {
        return getMacro().getType();
    }

    @Override
    default JavaCaseFormat getFormattedName() {
        return getMacro().getFormattedName();
    }

    @Override
    default String getName() {
        return getMacro().getName();
    }

    @Override
    default boolean isImage() {
        return getMacro().isImage();
    }

    @Override
    default boolean isDeprecated() {
        return getMacro().isDeprecated();
    }

    @Override
    default boolean isRequired() {
        return getMacro().isRequired();
    }

    @Override
    default Direction getDirection() {
        return getMacro().getDirection();
    }

}
