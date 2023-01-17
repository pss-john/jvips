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
class constants$222 {

    static final FunctionDescriptor vips_CMYK2XYZ$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_CMYK2XYZ$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_CMYK2XYZ",
        constants$222.vips_CMYK2XYZ$FUNC
    );
    static final FunctionDescriptor vips_XYZ2CMYK$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_XYZ2CMYK$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_XYZ2CMYK",
        constants$222.vips_XYZ2CMYK$FUNC
    );
    static final FunctionDescriptor vips_profile_load$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_profile_load$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_profile_load",
        constants$222.vips_profile_load$FUNC
    );
    static final FunctionDescriptor vips_icc_present$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle vips_icc_present$MH = RuntimeHelper.downcallHandle(
        "vips_icc_present",
        constants$222.vips_icc_present$FUNC
    );
    static final FunctionDescriptor vips_icc_transform$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_icc_transform$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_icc_transform",
        constants$222.vips_icc_transform$FUNC
    );
    static final FunctionDescriptor vips_icc_import$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_icc_import$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_icc_import",
        constants$222.vips_icc_import$FUNC
    );
}

