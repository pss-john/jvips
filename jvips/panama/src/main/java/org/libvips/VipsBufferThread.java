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
public class VipsBufferThread {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hash"),
        Constants$root.C_POINTER$LAYOUT.withName("thread")
    );
    public static MemoryLayout $LAYOUT() {
        return VipsBufferThread.$struct$LAYOUT;
    }
    static final VarHandle hash$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hash"));
    public static VarHandle hash$VH() {
        return VipsBufferThread.hash$VH;
    }
    public static MemoryAddress hash$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)VipsBufferThread.hash$VH.get(seg);
    }
    public static void hash$set( MemorySegment seg, MemoryAddress x) {
        VipsBufferThread.hash$VH.set(seg, x);
    }
    public static MemoryAddress hash$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)VipsBufferThread.hash$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hash$set(MemorySegment seg, long index, MemoryAddress x) {
        VipsBufferThread.hash$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle thread$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("thread"));
    public static VarHandle thread$VH() {
        return VipsBufferThread.thread$VH;
    }
    public static MemoryAddress thread$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)VipsBufferThread.thread$VH.get(seg);
    }
    public static void thread$set( MemorySegment seg, MemoryAddress x) {
        VipsBufferThread.thread$VH.set(seg, x);
    }
    public static MemoryAddress thread$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)VipsBufferThread.thread$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void thread$set(MemorySegment seg, long index, MemoryAddress x) {
        VipsBufferThread.thread$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

