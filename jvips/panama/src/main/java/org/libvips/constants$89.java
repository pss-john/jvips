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
class constants$89 {

    static final FunctionDescriptor vips_rect_intersectrect$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_rect_intersectrect$MH = RuntimeHelper.downcallHandle(
        "vips_rect_intersectrect",
        constants$89.vips_rect_intersectrect$FUNC
    );
    static final FunctionDescriptor vips_rect_unionrect$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_rect_unionrect$MH = RuntimeHelper.downcallHandle(
        "vips_rect_unionrect",
        constants$89.vips_rect_unionrect$FUNC
    );
    static final FunctionDescriptor vips_rect_dup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_rect_dup$MH = RuntimeHelper.downcallHandle(
        "vips_rect_dup",
        constants$89.vips_rect_dup$FUNC
    );
    static final FunctionDescriptor vips_rect_normalise$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_rect_normalise$MH = RuntimeHelper.downcallHandle(
        "vips_rect_normalise",
        constants$89.vips_rect_normalise$FUNC
    );
    static final FunctionDescriptor vips_window_unref$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_window_unref$MH = RuntimeHelper.downcallHandle(
        "vips_window_unref",
        constants$89.vips_window_unref$FUNC
    );
    static final FunctionDescriptor vips_window_print$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_window_print$MH = RuntimeHelper.downcallHandle(
        "vips_window_print",
        constants$89.vips_window_print$FUNC
    );
}


