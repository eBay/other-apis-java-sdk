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
 * This type defines the request fields used in the &lt;b&gt;reportVeroViolation&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportVeroViolationRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The reporter&apos;s public email through which they wish to be contacted.
     */
    private String contactEmail;
    /**
     * The unique identifier associated with the reporter&apos;s VeRO account.&lt;br&gt;&lt;br&gt;This value is the username assigned to the rights owner or authorized representative submitting the report. This identifier is used to authenticate the submission and associate it with the correct VeRO account.
     */
    private String reporterId;
    /**
     * The type of content being reported.
     */
    private ReportTypeEnum reportType;
    /**
     * This array can be used to report one or more eBay items, live events, or shoppable videos that are allegedly violating the product owner&apos;s copyright, trademark, or intellectual property rights.
     */
    private java.util.List<ReportViolationDetails> reportViolations;
    /**
     * The unique identifier assigned to a Rights Owner within the VeRO Portal.&lt;br&gt;&lt;br&gt; This ID identifies the Rights Owner whose intellectual property rights are the subject of the report. Reporters submitting on behalf of a Rights Owner, including authorized representatives and third-party agents, must provide the correct Rights Owner ID. The Rights Owner ID can be found in the VeRO Portal.
     */
    private String rightsOwnerId;
    /**
     * Instantiates a new {@link ReportVeroViolationRequest} and sets the default values.
     */
    public ReportVeroViolationRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReportVeroViolationRequest}
     */
    @jakarta.annotation.Nonnull
    public static ReportVeroViolationRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportVeroViolationRequest();
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
     * Gets the contactEmail property value. The reporter&apos;s public email through which they wish to be contacted.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContactEmail() {
        return this.contactEmail;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("contactEmail", (n) -> { this.setContactEmail(n.getStringValue()); });
        deserializerMap.put("reporterId", (n) -> { this.setReporterId(n.getStringValue()); });
        deserializerMap.put("reportType", (n) -> { this.setReportType(n.getEnumValue(ReportTypeEnum::forValue)); });
        deserializerMap.put("reportViolations", (n) -> { this.setReportViolations(n.getCollectionOfObjectValues(ReportViolationDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("rightsOwnerId", (n) -> { this.setRightsOwnerId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the reporterId property value. The unique identifier associated with the reporter&apos;s VeRO account.&lt;br&gt;&lt;br&gt;This value is the username assigned to the rights owner or authorized representative submitting the report. This identifier is used to authenticate the submission and associate it with the correct VeRO account.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReporterId() {
        return this.reporterId;
    }
    /**
     * Gets the reportType property value. The type of content being reported.
     * @return a {@link ReportTypeEnum}
     */
    @jakarta.annotation.Nullable
    public ReportTypeEnum getReportType() {
        return this.reportType;
    }
    /**
     * Gets the reportViolations property value. This array can be used to report one or more eBay items, live events, or shoppable videos that are allegedly violating the product owner&apos;s copyright, trademark, or intellectual property rights.
     * @return a {@link java.util.List<ReportViolationDetails>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ReportViolationDetails> getReportViolations() {
        return this.reportViolations;
    }
    /**
     * Gets the rightsOwnerId property value. The unique identifier assigned to a Rights Owner within the VeRO Portal.&lt;br&gt;&lt;br&gt; This ID identifies the Rights Owner whose intellectual property rights are the subject of the report. Reporters submitting on behalf of a Rights Owner, including authorized representatives and third-party agents, must provide the correct Rights Owner ID. The Rights Owner ID can be found in the VeRO Portal.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRightsOwnerId() {
        return this.rightsOwnerId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("contactEmail", this.getContactEmail());
        writer.writeStringValue("reporterId", this.getReporterId());
        writer.writeEnumValue("reportType", this.getReportType());
        writer.writeCollectionOfObjectValues("reportViolations", this.getReportViolations());
        writer.writeStringValue("rightsOwnerId", this.getRightsOwnerId());
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
     * Sets the contactEmail property value. The reporter&apos;s public email through which they wish to be contacted.
     * @param value Value to set for the contactEmail property.
     */
    public void setContactEmail(@jakarta.annotation.Nullable final String value) {
        this.contactEmail = value;
    }
    /**
     * Sets the reporterId property value. The unique identifier associated with the reporter&apos;s VeRO account.&lt;br&gt;&lt;br&gt;This value is the username assigned to the rights owner or authorized representative submitting the report. This identifier is used to authenticate the submission and associate it with the correct VeRO account.
     * @param value Value to set for the reporterId property.
     */
    public void setReporterId(@jakarta.annotation.Nullable final String value) {
        this.reporterId = value;
    }
    /**
     * Sets the reportType property value. The type of content being reported.
     * @param value Value to set for the reportType property.
     */
    public void setReportType(@jakarta.annotation.Nullable final ReportTypeEnum value) {
        this.reportType = value;
    }
    /**
     * Sets the reportViolations property value. This array can be used to report one or more eBay items, live events, or shoppable videos that are allegedly violating the product owner&apos;s copyright, trademark, or intellectual property rights.
     * @param value Value to set for the reportViolations property.
     */
    public void setReportViolations(@jakarta.annotation.Nullable final java.util.List<ReportViolationDetails> value) {
        this.reportViolations = value;
    }
    /**
     * Sets the rightsOwnerId property value. The unique identifier assigned to a Rights Owner within the VeRO Portal.&lt;br&gt;&lt;br&gt; This ID identifies the Rights Owner whose intellectual property rights are the subject of the report. Reporters submitting on behalf of a Rights Owner, including authorized representatives and third-party agents, must provide the correct Rights Owner ID. The Rights Owner ID can be found in the VeRO Portal.
     * @param value Value to set for the rightsOwnerId property.
     */
    public void setRightsOwnerId(@jakarta.annotation.Nullable final String value) {
        this.rightsOwnerId = value;
    }
}
