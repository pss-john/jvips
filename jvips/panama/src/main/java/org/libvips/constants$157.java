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
class constants$157 {

    static final FunctionDescriptor vips_tiffsave_buffer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_tiffsave_buffer$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_tiffsave_buffer",
        constants$157.vips_tiffsave_buffer$FUNC
    );
    static final FunctionDescriptor vips_tiffsave_target$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_tiffsave_target$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_tiffsave_target",
        constants$157.vips_tiffsave_target$FUNC
    );
    static final FunctionDescriptor vips_openexrload$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_openexrload$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_openexrload",
        constants$157.vips_openexrload$FUNC
    );
    static final FunctionDescriptor vips_fitsload$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_fitsload$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_fitsload",
        constants$157.vips_fitsload$FUNC
    );
    static final FunctionDescriptor vips_fitssave$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_fitssave$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_fitssave",
        constants$157.vips_fitssave$FUNC
    );
    static final FunctionDescriptor vips_analyzeload$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_analyzeload$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_analyzeload",
        constants$157.vips_analyzeload$FUNC
    );
}


