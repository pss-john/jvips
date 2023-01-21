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

package com.pss.jvips.plugin.service.executables;

import com.pss.jvips.plugin.model.xml.executable.AbstractExecutable;
import com.pss.jvips.plugin.model.xml.executable.Parameter;
import com.pss.jvips.plugin.service.VersionedService;
import com.pss.jvips.plugin.service.executables.arguments.ArgumentDTO;
import com.pss.jvips.plugin.util.Utils;
import org.apache.commons.collections4.MapUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExecutableModelBuilderImpl implements VersionedService {

    // Parameter names that are out params that refer to size
    public static final List<String> POSSIBLE_LENGTH_OR_SIZE = List.of("n", "length", "sizeof_type", "len", "size");


    public CombinedExecutableDTO build(AbstractExecutable executable, IntermediateExecutableDTO firstDto){
        List<ArgumentDTO> arrayParams = new ArrayList<>();
        List<ArgumentDTO> parameters = new ArrayList<>();

        ImmutableCombinedExecutableDTO.Builder combined = ImmutableCombinedExecutableDTO.builder();
        ImmutableExecutableDTO.Builder jni = ImmutableExecutableDTO.builder();
        ImmutableExecutableDTO.Builder panama = ImmutableExecutableDTO.builder();

        Map<String, Parameter> nativeCallParams = Utils.toLinkedHashMap(executable.getParameters(), Parameter::getName);
        Map<String, ArgumentDTO> allRequired = Utils.toLinkedHashMap(firstDto.getAllRequired(), ArgumentDTO::getName);

        return null;
    }

}
