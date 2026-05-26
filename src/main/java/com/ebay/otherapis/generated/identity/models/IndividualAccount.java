// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.otherapis.generated.identity.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The type that defines the fields for the information of an individual account.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IndividualAccount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The eBay user&apos;s registration email address.
     */
    private String email;
    /**
     * The eBay user&apos;s first name.
     */
    private String firstName;
    /**
     * The eBay user&apos;s last name.
     */
    private String lastName;
    /**
     * The type that defines the fields for the details of a phone.
     */
    private Phone primaryPhone;
    /**
     * The type that defines the fields for an address.
     */
    private Address registrationAddress;
    /**
     * The type that defines the fields for the details of a phone.
     */
    private Phone secondaryPhone;
    /**
     * Instantiates a new {@link IndividualAccount} and sets the default values.
     */
    public IndividualAccount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IndividualAccount}
     */
    @jakarta.annotation.Nonnull
    public static IndividualAccount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IndividualAccount();
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
     * Gets the email property value. The eBay user&apos;s registration email address.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("primaryPhone", (n) -> { this.setPrimaryPhone(n.getObjectValue(Phone::createFromDiscriminatorValue)); });
        deserializerMap.put("registrationAddress", (n) -> { this.setRegistrationAddress(n.getObjectValue(Address::createFromDiscriminatorValue)); });
        deserializerMap.put("secondaryPhone", (n) -> { this.setSecondaryPhone(n.getObjectValue(Phone::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstName property value. The eBay user&apos;s first name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the lastName property value. The eBay user&apos;s last name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
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
     * Gets the registrationAddress property value. The type that defines the fields for an address.
     * @return a {@link Address}
     */
    @jakarta.annotation.Nullable
    public Address getRegistrationAddress() {
        return this.registrationAddress;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeObjectValue("primaryPhone", this.getPrimaryPhone());
        writer.writeObjectValue("registrationAddress", this.getRegistrationAddress());
        writer.writeObjectValue("secondaryPhone", this.getSecondaryPhone());
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
     * Sets the email property value. The eBay user&apos;s registration email address.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the firstName property value. The eBay user&apos;s first name.
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the lastName property value. The eBay user&apos;s last name.
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the primaryPhone property value. The type that defines the fields for the details of a phone.
     * @param value Value to set for the primaryPhone property.
     */
    public void setPrimaryPhone(@jakarta.annotation.Nullable final Phone value) {
        this.primaryPhone = value;
    }
    /**
     * Sets the registrationAddress property value. The type that defines the fields for an address.
     * @param value Value to set for the registrationAddress property.
     */
    public void setRegistrationAddress(@jakarta.annotation.Nullable final Address value) {
        this.registrationAddress = value;
    }
    /**
     * Sets the secondaryPhone property value. The type that defines the fields for the details of a phone.
     * @param value Value to set for the secondaryPhone property.
     */
    public void setSecondaryPhone(@jakarta.annotation.Nullable final Phone value) {
        this.secondaryPhone = value;
    }
}
