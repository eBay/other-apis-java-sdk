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
 * This type is used to specify the address details used to create a consign address.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateConsignPreferenceRequestData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the consign address.
     */
    private String consignPreferenceName;
    /**
     * The unique identifier of a drop-off site location. This value can be retrieved using the &lt;a href=&quot;/develop/api/sell/edelivery_international_shipping_api#sell-edelivery_international_shipping_api-dropoff_sites-getdropoffsites&quot;&gt;getDropoffSites&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;This field is required if the &lt;code&gt;DROPOFF&lt;/code&gt; address type is specified.
     */
    private String dropoffSiteId;
    /**
     * This container is used to specify the address details used to create a pickup-from address.&lt;br&gt;&lt;br&gt;This container is required if the &lt;code&gt;PICK_UP&lt;/code&gt; address type is specified.
     */
    private PickupAddressRequestData pickupAddress;
    /**
     * The pickup time that the pickup location supports.&lt;br&gt;&lt;br&gt;This field is required if the &lt;code&gt;PICK_UP&lt;/code&gt; address type is specified.
     */
    private PickUpTimeTypeEnum pickupTime;
    /**
     * The address type of the consign address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FORWARD_DEPLOYMENT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RDC&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CN_POST_DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CN_POST_PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;HK_POST_DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private ConsignTypeEnum type;
    /**
     * Instantiates a new {@link CreateConsignPreferenceRequestData} and sets the default values.
     */
    public CreateConsignPreferenceRequestData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateConsignPreferenceRequestData}
     */
    @jakarta.annotation.Nonnull
    public static CreateConsignPreferenceRequestData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateConsignPreferenceRequestData();
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
     * Gets the consignPreferenceName property value. The name of the consign address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConsignPreferenceName() {
        return this.consignPreferenceName;
    }
    /**
     * Gets the dropoffSiteId property value. The unique identifier of a drop-off site location. This value can be retrieved using the &lt;a href=&quot;/develop/api/sell/edelivery_international_shipping_api#sell-edelivery_international_shipping_api-dropoff_sites-getdropoffsites&quot;&gt;getDropoffSites&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;This field is required if the &lt;code&gt;DROPOFF&lt;/code&gt; address type is specified.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDropoffSiteId() {
        return this.dropoffSiteId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("consignPreferenceName", (n) -> { this.setConsignPreferenceName(n.getStringValue()); });
        deserializerMap.put("dropoffSiteId", (n) -> { this.setDropoffSiteId(n.getStringValue()); });
        deserializerMap.put("pickupAddress", (n) -> { this.setPickupAddress(n.getObjectValue(PickupAddressRequestData::createFromDiscriminatorValue)); });
        deserializerMap.put("pickupTime", (n) -> { this.setPickupTime(n.getEnumValue(PickUpTimeTypeEnum::forValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(ConsignTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the pickupAddress property value. This container is used to specify the address details used to create a pickup-from address.&lt;br&gt;&lt;br&gt;This container is required if the &lt;code&gt;PICK_UP&lt;/code&gt; address type is specified.
     * @return a {@link PickupAddressRequestData}
     */
    @jakarta.annotation.Nullable
    public PickupAddressRequestData getPickupAddress() {
        return this.pickupAddress;
    }
    /**
     * Gets the pickupTime property value. The pickup time that the pickup location supports.&lt;br&gt;&lt;br&gt;This field is required if the &lt;code&gt;PICK_UP&lt;/code&gt; address type is specified.
     * @return a {@link PickUpTimeTypeEnum}
     */
    @jakarta.annotation.Nullable
    public PickUpTimeTypeEnum getPickupTime() {
        return this.pickupTime;
    }
    /**
     * Gets the type property value. The address type of the consign address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FORWARD_DEPLOYMENT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RDC&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CN_POST_DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CN_POST_PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;HK_POST_DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link ConsignTypeEnum}
     */
    @jakarta.annotation.Nullable
    public ConsignTypeEnum getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("consignPreferenceName", this.getConsignPreferenceName());
        writer.writeStringValue("dropoffSiteId", this.getDropoffSiteId());
        writer.writeObjectValue("pickupAddress", this.getPickupAddress());
        writer.writeEnumValue("pickupTime", this.getPickupTime());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the consignPreferenceName property value. The name of the consign address.
     * @param value Value to set for the consignPreferenceName property.
     */
    public void setConsignPreferenceName(@jakarta.annotation.Nullable final String value) {
        this.consignPreferenceName = value;
    }
    /**
     * Sets the dropoffSiteId property value. The unique identifier of a drop-off site location. This value can be retrieved using the &lt;a href=&quot;/develop/api/sell/edelivery_international_shipping_api#sell-edelivery_international_shipping_api-dropoff_sites-getdropoffsites&quot;&gt;getDropoffSites&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;This field is required if the &lt;code&gt;DROPOFF&lt;/code&gt; address type is specified.
     * @param value Value to set for the dropoffSiteId property.
     */
    public void setDropoffSiteId(@jakarta.annotation.Nullable final String value) {
        this.dropoffSiteId = value;
    }
    /**
     * Sets the pickupAddress property value. This container is used to specify the address details used to create a pickup-from address.&lt;br&gt;&lt;br&gt;This container is required if the &lt;code&gt;PICK_UP&lt;/code&gt; address type is specified.
     * @param value Value to set for the pickupAddress property.
     */
    public void setPickupAddress(@jakarta.annotation.Nullable final PickupAddressRequestData value) {
        this.pickupAddress = value;
    }
    /**
     * Sets the pickupTime property value. The pickup time that the pickup location supports.&lt;br&gt;&lt;br&gt;This field is required if the &lt;code&gt;PICK_UP&lt;/code&gt; address type is specified.
     * @param value Value to set for the pickupTime property.
     */
    public void setPickupTime(@jakarta.annotation.Nullable final PickUpTimeTypeEnum value) {
        this.pickupTime = value;
    }
    /**
     * Sets the type property value. The address type of the consign address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FORWARD_DEPLOYMENT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RDC&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CN_POST_DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CN_POST_PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;HK_POST_DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final ConsignTypeEnum value) {
        this.type = value;
    }
}
