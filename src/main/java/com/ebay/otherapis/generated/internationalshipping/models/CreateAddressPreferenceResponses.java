package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to define the response container of the &lt;b&gt;createAddressPreference&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateAddressPreferenceResponses implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines the unique identifier of a newly created address.
     */
    private CreateAddressPreferenceResponsesData shipFromAddressId;
    /**
     * Instantiates a new {@link CreateAddressPreferenceResponses} and sets the default values.
     */
    public CreateAddressPreferenceResponses() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateAddressPreferenceResponses}
     */
    @jakarta.annotation.Nonnull
    public static CreateAddressPreferenceResponses createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateAddressPreferenceResponses();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("shipFromAddressId", (n) -> { this.setShipFromAddressId(n.getObjectValue(CreateAddressPreferenceResponsesData::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the shipFromAddressId property value. This type defines the unique identifier of a newly created address.
     * @return a {@link CreateAddressPreferenceResponsesData}
     */
    @jakarta.annotation.Nullable
    public CreateAddressPreferenceResponsesData getShipFromAddressId() {
        return this.shipFromAddressId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("shipFromAddressId", this.getShipFromAddressId());
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
     * Sets the shipFromAddressId property value. This type defines the unique identifier of a newly created address.
     * @param value Value to set for the shipFromAddressId property.
     */
    public void setShipFromAddressId(@jakarta.annotation.Nullable final CreateAddressPreferenceResponsesData value) {
        this.shipFromAddressId = value;
    }
}
