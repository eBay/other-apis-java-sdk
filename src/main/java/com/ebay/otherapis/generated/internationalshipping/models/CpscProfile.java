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
 * This type defines the fields that provide information about a CPSC profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CpscProfile implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the CPSC profile assigned by eDIS.&lt;br&gt;&lt;br&gt;This ID can be used to associate a SKU with this CPSC profile when creating a package.
     */
    private String cpscProfileId;
    /**
     * The name of the CPSC profile.
     */
    private String name;
    /**
     * This enum returns the type of the CPSC profile.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;REF_PGA&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FULL_PGA&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private CpscTypeEnum type;
    /**
     * Instantiates a new {@link CpscProfile} and sets the default values.
     */
    public CpscProfile() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CpscProfile}
     */
    @jakarta.annotation.Nonnull
    public static CpscProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CpscProfile();
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
     * Gets the cpscProfileId property value. The unique identifier of the CPSC profile assigned by eDIS.&lt;br&gt;&lt;br&gt;This ID can be used to associate a SKU with this CPSC profile when creating a package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCpscProfileId() {
        return this.cpscProfileId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("cpscProfileId", (n) -> { this.setCpscProfileId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(CpscTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the CPSC profile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the type property value. This enum returns the type of the CPSC profile.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;REF_PGA&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FULL_PGA&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link CpscTypeEnum}
     */
    @jakarta.annotation.Nullable
    public CpscTypeEnum getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cpscProfileId", this.getCpscProfileId());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the cpscProfileId property value. The unique identifier of the CPSC profile assigned by eDIS.&lt;br&gt;&lt;br&gt;This ID can be used to associate a SKU with this CPSC profile when creating a package.
     * @param value Value to set for the cpscProfileId property.
     */
    public void setCpscProfileId(@jakarta.annotation.Nullable final String value) {
        this.cpscProfileId = value;
    }
    /**
     * Sets the name property value. The name of the CPSC profile.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the type property value. This enum returns the type of the CPSC profile.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;REF_PGA&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FULL_PGA&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final CpscTypeEnum value) {
        this.type = value;
    }
}
