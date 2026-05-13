package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the request container for the &lt;b&gt;bulkCancelPackages&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CancelPackagesRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type indicates the IDs of the packages being canceled.
     */
    private CancelPackagesRequestData requests;
    /**
     * Instantiates a new {@link CancelPackagesRequest} and sets the default values.
     */
    public CancelPackagesRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CancelPackagesRequest}
     */
    @jakarta.annotation.Nonnull
    public static CancelPackagesRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CancelPackagesRequest();
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
        deserializerMap.put("requests", (n) -> { this.setRequests(n.getObjectValue(CancelPackagesRequestData::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the requests property value. This type indicates the IDs of the packages being canceled.
     * @return a {@link CancelPackagesRequestData}
     */
    @jakarta.annotation.Nullable
    public CancelPackagesRequestData getRequests() {
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
     * Sets the requests property value. This type indicates the IDs of the packages being canceled.
     * @param value Value to set for the requests property.
     */
    public void setRequests(@jakarta.annotation.Nullable final CancelPackagesRequestData value) {
        this.requests = value;
    }
}
