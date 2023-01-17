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

package com.pss.jvips.plugin.service.naming.constants;

import com.pss.jvips.plugin.context.Version;
import com.pss.jvips.plugin.service.VersionedDelegate;
import com.pss.jvips.plugin.util.History;
import com.squareup.javapoet.ClassName;

import java.util.SortedSet;

public class ConstantsClassHandlerDelegate extends VersionedDelegate<ConstantsClassHandler> {

    public ConstantsClassHandlerDelegate(History<Version> context, SortedSet<ConstantsClassHandler> services) {
        super(context, services);
    }

    public History<ClassName> getClassName(String filename) {
        var latest = getTarget().getClassName(filename);
        if (context.same()) {
            return new History<>(latest);
        } else {
            var previous = getPrevious().getClassName(filename);
            return new History<>(latest, previous);
        }
    }
}