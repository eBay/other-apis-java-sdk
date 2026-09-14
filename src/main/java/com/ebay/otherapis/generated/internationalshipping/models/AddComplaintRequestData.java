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
 * This type specifies the information included in a complaint request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddComplaintRequestData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array specifies a list of packages, specified by their &lt;b&gt;packageId&lt;/b&gt;, affected by the issue causing the complaint.&lt;br&gt;&lt;br&gt;Package ID values are returned when creating a package through the &lt;a href=&quot;/develop/api/sell/edelivery_international_shipping_api#sell-edelivery_international_shipping_api-package-createpackage&quot;&gt;createPackage&lt;/a&gt; method&lt;br&gt;&lt;br&gt;This array is required if the complaint being filed is for a missing package.
     */
    private java.util.List<String> affectedPackages;
    /**
     * The date in which the issue associated with the complaint occurred.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt; 
     */
    private String complaintDate;
    /**
     * This string specifies the reason the complaint was filed.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 200 characters
     */
    private String complaintReason;
    /**
     * The type of complaint being filed.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ABNORMAL_COLLECTION_COMPLAINT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;LOST_PACKAGE_COMPLAINT&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private ComplaintTypeEnum complaintType;
    /**
     * The unique identifier of the address associated with the complaint.&lt;br&gt;&lt;br&gt;This field is required if the complain being filed is associated with a specific address.
     */
    private Integer preferenceId;
    /**
     * A remark to the seller themselves.
     */
    private String remark;
    /**
     * Instantiates a new {@link AddComplaintRequestData} and sets the default values.
     */
    public AddComplaintRequestData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AddComplaintRequestData}
     */
    @jakarta.annotation.Nonnull
    public static AddComplaintRequestData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddComplaintRequestData();
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
     * Gets the affectedPackages property value. This array specifies a list of packages, specified by their &lt;b&gt;packageId&lt;/b&gt;, affected by the issue causing the complaint.&lt;br&gt;&lt;br&gt;Package ID values are returned when creating a package through the &lt;a href=&quot;/develop/api/sell/edelivery_international_shipping_api#sell-edelivery_international_shipping_api-package-createpackage&quot;&gt;createPackage&lt;/a&gt; method&lt;br&gt;&lt;br&gt;This array is required if the complaint being filed is for a missing package.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAffectedPackages() {
        return this.affectedPackages;
    }
    /**
     * Gets the complaintDate property value. The date in which the issue associated with the complaint occurred.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt; 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComplaintDate() {
        return this.complaintDate;
    }
    /**
     * Gets the complaintReason property value. This string specifies the reason the complaint was filed.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 200 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComplaintReason() {
        return this.complaintReason;
    }
    /**
     * Gets the complaintType property value. The type of complaint being filed.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ABNORMAL_COLLECTION_COMPLAINT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;LOST_PACKAGE_COMPLAINT&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link ComplaintTypeEnum}
     */
    @jakarta.annotation.Nullable
    public ComplaintTypeEnum getComplaintType() {
        return this.complaintType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("affectedPackages", (n) -> { this.setAffectedPackages(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("complaintDate", (n) -> { this.setComplaintDate(n.getStringValue()); });
        deserializerMap.put("complaintReason", (n) -> { this.setComplaintReason(n.getStringValue()); });
        deserializerMap.put("complaintType", (n) -> { this.setComplaintType(n.getEnumValue(ComplaintTypeEnum::forValue)); });
        deserializerMap.put("preferenceId", (n) -> { this.setPreferenceId(n.getIntegerValue()); });
        deserializerMap.put("remark", (n) -> { this.setRemark(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the preferenceId property value. The unique identifier of the address associated with the complaint.&lt;br&gt;&lt;br&gt;This field is required if the complain being filed is associated with a specific address.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPreferenceId() {
        return this.preferenceId;
    }
    /**
     * Gets the remark property value. A remark to the seller themselves.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemark() {
        return this.remark;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("affectedPackages", this.getAffectedPackages());
        writer.writeStringValue("complaintDate", this.getComplaintDate());
        writer.writeStringValue("complaintReason", this.getComplaintReason());
        writer.writeEnumValue("complaintType", this.getComplaintType());
        writer.writeIntegerValue("preferenceId", this.getPreferenceId());
        writer.writeStringValue("remark", this.getRemark());
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
     * Sets the affectedPackages property value. This array specifies a list of packages, specified by their &lt;b&gt;packageId&lt;/b&gt;, affected by the issue causing the complaint.&lt;br&gt;&lt;br&gt;Package ID values are returned when creating a package through the &lt;a href=&quot;/develop/api/sell/edelivery_international_shipping_api#sell-edelivery_international_shipping_api-package-createpackage&quot;&gt;createPackage&lt;/a&gt; method&lt;br&gt;&lt;br&gt;This array is required if the complaint being filed is for a missing package.
     * @param value Value to set for the affectedPackages property.
     */
    public void setAffectedPackages(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.affectedPackages = value;
    }
    /**
     * Sets the complaintDate property value. The date in which the issue associated with the complaint occurred.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt; 
     * @param value Value to set for the complaintDate property.
     */
    public void setComplaintDate(@jakarta.annotation.Nullable final String value) {
        this.complaintDate = value;
    }
    /**
     * Sets the complaintReason property value. This string specifies the reason the complaint was filed.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 200 characters
     * @param value Value to set for the complaintReason property.
     */
    public void setComplaintReason(@jakarta.annotation.Nullable final String value) {
        this.complaintReason = value;
    }
    /**
     * Sets the complaintType property value. The type of complaint being filed.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ABNORMAL_COLLECTION_COMPLAINT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;LOST_PACKAGE_COMPLAINT&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the complaintType property.
     */
    public void setComplaintType(@jakarta.annotation.Nullable final ComplaintTypeEnum value) {
        this.complaintType = value;
    }
    /**
     * Sets the preferenceId property value. The unique identifier of the address associated with the complaint.&lt;br&gt;&lt;br&gt;This field is required if the complain being filed is associated with a specific address.
     * @param value Value to set for the preferenceId property.
     */
    public void setPreferenceId(@jakarta.annotation.Nullable final Integer value) {
        this.preferenceId = value;
    }
    /**
     * Sets the remark property value. A remark to the seller themselves.
     * @param value Value to set for the remark property.
     */
    public void setRemark(@jakarta.annotation.Nullable final String value) {
        this.remark = value;
    }
}
