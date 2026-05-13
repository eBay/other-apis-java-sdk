package com.ebay.otherapis.generated.vero.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to define the details of a VeRO reason code for a specific site.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VeroReasonCode implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The eBay site for which reason code details are returned. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/vero/types/br:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String marketplaceId;
    /**
     * This container includes both brief and detailed text descriptions for the VeRO program intellectual property right infringement reason, as well as the ID for the reason code.
     */
    private java.util.List<ReasonCodeDetailType> reasonCodeDetails;
    /**
     * Instantiates a new {@link VeroReasonCode} and sets the default values.
     */
    public VeroReasonCode() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VeroReasonCode}
     */
    @jakarta.annotation.Nonnull
    public static VeroReasonCode createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VeroReasonCode();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getStringValue()); });
        deserializerMap.put("reasonCodeDetails", (n) -> { this.setReasonCodeDetails(n.getCollectionOfObjectValues(ReasonCodeDetailType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the marketplaceId property value. The eBay site for which reason code details are returned. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/vero/types/br:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the reasonCodeDetails property value. This container includes both brief and detailed text descriptions for the VeRO program intellectual property right infringement reason, as well as the ID for the reason code.
     * @return a {@link java.util.List<ReasonCodeDetailType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ReasonCodeDetailType> getReasonCodeDetails() {
        return this.reasonCodeDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("marketplaceId", this.getMarketplaceId());
        writer.writeCollectionOfObjectValues("reasonCodeDetails", this.getReasonCodeDetails());
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
     * Sets the marketplaceId property value. The eBay site for which reason code details are returned. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/vero/types/br:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final String value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the reasonCodeDetails property value. This container includes both brief and detailed text descriptions for the VeRO program intellectual property right infringement reason, as well as the ID for the reason code.
     * @param value Value to set for the reasonCodeDetails property.
     */
    public void setReasonCodeDetails(@jakarta.annotation.Nullable final java.util.List<ReasonCodeDetailType> value) {
        this.reasonCodeDetails = value;
    }
}
