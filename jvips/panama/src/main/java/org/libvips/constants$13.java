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
class constants$13 {

    static final FunctionDescriptor g_type_class_adjust_private_offset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_class_adjust_private_offset$MH = RuntimeHelper.downcallHandle(
        "g_type_class_adjust_private_offset",
        constants$13.g_type_class_adjust_private_offset$FUNC
    );
    static final FunctionDescriptor g_type_add_class_private$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_add_class_private$MH = RuntimeHelper.downcallHandle(
        "g_type_add_class_private",
        constants$13.g_type_add_class_private$FUNC
    );
    static final FunctionDescriptor g_type_class_get_private$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_class_get_private$MH = RuntimeHelper.downcallHandle(
        "g_type_class_get_private",
        constants$13.g_type_class_get_private$FUNC
    );
    static final FunctionDescriptor g_type_class_get_instance_private_offset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_class_get_instance_private_offset$MH = RuntimeHelper.downcallHandle(
        "g_type_class_get_instance_private_offset",
        constants$13.g_type_class_get_instance_private_offset$FUNC
    );
    static final FunctionDescriptor g_type_ensure$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_ensure$MH = RuntimeHelper.downcallHandle(
        "g_type_ensure",
        constants$13.g_type_ensure$FUNC
    );
    static final FunctionDescriptor g_type_get_type_registration_serial$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_type_get_type_registration_serial$MH = RuntimeHelper.downcallHandle(
        "g_type_get_type_registration_serial",
        constants$13.g_type_get_type_registration_serial$FUNC
    );
}


