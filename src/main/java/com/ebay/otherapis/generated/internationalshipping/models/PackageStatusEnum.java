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
    PREDECLARATION_FAILED("PREDECLARATION_FAILED"),
    PACKAGE_INFO_LACK("PACKAGE_INFO_LACK"),
    INCOMPLETE_PACKAGE_INFO("INCOMPLETE_PACKAGE_INFO"),
    NO_USEFUL_SHIPPING("NO_USEFUL_SHIPPING"),
    NO_AVAILABLE_SHIPPING("NO_AVAILABLE_SHIPPING"),
    SELECTED_SHIPPING("SELECTED_SHIPPING"),
    PENDING_SHIPPING_SELECTION("PENDING_SHIPPING_SELECTION"),
    APPLIED_TRACKING_CODE("APPLIED_TRACKING_CODE"),
    PENDING_TRACKING_NUMBER("PENDING_TRACKING_NUMBER"),
    TO_BE_SHIPPED("TO_BE_SHIPPED"),
    PENDING_CONFIRM("PENDING_CONFIRM"),
    TO_BE_RECEIVED("TO_BE_RECEIVED"),
    AWAITING_PICKUP("AWAITING_PICKUP"),
    DELIVERED("DELIVERED"),
    ON_SHIPPING("ON_SHIPPING"),
    IN_TRANSIT("IN_TRANSIT"),
    DELETED("DELETED"),
    SHIPPED_ERROR("SHIPPED_ERROR"),
    SHIPPING_EXCEPTION("SHIPPING_EXCEPTION"),
    DELIVERY_ERROR("DELIVERY_ERROR"),
    DELIVERY_FAILED("DELIVERY_FAILED"),
    RETURNED("RETURNED"),
    EXCEPTION("EXCEPTION"),
    FDCVALIDATIONFAILED("FDCVALIDATIONFAILED"),
    FDC_VALIDATION_FAILED("FDC_VALIDATION_FAILED"),
    FDCVALIDATIONINPROGRESS("FDCVALIDATIONINPROGRESS"),
    FDC_VALIDATION_IN_PROGRESS("FDC_VALIDATION_IN_PROGRESS"),
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
            case "PREDECLARATION_FAILED": return PREDECLARATION_FAILED;
            case "PACKAGE_INFO_LACK": return PACKAGE_INFO_LACK;
            case "INCOMPLETE_PACKAGE_INFO": return INCOMPLETE_PACKAGE_INFO;
            case "NO_USEFUL_SHIPPING": return NO_USEFUL_SHIPPING;
            case "NO_AVAILABLE_SHIPPING": return NO_AVAILABLE_SHIPPING;
            case "SELECTED_SHIPPING": return SELECTED_SHIPPING;
            case "PENDING_SHIPPING_SELECTION": return PENDING_SHIPPING_SELECTION;
            case "APPLIED_TRACKING_CODE": return APPLIED_TRACKING_CODE;
            case "PENDING_TRACKING_NUMBER": return PENDING_TRACKING_NUMBER;
            case "TO_BE_SHIPPED": return TO_BE_SHIPPED;
            case "PENDING_CONFIRM": return PENDING_CONFIRM;
            case "TO_BE_RECEIVED": return TO_BE_RECEIVED;
            case "AWAITING_PICKUP": return AWAITING_PICKUP;
            case "DELIVERED": return DELIVERED;
            case "ON_SHIPPING": return ON_SHIPPING;
            case "IN_TRANSIT": return IN_TRANSIT;
            case "DELETED": return DELETED;
            case "SHIPPED_ERROR": return SHIPPED_ERROR;
            case "SHIPPING_EXCEPTION": return SHIPPING_EXCEPTION;
            case "DELIVERY_ERROR": return DELIVERY_ERROR;
            case "DELIVERY_FAILED": return DELIVERY_FAILED;
            case "RETURNED": return RETURNED;
            case "EXCEPTION": return EXCEPTION;
            case "FDCVALIDATIONFAILED": return FDCVALIDATIONFAILED;
            case "FDC_VALIDATION_FAILED": return FDC_VALIDATION_FAILED;
            case "FDCVALIDATIONINPROGRESS": return FDCVALIDATIONINPROGRESS;
            case "FDC_VALIDATION_IN_PROGRESS": return FDC_VALIDATION_IN_PROGRESS;
            case "DELIVERY_EXCEPTION": return DELIVERY_EXCEPTION;
            default: return null;
        }
    }
}
