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
public interface GObjectSetPropertyFunc {

    void apply(java.lang.foreign.MemoryAddress object, int property_id, java.lang.foreign.MemoryAddress value, java.lang.foreign.MemoryAddress pspec);
    static MemorySegment allocate(GObjectSetPropertyFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GObjectSetPropertyFunc.class, fi, constants$26.GObjectSetPropertyFunc$FUNC, session);
    }
    static GObjectSetPropertyFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _object, int _property_id, java.lang.foreign.MemoryAddress _value, java.lang.foreign.MemoryAddress _pspec) -> {
            try {
                constants$26.GObjectSetPropertyFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_object, _property_id, (java.lang.foreign.Addressable)_value, (java.lang.foreign.Addressable)_pspec);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


