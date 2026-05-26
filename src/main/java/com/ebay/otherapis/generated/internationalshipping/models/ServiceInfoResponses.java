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
 * This type specifies the shipping service information.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceInfoResponses implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Basic shipping service information in English.
     */
    private String descriptionEn;
    /**
     * Basic shipping service information in traditional Chinese.
     */
    private String descriptionHk;
    /**
     * Basic shipping service information in Japanese.
     */
    private String descriptionJp;
    /**
     * Basic shipping service information in simplified Chinese.
     */
    private String descriptionZh;
    /**
     * This array lists includes all Ship From/Ship To combinations that the service supports. It also includes the type of batteries that may be shipping using the shipping service.
     */
    private java.util.List<DirectionsResponses> directions;
    /**
     * The incoterm information associated with the the shipping service.&lt;br&gt;&lt;br&gt;&lt;b&gt;Supported values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;DDP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DDU&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:IncotermEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String incoterm;
    /**
     * This value indicates the maximum length (in centimeters) of the shipping package that the shipping service allows.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     */
    private Double maxLength;
    /**
     * This value indicates the total maximum value of the length, width, and height of the package.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     */
    private Double maxTotalLength;
    /**
     * This value indicates the maximum weight (in grams) of the shipping package that the shipping service allows.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     */
    private Double maxWeight;
    /**
     * The shipping service name in English
     */
    private String nameEn;
    /**
     * The shipping service name in traditional Chinese
     */
    private String nameHk;
    /**
     * The shipping service name in Japanese.
     */
    private String nameJp;
    /**
     * The shipping service name in simplified Chinese
     */
    private String nameZh;
    /**
     * The unique identifier of the shipping service being retrieved.&lt;br&gt;&lt;br&gt;This value can be input in the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/package/methods/createPackage#request.packageInfo.shippingServiceId&quot; target=&quot;_blank&quot;&gt;shippingServiceId&lt;/a&gt; field when creating a package through the the &lt;b&gt;createPackage&lt;/b&gt; method.
     */
    private String shippingServiceId;
    /**
     * Instantiates a new {@link ServiceInfoResponses} and sets the default values.
     */
    public ServiceInfoResponses() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ServiceInfoResponses}
     */
    @jakarta.annotation.Nonnull
    public static ServiceInfoResponses createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceInfoResponses();
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
     * Gets the descriptionEn property value. Basic shipping service information in English.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescriptionEn() {
        return this.descriptionEn;
    }
    /**
     * Gets the descriptionHk property value. Basic shipping service information in traditional Chinese.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescriptionHk() {
        return this.descriptionHk;
    }
    /**
     * Gets the descriptionJp property value. Basic shipping service information in Japanese.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescriptionJp() {
        return this.descriptionJp;
    }
    /**
     * Gets the descriptionZh property value. Basic shipping service information in simplified Chinese.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescriptionZh() {
        return this.descriptionZh;
    }
    /**
     * Gets the directions property value. This array lists includes all Ship From/Ship To combinations that the service supports. It also includes the type of batteries that may be shipping using the shipping service.
     * @return a {@link java.util.List<DirectionsResponses>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectionsResponses> getDirections() {
        return this.directions;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("descriptionEn", (n) -> { this.setDescriptionEn(n.getStringValue()); });
        deserializerMap.put("descriptionHk", (n) -> { this.setDescriptionHk(n.getStringValue()); });
        deserializerMap.put("descriptionJp", (n) -> { this.setDescriptionJp(n.getStringValue()); });
        deserializerMap.put("descriptionZh", (n) -> { this.setDescriptionZh(n.getStringValue()); });
        deserializerMap.put("directions", (n) -> { this.setDirections(n.getCollectionOfObjectValues(DirectionsResponses::createFromDiscriminatorValue)); });
        deserializerMap.put("incoterm", (n) -> { this.setIncoterm(n.getStringValue()); });
        deserializerMap.put("maxLength", (n) -> { this.setMaxLength(n.getDoubleValue()); });
        deserializerMap.put("maxTotalLength", (n) -> { this.setMaxTotalLength(n.getDoubleValue()); });
        deserializerMap.put("maxWeight", (n) -> { this.setMaxWeight(n.getDoubleValue()); });
        deserializerMap.put("nameEn", (n) -> { this.setNameEn(n.getStringValue()); });
        deserializerMap.put("nameHk", (n) -> { this.setNameHk(n.getStringValue()); });
        deserializerMap.put("nameJp", (n) -> { this.setNameJp(n.getStringValue()); });
        deserializerMap.put("nameZh", (n) -> { this.setNameZh(n.getStringValue()); });
        deserializerMap.put("shippingServiceId", (n) -> { this.setShippingServiceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the incoterm property value. The incoterm information associated with the the shipping service.&lt;br&gt;&lt;br&gt;&lt;b&gt;Supported values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;DDP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DDU&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:IncotermEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIncoterm() {
        return this.incoterm;
    }
    /**
     * Gets the maxLength property value. This value indicates the maximum length (in centimeters) of the shipping package that the shipping service allows.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxLength() {
        return this.maxLength;
    }
    /**
     * Gets the maxTotalLength property value. This value indicates the total maximum value of the length, width, and height of the package.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxTotalLength() {
        return this.maxTotalLength;
    }
    /**
     * Gets the maxWeight property value. This value indicates the maximum weight (in grams) of the shipping package that the shipping service allows.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxWeight() {
        return this.maxWeight;
    }
    /**
     * Gets the nameEn property value. The shipping service name in English
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNameEn() {
        return this.nameEn;
    }
    /**
     * Gets the nameHk property value. The shipping service name in traditional Chinese
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNameHk() {
        return this.nameHk;
    }
    /**
     * Gets the nameJp property value. The shipping service name in Japanese.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNameJp() {
        return this.nameJp;
    }
    /**
     * Gets the nameZh property value. The shipping service name in simplified Chinese
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNameZh() {
        return this.nameZh;
    }
    /**
     * Gets the shippingServiceId property value. The unique identifier of the shipping service being retrieved.&lt;br&gt;&lt;br&gt;This value can be input in the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/package/methods/createPackage#request.packageInfo.shippingServiceId&quot; target=&quot;_blank&quot;&gt;shippingServiceId&lt;/a&gt; field when creating a package through the the &lt;b&gt;createPackage&lt;/b&gt; method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingServiceId() {
        return this.shippingServiceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("descriptionEn", this.getDescriptionEn());
        writer.writeStringValue("descriptionHk", this.getDescriptionHk());
        writer.writeStringValue("descriptionJp", this.getDescriptionJp());
        writer.writeStringValue("descriptionZh", this.getDescriptionZh());
        writer.writeCollectionOfObjectValues("directions", this.getDirections());
        writer.writeStringValue("incoterm", this.getIncoterm());
        writer.writeDoubleValue("maxLength", this.getMaxLength());
        writer.writeDoubleValue("maxTotalLength", this.getMaxTotalLength());
        writer.writeDoubleValue("maxWeight", this.getMaxWeight());
        writer.writeStringValue("nameEn", this.getNameEn());
        writer.writeStringValue("nameHk", this.getNameHk());
        writer.writeStringValue("nameJp", this.getNameJp());
        writer.writeStringValue("nameZh", this.getNameZh());
        writer.writeStringValue("shippingServiceId", this.getShippingServiceId());
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
     * Sets the descriptionEn property value. Basic shipping service information in English.
     * @param value Value to set for the descriptionEn property.
     */
    public void setDescriptionEn(@jakarta.annotation.Nullable final String value) {
        this.descriptionEn = value;
    }
    /**
     * Sets the descriptionHk property value. Basic shipping service information in traditional Chinese.
     * @param value Value to set for the descriptionHk property.
     */
    public void setDescriptionHk(@jakarta.annotation.Nullable final String value) {
        this.descriptionHk = value;
    }
    /**
     * Sets the descriptionJp property value. Basic shipping service information in Japanese.
     * @param value Value to set for the descriptionJp property.
     */
    public void setDescriptionJp(@jakarta.annotation.Nullable final String value) {
        this.descriptionJp = value;
    }
    /**
     * Sets the descriptionZh property value. Basic shipping service information in simplified Chinese.
     * @param value Value to set for the descriptionZh property.
     */
    public void setDescriptionZh(@jakarta.annotation.Nullable final String value) {
        this.descriptionZh = value;
    }
    /**
     * Sets the directions property value. This array lists includes all Ship From/Ship To combinations that the service supports. It also includes the type of batteries that may be shipping using the shipping service.
     * @param value Value to set for the directions property.
     */
    public void setDirections(@jakarta.annotation.Nullable final java.util.List<DirectionsResponses> value) {
        this.directions = value;
    }
    /**
     * Sets the incoterm property value. The incoterm information associated with the the shipping service.&lt;br&gt;&lt;br&gt;&lt;b&gt;Supported values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;DDP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DDU&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/edelivery_international_shipping/types/api:IncotermEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the incoterm property.
     */
    public void setIncoterm(@jakarta.annotation.Nullable final String value) {
        this.incoterm = value;
    }
    /**
     * Sets the maxLength property value. This value indicates the maximum length (in centimeters) of the shipping package that the shipping service allows.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @param value Value to set for the maxLength property.
     */
    public void setMaxLength(@jakarta.annotation.Nullable final Double value) {
        this.maxLength = value;
    }
    /**
     * Sets the maxTotalLength property value. This value indicates the total maximum value of the length, width, and height of the package.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @param value Value to set for the maxTotalLength property.
     */
    public void setMaxTotalLength(@jakarta.annotation.Nullable final Double value) {
        this.maxTotalLength = value;
    }
    /**
     * Sets the maxWeight property value. This value indicates the maximum weight (in grams) of the shipping package that the shipping service allows.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @param value Value to set for the maxWeight property.
     */
    public void setMaxWeight(@jakarta.annotation.Nullable final Double value) {
        this.maxWeight = value;
    }
    /**
     * Sets the nameEn property value. The shipping service name in English
     * @param value Value to set for the nameEn property.
     */
    public void setNameEn(@jakarta.annotation.Nullable final String value) {
        this.nameEn = value;
    }
    /**
     * Sets the nameHk property value. The shipping service name in traditional Chinese
     * @param value Value to set for the nameHk property.
     */
    public void setNameHk(@jakarta.annotation.Nullable final String value) {
        this.nameHk = value;
    }
    /**
     * Sets the nameJp property value. The shipping service name in Japanese.
     * @param value Value to set for the nameJp property.
     */
    public void setNameJp(@jakarta.annotation.Nullable final String value) {
        this.nameJp = value;
    }
    /**
     * Sets the nameZh property value. The shipping service name in simplified Chinese
     * @param value Value to set for the nameZh property.
     */
    public void setNameZh(@jakarta.annotation.Nullable final String value) {
        this.nameZh = value;
    }
    /**
     * Sets the shippingServiceId property value. The unique identifier of the shipping service being retrieved.&lt;br&gt;&lt;br&gt;This value can be input in the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/package/methods/createPackage#request.packageInfo.shippingServiceId&quot; target=&quot;_blank&quot;&gt;shippingServiceId&lt;/a&gt; field when creating a package through the the &lt;b&gt;createPackage&lt;/b&gt; method.
     * @param value Value to set for the shippingServiceId property.
     */
    public void setShippingServiceId(@jakarta.annotation.Nullable final String value) {
        this.shippingServiceId = value;
    }
}
