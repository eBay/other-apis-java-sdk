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
     * Indicates the user account type. This is determined when the user registers with eBay. If they register for a business account, this value will be &lt;code&gt;BUSINESS&lt;/code&gt;. If they register for a private account, this value will be &lt;code&gt;INDIVIDUAL&lt;/code&gt;. This designation is required by the tax laws in the following countries:   &lt;ul&gt;&lt;li&gt;EBAY_AT&lt;/li&gt;&lt;li&gt;EBAY_BE&lt;/li&gt;&lt;li&gt;EBAY_CH&lt;/li&gt;&lt;li&gt;EBAY_DE&lt;/li&gt;&lt;li&gt;EBAY_ES&lt;/li&gt;&lt;li&gt;EBAY_FR&lt;/li&gt;&lt;li&gt;EBAY_GB&lt;/li&gt;&lt;li&gt;EBAY_IE&lt;/li&gt;&lt;li&gt;EBAY_IT&lt;/li&gt;&lt;li&gt;EBAY_PL&lt;/li&gt;&lt;/ul&gt; &lt;br /&gt;&lt;b&gt; Valid Values:&lt;/b&gt; &lt;code&gt;BUSINESS&lt;/code&gt; or &lt;code&gt;INDIVIDUAL&lt;/code&gt; &lt;br /&gt;&lt;br /&gt;Code so that your app gracefully handles any future changes to this list.
     */
    private AccountTypeEnum accountType;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The container that returns the business account information of the user.
     */
    private BusinessAccount businessAccount;
    /**
     * The account information of the user.
     */
    private IndividualAccount individualAccount;
    /**
     * The unique identifier for the eBay marketplace in which the user registered their account.
     */
    private MarketplaceIdEnum registrationMarketplaceId;
    /**
     * The current status of the user&apos;s eBay account, such as whether it is confirmed, unconfirmed, on hold, or undetermined.
     */
    private UserStatusEnum status;
    /**
     * The eBay immutable user ID of the user&apos;s account and can always be used to identify the user.
     */
    private String userId;
    /**
     * The user name, which was specified by the user when they created the account. &lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; This value can be changed by the user.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
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
     * Gets the accountType property value. Indicates the user account type. This is determined when the user registers with eBay. If they register for a business account, this value will be &lt;code&gt;BUSINESS&lt;/code&gt;. If they register for a private account, this value will be &lt;code&gt;INDIVIDUAL&lt;/code&gt;. This designation is required by the tax laws in the following countries:   &lt;ul&gt;&lt;li&gt;EBAY_AT&lt;/li&gt;&lt;li&gt;EBAY_BE&lt;/li&gt;&lt;li&gt;EBAY_CH&lt;/li&gt;&lt;li&gt;EBAY_DE&lt;/li&gt;&lt;li&gt;EBAY_ES&lt;/li&gt;&lt;li&gt;EBAY_FR&lt;/li&gt;&lt;li&gt;EBAY_GB&lt;/li&gt;&lt;li&gt;EBAY_IE&lt;/li&gt;&lt;li&gt;EBAY_IT&lt;/li&gt;&lt;li&gt;EBAY_PL&lt;/li&gt;&lt;/ul&gt; &lt;br /&gt;&lt;b&gt; Valid Values:&lt;/b&gt; &lt;code&gt;BUSINESS&lt;/code&gt; or &lt;code&gt;INDIVIDUAL&lt;/code&gt; &lt;br /&gt;&lt;br /&gt;Code so that your app gracefully handles any future changes to this list.
     * @return a {@link AccountTypeEnum}
     */
    @jakarta.annotation.Nullable
    public AccountTypeEnum getAccountType() {
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
     * Gets the businessAccount property value. The container that returns the business account information of the user.
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
        deserializerMap.put("accountType", (n) -> { this.setAccountType(n.getEnumValue(AccountTypeEnum::forValue)); });
        deserializerMap.put("businessAccount", (n) -> { this.setBusinessAccount(n.getObjectValue(BusinessAccount::createFromDiscriminatorValue)); });
        deserializerMap.put("individualAccount", (n) -> { this.setIndividualAccount(n.getObjectValue(IndividualAccount::createFromDiscriminatorValue)); });
        deserializerMap.put("registrationMarketplaceId", (n) -> { this.setRegistrationMarketplaceId(n.getEnumValue(MarketplaceIdEnum::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(UserStatusEnum::forValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the individualAccount property value. The account information of the user.
     * @return a {@link IndividualAccount}
     */
    @jakarta.annotation.Nullable
    public IndividualAccount getIndividualAccount() {
        return this.individualAccount;
    }
    /**
     * Gets the registrationMarketplaceId property value. The unique identifier for the eBay marketplace in which the user registered their account.
     * @return a {@link MarketplaceIdEnum}
     */
    @jakarta.annotation.Nullable
    public MarketplaceIdEnum getRegistrationMarketplaceId() {
        return this.registrationMarketplaceId;
    }
    /**
     * Gets the status property value. The current status of the user&apos;s eBay account, such as whether it is confirmed, unconfirmed, on hold, or undetermined.
     * @return a {@link UserStatusEnum}
     */
    @jakarta.annotation.Nullable
    public UserStatusEnum getStatus() {
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
     * Gets the username property value. The user name, which was specified by the user when they created the account. &lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; This value can be changed by the user.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
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
        writer.writeEnumValue("accountType", this.getAccountType());
        writer.writeObjectValue("businessAccount", this.getBusinessAccount());
        writer.writeObjectValue("individualAccount", this.getIndividualAccount());
        writer.writeEnumValue("registrationMarketplaceId", this.getRegistrationMarketplaceId());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("username", this.getUsername());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountType property value. Indicates the user account type. This is determined when the user registers with eBay. If they register for a business account, this value will be &lt;code&gt;BUSINESS&lt;/code&gt;. If they register for a private account, this value will be &lt;code&gt;INDIVIDUAL&lt;/code&gt;. This designation is required by the tax laws in the following countries:   &lt;ul&gt;&lt;li&gt;EBAY_AT&lt;/li&gt;&lt;li&gt;EBAY_BE&lt;/li&gt;&lt;li&gt;EBAY_CH&lt;/li&gt;&lt;li&gt;EBAY_DE&lt;/li&gt;&lt;li&gt;EBAY_ES&lt;/li&gt;&lt;li&gt;EBAY_FR&lt;/li&gt;&lt;li&gt;EBAY_GB&lt;/li&gt;&lt;li&gt;EBAY_IE&lt;/li&gt;&lt;li&gt;EBAY_IT&lt;/li&gt;&lt;li&gt;EBAY_PL&lt;/li&gt;&lt;/ul&gt; &lt;br /&gt;&lt;b&gt; Valid Values:&lt;/b&gt; &lt;code&gt;BUSINESS&lt;/code&gt; or &lt;code&gt;INDIVIDUAL&lt;/code&gt; &lt;br /&gt;&lt;br /&gt;Code so that your app gracefully handles any future changes to this list.
     * @param value Value to set for the accountType property.
     */
    public void setAccountType(@jakarta.annotation.Nullable final AccountTypeEnum value) {
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
     * Sets the businessAccount property value. The container that returns the business account information of the user.
     * @param value Value to set for the businessAccount property.
     */
    public void setBusinessAccount(@jakarta.annotation.Nullable final BusinessAccount value) {
        this.businessAccount = value;
    }
    /**
     * Sets the individualAccount property value. The account information of the user.
     * @param value Value to set for the individualAccount property.
     */
    public void setIndividualAccount(@jakarta.annotation.Nullable final IndividualAccount value) {
        this.individualAccount = value;
    }
    /**
     * Sets the registrationMarketplaceId property value. The unique identifier for the eBay marketplace in which the user registered their account.
     * @param value Value to set for the registrationMarketplaceId property.
     */
    public void setRegistrationMarketplaceId(@jakarta.annotation.Nullable final MarketplaceIdEnum value) {
        this.registrationMarketplaceId = value;
    }
    /**
     * Sets the status property value. The current status of the user&apos;s eBay account, such as whether it is confirmed, unconfirmed, on hold, or undetermined.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final UserStatusEnum value) {
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
     * Sets the username property value. The user name, which was specified by the user when they created the account. &lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; This value can be changed by the user.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
