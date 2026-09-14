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

package com.ebay.otherapis.generated.veroapiv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the details of the item, live event, or shoppable video being reported for violating a product owner&apos;s copyright, trademark, or intellectual property rights.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportViolationDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The brand name of the item being reported for VeRO violation.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 50 characters
     */
    private String brand;
    /**
     * This array specifies a list of links to the location of the copyrighted work(s) you claim is being infringed upon. Each link must be specific to where the original work is located, as a link to a general webpage will not suffice.&lt;br&gt;&lt;br&gt;Up to &lt;b&gt;20&lt;/b&gt; entries may be supplied.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length per entry:&lt;/b&gt; 1500 characters
     */
    private java.util.List<String> copyrights;
    /**
     * If the infringement type stated in the &lt;b&gt;VeroReasonCodeId&lt;/b&gt; has anything to do with which country the item is being shipped to, each country that would trigger this infringement type should be specified in this comma-delimited array.&lt;br&gt;&lt;br&gt;This field is required when the &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;2861&lt;/code&gt; (Item(s) is unlawful importation of product bearing trademark).
     */
    private java.util.List<CountryCodeEnum> countries;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Not currently available. This field is reserved for a future release when &lt;code&gt;LIVE_EVENT&lt;/code&gt; reporting is supported.&lt;/span&gt;&lt;br&gt;The eBay live event identifier for the reported infringement.&lt;br&gt;&lt;br&gt;This field is required when &lt;b&gt;reportType&lt;/b&gt; is &lt;code&gt;LIVE_EVENT&lt;/code&gt;. This field is not applicable when &lt;b&gt;reportType&lt;/b&gt; is &lt;code&gt;LISTING&lt;/code&gt; or &lt;code&gt;SHOPPABLE_VIDEO&lt;/code&gt;.
     */
    private String eventId;
    /**
     * A description detailing how and where the rights owner&apos;s IP is being infringed upon.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     */
    private String evidenceOfIp;
    /**
     * The description of why you believe the item or listing infringes your rights.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     */
    private String infringementDescription;
    /**
     * The unique identifier of the listing being reported for the alleged infringement.
     */
    private String itemId;
    /**
     * This boolean indicates whether the infringement appears in the item description or not.
     */
    private Boolean listingDescriptionHasViolation;
    /**
     * This field is used by the VeRO Program member to provide more details to the seller as to why the item is being reported for the alleged infringement.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     */
    private String messageToSeller;
    /**
     * If the infringement type stated in the &lt;b&gt;veroReasonCodeId&lt;/b&gt; has anything to do with which geographical region the item is being shipped to, each region that would trigger this infringement type should be specified in this comma-delimited array. &lt;br&gt;&lt;br&gt;This field is required when the &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;2861&lt;/code&gt;.
     */
    private java.util.List<WorldRegionEnum> regions;
    /**
     * This field can be used to provide registration information if the applicable intellectual property right is registered (for example: registration number, IP office name, or link to registration).&lt;br&gt;&lt;br&gt;This field is required when &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;9031&lt;/code&gt;, &lt;code&gt;9036&lt;/code&gt;, &lt;code&gt;9048&lt;/code&gt;, or &lt;code&gt;9049&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     */
    private String registrationNumber;
    /**
     * This array is used to specify a list of URLs for images in the listing that you claim infringe your copyrighted work(s). You may right-click an image in the eBay listing and copy the image URL, or describe the infringing content in the listing.&lt;br&gt;&lt;br&gt;Up to &lt;b&gt;20&lt;/b&gt; image URLs may be supplied at any time.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length per URL:&lt;/b&gt; 1500 characters
     */
    private java.util.List<String> reportedImageUrls;
    /**
     * The time stamp indicating where the infringing content appears in the live event or shoppable video (for example, ISO-8601).&lt;br&gt;&lt;br&gt;This field is required when &lt;b&gt;reportType&lt;/b&gt; is &lt;code&gt;LIVE_EVENT&lt;/code&gt; or &lt;code&gt;SHOPPABLE_VIDEO&lt;/code&gt;.
     */
    private String timestamp;
    /**
     * The unique identifier for the type of claimed infringement.&lt;br&gt;&lt;br&gt;Use &lt;a href=&quot;/develop/api/sell/vero_api_v2#sell-vero_api_v2-vero_reason_code-getveroreasoncodes&quot; &gt;getVeroReasonCodes&lt;/a&gt; to retrieve a list of valid reason codes for a given eBay site.
     */
    private String veroReasonCodeId;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Not currently available. This field is reserved for a future release when &lt;code&gt;SHOPPABLE_VIDEO&lt;/code&gt; reporting is supported.&lt;/span&gt;&lt;br&gt;The shoppable video identifier for the reported infringement.&lt;br&gt;&lt;br&gt;This field is required when &lt;b&gt;reportType&lt;/b&gt; is &lt;code&gt;SHOPPABLE_VIDEO&lt;/code&gt;. This field is not applicable when &lt;b&gt;reportType&lt;/b&gt; is &lt;code&gt;LISTING&lt;/code&gt; or &lt;code&gt;LIVE_EVENT&lt;/code&gt;.
     */
    private String videoId;
    /**
     * Instantiates a new {@link ReportViolationDetails} and sets the default values.
     */
    public ReportViolationDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReportViolationDetails}
     */
    @jakarta.annotation.Nonnull
    public static ReportViolationDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportViolationDetails();
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
     * Gets the brand property value. The brand name of the item being reported for VeRO violation.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 50 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrand() {
        return this.brand;
    }
    /**
     * Gets the copyrights property value. This array specifies a list of links to the location of the copyrighted work(s) you claim is being infringed upon. Each link must be specific to where the original work is located, as a link to a general webpage will not suffice.&lt;br&gt;&lt;br&gt;Up to &lt;b&gt;20&lt;/b&gt; entries may be supplied.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length per entry:&lt;/b&gt; 1500 characters
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCopyrights() {
        return this.copyrights;
    }
    /**
     * Gets the countries property value. If the infringement type stated in the &lt;b&gt;VeroReasonCodeId&lt;/b&gt; has anything to do with which country the item is being shipped to, each country that would trigger this infringement type should be specified in this comma-delimited array.&lt;br&gt;&lt;br&gt;This field is required when the &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;2861&lt;/code&gt; (Item(s) is unlawful importation of product bearing trademark).
     * @return a {@link java.util.List<CountryCodeEnum>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CountryCodeEnum> getCountries() {
        return this.countries;
    }
    /**
     * Gets the eventId property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Not currently available. This field is reserved for a future release when &lt;code&gt;LIVE_EVENT&lt;/code&gt; reporting is supported.&lt;/span&gt;&lt;br&gt;The eBay live event identifier for the reported infringement.&lt;br&gt;&lt;br&gt;This field is required when &lt;b&gt;reportType&lt;/b&gt; is &lt;code&gt;LIVE_EVENT&lt;/code&gt;. This field is not applicable when &lt;b&gt;reportType&lt;/b&gt; is &lt;code&gt;LISTING&lt;/code&gt; or &lt;code&gt;SHOPPABLE_VIDEO&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventId() {
        return this.eventId;
    }
    /**
     * Gets the evidenceOfIp property value. A description detailing how and where the rights owner&apos;s IP is being infringed upon.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEvidenceOfIp() {
        return this.evidenceOfIp;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("brand", (n) -> { this.setBrand(n.getStringValue()); });
        deserializerMap.put("copyrights", (n) -> { this.setCopyrights(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("countries", (n) -> { this.setCountries(n.getCollectionOfEnumValues(CountryCodeEnum::forValue)); });
        deserializerMap.put("eventId", (n) -> { this.setEventId(n.getStringValue()); });
        deserializerMap.put("evidenceOfIp", (n) -> { this.setEvidenceOfIp(n.getStringValue()); });
        deserializerMap.put("infringementDescription", (n) -> { this.setInfringementDescription(n.getStringValue()); });
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getStringValue()); });
        deserializerMap.put("listingDescriptionHasViolation", (n) -> { this.setListingDescriptionHasViolation(n.getBooleanValue()); });
        deserializerMap.put("messageToSeller", (n) -> { this.setMessageToSeller(n.getStringValue()); });
        deserializerMap.put("regions", (n) -> { this.setRegions(n.getCollectionOfEnumValues(WorldRegionEnum::forValue)); });
        deserializerMap.put("registrationNumber", (n) -> { this.setRegistrationNumber(n.getStringValue()); });
        deserializerMap.put("reportedImageUrls", (n) -> { this.setReportedImageUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getStringValue()); });
        deserializerMap.put("veroReasonCodeId", (n) -> { this.setVeroReasonCodeId(n.getStringValue()); });
        deserializerMap.put("videoId", (n) -> { this.setVideoId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the infringementDescription property value. The description of why you believe the item or listing infringes your rights.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInfringementDescription() {
        return this.infringementDescription;
    }
    /**
     * Gets the itemId property value. The unique identifier of the listing being reported for the alleged infringement.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getItemId() {
        return this.itemId;
    }
    /**
     * Gets the listingDescriptionHasViolation property value. This boolean indicates whether the infringement appears in the item description or not.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getListingDescriptionHasViolation() {
        return this.listingDescriptionHasViolation;
    }
    /**
     * Gets the messageToSeller property value. This field is used by the VeRO Program member to provide more details to the seller as to why the item is being reported for the alleged infringement.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessageToSeller() {
        return this.messageToSeller;
    }
    /**
     * Gets the regions property value. If the infringement type stated in the &lt;b&gt;veroReasonCodeId&lt;/b&gt; has anything to do with which geographical region the item is being shipped to, each region that would trigger this infringement type should be specified in this comma-delimited array. &lt;br&gt;&lt;br&gt;This field is required when the &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;2861&lt;/code&gt;.
     * @return a {@link java.util.List<WorldRegionEnum>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorldRegionEnum> getRegions() {
        return this.regions;
    }
    /**
     * Gets the registrationNumber property value. This field can be used to provide registration information if the applicable intellectual property right is registered (for example: registration number, IP office name, or link to registration).&lt;br&gt;&lt;br&gt;This field is required when &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;9031&lt;/code&gt;, &lt;code&gt;9036&lt;/code&gt;, &lt;code&gt;9048&lt;/code&gt;, or &lt;code&gt;9049&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }
    /**
     * Gets the reportedImageUrls property value. This array is used to specify a list of URLs for images in the listing that you claim infringe your copyrighted work(s). You may right-click an image in the eBay listing and copy the image URL, or describe the infringing content in the listing.&lt;br&gt;&lt;br&gt;Up to &lt;b&gt;20&lt;/b&gt; image URLs may be supplied at any time.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length per URL:&lt;/b&gt; 1500 characters
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getReportedImageUrls() {
        return this.reportedImageUrls;
    }
    /**
     * Gets the timestamp property value. The time stamp indicating where the infringing content appears in the live event or shoppable video (for example, ISO-8601).&lt;br&gt;&lt;br&gt;This field is required when &lt;b&gt;reportType&lt;/b&gt; is &lt;code&gt;LIVE_EVENT&lt;/code&gt; or &lt;code&gt;SHOPPABLE_VIDEO&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimestamp() {
        return this.timestamp;
    }
    /**
     * Gets the veroReasonCodeId property value. The unique identifier for the type of claimed infringement.&lt;br&gt;&lt;br&gt;Use &lt;a href=&quot;/develop/api/sell/vero_api_v2#sell-vero_api_v2-vero_reason_code-getveroreasoncodes&quot; &gt;getVeroReasonCodes&lt;/a&gt; to retrieve a list of valid reason codes for a given eBay site.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVeroReasonCodeId() {
        return this.veroReasonCodeId;
    }
    /**
     * Gets the videoId property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Not currently available. This field is reserved for a future release when &lt;code&gt;SHOPPABLE_VIDEO&lt;/code&gt; reporting is supported.&lt;/span&gt;&lt;br&gt;The shoppable video identifier for the reported infringement.&lt;br&gt;&lt;br&gt;This field is required when &lt;b&gt;reportType&lt;/b&gt; is &lt;code&gt;SHOPPABLE_VIDEO&lt;/code&gt;. This field is not applicable when &lt;b&gt;reportType&lt;/b&gt; is &lt;code&gt;LISTING&lt;/code&gt; or &lt;code&gt;LIVE_EVENT&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoId() {
        return this.videoId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("brand", this.getBrand());
        writer.writeCollectionOfPrimitiveValues("copyrights", this.getCopyrights());
        writer.writeCollectionOfEnumValues("countries", this.getCountries());
        writer.writeStringValue("eventId", this.getEventId());
        writer.writeStringValue("evidenceOfIp", this.getEvidenceOfIp());
        writer.writeStringValue("infringementDescription", this.getInfringementDescription());
        writer.writeStringValue("itemId", this.getItemId());
        writer.writeBooleanValue("listingDescriptionHasViolation", this.getListingDescriptionHasViolation());
        writer.writeStringValue("messageToSeller", this.getMessageToSeller());
        writer.writeCollectionOfEnumValues("regions", this.getRegions());
        writer.writeStringValue("registrationNumber", this.getRegistrationNumber());
        writer.writeCollectionOfPrimitiveValues("reportedImageUrls", this.getReportedImageUrls());
        writer.writeStringValue("timestamp", this.getTimestamp());
        writer.writeStringValue("veroReasonCodeId", this.getVeroReasonCodeId());
        writer.writeStringValue("videoId", this.getVideoId());
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
     * Sets the brand property value. The brand name of the item being reported for VeRO violation.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 50 characters
     * @param value Value to set for the brand property.
     */
    public void setBrand(@jakarta.annotation.Nullable final String value) {
        this.brand = value;
    }
    /**
     * Sets the copyrights property value. This array specifies a list of links to the location of the copyrighted work(s) you claim is being infringed upon. Each link must be specific to where the original work is located, as a link to a general webpage will not suffice.&lt;br&gt;&lt;br&gt;Up to &lt;b&gt;20&lt;/b&gt; entries may be supplied.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length per entry:&lt;/b&gt; 1500 characters
     * @param value Value to set for the copyrights property.
     */
    public void setCopyrights(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.copyrights = value;
    }
    /**
     * Sets the countries property value. If the infringement type stated in the &lt;b&gt;VeroReasonCodeId&lt;/b&gt; has anything to do with which country the item is being shipped to, each country that would trigger this infringement type should be specified in this comma-delimited array.&lt;br&gt;&lt;br&gt;This field is required when the &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;2861&lt;/code&gt; (Item(s) is unlawful importation of product bearing trademark).
     * @param value Value to set for the countries property.
     */
    public void setCountries(@jakarta.annotation.Nullable final java.util.List<CountryCodeEnum> value) {
        this.countries = value;
    }
    /**
     * Sets the eventId property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Not currently available. This field is reserved for a future release when &lt;code&gt;LIVE_EVENT&lt;/code&gt; reporting is supported.&lt;/span&gt;&lt;br&gt;The eBay live event identifier for the reported infringement.&lt;br&gt;&lt;br&gt;This field is required when &lt;b&gt;reportType&lt;/b&gt; is &lt;code&gt;LIVE_EVENT&lt;/code&gt;. This field is not applicable when &lt;b&gt;reportType&lt;/b&gt; is &lt;code&gt;LISTING&lt;/code&gt; or &lt;code&gt;SHOPPABLE_VIDEO&lt;/code&gt;.
     * @param value Value to set for the eventId property.
     */
    public void setEventId(@jakarta.annotation.Nullable final String value) {
        this.eventId = value;
    }
    /**
     * Sets the evidenceOfIp property value. A description detailing how and where the rights owner&apos;s IP is being infringed upon.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     * @param value Value to set for the evidenceOfIp property.
     */
    public void setEvidenceOfIp(@jakarta.annotation.Nullable final String value) {
        this.evidenceOfIp = value;
    }
    /**
     * Sets the infringementDescription property value. The description of why you believe the item or listing infringes your rights.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     * @param value Value to set for the infringementDescription property.
     */
    public void setInfringementDescription(@jakarta.annotation.Nullable final String value) {
        this.infringementDescription = value;
    }
    /**
     * Sets the itemId property value. The unique identifier of the listing being reported for the alleged infringement.
     * @param value Value to set for the itemId property.
     */
    public void setItemId(@jakarta.annotation.Nullable final String value) {
        this.itemId = value;
    }
    /**
     * Sets the listingDescriptionHasViolation property value. This boolean indicates whether the infringement appears in the item description or not.
     * @param value Value to set for the listingDescriptionHasViolation property.
     */
    public void setListingDescriptionHasViolation(@jakarta.annotation.Nullable final Boolean value) {
        this.listingDescriptionHasViolation = value;
    }
    /**
     * Sets the messageToSeller property value. This field is used by the VeRO Program member to provide more details to the seller as to why the item is being reported for the alleged infringement.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     * @param value Value to set for the messageToSeller property.
     */
    public void setMessageToSeller(@jakarta.annotation.Nullable final String value) {
        this.messageToSeller = value;
    }
    /**
     * Sets the regions property value. If the infringement type stated in the &lt;b&gt;veroReasonCodeId&lt;/b&gt; has anything to do with which geographical region the item is being shipped to, each region that would trigger this infringement type should be specified in this comma-delimited array. &lt;br&gt;&lt;br&gt;This field is required when the &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;2861&lt;/code&gt;.
     * @param value Value to set for the regions property.
     */
    public void setRegions(@jakarta.annotation.Nullable final java.util.List<WorldRegionEnum> value) {
        this.regions = value;
    }
    /**
     * Sets the registrationNumber property value. This field can be used to provide registration information if the applicable intellectual property right is registered (for example: registration number, IP office name, or link to registration).&lt;br&gt;&lt;br&gt;This field is required when &lt;b&gt;veroReasonCodeId&lt;/b&gt; is &lt;code&gt;9031&lt;/code&gt;, &lt;code&gt;9036&lt;/code&gt;, &lt;code&gt;9048&lt;/code&gt;, or &lt;code&gt;9049&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000 characters
     * @param value Value to set for the registrationNumber property.
     */
    public void setRegistrationNumber(@jakarta.annotation.Nullable final String value) {
        this.registrationNumber = value;
    }
    /**
     * Sets the reportedImageUrls property value. This array is used to specify a list of URLs for images in the listing that you claim infringe your copyrighted work(s). You may right-click an image in the eBay listing and copy the image URL, or describe the infringing content in the listing.&lt;br&gt;&lt;br&gt;Up to &lt;b&gt;20&lt;/b&gt; image URLs may be supplied at any time.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length per URL:&lt;/b&gt; 1500 characters
     * @param value Value to set for the reportedImageUrls property.
     */
    public void setReportedImageUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.reportedImageUrls = value;
    }
    /**
     * Sets the timestamp property value. The time stamp indicating where the infringing content appears in the live event or shoppable video (for example, ISO-8601).&lt;br&gt;&lt;br&gt;This field is required when &lt;b&gt;reportType&lt;/b&gt; is &lt;code&gt;LIVE_EVENT&lt;/code&gt; or &lt;code&gt;SHOPPABLE_VIDEO&lt;/code&gt;.
     * @param value Value to set for the timestamp property.
     */
    public void setTimestamp(@jakarta.annotation.Nullable final String value) {
        this.timestamp = value;
    }
    /**
     * Sets the veroReasonCodeId property value. The unique identifier for the type of claimed infringement.&lt;br&gt;&lt;br&gt;Use &lt;a href=&quot;/develop/api/sell/vero_api_v2#sell-vero_api_v2-vero_reason_code-getveroreasoncodes&quot; &gt;getVeroReasonCodes&lt;/a&gt; to retrieve a list of valid reason codes for a given eBay site.
     * @param value Value to set for the veroReasonCodeId property.
     */
    public void setVeroReasonCodeId(@jakarta.annotation.Nullable final String value) {
        this.veroReasonCodeId = value;
    }
    /**
     * Sets the videoId property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Not currently available. This field is reserved for a future release when &lt;code&gt;SHOPPABLE_VIDEO&lt;/code&gt; reporting is supported.&lt;/span&gt;&lt;br&gt;The shoppable video identifier for the reported infringement.&lt;br&gt;&lt;br&gt;This field is required when &lt;b&gt;reportType&lt;/b&gt; is &lt;code&gt;SHOPPABLE_VIDEO&lt;/code&gt;. This field is not applicable when &lt;b&gt;reportType&lt;/b&gt; is &lt;code&gt;LISTING&lt;/code&gt; or &lt;code&gt;LIVE_EVENT&lt;/code&gt;.
     * @param value Value to set for the videoId property.
     */
    public void setVideoId(@jakarta.annotation.Nullable final String value) {
        this.videoId = value;
    }
}
