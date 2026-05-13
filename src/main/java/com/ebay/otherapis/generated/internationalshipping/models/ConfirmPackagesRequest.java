package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the request container of the &lt;b&gt;bulkConfirmPackages&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfirmPackagesRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type specifies the IDs of the packages being confirmed.
     */
    private ConfirmPackagesRequestData requests;
    /**
     * Instantiates a new {@link ConfirmPackagesRequest} and sets the default values.
     */
    public ConfirmPackagesRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConfirmPackagesRequest}
     */
    @jakarta.annotation.Nonnull
    public static ConfirmPackagesRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfirmPackagesRequest();
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
        deserializerMap.put("requests", (n) -> { this.setRequests(n.getObjectValue(ConfirmPackagesRequestData::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the requests property value. This type specifies the IDs of the packages being confirmed.
     * @return a {@link ConfirmPackagesRequestData}
     */
    @jakarta.annotation.Nullable
    public ConfirmPackagesRequestData getRequests() {
        return this.requests;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("requests", this.getRequests());
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
     * Sets the requests property value. This type specifies the IDs of the packages being confirmed.
     * @param value Value to set for the requests property.
     */
    public void setRequests(@jakarta.annotation.Nullable final ConfirmPackagesRequestData value) {
        this.requests = value;
    }
}
