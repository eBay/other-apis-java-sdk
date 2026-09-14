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

package com.ebay.otherapis.generated.vero.vero_report;

import com.ebay.otherapis.generated.vero.models.Error;
import com.ebay.otherapis.generated.vero.models.VeroReportItemsRequest;
import com.ebay.otherapis.generated.vero.models.VeroReportItemsResponse;
import com.ebay.otherapis.generated.vero.vero_report.item.WithVeroReportItemRequestBuilder;
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
 * Builds and executes requests for operations under /vero_report
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VeroReportRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.otherapis.generated.vero.vero_report.item collection
     * @param vero_report_id This path parameter specifies the unique identifier of the VeRO report being retrieved.&lt;br&gt;&lt;br&gt;This value is returned when creating a VeRO report through the &lt;a href=&quot;/develop/api/sell/vero_public_apis#sell-vero_public_apis-vero_report-createveroreport&quot;&gt;createVeroReport&lt;/a&gt; method.
     * @return a {@link WithVeroReportItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithVeroReportItemRequestBuilder byVero_report_id(@jakarta.annotation.Nonnull final String vero_report_id) {
        Objects.requireNonNull(vero_report_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("vero_report_id", vero_report_id);
        return new WithVeroReportItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link VeroReportRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VeroReportRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/vero_report", pathParameters);
    }
    /**
     * Instantiates a new {@link VeroReportRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VeroReportRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/vero_report", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; All methods of the &lt;b&gt;VeRO API&lt;/b&gt; have been deprecated, and will be decommissioned on September 30th, 2026.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; You must be a member of the Verified Rights Owner (VeRO) Program to use this call.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a VeRO report for a listing. VeRO reports can be used to report items that your copyright, trademark, or other intellectual property rights.&lt;br&gt;&lt;br&gt;The &lt;b&gt;itemId&lt;/b&gt; of the item being reported must be provided in the request, as well as the &lt;b&gt;veroReasonCodeId&lt;/b&gt; of the claimed infringement.&lt;br&gt;&lt;br&gt;You can report one or more items at a time using this method. A maximum of 150 items can be reported using this method.
     * @param body This type defines the request fields used in the &lt;b&gt;createVeroReport&lt;/b&gt; method.
     * @return a {@link VeroReportItemsResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public VeroReportItemsResponse post(@jakarta.annotation.Nonnull final VeroReportItemsRequest body) {
        return post(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; All methods of the &lt;b&gt;VeRO API&lt;/b&gt; have been deprecated, and will be decommissioned on September 30th, 2026.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; You must be a member of the Verified Rights Owner (VeRO) Program to use this call.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a VeRO report for a listing. VeRO reports can be used to report items that your copyright, trademark, or other intellectual property rights.&lt;br&gt;&lt;br&gt;The &lt;b&gt;itemId&lt;/b&gt; of the item being reported must be provided in the request, as well as the &lt;b&gt;veroReasonCodeId&lt;/b&gt; of the claimed infringement.&lt;br&gt;&lt;br&gt;You can report one or more items at a time using this method. A maximum of 150 items can be reported using this method.
     * @param body This type defines the request fields used in the &lt;b&gt;createVeroReport&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VeroReportItemsResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public VeroReportItemsResponse post(@jakarta.annotation.Nonnull final VeroReportItemsRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, VeroReportItemsResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; All methods of the &lt;b&gt;VeRO API&lt;/b&gt; have been deprecated, and will be decommissioned on September 30th, 2026.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; You must be a member of the Verified Rights Owner (VeRO) Program to use this call.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a VeRO report for a listing. VeRO reports can be used to report items that your copyright, trademark, or other intellectual property rights.&lt;br&gt;&lt;br&gt;The &lt;b&gt;itemId&lt;/b&gt; of the item being reported must be provided in the request, as well as the &lt;b&gt;veroReasonCodeId&lt;/b&gt; of the claimed infringement.&lt;br&gt;&lt;br&gt;You can report one or more items at a time using this method. A maximum of 150 items can be reported using this method.
     * @param body This type defines the request fields used in the &lt;b&gt;createVeroReport&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VeroReportItemsRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; All methods of the &lt;b&gt;VeRO API&lt;/b&gt; have been deprecated, and will be decommissioned on September 30th, 2026.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; You must be a member of the Verified Rights Owner (VeRO) Program to use this call.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a VeRO report for a listing. VeRO reports can be used to report items that your copyright, trademark, or other intellectual property rights.&lt;br&gt;&lt;br&gt;The &lt;b&gt;itemId&lt;/b&gt; of the item being reported must be provided in the request, as well as the &lt;b&gt;veroReasonCodeId&lt;/b&gt; of the claimed infringement.&lt;br&gt;&lt;br&gt;You can report one or more items at a time using this method. A maximum of 150 items can be reported using this method.
     * @param body This type defines the request fields used in the &lt;b&gt;createVeroReport&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VeroReportItemsRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link VeroReportRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VeroReportRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VeroReportRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
