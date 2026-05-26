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

package com.ebay.otherapis.generated.internationalshipping.actual_costs;

import com.ebay.otherapis.generated.internationalshipping.models.GetActualCostResponses;
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
 * Builds and executes requests for operations under /actual_costs
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActualCostsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ActualCostsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ActualCostsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/actual_costs{?tracking_numbers*,trans_begin_time*,trans_end_time*}", pathParameters);
    }
    /**
     * Instantiates a new {@link ActualCostsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ActualCostsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/actual_costs{?tracking_numbers*,trans_begin_time*,trans_end_time*}", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method is used to retrieve the actual weight and cost for one or more packages based on the provided input criteria.&lt;br&gt;&lt;br&gt;Responses can be filtered by the &lt;b&gt;tracking_numbers&lt;/b&gt; query parameter. If this parameter is used, actual costs for each package associated with the provided tracking numbers are returned.&lt;br&gt;&lt;br&gt;Alternatively, responses can be filtered by the &lt;b&gt;trans_begin_time&lt;/b&gt; and &lt;b&gt;trans_end_time&lt;/b&gt; query parameters. If these parameters are used, the actual costs of all packages created within this date range are returned.&lt;br&gt;&lt;br&gt;Only one filtering method can be used per call.
     * @return a {@link GetActualCostResponses}
     */
    @jakarta.annotation.Nullable
    public GetActualCostResponses get() {
        return get(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method is used to retrieve the actual weight and cost for one or more packages based on the provided input criteria.&lt;br&gt;&lt;br&gt;Responses can be filtered by the &lt;b&gt;tracking_numbers&lt;/b&gt; query parameter. If this parameter is used, actual costs for each package associated with the provided tracking numbers are returned.&lt;br&gt;&lt;br&gt;Alternatively, responses can be filtered by the &lt;b&gt;trans_begin_time&lt;/b&gt; and &lt;b&gt;trans_end_time&lt;/b&gt; query parameters. If these parameters are used, the actual costs of all packages created within this date range are returned.&lt;br&gt;&lt;br&gt;Only one filtering method can be used per call.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetActualCostResponses}
     */
    @jakarta.annotation.Nullable
    public GetActualCostResponses get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetActualCostResponses::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method is used to retrieve the actual weight and cost for one or more packages based on the provided input criteria.&lt;br&gt;&lt;br&gt;Responses can be filtered by the &lt;b&gt;tracking_numbers&lt;/b&gt; query parameter. If this parameter is used, actual costs for each package associated with the provided tracking numbers are returned.&lt;br&gt;&lt;br&gt;Alternatively, responses can be filtered by the &lt;b&gt;trans_begin_time&lt;/b&gt; and &lt;b&gt;trans_end_time&lt;/b&gt; query parameters. If these parameters are used, the actual costs of all packages created within this date range are returned.&lt;br&gt;&lt;br&gt;Only one filtering method can be used per call.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method is used to retrieve the actual weight and cost for one or more packages based on the provided input criteria.&lt;br&gt;&lt;br&gt;Responses can be filtered by the &lt;b&gt;tracking_numbers&lt;/b&gt; query parameter. If this parameter is used, actual costs for each package associated with the provided tracking numbers are returned.&lt;br&gt;&lt;br&gt;Alternatively, responses can be filtered by the &lt;b&gt;trans_begin_time&lt;/b&gt; and &lt;b&gt;trans_end_time&lt;/b&gt; query parameters. If these parameters are used, the actual costs of all packages created within this date range are returned.&lt;br&gt;&lt;br&gt;Only one filtering method can be used per call.
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
     * @return a {@link ActualCostsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActualCostsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ActualCostsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method is used to retrieve the actual weight and cost for one or more packages based on the provided input criteria.&lt;br&gt;&lt;br&gt;Responses can be filtered by the &lt;b&gt;tracking_numbers&lt;/b&gt; query parameter. If this parameter is used, actual costs for each package associated with the provided tracking numbers are returned.&lt;br&gt;&lt;br&gt;Alternatively, responses can be filtered by the &lt;b&gt;trans_begin_time&lt;/b&gt; and &lt;b&gt;trans_end_time&lt;/b&gt; query parameters. If these parameters are used, the actual costs of all packages created within this date range are returned.&lt;br&gt;&lt;br&gt;Only one filtering method can be used per call.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter specifies the tracking number(s) of the package(s) for which to retrieve the actual weight and cost. Tracking numbers are returned when creating packages through the &lt;a href=&quot;/api-docs/sell/edelivery_international_shipping/resources/package/methods/createPackage&quot; target=&quot;_blank&quot;&gt;createPackage&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;Up to 200 tracking numbers can be provided.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This query parameter is required if &lt;b&gt;trans_begin_time&lt;/b&gt; and &lt;b&gt;trans_end_time&lt;/b&gt; is not provided.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String trackingNumbers;
        /**
         * This query parameter specifies the start time of a transaction in UTC format.&lt;br&gt;&lt;br&gt;If the the &lt;/b&gt;trans_begin_time&lt;/b&gt; and &lt;b&gt;trans_end_time&lt;/b&gt; query parameters are used, the actual costs of all packages created within this date range are returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This query parameter and &lt;b&gt;trans_end_time&lt;/b&gt; are required if &lt;b&gt;tracking_numbers&lt;/b&gt; is not provided.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Format&lt;/b&gt;: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String transBeginTime;
        /**
         * This query parameter specifies ending time of a transaction in UTC format.&lt;br&gt;&lt;br&gt;If the the &lt;/b&gt;trans_begin_time&lt;/b&gt; and &lt;b&gt;trans_end_time&lt;/b&gt; query parameters are used, the actual costs of all packages created within this date range are returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This query parameter and &lt;b&gt;trans_start_time&lt;/b&gt; are required if &lt;b&gt;tracking_numbers&lt;/b&gt; is not provided.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Format&lt;/b&gt;: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String transEndTime;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("tracking_numbers", trackingNumbers);
            allQueryParams.put("trans_begin_time", transBeginTime);
            allQueryParams.put("trans_end_time", transEndTime);
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
