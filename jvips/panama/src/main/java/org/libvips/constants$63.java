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
class constants$63 {

    static final FunctionDescriptor vips_object_print_summary$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_object_print_summary$MH = RuntimeHelper.downcallHandle(
        "vips_object_print_summary",
        constants$63.vips_object_print_summary$FUNC
    );
    static final FunctionDescriptor vips_object_print_dump$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_object_print_dump$MH = RuntimeHelper.downcallHandle(
        "vips_object_print_dump",
        constants$63.vips_object_print_dump$FUNC
    );
    static final FunctionDescriptor vips_object_print_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_object_print_name$MH = RuntimeHelper.downcallHandle(
        "vips_object_print_name",
        constants$63.vips_object_print_name$FUNC
    );
    static final FunctionDescriptor vips_object_sanity$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips_object_sanity$MH = RuntimeHelper.downcallHandle(
        "vips_object_sanity",
        constants$63.vips_object_sanity$FUNC
    );
    static final FunctionDescriptor vips_object_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle vips_object_get_type$MH = RuntimeHelper.downcallHandle(
        "vips_object_get_type",
        constants$63.vips_object_get_type$FUNC
    );
    static final FunctionDescriptor vips_object_class_install_argument$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle vips_object_class_install_argument$MH = RuntimeHelper.downcallHandle(
        "vips_object_class_install_argument",
        constants$63.vips_object_class_install_argument$FUNC
    );
}


