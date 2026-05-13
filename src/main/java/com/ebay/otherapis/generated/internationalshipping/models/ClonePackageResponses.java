package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the response container used in the &lt;b&gt;clonePackage&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClonePackageResponses implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type specifies the package ID, payment cost, tracking number, and last-mile tracking number (if applicable) for the cloned package.
     */
    private ClonePackageResponsesData clonePackageResult;
    /**
     * Instantiates a new {@link ClonePackageResponses} and sets the default values.
     */
    public ClonePackageResponses() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ClonePackageResponses}
     */
    @jakarta.annotation.Nonnull
    public static ClonePackageResponses createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClonePackageResponses();
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
     * Gets the clonePackageResult property value. This type specifies the package ID, payment cost, tracking number, and last-mile tracking number (if applicable) for the cloned package.
     * @return a {@link ClonePackageResponsesData}
     */
    @jakarta.annotation.Nullable
    public ClonePackageResponsesData getClonePackageResult() {
        return this.clonePackageResult;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("clonePackageResult", (n) -> { this.setClonePackageResult(n.getObjectValue(ClonePackageResponsesData::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("clonePackageResult", this.getClonePackageResult());
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
     * Sets the clonePackageResult property value. This type specifies the package ID, payment cost, tracking number, and last-mile tracking number (if applicable) for the cloned package.
     * @param value Value to set for the clonePackageResult property.
     */
    public void setClonePackageResult(@jakarta.annotation.Nullable final ClonePackageResponsesData value) {
        this.clonePackageResult = value;
    }
}
