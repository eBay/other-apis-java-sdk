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

package com.ebay.otherapis.generated.translation.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Input the listing entity to be translated.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt; &lt;code&gt;ITEM_TITLE&lt;/code&gt; and &lt;code&gt;ITEM_DESCRIPTION&lt;/code&gt;&lt;/p&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TranslationContextEnum implements ValuedEnum {
    ITEM_TITLE("ITEM_TITLE"),
    ITEM_DESCRIPTION("ITEM_DESCRIPTION");
    public final String value;
    TranslationContextEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TranslationContextEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ITEM_TITLE": return ITEM_TITLE;
            case "ITEM_DESCRIPTION": return ITEM_DESCRIPTION;
            default: return null;
        }
    }
}
