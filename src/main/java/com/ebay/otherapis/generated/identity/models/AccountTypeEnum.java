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

package com.ebay.otherapis.generated.identity.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the user account type. This is determined when the user registers with eBay. If they register for a business account, this value will be &lt;code&gt;BUSINESS&lt;/code&gt;. If they register for a private account, this value will be &lt;code&gt;INDIVIDUAL&lt;/code&gt;. This designation is required by the tax laws in the following countries:   &lt;ul&gt;&lt;li&gt;EBAY_AT&lt;/li&gt;&lt;li&gt;EBAY_BE&lt;/li&gt;&lt;li&gt;EBAY_CH&lt;/li&gt;&lt;li&gt;EBAY_DE&lt;/li&gt;&lt;li&gt;EBAY_ES&lt;/li&gt;&lt;li&gt;EBAY_FR&lt;/li&gt;&lt;li&gt;EBAY_GB&lt;/li&gt;&lt;li&gt;EBAY_IE&lt;/li&gt;&lt;li&gt;EBAY_IT&lt;/li&gt;&lt;li&gt;EBAY_PL&lt;/li&gt;&lt;/ul&gt; &lt;br /&gt;&lt;b&gt; Valid Values:&lt;/b&gt; &lt;code&gt;BUSINESS&lt;/code&gt; or &lt;code&gt;INDIVIDUAL&lt;/code&gt; &lt;br /&gt;&lt;br /&gt;Code so that your app gracefully handles any future changes to this list.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccountTypeEnum implements ValuedEnum {
    INDIVIDUAL("INDIVIDUAL"),
    BUSINESS("BUSINESS");
    public final String value;
    AccountTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccountTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "INDIVIDUAL": return INDIVIDUAL;
            case "BUSINESS": return BUSINESS;
            default: return null;
        }
    }
}
