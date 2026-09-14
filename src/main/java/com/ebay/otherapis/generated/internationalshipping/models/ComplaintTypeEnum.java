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
 * The type of complaint being filed.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ABNORMAL_COLLECTION_COMPLAINT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;LOST_PACKAGE_COMPLAINT&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ComplaintTypeEnum implements ValuedEnum {
    ABNORMAL_COLLECTION_COMPLAINT("ABNORMAL_COLLECTION_COMPLAINT"),
    LOST_PACKAGE_COMPLAINT("LOST_PACKAGE_COMPLAINT");
    public final String value;
    ComplaintTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ComplaintTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ABNORMAL_COLLECTION_COMPLAINT": return ABNORMAL_COLLECTION_COMPLAINT;
            case "LOST_PACKAGE_COMPLAINT": return LOST_PACKAGE_COMPLAINT;
            default: return null;
        }
    }
}
