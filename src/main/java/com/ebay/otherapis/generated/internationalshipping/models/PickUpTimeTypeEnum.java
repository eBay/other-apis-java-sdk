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
 * The supported pickup window that the pickup location supports.&lt;br&gt;&lt;br&gt;This field is only returned if the consign address is a pickup-from location
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PickUpTimeTypeEnum implements ValuedEnum {
    TIME_14_16("TIME_14_16"),
    TIME_16_18("TIME_16_18");
    public final String value;
    PickUpTimeTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PickUpTimeTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "TIME_14_16": return TIME_14_16;
            case "TIME_16_18": return TIME_16_18;
            default: return null;
        }
    }
}
