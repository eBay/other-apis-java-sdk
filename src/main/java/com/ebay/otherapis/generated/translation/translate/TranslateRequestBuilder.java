package com.ebay.otherapis.generated.translation.translate;

import com.ebay.otherapis.generated.translation.models.TranslateRequest;
import com.ebay.otherapis.generated.translation.models.TranslateResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /translate
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TranslateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link TranslateRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TranslateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/translate", pathParameters);
    }
    /**
     * Instantiates a new {@link TranslateRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TranslateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/translate", rawUrl);
    }
    /**
     * This method translates listing title and listing description text from one language into another. For a full list of supported language translations, see the &lt;a href=&quot;/develop/guides-v2/other-apis/other-apis-guide#supported-languages&quot;target=&quot;_blank &quot;&gt;table&lt;/a&gt;.
     * @param body This is the base type of the &lt;b&gt;translate&lt;/b&gt; method request payload.
     * @return a {@link TranslateResponse}
     */
    @jakarta.annotation.Nullable
    public TranslateResponse post(@jakarta.annotation.Nonnull final TranslateRequest body) {
        return post(body, null);
    }
    /**
     * This method translates listing title and listing description text from one language into another. For a full list of supported language translations, see the &lt;a href=&quot;/develop/guides-v2/other-apis/other-apis-guide#supported-languages&quot;target=&quot;_blank &quot;&gt;table&lt;/a&gt;.
     * @param body This is the base type of the &lt;b&gt;translate&lt;/b&gt; method request payload.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link TranslateResponse}
     */
    @jakarta.annotation.Nullable
    public TranslateResponse post(@jakarta.annotation.Nonnull final TranslateRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, TranslateResponse::createFromDiscriminatorValue);
    }
    /**
     * This method translates listing title and listing description text from one language into another. For a full list of supported language translations, see the &lt;a href=&quot;/develop/guides-v2/other-apis/other-apis-guide#supported-languages&quot;target=&quot;_blank &quot;&gt;table&lt;/a&gt;.
     * @param body This is the base type of the &lt;b&gt;translate&lt;/b&gt; method request payload.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final TranslateRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method translates listing title and listing description text from one language into another. For a full list of supported language translations, see the &lt;a href=&quot;/develop/guides-v2/other-apis/other-apis-guide#supported-languages&quot;target=&quot;_blank &quot;&gt;table&lt;/a&gt;.
     * @param body This is the base type of the &lt;b&gt;translate&lt;/b&gt; method request payload.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final TranslateRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link TranslateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TranslateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TranslateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
