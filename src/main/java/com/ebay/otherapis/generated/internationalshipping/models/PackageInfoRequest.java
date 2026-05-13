package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to specify the package information needed to create a package.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PackageInfoRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines information about an EU AR agent, such as their address, name, and phone number.
     */
    private AgentInfoData agentInfoRequest;
    /**
     * The unique identifier of the consign address to be associated with the package.&lt;br&gt;&lt;br&gt;This ID can be retrieved using the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/consign_preference/methods/getConsignPreferences&quot; target=&quot;_blank&quot;&gt;getConsignPreferences&lt;/a&gt; method.
     */
    private String consignPreferenceId;
    /**
     * The incoterm information associated with the package.&lt;br&gt;&lt;br&gt;&lt;b&gt;Supported values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;DDP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DDU&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:IncotermEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String incoterm;
    /**
     * This array is used to specify applicable information about the eBay line item(s) that will be included in the package.
     */
    private java.util.List<ItemRequest> items;
    /**
     * This field is used to limit the maximum number of parcels used in a single order. If the order has more than one parcel, revise this value to increase the limit.
     */
    private Integer maxQuantityLimit;
    /**
     * A seller-defined comment about the package.
     */
    private String packageComment;
    /**
     * The height of the package in centimeters.
     */
    private Double packageHeight;
    /**
     * The length of the package in centimeters.
     */
    private Double packageLength;
    /**
     * The weight of the package in grams.
     */
    private Double packageWeight;
    /**
     * The width of the package in centimeters.
     */
    private Double packageWidth;
    /**
     * The unique identifier of the ship-from address used for the package.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/address_preference/methods/getAddressPreferences&quot; target=&quot;_blank&quot;&gt;getAddressPreferences&lt;/a&gt; method to retrieve valid ship-from &lt;b&gt;addressId&lt;/b&gt; values associated with your account.
     */
    private String shipFromAddressId;
    /**
     * The unique identifier of the shipping service being used for the package.&lt;br&gt;&lt;br&gt;This value can be retrieved using the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/services/methods/getServices&quot; target=&quot;_blank&quot;&gt;getServices&lt;/a&gt; method.
     */
    private String shippingServiceId;
    /**
     * This type is used to specify the address fields of the ship-to address location.
     */
    private ShipToAddressRequestData shipToAddress;
    /**
     * This type defines the special service details available for a package.
     */
    private SpecialServiceDetail specialServiceDetail;
    /**
     * The declared value of a large carriage (a combination of several orders together).
     */
    private String valueForCarriage;
    /**
     * Instantiates a new {@link PackageInfoRequest} and sets the default values.
     */
    public PackageInfoRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PackageInfoRequest}
     */
    @jakarta.annotation.Nonnull
    public static PackageInfoRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PackageInfoRequest();
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
     * Gets the agentInfoRequest property value. This type defines information about an EU AR agent, such as their address, name, and phone number.
     * @return a {@link AgentInfoData}
     */
    @jakarta.annotation.Nullable
    public AgentInfoData getAgentInfoRequest() {
        return this.agentInfoRequest;
    }
    /**
     * Gets the consignPreferenceId property value. The unique identifier of the consign address to be associated with the package.&lt;br&gt;&lt;br&gt;This ID can be retrieved using the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/consign_preference/methods/getConsignPreferences&quot; target=&quot;_blank&quot;&gt;getConsignPreferences&lt;/a&gt; method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConsignPreferenceId() {
        return this.consignPreferenceId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("agentInfoRequest", (n) -> { this.setAgentInfoRequest(n.getObjectValue(AgentInfoData::createFromDiscriminatorValue)); });
        deserializerMap.put("consignPreferenceId", (n) -> { this.setConsignPreferenceId(n.getStringValue()); });
        deserializerMap.put("incoterm", (n) -> { this.setIncoterm(n.getStringValue()); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(ItemRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("maxQuantityLimit", (n) -> { this.setMaxQuantityLimit(n.getIntegerValue()); });
        deserializerMap.put("packageComment", (n) -> { this.setPackageComment(n.getStringValue()); });
        deserializerMap.put("packageHeight", (n) -> { this.setPackageHeight(n.getDoubleValue()); });
        deserializerMap.put("packageLength", (n) -> { this.setPackageLength(n.getDoubleValue()); });
        deserializerMap.put("packageWeight", (n) -> { this.setPackageWeight(n.getDoubleValue()); });
        deserializerMap.put("packageWidth", (n) -> { this.setPackageWidth(n.getDoubleValue()); });
        deserializerMap.put("shipFromAddressId", (n) -> { this.setShipFromAddressId(n.getStringValue()); });
        deserializerMap.put("shippingServiceId", (n) -> { this.setShippingServiceId(n.getStringValue()); });
        deserializerMap.put("shipToAddress", (n) -> { this.setShipToAddress(n.getObjectValue(ShipToAddressRequestData::createFromDiscriminatorValue)); });
        deserializerMap.put("specialServiceDetail", (n) -> { this.setSpecialServiceDetail(n.getObjectValue(SpecialServiceDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("valueForCarriage", (n) -> { this.setValueForCarriage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the incoterm property value. The incoterm information associated with the package.&lt;br&gt;&lt;br&gt;&lt;b&gt;Supported values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;DDP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DDU&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:IncotermEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIncoterm() {
        return this.incoterm;
    }
    /**
     * Gets the items property value. This array is used to specify applicable information about the eBay line item(s) that will be included in the package.
     * @return a {@link java.util.List<ItemRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemRequest> getItems() {
        return this.items;
    }
    /**
     * Gets the maxQuantityLimit property value. This field is used to limit the maximum number of parcels used in a single order. If the order has more than one parcel, revise this value to increase the limit.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxQuantityLimit() {
        return this.maxQuantityLimit;
    }
    /**
     * Gets the packageComment property value. A seller-defined comment about the package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackageComment() {
        return this.packageComment;
    }
    /**
     * Gets the packageHeight property value. The height of the package in centimeters.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPackageHeight() {
        return this.packageHeight;
    }
    /**
     * Gets the packageLength property value. The length of the package in centimeters.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPackageLength() {
        return this.packageLength;
    }
    /**
     * Gets the packageWeight property value. The weight of the package in grams.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPackageWeight() {
        return this.packageWeight;
    }
    /**
     * Gets the packageWidth property value. The width of the package in centimeters.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPackageWidth() {
        return this.packageWidth;
    }
    /**
     * Gets the shipFromAddressId property value. The unique identifier of the ship-from address used for the package.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/address_preference/methods/getAddressPreferences&quot; target=&quot;_blank&quot;&gt;getAddressPreferences&lt;/a&gt; method to retrieve valid ship-from &lt;b&gt;addressId&lt;/b&gt; values associated with your account.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShipFromAddressId() {
        return this.shipFromAddressId;
    }
    /**
     * Gets the shippingServiceId property value. The unique identifier of the shipping service being used for the package.&lt;br&gt;&lt;br&gt;This value can be retrieved using the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/services/methods/getServices&quot; target=&quot;_blank&quot;&gt;getServices&lt;/a&gt; method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingServiceId() {
        return this.shippingServiceId;
    }
    /**
     * Gets the shipToAddress property value. This type is used to specify the address fields of the ship-to address location.
     * @return a {@link ShipToAddressRequestData}
     */
    @jakarta.annotation.Nullable
    public ShipToAddressRequestData getShipToAddress() {
        return this.shipToAddress;
    }
    /**
     * Gets the specialServiceDetail property value. This type defines the special service details available for a package.
     * @return a {@link SpecialServiceDetail}
     */
    @jakarta.annotation.Nullable
    public SpecialServiceDetail getSpecialServiceDetail() {
        return this.specialServiceDetail;
    }
    /**
     * Gets the valueForCarriage property value. The declared value of a large carriage (a combination of several orders together).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValueForCarriage() {
        return this.valueForCarriage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("agentInfoRequest", this.getAgentInfoRequest());
        writer.writeStringValue("consignPreferenceId", this.getConsignPreferenceId());
        writer.writeStringValue("incoterm", this.getIncoterm());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeIntegerValue("maxQuantityLimit", this.getMaxQuantityLimit());
        writer.writeStringValue("packageComment", this.getPackageComment());
        writer.writeDoubleValue("packageHeight", this.getPackageHeight());
        writer.writeDoubleValue("packageLength", this.getPackageLength());
        writer.writeDoubleValue("packageWeight", this.getPackageWeight());
        writer.writeDoubleValue("packageWidth", this.getPackageWidth());
        writer.writeStringValue("shipFromAddressId", this.getShipFromAddressId());
        writer.writeStringValue("shippingServiceId", this.getShippingServiceId());
        writer.writeObjectValue("shipToAddress", this.getShipToAddress());
        writer.writeObjectValue("specialServiceDetail", this.getSpecialServiceDetail());
        writer.writeStringValue("valueForCarriage", this.getValueForCarriage());
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
     * Sets the agentInfoRequest property value. This type defines information about an EU AR agent, such as their address, name, and phone number.
     * @param value Value to set for the agentInfoRequest property.
     */
    public void setAgentInfoRequest(@jakarta.annotation.Nullable final AgentInfoData value) {
        this.agentInfoRequest = value;
    }
    /**
     * Sets the consignPreferenceId property value. The unique identifier of the consign address to be associated with the package.&lt;br&gt;&lt;br&gt;This ID can be retrieved using the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/consign_preference/methods/getConsignPreferences&quot; target=&quot;_blank&quot;&gt;getConsignPreferences&lt;/a&gt; method.
     * @param value Value to set for the consignPreferenceId property.
     */
    public void setConsignPreferenceId(@jakarta.annotation.Nullable final String value) {
        this.consignPreferenceId = value;
    }
    /**
     * Sets the incoterm property value. The incoterm information associated with the package.&lt;br&gt;&lt;br&gt;&lt;b&gt;Supported values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;DDP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DDU&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:IncotermEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the incoterm property.
     */
    public void setIncoterm(@jakarta.annotation.Nullable final String value) {
        this.incoterm = value;
    }
    /**
     * Sets the items property value. This array is used to specify applicable information about the eBay line item(s) that will be included in the package.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<ItemRequest> value) {
        this.items = value;
    }
    /**
     * Sets the maxQuantityLimit property value. This field is used to limit the maximum number of parcels used in a single order. If the order has more than one parcel, revise this value to increase the limit.
     * @param value Value to set for the maxQuantityLimit property.
     */
    public void setMaxQuantityLimit(@jakarta.annotation.Nullable final Integer value) {
        this.maxQuantityLimit = value;
    }
    /**
     * Sets the packageComment property value. A seller-defined comment about the package.
     * @param value Value to set for the packageComment property.
     */
    public void setPackageComment(@jakarta.annotation.Nullable final String value) {
        this.packageComment = value;
    }
    /**
     * Sets the packageHeight property value. The height of the package in centimeters.
     * @param value Value to set for the packageHeight property.
     */
    public void setPackageHeight(@jakarta.annotation.Nullable final Double value) {
        this.packageHeight = value;
    }
    /**
     * Sets the packageLength property value. The length of the package in centimeters.
     * @param value Value to set for the packageLength property.
     */
    public void setPackageLength(@jakarta.annotation.Nullable final Double value) {
        this.packageLength = value;
    }
    /**
     * Sets the packageWeight property value. The weight of the package in grams.
     * @param value Value to set for the packageWeight property.
     */
    public void setPackageWeight(@jakarta.annotation.Nullable final Double value) {
        this.packageWeight = value;
    }
    /**
     * Sets the packageWidth property value. The width of the package in centimeters.
     * @param value Value to set for the packageWidth property.
     */
    public void setPackageWidth(@jakarta.annotation.Nullable final Double value) {
        this.packageWidth = value;
    }
    /**
     * Sets the shipFromAddressId property value. The unique identifier of the ship-from address used for the package.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/address_preference/methods/getAddressPreferences&quot; target=&quot;_blank&quot;&gt;getAddressPreferences&lt;/a&gt; method to retrieve valid ship-from &lt;b&gt;addressId&lt;/b&gt; values associated with your account.
     * @param value Value to set for the shipFromAddressId property.
     */
    public void setShipFromAddressId(@jakarta.annotation.Nullable final String value) {
        this.shipFromAddressId = value;
    }
    /**
     * Sets the shippingServiceId property value. The unique identifier of the shipping service being used for the package.&lt;br&gt;&lt;br&gt;This value can be retrieved using the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/services/methods/getServices&quot; target=&quot;_blank&quot;&gt;getServices&lt;/a&gt; method.
     * @param value Value to set for the shippingServiceId property.
     */
    public void setShippingServiceId(@jakarta.annotation.Nullable final String value) {
        this.shippingServiceId = value;
    }
    /**
     * Sets the shipToAddress property value. This type is used to specify the address fields of the ship-to address location.
     * @param value Value to set for the shipToAddress property.
     */
    public void setShipToAddress(@jakarta.annotation.Nullable final ShipToAddressRequestData value) {
        this.shipToAddress = value;
    }
    /**
     * Sets the specialServiceDetail property value. This type defines the special service details available for a package.
     * @param value Value to set for the specialServiceDetail property.
     */
    public void setSpecialServiceDetail(@jakarta.annotation.Nullable final SpecialServiceDetail value) {
        this.specialServiceDetail = value;
    }
    /**
     * Sets the valueForCarriage property value. The declared value of a large carriage (a combination of several orders together).
     * @param value Value to set for the valueForCarriage property.
     */
    public void setValueForCarriage(@jakarta.annotation.Nullable final String value) {
        this.valueForCarriage = value;
    }
}
