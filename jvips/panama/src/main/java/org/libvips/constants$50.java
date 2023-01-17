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
class constants$50 {

    static final FunctionDescriptor vips_map_equal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_map_equal$MH = RuntimeHelper.downcallHandle(
        "vips_map_equal",
        constants$50.vips_map_equal$FUNC
    );
    static final FunctionDescriptor vips_hash_table_map$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_hash_table_map$MH = RuntimeHelper.downcallHandle(
        "vips_hash_table_map",
        constants$50.vips_hash_table_map$FUNC
    );
    static final FunctionDescriptor vips_strncpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle vips_strncpy$MH = RuntimeHelper.downcallHandle(
        "vips_strncpy",
        constants$50.vips_strncpy$FUNC
    );
    static final FunctionDescriptor vips_strrstr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_strrstr$MH = RuntimeHelper.downcallHandle(
        "vips_strrstr",
        constants$50.vips_strrstr$FUNC
    );
    static final FunctionDescriptor vips_ispostfix$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_ispostfix$MH = RuntimeHelper.downcallHandle(
        "vips_ispostfix",
        constants$50.vips_ispostfix$FUNC
    );
    static final FunctionDescriptor vips_iscasepostfix$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_iscasepostfix$MH = RuntimeHelper.downcallHandle(
        "vips_iscasepostfix",
        constants$50.vips_iscasepostfix$FUNC
    );
}


