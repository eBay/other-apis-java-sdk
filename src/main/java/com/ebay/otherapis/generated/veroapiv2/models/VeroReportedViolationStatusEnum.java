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

package com.ebay.otherapis.generated.veroapiv2.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The current status of the VeRO reported item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VeroReportedViolationStatusEnum implements ValuedEnum {
    NONE("NONE"),
    RECEIVED("RECEIVED"),
    SUBMITTED("SUBMITTED"),
    SUBMISSION_FAILED("SUBMISSION_FAILED"),
    REMOVED("REMOVED"),
    CLARIFICATION_REQUIRED("CLARIFICATION_REQUIRED");
    public final String value;
    VeroReportedViolationStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VeroReportedViolationStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NONE": return NONE;
            case "RECEIVED": return RECEIVED;
            case "SUBMITTED": return SUBMITTED;
            case "SUBMISSION_FAILED": return SUBMISSION_FAILED;
            case "REMOVED": return REMOVED;
            case "CLARIFICATION_REQUIRED": return CLARIFICATION_REQUIRED;
            default: return null;
        }
    }
}
