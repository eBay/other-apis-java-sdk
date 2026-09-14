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

package com.ebay.otherapis.generated.internationalshipping.labels;

import com.ebay.otherapis.generated.internationalshipping.models.Error;
import com.ebay.otherapis.generated.internationalshipping.models.GetLabelListResponses;
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
 * Builds and executes requests for operations under /labels
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LabelsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link LabelsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LabelsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/labels?tracking_numbers={tracking_numbers}{&page_size*,print_preference*}", pathParameters);
    }
    /**
     * Instantiates a new {@link LabelsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LabelsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/labels?tracking_numbers={tracking_numbers}{&page_size*,print_preference*}", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve shipping labels for the one or more specified packages.&lt;br&gt;&lt;br&gt;The packages for which to retrieve shipping labels can be specified through the &lt;b&gt;tracking_numbers&lt;/b&gt; query parameter. The page size and print preference settings for the shipping label(s) can also be specified through the query parameters.&lt;br&gt;&lt;br&gt;Shipping labels are returned as base64 string values which can be converted to PDF files. A separate file will be returned for each tracking number specified in the request.
     * @return a {@link GetLabelListResponses}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public GetLabelListResponses get() {
        return get(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve shipping labels for the one or more specified packages.&lt;br&gt;&lt;br&gt;The packages for which to retrieve shipping labels can be specified through the &lt;b&gt;tracking_numbers&lt;/b&gt; query parameter. The page size and print preference settings for the shipping label(s) can also be specified through the query parameters.&lt;br&gt;&lt;br&gt;Shipping labels are returned as base64 string values which can be converted to PDF files. A separate file will be returned for each tracking number specified in the request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetLabelListResponses}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public GetLabelListResponses get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("401", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetLabelListResponses::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve shipping labels for the one or more specified packages.&lt;br&gt;&lt;br&gt;The packages for which to retrieve shipping labels can be specified through the &lt;b&gt;tracking_numbers&lt;/b&gt; query parameter. The page size and print preference settings for the shipping label(s) can also be specified through the query parameters.&lt;br&gt;&lt;br&gt;Shipping labels are returned as base64 string values which can be converted to PDF files. A separate file will be returned for each tracking number specified in the request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve shipping labels for the one or more specified packages.&lt;br&gt;&lt;br&gt;The packages for which to retrieve shipping labels can be specified through the &lt;b&gt;tracking_numbers&lt;/b&gt; query parameter. The page size and print preference settings for the shipping label(s) can also be specified through the query parameters.&lt;br&gt;&lt;br&gt;Shipping labels are returned as base64 string values which can be converted to PDF files. A separate file will be returned for each tracking number specified in the request.
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
     * @return a {@link LabelsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LabelsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new LabelsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve shipping labels for the one or more specified packages.&lt;br&gt;&lt;br&gt;The packages for which to retrieve shipping labels can be specified through the &lt;b&gt;tracking_numbers&lt;/b&gt; query parameter. The page size and print preference settings for the shipping label(s) can also be specified through the query parameters.&lt;br&gt;&lt;br&gt;Shipping labels are returned as base64 string values which can be converted to PDF files. A separate file will be returned for each tracking number specified in the request.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter specifies the page size of the retrieved shipping labels.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;A4&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;THERMAL_PAPER&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
         */
        @jakarta.annotation.Nullable
        public String pageSize;
        /**
         * This query parameter specifies one or more printing preferences to be set when retrieving shipping labels. Multiple values can be delimited by a comma.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;nameZh&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;nameEn&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;remark&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;skuPrice&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;skuNo&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;quantity&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;listingId&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;sellerId&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;buyerId&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
         */
        @jakarta.annotation.Nullable
        public String printPreference;
        /**
         * This query parameter specifies an array of tracking numbers of the packages for which to retrieve shipping labels.&lt;br&gt;&lt;br&gt;Tracking numbers are returned when creating packages through the &lt;a href=&quot;/develop/api/sell/edelivery_international_shipping_api#sell-edelivery_international_shipping_api-package-createpackage&quot;&gt;createPackage&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;Up to 200 tracking numbers can be provided. Multiple tracking numbers can be input as individual query parameters.For example,&lt;br&gt;&lt;br&gt;&lt;code&gt;tracking_numbers=E***********************N&amp;tracking_numbers=E***********************Q&lt;/code&gt;
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
            allQueryParams.put("page_size", pageSize);
            allQueryParams.put("print_preference", printPreference);
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
