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

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type specifies the details returned for the specified package.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetPackageDetailResponsesData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines information about an EU AR agent, such as their address, name, and phone number.
     */
    private AgentInfoData agentInfoResponse;
    /**
     * The unique identifier of the consign address associated with the package.
     */
    private String consignPreferenceId;
    /**
     * The incoterm information associated with the package.&lt;br&gt;&lt;br&gt;&lt;b&gt;Supported values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;DDP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DDU&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:IncotermEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String incoterm;
    /**
     * This array returns information about the eBay line item(s) that are included in the package.
     */
    private java.util.List<ItemResponses> items;
    /**
     * The last-mile tracking number of the package.&lt;br&gt;&lt;br&gt;This field is only returned if the last-mile tracking number is provided by the carrier.
     */
    private String lastMileTrackingNumber;
    /**
     * The seller-defined remark to the buyer associated with the package.
     */
    private String packageComment;
    /**
     * The height of the package in centimeters.
     */
    private Double packageHeight;
    /**
     * The unique identifier of the package.
     */
    private String packageId;
    /**
     * The length of the package in centimeters.
     */
    private Double packageLength;
    /**
     * The current status of the package. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:PackageStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String packageStatus;
    /**
     * The weight of the package in grams.
     */
    private Double packageWeight;
    /**
     * The width of the package in centimeters.
     */
    private Double packageWidth;
    /**
     * This type defines the monetary value of an amount. 
     */
    private Amount paymentCost;
    /**
     * The unique identifier of the ship-from address associated with the package.
     */
    private String shipFromAddressId;
    /**
     * The unique identifier of the shipping service used for the package.
     */
    private String shippingServiceId;
    /**
     * This type specifies the ship-to address information for a retrieved package.
     */
    private ShipToAddressResponsesData shipToAddress;
    /**
     * This type defines the special service details available for a package.
     */
    private SpecialServiceDetail specialServiceDetail;
    /**
     * The declared value of the package.
     */
    private String valueForCarriage;
    /**
     * Instantiates a new {@link GetPackageDetailResponsesData} and sets the default values.
     */
    public GetPackageDetailResponsesData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetPackageDetailResponsesData}
     */
    @jakarta.annotation.Nonnull
    public static GetPackageDetailResponsesData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetPackageDetailResponsesData();
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
     * Gets the agentInfoResponse property value. This type defines information about an EU AR agent, such as their address, name, and phone number.
     * @return a {@link AgentInfoData}
     */
    @jakarta.annotation.Nullable
    public AgentInfoData getAgentInfoResponse() {
        return this.agentInfoResponse;
    }
    /**
     * Gets the consignPreferenceId property value. The unique identifier of the consign address associated with the package.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("agentInfoResponse", (n) -> { this.setAgentInfoResponse(n.getObjectValue(AgentInfoData::createFromDiscriminatorValue)); });
        deserializerMap.put("consignPreferenceId", (n) -> { this.setConsignPreferenceId(n.getStringValue()); });
        deserializerMap.put("incoterm", (n) -> { this.setIncoterm(n.getStringValue()); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(ItemResponses::createFromDiscriminatorValue)); });
        deserializerMap.put("lastMileTrackingNumber", (n) -> { this.setLastMileTrackingNumber(n.getStringValue()); });
        deserializerMap.put("packageComment", (n) -> { this.setPackageComment(n.getStringValue()); });
        deserializerMap.put("packageHeight", (n) -> { this.setPackageHeight(n.getDoubleValue()); });
        deserializerMap.put("packageId", (n) -> { this.setPackageId(n.getStringValue()); });
        deserializerMap.put("packageLength", (n) -> { this.setPackageLength(n.getDoubleValue()); });
        deserializerMap.put("packageStatus", (n) -> { this.setPackageStatus(n.getStringValue()); });
        deserializerMap.put("packageWeight", (n) -> { this.setPackageWeight(n.getDoubleValue()); });
        deserializerMap.put("packageWidth", (n) -> { this.setPackageWidth(n.getDoubleValue()); });
        deserializerMap.put("paymentCost", (n) -> { this.setPaymentCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("shipFromAddressId", (n) -> { this.setShipFromAddressId(n.getStringValue()); });
        deserializerMap.put("shippingServiceId", (n) -> { this.setShippingServiceId(n.getStringValue()); });
        deserializerMap.put("shipToAddress", (n) -> { this.setShipToAddress(n.getObjectValue(ShipToAddressResponsesData::createFromDiscriminatorValue)); });
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
     * Gets the items property value. This array returns information about the eBay line item(s) that are included in the package.
     * @return a {@link java.util.List<ItemResponses>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemResponses> getItems() {
        return this.items;
    }
    /**
     * Gets the lastMileTrackingNumber property value. The last-mile tracking number of the package.&lt;br&gt;&lt;br&gt;This field is only returned if the last-mile tracking number is provided by the carrier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastMileTrackingNumber() {
        return this.lastMileTrackingNumber;
    }
    /**
     * Gets the packageComment property value. The seller-defined remark to the buyer associated with the package.
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
     * Gets the packageId property value. The unique identifier of the package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackageId() {
        return this.packageId;
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
     * Gets the packageStatus property value. The current status of the package. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:PackageStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackageStatus() {
        return this.packageStatus;
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
     * Gets the paymentCost property value. This type defines the monetary value of an amount. 
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPaymentCost() {
        return this.paymentCost;
    }
    /**
     * Gets the shipFromAddressId property value. The unique identifier of the ship-from address associated with the package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShipFromAddressId() {
        return this.shipFromAddressId;
    }
    /**
     * Gets the shippingServiceId property value. The unique identifier of the shipping service used for the package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingServiceId() {
        return this.shippingServiceId;
    }
    /**
     * Gets the shipToAddress property value. This type specifies the ship-to address information for a retrieved package.
     * @return a {@link ShipToAddressResponsesData}
     */
    @jakarta.annotation.Nullable
    public ShipToAddressResponsesData getShipToAddress() {
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
     * Gets the valueForCarriage property value. The declared value of the package.
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
        writer.writeObjectValue("agentInfoResponse", this.getAgentInfoResponse());
        writer.writeStringValue("consignPreferenceId", this.getConsignPreferenceId());
        writer.writeStringValue("incoterm", this.getIncoterm());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeStringValue("lastMileTrackingNumber", this.getLastMileTrackingNumber());
        writer.writeStringValue("packageComment", this.getPackageComment());
        writer.writeDoubleValue("packageHeight", this.getPackageHeight());
        writer.writeStringValue("packageId", this.getPackageId());
        writer.writeDoubleValue("packageLength", this.getPackageLength());
        writer.writeStringValue("packageStatus", this.getPackageStatus());
        writer.writeDoubleValue("packageWeight", this.getPackageWeight());
        writer.writeDoubleValue("packageWidth", this.getPackageWidth());
        writer.writeObjectValue("paymentCost", this.getPaymentCost());
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
     * Sets the agentInfoResponse property value. This type defines information about an EU AR agent, such as their address, name, and phone number.
     * @param value Value to set for the agentInfoResponse property.
     */
    public void setAgentInfoResponse(@jakarta.annotation.Nullable final AgentInfoData value) {
        this.agentInfoResponse = value;
    }
    /**
     * Sets the consignPreferenceId property value. The unique identifier of the consign address associated with the package.
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
     * Sets the items property value. This array returns information about the eBay line item(s) that are included in the package.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<ItemResponses> value) {
        this.items = value;
    }
    /**
     * Sets the lastMileTrackingNumber property value. The last-mile tracking number of the package.&lt;br&gt;&lt;br&gt;This field is only returned if the last-mile tracking number is provided by the carrier.
     * @param value Value to set for the lastMileTrackingNumber property.
     */
    public void setLastMileTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.lastMileTrackingNumber = value;
    }
    /**
     * Sets the packageComment property value. The seller-defined remark to the buyer associated with the package.
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
     * Sets the packageId property value. The unique identifier of the package.
     * @param value Value to set for the packageId property.
     */
    public void setPackageId(@jakarta.annotation.Nullable final String value) {
        this.packageId = value;
    }
    /**
     * Sets the packageLength property value. The length of the package in centimeters.
     * @param value Value to set for the packageLength property.
     */
    public void setPackageLength(@jakarta.annotation.Nullable final Double value) {
        this.packageLength = value;
    }
    /**
     * Sets the packageStatus property value. The current status of the package. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:PackageStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the packageStatus property.
     */
    public void setPackageStatus(@jakarta.annotation.Nullable final String value) {
        this.packageStatus = value;
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
     * Sets the paymentCost property value. This type defines the monetary value of an amount. 
     * @param value Value to set for the paymentCost property.
     */
    public void setPaymentCost(@jakarta.annotation.Nullable final Amount value) {
        this.paymentCost = value;
    }
    /**
     * Sets the shipFromAddressId property value. The unique identifier of the ship-from address associated with the package.
     * @param value Value to set for the shipFromAddressId property.
     */
    public void setShipFromAddressId(@jakarta.annotation.Nullable final String value) {
        this.shipFromAddressId = value;
    }
    /**
     * Sets the shippingServiceId property value. The unique identifier of the shipping service used for the package.
     * @param value Value to set for the shippingServiceId property.
     */
    public void setShippingServiceId(@jakarta.annotation.Nullable final String value) {
        this.shippingServiceId = value;
    }
    /**
     * Sets the shipToAddress property value. This type specifies the ship-to address information for a retrieved package.
     * @param value Value to set for the shipToAddress property.
     */
    public void setShipToAddress(@jakarta.annotation.Nullable final ShipToAddressResponsesData value) {
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
     * Sets the valueForCarriage property value. The declared value of the package.
     * @param value Value to set for the valueForCarriage property.
     */
    public void setValueForCarriage(@jakarta.annotation.Nullable final String value) {
        this.valueForCarriage = value;
    }
}
