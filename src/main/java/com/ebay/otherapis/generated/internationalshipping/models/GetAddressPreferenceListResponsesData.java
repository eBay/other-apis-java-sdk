package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the list of addresses associated with a eDIS account.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetAddressPreferenceListResponsesData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array returns a list of address, contact, and identifier information for each of a seller&apos;s ship-from and/or return addresses associated with their eDIS account.
     */
    private java.util.List<GetAddressPreferencesResponses> addresses;
    /**
     * Instantiates a new {@link GetAddressPreferenceListResponsesData} and sets the default values.
     */
    public GetAddressPreferenceListResponsesData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetAddressPreferenceListResponsesData}
     */
    @jakarta.annotation.Nonnull
    public static GetAddressPreferenceListResponsesData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetAddressPreferenceListResponsesData();
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
     * Gets the addresses property value. This array returns a list of address, contact, and identifier information for each of a seller&apos;s ship-from and/or return addresses associated with their eDIS account.
     * @return a {@link java.util.List<GetAddressPreferencesResponses>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GetAddressPreferencesResponses> getAddresses() {
        return this.addresses;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("addresses", (n) -> { this.setAddresses(n.getCollectionOfObjectValues(GetAddressPreferencesResponses::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("addresses", this.getAddresses());
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
     * Sets the addresses property value. This array returns a list of address, contact, and identifier information for each of a seller&apos;s ship-from and/or return addresses associated with their eDIS account.
     * @param value Value to set for the addresses property.
     */
    public void setAddresses(@jakarta.annotation.Nullable final java.util.List<GetAddressPreferencesResponses> value) {
        this.addresses = value;
    }
}
