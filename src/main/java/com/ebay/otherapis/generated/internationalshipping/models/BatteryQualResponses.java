package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields to describe a battery&apos;s qualifications.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BatteryQualResponses implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The type of the battery. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:LiBatteryTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String batteryType;
    /**
     * The unique identifier of the battery&apos;s electric qualification, which indicates that the battery has a certificate of approval for global shipping.
     */
    private String elecQualificationId;
    /**
     * The name of the battery&apos;s electric qualification.
     */
    private String elecQualificationName;
    /**
     * The expiration date of the battery qualification.
     */
    private String expireDate;
    /**
     * A remark to the seller themselves.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     */
    private String remark;
    /**
     * Instantiates a new {@link BatteryQualResponses} and sets the default values.
     */
    public BatteryQualResponses() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BatteryQualResponses}
     */
    @jakarta.annotation.Nonnull
    public static BatteryQualResponses createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BatteryQualResponses();
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
     * Gets the batteryType property value. The type of the battery. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:LiBatteryTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBatteryType() {
        return this.batteryType;
    }
    /**
     * Gets the elecQualificationId property value. The unique identifier of the battery&apos;s electric qualification, which indicates that the battery has a certificate of approval for global shipping.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getElecQualificationId() {
        return this.elecQualificationId;
    }
    /**
     * Gets the elecQualificationName property value. The name of the battery&apos;s electric qualification.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getElecQualificationName() {
        return this.elecQualificationName;
    }
    /**
     * Gets the expireDate property value. The expiration date of the battery qualification.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExpireDate() {
        return this.expireDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("batteryType", (n) -> { this.setBatteryType(n.getStringValue()); });
        deserializerMap.put("elecQualificationId", (n) -> { this.setElecQualificationId(n.getStringValue()); });
        deserializerMap.put("elecQualificationName", (n) -> { this.setElecQualificationName(n.getStringValue()); });
        deserializerMap.put("expireDate", (n) -> { this.setExpireDate(n.getStringValue()); });
        deserializerMap.put("remark", (n) -> { this.setRemark(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the remark property value. A remark to the seller themselves.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemark() {
        return this.remark;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("batteryType", this.getBatteryType());
        writer.writeStringValue("elecQualificationId", this.getElecQualificationId());
        writer.writeStringValue("elecQualificationName", this.getElecQualificationName());
        writer.writeStringValue("expireDate", this.getExpireDate());
        writer.writeStringValue("remark", this.getRemark());
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
     * Sets the batteryType property value. The type of the battery. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:LiBatteryTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the batteryType property.
     */
    public void setBatteryType(@jakarta.annotation.Nullable final String value) {
        this.batteryType = value;
    }
    /**
     * Sets the elecQualificationId property value. The unique identifier of the battery&apos;s electric qualification, which indicates that the battery has a certificate of approval for global shipping.
     * @param value Value to set for the elecQualificationId property.
     */
    public void setElecQualificationId(@jakarta.annotation.Nullable final String value) {
        this.elecQualificationId = value;
    }
    /**
     * Sets the elecQualificationName property value. The name of the battery&apos;s electric qualification.
     * @param value Value to set for the elecQualificationName property.
     */
    public void setElecQualificationName(@jakarta.annotation.Nullable final String value) {
        this.elecQualificationName = value;
    }
    /**
     * Sets the expireDate property value. The expiration date of the battery qualification.
     * @param value Value to set for the expireDate property.
     */
    public void setExpireDate(@jakarta.annotation.Nullable final String value) {
        this.expireDate = value;
    }
    /**
     * Sets the remark property value. A remark to the seller themselves.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @param value Value to set for the remark property.
     */
    public void setRemark(@jakarta.annotation.Nullable final String value) {
        this.remark = value;
    }
}
