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

package com.pss.jvips.plugin.service.executables.arguments;

import com.pss.jvips.plugin.service.executables.arguments.types.ArgumentMacro;
import com.pss.jvips.plugin.service.executables.arguments.types.BaseArgument;
import org.immutables.value.Value;

/**
 * Contains the VipsOperation description from the Macros, why do we need this info? THe VipsOperation takes boxed
 * arguments where as the a lot of the native C code takes regular types (ie: `void *buf` or `char *buf` and a length
 * param) and it will construct the necessary boxed args like `VipsArrayDouble`
 */
@Value.Immutable
public interface MacroArgumentDTO extends BaseArgument, ArgumentMacro {

}
