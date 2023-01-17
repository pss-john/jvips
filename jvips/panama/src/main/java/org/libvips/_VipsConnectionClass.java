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
public class _VipsConnectionClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
    ).withName("_VipsConnectionClass");
    public static MemoryLayout $LAYOUT() {
        return _VipsConnectionClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 328);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


