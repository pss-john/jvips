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
class constants$94 {

    static final FunctionDescriptor vips__view_image$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vips__view_image$MH = RuntimeHelper.downcallHandle(
        "vips__view_image",
        constants$94.vips__view_image$FUNC
    );
    static final  OfInt _vips__argument_id$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle _vips__argument_id$VH = constants$94._vips__argument_id$LAYOUT.varHandle();
    static final MemorySegment _vips__argument_id$SEGMENT = RuntimeHelper.lookupGlobalVariable("_vips__argument_id", constants$94._vips__argument_id$LAYOUT);
    static final FunctionDescriptor vips__meta_init$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle vips__meta_init$MH = RuntimeHelper.downcallHandle(
        "vips__meta_init",
        constants$94.vips__meta_init$FUNC
    );
    static final FunctionDescriptor im_create_imask$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle im_create_imask$MH = RuntimeHelper.downcallHandle(
        "im_create_imask",
        constants$94.im_create_imask$FUNC
    );
    static final FunctionDescriptor im_create_imaskv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle im_create_imaskv$MH = RuntimeHelper.downcallHandleVariadic(
        "im_create_imaskv",
        constants$94.im_create_imaskv$FUNC
    );
    static final FunctionDescriptor im_create_dmask$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle im_create_dmask$MH = RuntimeHelper.downcallHandle(
        "im_create_dmask",
        constants$94.im_create_dmask$FUNC
    );
}

