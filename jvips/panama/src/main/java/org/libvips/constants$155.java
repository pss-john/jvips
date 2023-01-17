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
class constants$155 {

    static final FunctionDescriptor vips_jpegsave_mime$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_jpegsave_mime$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_jpegsave_mime",
        constants$155.vips_jpegsave_mime$FUNC
    );
    static final FunctionDescriptor vips_webpload_source$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_webpload_source$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_webpload_source",
        constants$155.vips_webpload_source$FUNC
    );
    static final FunctionDescriptor vips_webpload$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_webpload$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_webpload",
        constants$155.vips_webpload$FUNC
    );
    static final FunctionDescriptor vips_webpload_buffer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_webpload_buffer$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_webpload_buffer",
        constants$155.vips_webpload_buffer$FUNC
    );
    static final FunctionDescriptor vips_webpsave_target$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_webpsave_target$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_webpsave_target",
        constants$155.vips_webpsave_target$FUNC
    );
    static final FunctionDescriptor vips_webpsave$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_webpsave$MH = RuntimeHelper.downcallHandleVariadic(
        "vips_webpsave",
        constants$155.vips_webpsave$FUNC
    );
}


