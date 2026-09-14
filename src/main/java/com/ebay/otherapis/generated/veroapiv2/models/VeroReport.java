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
 * This type defines the VeRO report resource / entity. It is returned when a report is created via &lt;b&gt;reportVeroViolation&lt;/b&gt; and when a report is retrieved via &lt;b&gt;getVeroReport&lt;/b&gt;. The &lt;b&gt;reportLineItems&lt;/b&gt; array is populated over the report&apos;s lifecycle and is only returned by &lt;b&gt;getVeroReport&lt;/b&gt; when &lt;b&gt;include_report_details&lt;/b&gt; is &lt;code&gt;true&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VeroReport implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array returns the status for each eBay item, live event, or video that was included as part of the report.&lt;br&gt;&lt;br&gt;This array is only returned if the &lt;b&gt;include_report_details&lt;/b&gt; query parameter is set to &lt;code&gt;true&lt;/code&gt;.
     */
    private java.util.List<ReportedViolation> reportLineItems;
    /**
     * The type of content being reported.
     */
    private ReportTypeEnum reportType;
    /**
     * The unique packet identifier of the VeRO report.
     */
    private String veroReportId;
    /**
     * The processing status of the requested VeRO report.
     */
    private VeroReportStatusEnum veroReportStatus;
    /**
     * Instantiates a new {@link VeroReport} and sets the default values.
     */
    public VeroReport() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VeroReport}
     */
    @jakarta.annotation.Nonnull
    public static VeroReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VeroReport();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("reportLineItems", (n) -> { this.setReportLineItems(n.getCollectionOfObjectValues(ReportedViolation::createFromDiscriminatorValue)); });
        deserializerMap.put("reportType", (n) -> { this.setReportType(n.getEnumValue(ReportTypeEnum::forValue)); });
        deserializerMap.put("veroReportId", (n) -> { this.setVeroReportId(n.getStringValue()); });
        deserializerMap.put("veroReportStatus", (n) -> { this.setVeroReportStatus(n.getEnumValue(VeroReportStatusEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the reportLineItems property value. This array returns the status for each eBay item, live event, or video that was included as part of the report.&lt;br&gt;&lt;br&gt;This array is only returned if the &lt;b&gt;include_report_details&lt;/b&gt; query parameter is set to &lt;code&gt;true&lt;/code&gt;.
     * @return a {@link java.util.List<ReportedViolation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ReportedViolation> getReportLineItems() {
        return this.reportLineItems;
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
     * Gets the veroReportId property value. The unique packet identifier of the VeRO report.
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
        writer.writeCollectionOfObjectValues("reportLineItems", this.getReportLineItems());
        writer.writeEnumValue("reportType", this.getReportType());
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
     * Sets the reportLineItems property value. This array returns the status for each eBay item, live event, or video that was included as part of the report.&lt;br&gt;&lt;br&gt;This array is only returned if the &lt;b&gt;include_report_details&lt;/b&gt; query parameter is set to &lt;code&gt;true&lt;/code&gt;.
     * @param value Value to set for the reportLineItems property.
     */
    public void setReportLineItems(@jakarta.annotation.Nullable final java.util.List<ReportedViolation> value) {
        this.reportLineItems = value;
    }
    /**
     * Sets the reportType property value. The type of content being reported.
     * @param value Value to set for the reportType property.
     */
    public void setReportType(@jakarta.annotation.Nullable final ReportTypeEnum value) {
        this.reportType = value;
    }
    /**
     * Sets the veroReportId property value. The unique packet identifier of the VeRO report.
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
