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
class constants$237 {

    static final FunctionDescriptor vips_guess_libdir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_guess_libdir$MH = RuntimeHelper.downcallHandle(
        "vips_guess_libdir",
        constants$237.vips_guess_libdir$FUNC
    );
    static final MemoryAddress NULL$ADDR = MemoryAddress.ofLong(0L);
    static final MemorySegment G_GINT16_MODIFIER$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("h");
    static final MemorySegment G_GINT16_FORMAT$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("hi");
    static final MemorySegment G_GUINT16_FORMAT$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("hu");
    static final MemorySegment G_GINT32_MODIFIER$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("");
}

