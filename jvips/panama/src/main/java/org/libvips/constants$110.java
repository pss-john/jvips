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
class constants$110 {

    static final FunctionDescriptor vips_image_write$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_image_write$MH = RuntimeHelper.downcallHandle(
        "vips_image_write",
        constants$110.vips_image_write$FUNC
    );
    static final FunctionDescriptor vips_image_write_to_file$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_image_write_to_file$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_image_write_to_file",
        constants$110.vips_image_write_to_file$FUNC
    );
    static final FunctionDescriptor vips_image_write_to_buffer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_image_write_to_buffer$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_image_write_to_buffer",
        constants$110.vips_image_write_to_buffer$FUNC
    );
    static final FunctionDescriptor vips_image_write_to_target$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_image_write_to_target$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_image_write_to_target",
        constants$110.vips_image_write_to_target$FUNC
    );
    static final FunctionDescriptor vips_image_write_to_memory$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_image_write_to_memory$MH = RuntimeHelper.downcallHandle(
        "vips_image_write_to_memory",
        constants$110.vips_image_write_to_memory$FUNC
    );
    static final FunctionDescriptor vips_image_decode_predict$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_image_decode_predict$MH = RuntimeHelper.downcallHandle(
        "vips_image_decode_predict",
        constants$110.vips_image_decode_predict$FUNC
    );
}


