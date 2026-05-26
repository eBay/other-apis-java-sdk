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
 * This type specifies information about the newly created package, such as its estimated costs, tracking number, and package ID value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddPackageResponsesData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines the monetary value of an amount. 
     */
    private Amount estimateCost;
    /**
     * The last-mile tracking number of the package.&lt;br&gt;&lt;br&gt;This field is only returned if the last-mile tracking number is provided by the carrier.
     */
    private String lastMileTrackingNumber;
    /**
     * The unique identifier of the created package.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of the returned &lt;b&gt;packageId&lt;/b&gt;, as there is no programmatic way to retrieve this value at this time.&lt;/span&gt;
     */
    private String packageId;
    /**
     * This type defines the monetary value of an amount. 
     */
    private Amount paymentCost;
    /**
     * The tracking number of the created package.
     */
    private String trackingNumber;
    /**
     * Instantiates a new {@link AddPackageResponsesData} and sets the default values.
     */
    public AddPackageResponsesData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AddPackageResponsesData}
     */
    @jakarta.annotation.Nonnull
    public static AddPackageResponsesData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddPackageResponsesData();
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
     * Gets the estimateCost property value. This type defines the monetary value of an amount. 
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getEstimateCost() {
        return this.estimateCost;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("estimateCost", (n) -> { this.setEstimateCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("lastMileTrackingNumber", (n) -> { this.setLastMileTrackingNumber(n.getStringValue()); });
        deserializerMap.put("packageId", (n) -> { this.setPackageId(n.getStringValue()); });
        deserializerMap.put("paymentCost", (n) -> { this.setPaymentCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("trackingNumber", (n) -> { this.setTrackingNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastMileTrackingNumber property value. The last-mile tracking number of the package.&lt;br&gt;&lt;br&gt;This field is only returned if the last-mile tracking number is provided by the carrier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastMileTrackingNumber() {
        return this.lastMileTrackingNumber;
    }
    /**
     * Gets the packageId property value. The unique identifier of the created package.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of the returned &lt;b&gt;packageId&lt;/b&gt;, as there is no programmatic way to retrieve this value at this time.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackageId() {
        return this.packageId;
    }
    /**
     * Gets the paymentCost property value. This type defines the monetary value of an amount. 
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPaymentCost() {
        return this.paymentCost;
    }
    /**
     * Gets the trackingNumber property value. The tracking number of the created package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTrackingNumber() {
        return this.trackingNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("estimateCost", this.getEstimateCost());
        writer.writeStringValue("lastMileTrackingNumber", this.getLastMileTrackingNumber());
        writer.writeStringValue("packageId", this.getPackageId());
        writer.writeObjectValue("paymentCost", this.getPaymentCost());
        writer.writeStringValue("trackingNumber", this.getTrackingNumber());
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
     * Sets the estimateCost property value. This type defines the monetary value of an amount. 
     * @param value Value to set for the estimateCost property.
     */
    public void setEstimateCost(@jakarta.annotation.Nullable final Amount value) {
        this.estimateCost = value;
    }
    /**
     * Sets the lastMileTrackingNumber property value. The last-mile tracking number of the package.&lt;br&gt;&lt;br&gt;This field is only returned if the last-mile tracking number is provided by the carrier.
     * @param value Value to set for the lastMileTrackingNumber property.
     */
    public void setLastMileTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.lastMileTrackingNumber = value;
    }
    /**
     * Sets the packageId property value. The unique identifier of the created package.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of the returned &lt;b&gt;packageId&lt;/b&gt;, as there is no programmatic way to retrieve this value at this time.&lt;/span&gt;
     * @param value Value to set for the packageId property.
     */
    public void setPackageId(@jakarta.annotation.Nullable final String value) {
        this.packageId = value;
    }
    /**
     * Sets the paymentCost property value. This type defines the monetary value of an amount. 
     * @param value Value to set for the paymentCost property.
     */
    public void setPaymentCost(@jakarta.annotation.Nullable final Amount value) {
        this.paymentCost = value;
    }
    /**
     * Sets the trackingNumber property value. The tracking number of the created package.
     * @param value Value to set for the trackingNumber property.
     */
    public void setTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.trackingNumber = value;
    }
}
