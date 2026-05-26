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
 * This type specifies the tracking event details for the specified tracking number.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetTrackingDetailResponsesData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The city code in which the tracking event occurred.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid city codes.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     */
    private String city;
    /**
     * The two-letter ISO 3166 country code where the tracking event occurred.
     */
    private String country;
    /**
     * The English description of the tracking event.
     */
    private String descriptionEn;
    /**
     * The Chinese description of the tracking event.
     */
    private String descriptionZh;
    /**
     * The district code where the tracking event occurred.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid district codes.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     */
    private String district;
    /**
     * The postal code of where the tracking event occurred.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     */
    private String eventPostalCode;
    /**
     * This timestamp the time and date the tracking event occurred.
     */
    private String eventTime;
    /**
     * The province code where the tracking event occurred.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for province district codes.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     */
    private String province;
    /**
     * The status of the shipment.
     */
    private String status;
    /**
     * The tracking number specified in the request.
     */
    private String trackingNumber;
    /**
     * Instantiates a new {@link GetTrackingDetailResponsesData} and sets the default values.
     */
    public GetTrackingDetailResponsesData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetTrackingDetailResponsesData}
     */
    @jakarta.annotation.Nonnull
    public static GetTrackingDetailResponsesData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetTrackingDetailResponsesData();
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
     * Gets the city property value. The city code in which the tracking event occurred.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid city codes.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the country property value. The two-letter ISO 3166 country code where the tracking event occurred.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the descriptionEn property value. The English description of the tracking event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescriptionEn() {
        return this.descriptionEn;
    }
    /**
     * Gets the descriptionZh property value. The Chinese description of the tracking event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescriptionZh() {
        return this.descriptionZh;
    }
    /**
     * Gets the district property value. The district code where the tracking event occurred.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid district codes.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDistrict() {
        return this.district;
    }
    /**
     * Gets the eventPostalCode property value. The postal code of where the tracking event occurred.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventPostalCode() {
        return this.eventPostalCode;
    }
    /**
     * Gets the eventTime property value. This timestamp the time and date the tracking event occurred.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventTime() {
        return this.eventTime;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("descriptionEn", (n) -> { this.setDescriptionEn(n.getStringValue()); });
        deserializerMap.put("descriptionZh", (n) -> { this.setDescriptionZh(n.getStringValue()); });
        deserializerMap.put("district", (n) -> { this.setDistrict(n.getStringValue()); });
        deserializerMap.put("eventPostalCode", (n) -> { this.setEventPostalCode(n.getStringValue()); });
        deserializerMap.put("eventTime", (n) -> { this.setEventTime(n.getStringValue()); });
        deserializerMap.put("province", (n) -> { this.setProvince(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("trackingNumber", (n) -> { this.setTrackingNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the province property value. The province code where the tracking event occurred.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for province district codes.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvince() {
        return this.province;
    }
    /**
     * Gets the status property value. The status of the shipment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the trackingNumber property value. The tracking number specified in the request.
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
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("descriptionEn", this.getDescriptionEn());
        writer.writeStringValue("descriptionZh", this.getDescriptionZh());
        writer.writeStringValue("district", this.getDistrict());
        writer.writeStringValue("eventPostalCode", this.getEventPostalCode());
        writer.writeStringValue("eventTime", this.getEventTime());
        writer.writeStringValue("province", this.getProvince());
        writer.writeStringValue("status", this.getStatus());
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
     * Sets the city property value. The city code in which the tracking event occurred.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid city codes.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the country property value. The two-letter ISO 3166 country code where the tracking event occurred.
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the descriptionEn property value. The English description of the tracking event.
     * @param value Value to set for the descriptionEn property.
     */
    public void setDescriptionEn(@jakarta.annotation.Nullable final String value) {
        this.descriptionEn = value;
    }
    /**
     * Sets the descriptionZh property value. The Chinese description of the tracking event.
     * @param value Value to set for the descriptionZh property.
     */
    public void setDescriptionZh(@jakarta.annotation.Nullable final String value) {
        this.descriptionZh = value;
    }
    /**
     * Sets the district property value. The district code where the tracking event occurred.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for valid district codes.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @param value Value to set for the district property.
     */
    public void setDistrict(@jakarta.annotation.Nullable final String value) {
        this.district = value;
    }
    /**
     * Sets the eventPostalCode property value. The postal code of where the tracking event occurred.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @param value Value to set for the eventPostalCode property.
     */
    public void setEventPostalCode(@jakarta.annotation.Nullable final String value) {
        this.eventPostalCode = value;
    }
    /**
     * Sets the eventTime property value. This timestamp the time and date the tracking event occurred.
     * @param value Value to set for the eventTime property.
     */
    public void setEventTime(@jakarta.annotation.Nullable final String value) {
        this.eventTime = value;
    }
    /**
     * Sets the province property value. The province code where the tracking event occurred.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;https://www.edisebay.com/open/development-guide-detail?id=36&quot; target=&quot;_blank&quot;&gt;API&lt;/a&gt; for province district codes.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is always returned, but will show as null or have an empty value if not defined/applicable.&lt;/span&gt;
     * @param value Value to set for the province property.
     */
    public void setProvince(@jakarta.annotation.Nullable final String value) {
        this.province = value;
    }
    /**
     * Sets the status property value. The status of the shipment.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the trackingNumber property value. The tracking number specified in the request.
     * @param value Value to set for the trackingNumber property.
     */
    public void setTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.trackingNumber = value;
    }
}
