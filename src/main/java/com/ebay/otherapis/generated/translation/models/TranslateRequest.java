package com.ebay.otherapis.generated.translation.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This is the base type of the &lt;b&gt;translate&lt;/b&gt; method request payload.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TranslateRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The language of the input text to be translated. Not all &lt;b&gt;LanguageEnum&lt;/b&gt; values are supported in this field. For a full list of supported language pairings, see the Supported languages &lt;a href=&quot;/develop/guides-v2/other-apis/other-apis-guide#supported-languages&quot;target=&quot;_blank &quot;&gt;table&lt;/a&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/translation/types/api:LanguageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String from;
    /**
     * The input text to translate. The maximum number of characters permitted is determined by the &lt;b&gt;translationContext&lt;/b&gt; value:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ITEM_TITLE&lt;/code&gt;: 1000 characters maximum&lt;/li&gt;&lt;li&gt;&lt;code&gt;ITEM_DESCRIPTION&lt;/code&gt;: 20,000 characters maximum.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When translating &lt;code&gt;ITEM_DESCRIPTION&lt;/code&gt; text, HTML/CSS markup and links can be included and will not count toward this 20,000 character limit.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, only one input string can be translated per API call. Support for multiple continuous text strings is expected in the future.&lt;/span&gt;
     */
    private java.util.List<String> text;
    /**
     * The target language for the translation of the input text. Not all &lt;b&gt;LanguageEnum&lt;/b&gt; values are supported in this field. For a full list of supported language pairings, see the Supported languages &lt;a href=&quot;/develop/guides-v2/other-apis/other-apis-guide#supported-languages&quot;target=&quot;_blank &quot;&gt;table&lt;/a&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/translation/types/api:LanguageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String to;
    /**
     * Input the listing entity to be translated.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt; &lt;code&gt;ITEM_TITLE&lt;/code&gt; and &lt;code&gt;ITEM_DESCRIPTION&lt;/code&gt;&lt;/p&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/translation/types/api:TranslationContextEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String translationContext;
    /**
     * Instantiates a new {@link TranslateRequest} and sets the default values.
     */
    public TranslateRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TranslateRequest}
     */
    @jakarta.annotation.Nonnull
    public static TranslateRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TranslateRequest();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("from", (n) -> { this.setFrom(n.getStringValue()); });
        deserializerMap.put("text", (n) -> { this.setText(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("to", (n) -> { this.setTo(n.getStringValue()); });
        deserializerMap.put("translationContext", (n) -> { this.setTranslationContext(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the from property value. The language of the input text to be translated. Not all &lt;b&gt;LanguageEnum&lt;/b&gt; values are supported in this field. For a full list of supported language pairings, see the Supported languages &lt;a href=&quot;/develop/guides-v2/other-apis/other-apis-guide#supported-languages&quot;target=&quot;_blank &quot;&gt;table&lt;/a&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/translation/types/api:LanguageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFrom() {
        return this.from;
    }
    /**
     * Gets the text property value. The input text to translate. The maximum number of characters permitted is determined by the &lt;b&gt;translationContext&lt;/b&gt; value:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ITEM_TITLE&lt;/code&gt;: 1000 characters maximum&lt;/li&gt;&lt;li&gt;&lt;code&gt;ITEM_DESCRIPTION&lt;/code&gt;: 20,000 characters maximum.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When translating &lt;code&gt;ITEM_DESCRIPTION&lt;/code&gt; text, HTML/CSS markup and links can be included and will not count toward this 20,000 character limit.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, only one input string can be translated per API call. Support for multiple continuous text strings is expected in the future.&lt;/span&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getText() {
        return this.text;
    }
    /**
     * Gets the to property value. The target language for the translation of the input text. Not all &lt;b&gt;LanguageEnum&lt;/b&gt; values are supported in this field. For a full list of supported language pairings, see the Supported languages &lt;a href=&quot;/develop/guides-v2/other-apis/other-apis-guide#supported-languages&quot;target=&quot;_blank &quot;&gt;table&lt;/a&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/translation/types/api:LanguageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTo() {
        return this.to;
    }
    /**
     * Gets the translationContext property value. Input the listing entity to be translated.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt; &lt;code&gt;ITEM_TITLE&lt;/code&gt; and &lt;code&gt;ITEM_DESCRIPTION&lt;/code&gt;&lt;/p&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/translation/types/api:TranslationContextEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTranslationContext() {
        return this.translationContext;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("from", this.getFrom());
        writer.writeCollectionOfPrimitiveValues("text", this.getText());
        writer.writeStringValue("to", this.getTo());
        writer.writeStringValue("translationContext", this.getTranslationContext());
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
     * Sets the from property value. The language of the input text to be translated. Not all &lt;b&gt;LanguageEnum&lt;/b&gt; values are supported in this field. For a full list of supported language pairings, see the Supported languages &lt;a href=&quot;/develop/guides-v2/other-apis/other-apis-guide#supported-languages&quot;target=&quot;_blank &quot;&gt;table&lt;/a&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/translation/types/api:LanguageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the from property.
     */
    public void setFrom(@jakarta.annotation.Nullable final String value) {
        this.from = value;
    }
    /**
     * Sets the text property value. The input text to translate. The maximum number of characters permitted is determined by the &lt;b&gt;translationContext&lt;/b&gt; value:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ITEM_TITLE&lt;/code&gt;: 1000 characters maximum&lt;/li&gt;&lt;li&gt;&lt;code&gt;ITEM_DESCRIPTION&lt;/code&gt;: 20,000 characters maximum.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When translating &lt;code&gt;ITEM_DESCRIPTION&lt;/code&gt; text, HTML/CSS markup and links can be included and will not count toward this 20,000 character limit.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, only one input string can be translated per API call. Support for multiple continuous text strings is expected in the future.&lt;/span&gt;
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.text = value;
    }
    /**
     * Sets the to property value. The target language for the translation of the input text. Not all &lt;b&gt;LanguageEnum&lt;/b&gt; values are supported in this field. For a full list of supported language pairings, see the Supported languages &lt;a href=&quot;/develop/guides-v2/other-apis/other-apis-guide#supported-languages&quot;target=&quot;_blank &quot;&gt;table&lt;/a&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/translation/types/api:LanguageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the to property.
     */
    public void setTo(@jakarta.annotation.Nullable final String value) {
        this.to = value;
    }
    /**
     * Sets the translationContext property value. Input the listing entity to be translated.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt; &lt;code&gt;ITEM_TITLE&lt;/code&gt; and &lt;code&gt;ITEM_DESCRIPTION&lt;/code&gt;&lt;/p&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/translation/types/api:TranslationContextEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the translationContext property.
     */
    public void setTranslationContext(@jakarta.annotation.Nullable final String value) {
        this.translationContext = value;
    }
}
