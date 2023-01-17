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
public class VipsWindow {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("im"),
        Constants$root.C_INT$LAYOUT.withName("top"),
        Constants$root.C_INT$LAYOUT.withName("height"),
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_POINTER$LAYOUT.withName("baseaddr"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("length")
    );
    public static MemoryLayout $LAYOUT() {
        return VipsWindow.$struct$LAYOUT;
    }
    static final VarHandle ref_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ref_count"));
    public static VarHandle ref_count$VH() {
        return VipsWindow.ref_count$VH;
    }
    public static int ref_count$get(MemorySegment seg) {
        return (int)VipsWindow.ref_count$VH.get(seg);
    }
    public static void ref_count$set( MemorySegment seg, int x) {
        VipsWindow.ref_count$VH.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)VipsWindow.ref_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        VipsWindow.ref_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle im$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("im"));
    public static VarHandle im$VH() {
        return VipsWindow.im$VH;
    }
    public static MemoryAddress im$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)VipsWindow.im$VH.get(seg);
    }
    public static void im$set( MemorySegment seg, MemoryAddress x) {
        VipsWindow.im$VH.set(seg, x);
    }
    public static MemoryAddress im$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)VipsWindow.im$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void im$set(MemorySegment seg, long index, MemoryAddress x) {
        VipsWindow.im$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle top$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("top"));
    public static VarHandle top$VH() {
        return VipsWindow.top$VH;
    }
    public static int top$get(MemorySegment seg) {
        return (int)VipsWindow.top$VH.get(seg);
    }
    public static void top$set( MemorySegment seg, int x) {
        VipsWindow.top$VH.set(seg, x);
    }
    public static int top$get(MemorySegment seg, long index) {
        return (int)VipsWindow.top$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void top$set(MemorySegment seg, long index, int x) {
        VipsWindow.top$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return VipsWindow.height$VH;
    }
    public static int height$get(MemorySegment seg) {
        return (int)VipsWindow.height$VH.get(seg);
    }
    public static void height$set( MemorySegment seg, int x) {
        VipsWindow.height$VH.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)VipsWindow.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        VipsWindow.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return VipsWindow.data$VH;
    }
    public static MemoryAddress data$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)VipsWindow.data$VH.get(seg);
    }
    public static void data$set( MemorySegment seg, MemoryAddress x) {
        VipsWindow.data$VH.set(seg, x);
    }
    public static MemoryAddress data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)VipsWindow.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemoryAddress x) {
        VipsWindow.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle baseaddr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("baseaddr"));
    public static VarHandle baseaddr$VH() {
        return VipsWindow.baseaddr$VH;
    }
    public static MemoryAddress baseaddr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)VipsWindow.baseaddr$VH.get(seg);
    }
    public static void baseaddr$set( MemorySegment seg, MemoryAddress x) {
        VipsWindow.baseaddr$VH.set(seg, x);
    }
    public static MemoryAddress baseaddr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)VipsWindow.baseaddr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void baseaddr$set(MemorySegment seg, long index, MemoryAddress x) {
        VipsWindow.baseaddr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("length"));
    public static VarHandle length$VH() {
        return VipsWindow.length$VH;
    }
    public static long length$get(MemorySegment seg) {
        return (long)VipsWindow.length$VH.get(seg);
    }
    public static void length$set( MemorySegment seg, long x) {
        VipsWindow.length$VH.set(seg, x);
    }
    public static long length$get(MemorySegment seg, long index) {
        return (long)VipsWindow.length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, long x) {
        VipsWindow.length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

