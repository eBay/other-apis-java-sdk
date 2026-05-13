package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to define the response container for the &lt;b&gt;getHandoverSheet&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetHandoverSheetResponses implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type specifies the base64 string value for a handover sheet.
     */
    private GetHandoverSheetResponsesData handoverSheet;
    /**
     * Instantiates a new {@link GetHandoverSheetResponses} and sets the default values.
     */
    public GetHandoverSheetResponses() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetHandoverSheetResponses}
     */
    @jakarta.annotation.Nonnull
    public static GetHandoverSheetResponses createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetHandoverSheetResponses();
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
        deserializerMap.put("handoverSheet", (n) -> { this.setHandoverSheet(n.getObjectValue(GetHandoverSheetResponsesData::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the handoverSheet property value. This type specifies the base64 string value for a handover sheet.
     * @return a {@link GetHandoverSheetResponsesData}
     */
    @jakarta.annotation.Nullable
    public GetHandoverSheetResponsesData getHandoverSheet() {
        return this.handoverSheet;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("handoverSheet", this.getHandoverSheet());
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
     * Sets the handoverSheet property value. This type specifies the base64 string value for a handover sheet.
     * @param value Value to set for the handoverSheet property.
     */
    public void setHandoverSheet(@jakarta.annotation.Nullable final GetHandoverSheetResponsesData value) {
        this.handoverSheet = value;
    }
}
