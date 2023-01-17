/*
 * jvips, a Java implementation that interfaces to libvips
 *
 * Copyright (C) 2023 Jonathan Strauss
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * https://www.gnu.org/licenses/old-licenses/lgpl-2.1-standalone.html
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

// Generated by jextract

package org.libvips;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _VipsSourceCustomClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.structLayout(
                            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type")
                        ).withName("g_type_class"),
                        Constants$root.C_POINTER$LAYOUT.withName("construct_properties"),
                        Constants$root.C_POINTER$LAYOUT.withName("constructor"),
                        Constants$root.C_POINTER$LAYOUT.withName("set_property"),
                        Constants$root.C_POINTER$LAYOUT.withName("get_property"),
                        Constants$root.C_POINTER$LAYOUT.withName("dispose"),
                        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
                        Constants$root.C_POINTER$LAYOUT.withName("dispatch_properties_changed"),
                        Constants$root.C_POINTER$LAYOUT.withName("notify"),
                        Constants$root.C_POINTER$LAYOUT.withName("constructed"),
                        Constants$root.C_LONG_LONG$LAYOUT.withName("flags"),
                        Constants$root.C_LONG_LONG$LAYOUT.withName("n_construct_properties"),
                        Constants$root.C_POINTER$LAYOUT.withName("pspecs"),
                        Constants$root.C_LONG_LONG$LAYOUT.withName("n_pspecs"),
                        MemoryLayout.sequenceLayout(3, Constants$root.C_POINTER$LAYOUT).withName("pdummy")
                    ).withName("parent_class"),
                    Constants$root.C_POINTER$LAYOUT.withName("build"),
                    Constants$root.C_POINTER$LAYOUT.withName("postbuild"),
                    Constants$root.C_POINTER$LAYOUT.withName("summary_class"),
                    Constants$root.C_POINTER$LAYOUT.withName("summary"),
                    Constants$root.C_POINTER$LAYOUT.withName("dump"),
                    Constants$root.C_POINTER$LAYOUT.withName("sanity"),
                    Constants$root.C_POINTER$LAYOUT.withName("rewind"),
                    Constants$root.C_POINTER$LAYOUT.withName("preclose"),
                    Constants$root.C_POINTER$LAYOUT.withName("close"),
                    Constants$root.C_POINTER$LAYOUT.withName("postclose"),
                    Constants$root.C_POINTER$LAYOUT.withName("new_from_string"),
                    Constants$root.C_POINTER$LAYOUT.withName("to_string"),
                    Constants$root.C_INT$LAYOUT.withName("output_needs_arg"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("output_to_arg"),
                    Constants$root.C_POINTER$LAYOUT.withName("nickname"),
                    Constants$root.C_POINTER$LAYOUT.withName("description"),
                    Constants$root.C_POINTER$LAYOUT.withName("argument_table"),
                    Constants$root.C_POINTER$LAYOUT.withName("argument_table_traverse"),
                    Constants$root.C_LONG_LONG$LAYOUT.withName("argument_table_traverse_gtype"),
                    Constants$root.C_INT$LAYOUT.withName("deprecated"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("_vips_reserved1"),
                    Constants$root.C_POINTER$LAYOUT.withName("_vips_reserved2"),
                    Constants$root.C_POINTER$LAYOUT.withName("_vips_reserved3"),
                    Constants$root.C_POINTER$LAYOUT.withName("_vips_reserved4")
                ).withName("parent_class")
            ).withName("parent_class"),
            Constants$root.C_POINTER$LAYOUT.withName("read"),
            Constants$root.C_POINTER$LAYOUT.withName("seek")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("read"),
        Constants$root.C_POINTER$LAYOUT.withName("seek")
    ).withName("_VipsSourceCustomClass");
    public static MemoryLayout $LAYOUT() {
        return _VipsSourceCustomClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 344);
    }
    static final FunctionDescriptor read$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle read$MH = RuntimeHelper.downcallHandle(
        _VipsSourceCustomClass.read$FUNC
    );
    public interface read {

        long apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, long _x2);
        static MemorySegment allocate(read fi, MemorySession session) {
            return RuntimeHelper.upcallStub(read.class, fi, _VipsSourceCustomClass.read$FUNC, session);
        }
        static read ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, long __x2) -> {
                try {
                    return (long)_VipsSourceCustomClass.read$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle read$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("read"));
    public static VarHandle read$VH() {
        return _VipsSourceCustomClass.read$VH;
    }
    public static MemoryAddress read$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_VipsSourceCustomClass.read$VH.get(seg);
    }
    public static void read$set( MemorySegment seg, MemoryAddress x) {
        _VipsSourceCustomClass.read$VH.set(seg, x);
    }
    public static MemoryAddress read$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_VipsSourceCustomClass.read$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void read$set(MemorySegment seg, long index, MemoryAddress x) {
        _VipsSourceCustomClass.read$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static read read (MemorySegment segment, MemorySession session) {
        return read.ofAddress(read$get(segment), session);
    }
    static final FunctionDescriptor seek$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle seek$MH = RuntimeHelper.downcallHandle(
        _VipsSourceCustomClass.seek$FUNC
    );
    public interface seek {

        long apply(java.lang.foreign.MemoryAddress _x0, long _x1, int _x2);
        static MemorySegment allocate(seek fi, MemorySession session) {
            return RuntimeHelper.upcallStub(seek.class, fi, _VipsSourceCustomClass.seek$FUNC, session);
        }
        static seek ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, long __x1, int __x2) -> {
                try {
                    return (long)_VipsSourceCustomClass.seek$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle seek$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("seek"));
    public static VarHandle seek$VH() {
        return _VipsSourceCustomClass.seek$VH;
    }
    public static MemoryAddress seek$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_VipsSourceCustomClass.seek$VH.get(seg);
    }
    public static void seek$set( MemorySegment seg, MemoryAddress x) {
        _VipsSourceCustomClass.seek$VH.set(seg, x);
    }
    public static MemoryAddress seek$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_VipsSourceCustomClass.seek$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void seek$set(MemorySegment seg, long index, MemoryAddress x) {
        _VipsSourceCustomClass.seek$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static seek seek (MemorySegment segment, MemorySession session) {
        return seek.ofAddress(seek$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


