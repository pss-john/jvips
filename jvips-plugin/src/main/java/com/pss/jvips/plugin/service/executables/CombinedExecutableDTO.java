package com.pss.jvips.plugin.service.executables;

import com.pss.jvips.plugin.antlr.csource.MacroType;
import com.pss.jvips.plugin.context.OperationContext;
import com.pss.jvips.plugin.model.xml.types.Direction;
import com.pss.jvips.plugin.naming.JavaTypeMapping;
import com.pss.jvips.plugin.service.executables.arguments.CompleteArgumentDTO;
import com.pss.jvips.plugin.service.executables.arguments.IntrospectedArgumentDTO;
import com.pss.jvips.plugin.service.executables.arguments.MacroArgumentDTO;
import com.pss.jvips.plugin.service.executables.arguments.OptionalArgumentDTO;
import com.pss.jvips.plugin.service.executables.arguments.types.BaseArgument;
import com.pss.jvips.plugin.service.executables.result.Result;
import com.pss.jvips.plugin.util.Utils;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The method signature for calling directly via FFI vs Operation Introspection differ, example:
 *
 * .Parameters for Introspection
 * [source,C]
 * ----
 * 	VIPS_ARG_BOXED( class, "a", 110, <1>
 * 		_( "a" ),
 * 		_( "Multiply by this" ),
 * 		VIPS_ARGUMENT_REQUIRED_INPUT,
 * 		G_STRUCT_OFFSET( VipsLinear, a ),
 * 		VIPS_TYPE_ARRAY_DOUBLE );
 *
 * 	VIPS_ARG_BOXED( class, "b", 111, <2>
 * 		_( "b" ),
 * 		_( "Add this" ),
 * 		VIPS_ARGUMENT_REQUIRED_INPUT,
 * 		G_STRUCT_OFFSET( VipsLinear, b ),
 * 		VIPS_TYPE_ARRAY_DOUBLE );
 * ----
 * <1> This is a convenience wrapper around an array
 * <2> This is also a convenience wrapper around an array
 *
 *
 *.Directly calling via Panama FFI
 * [source,C]
 * ----
 * int
 * vips_linear( VipsImage *in, VipsImage **out,
 * 	const double *a, const double *b, int n, ... ) <1>
 * ----
 * <1> Which calls `vips_linearv`
 *
 * .Called from `vips_linear`
 * [source,C]
 * ----
 * static int
 * vips_linearv( VipsImage *in, VipsImage **out,
 * 	const double *a, const double *b, int n, va_list ap )
 * {
 * 	VipsArea *area_a;
 * 	VipsArea *area_b;
 * 	int result;
 *
 * 	area_a = VIPS_AREA( vips_array_double_new( a, n ) );
 * 	area_b = VIPS_AREA( vips_array_double_new( b, n ) );
 * 	----
 *
 * 	Both methods will end up with the same API, but will call differently
 *
 * .JNI Example
 * [source,java]
 * ----
 * public VipsImage<ByteBuffer> linear(VipsImage<ByteBuffer> in, double[] a, double[] b, @OptionalParam("uchar") Boolean uchar){
 *     in[++index] = a
 *     in[++index] = VIPS_ARRAY_DOUBLE
 *     in[++index] = b
 *     in[++index] = VIPS_ARRAY_DOUBLE
 *     ...
 *     VipsNative.call(...) <1>
 * }
 * ----
 * <1> JNI handles boxing
 *
 * .Panama Example, (Java v19)
 * [source,java]
 * ----
 * public VipsImage<MemorySegment> linear(VipsImage<MemorySegment> in, double[] a, double[] b, @OptionalParam("uchar") Boolean uchar){
 *     MemoryAddress memA = memorySession.allocateArray(LibVips.C_DOUBLE, a);
 *     MemoryAddress memB = memorySession.allocateArray(LibVips.C_DOUBLE, b);
 *     MemoryAddress out - memorySession.allocate(LibVips.C_POINTER);
 *     ...
 *     if(uchar == null){
 *        int result = LibVips.vips_linear(in.getAddress(), out, memA, memB, a.length, MemoryAddress.NULL);
 *        ...
 *     } else {
 *     ...
 * }
 * ----
 *
 */
@Value.Immutable
public interface CombinedExecutableDTO extends BaseExecutableDTO {

    List<IntrospectedArgumentDTO> getCallParameters();

    @Nullable
    OptionalArgumentDTO<?> getOptionalArgument();

    TypeName getContextAwareReturnType();

    TypeName getNativeReturnType();

    List<TypeName> getContextAwareFullCallSignature();

    @EnsuresNonNullIf(expression = "getContextAwareNullOverloadCallSignature()", result = true)
    boolean hasNullOverload();

    @Nullable
    List<TypeName> getContextAwareNullOverloadCallSignature();

    /**
     * The types in the null overload method call @see also refrences
     * @return list of types without paramterization
     */
    @Nullable
    List<TypeName> getNonParameterizedCallSignature();

    boolean isDocumentationParsed();

    Result getResult();

    List<CompleteArgumentDTO> getAllArguments();


    @Value.Lazy
    default List<CompleteArgumentDTO> getNonDeprecatedArguments(){
        return getAllArguments().stream().filter(x-> !x.isDeprecated()).collect(Collectors.toList());
    }

    @Value.Lazy
    default List<CompleteArgumentDTO> getRequiredInput(){
        return getNonDeprecatedArguments().stream().filter(x-> x.isRequired() && x.getDirection() == Direction.IN).collect(Collectors.toList());
    }

    @Value.Lazy
    default List<CompleteArgumentDTO> getOptionalInput(){
        return getNonDeprecatedArguments().stream().filter(x-> !x.isRequired() && x.getDirection() == Direction.IN).collect(Collectors.toList());
    }

    @Value.Lazy
    default List<CompleteArgumentDTO> getRequiredOutput(){
        return getNonDeprecatedArguments().stream().filter(x-> x.isRequired() && x.getDirection() == Direction.OUT).collect(Collectors.toList());
    }

    @Value.Lazy
    default List<CompleteArgumentDTO> getOptionalOutput(){
        return getNonDeprecatedArguments().stream().filter(x-> !x.isRequired() && x.getDirection() == Direction.OUT).collect(Collectors.toList());
    }

    @Value.Lazy
    default List<CompleteArgumentDTO> getImageInput(){
        return getRequiredInput().stream().filter(s-> s.isImage() && s.getMacroType() == MacroType.IMAGE).collect(Collectors.toList());
    }

    @Value.Lazy
    default List<CompleteArgumentDTO> getImageArrayInput(){
        return getRequiredInput().stream().filter(s-> s.isImage() && s.getMacroType() == MacroType.BOXED_IMAGE).collect(Collectors.toList());
    }


    @Value.Lazy
    default List<CompleteArgumentDTO> getAllRequired(){
        return getAllArguments().stream().filter(BaseArgument::isRequired).collect(Collectors.toList());
    }
}
