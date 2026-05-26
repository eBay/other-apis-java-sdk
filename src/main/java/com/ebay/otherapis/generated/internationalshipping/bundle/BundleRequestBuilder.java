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

package com.ebay.otherapis.generated.internationalshipping.bundle;

import com.ebay.otherapis.generated.internationalshipping.bundle.item.WithBundleItemRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.models.CreateBundleRequest;
import com.ebay.otherapis.generated.internationalshipping.models.CreateBundleResponse;
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
 * Builds and executes requests for operations under /bundle
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BundleRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.otherapis.generated.internationalshipping.bundle.item collection
     * @param bundle_id This path parameter specifies the unique identifier of the bundle being retrieved.&lt;br&gt;&lt;br&gt;This ID value is returned when creating a bundle through the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/bundle/methods/createBundle&quot; target=&quot;_blank&quot;&gt;createBundle&lt;/a&gt; method.
     * @return a {@link WithBundleItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithBundleItemRequestBuilder byBundle_id(@jakarta.annotation.Nonnull final String bundle_id) {
        Objects.requireNonNull(bundle_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("bundle_id", bundle_id);
        return new WithBundleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link BundleRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BundleRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bundle", pathParameters);
    }
    /**
     * Instantiates a new {@link BundleRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BundleRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bundle", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method is used to create a bundle for multiple packages in an order.&lt;br&gt;&lt;br&gt;To create a bundle, the consign address to be associated with the bundle and the tracking numbers of the packages to be used in the bundle must be specified in the request. &lt;br&gt;&lt;br&gt;If the call is successful, the &lt;b&gt;bundleId&lt;/b&gt; for the newly created bundle will be returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of the returned &lt;b&gt;bundleId&lt;/b&gt;, as there is no programmatic way to retrieve this value at this time.&lt;/span&gt;
     * @param body This type defines the request container of the &lt;b&gt;createBundle&lt;/b&gt; method.
     * @return a {@link CreateBundleResponse}
     */
    @jakarta.annotation.Nullable
    public CreateBundleResponse post(@jakarta.annotation.Nonnull final CreateBundleRequest body) {
        return post(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method is used to create a bundle for multiple packages in an order.&lt;br&gt;&lt;br&gt;To create a bundle, the consign address to be associated with the bundle and the tracking numbers of the packages to be used in the bundle must be specified in the request. &lt;br&gt;&lt;br&gt;If the call is successful, the &lt;b&gt;bundleId&lt;/b&gt; for the newly created bundle will be returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of the returned &lt;b&gt;bundleId&lt;/b&gt;, as there is no programmatic way to retrieve this value at this time.&lt;/span&gt;
     * @param body This type defines the request container of the &lt;b&gt;createBundle&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CreateBundleResponse}
     */
    @jakarta.annotation.Nullable
    public CreateBundleResponse post(@jakarta.annotation.Nonnull final CreateBundleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CreateBundleResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method is used to create a bundle for multiple packages in an order.&lt;br&gt;&lt;br&gt;To create a bundle, the consign address to be associated with the bundle and the tracking numbers of the packages to be used in the bundle must be specified in the request. &lt;br&gt;&lt;br&gt;If the call is successful, the &lt;b&gt;bundleId&lt;/b&gt; for the newly created bundle will be returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of the returned &lt;b&gt;bundleId&lt;/b&gt;, as there is no programmatic way to retrieve this value at this time.&lt;/span&gt;
     * @param body This type defines the request container of the &lt;b&gt;createBundle&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateBundleRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method is used to create a bundle for multiple packages in an order.&lt;br&gt;&lt;br&gt;To create a bundle, the consign address to be associated with the bundle and the tracking numbers of the packages to be used in the bundle must be specified in the request. &lt;br&gt;&lt;br&gt;If the call is successful, the &lt;b&gt;bundleId&lt;/b&gt; for the newly created bundle will be returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of the returned &lt;b&gt;bundleId&lt;/b&gt;, as there is no programmatic way to retrieve this value at this time.&lt;/span&gt;
     * @param body This type defines the request container of the &lt;b&gt;createBundle&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateBundleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link BundleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BundleRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BundleRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
