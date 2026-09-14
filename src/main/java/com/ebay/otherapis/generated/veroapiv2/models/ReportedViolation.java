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

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the reported content, identifiers, and status of a VeRO report. If applicable, a reason for report failure is also returned.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportedViolation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the listing, live event, or video that is being reported for copyright, trademark, or intellectual right infringement.
     */
    private String id;
    /**
     * This text explanation is submitted by eBay when the submission of a VeRO Report has failed or was blocked.&lt;br&gt;&lt;br&gt;This field is conditionally returned if the &lt;b&gt;status&lt;/b&gt; value of the report is &lt;code&gt;CLARIFICATION_REQUIRED&lt;/code&gt; or &lt;code&gt;SUBMISSION_FAILED&lt;/code&gt;.
     */
    private String reasonForFailure;
    /**
     * The current status of the VeRO reported item.
     */
    private VeroReportedViolationStatusEnum status;
    /**
     * Instantiates a new {@link ReportedViolation} and sets the default values.
     */
    public ReportedViolation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReportedViolation}
     */
    @jakarta.annotation.Nonnull
    public static ReportedViolation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportedViolation();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("reasonForFailure", (n) -> { this.setReasonForFailure(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(VeroReportedViolationStatusEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique identifier of the listing, live event, or video that is being reported for copyright, trademark, or intellectual right infringement.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the reasonForFailure property value. This text explanation is submitted by eBay when the submission of a VeRO Report has failed or was blocked.&lt;br&gt;&lt;br&gt;This field is conditionally returned if the &lt;b&gt;status&lt;/b&gt; value of the report is &lt;code&gt;CLARIFICATION_REQUIRED&lt;/code&gt; or &lt;code&gt;SUBMISSION_FAILED&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReasonForFailure() {
        return this.reasonForFailure;
    }
    /**
     * Gets the status property value. The current status of the VeRO reported item.
     * @return a {@link VeroReportedViolationStatusEnum}
     */
    @jakarta.annotation.Nullable
    public VeroReportedViolationStatusEnum getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("reasonForFailure", this.getReasonForFailure());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the id property value. The unique identifier of the listing, live event, or video that is being reported for copyright, trademark, or intellectual right infringement.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the reasonForFailure property value. This text explanation is submitted by eBay when the submission of a VeRO Report has failed or was blocked.&lt;br&gt;&lt;br&gt;This field is conditionally returned if the &lt;b&gt;status&lt;/b&gt; value of the report is &lt;code&gt;CLARIFICATION_REQUIRED&lt;/code&gt; or &lt;code&gt;SUBMISSION_FAILED&lt;/code&gt;.
     * @param value Value to set for the reasonForFailure property.
     */
    public void setReasonForFailure(@jakarta.annotation.Nullable final String value) {
        this.reasonForFailure = value;
    }
    /**
     * Sets the status property value. The current status of the VeRO reported item.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final VeroReportedViolationStatusEnum value) {
        this.status = value;
    }
}
