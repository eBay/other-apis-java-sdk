package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to define the request container of the &lt;b&gt;createConsignPreference&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateConsignPreferenceRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to specify the address details used to create a consign address.
     */
    private CreateConsignPreferenceRequestData consignAddress;
    /**
     * Instantiates a new {@link CreateConsignPreferenceRequest} and sets the default values.
     */
    public CreateConsignPreferenceRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateConsignPreferenceRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateConsignPreferenceRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateConsignPreferenceRequest();
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
     * Gets the consignAddress property value. This type is used to specify the address details used to create a consign address.
     * @return a {@link CreateConsignPreferenceRequestData}
     */
    @jakarta.annotation.Nullable
    public CreateConsignPreferenceRequestData getConsignAddress() {
        return this.consignAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("consignAddress", (n) -> { this.setConsignAddress(n.getObjectValue(CreateConsignPreferenceRequestData::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("consignAddress", this.getConsignAddress());
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
     * Sets the consignAddress property value. This type is used to specify the address details used to create a consign address.
     * @param value Value to set for the consignAddress property.
     */
    public void setConsignAddress(@jakarta.annotation.Nullable final CreateConsignPreferenceRequestData value) {
        this.consignAddress = value;
    }
}
