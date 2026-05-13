package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the response data after deleting multiple packages.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeletePackagesResponsesData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This string returns any additional information about the deletion of the package.
     */
    private String message;
    /**
     * The unique identifier of the deleted package.
     */
    private String packageId;
    /**
     * The result code detailing the result of the deletion process.&lt;br&gt;&lt;br&gt;For example, a result code of &lt;code&gt;200&lt;/code&gt; indicates that the call was a success and the package was deleted.
     */
    private String resultCode;
    /**
     * Instantiates a new {@link DeletePackagesResponsesData} and sets the default values.
     */
    public DeletePackagesResponsesData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeletePackagesResponsesData}
     */
    @jakarta.annotation.Nonnull
    public static DeletePackagesResponsesData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeletePackagesResponsesData();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("packageId", (n) -> { this.setPackageId(n.getStringValue()); });
        deserializerMap.put("resultCode", (n) -> { this.setResultCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. This string returns any additional information about the deletion of the package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the packageId property value. The unique identifier of the deleted package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackageId() {
        return this.packageId;
    }
    /**
     * Gets the resultCode property value. The result code detailing the result of the deletion process.&lt;br&gt;&lt;br&gt;For example, a result code of &lt;code&gt;200&lt;/code&gt; indicates that the call was a success and the package was deleted.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResultCode() {
        return this.resultCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("packageId", this.getPackageId());
        writer.writeStringValue("resultCode", this.getResultCode());
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
     * Sets the message property value. This string returns any additional information about the deletion of the package.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the packageId property value. The unique identifier of the deleted package.
     * @param value Value to set for the packageId property.
     */
    public void setPackageId(@jakarta.annotation.Nullable final String value) {
        this.packageId = value;
    }
    /**
     * Sets the resultCode property value. The result code detailing the result of the deletion process.&lt;br&gt;&lt;br&gt;For example, a result code of &lt;code&gt;200&lt;/code&gt; indicates that the call was a success and the package was deleted.
     * @param value Value to set for the resultCode property.
     */
    public void setResultCode(@jakarta.annotation.Nullable final String value) {
        this.resultCode = value;
    }
}
