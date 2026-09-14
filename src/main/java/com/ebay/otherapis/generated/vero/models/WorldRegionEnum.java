// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.otherapis.generated.vero.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This enumerated type contains of list of world regions. | - **AFRICA**: This enumeration value indicates the world region is Africa. - **AMERICAS**: This enumeration value indicates the world region is the Americas. - **ASIA**: This enumeration value indicates the world region is Asia. - **CARIBBEAN**: This enumeration value indicates the world region is the Caribbean. - **EUROPE**: This enumeration value indicates the world region is Europe. - **EUROPE_UNION**: This enumeration value indicates the world region is the European Union. - **LATIN_AMERICA**: This enumeration value indicates the world region is Latin America. - **MIDDLE_EAST**: This enumeration value indicates the world region is the Middle East. - **NORTH_AMERICA**: This enumeration value indicates the world region is North America. - **OCEANIA**: This enumeration value indicates the world region is Oceania. - **SOUTH_AMERICA**: This enumeration value indicates the world region is South America. - **WORLDWIDE**: This enumeration value indicates the world region is world wide.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WorldRegionEnum implements ValuedEnum {
    AFRICA("AFRICA"),
    AMERICAS("AMERICAS"),
    ASIA("ASIA"),
    CARIBBEAN("CARIBBEAN"),
    EUROPE("EUROPE"),
    EUROPE_UNION("EUROPE_UNION"),
    LATIN_AMERICA("LATIN_AMERICA"),
    MIDDLE_EAST("MIDDLE_EAST"),
    NORTH_AMERICA("NORTH_AMERICA"),
    OCEANIA("OCEANIA"),
    SOUTH_AMERICA("SOUTH_AMERICA"),
    WORLDWIDE("WORLDWIDE");
    public final String value;
    WorldRegionEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WorldRegionEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "AFRICA": return AFRICA;
            case "AMERICAS": return AMERICAS;
            case "ASIA": return ASIA;
            case "CARIBBEAN": return CARIBBEAN;
            case "EUROPE": return EUROPE;
            case "EUROPE_UNION": return EUROPE_UNION;
            case "LATIN_AMERICA": return LATIN_AMERICA;
            case "MIDDLE_EAST": return MIDDLE_EAST;
            case "NORTH_AMERICA": return NORTH_AMERICA;
            case "OCEANIA": return OCEANIA;
            case "SOUTH_AMERICA": return SOUTH_AMERICA;
            case "WORLDWIDE": return WORLDWIDE;
            default: return null;
        }
    }
}
