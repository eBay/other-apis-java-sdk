package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type specifies the fields used to create a consign address.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConsignPreferenceInfoResponses implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the consign address.
     */
    private String consignPreferenceId;
    /**
     * The name of the consign address.
     */
    private String consignPreferenceName;
    /**
     * The unique identifier of the drop-off site.&lt;br&gt;&lt;br&gt;This field is only returned if the consign address is a drop-off location.
     */
    private String dropoffSiteId;
    /**
     * This type defines the fields used to specify location and contact information for a pickup-from consign address associated with a seller&apos;s eDIS account.
     */
    private PickupAddressResponsesData pickupAddress;
    /**
     * The supported pickup window that the pickup location supports.&lt;br&gt;&lt;br&gt;This field is only returned if the consign address is a pickup-from location For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:PickUpTimeTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String pickupTime;
    /**
     * The address type of the consign address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FORWARD_DEPLOYMENT&lt;/code&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:ConsignTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String type;
    /**
     * Instantiates a new {@link ConsignPreferenceInfoResponses} and sets the default values.
     */
    public ConsignPreferenceInfoResponses() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConsignPreferenceInfoResponses}
     */
    @jakarta.annotation.Nonnull
    public static ConsignPreferenceInfoResponses createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConsignPreferenceInfoResponses();
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
     * Gets the consignPreferenceId property value. The unique identifier of the consign address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConsignPreferenceId() {
        return this.consignPreferenceId;
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
     * Gets the dropoffSiteId property value. The unique identifier of the drop-off site.&lt;br&gt;&lt;br&gt;This field is only returned if the consign address is a drop-off location.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("consignPreferenceId", (n) -> { this.setConsignPreferenceId(n.getStringValue()); });
        deserializerMap.put("consignPreferenceName", (n) -> { this.setConsignPreferenceName(n.getStringValue()); });
        deserializerMap.put("dropoffSiteId", (n) -> { this.setDropoffSiteId(n.getStringValue()); });
        deserializerMap.put("pickupAddress", (n) -> { this.setPickupAddress(n.getObjectValue(PickupAddressResponsesData::createFromDiscriminatorValue)); });
        deserializerMap.put("pickupTime", (n) -> { this.setPickupTime(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the pickupAddress property value. This type defines the fields used to specify location and contact information for a pickup-from consign address associated with a seller&apos;s eDIS account.
     * @return a {@link PickupAddressResponsesData}
     */
    @jakarta.annotation.Nullable
    public PickupAddressResponsesData getPickupAddress() {
        return this.pickupAddress;
    }
    /**
     * Gets the pickupTime property value. The supported pickup window that the pickup location supports.&lt;br&gt;&lt;br&gt;This field is only returned if the consign address is a pickup-from location For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:PickUpTimeTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPickupTime() {
        return this.pickupTime;
    }
    /**
     * Gets the type property value. The address type of the consign address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FORWARD_DEPLOYMENT&lt;/code&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:ConsignTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("consignPreferenceId", this.getConsignPreferenceId());
        writer.writeStringValue("consignPreferenceName", this.getConsignPreferenceName());
        writer.writeStringValue("dropoffSiteId", this.getDropoffSiteId());
        writer.writeObjectValue("pickupAddress", this.getPickupAddress());
        writer.writeStringValue("pickupTime", this.getPickupTime());
        writer.writeStringValue("type", this.getType());
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
     * Sets the consignPreferenceId property value. The unique identifier of the consign address.
     * @param value Value to set for the consignPreferenceId property.
     */
    public void setConsignPreferenceId(@jakarta.annotation.Nullable final String value) {
        this.consignPreferenceId = value;
    }
    /**
     * Sets the consignPreferenceName property value. The name of the consign address.
     * @param value Value to set for the consignPreferenceName property.
     */
    public void setConsignPreferenceName(@jakarta.annotation.Nullable final String value) {
        this.consignPreferenceName = value;
    }
    /**
     * Sets the dropoffSiteId property value. The unique identifier of the drop-off site.&lt;br&gt;&lt;br&gt;This field is only returned if the consign address is a drop-off location.
     * @param value Value to set for the dropoffSiteId property.
     */
    public void setDropoffSiteId(@jakarta.annotation.Nullable final String value) {
        this.dropoffSiteId = value;
    }
    /**
     * Sets the pickupAddress property value. This type defines the fields used to specify location and contact information for a pickup-from consign address associated with a seller&apos;s eDIS account.
     * @param value Value to set for the pickupAddress property.
     */
    public void setPickupAddress(@jakarta.annotation.Nullable final PickupAddressResponsesData value) {
        this.pickupAddress = value;
    }
    /**
     * Sets the pickupTime property value. The supported pickup window that the pickup location supports.&lt;br&gt;&lt;br&gt;This field is only returned if the consign address is a pickup-from location For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:PickUpTimeTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the pickupTime property.
     */
    public void setPickupTime(@jakarta.annotation.Nullable final String value) {
        this.pickupTime = value;
    }
    /**
     * Sets the type property value. The address type of the consign address.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FORWARD_DEPLOYMENT&lt;/code&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:ConsignTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
