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

package com.ebay.otherapis.generated.internationalshipping.consign_preference;

import com.ebay.otherapis.generated.internationalshipping.models.CreateConsignPreferenceRequest;
import com.ebay.otherapis.generated.internationalshipping.models.CreateConsignPreferenceResponses;
import com.ebay.otherapis.generated.internationalshipping.models.GetConsignPreferenceListResponses;
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
 * Builds and executes requests for operations under /consign_preference
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConsignPreferenceRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ConsignPreferenceRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConsignPreferenceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/consign_preference", pathParameters);
    }
    /**
     * Instantiates a new {@link ConsignPreferenceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConsignPreferenceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/consign_preference", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve information about all the pickup, drop-off, and/or forward deployment consign addresses associated with a seller&apos;s eDIS account.
     * @return a {@link GetConsignPreferenceListResponses}
     */
    @jakarta.annotation.Nullable
    public GetConsignPreferenceListResponses get() {
        return get(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve information about all the pickup, drop-off, and/or forward deployment consign addresses associated with a seller&apos;s eDIS account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetConsignPreferenceListResponses}
     */
    @jakarta.annotation.Nullable
    public GetConsignPreferenceListResponses get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetConsignPreferenceListResponses::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a consign address.&lt;br&gt;&lt;br&gt;The following types of address preferences can be created via this method:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FORWARD_DEPLOYMENT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RDC&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CN_POST_DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CN_POST_PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;HK_POST_DROP_OFF&lt;/code&gt;&lt;/ul&gt;The address information for the consign address must be provided in the &lt;b&gt;consignAddress&lt;/b&gt; container. If the call is successful, the &lt;b&gt;addressId&lt;/b&gt; for the newly created address will be returned. This ID can then be used when creating a package to specify the consign address to use for the shipment.
     * @param body This type is used to define the request container of the &lt;b&gt;createConsignPreference&lt;/b&gt; method.
     * @return a {@link CreateConsignPreferenceResponses}
     */
    @jakarta.annotation.Nullable
    public CreateConsignPreferenceResponses post(@jakarta.annotation.Nonnull final CreateConsignPreferenceRequest body) {
        return post(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a consign address.&lt;br&gt;&lt;br&gt;The following types of address preferences can be created via this method:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FORWARD_DEPLOYMENT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RDC&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CN_POST_DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CN_POST_PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;HK_POST_DROP_OFF&lt;/code&gt;&lt;/ul&gt;The address information for the consign address must be provided in the &lt;b&gt;consignAddress&lt;/b&gt; container. If the call is successful, the &lt;b&gt;addressId&lt;/b&gt; for the newly created address will be returned. This ID can then be used when creating a package to specify the consign address to use for the shipment.
     * @param body This type is used to define the request container of the &lt;b&gt;createConsignPreference&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CreateConsignPreferenceResponses}
     */
    @jakarta.annotation.Nullable
    public CreateConsignPreferenceResponses post(@jakarta.annotation.Nonnull final CreateConsignPreferenceRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CreateConsignPreferenceResponses::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve information about all the pickup, drop-off, and/or forward deployment consign addresses associated with a seller&apos;s eDIS account.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve information about all the pickup, drop-off, and/or forward deployment consign addresses associated with a seller&apos;s eDIS account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a consign address.&lt;br&gt;&lt;br&gt;The following types of address preferences can be created via this method:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FORWARD_DEPLOYMENT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RDC&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CN_POST_DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CN_POST_PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;HK_POST_DROP_OFF&lt;/code&gt;&lt;/ul&gt;The address information for the consign address must be provided in the &lt;b&gt;consignAddress&lt;/b&gt; container. If the call is successful, the &lt;b&gt;addressId&lt;/b&gt; for the newly created address will be returned. This ID can then be used when creating a package to specify the consign address to use for the shipment.
     * @param body This type is used to define the request container of the &lt;b&gt;createConsignPreference&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateConsignPreferenceRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a consign address.&lt;br&gt;&lt;br&gt;The following types of address preferences can be created via this method:&lt;ul&gt;&lt;li&gt;&lt;code&gt;PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;FORWARD_DEPLOYMENT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RDC&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CN_POST_DROP_OFF&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CN_POST_PICK_UP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;HK_POST_DROP_OFF&lt;/code&gt;&lt;/ul&gt;The address information for the consign address must be provided in the &lt;b&gt;consignAddress&lt;/b&gt; container. If the call is successful, the &lt;b&gt;addressId&lt;/b&gt; for the newly created address will be returned. This ID can then be used when creating a package to specify the consign address to use for the shipment.
     * @param body This type is used to define the request container of the &lt;b&gt;createConsignPreference&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateConsignPreferenceRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ConsignPreferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConsignPreferenceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ConsignPreferenceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
