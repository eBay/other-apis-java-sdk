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
 * This type defines the actual weight, cost, and additional information of a specified package or packages.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetActualCostResponsesData implements AdditionalDataHolder, Parsable {
    /**
     * The actual weight of the package in grams.
     */
    private Double actualWeight;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container specifies the total monetary amount of the actual cost of the package. 
     */
    private Amount amount;
    /**
     * The time the seller was charged for the actual cost of the package in UTC format.
     */
    private String billingTime;
    /**
     * The two-digit charge mode for the package.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;01&lt;/code&gt;: Actual weight&lt;/li&gt;&lt;li&gt;&lt;code&gt;02&lt;/code&gt;: Additional dimension weight&lt;/li&gt;&lt;li&gt;&lt;code&gt;03&lt;/code&gt;: Charged by lite mode&lt;/li&gt;&lt;/ul&gt;
     */
    private String chargeMode;
    /**
     * The weight, in grams, charged for when shipping the package.
     */
    private Double chargeWeight;
    /**
     * The two-digit cost type of the package. This field indicates any fees associated with the package.&lt;br&gt;&lt;br&gt;The following values are the typical cost types returned through this field. If an undocumented cost type is returned, check the logistic provider&apos;s website for the latest values:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;01&lt;/code&gt;: Shipping fee&lt;/li&gt;&lt;li&gt;&lt;code&gt;02&lt;/code&gt;: Domestic&lt;/li&gt;&lt;li&gt;&lt;code&gt;03&lt;/code&gt;: Return fee&lt;/li&gt;&lt;li&gt;&lt;code&gt;04&lt;/code&gt;: Domestic burning fee&lt;/li&gt;&lt;li&gt;&lt;code&gt;05&lt;/code&gt;: Custom collected fee&lt;/li&gt;&lt;li&gt;&lt;code&gt;06&lt;/code&gt;: Weight gap fee&lt;/li&gt;&lt;li&gt;&lt;code&gt;07&lt;/code&gt;: Duplication compensation&lt;/li&gt;&lt;/ul&gt;
     */
    private String costType;
    /**
     * A seller-defined message to the buyer regarding the transaction.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     */
    private String message;
    /**
     * A remark to the seller themselves.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     */
    private String remark;
    /**
     * The result code associated with the call.&lt;br&gt;&lt;br&gt;For example, a result code of &lt;code&gt;200&lt;/code&gt; indicates that the call was a success.
     */
    private String resultCode;
    /**
     * The size of the package in centimeters. This value is returned in Length*Width*Height format.
     */
    private String size;
    /**
     * The tracking number associated with the package.
     */
    private String trackingNumber;
    /**
     * Instantiates a new {@link GetActualCostResponsesData} and sets the default values.
     */
    public GetActualCostResponsesData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetActualCostResponsesData}
     */
    @jakarta.annotation.Nonnull
    public static GetActualCostResponsesData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetActualCostResponsesData();
    }
    /**
     * Gets the actualWeight property value. The actual weight of the package in grams.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getActualWeight() {
        return this.actualWeight;
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
     * Gets the amount property value. This container specifies the total monetary amount of the actual cost of the package. 
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmount() {
        return this.amount;
    }
    /**
     * Gets the billingTime property value. The time the seller was charged for the actual cost of the package in UTC format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBillingTime() {
        return this.billingTime;
    }
    /**
     * Gets the chargeMode property value. The two-digit charge mode for the package.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;01&lt;/code&gt;: Actual weight&lt;/li&gt;&lt;li&gt;&lt;code&gt;02&lt;/code&gt;: Additional dimension weight&lt;/li&gt;&lt;li&gt;&lt;code&gt;03&lt;/code&gt;: Charged by lite mode&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChargeMode() {
        return this.chargeMode;
    }
    /**
     * Gets the chargeWeight property value. The weight, in grams, charged for when shipping the package.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getChargeWeight() {
        return this.chargeWeight;
    }
    /**
     * Gets the costType property value. The two-digit cost type of the package. This field indicates any fees associated with the package.&lt;br&gt;&lt;br&gt;The following values are the typical cost types returned through this field. If an undocumented cost type is returned, check the logistic provider&apos;s website for the latest values:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;01&lt;/code&gt;: Shipping fee&lt;/li&gt;&lt;li&gt;&lt;code&gt;02&lt;/code&gt;: Domestic&lt;/li&gt;&lt;li&gt;&lt;code&gt;03&lt;/code&gt;: Return fee&lt;/li&gt;&lt;li&gt;&lt;code&gt;04&lt;/code&gt;: Domestic burning fee&lt;/li&gt;&lt;li&gt;&lt;code&gt;05&lt;/code&gt;: Custom collected fee&lt;/li&gt;&lt;li&gt;&lt;code&gt;06&lt;/code&gt;: Weight gap fee&lt;/li&gt;&lt;li&gt;&lt;code&gt;07&lt;/code&gt;: Duplication compensation&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCostType() {
        return this.costType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("actualWeight", (n) -> { this.setActualWeight(n.getDoubleValue()); });
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("billingTime", (n) -> { this.setBillingTime(n.getStringValue()); });
        deserializerMap.put("chargeMode", (n) -> { this.setChargeMode(n.getStringValue()); });
        deserializerMap.put("chargeWeight", (n) -> { this.setChargeWeight(n.getDoubleValue()); });
        deserializerMap.put("costType", (n) -> { this.setCostType(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("remark", (n) -> { this.setRemark(n.getStringValue()); });
        deserializerMap.put("resultCode", (n) -> { this.setResultCode(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getStringValue()); });
        deserializerMap.put("trackingNumber", (n) -> { this.setTrackingNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. A seller-defined message to the buyer regarding the transaction.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
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
     * Gets the resultCode property value. The result code associated with the call.&lt;br&gt;&lt;br&gt;For example, a result code of &lt;code&gt;200&lt;/code&gt; indicates that the call was a success.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResultCode() {
        return this.resultCode;
    }
    /**
     * Gets the size property value. The size of the package in centimeters. This value is returned in Length*Width*Height format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSize() {
        return this.size;
    }
    /**
     * Gets the trackingNumber property value. The tracking number associated with the package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTrackingNumber() {
        return this.trackingNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("actualWeight", this.getActualWeight());
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeStringValue("billingTime", this.getBillingTime());
        writer.writeStringValue("chargeMode", this.getChargeMode());
        writer.writeDoubleValue("chargeWeight", this.getChargeWeight());
        writer.writeStringValue("costType", this.getCostType());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("remark", this.getRemark());
        writer.writeStringValue("resultCode", this.getResultCode());
        writer.writeStringValue("size", this.getSize());
        writer.writeStringValue("trackingNumber", this.getTrackingNumber());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actualWeight property value. The actual weight of the package in grams.
     * @param value Value to set for the actualWeight property.
     */
    public void setActualWeight(@jakarta.annotation.Nullable final Double value) {
        this.actualWeight = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the amount property value. This container specifies the total monetary amount of the actual cost of the package. 
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the billingTime property value. The time the seller was charged for the actual cost of the package in UTC format.
     * @param value Value to set for the billingTime property.
     */
    public void setBillingTime(@jakarta.annotation.Nullable final String value) {
        this.billingTime = value;
    }
    /**
     * Sets the chargeMode property value. The two-digit charge mode for the package.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;01&lt;/code&gt;: Actual weight&lt;/li&gt;&lt;li&gt;&lt;code&gt;02&lt;/code&gt;: Additional dimension weight&lt;/li&gt;&lt;li&gt;&lt;code&gt;03&lt;/code&gt;: Charged by lite mode&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the chargeMode property.
     */
    public void setChargeMode(@jakarta.annotation.Nullable final String value) {
        this.chargeMode = value;
    }
    /**
     * Sets the chargeWeight property value. The weight, in grams, charged for when shipping the package.
     * @param value Value to set for the chargeWeight property.
     */
    public void setChargeWeight(@jakarta.annotation.Nullable final Double value) {
        this.chargeWeight = value;
    }
    /**
     * Sets the costType property value. The two-digit cost type of the package. This field indicates any fees associated with the package.&lt;br&gt;&lt;br&gt;The following values are the typical cost types returned through this field. If an undocumented cost type is returned, check the logistic provider&apos;s website for the latest values:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;01&lt;/code&gt;: Shipping fee&lt;/li&gt;&lt;li&gt;&lt;code&gt;02&lt;/code&gt;: Domestic&lt;/li&gt;&lt;li&gt;&lt;code&gt;03&lt;/code&gt;: Return fee&lt;/li&gt;&lt;li&gt;&lt;code&gt;04&lt;/code&gt;: Domestic burning fee&lt;/li&gt;&lt;li&gt;&lt;code&gt;05&lt;/code&gt;: Custom collected fee&lt;/li&gt;&lt;li&gt;&lt;code&gt;06&lt;/code&gt;: Weight gap fee&lt;/li&gt;&lt;li&gt;&lt;code&gt;07&lt;/code&gt;: Duplication compensation&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the costType property.
     */
    public void setCostType(@jakarta.annotation.Nullable final String value) {
        this.costType = value;
    }
    /**
     * Sets the message property value. A seller-defined message to the buyer regarding the transaction.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the remark property value. A remark to the seller themselves.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @param value Value to set for the remark property.
     */
    public void setRemark(@jakarta.annotation.Nullable final String value) {
        this.remark = value;
    }
    /**
     * Sets the resultCode property value. The result code associated with the call.&lt;br&gt;&lt;br&gt;For example, a result code of &lt;code&gt;200&lt;/code&gt; indicates that the call was a success.
     * @param value Value to set for the resultCode property.
     */
    public void setResultCode(@jakarta.annotation.Nullable final String value) {
        this.resultCode = value;
    }
    /**
     * Sets the size property value. The size of the package in centimeters. This value is returned in Length*Width*Height format.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final String value) {
        this.size = value;
    }
    /**
     * Sets the trackingNumber property value. The tracking number associated with the package.
     * @param value Value to set for the trackingNumber property.
     */
    public void setTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.trackingNumber = value;
    }
}
