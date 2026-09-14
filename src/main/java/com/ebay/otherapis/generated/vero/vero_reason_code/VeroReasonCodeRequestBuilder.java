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

package com.ebay.otherapis.generated.vero.vero_reason_code;

import com.ebay.otherapis.generated.vero.models.Error;
import com.ebay.otherapis.generated.vero.models.VeroReasonCodeDetailResponse;
import com.ebay.otherapis.generated.vero.vero_reason_code.item.WithVeroReasonCodeItemRequestBuilder;
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
 * Builds and executes requests for operations under /vero_reason_code
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VeroReasonCodeRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.otherapis.generated.vero.vero_reason_code.item collection
     * @param vero_reason_code_id This path parameter specifies the unique identifier of the VeRO reason code that is to be retrieved.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/vero_public_apis#sell-vero_public_apis-vero_reason_code-getveroreasoncodes&quot;&gt;getVeroReasonCodes&lt;/a&gt; method to retrieve supported VeRO reason code IDs.
     * @return a {@link WithVeroReasonCodeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithVeroReasonCodeItemRequestBuilder byVero_reason_code_id(@jakarta.annotation.Nonnull final String vero_reason_code_id) {
        Objects.requireNonNull(vero_reason_code_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("vero_reason_code_id", vero_reason_code_id);
        return new WithVeroReasonCodeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link VeroReasonCodeRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VeroReasonCodeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/vero_reason_code", pathParameters);
    }
    /**
     * Instantiates a new {@link VeroReasonCodeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VeroReasonCodeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/vero_reason_code", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; All methods of the &lt;b&gt;VeRO API&lt;/b&gt; have been deprecated, and will be decommissioned on September 30th, 2026.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; You must be a member of the Verified Rights Owner (VeRO) Program to use this call.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method is used to retrieve the details of an array of VeRO reason codes. This information includes the descriptions of each code, as well as the marketplace associated with each code.&lt;br&gt;&lt;br&gt; If the &lt;b&gt;X-EBAY-C-MARKETPLACE-ID&lt;/b&gt; header is present, only VeRO reason codes for that specific site will be returned. If this header is not included, all reason codes for all sites are returned.
     * @return a {@link VeroReasonCodeDetailResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public VeroReasonCodeDetailResponse get() {
        return get(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; All methods of the &lt;b&gt;VeRO API&lt;/b&gt; have been deprecated, and will be decommissioned on September 30th, 2026.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; You must be a member of the Verified Rights Owner (VeRO) Program to use this call.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method is used to retrieve the details of an array of VeRO reason codes. This information includes the descriptions of each code, as well as the marketplace associated with each code.&lt;br&gt;&lt;br&gt; If the &lt;b&gt;X-EBAY-C-MARKETPLACE-ID&lt;/b&gt; header is present, only VeRO reason codes for that specific site will be returned. If this header is not included, all reason codes for all sites are returned.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VeroReasonCodeDetailResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public VeroReasonCodeDetailResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, VeroReasonCodeDetailResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; All methods of the &lt;b&gt;VeRO API&lt;/b&gt; have been deprecated, and will be decommissioned on September 30th, 2026.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; You must be a member of the Verified Rights Owner (VeRO) Program to use this call.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method is used to retrieve the details of an array of VeRO reason codes. This information includes the descriptions of each code, as well as the marketplace associated with each code.&lt;br&gt;&lt;br&gt; If the &lt;b&gt;X-EBAY-C-MARKETPLACE-ID&lt;/b&gt; header is present, only VeRO reason codes for that specific site will be returned. If this header is not included, all reason codes for all sites are returned.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; All methods of the &lt;b&gt;VeRO API&lt;/b&gt; have been deprecated, and will be decommissioned on September 30th, 2026.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; You must be a member of the Verified Rights Owner (VeRO) Program to use this call.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method is used to retrieve the details of an array of VeRO reason codes. This information includes the descriptions of each code, as well as the marketplace associated with each code.&lt;br&gt;&lt;br&gt; If the &lt;b&gt;X-EBAY-C-MARKETPLACE-ID&lt;/b&gt; header is present, only VeRO reason codes for that specific site will be returned. If this header is not included, all reason codes for all sites are returned.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link VeroReasonCodeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VeroReasonCodeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VeroReasonCodeRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
