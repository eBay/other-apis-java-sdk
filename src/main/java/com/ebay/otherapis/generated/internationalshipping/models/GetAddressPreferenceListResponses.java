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
 * This type defines the response container associated with the &lt;b&gt;getAddressPreferences&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetAddressPreferenceListResponses implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines the list of addresses associated with a eDIS account.
     */
    private GetAddressPreferenceListResponsesData addressPreferenceList;
    /**
     * Instantiates a new {@link GetAddressPreferenceListResponses} and sets the default values.
     */
    public GetAddressPreferenceListResponses() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetAddressPreferenceListResponses}
     */
    @jakarta.annotation.Nonnull
    public static GetAddressPreferenceListResponses createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetAddressPreferenceListResponses();
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
     * Gets the addressPreferenceList property value. This type defines the list of addresses associated with a eDIS account.
     * @return a {@link GetAddressPreferenceListResponsesData}
     */
    @jakarta.annotation.Nullable
    public GetAddressPreferenceListResponsesData getAddressPreferenceList() {
        return this.addressPreferenceList;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("addressPreferenceList", (n) -> { this.setAddressPreferenceList(n.getObjectValue(GetAddressPreferenceListResponsesData::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("addressPreferenceList", this.getAddressPreferenceList());
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
     * Sets the addressPreferenceList property value. This type defines the list of addresses associated with a eDIS account.
     * @param value Value to set for the addressPreferenceList property.
     */
    public void setAddressPreferenceList(@jakarta.annotation.Nullable final GetAddressPreferenceListResponsesData value) {
        this.addressPreferenceList = value;
    }
}
