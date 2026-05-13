package com.ebay.otherapis.generated.identity.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The type that defines the fields for the details of a phone.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Phone implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html&quot;&gt;ISO 3166&lt;/a&gt; standard of the country to which the phone number belongs.
     */
    private String countryCode;
    /**
     * The numeric string representing the phone number.
     */
    private String number;
    /**
     * The type of phone service. &lt;br /&gt;&lt;br /&gt;&lt;b&gt; Valid Values: &lt;/b&gt; MOBILE or LAND_LINE  &lt;br /&gt;&lt;br /&gt;Code so that your app gracefully handles any future changes to this list.
     */
    private String phoneType;
    /**
     * Instantiates a new {@link Phone} and sets the default values.
     */
    public Phone() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Phone}
     */
    @jakarta.annotation.Nonnull
    public static Phone createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Phone();
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
     * Gets the countryCode property value. The two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html&quot;&gt;ISO 3166&lt;/a&gt; standard of the country to which the phone number belongs.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("countryCode", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("phoneType", (n) -> { this.setPhoneType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the number property value. The numeric string representing the phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.number;
    }
    /**
     * Gets the phoneType property value. The type of phone service. &lt;br /&gt;&lt;br /&gt;&lt;b&gt; Valid Values: &lt;/b&gt; MOBILE or LAND_LINE  &lt;br /&gt;&lt;br /&gt;Code so that your app gracefully handles any future changes to this list.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneType() {
        return this.phoneType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("countryCode", this.getCountryCode());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("phoneType", this.getPhoneType());
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
     * Sets the countryCode property value. The two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html&quot;&gt;ISO 3166&lt;/a&gt; standard of the country to which the phone number belongs.
     * @param value Value to set for the countryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the number property value. The numeric string representing the phone number.
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.number = value;
    }
    /**
     * Sets the phoneType property value. The type of phone service. &lt;br /&gt;&lt;br /&gt;&lt;b&gt; Valid Values: &lt;/b&gt; MOBILE or LAND_LINE  &lt;br /&gt;&lt;br /&gt;Code so that your app gracefully handles any future changes to this list.
     * @param value Value to set for the phoneType property.
     */
    public void setPhoneType(@jakarta.annotation.Nullable final String value) {
        this.phoneType = value;
    }
}
