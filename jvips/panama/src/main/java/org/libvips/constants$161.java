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
class constants$161 {

    static final FunctionDescriptor vips_pngload_buffer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_pngload_buffer$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_pngload_buffer",
        constants$161.vips_pngload_buffer$FUNC
    );
    static final FunctionDescriptor vips_pngsave_target$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_pngsave_target$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_pngsave_target",
        constants$161.vips_pngsave_target$FUNC
    );
    static final FunctionDescriptor vips_pngsave$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_pngsave$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_pngsave",
        constants$161.vips_pngsave$FUNC
    );
    static final FunctionDescriptor vips_pngsave_buffer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_pngsave_buffer$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_pngsave_buffer",
        constants$161.vips_pngsave_buffer$FUNC
    );
    static final FunctionDescriptor vips_ppmload$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_ppmload$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_ppmload",
        constants$161.vips_ppmload$FUNC
    );
    static final FunctionDescriptor vips_ppmload_source$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_ppmload_source$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_ppmload_source",
        constants$161.vips_ppmload_source$FUNC
    );
}


