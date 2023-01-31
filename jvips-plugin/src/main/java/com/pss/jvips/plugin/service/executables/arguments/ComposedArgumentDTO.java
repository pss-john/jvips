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

import com.pss.jvips.plugin.model.xml.types.Direction;
import com.pss.jvips.plugin.naming.JavaCaseFormat;
import com.squareup.javapoet.TypeName;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Contains native arguments attached to length parameter
 *
 * .Example
 * [source,C]
 * ----
 * int vips_some_operation(double *a, double *b, int length, ...){
 * ----
 *
 * .Will result in this kind of structure
 * [source]
 * ----
 * ComposedArgumentDTO(name: 'length', composed: [IntrospectedArgumentDTO(name: a), IntrospectedArgumentDTO(name: b)])
 * ----
 */
@Value.Immutable
public interface ComposedArgumentDTO extends IntrospectedArgumentDTO {

    IntrospectedArgumentDTO getArgumentDTO();

    List<IntrospectedArgumentDTO> getComposed();

    default TypeName getType() {
        return getArgumentDTO().getType();
    }

    default JavaCaseFormat getName() {
        return getArgumentDTO().getName();
    }

    @Nullable
    default String getDocumentation() {
        return getArgumentDTO().getDocumentation();
    }

//    default String getName() {
//        return getArgumentDTO().getName();
//    }

    default boolean isImage() {
        return getArgumentDTO().isImage();
    }

    default boolean isDeprecated() {
        return getArgumentDTO().isDeprecated();
    }

    default boolean isRequired() {
        return getArgumentDTO().isRequired();
    }

    default Direction getDirection() {
        return getArgumentDTO().getDirection();
    }



    default int getArgumentCount(){
        return 1 + getComposed().size();
    }
}
