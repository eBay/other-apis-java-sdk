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

package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields that describe a EU AR agents preferences.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentPreferenceListResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The eBay ID of the EU AR agent.
     */
    private String ebayId;
    /**
     * The two-letter ISO 3166 code of the shipping country that an EU AR agent supports.
     */
    private String shippingCountry;
    /**
     * Instantiates a new {@link AgentPreferenceListResponse} and sets the default values.
     */
    public AgentPreferenceListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentPreferenceListResponse}
     */
    @jakarta.annotation.Nonnull
    public static AgentPreferenceListResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentPreferenceListResponse();
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
     * Gets the ebayId property value. The eBay ID of the EU AR agent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEbayId() {
        return this.ebayId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("ebayId", (n) -> { this.setEbayId(n.getStringValue()); });
        deserializerMap.put("shippingCountry", (n) -> { this.setShippingCountry(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the shippingCountry property value. The two-letter ISO 3166 code of the shipping country that an EU AR agent supports.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCountry() {
        return this.shippingCountry;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ebayId", this.getEbayId());
        writer.writeStringValue("shippingCountry", this.getShippingCountry());
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
     * Sets the ebayId property value. The eBay ID of the EU AR agent.
     * @param value Value to set for the ebayId property.
     */
    public void setEbayId(@jakarta.annotation.Nullable final String value) {
        this.ebayId = value;
    }
    /**
     * Sets the shippingCountry property value. The two-letter ISO 3166 code of the shipping country that an EU AR agent supports.
     * @param value Value to set for the shippingCountry property.
     */
    public void setShippingCountry(@jakarta.annotation.Nullable final String value) {
        this.shippingCountry = value;
    }
}
