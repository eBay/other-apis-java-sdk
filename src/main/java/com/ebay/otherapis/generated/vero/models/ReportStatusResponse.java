package com.ebay.otherapis.generated.vero.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the response fields of the &lt;b&gt;getVeroReport&lt;/b&gt; method. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportStatusResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array returns the status for each eBay item that was included as part of the report.&lt;br&gt;&lt;br&gt;This array is only returned if the &lt;b&gt;includeItemDetails&lt;/b&gt; query parameter is set to &lt;code&gt;true&lt;/code&gt;.
     */
    private java.util.List<ReportedItem> reportedItemDetails;
    /**
     * The unique packet identifier of the VeRO report.
     */
    private String veroReportId;
    /**
     * The processing status of the requested VeRO report. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/vero/types/VeroReportStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String veroReportStatus;
    /**
     * Instantiates a new {@link ReportStatusResponse} and sets the default values.
     */
    public ReportStatusResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReportStatusResponse}
     */
    @jakarta.annotation.Nonnull
    public static ReportStatusResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportStatusResponse();
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
        deserializerMap.put("reportedItemDetails", (n) -> { this.setReportedItemDetails(n.getCollectionOfObjectValues(ReportedItem::createFromDiscriminatorValue)); });
        deserializerMap.put("veroReportId", (n) -> { this.setVeroReportId(n.getStringValue()); });
        deserializerMap.put("veroReportStatus", (n) -> { this.setVeroReportStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the reportedItemDetails property value. This array returns the status for each eBay item that was included as part of the report.&lt;br&gt;&lt;br&gt;This array is only returned if the &lt;b&gt;includeItemDetails&lt;/b&gt; query parameter is set to &lt;code&gt;true&lt;/code&gt;.
     * @return a {@link java.util.List<ReportedItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ReportedItem> getReportedItemDetails() {
        return this.reportedItemDetails;
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
     * Gets the veroReportStatus property value. The processing status of the requested VeRO report. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/vero/types/VeroReportStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVeroReportStatus() {
        return this.veroReportStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("reportedItemDetails", this.getReportedItemDetails());
        writer.writeStringValue("veroReportId", this.getVeroReportId());
        writer.writeStringValue("veroReportStatus", this.getVeroReportStatus());
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
     * Sets the reportedItemDetails property value. This array returns the status for each eBay item that was included as part of the report.&lt;br&gt;&lt;br&gt;This array is only returned if the &lt;b&gt;includeItemDetails&lt;/b&gt; query parameter is set to &lt;code&gt;true&lt;/code&gt;.
     * @param value Value to set for the reportedItemDetails property.
     */
    public void setReportedItemDetails(@jakarta.annotation.Nullable final java.util.List<ReportedItem> value) {
        this.reportedItemDetails = value;
    }
    /**
     * Sets the veroReportId property value. The unique packet identifier of the VeRO report.
     * @param value Value to set for the veroReportId property.
     */
    public void setVeroReportId(@jakarta.annotation.Nullable final String value) {
        this.veroReportId = value;
    }
    /**
     * Sets the veroReportStatus property value. The processing status of the requested VeRO report. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/vero/types/VeroReportStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the veroReportStatus property.
     */
    public void setVeroReportStatus(@jakarta.annotation.Nullable final String value) {
        this.veroReportStatus = value;
    }
}
