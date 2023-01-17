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
class constants$205 {

    static final FunctionDescriptor vips_bandand$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_bandand$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_bandand",
        constants$205.vips_bandand$FUNC
    );
    static final FunctionDescriptor vips_bandor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_bandor$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_bandor",
        constants$205.vips_bandor$FUNC
    );
    static final FunctionDescriptor vips_bandeor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_bandeor$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_bandeor",
        constants$205.vips_bandeor$FUNC
    );
    static final FunctionDescriptor vips_bandmean$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_bandmean$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_bandmean",
        constants$205.vips_bandmean$FUNC
    );
    static final FunctionDescriptor vips_recomb$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_recomb$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_recomb",
        constants$205.vips_recomb$FUNC
    );
    static final FunctionDescriptor vips_ifthenelse$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_ifthenelse$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_ifthenelse",
        constants$205.vips_ifthenelse$FUNC
    );
}


