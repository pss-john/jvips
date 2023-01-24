package com.pss.jvips.plugin.service.executables.arguments;

import com.pss.jvips.plugin.service.executables.arguments.types.BaseArgument;
import com.pss.jvips.plugin.service.executables.arguments.types.IntrospectedArgument;
import org.immutables.value.Value;

/**
 * Represents the Arguments from the GObject Introspection, these will contain length parameters as the C code doesn't
 * expose the boxed arguments except Target
 */
@Value.Immutable
public interface IntrospectedArgumentDTO extends BaseArgument, IntrospectedArgument {
}
