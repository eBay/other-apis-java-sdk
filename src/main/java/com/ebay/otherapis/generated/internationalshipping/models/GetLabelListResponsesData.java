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
 * GetLabelListResponsesData
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetLabelListResponsesData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The base 64 string value for a shipping label.&lt;br&gt;&lt;br&gt;This string value can be converted to a PDF file.
     */
    private String base64Str;
    /**
     * A message relating to the status of the shipping label retrieval process.
     */
    private String message;
    /**
     * The result code detailing the results of the shipping label retrieval process.&lt;br&gt;&lt;br&gt;For example, a result code of &lt;code&gt;200&lt;/code&gt; indicates that at least one shipping label was successfully retrieved.
     */
    private String resultCode;
    /**
     * The tracking number for which the shipping label is being retrieved.
     */
    private String trackingNumber;
    /**
     * Instantiates a new {@link GetLabelListResponsesData} and sets the default values.
     */
    public GetLabelListResponsesData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetLabelListResponsesData}
     */
    @jakarta.annotation.Nonnull
    public static GetLabelListResponsesData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetLabelListResponsesData();
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
     * Gets the base64Str property value. The base 64 string value for a shipping label.&lt;br&gt;&lt;br&gt;This string value can be converted to a PDF file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBase64Str() {
        return this.base64Str;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("base64Str", (n) -> { this.setBase64Str(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("resultCode", (n) -> { this.setResultCode(n.getStringValue()); });
        deserializerMap.put("trackingNumber", (n) -> { this.setTrackingNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. A message relating to the status of the shipping label retrieval process.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the resultCode property value. The result code detailing the results of the shipping label retrieval process.&lt;br&gt;&lt;br&gt;For example, a result code of &lt;code&gt;200&lt;/code&gt; indicates that at least one shipping label was successfully retrieved.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResultCode() {
        return this.resultCode;
    }
    /**
     * Gets the trackingNumber property value. The tracking number for which the shipping label is being retrieved.
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
        writer.writeStringValue("base64Str", this.getBase64Str());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("resultCode", this.getResultCode());
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
     * Sets the base64Str property value. The base 64 string value for a shipping label.&lt;br&gt;&lt;br&gt;This string value can be converted to a PDF file.
     * @param value Value to set for the base64Str property.
     */
    public void setBase64Str(@jakarta.annotation.Nullable final String value) {
        this.base64Str = value;
    }
    /**
     * Sets the message property value. A message relating to the status of the shipping label retrieval process.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the resultCode property value. The result code detailing the results of the shipping label retrieval process.&lt;br&gt;&lt;br&gt;For example, a result code of &lt;code&gt;200&lt;/code&gt; indicates that at least one shipping label was successfully retrieved.
     * @param value Value to set for the resultCode property.
     */
    public void setResultCode(@jakarta.annotation.Nullable final String value) {
        this.resultCode = value;
    }
    /**
     * Sets the trackingNumber property value. The tracking number for which the shipping label is being retrieved.
     * @param value Value to set for the trackingNumber property.
     */
    public void setTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.trackingNumber = value;
    }
}
