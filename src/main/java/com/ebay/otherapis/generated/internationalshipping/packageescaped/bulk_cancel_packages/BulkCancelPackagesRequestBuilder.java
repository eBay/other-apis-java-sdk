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

package com.ebay.otherapis.generated.internationalshipping.packageescaped.bulk_cancel_packages;

import com.ebay.otherapis.generated.internationalshipping.models.CancelPackagesRequest;
import com.ebay.otherapis.generated.internationalshipping.models.CancelPackagesResponses;
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
 * Builds and executes requests for operations under /package/bulk_cancel_packages
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkCancelPackagesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BulkCancelPackagesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkCancelPackagesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/package/bulk_cancel_packages", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkCancelPackagesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkCancelPackagesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/package/bulk_cancel_packages", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to cancel multiple packages and their associated tracking numbers.&lt;br&gt;&lt;br&gt;The package ID values for the packages to be canceled must be input in the &lt;b&gt;packageIds&lt;/b&gt; array of the request.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Packages cannot be cancelled if they are currently being processed.&lt;/span&gt; 
     * @param body This type defines the request container for the &lt;b&gt;bulkCancelPackages&lt;/b&gt; method.
     * @return a {@link CancelPackagesResponses}
     */
    @jakarta.annotation.Nullable
    public CancelPackagesResponses post(@jakarta.annotation.Nonnull final CancelPackagesRequest body) {
        return post(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to cancel multiple packages and their associated tracking numbers.&lt;br&gt;&lt;br&gt;The package ID values for the packages to be canceled must be input in the &lt;b&gt;packageIds&lt;/b&gt; array of the request.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Packages cannot be cancelled if they are currently being processed.&lt;/span&gt; 
     * @param body This type defines the request container for the &lt;b&gt;bulkCancelPackages&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CancelPackagesResponses}
     */
    @jakarta.annotation.Nullable
    public CancelPackagesResponses post(@jakarta.annotation.Nonnull final CancelPackagesRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CancelPackagesResponses::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to cancel multiple packages and their associated tracking numbers.&lt;br&gt;&lt;br&gt;The package ID values for the packages to be canceled must be input in the &lt;b&gt;packageIds&lt;/b&gt; array of the request.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Packages cannot be cancelled if they are currently being processed.&lt;/span&gt; 
     * @param body This type defines the request container for the &lt;b&gt;bulkCancelPackages&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CancelPackagesRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to cancel multiple packages and their associated tracking numbers.&lt;br&gt;&lt;br&gt;The package ID values for the packages to be canceled must be input in the &lt;b&gt;packageIds&lt;/b&gt; array of the request.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Packages cannot be cancelled if they are currently being processed.&lt;/span&gt; 
     * @param body This type defines the request container for the &lt;b&gt;bulkCancelPackages&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CancelPackagesRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link BulkCancelPackagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkCancelPackagesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkCancelPackagesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
