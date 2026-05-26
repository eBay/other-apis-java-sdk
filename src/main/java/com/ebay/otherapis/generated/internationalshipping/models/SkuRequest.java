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
 * This type specifies information relating to the SKU item in a package.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SkuRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the battery&apos;s electric qualification, which indicates that the battery has a certificate of approval for global shipping.&lt;br&gt;&lt;br&gt;This value is returned in the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/battery_qualifications/methods/getBatteryQualifications&quot; target=&quot;_blank&quot;&gt;getBatteryQualifications&lt;/a&gt; method.
     */
    private String elecQualificationId;
    /**
     * This array lists the FDC SKUs associated with the item. An FDC SKU is the SKU label in a forward deployment center.&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Please contact customer service before using these fields.&lt;/p&gt;&lt;/div&gt;
     */
    private java.util.List<FDCSkuRequest> fdcSkus;
    /**
     * The height of the item in centimeters.
     */
    private Double height;
    /**
     * This boolean indicates if the item contains a battery.
     */
    private Boolean isLiBattery;
    /**
     * The length of the item in centimeters.
     */
    private Double length;
    /**
     * If the item contains a battery, this field indicates the type of battery the item contains. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:LiBatteryTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String liBatteryType;
    /**
     * The English name of the item.
     */
    private String nameEn;
    /**
     * The Chinese name of the item.
     */
    private String nameZh;
    /**
     * The country of origin of the item.
     */
    private String origin;
    /**
     * This type defines the monetary value of an amount. 
     */
    private Amount price;
    /**
     * A remark to the seller themselves.
     */
    private String remark;
    /**
     * The stock keeping unit (SKU) identifier of the item.
     */
    private String skuNumber;
    /**
     * The Harmonized System code for custom declaration. This value declares the category of the item..
     */
    private String tariffCode;
    /**
     * The weight of the item in grams.
     */
    private Double weight;
    /**
     * The width of the item in centimeters.
     */
    private Double width;
    /**
     * Instantiates a new {@link SkuRequest} and sets the default values.
     */
    public SkuRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SkuRequest}
     */
    @jakarta.annotation.Nonnull
    public static SkuRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SkuRequest();
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
     * Gets the elecQualificationId property value. The unique identifier of the battery&apos;s electric qualification, which indicates that the battery has a certificate of approval for global shipping.&lt;br&gt;&lt;br&gt;This value is returned in the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/battery_qualifications/methods/getBatteryQualifications&quot; target=&quot;_blank&quot;&gt;getBatteryQualifications&lt;/a&gt; method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getElecQualificationId() {
        return this.elecQualificationId;
    }
    /**
     * Gets the fdcSkus property value. This array lists the FDC SKUs associated with the item. An FDC SKU is the SKU label in a forward deployment center.&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Please contact customer service before using these fields.&lt;/p&gt;&lt;/div&gt;
     * @return a {@link java.util.List<FDCSkuRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FDCSkuRequest> getFdcSkus() {
        return this.fdcSkus;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("elecQualificationId", (n) -> { this.setElecQualificationId(n.getStringValue()); });
        deserializerMap.put("fdcSkus", (n) -> { this.setFdcSkus(n.getCollectionOfObjectValues(FDCSkuRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getDoubleValue()); });
        deserializerMap.put("isLiBattery", (n) -> { this.setIsLiBattery(n.getBooleanValue()); });
        deserializerMap.put("length", (n) -> { this.setLength(n.getDoubleValue()); });
        deserializerMap.put("liBatteryType", (n) -> { this.setLiBatteryType(n.getStringValue()); });
        deserializerMap.put("nameEn", (n) -> { this.setNameEn(n.getStringValue()); });
        deserializerMap.put("nameZh", (n) -> { this.setNameZh(n.getStringValue()); });
        deserializerMap.put("origin", (n) -> { this.setOrigin(n.getStringValue()); });
        deserializerMap.put("price", (n) -> { this.setPrice(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("remark", (n) -> { this.setRemark(n.getStringValue()); });
        deserializerMap.put("skuNumber", (n) -> { this.setSkuNumber(n.getStringValue()); });
        deserializerMap.put("tariffCode", (n) -> { this.setTariffCode(n.getStringValue()); });
        deserializerMap.put("weight", (n) -> { this.setWeight(n.getDoubleValue()); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the height property value. The height of the item in centimeters.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getHeight() {
        return this.height;
    }
    /**
     * Gets the isLiBattery property value. This boolean indicates if the item contains a battery.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLiBattery() {
        return this.isLiBattery;
    }
    /**
     * Gets the length property value. The length of the item in centimeters.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLength() {
        return this.length;
    }
    /**
     * Gets the liBatteryType property value. If the item contains a battery, this field indicates the type of battery the item contains. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:LiBatteryTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLiBatteryType() {
        return this.liBatteryType;
    }
    /**
     * Gets the nameEn property value. The English name of the item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNameEn() {
        return this.nameEn;
    }
    /**
     * Gets the nameZh property value. The Chinese name of the item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNameZh() {
        return this.nameZh;
    }
    /**
     * Gets the origin property value. The country of origin of the item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrigin() {
        return this.origin;
    }
    /**
     * Gets the price property value. This type defines the monetary value of an amount. 
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPrice() {
        return this.price;
    }
    /**
     * Gets the remark property value. A remark to the seller themselves.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemark() {
        return this.remark;
    }
    /**
     * Gets the skuNumber property value. The stock keeping unit (SKU) identifier of the item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSkuNumber() {
        return this.skuNumber;
    }
    /**
     * Gets the tariffCode property value. The Harmonized System code for custom declaration. This value declares the category of the item..
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTariffCode() {
        return this.tariffCode;
    }
    /**
     * Gets the weight property value. The weight of the item in grams.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getWeight() {
        return this.weight;
    }
    /**
     * Gets the width property value. The width of the item in centimeters.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getWidth() {
        return this.width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("elecQualificationId", this.getElecQualificationId());
        writer.writeCollectionOfObjectValues("fdcSkus", this.getFdcSkus());
        writer.writeDoubleValue("height", this.getHeight());
        writer.writeBooleanValue("isLiBattery", this.getIsLiBattery());
        writer.writeDoubleValue("length", this.getLength());
        writer.writeStringValue("liBatteryType", this.getLiBatteryType());
        writer.writeStringValue("nameEn", this.getNameEn());
        writer.writeStringValue("nameZh", this.getNameZh());
        writer.writeStringValue("origin", this.getOrigin());
        writer.writeObjectValue("price", this.getPrice());
        writer.writeStringValue("remark", this.getRemark());
        writer.writeStringValue("skuNumber", this.getSkuNumber());
        writer.writeStringValue("tariffCode", this.getTariffCode());
        writer.writeDoubleValue("weight", this.getWeight());
        writer.writeDoubleValue("width", this.getWidth());
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
     * Sets the elecQualificationId property value. The unique identifier of the battery&apos;s electric qualification, which indicates that the battery has a certificate of approval for global shipping.&lt;br&gt;&lt;br&gt;This value is returned in the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/battery_qualifications/methods/getBatteryQualifications&quot; target=&quot;_blank&quot;&gt;getBatteryQualifications&lt;/a&gt; method.
     * @param value Value to set for the elecQualificationId property.
     */
    public void setElecQualificationId(@jakarta.annotation.Nullable final String value) {
        this.elecQualificationId = value;
    }
    /**
     * Sets the fdcSkus property value. This array lists the FDC SKUs associated with the item. An FDC SKU is the SKU label in a forward deployment center.&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Please contact customer service before using these fields.&lt;/p&gt;&lt;/div&gt;
     * @param value Value to set for the fdcSkus property.
     */
    public void setFdcSkus(@jakarta.annotation.Nullable final java.util.List<FDCSkuRequest> value) {
        this.fdcSkus = value;
    }
    /**
     * Sets the height property value. The height of the item in centimeters.
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final Double value) {
        this.height = value;
    }
    /**
     * Sets the isLiBattery property value. This boolean indicates if the item contains a battery.
     * @param value Value to set for the isLiBattery property.
     */
    public void setIsLiBattery(@jakarta.annotation.Nullable final Boolean value) {
        this.isLiBattery = value;
    }
    /**
     * Sets the length property value. The length of the item in centimeters.
     * @param value Value to set for the length property.
     */
    public void setLength(@jakarta.annotation.Nullable final Double value) {
        this.length = value;
    }
    /**
     * Sets the liBatteryType property value. If the item contains a battery, this field indicates the type of battery the item contains. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:LiBatteryTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the liBatteryType property.
     */
    public void setLiBatteryType(@jakarta.annotation.Nullable final String value) {
        this.liBatteryType = value;
    }
    /**
     * Sets the nameEn property value. The English name of the item.
     * @param value Value to set for the nameEn property.
     */
    public void setNameEn(@jakarta.annotation.Nullable final String value) {
        this.nameEn = value;
    }
    /**
     * Sets the nameZh property value. The Chinese name of the item.
     * @param value Value to set for the nameZh property.
     */
    public void setNameZh(@jakarta.annotation.Nullable final String value) {
        this.nameZh = value;
    }
    /**
     * Sets the origin property value. The country of origin of the item.
     * @param value Value to set for the origin property.
     */
    public void setOrigin(@jakarta.annotation.Nullable final String value) {
        this.origin = value;
    }
    /**
     * Sets the price property value. This type defines the monetary value of an amount. 
     * @param value Value to set for the price property.
     */
    public void setPrice(@jakarta.annotation.Nullable final Amount value) {
        this.price = value;
    }
    /**
     * Sets the remark property value. A remark to the seller themselves.
     * @param value Value to set for the remark property.
     */
    public void setRemark(@jakarta.annotation.Nullable final String value) {
        this.remark = value;
    }
    /**
     * Sets the skuNumber property value. The stock keeping unit (SKU) identifier of the item.
     * @param value Value to set for the skuNumber property.
     */
    public void setSkuNumber(@jakarta.annotation.Nullable final String value) {
        this.skuNumber = value;
    }
    /**
     * Sets the tariffCode property value. The Harmonized System code for custom declaration. This value declares the category of the item..
     * @param value Value to set for the tariffCode property.
     */
    public void setTariffCode(@jakarta.annotation.Nullable final String value) {
        this.tariffCode = value;
    }
    /**
     * Sets the weight property value. The weight of the item in grams.
     * @param value Value to set for the weight property.
     */
    public void setWeight(@jakarta.annotation.Nullable final Double value) {
        this.weight = value;
    }
    /**
     * Sets the width property value. The width of the item in centimeters.
     * @param value Value to set for the width property.
     */
    public void setWidth(@jakarta.annotation.Nullable final Double value) {
        this.width = value;
    }
}
