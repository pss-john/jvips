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
public class _VipsSourceCustom {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.structLayout(
                            Constants$root.C_POINTER$LAYOUT.withName("g_class")
                        ).withName("g_type_instance"),
                        Constants$root.C_INT$LAYOUT.withName("ref_count"),
                        MemoryLayout.paddingLayout(32),
                        Constants$root.C_POINTER$LAYOUT.withName("qdata")
                    ).withName("parent_instance"),
                    Constants$root.C_INT$LAYOUT.withName("constructed"),
                    Constants$root.C_INT$LAYOUT.withName("static_object"),
                    Constants$root.C_POINTER$LAYOUT.withName("argument_table"),
                    Constants$root.C_POINTER$LAYOUT.withName("nickname"),
                    Constants$root.C_POINTER$LAYOUT.withName("description"),
                    Constants$root.C_INT$LAYOUT.withName("preclose"),
                    Constants$root.C_INT$LAYOUT.withName("close"),
                    Constants$root.C_INT$LAYOUT.withName("postclose"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_LONG_LONG$LAYOUT.withName("local_memory")
                ).withName("parent_object"),
                Constants$root.C_INT$LAYOUT.withName("descriptor"),
                Constants$root.C_INT$LAYOUT.withName("tracked_descriptor"),
                Constants$root.C_INT$LAYOUT.withName("close_descriptor"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("filename")
            ).withName("parent_object"),
            Constants$root.C_INT$LAYOUT.withName("decode"),
            Constants$root.C_INT$LAYOUT.withName("have_tested_seek"),
            Constants$root.C_INT$LAYOUT.withName("is_pipe"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_LONG_LONG$LAYOUT.withName("read_position"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("length"),
            Constants$root.C_POINTER$LAYOUT.withName("data"),
            Constants$root.C_POINTER$LAYOUT.withName("header_bytes"),
            Constants$root.C_POINTER$LAYOUT.withName("sniff"),
            Constants$root.C_POINTER$LAYOUT.withName("blob"),
            Constants$root.C_POINTER$LAYOUT.withName("mmap_baseaddr"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("mmap_length")
        ).withName("parent_object")
    ).withName("_VipsSourceCustom");
    public static MemoryLayout $LAYOUT() {
        return _VipsSourceCustom.$struct$LAYOUT;
    }
    public static MemorySegment parent_object$slice(MemorySegment seg) {
        return seg.asSlice(0, 184);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

