package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the special service details available for a package.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SpecialServiceDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The insurance fee, if applicable, on the package.&lt;br&gt;&lt;br&gt;The insurance amount and currency are consistent with the currency of the destination country
     */
    private String insuranceFee;
    /**
     * The package type.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PAK&lt;/code&gt; (limited weight  2.5KG)&lt;/li&gt;&lt;li&gt;&lt;code&gt;PACKAGE&lt;/code&gt; (limited weight 68KG)&lt;/li&gt;&lt;/ul&gt;
     */
    private String packagingType;
    /**
     * The signature type, if applicable, for the package.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ISR&lt;/code&gt; (Indirect Signature Required)&lt;/li&gt;&lt;li&gt;&lt;code&gt;DSR&lt;/code&gt; (Direct Signature Required)&lt;/li&gt;&lt;li&gt;&lt;code&gt;ASR&lt;/code&gt; (Adult Signature Required)&lt;/li&gt;&lt;/ul&gt;
     */
    private String signatureType;
    /**
     * Any special service types supported for the package.&lt;br&gt;&lt;br&gt; For example, &lt;code&gt;SATURDAY_DELIVERY&lt;/code&gt; indicates that the item is eligible for Saturday delivery.
     */
    private java.util.List<String> specialServiceTypes;
    /**
     * Instantiates a new {@link SpecialServiceDetail} and sets the default values.
     */
    public SpecialServiceDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SpecialServiceDetail}
     */
    @jakarta.annotation.Nonnull
    public static SpecialServiceDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SpecialServiceDetail();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("insuranceFee", (n) -> { this.setInsuranceFee(n.getStringValue()); });
        deserializerMap.put("packagingType", (n) -> { this.setPackagingType(n.getStringValue()); });
        deserializerMap.put("signatureType", (n) -> { this.setSignatureType(n.getStringValue()); });
        deserializerMap.put("specialServiceTypes", (n) -> { this.setSpecialServiceTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the insuranceFee property value. The insurance fee, if applicable, on the package.&lt;br&gt;&lt;br&gt;The insurance amount and currency are consistent with the currency of the destination country
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInsuranceFee() {
        return this.insuranceFee;
    }
    /**
     * Gets the packagingType property value. The package type.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PAK&lt;/code&gt; (limited weight  2.5KG)&lt;/li&gt;&lt;li&gt;&lt;code&gt;PACKAGE&lt;/code&gt; (limited weight 68KG)&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackagingType() {
        return this.packagingType;
    }
    /**
     * Gets the signatureType property value. The signature type, if applicable, for the package.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ISR&lt;/code&gt; (Indirect Signature Required)&lt;/li&gt;&lt;li&gt;&lt;code&gt;DSR&lt;/code&gt; (Direct Signature Required)&lt;/li&gt;&lt;li&gt;&lt;code&gt;ASR&lt;/code&gt; (Adult Signature Required)&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignatureType() {
        return this.signatureType;
    }
    /**
     * Gets the specialServiceTypes property value. Any special service types supported for the package.&lt;br&gt;&lt;br&gt; For example, &lt;code&gt;SATURDAY_DELIVERY&lt;/code&gt; indicates that the item is eligible for Saturday delivery.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSpecialServiceTypes() {
        return this.specialServiceTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("insuranceFee", this.getInsuranceFee());
        writer.writeStringValue("packagingType", this.getPackagingType());
        writer.writeStringValue("signatureType", this.getSignatureType());
        writer.writeCollectionOfPrimitiveValues("specialServiceTypes", this.getSpecialServiceTypes());
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
     * Sets the insuranceFee property value. The insurance fee, if applicable, on the package.&lt;br&gt;&lt;br&gt;The insurance amount and currency are consistent with the currency of the destination country
     * @param value Value to set for the insuranceFee property.
     */
    public void setInsuranceFee(@jakarta.annotation.Nullable final String value) {
        this.insuranceFee = value;
    }
    /**
     * Sets the packagingType property value. The package type.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PAK&lt;/code&gt; (limited weight  2.5KG)&lt;/li&gt;&lt;li&gt;&lt;code&gt;PACKAGE&lt;/code&gt; (limited weight 68KG)&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the packagingType property.
     */
    public void setPackagingType(@jakarta.annotation.Nullable final String value) {
        this.packagingType = value;
    }
    /**
     * Sets the signatureType property value. The signature type, if applicable, for the package.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ISR&lt;/code&gt; (Indirect Signature Required)&lt;/li&gt;&lt;li&gt;&lt;code&gt;DSR&lt;/code&gt; (Direct Signature Required)&lt;/li&gt;&lt;li&gt;&lt;code&gt;ASR&lt;/code&gt; (Adult Signature Required)&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the signatureType property.
     */
    public void setSignatureType(@jakarta.annotation.Nullable final String value) {
        this.signatureType = value;
    }
    /**
     * Sets the specialServiceTypes property value. Any special service types supported for the package.&lt;br&gt;&lt;br&gt; For example, &lt;code&gt;SATURDAY_DELIVERY&lt;/code&gt; indicates that the item is eligible for Saturday delivery.
     * @param value Value to set for the specialServiceTypes property.
     */
    public void setSpecialServiceTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.specialServiceTypes = value;
    }
}
