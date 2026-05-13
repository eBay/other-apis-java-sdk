package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields used to specify location and contact information for a pickup-from consign address associated with a seller&apos;s eDIS account.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PickupAddressResponsesData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The city code of the pickup address.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid city codes.
     */
    private String city;
    /**
     * The city name of the pickup address.
     */
    private String cityName;
    /**
     * The name of the company associated with the pickup address.
     */
    private String company;
    /**
     * The name of the contact person associated with the pickup address.
     */
    private String contact;
    /**
     * The two-letter country code of the pickup address.
     */
    private String countryCode;
    /**
     * The name of the country of the pickup address.
     */
    private String countryName;
    /**
     * The district code of the pickup address.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid district codes.
     */
    private String district;
    /**
     * The district name of the pickup address.
     */
    private String districtName;
    /**
     * The name of the pickup address.
     */
    private String name;
    /**
     * The phone number associated with the pickup address.
     */
    private String phone;
    /**
     * The postal code of the pickup address.
     */
    private String postcode;
    /**
     * The province code of the pickup address.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid province codes.
     */
    private String province;
    /**
     * The name of the province of the pickup address.
     */
    private String provinceName;
    /**
     * The first line of the street address of the pickup address.
     */
    private String street1;
    /**
     * The second line, if applicable, of the street address of the pickup address.
     */
    private String street2;
    /**
     * The third line, if applicable, of the street address of the pickup address.
     */
    private String street3;
    /**
     * Instantiates a new {@link PickupAddressResponsesData} and sets the default values.
     */
    public PickupAddressResponsesData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PickupAddressResponsesData}
     */
    @jakarta.annotation.Nonnull
    public static PickupAddressResponsesData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PickupAddressResponsesData();
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
     * Gets the city property value. The city code of the pickup address.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid city codes.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the cityName property value. The city name of the pickup address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCityName() {
        return this.cityName;
    }
    /**
     * Gets the company property value. The name of the company associated with the pickup address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompany() {
        return this.company;
    }
    /**
     * Gets the contact property value. The name of the contact person associated with the pickup address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContact() {
        return this.contact;
    }
    /**
     * Gets the countryCode property value. The two-letter country code of the pickup address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * Gets the countryName property value. The name of the country of the pickup address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryName() {
        return this.countryName;
    }
    /**
     * Gets the district property value. The district code of the pickup address.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid district codes.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDistrict() {
        return this.district;
    }
    /**
     * Gets the districtName property value. The district name of the pickup address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDistrictName() {
        return this.districtName;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(16);
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("cityName", (n) -> { this.setCityName(n.getStringValue()); });
        deserializerMap.put("company", (n) -> { this.setCompany(n.getStringValue()); });
        deserializerMap.put("contact", (n) -> { this.setContact(n.getStringValue()); });
        deserializerMap.put("countryCode", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("countryName", (n) -> { this.setCountryName(n.getStringValue()); });
        deserializerMap.put("district", (n) -> { this.setDistrict(n.getStringValue()); });
        deserializerMap.put("districtName", (n) -> { this.setDistrictName(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("postcode", (n) -> { this.setPostcode(n.getStringValue()); });
        deserializerMap.put("province", (n) -> { this.setProvince(n.getStringValue()); });
        deserializerMap.put("provinceName", (n) -> { this.setProvinceName(n.getStringValue()); });
        deserializerMap.put("street1", (n) -> { this.setStreet1(n.getStringValue()); });
        deserializerMap.put("street2", (n) -> { this.setStreet2(n.getStringValue()); });
        deserializerMap.put("street3", (n) -> { this.setStreet3(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the pickup address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the phone property value. The phone number associated with the pickup address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the postcode property value. The postal code of the pickup address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostcode() {
        return this.postcode;
    }
    /**
     * Gets the province property value. The province code of the pickup address.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid province codes.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvince() {
        return this.province;
    }
    /**
     * Gets the provinceName property value. The name of the province of the pickup address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvinceName() {
        return this.provinceName;
    }
    /**
     * Gets the street1 property value. The first line of the street address of the pickup address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStreet1() {
        return this.street1;
    }
    /**
     * Gets the street2 property value. The second line, if applicable, of the street address of the pickup address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStreet2() {
        return this.street2;
    }
    /**
     * Gets the street3 property value. The third line, if applicable, of the street address of the pickup address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStreet3() {
        return this.street3;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("cityName", this.getCityName());
        writer.writeStringValue("company", this.getCompany());
        writer.writeStringValue("contact", this.getContact());
        writer.writeStringValue("countryCode", this.getCountryCode());
        writer.writeStringValue("countryName", this.getCountryName());
        writer.writeStringValue("district", this.getDistrict());
        writer.writeStringValue("districtName", this.getDistrictName());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeStringValue("postcode", this.getPostcode());
        writer.writeStringValue("province", this.getProvince());
        writer.writeStringValue("provinceName", this.getProvinceName());
        writer.writeStringValue("street1", this.getStreet1());
        writer.writeStringValue("street2", this.getStreet2());
        writer.writeStringValue("street3", this.getStreet3());
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
     * Sets the city property value. The city code of the pickup address.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid city codes.
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the cityName property value. The city name of the pickup address.
     * @param value Value to set for the cityName property.
     */
    public void setCityName(@jakarta.annotation.Nullable final String value) {
        this.cityName = value;
    }
    /**
     * Sets the company property value. The name of the company associated with the pickup address.
     * @param value Value to set for the company property.
     */
    public void setCompany(@jakarta.annotation.Nullable final String value) {
        this.company = value;
    }
    /**
     * Sets the contact property value. The name of the contact person associated with the pickup address.
     * @param value Value to set for the contact property.
     */
    public void setContact(@jakarta.annotation.Nullable final String value) {
        this.contact = value;
    }
    /**
     * Sets the countryCode property value. The two-letter country code of the pickup address.
     * @param value Value to set for the countryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the countryName property value. The name of the country of the pickup address.
     * @param value Value to set for the countryName property.
     */
    public void setCountryName(@jakarta.annotation.Nullable final String value) {
        this.countryName = value;
    }
    /**
     * Sets the district property value. The district code of the pickup address.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid district codes.
     * @param value Value to set for the district property.
     */
    public void setDistrict(@jakarta.annotation.Nullable final String value) {
        this.district = value;
    }
    /**
     * Sets the districtName property value. The district name of the pickup address.
     * @param value Value to set for the districtName property.
     */
    public void setDistrictName(@jakarta.annotation.Nullable final String value) {
        this.districtName = value;
    }
    /**
     * Sets the name property value. The name of the pickup address.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the phone property value. The phone number associated with the pickup address.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the postcode property value. The postal code of the pickup address.
     * @param value Value to set for the postcode property.
     */
    public void setPostcode(@jakarta.annotation.Nullable final String value) {
        this.postcode = value;
    }
    /**
     * Sets the province property value. The province code of the pickup address.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid province codes.
     * @param value Value to set for the province property.
     */
    public void setProvince(@jakarta.annotation.Nullable final String value) {
        this.province = value;
    }
    /**
     * Sets the provinceName property value. The name of the province of the pickup address.
     * @param value Value to set for the provinceName property.
     */
    public void setProvinceName(@jakarta.annotation.Nullable final String value) {
        this.provinceName = value;
    }
    /**
     * Sets the street1 property value. The first line of the street address of the pickup address.
     * @param value Value to set for the street1 property.
     */
    public void setStreet1(@jakarta.annotation.Nullable final String value) {
        this.street1 = value;
    }
    /**
     * Sets the street2 property value. The second line, if applicable, of the street address of the pickup address.
     * @param value Value to set for the street2 property.
     */
    public void setStreet2(@jakarta.annotation.Nullable final String value) {
        this.street2 = value;
    }
    /**
     * Sets the street3 property value. The third line, if applicable, of the street address of the pickup address.
     * @param value Value to set for the street3 property.
     */
    public void setStreet3(@jakarta.annotation.Nullable final String value) {
        this.street3 = value;
    }
}
