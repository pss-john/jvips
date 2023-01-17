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
class constants$93 {

    static final FunctionDescriptor vips__argument_table_lookup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips__argument_table_lookup$MH = RuntimeHelper.downcallHandle(
        "vips__argument_table_lookup",
        constants$93.vips__argument_table_lookup$FUNC
    );
    static final FunctionDescriptor vips__demand_hint_array$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips__demand_hint_array$MH = RuntimeHelper.downcallHandle(
        "vips__demand_hint_array",
        constants$93.vips__demand_hint_array$FUNC
    );
    static final FunctionDescriptor vips__image_copy_fields_array$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips__image_copy_fields_array$MH = RuntimeHelper.downcallHandle(
        "vips__image_copy_fields_array",
        constants$93.vips__image_copy_fields_array$FUNC
    );
    static final FunctionDescriptor vips__region_count_pixels$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips__region_count_pixels$MH = RuntimeHelper.downcallHandle(
        "vips__region_count_pixels",
        constants$93.vips__region_count_pixels$FUNC
    );
    static final FunctionDescriptor vips_region_dump_all$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle vips_region_dump_all$MH = RuntimeHelper.downcallHandle(
        "vips_region_dump_all",
        constants$93.vips_region_dump_all$FUNC
    );
    static final FunctionDescriptor vips_region_prepare_many$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_region_prepare_many$MH = RuntimeHelper.downcallHandle(
        "vips_region_prepare_many",
        constants$93.vips_region_prepare_many$FUNC
    );
}


