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
 * This type returns information on the packages being retrieved based on the specified line item ID. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetItemPackageIdResponsesData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the package.
     */
    private String packageId;
    /**
     * The current status of the package. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:PackageStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String packageStatus;
    /**
     * The tracking number of the package.
     */
    private String trackingNumber;
    /**
     * Instantiates a new {@link GetItemPackageIdResponsesData} and sets the default values.
     */
    public GetItemPackageIdResponsesData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetItemPackageIdResponsesData}
     */
    @jakarta.annotation.Nonnull
    public static GetItemPackageIdResponsesData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetItemPackageIdResponsesData();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("packageId", (n) -> { this.setPackageId(n.getStringValue()); });
        deserializerMap.put("packageStatus", (n) -> { this.setPackageStatus(n.getStringValue()); });
        deserializerMap.put("trackingNumber", (n) -> { this.setTrackingNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the packageId property value. The unique identifier of the package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackageId() {
        return this.packageId;
    }
    /**
     * Gets the packageStatus property value. The current status of the package. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:PackageStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackageStatus() {
        return this.packageStatus;
    }
    /**
     * Gets the trackingNumber property value. The tracking number of the package.
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
        writer.writeStringValue("packageId", this.getPackageId());
        writer.writeStringValue("packageStatus", this.getPackageStatus());
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
     * Sets the packageId property value. The unique identifier of the package.
     * @param value Value to set for the packageId property.
     */
    public void setPackageId(@jakarta.annotation.Nullable final String value) {
        this.packageId = value;
    }
    /**
     * Sets the packageStatus property value. The current status of the package. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:PackageStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the packageStatus property.
     */
    public void setPackageStatus(@jakarta.annotation.Nullable final String value) {
        this.packageStatus = value;
    }
    /**
     * Sets the trackingNumber property value. The tracking number of the package.
     * @param value Value to set for the trackingNumber property.
     */
    public void setTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.trackingNumber = value;
    }
}
