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

package com.ebay.otherapis.generated.translation.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the &lt;b&gt;translations&lt;/b&gt; array, which shows the original text supplied by the user in the request payload, and the text translated by eBay.&lt;br&gt;&lt;br&gt;Only one input string can be translated at this time. Support for multiple continuous text strings are expected in the future.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Translation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The original text, in the language specified in the &lt;b&gt;from&lt;/b&gt; field, that was input into the &lt;b&gt;text&lt;/b&gt; field in the request.
     */
    private String originalText;
    /**
     * The translation of the original text into the language specified in the &lt;b&gt;to&lt;/b&gt; field.
     */
    private String translatedText;
    /**
     * Instantiates a new {@link Translation} and sets the default values.
     */
    public Translation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Translation}
     */
    @jakarta.annotation.Nonnull
    public static Translation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Translation();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("originalText", (n) -> { this.setOriginalText(n.getStringValue()); });
        deserializerMap.put("translatedText", (n) -> { this.setTranslatedText(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the originalText property value. The original text, in the language specified in the &lt;b&gt;from&lt;/b&gt; field, that was input into the &lt;b&gt;text&lt;/b&gt; field in the request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginalText() {
        return this.originalText;
    }
    /**
     * Gets the translatedText property value. The translation of the original text into the language specified in the &lt;b&gt;to&lt;/b&gt; field.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTranslatedText() {
        return this.translatedText;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("originalText", this.getOriginalText());
        writer.writeStringValue("translatedText", this.getTranslatedText());
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
     * Sets the originalText property value. The original text, in the language specified in the &lt;b&gt;from&lt;/b&gt; field, that was input into the &lt;b&gt;text&lt;/b&gt; field in the request.
     * @param value Value to set for the originalText property.
     */
    public void setOriginalText(@jakarta.annotation.Nullable final String value) {
        this.originalText = value;
    }
    /**
     * Sets the translatedText property value. The translation of the original text into the language specified in the &lt;b&gt;to&lt;/b&gt; field.
     * @param value Value to set for the translatedText property.
     */
    public void setTranslatedText(@jakarta.annotation.Nullable final String value) {
        this.translatedText = value;
    }
}
