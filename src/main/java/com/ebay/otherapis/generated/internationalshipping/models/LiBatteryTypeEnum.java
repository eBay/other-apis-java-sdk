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

package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of the battery.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LiBatteryTypeEnum implements ValuedEnum {
    NO_BATTERY("NO_BATTERY"),
    LITHIUM_ION_BATTERY_PACKED_WITH_EQUIPMENT("LITHIUM_ION_BATTERY_PACKED_WITH_EQUIPMENT"),
    LITHIUM_ION_BATTERY_CONTAINED_IN_EQUIPMENT("LITHIUM_ION_BATTERY_CONTAINED_IN_EQUIPMENT"),
    LITHIUM_METAL_BATTERY_PACKED_WITH_EQUIPMENT("LITHIUM_METAL_BATTERY_PACKED_WITH_EQUIPMENT"),
    LITHIUM_METAL_BATTERY_CONTAINED_IN_EQUIPMENT("LITHIUM_METAL_BATTERY_CONTAINED_IN_EQUIPMENT"),
    DRY_PACKED_WITH_EQUIPMENT("DRY_PACKED_WITH_EQUIPMENT"),
    SPECIAL_GOODS_WITH_NO_BATTERY("SPECIAL_GOODS_WITH_NO_BATTERY");
    public final String value;
    LiBatteryTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LiBatteryTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NO_BATTERY": return NO_BATTERY;
            case "LITHIUM_ION_BATTERY_PACKED_WITH_EQUIPMENT": return LITHIUM_ION_BATTERY_PACKED_WITH_EQUIPMENT;
            case "LITHIUM_ION_BATTERY_CONTAINED_IN_EQUIPMENT": return LITHIUM_ION_BATTERY_CONTAINED_IN_EQUIPMENT;
            case "LITHIUM_METAL_BATTERY_PACKED_WITH_EQUIPMENT": return LITHIUM_METAL_BATTERY_PACKED_WITH_EQUIPMENT;
            case "LITHIUM_METAL_BATTERY_CONTAINED_IN_EQUIPMENT": return LITHIUM_METAL_BATTERY_CONTAINED_IN_EQUIPMENT;
            case "DRY_PACKED_WITH_EQUIPMENT": return DRY_PACKED_WITH_EQUIPMENT;
            case "SPECIAL_GOODS_WITH_NO_BATTERY": return SPECIAL_GOODS_WITH_NO_BATTERY;
            default: return null;
        }
    }
}
