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
 * This type defines the response fields used in the &lt;b&gt;reportVeroViolation&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportVeroViolationResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the VeRO report that the item violations have been added to.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of the returned &lt;b&gt;veroReportId&lt;/b&gt;, as there is no programmatic way to retrieve this value at this time.&lt;/span&gt;
     */
    private String veroReportId;
    /**
     * The processing status of the requested VeRO report.
     */
    private VeroReportStatusEnum veroReportStatus;
    /**
     * Instantiates a new {@link ReportVeroViolationResponse} and sets the default values.
     */
    public ReportVeroViolationResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReportVeroViolationResponse}
     */
    @jakarta.annotation.Nonnull
    public static ReportVeroViolationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportVeroViolationResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("veroReportId", (n) -> { this.setVeroReportId(n.getStringValue()); });
        deserializerMap.put("veroReportStatus", (n) -> { this.setVeroReportStatus(n.getEnumValue(VeroReportStatusEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the veroReportId property value. The unique identifier of the VeRO report that the item violations have been added to.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of the returned &lt;b&gt;veroReportId&lt;/b&gt;, as there is no programmatic way to retrieve this value at this time.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVeroReportId() {
        return this.veroReportId;
    }
    /**
     * Gets the veroReportStatus property value. The processing status of the requested VeRO report.
     * @return a {@link VeroReportStatusEnum}
     */
    @jakarta.annotation.Nullable
    public VeroReportStatusEnum getVeroReportStatus() {
        return this.veroReportStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("veroReportId", this.getVeroReportId());
        writer.writeEnumValue("veroReportStatus", this.getVeroReportStatus());
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
     * Sets the veroReportId property value. The unique identifier of the VeRO report that the item violations have been added to.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of the returned &lt;b&gt;veroReportId&lt;/b&gt;, as there is no programmatic way to retrieve this value at this time.&lt;/span&gt;
     * @param value Value to set for the veroReportId property.
     */
    public void setVeroReportId(@jakarta.annotation.Nullable final String value) {
        this.veroReportId = value;
    }
    /**
     * Sets the veroReportStatus property value. The processing status of the requested VeRO report.
     * @param value Value to set for the veroReportStatus property.
     */
    public void setVeroReportStatus(@jakarta.annotation.Nullable final VeroReportStatusEnum value) {
        this.veroReportStatus = value;
    }
}
