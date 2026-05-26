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
 * This type defines item information for items in a package.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemResponses implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The buyer&apos;s eBay ID.
     */
    private String buyerId;
    /**
     * The buyer&apos;s tax ID.
     */
    private String buyerTaxId;
    /**
     * The buyer&apos;s tax type.
     */
    private String buyerTaxType;
    /**
     * If returned as &lt;code&gt;true&lt;/code&gt;, this boolean indicates that eBay will collect tax for the corresponding line item, and remit the tax to the taxing authority of the buyer&apos;s residence. 
     */
    private Boolean ebayCollectAndRemitTax;
    /**
     * The value of the collect and remit tax for the corresponding line item. This field is only returned if collect and remit tax is applied to the line item. 
     */
    private String ebayCollectAndRemitTaxesValue;
    /**
     * The buyer&apos;s eBay email address.
     */
    private String email;
    /**
     * The seller created title of the item.
     */
    private String itemTitle;
    /**
     * The unique identifier of the eBay listing associated with the item.
     */
    private String listingId;
    /**
     * The buyer&apos;s eBay message.
     */
    private String message;
    /**
     * The unique identifier of the eBay order that the line item belongs to.
     */
    private String orderId;
    /**
     * The unique identifier of an eBay order line item.
     */
    private String orderLineItem;
    /**
     * The date and time that the payment was received by the seller. This timestamp is returned in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock.
     */
    private String paymentDate;
    /**
     * The buyer&apos;s PayPal email address.
     */
    private String payPalEmail;
    /**
     * The buyer&apos;s PayPal message
     */
    private String payPalMessage;
    /**
     * The quantity of the line item shipped with the package.
     */
    private Integer postedQuantity;
    /**
     * The unique identifier of the eBay site in which the order occurred.
     */
    private Integer siteId;
    /**
     * This type specifies information relating to the SKU item in a package.
     */
    private SkuRequest sku;
    /**
     * The date the item was sold.
     */
    private String soldDate;
    /**
     * This type defines the monetary value of an amount. 
     */
    private Amount soldPrice;
    /**
     * The quantity of the line item that was sold.
     */
    private Integer soldQuantity;
    /**
     * The unique identifier of the eBay transaction.
     */
    private String transactionId;
    /**
     * Instantiates a new {@link ItemResponses} and sets the default values.
     */
    public ItemResponses() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemResponses}
     */
    @jakarta.annotation.Nonnull
    public static ItemResponses createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemResponses();
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
     * Gets the buyerId property value. The buyer&apos;s eBay ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuyerId() {
        return this.buyerId;
    }
    /**
     * Gets the buyerTaxId property value. The buyer&apos;s tax ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuyerTaxId() {
        return this.buyerTaxId;
    }
    /**
     * Gets the buyerTaxType property value. The buyer&apos;s tax type.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuyerTaxType() {
        return this.buyerTaxType;
    }
    /**
     * Gets the ebayCollectAndRemitTax property value. If returned as &lt;code&gt;true&lt;/code&gt;, this boolean indicates that eBay will collect tax for the corresponding line item, and remit the tax to the taxing authority of the buyer&apos;s residence. 
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEbayCollectAndRemitTax() {
        return this.ebayCollectAndRemitTax;
    }
    /**
     * Gets the ebayCollectAndRemitTaxesValue property value. The value of the collect and remit tax for the corresponding line item. This field is only returned if collect and remit tax is applied to the line item. 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEbayCollectAndRemitTaxesValue() {
        return this.ebayCollectAndRemitTaxesValue;
    }
    /**
     * Gets the email property value. The buyer&apos;s eBay email address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(21);
        deserializerMap.put("buyerId", (n) -> { this.setBuyerId(n.getStringValue()); });
        deserializerMap.put("buyerTaxId", (n) -> { this.setBuyerTaxId(n.getStringValue()); });
        deserializerMap.put("buyerTaxType", (n) -> { this.setBuyerTaxType(n.getStringValue()); });
        deserializerMap.put("ebayCollectAndRemitTax", (n) -> { this.setEbayCollectAndRemitTax(n.getBooleanValue()); });
        deserializerMap.put("ebayCollectAndRemitTaxesValue", (n) -> { this.setEbayCollectAndRemitTaxesValue(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("itemTitle", (n) -> { this.setItemTitle(n.getStringValue()); });
        deserializerMap.put("listingId", (n) -> { this.setListingId(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("orderId", (n) -> { this.setOrderId(n.getStringValue()); });
        deserializerMap.put("orderLineItem", (n) -> { this.setOrderLineItem(n.getStringValue()); });
        deserializerMap.put("paymentDate", (n) -> { this.setPaymentDate(n.getStringValue()); });
        deserializerMap.put("payPalEmail", (n) -> { this.setPayPalEmail(n.getStringValue()); });
        deserializerMap.put("payPalMessage", (n) -> { this.setPayPalMessage(n.getStringValue()); });
        deserializerMap.put("postedQuantity", (n) -> { this.setPostedQuantity(n.getIntegerValue()); });
        deserializerMap.put("siteId", (n) -> { this.setSiteId(n.getIntegerValue()); });
        deserializerMap.put("sku", (n) -> { this.setSku(n.getObjectValue(SkuRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("soldDate", (n) -> { this.setSoldDate(n.getStringValue()); });
        deserializerMap.put("soldPrice", (n) -> { this.setSoldPrice(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("soldQuantity", (n) -> { this.setSoldQuantity(n.getIntegerValue()); });
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the itemTitle property value. The seller created title of the item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getItemTitle() {
        return this.itemTitle;
    }
    /**
     * Gets the listingId property value. The unique identifier of the eBay listing associated with the item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingId() {
        return this.listingId;
    }
    /**
     * Gets the message property value. The buyer&apos;s eBay message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the orderId property value. The unique identifier of the eBay order that the line item belongs to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Gets the orderLineItem property value. The unique identifier of an eBay order line item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderLineItem() {
        return this.orderLineItem;
    }
    /**
     * Gets the paymentDate property value. The date and time that the payment was received by the seller. This timestamp is returned in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentDate() {
        return this.paymentDate;
    }
    /**
     * Gets the payPalEmail property value. The buyer&apos;s PayPal email address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayPalEmail() {
        return this.payPalEmail;
    }
    /**
     * Gets the payPalMessage property value. The buyer&apos;s PayPal message
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayPalMessage() {
        return this.payPalMessage;
    }
    /**
     * Gets the postedQuantity property value. The quantity of the line item shipped with the package.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPostedQuantity() {
        return this.postedQuantity;
    }
    /**
     * Gets the siteId property value. The unique identifier of the eBay site in which the order occurred.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSiteId() {
        return this.siteId;
    }
    /**
     * Gets the sku property value. This type specifies information relating to the SKU item in a package.
     * @return a {@link SkuRequest}
     */
    @jakarta.annotation.Nullable
    public SkuRequest getSku() {
        return this.sku;
    }
    /**
     * Gets the soldDate property value. The date the item was sold.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSoldDate() {
        return this.soldDate;
    }
    /**
     * Gets the soldPrice property value. This type defines the monetary value of an amount. 
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getSoldPrice() {
        return this.soldPrice;
    }
    /**
     * Gets the soldQuantity property value. The quantity of the line item that was sold.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSoldQuantity() {
        return this.soldQuantity;
    }
    /**
     * Gets the transactionId property value. The unique identifier of the eBay transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionId() {
        return this.transactionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("buyerId", this.getBuyerId());
        writer.writeStringValue("buyerTaxId", this.getBuyerTaxId());
        writer.writeStringValue("buyerTaxType", this.getBuyerTaxType());
        writer.writeBooleanValue("ebayCollectAndRemitTax", this.getEbayCollectAndRemitTax());
        writer.writeStringValue("ebayCollectAndRemitTaxesValue", this.getEbayCollectAndRemitTaxesValue());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("itemTitle", this.getItemTitle());
        writer.writeStringValue("listingId", this.getListingId());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("orderId", this.getOrderId());
        writer.writeStringValue("orderLineItem", this.getOrderLineItem());
        writer.writeStringValue("paymentDate", this.getPaymentDate());
        writer.writeStringValue("payPalEmail", this.getPayPalEmail());
        writer.writeStringValue("payPalMessage", this.getPayPalMessage());
        writer.writeIntegerValue("postedQuantity", this.getPostedQuantity());
        writer.writeIntegerValue("siteId", this.getSiteId());
        writer.writeObjectValue("sku", this.getSku());
        writer.writeStringValue("soldDate", this.getSoldDate());
        writer.writeObjectValue("soldPrice", this.getSoldPrice());
        writer.writeIntegerValue("soldQuantity", this.getSoldQuantity());
        writer.writeStringValue("transactionId", this.getTransactionId());
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
     * Sets the buyerId property value. The buyer&apos;s eBay ID.
     * @param value Value to set for the buyerId property.
     */
    public void setBuyerId(@jakarta.annotation.Nullable final String value) {
        this.buyerId = value;
    }
    /**
     * Sets the buyerTaxId property value. The buyer&apos;s tax ID.
     * @param value Value to set for the buyerTaxId property.
     */
    public void setBuyerTaxId(@jakarta.annotation.Nullable final String value) {
        this.buyerTaxId = value;
    }
    /**
     * Sets the buyerTaxType property value. The buyer&apos;s tax type.
     * @param value Value to set for the buyerTaxType property.
     */
    public void setBuyerTaxType(@jakarta.annotation.Nullable final String value) {
        this.buyerTaxType = value;
    }
    /**
     * Sets the ebayCollectAndRemitTax property value. If returned as &lt;code&gt;true&lt;/code&gt;, this boolean indicates that eBay will collect tax for the corresponding line item, and remit the tax to the taxing authority of the buyer&apos;s residence. 
     * @param value Value to set for the ebayCollectAndRemitTax property.
     */
    public void setEbayCollectAndRemitTax(@jakarta.annotation.Nullable final Boolean value) {
        this.ebayCollectAndRemitTax = value;
    }
    /**
     * Sets the ebayCollectAndRemitTaxesValue property value. The value of the collect and remit tax for the corresponding line item. This field is only returned if collect and remit tax is applied to the line item. 
     * @param value Value to set for the ebayCollectAndRemitTaxesValue property.
     */
    public void setEbayCollectAndRemitTaxesValue(@jakarta.annotation.Nullable final String value) {
        this.ebayCollectAndRemitTaxesValue = value;
    }
    /**
     * Sets the email property value. The buyer&apos;s eBay email address.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the itemTitle property value. The seller created title of the item.
     * @param value Value to set for the itemTitle property.
     */
    public void setItemTitle(@jakarta.annotation.Nullable final String value) {
        this.itemTitle = value;
    }
    /**
     * Sets the listingId property value. The unique identifier of the eBay listing associated with the item.
     * @param value Value to set for the listingId property.
     */
    public void setListingId(@jakarta.annotation.Nullable final String value) {
        this.listingId = value;
    }
    /**
     * Sets the message property value. The buyer&apos;s eBay message.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the orderId property value. The unique identifier of the eBay order that the line item belongs to.
     * @param value Value to set for the orderId property.
     */
    public void setOrderId(@jakarta.annotation.Nullable final String value) {
        this.orderId = value;
    }
    /**
     * Sets the orderLineItem property value. The unique identifier of an eBay order line item.
     * @param value Value to set for the orderLineItem property.
     */
    public void setOrderLineItem(@jakarta.annotation.Nullable final String value) {
        this.orderLineItem = value;
    }
    /**
     * Sets the paymentDate property value. The date and time that the payment was received by the seller. This timestamp is returned in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock.
     * @param value Value to set for the paymentDate property.
     */
    public void setPaymentDate(@jakarta.annotation.Nullable final String value) {
        this.paymentDate = value;
    }
    /**
     * Sets the payPalEmail property value. The buyer&apos;s PayPal email address.
     * @param value Value to set for the payPalEmail property.
     */
    public void setPayPalEmail(@jakarta.annotation.Nullable final String value) {
        this.payPalEmail = value;
    }
    /**
     * Sets the payPalMessage property value. The buyer&apos;s PayPal message
     * @param value Value to set for the payPalMessage property.
     */
    public void setPayPalMessage(@jakarta.annotation.Nullable final String value) {
        this.payPalMessage = value;
    }
    /**
     * Sets the postedQuantity property value. The quantity of the line item shipped with the package.
     * @param value Value to set for the postedQuantity property.
     */
    public void setPostedQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.postedQuantity = value;
    }
    /**
     * Sets the siteId property value. The unique identifier of the eBay site in which the order occurred.
     * @param value Value to set for the siteId property.
     */
    public void setSiteId(@jakarta.annotation.Nullable final Integer value) {
        this.siteId = value;
    }
    /**
     * Sets the sku property value. This type specifies information relating to the SKU item in a package.
     * @param value Value to set for the sku property.
     */
    public void setSku(@jakarta.annotation.Nullable final SkuRequest value) {
        this.sku = value;
    }
    /**
     * Sets the soldDate property value. The date the item was sold.
     * @param value Value to set for the soldDate property.
     */
    public void setSoldDate(@jakarta.annotation.Nullable final String value) {
        this.soldDate = value;
    }
    /**
     * Sets the soldPrice property value. This type defines the monetary value of an amount. 
     * @param value Value to set for the soldPrice property.
     */
    public void setSoldPrice(@jakarta.annotation.Nullable final Amount value) {
        this.soldPrice = value;
    }
    /**
     * Sets the soldQuantity property value. The quantity of the line item that was sold.
     * @param value Value to set for the soldQuantity property.
     */
    public void setSoldQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.soldQuantity = value;
    }
    /**
     * Sets the transactionId property value. The unique identifier of the eBay transaction.
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final String value) {
        this.transactionId = value;
    }
}
