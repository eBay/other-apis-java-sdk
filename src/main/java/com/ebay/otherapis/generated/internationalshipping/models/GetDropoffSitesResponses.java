package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields associated with one or more drop-off sites associated with a seller&apos;s eDIS account.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetDropoffSitesResponses implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The city code of the drop-off site location.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid city codes.
     */
    private String city;
    /**
     * The name of the contact person associated with the drop-off site location.
     */
    private String contact;
    /**
     * The two-letter country code associated with the drop-off site location.
     */
    private String country;
    /**
     * The district code of the drop-off site location.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid district codes.
     */
    private String district;
    /**
     * The unique identifier of the drop-off site location.
     */
    private String dropoffSiteId;
    /**
     * The name of the drop-off site location.
     */
    private String name;
    /**
     * The phone number associated with the drop-off site location.
     */
    private String phone;
    /**
     * The province code of the drop-off site location.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid province codes.
     */
    private String province;
    /**
     * The first line of the street address of the drop-off site location.
     */
    private String street1;
    /**
     * The second line, if applicable, of the street address of the drop-off site location.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     */
    private String street2;
    /**
     * The third line, if applicable, of the street address of the drop-off site location.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     */
    private String street3;
    /**
     * The type of the drop-off site location.&lt;br&gt;&lt;br&gt;Currently, the only valid response is &lt;code&gt;DROP_OFF&lt;/code&gt;.
     */
    private String type;
    /**
     * Instantiates a new {@link GetDropoffSitesResponses} and sets the default values.
     */
    public GetDropoffSitesResponses() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetDropoffSitesResponses}
     */
    @jakarta.annotation.Nonnull
    public static GetDropoffSitesResponses createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetDropoffSitesResponses();
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
     * Gets the city property value. The city code of the drop-off site location.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid city codes.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the contact property value. The name of the contact person associated with the drop-off site location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContact() {
        return this.contact;
    }
    /**
     * Gets the country property value. The two-letter country code associated with the drop-off site location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the district property value. The district code of the drop-off site location.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid district codes.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDistrict() {
        return this.district;
    }
    /**
     * Gets the dropoffSiteId property value. The unique identifier of the drop-off site location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDropoffSiteId() {
        return this.dropoffSiteId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("contact", (n) -> { this.setContact(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("district", (n) -> { this.setDistrict(n.getStringValue()); });
        deserializerMap.put("dropoffSiteId", (n) -> { this.setDropoffSiteId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("province", (n) -> { this.setProvince(n.getStringValue()); });
        deserializerMap.put("street1", (n) -> { this.setStreet1(n.getStringValue()); });
        deserializerMap.put("street2", (n) -> { this.setStreet2(n.getStringValue()); });
        deserializerMap.put("street3", (n) -> { this.setStreet3(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the drop-off site location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the phone property value. The phone number associated with the drop-off site location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the province property value. The province code of the drop-off site location.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid province codes.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvince() {
        return this.province;
    }
    /**
     * Gets the street1 property value. The first line of the street address of the drop-off site location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStreet1() {
        return this.street1;
    }
    /**
     * Gets the street2 property value. The second line, if applicable, of the street address of the drop-off site location.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStreet2() {
        return this.street2;
    }
    /**
     * Gets the street3 property value. The third line, if applicable, of the street address of the drop-off site location.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStreet3() {
        return this.street3;
    }
    /**
     * Gets the type property value. The type of the drop-off site location.&lt;br&gt;&lt;br&gt;Currently, the only valid response is &lt;code&gt;DROP_OFF&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("contact", this.getContact());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("district", this.getDistrict());
        writer.writeStringValue("dropoffSiteId", this.getDropoffSiteId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeStringValue("province", this.getProvince());
        writer.writeStringValue("street1", this.getStreet1());
        writer.writeStringValue("street2", this.getStreet2());
        writer.writeStringValue("street3", this.getStreet3());
        writer.writeStringValue("type", this.getType());
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
     * Sets the city property value. The city code of the drop-off site location.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid city codes.
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the contact property value. The name of the contact person associated with the drop-off site location.
     * @param value Value to set for the contact property.
     */
    public void setContact(@jakarta.annotation.Nullable final String value) {
        this.contact = value;
    }
    /**
     * Sets the country property value. The two-letter country code associated with the drop-off site location.
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the district property value. The district code of the drop-off site location.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid district codes.
     * @param value Value to set for the district property.
     */
    public void setDistrict(@jakarta.annotation.Nullable final String value) {
        this.district = value;
    }
    /**
     * Sets the dropoffSiteId property value. The unique identifier of the drop-off site location.
     * @param value Value to set for the dropoffSiteId property.
     */
    public void setDropoffSiteId(@jakarta.annotation.Nullable final String value) {
        this.dropoffSiteId = value;
    }
    /**
     * Sets the name property value. The name of the drop-off site location.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the phone property value. The phone number associated with the drop-off site location.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the province property value. The province code of the drop-off site location.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid province codes.
     * @param value Value to set for the province property.
     */
    public void setProvince(@jakarta.annotation.Nullable final String value) {
        this.province = value;
    }
    /**
     * Sets the street1 property value. The first line of the street address of the drop-off site location.
     * @param value Value to set for the street1 property.
     */
    public void setStreet1(@jakarta.annotation.Nullable final String value) {
        this.street1 = value;
    }
    /**
     * Sets the street2 property value. The second line, if applicable, of the street address of the drop-off site location.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @param value Value to set for the street2 property.
     */
    public void setStreet2(@jakarta.annotation.Nullable final String value) {
        this.street2 = value;
    }
    /**
     * Sets the street3 property value. The third line, if applicable, of the street address of the drop-off site location.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @param value Value to set for the street3 property.
     */
    public void setStreet3(@jakarta.annotation.Nullable final String value) {
        this.street3 = value;
    }
    /**
     * Sets the type property value. The type of the drop-off site location.&lt;br&gt;&lt;br&gt;Currently, the only valid response is &lt;code&gt;DROP_OFF&lt;/code&gt;.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
