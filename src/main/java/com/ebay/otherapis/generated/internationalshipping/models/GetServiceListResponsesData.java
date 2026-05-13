package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the details returned for the retrieved shipping service(s).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetServiceListResponsesData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The URL to the current page of the result set.
     */
    private String href;
    /**
     * The value of the &lt;b&gt;limit&lt;/b&gt; parameter submitted in the request.
     */
    private Integer limit;
    /**
     * The URI for the next page of results. This value is returned if there is an additional page of results to return from the result set.
     */
    private String next;
    /**
     * The value of the &lt;b&gt;offset&lt;/b&gt; parameter submitted in the request.
     */
    private Integer offset;
    /**
     * The URI for the previous page of results. This is returned if there is a previous page of results from the result set.
     */
    private String prev;
    /**
     * This array returns a list of available shipping services, as well as the descriptions, directions, and identifiers of each service.
     */
    private java.util.List<ServiceInfoResponses> services;
    /**
     * The total number of shipping services being displayed on the current results page.
     */
    private Integer total;
    /**
     * Instantiates a new {@link GetServiceListResponsesData} and sets the default values.
     */
    public GetServiceListResponsesData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetServiceListResponsesData}
     */
    @jakarta.annotation.Nonnull
    public static GetServiceListResponsesData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetServiceListResponsesData();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("href", (n) -> { this.setHref(n.getStringValue()); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("next", (n) -> { this.setNext(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("prev", (n) -> { this.setPrev(n.getStringValue()); });
        deserializerMap.put("services", (n) -> { this.setServices(n.getCollectionOfObjectValues(ServiceInfoResponses::createFromDiscriminatorValue)); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. The URL to the current page of the result set.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Gets the limit property value. The value of the &lt;b&gt;limit&lt;/b&gt; parameter submitted in the request.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the next property value. The URI for the next page of results. This value is returned if there is an additional page of results to return from the result set.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNext() {
        return this.next;
    }
    /**
     * Gets the offset property value. The value of the &lt;b&gt;offset&lt;/b&gt; parameter submitted in the request.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the prev property value. The URI for the previous page of results. This is returned if there is a previous page of results from the result set.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrev() {
        return this.prev;
    }
    /**
     * Gets the services property value. This array returns a list of available shipping services, as well as the descriptions, directions, and identifiers of each service.
     * @return a {@link java.util.List<ServiceInfoResponses>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceInfoResponses> getServices() {
        return this.services;
    }
    /**
     * Gets the total property value. The total number of shipping services being displayed on the current results page.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("href", this.getHref());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("next", this.getNext());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeStringValue("prev", this.getPrev());
        writer.writeCollectionOfObjectValues("services", this.getServices());
        writer.writeIntegerValue("total", this.getTotal());
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
     * Sets the href property value. The URL to the current page of the result set.
     * @param value Value to set for the href property.
     */
    public void setHref(@jakarta.annotation.Nullable final String value) {
        this.href = value;
    }
    /**
     * Sets the limit property value. The value of the &lt;b&gt;limit&lt;/b&gt; parameter submitted in the request.
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the next property value. The URI for the next page of results. This value is returned if there is an additional page of results to return from the result set.
     * @param value Value to set for the next property.
     */
    public void setNext(@jakarta.annotation.Nullable final String value) {
        this.next = value;
    }
    /**
     * Sets the offset property value. The value of the &lt;b&gt;offset&lt;/b&gt; parameter submitted in the request.
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the prev property value. The URI for the previous page of results. This is returned if there is a previous page of results from the result set.
     * @param value Value to set for the prev property.
     */
    public void setPrev(@jakarta.annotation.Nullable final String value) {
        this.prev = value;
    }
    /**
     * Sets the services property value. This array returns a list of available shipping services, as well as the descriptions, directions, and identifiers of each service.
     * @param value Value to set for the services property.
     */
    public void setServices(@jakarta.annotation.Nullable final java.util.List<ServiceInfoResponses> value) {
        this.services = value;
    }
    /**
     * Sets the total property value. The total number of shipping services being displayed on the current results page.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.total = value;
    }
}
