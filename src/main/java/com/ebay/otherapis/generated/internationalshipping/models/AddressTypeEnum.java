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
 * The address type of the address.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AddressTypeEnum implements ValuedEnum {
    SHIP_FROM_ADDRESS("SHIP_FROM_ADDRESS"),
    RETURN_ADDRESS("RETURN_ADDRESS");
    public final String value;
    AddressTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AddressTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SHIP_FROM_ADDRESS": return SHIP_FROM_ADDRESS;
            case "RETURN_ADDRESS": return RETURN_ADDRESS;
            default: return null;
        }
    }
}
