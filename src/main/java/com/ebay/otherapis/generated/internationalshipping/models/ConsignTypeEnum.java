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
 * The address type of the consign address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FORWARD_DEPLOYMENT&lt;/code&gt;&lt;/ul&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConsignTypeEnum implements ValuedEnum {
    PICK_UP("PICK_UP"),
    DROP_OFF("DROP_OFF"),
    FORWARD_DEPLOYMENT("FORWARD_DEPLOYMENT"),
    RDC("RDC"),
    CN_POST_DROP_OFF("CN_POST_DROP_OFF"),
    CN_POST_PICK_UP("CN_POST_PICK_UP"),
    HK_POST_DROP_OFF("HK_POST_DROP_OFF");
    public final String value;
    ConsignTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConsignTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PICK_UP": return PICK_UP;
            case "DROP_OFF": return DROP_OFF;
            case "FORWARD_DEPLOYMENT": return FORWARD_DEPLOYMENT;
            case "RDC": return RDC;
            case "CN_POST_DROP_OFF": return CN_POST_DROP_OFF;
            case "CN_POST_PICK_UP": return CN_POST_PICK_UP;
            case "HK_POST_DROP_OFF": return HK_POST_DROP_OFF;
            default: return null;
        }
    }
}
