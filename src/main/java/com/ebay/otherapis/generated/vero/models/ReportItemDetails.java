package com.ebay.otherapis.generated.vero.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the details of an item being reported for violating a product owner&apos;s copyright, trademark, or intellectual property rights.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportItemDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The brand name of the item being reported for VeRO violation.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 50 characters
     */
    private String brand;
    /**
     * If the VeRO Program member wants a copy of the Notice of Claimed Infringement (NOCI) document sent to their email address, this field should be included in the request and set to &lt;code&gt;true&lt;/code&gt;. This same document is automatically sent to the seller of the reported item.&lt;br&gt;&lt;br&gt;As this field defaults to &lt;code&gt;true&lt;/b&gt;, the report will be automatically emailed if this field is omitted.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; true
     */
    private Boolean copyEmailToRightsOwner;
    /**
     * If the infringement type stated in the &lt;b&gt;VeroReasonCodeId&lt;/b&gt; has anything to do with which country the item is being shipped to, each country that would trigger this infringement type should be specified in this comma-delimited array.&lt;br&gt;&lt;br&gt;This field is required when the &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;9037&lt;/code&gt; (Item(s) is unlawful importation of product bearing trademark).
     */
    private java.util.List<String> countries;
    /**
     * This field is used to provide further information about the VeRO reason code.&lt;br&gt;&lt;br&gt;This field is required when the &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;9052&lt;/code&gt; or &lt;code&gt;7052&lt;/code&gt; (Other - Provide details information in additional information box below).&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     */
    private String detailedMessage;
    /**
     * The unique identifier of the listing being reported for the alleged infringement.
     */
    private String itemId;
    /**
     * This field is used by the VeRO Program member to provide more details to the seller as to why the item is being reported for the alleged infringement.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     */
    private String messageToSeller;
    /**
     * This field is used to specify the number of a product patent that is being violated.&lt;br&gt;&lt;br&gt;This field is required when the &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;9048&lt;/code&gt; (Item(s) infringes a valid patent).&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 15 characters
     */
    private String patent;
    /**
     * If the infringement type stated in the &lt;b&gt;veroReasonCodeId&lt;/b&gt; has anything to do with which geographical region the item is being shipped to, each region that would trigger this infringement type should be specified in this comma-delimited array.
     */
    private java.util.List<String> regions;
    /**
     * The unique identifier for the type of claimed infringement.&lt;br&gt;&lt;br&gt;Use &lt;a href=&quot;/api-docs/commerce/vero/resources/vero_reason_code/methods/getVeroReasonCodes&quot; target=&quot;_blank &quot;&gt;getVeroReasonCodes&lt;/a&gt; to retrieve a list of valid reason codes for a given eBay site.
     */
    private String veroReasonCodeId;
    /**
     * Instantiates a new {@link ReportItemDetails} and sets the default values.
     */
    public ReportItemDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReportItemDetails}
     */
    @jakarta.annotation.Nonnull
    public static ReportItemDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportItemDetails();
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
     * Gets the brand property value. The brand name of the item being reported for VeRO violation.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 50 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrand() {
        return this.brand;
    }
    /**
     * Gets the copyEmailToRightsOwner property value. If the VeRO Program member wants a copy of the Notice of Claimed Infringement (NOCI) document sent to their email address, this field should be included in the request and set to &lt;code&gt;true&lt;/code&gt;. This same document is automatically sent to the seller of the reported item.&lt;br&gt;&lt;br&gt;As this field defaults to &lt;code&gt;true&lt;/b&gt;, the report will be automatically emailed if this field is omitted.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; true
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCopyEmailToRightsOwner() {
        return this.copyEmailToRightsOwner;
    }
    /**
     * Gets the countries property value. If the infringement type stated in the &lt;b&gt;VeroReasonCodeId&lt;/b&gt; has anything to do with which country the item is being shipped to, each country that would trigger this infringement type should be specified in this comma-delimited array.&lt;br&gt;&lt;br&gt;This field is required when the &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;9037&lt;/code&gt; (Item(s) is unlawful importation of product bearing trademark).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCountries() {
        return this.countries;
    }
    /**
     * Gets the detailedMessage property value. This field is used to provide further information about the VeRO reason code.&lt;br&gt;&lt;br&gt;This field is required when the &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;9052&lt;/code&gt; or &lt;code&gt;7052&lt;/code&gt; (Other - Provide details information in additional information box below).&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetailedMessage() {
        return this.detailedMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("brand", (n) -> { this.setBrand(n.getStringValue()); });
        deserializerMap.put("copyEmailToRightsOwner", (n) -> { this.setCopyEmailToRightsOwner(n.getBooleanValue()); });
        deserializerMap.put("countries", (n) -> { this.setCountries(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("detailedMessage", (n) -> { this.setDetailedMessage(n.getStringValue()); });
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getStringValue()); });
        deserializerMap.put("messageToSeller", (n) -> { this.setMessageToSeller(n.getStringValue()); });
        deserializerMap.put("patent", (n) -> { this.setPatent(n.getStringValue()); });
        deserializerMap.put("regions", (n) -> { this.setRegions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("veroReasonCodeId", (n) -> { this.setVeroReasonCodeId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the itemId property value. The unique identifier of the listing being reported for the alleged infringement.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getItemId() {
        return this.itemId;
    }
    /**
     * Gets the messageToSeller property value. This field is used by the VeRO Program member to provide more details to the seller as to why the item is being reported for the alleged infringement.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessageToSeller() {
        return this.messageToSeller;
    }
    /**
     * Gets the patent property value. This field is used to specify the number of a product patent that is being violated.&lt;br&gt;&lt;br&gt;This field is required when the &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;9048&lt;/code&gt; (Item(s) infringes a valid patent).&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 15 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPatent() {
        return this.patent;
    }
    /**
     * Gets the regions property value. If the infringement type stated in the &lt;b&gt;veroReasonCodeId&lt;/b&gt; has anything to do with which geographical region the item is being shipped to, each region that would trigger this infringement type should be specified in this comma-delimited array.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRegions() {
        return this.regions;
    }
    /**
     * Gets the veroReasonCodeId property value. The unique identifier for the type of claimed infringement.&lt;br&gt;&lt;br&gt;Use &lt;a href=&quot;/api-docs/commerce/vero/resources/vero_reason_code/methods/getVeroReasonCodes&quot; target=&quot;_blank &quot;&gt;getVeroReasonCodes&lt;/a&gt; to retrieve a list of valid reason codes for a given eBay site.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVeroReasonCodeId() {
        return this.veroReasonCodeId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("brand", this.getBrand());
        writer.writeBooleanValue("copyEmailToRightsOwner", this.getCopyEmailToRightsOwner());
        writer.writeCollectionOfPrimitiveValues("countries", this.getCountries());
        writer.writeStringValue("detailedMessage", this.getDetailedMessage());
        writer.writeStringValue("itemId", this.getItemId());
        writer.writeStringValue("messageToSeller", this.getMessageToSeller());
        writer.writeStringValue("patent", this.getPatent());
        writer.writeCollectionOfPrimitiveValues("regions", this.getRegions());
        writer.writeStringValue("veroReasonCodeId", this.getVeroReasonCodeId());
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
     * Sets the brand property value. The brand name of the item being reported for VeRO violation.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 50 characters
     * @param value Value to set for the brand property.
     */
    public void setBrand(@jakarta.annotation.Nullable final String value) {
        this.brand = value;
    }
    /**
     * Sets the copyEmailToRightsOwner property value. If the VeRO Program member wants a copy of the Notice of Claimed Infringement (NOCI) document sent to their email address, this field should be included in the request and set to &lt;code&gt;true&lt;/code&gt;. This same document is automatically sent to the seller of the reported item.&lt;br&gt;&lt;br&gt;As this field defaults to &lt;code&gt;true&lt;/b&gt;, the report will be automatically emailed if this field is omitted.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; true
     * @param value Value to set for the copyEmailToRightsOwner property.
     */
    public void setCopyEmailToRightsOwner(@jakarta.annotation.Nullable final Boolean value) {
        this.copyEmailToRightsOwner = value;
    }
    /**
     * Sets the countries property value. If the infringement type stated in the &lt;b&gt;VeroReasonCodeId&lt;/b&gt; has anything to do with which country the item is being shipped to, each country that would trigger this infringement type should be specified in this comma-delimited array.&lt;br&gt;&lt;br&gt;This field is required when the &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;9037&lt;/code&gt; (Item(s) is unlawful importation of product bearing trademark).
     * @param value Value to set for the countries property.
     */
    public void setCountries(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.countries = value;
    }
    /**
     * Sets the detailedMessage property value. This field is used to provide further information about the VeRO reason code.&lt;br&gt;&lt;br&gt;This field is required when the &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;9052&lt;/code&gt; or &lt;code&gt;7052&lt;/code&gt; (Other - Provide details information in additional information box below).&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     * @param value Value to set for the detailedMessage property.
     */
    public void setDetailedMessage(@jakarta.annotation.Nullable final String value) {
        this.detailedMessage = value;
    }
    /**
     * Sets the itemId property value. The unique identifier of the listing being reported for the alleged infringement.
     * @param value Value to set for the itemId property.
     */
    public void setItemId(@jakarta.annotation.Nullable final String value) {
        this.itemId = value;
    }
    /**
     * Sets the messageToSeller property value. This field is used by the VeRO Program member to provide more details to the seller as to why the item is being reported for the alleged infringement.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     * @param value Value to set for the messageToSeller property.
     */
    public void setMessageToSeller(@jakarta.annotation.Nullable final String value) {
        this.messageToSeller = value;
    }
    /**
     * Sets the patent property value. This field is used to specify the number of a product patent that is being violated.&lt;br&gt;&lt;br&gt;This field is required when the &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;9048&lt;/code&gt; (Item(s) infringes a valid patent).&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 15 characters
     * @param value Value to set for the patent property.
     */
    public void setPatent(@jakarta.annotation.Nullable final String value) {
        this.patent = value;
    }
    /**
     * Sets the regions property value. If the infringement type stated in the &lt;b&gt;veroReasonCodeId&lt;/b&gt; has anything to do with which geographical region the item is being shipped to, each region that would trigger this infringement type should be specified in this comma-delimited array.
     * @param value Value to set for the regions property.
     */
    public void setRegions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.regions = value;
    }
    /**
     * Sets the veroReasonCodeId property value. The unique identifier for the type of claimed infringement.&lt;br&gt;&lt;br&gt;Use &lt;a href=&quot;/api-docs/commerce/vero/resources/vero_reason_code/methods/getVeroReasonCodes&quot; target=&quot;_blank &quot;&gt;getVeroReasonCodes&lt;/a&gt; to retrieve a list of valid reason codes for a given eBay site.
     * @param value Value to set for the veroReasonCodeId property.
     */
    public void setVeroReasonCodeId(@jakarta.annotation.Nullable final String value) {
        this.veroReasonCodeId = value;
    }
}
