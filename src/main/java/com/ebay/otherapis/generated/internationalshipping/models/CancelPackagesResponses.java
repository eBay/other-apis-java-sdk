package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the response container of the &lt;b&gt;bulkCancelPackages&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CancelPackagesResponses implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array returns the result code and message for each cancelled package. Each package is denoted by its package ID value.
     */
    private java.util.List<CancelPackagesResponsesData> responses;
    /**
     * Instantiates a new {@link CancelPackagesResponses} and sets the default values.
     */
    public CancelPackagesResponses() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CancelPackagesResponses}
     */
    @jakarta.annotation.Nonnull
    public static CancelPackagesResponses createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CancelPackagesResponses();
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
        deserializerMap.put("responses", (n) -> { this.setResponses(n.getCollectionOfObjectValues(CancelPackagesResponsesData::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the responses property value. This array returns the result code and message for each cancelled package. Each package is denoted by its package ID value.
     * @return a {@link java.util.List<CancelPackagesResponsesData>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CancelPackagesResponsesData> getResponses() {
        return this.responses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("responses", this.getResponses());
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
     * Sets the responses property value. This array returns the result code and message for each cancelled package. Each package is denoted by its package ID value.
     * @param value Value to set for the responses property.
     */
    public void setResponses(@jakarta.annotation.Nullable final java.util.List<CancelPackagesResponsesData> value) {
        this.responses = value;
    }
}
