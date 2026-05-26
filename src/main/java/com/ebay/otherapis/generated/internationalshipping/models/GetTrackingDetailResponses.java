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
 * This container defines the response container for the &lt;b&gt;getTracking&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetTrackingDetailResponses implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array returns a list of tracking event details for the specified tracking number.
     */
    private java.util.List<GetTrackingDetailResponsesData> trackingDetails;
    /**
     * Instantiates a new {@link GetTrackingDetailResponses} and sets the default values.
     */
    public GetTrackingDetailResponses() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetTrackingDetailResponses}
     */
    @jakarta.annotation.Nonnull
    public static GetTrackingDetailResponses createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetTrackingDetailResponses();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("trackingDetails", (n) -> { this.setTrackingDetails(n.getCollectionOfObjectValues(GetTrackingDetailResponsesData::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the trackingDetails property value. This array returns a list of tracking event details for the specified tracking number.
     * @return a {@link java.util.List<GetTrackingDetailResponsesData>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GetTrackingDetailResponsesData> getTrackingDetails() {
        return this.trackingDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("trackingDetails", this.getTrackingDetails());
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
     * Sets the trackingDetails property value. This array returns a list of tracking event details for the specified tracking number.
     * @param value Value to set for the trackingDetails property.
     */
    public void setTrackingDetails(@jakarta.annotation.Nullable final java.util.List<GetTrackingDetailResponsesData> value) {
        this.trackingDetails = value;
    }
}
