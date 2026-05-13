package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type indicates the IDs of the packages being canceled.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CancelPackagesRequestData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This comma-delimited array lists the unique identifiers of the packages being canceled.&lt;br&gt;&lt;br&gt;Up to 200 package IDs can be specified.
     */
    private java.util.List<String> packageIds;
    /**
     * Instantiates a new {@link CancelPackagesRequestData} and sets the default values.
     */
    public CancelPackagesRequestData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CancelPackagesRequestData}
     */
    @jakarta.annotation.Nonnull
    public static CancelPackagesRequestData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CancelPackagesRequestData();
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
        deserializerMap.put("packageIds", (n) -> { this.setPackageIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the packageIds property value. This comma-delimited array lists the unique identifiers of the packages being canceled.&lt;br&gt;&lt;br&gt;Up to 200 package IDs can be specified.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPackageIds() {
        return this.packageIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("packageIds", this.getPackageIds());
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
     * Sets the packageIds property value. This comma-delimited array lists the unique identifiers of the packages being canceled.&lt;br&gt;&lt;br&gt;Up to 200 package IDs can be specified.
     * @param value Value to set for the packageIds property.
     */
    public void setPackageIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.packageIds = value;
    }
}
