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

package com.ebay.otherapis.generated.internationalshipping.handover_sheet;

import com.ebay.otherapis.generated.internationalshipping.models.GetHandoverSheetResponses;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Builds and executes requests for operations under /handover_sheet
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HandoverSheetRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link HandoverSheetRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public HandoverSheetRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/handover_sheet?tracking_numbers={tracking_numbers}", pathParameters);
    }
    /**
     * Instantiates a new {@link HandoverSheetRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public HandoverSheetRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/handover_sheet?tracking_numbers={tracking_numbers}", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve the handover sheet for one or more packages in a pickup request.&lt;br&gt;&lt;br&gt;The tracking numbers for the packages for which to retrieve handover sheets are specified through the &lt;b&gt;tracking_numbers&lt;/b&gt; query parameter.&lt;br&gt;&lt;br&gt;The retrieved handover sheet will be returned as a base64 string value, and can be used for confirmation with a pickup contact. Only one handover sheet will be returned for the specified packages.
     * @return a {@link GetHandoverSheetResponses}
     */
    @jakarta.annotation.Nullable
    public GetHandoverSheetResponses get() {
        return get(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve the handover sheet for one or more packages in a pickup request.&lt;br&gt;&lt;br&gt;The tracking numbers for the packages for which to retrieve handover sheets are specified through the &lt;b&gt;tracking_numbers&lt;/b&gt; query parameter.&lt;br&gt;&lt;br&gt;The retrieved handover sheet will be returned as a base64 string value, and can be used for confirmation with a pickup contact. Only one handover sheet will be returned for the specified packages.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetHandoverSheetResponses}
     */
    @jakarta.annotation.Nullable
    public GetHandoverSheetResponses get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetHandoverSheetResponses::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve the handover sheet for one or more packages in a pickup request.&lt;br&gt;&lt;br&gt;The tracking numbers for the packages for which to retrieve handover sheets are specified through the &lt;b&gt;tracking_numbers&lt;/b&gt; query parameter.&lt;br&gt;&lt;br&gt;The retrieved handover sheet will be returned as a base64 string value, and can be used for confirmation with a pickup contact. Only one handover sheet will be returned for the specified packages.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve the handover sheet for one or more packages in a pickup request.&lt;br&gt;&lt;br&gt;The tracking numbers for the packages for which to retrieve handover sheets are specified through the &lt;b&gt;tracking_numbers&lt;/b&gt; query parameter.&lt;br&gt;&lt;br&gt;The retrieved handover sheet will be returned as a base64 string value, and can be used for confirmation with a pickup contact. Only one handover sheet will be returned for the specified packages.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link HandoverSheetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HandoverSheetRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new HandoverSheetRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve the handover sheet for one or more packages in a pickup request.&lt;br&gt;&lt;br&gt;The tracking numbers for the packages for which to retrieve handover sheets are specified through the &lt;b&gt;tracking_numbers&lt;/b&gt; query parameter.&lt;br&gt;&lt;br&gt;The retrieved handover sheet will be returned as a base64 string value, and can be used for confirmation with a pickup contact. Only one handover sheet will be returned for the specified packages.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter specifies an array of tracking numbers for the packages for which to retrieve a handover sheet.&lt;br&gt;&lt;br&gt;Tracking numbers are returned when creating packages through the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/package/methods/createPackage&quot; target=&quot;_blank&quot;&gt;createPackage&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;Up to 200 tracking numbers can be provided. Multiple tracking numbers can be input as individual query parameters. For example,&lt;br&gt;&lt;br&gt;&lt;code&gt;tracking_numbers=E***********************N&amp;tracking_numbers=E***********************Q&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String trackingNumbers;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("tracking_numbers", trackingNumbers);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
