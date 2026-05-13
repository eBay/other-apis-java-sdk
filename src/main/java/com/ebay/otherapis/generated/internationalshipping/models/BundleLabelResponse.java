package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the response container of the &lt;b&gt;getBundleLabel&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BundleLabelResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines the base64 string value used to download a bundle label PDF file.
     */
    private BundleLabelResponseData label;
    /**
     * Instantiates a new {@link BundleLabelResponse} and sets the default values.
     */
    public BundleLabelResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BundleLabelResponse}
     */
    @jakarta.annotation.Nonnull
    public static BundleLabelResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BundleLabelResponse();
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
        deserializerMap.put("label", (n) -> { this.setLabel(n.getObjectValue(BundleLabelResponseData::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. This type defines the base64 string value used to download a bundle label PDF file.
     * @return a {@link BundleLabelResponseData}
     */
    @jakarta.annotation.Nullable
    public BundleLabelResponseData getLabel() {
        return this.label;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("label", this.getLabel());
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
     * Sets the label property value. This type defines the base64 string value used to download a bundle label PDF file.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final BundleLabelResponseData value) {
        this.label = value;
    }
}
