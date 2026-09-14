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
 * The current status of the package.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PackageStatusEnum implements ValuedEnum {
    DECLARED_FAILED("DECLARED_FAILED"),
    PACKAGE_INFO_LACK("PACKAGE_INFO_LACK"),
    NO_USEFUL_SHIPPING("NO_USEFUL_SHIPPING"),
    SELECTED_SHIPPING("SELECTED_SHIPPING"),
    APPLIED_TRACKING_CODE("APPLIED_TRACKING_CODE"),
    TO_BE_SHIPPED("TO_BE_SHIPPED"),
    TO_BE_RECEIVED("TO_BE_RECEIVED"),
    DELIVERED("DELIVERED"),
    ON_SHIPPING("ON_SHIPPING"),
    DELETED("DELETED"),
    SHIPPED_ERROR("SHIPPED_ERROR"),
    DELIVERY_ERROR("DELIVERY_ERROR"),
    RETURNED("RETURNED"),
    EXCEPTION("EXCEPTION"),
    FDCVALIDATIONFAILED("FDCVALIDATIONFAILED"),
    FDCVALIDATIONINPROGRESS("FDCVALIDATIONINPROGRESS"),
    DELIVERY_EXCEPTION("DELIVERY_EXCEPTION");
    public final String value;
    PackageStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PackageStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DECLARED_FAILED": return DECLARED_FAILED;
            case "PACKAGE_INFO_LACK": return PACKAGE_INFO_LACK;
            case "NO_USEFUL_SHIPPING": return NO_USEFUL_SHIPPING;
            case "SELECTED_SHIPPING": return SELECTED_SHIPPING;
            case "APPLIED_TRACKING_CODE": return APPLIED_TRACKING_CODE;
            case "TO_BE_SHIPPED": return TO_BE_SHIPPED;
            case "TO_BE_RECEIVED": return TO_BE_RECEIVED;
            case "DELIVERED": return DELIVERED;
            case "ON_SHIPPING": return ON_SHIPPING;
            case "DELETED": return DELETED;
            case "SHIPPED_ERROR": return SHIPPED_ERROR;
            case "DELIVERY_ERROR": return DELIVERY_ERROR;
            case "RETURNED": return RETURNED;
            case "EXCEPTION": return EXCEPTION;
            case "FDCVALIDATIONFAILED": return FDCVALIDATIONFAILED;
            case "FDCVALIDATIONINPROGRESS": return FDCVALIDATIONINPROGRESS;
            case "DELIVERY_EXCEPTION": return DELIVERY_EXCEPTION;
            default: return null;
        }
    }
}
