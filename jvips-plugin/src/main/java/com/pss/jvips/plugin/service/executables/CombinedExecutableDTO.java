package com.pss.jvips.plugin.service.executables;

import org.immutables.value.Value;

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
public interface CombinedExecutableDTO {

    ExecutableDTO getPanama();

    ExecutableDTO getJni();

    ExecutableDTO getJavaMethodSignature();
}
