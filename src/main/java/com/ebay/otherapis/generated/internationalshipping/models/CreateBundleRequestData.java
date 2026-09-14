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
 * This type defines the information used to create a bundle.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateBundleRequestData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the consign address to be associated with the bundle.&lt;br&gt;&lt;br&gt;This ID can be retrieved using the &lt;a href=&quot;/develop/api/sell/edelivery_international_shipping_api#sell-edelivery_international_shipping_api-consign_preference-getconsignpreferences&quot;&gt;getConsignPreferences&lt;/a&gt; method.
     */
    private String consignPreferenceId;
    /**
     * This array specifies the tracking numbers of the packages to be included in the bundle.&lt;br&gt;&lt;br&gt;Tracking numbers are returned when creating a package through the &lt;a href=&quot;/develop/api/sell/edelivery_international_shipping_api#sell-edelivery_international_shipping_api-package-createpackage&quot;&gt;createPackage&lt;/a&gt; method.
     */
    private java.util.List<String> trackingNumbers;
    /**
     * Instantiates a new {@link CreateBundleRequestData} and sets the default values.
     */
    public CreateBundleRequestData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateBundleRequestData}
     */
    @jakarta.annotation.Nonnull
    public static CreateBundleRequestData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateBundleRequestData();
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
     * Gets the consignPreferenceId property value. The unique identifier of the consign address to be associated with the bundle.&lt;br&gt;&lt;br&gt;This ID can be retrieved using the &lt;a href=&quot;/develop/api/sell/edelivery_international_shipping_api#sell-edelivery_international_shipping_api-consign_preference-getconsignpreferences&quot;&gt;getConsignPreferences&lt;/a&gt; method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConsignPreferenceId() {
        return this.consignPreferenceId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("consignPreferenceId", (n) -> { this.setConsignPreferenceId(n.getStringValue()); });
        deserializerMap.put("trackingNumbers", (n) -> { this.setTrackingNumbers(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the trackingNumbers property value. This array specifies the tracking numbers of the packages to be included in the bundle.&lt;br&gt;&lt;br&gt;Tracking numbers are returned when creating a package through the &lt;a href=&quot;/develop/api/sell/edelivery_international_shipping_api#sell-edelivery_international_shipping_api-package-createpackage&quot;&gt;createPackage&lt;/a&gt; method.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTrackingNumbers() {
        return this.trackingNumbers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("consignPreferenceId", this.getConsignPreferenceId());
        writer.writeCollectionOfPrimitiveValues("trackingNumbers", this.getTrackingNumbers());
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
     * Sets the consignPreferenceId property value. The unique identifier of the consign address to be associated with the bundle.&lt;br&gt;&lt;br&gt;This ID can be retrieved using the &lt;a href=&quot;/develop/api/sell/edelivery_international_shipping_api#sell-edelivery_international_shipping_api-consign_preference-getconsignpreferences&quot;&gt;getConsignPreferences&lt;/a&gt; method.
     * @param value Value to set for the consignPreferenceId property.
     */
    public void setConsignPreferenceId(@jakarta.annotation.Nullable final String value) {
        this.consignPreferenceId = value;
    }
    /**
     * Sets the trackingNumbers property value. This array specifies the tracking numbers of the packages to be included in the bundle.&lt;br&gt;&lt;br&gt;Tracking numbers are returned when creating a package through the &lt;a href=&quot;/develop/api/sell/edelivery_international_shipping_api#sell-edelivery_international_shipping_api-package-createpackage&quot;&gt;createPackage&lt;/a&gt; method.
     * @param value Value to set for the trackingNumbers property.
     */
    public void setTrackingNumbers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.trackingNumbers = value;
    }
}
