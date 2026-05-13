package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This container specifies direction information for a shipping service.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectionsResponses implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The supported battery type for the shipping service.
     */
    private String batteryType;
    /**
     * The two-letter ISO 3166 ship-from country code.
     */
    private String from;
    /**
     * The two-letter ISO 3166 destination country code.
     */
    private String to;
    /**
     * Instantiates a new {@link DirectionsResponses} and sets the default values.
     */
    public DirectionsResponses() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DirectionsResponses}
     */
    @jakarta.annotation.Nonnull
    public static DirectionsResponses createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectionsResponses();
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
     * Gets the batteryType property value. The supported battery type for the shipping service.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBatteryType() {
        return this.batteryType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("batteryType", (n) -> { this.setBatteryType(n.getStringValue()); });
        deserializerMap.put("from", (n) -> { this.setFrom(n.getStringValue()); });
        deserializerMap.put("to", (n) -> { this.setTo(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the from property value. The two-letter ISO 3166 ship-from country code.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFrom() {
        return this.from;
    }
    /**
     * Gets the to property value. The two-letter ISO 3166 destination country code.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTo() {
        return this.to;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("batteryType", this.getBatteryType());
        writer.writeStringValue("from", this.getFrom());
        writer.writeStringValue("to", this.getTo());
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
     * Sets the batteryType property value. The supported battery type for the shipping service.
     * @param value Value to set for the batteryType property.
     */
    public void setBatteryType(@jakarta.annotation.Nullable final String value) {
        this.batteryType = value;
    }
    /**
     * Sets the from property value. The two-letter ISO 3166 ship-from country code.
     * @param value Value to set for the from property.
     */
    public void setFrom(@jakarta.annotation.Nullable final String value) {
        this.from = value;
    }
    /**
     * Sets the to property value. The two-letter ISO 3166 destination country code.
     * @param value Value to set for the to property.
     */
    public void setTo(@jakarta.annotation.Nullable final String value) {
        this.to = value;
    }
}
