package com.ebay.otherapis.generated.identity.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The type that defines the fields for the business account information.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessAccount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The type that defines the fields for an address.
     */
    private Address address;
    /**
     * An additional name that is used for their business on eBay. The business name is returned in the &lt;b&gt; name&lt;/b&gt; field.
     */
    private String doingBusinessAs;
    /**
     * The email address of the business account.
     */
    private String email;
    /**
     * The business name associated with the user&apos;s eBay account.
     */
    private String name;
    /**
     * The type that defines the fields for the information of the contact person for the account.
     */
    private Contact primaryContact;
    /**
     * The type that defines the fields for the details of a phone.
     */
    private Phone primaryPhone;
    /**
     * The type that defines the fields for the details of a phone.
     */
    private Phone secondaryPhone;
    /**
     * The business website address associated with the eBay account.
     */
    private String website;
    /**
     * Instantiates a new {@link BusinessAccount} and sets the default values.
     */
    public BusinessAccount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessAccount}
     */
    @jakarta.annotation.Nonnull
    public static BusinessAccount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessAccount();
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
     * Gets the address property value. The type that defines the fields for an address.
     * @return a {@link Address}
     */
    @jakarta.annotation.Nullable
    public Address getAddress() {
        return this.address;
    }
    /**
     * Gets the doingBusinessAs property value. An additional name that is used for their business on eBay. The business name is returned in the &lt;b&gt; name&lt;/b&gt; field.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDoingBusinessAs() {
        return this.doingBusinessAs;
    }
    /**
     * Gets the email property value. The email address of the business account.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(Address::createFromDiscriminatorValue)); });
        deserializerMap.put("doingBusinessAs", (n) -> { this.setDoingBusinessAs(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("primaryContact", (n) -> { this.setPrimaryContact(n.getObjectValue(Contact::createFromDiscriminatorValue)); });
        deserializerMap.put("primaryPhone", (n) -> { this.setPrimaryPhone(n.getObjectValue(Phone::createFromDiscriminatorValue)); });
        deserializerMap.put("secondaryPhone", (n) -> { this.setSecondaryPhone(n.getObjectValue(Phone::createFromDiscriminatorValue)); });
        deserializerMap.put("website", (n) -> { this.setWebsite(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The business name associated with the user&apos;s eBay account.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the primaryContact property value. The type that defines the fields for the information of the contact person for the account.
     * @return a {@link Contact}
     */
    @jakarta.annotation.Nullable
    public Contact getPrimaryContact() {
        return this.primaryContact;
    }
    /**
     * Gets the primaryPhone property value. The type that defines the fields for the details of a phone.
     * @return a {@link Phone}
     */
    @jakarta.annotation.Nullable
    public Phone getPrimaryPhone() {
        return this.primaryPhone;
    }
    /**
     * Gets the secondaryPhone property value. The type that defines the fields for the details of a phone.
     * @return a {@link Phone}
     */
    @jakarta.annotation.Nullable
    public Phone getSecondaryPhone() {
        return this.secondaryPhone;
    }
    /**
     * Gets the website property value. The business website address associated with the eBay account.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebsite() {
        return this.website;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeStringValue("doingBusinessAs", this.getDoingBusinessAs());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("primaryContact", this.getPrimaryContact());
        writer.writeObjectValue("primaryPhone", this.getPrimaryPhone());
        writer.writeObjectValue("secondaryPhone", this.getSecondaryPhone());
        writer.writeStringValue("website", this.getWebsite());
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
     * Sets the address property value. The type that defines the fields for an address.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final Address value) {
        this.address = value;
    }
    /**
     * Sets the doingBusinessAs property value. An additional name that is used for their business on eBay. The business name is returned in the &lt;b&gt; name&lt;/b&gt; field.
     * @param value Value to set for the doingBusinessAs property.
     */
    public void setDoingBusinessAs(@jakarta.annotation.Nullable final String value) {
        this.doingBusinessAs = value;
    }
    /**
     * Sets the email property value. The email address of the business account.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the name property value. The business name associated with the user&apos;s eBay account.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the primaryContact property value. The type that defines the fields for the information of the contact person for the account.
     * @param value Value to set for the primaryContact property.
     */
    public void setPrimaryContact(@jakarta.annotation.Nullable final Contact value) {
        this.primaryContact = value;
    }
    /**
     * Sets the primaryPhone property value. The type that defines the fields for the details of a phone.
     * @param value Value to set for the primaryPhone property.
     */
    public void setPrimaryPhone(@jakarta.annotation.Nullable final Phone value) {
        this.primaryPhone = value;
    }
    /**
     * Sets the secondaryPhone property value. The type that defines the fields for the details of a phone.
     * @param value Value to set for the secondaryPhone property.
     */
    public void setSecondaryPhone(@jakarta.annotation.Nullable final Phone value) {
        this.secondaryPhone = value;
    }
    /**
     * Sets the website property value. The business website address associated with the eBay account.
     * @param value Value to set for the website property.
     */
    public void setWebsite(@jakarta.annotation.Nullable final String value) {
        this.website = value;
    }
}
