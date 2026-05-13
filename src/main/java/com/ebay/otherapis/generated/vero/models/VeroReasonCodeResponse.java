package com.ebay.otherapis.generated.vero.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VeroReasonCodeResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The eBay site for which reason code details are returned. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/vero/types/br:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String marketplaceId;
    /**
     * This type defines the brief and detailed description of a VeRO infringement, as well as the ID associated with the infringement.
     */
    private ReasonCodeDetailType reasonCodeDetails;
    /**
     * Instantiates a new {@link VeroReasonCodeResponse} and sets the default values.
     */
    public VeroReasonCodeResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VeroReasonCodeResponse}
     */
    @jakarta.annotation.Nonnull
    public static VeroReasonCodeResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VeroReasonCodeResponse();
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
        deserializerMap.put("reasonCodeDetails", (n) -> { this.setReasonCodeDetails(n.getObjectValue(ReasonCodeDetailType::createFromDiscriminatorValue)); });
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
     * Gets the reasonCodeDetails property value. This type defines the brief and detailed description of a VeRO infringement, as well as the ID associated with the infringement.
     * @return a {@link ReasonCodeDetailType}
     */
    @jakarta.annotation.Nullable
    public ReasonCodeDetailType getReasonCodeDetails() {
        return this.reasonCodeDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("marketplaceId", this.getMarketplaceId());
        writer.writeObjectValue("reasonCodeDetails", this.getReasonCodeDetails());
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
     * Sets the reasonCodeDetails property value. This type defines the brief and detailed description of a VeRO infringement, as well as the ID associated with the infringement.
     * @param value Value to set for the reasonCodeDetails property.
     */
    public void setReasonCodeDetails(@jakarta.annotation.Nullable final ReasonCodeDetailType value) {
        this.reasonCodeDetails = value;
    }
}
