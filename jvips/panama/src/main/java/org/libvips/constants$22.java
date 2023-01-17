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
class constants$22 {

    static final FunctionDescriptor g_signal_stop_emission$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_stop_emission$MH = RuntimeHelper.downcallHandle(
        "g_signal_stop_emission",
        constants$22.g_signal_stop_emission$FUNC
    );
    static final FunctionDescriptor g_signal_stop_emission_by_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_stop_emission_by_name$MH = RuntimeHelper.downcallHandle(
        "g_signal_stop_emission_by_name",
        constants$22.g_signal_stop_emission_by_name$FUNC
    );
    static final FunctionDescriptor g_signal_add_emission_hook$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_add_emission_hook$MH = RuntimeHelper.downcallHandle(
        "g_signal_add_emission_hook",
        constants$22.g_signal_add_emission_hook$FUNC
    );
    static final FunctionDescriptor g_signal_remove_emission_hook$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_signal_remove_emission_hook$MH = RuntimeHelper.downcallHandle(
        "g_signal_remove_emission_hook",
        constants$22.g_signal_remove_emission_hook$FUNC
    );
    static final FunctionDescriptor g_signal_has_handler_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_has_handler_pending$MH = RuntimeHelper.downcallHandle(
        "g_signal_has_handler_pending",
        constants$22.g_signal_has_handler_pending$FUNC
    );
    static final FunctionDescriptor g_signal_connect_closure_by_id$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_connect_closure_by_id$MH = RuntimeHelper.downcallHandle(
        "g_signal_connect_closure_by_id",
        constants$22.g_signal_connect_closure_by_id$FUNC
    );
}

