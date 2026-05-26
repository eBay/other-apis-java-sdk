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
 * The type that defines the fields for the &lt;b&gt;getUser&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserResponse implements AdditionalDataHolder, Parsable {
    /**
     * Indicates the user account type. This is determined when the user registers with eBay. If they register for a business account, this value will be BUSINESS. If they register for a private account, this value will be INDIVIDUAL. This designation is required by the tax laws in the following countries:   &lt;br /&gt;&lt;br /&gt;EBAY_AT, EBAY_BE, EBAY_CH, EBAY_DE, EBAY_ES, EBAY_FR, EBAY_GB, EBAY_IE, EBAY_IT, EBAY_PL &lt;br /&gt;&lt;br /&gt;&lt;b&gt; Valid Values:&lt;/b&gt; BUSINESS or INDIVIDUAL &lt;br /&gt;&lt;br /&gt;Code so that your app gracefully handles any future changes to this list. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/identity/types/api:AccountTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String accountType;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The type that defines the fields for the business account information.
     */
    private BusinessAccount businessAccount;
    /**
     * The type that defines the fields for the information of an individual account.
     */
    private IndividualAccount individualAccount;
    /**
     * The eBay site on which the account is registered. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/identity/types/bas:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String registrationMarketplaceId;
    /**
     * Indicates the user&apos;s account status. Possible values: &lt;code&gt;CONFIRMED&lt;/code&gt;, &lt;code&gt;UNCONFIRMED&lt;/code&gt;, &lt;code&gt;ACCOUNTONHOLD&lt;/code&gt; and &lt;code&gt;UNDETERMINED&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/identity/types/api:UserStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String status;
    /**
     * The eBay immutable user ID of the user&apos;s account and can always be used to identify the user.
     */
    private String userId;
    /**
     * The user name, which was specific by the user when they created the account. &lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; This value can be changed by the user.&lt;/span&gt;
     */
    private String username;
    /**
     * Instantiates a new {@link UserResponse} and sets the default values.
     */
    public UserResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserResponse}
     */
    @jakarta.annotation.Nonnull
    public static UserResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserResponse();
    }
    /**
     * Gets the accountType property value. Indicates the user account type. This is determined when the user registers with eBay. If they register for a business account, this value will be BUSINESS. If they register for a private account, this value will be INDIVIDUAL. This designation is required by the tax laws in the following countries:   &lt;br /&gt;&lt;br /&gt;EBAY_AT, EBAY_BE, EBAY_CH, EBAY_DE, EBAY_ES, EBAY_FR, EBAY_GB, EBAY_IE, EBAY_IT, EBAY_PL &lt;br /&gt;&lt;br /&gt;&lt;b&gt; Valid Values:&lt;/b&gt; BUSINESS or INDIVIDUAL &lt;br /&gt;&lt;br /&gt;Code so that your app gracefully handles any future changes to this list. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/identity/types/api:AccountTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccountType() {
        return this.accountType;
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
     * Gets the businessAccount property value. The type that defines the fields for the business account information.
     * @return a {@link BusinessAccount}
     */
    @jakarta.annotation.Nullable
    public BusinessAccount getBusinessAccount() {
        return this.businessAccount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("accountType", (n) -> { this.setAccountType(n.getStringValue()); });
        deserializerMap.put("businessAccount", (n) -> { this.setBusinessAccount(n.getObjectValue(BusinessAccount::createFromDiscriminatorValue)); });
        deserializerMap.put("individualAccount", (n) -> { this.setIndividualAccount(n.getObjectValue(IndividualAccount::createFromDiscriminatorValue)); });
        deserializerMap.put("registrationMarketplaceId", (n) -> { this.setRegistrationMarketplaceId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the individualAccount property value. The type that defines the fields for the information of an individual account.
     * @return a {@link IndividualAccount}
     */
    @jakarta.annotation.Nullable
    public IndividualAccount getIndividualAccount() {
        return this.individualAccount;
    }
    /**
     * Gets the registrationMarketplaceId property value. The eBay site on which the account is registered. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/identity/types/bas:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegistrationMarketplaceId() {
        return this.registrationMarketplaceId;
    }
    /**
     * Gets the status property value. Indicates the user&apos;s account status. Possible values: &lt;code&gt;CONFIRMED&lt;/code&gt;, &lt;code&gt;UNCONFIRMED&lt;/code&gt;, &lt;code&gt;ACCOUNTONHOLD&lt;/code&gt; and &lt;code&gt;UNDETERMINED&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/identity/types/api:UserStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the userId property value. The eBay immutable user ID of the user&apos;s account and can always be used to identify the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the username property value. The user name, which was specific by the user when they created the account. &lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; This value can be changed by the user.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUsername() {
        return this.username;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("accountType", this.getAccountType());
        writer.writeObjectValue("businessAccount", this.getBusinessAccount());
        writer.writeObjectValue("individualAccount", this.getIndividualAccount());
        writer.writeStringValue("registrationMarketplaceId", this.getRegistrationMarketplaceId());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("username", this.getUsername());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountType property value. Indicates the user account type. This is determined when the user registers with eBay. If they register for a business account, this value will be BUSINESS. If they register for a private account, this value will be INDIVIDUAL. This designation is required by the tax laws in the following countries:   &lt;br /&gt;&lt;br /&gt;EBAY_AT, EBAY_BE, EBAY_CH, EBAY_DE, EBAY_ES, EBAY_FR, EBAY_GB, EBAY_IE, EBAY_IT, EBAY_PL &lt;br /&gt;&lt;br /&gt;&lt;b&gt; Valid Values:&lt;/b&gt; BUSINESS or INDIVIDUAL &lt;br /&gt;&lt;br /&gt;Code so that your app gracefully handles any future changes to this list. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/identity/types/api:AccountTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the accountType property.
     */
    public void setAccountType(@jakarta.annotation.Nullable final String value) {
        this.accountType = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the businessAccount property value. The type that defines the fields for the business account information.
     * @param value Value to set for the businessAccount property.
     */
    public void setBusinessAccount(@jakarta.annotation.Nullable final BusinessAccount value) {
        this.businessAccount = value;
    }
    /**
     * Sets the individualAccount property value. The type that defines the fields for the information of an individual account.
     * @param value Value to set for the individualAccount property.
     */
    public void setIndividualAccount(@jakarta.annotation.Nullable final IndividualAccount value) {
        this.individualAccount = value;
    }
    /**
     * Sets the registrationMarketplaceId property value. The eBay site on which the account is registered. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/identity/types/bas:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the registrationMarketplaceId property.
     */
    public void setRegistrationMarketplaceId(@jakarta.annotation.Nullable final String value) {
        this.registrationMarketplaceId = value;
    }
    /**
     * Sets the status property value. Indicates the user&apos;s account status. Possible values: &lt;code&gt;CONFIRMED&lt;/code&gt;, &lt;code&gt;UNCONFIRMED&lt;/code&gt;, &lt;code&gt;ACCOUNTONHOLD&lt;/code&gt; and &lt;code&gt;UNDETERMINED&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/identity/types/api:UserStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the userId property value. The eBay immutable user ID of the user&apos;s account and can always be used to identify the user.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the username property value. The user name, which was specific by the user when they created the account. &lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; This value can be changed by the user.&lt;/span&gt;
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
