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
 * The incoterm information associated with the the shipping service.&lt;br&gt;&lt;br&gt;&lt;b&gt;Supported values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;DDP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DDU&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IncotermEnum implements ValuedEnum {
    DDP("DDP"),
    DDU("DDU");
    public final String value;
    IncotermEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IncotermEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DDP": return DDP;
            case "DDU": return DDU;
            default: return null;
        }
    }
}
