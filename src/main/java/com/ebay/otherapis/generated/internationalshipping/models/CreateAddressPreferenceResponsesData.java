package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the unique identifier of a newly created address.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateAddressPreferenceResponsesData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the newly-created address.&lt;br&gt;&lt;br&gt;This ID value can be used when creating a package through the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/package/methods/createPackage&quot; target=&quot;_blank&quot;&gt;createPackage&lt;/a&gt; method to specify the ship-from or return address associated with the package.
     */
    private String addressId;
    /**
     * Instantiates a new {@link CreateAddressPreferenceResponsesData} and sets the default values.
     */
    public CreateAddressPreferenceResponsesData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateAddressPreferenceResponsesData}
     */
    @jakarta.annotation.Nonnull
    public static CreateAddressPreferenceResponsesData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateAddressPreferenceResponsesData();
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
     * Gets the addressId property value. The unique identifier of the newly-created address.&lt;br&gt;&lt;br&gt;This ID value can be used when creating a package through the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/package/methods/createPackage&quot; target=&quot;_blank&quot;&gt;createPackage&lt;/a&gt; method to specify the ship-from or return address associated with the package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddressId() {
        return this.addressId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("addressId", (n) -> { this.setAddressId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("addressId", this.getAddressId());
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
     * Sets the addressId property value. The unique identifier of the newly-created address.&lt;br&gt;&lt;br&gt;This ID value can be used when creating a package through the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/package/methods/createPackage&quot; target=&quot;_blank&quot;&gt;createPackage&lt;/a&gt; method to specify the ship-from or return address associated with the package.
     * @param value Value to set for the addressId property.
     */
    public void setAddressId(@jakarta.annotation.Nullable final String value) {
        this.addressId = value;
    }
}
