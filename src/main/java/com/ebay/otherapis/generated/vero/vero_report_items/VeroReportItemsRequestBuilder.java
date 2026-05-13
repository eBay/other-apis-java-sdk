package com.ebay.otherapis.generated.vero.vero_report_items;

import com.ebay.otherapis.generated.vero.models.VeroReportStatusResponse;
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
 * Builds and executes requests for operations under /vero_report_items
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VeroReportItemsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link VeroReportItemsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VeroReportItemsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/vero_report_items{?filter*,itemId*,limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link VeroReportItemsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VeroReportItemsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/vero_report_items{?filter*,itemId*,limit*,offset*}", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; You must be a member of the Verified Rights Owner (VeRO) Program to use this call.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve status information about one or more VeRO reported items you have submitted.&lt;br&gt;&lt;br&gt;Without the use of any query parameters, the default behavior of this method is to return the status of all VeRO reported items submitted by the seller during the last two years. Use the &lt;b&gt;itemId&lt;/b&gt; query parameter to see a specific reported item, and use the &lt;b&gt;filter&lt;/b&gt; query to retrieve the status of reported items submitted within a specific date range. Pagination is also available to limit the number of reported items that are retrieved per page of data.
     * @return a {@link VeroReportStatusResponse}
     */
    @jakarta.annotation.Nullable
    public VeroReportStatusResponse get() {
        return get(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; You must be a member of the Verified Rights Owner (VeRO) Program to use this call.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve status information about one or more VeRO reported items you have submitted.&lt;br&gt;&lt;br&gt;Without the use of any query parameters, the default behavior of this method is to return the status of all VeRO reported items submitted by the seller during the last two years. Use the &lt;b&gt;itemId&lt;/b&gt; query parameter to see a specific reported item, and use the &lt;b&gt;filter&lt;/b&gt; query to retrieve the status of reported items submitted within a specific date range. Pagination is also available to limit the number of reported items that are retrieved per page of data.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VeroReportStatusResponse}
     */
    @jakarta.annotation.Nullable
    public VeroReportStatusResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, VeroReportStatusResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; You must be a member of the Verified Rights Owner (VeRO) Program to use this call.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve status information about one or more VeRO reported items you have submitted.&lt;br&gt;&lt;br&gt;Without the use of any query parameters, the default behavior of this method is to return the status of all VeRO reported items submitted by the seller during the last two years. Use the &lt;b&gt;itemId&lt;/b&gt; query parameter to see a specific reported item, and use the &lt;b&gt;filter&lt;/b&gt; query to retrieve the status of reported items submitted within a specific date range. Pagination is also available to limit the number of reported items that are retrieved per page of data.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; You must be a member of the Verified Rights Owner (VeRO) Program to use this call.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve status information about one or more VeRO reported items you have submitted.&lt;br&gt;&lt;br&gt;Without the use of any query parameters, the default behavior of this method is to return the status of all VeRO reported items submitted by the seller during the last two years. Use the &lt;b&gt;itemId&lt;/b&gt; query parameter to see a specific reported item, and use the &lt;b&gt;filter&lt;/b&gt; query to retrieve the status of reported items submitted within a specific date range. Pagination is also available to limit the number of reported items that are retrieved per page of data.
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
     * @return a {@link VeroReportItemsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VeroReportItemsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VeroReportItemsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; You must be a member of the Verified Rights Owner (VeRO) Program to use this call.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve status information about one or more VeRO reported items you have submitted.&lt;br&gt;&lt;br&gt;Without the use of any query parameters, the default behavior of this method is to return the status of all VeRO reported items submitted by the seller during the last two years. Use the &lt;b&gt;itemId&lt;/b&gt; query parameter to see a specific reported item, and use the &lt;b&gt;filter&lt;/b&gt; query to retrieve the status of reported items submitted within a specific date range. Pagination is also available to limit the number of reported items that are retrieved per page of data.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter can be used to filter the result set by a date range. Only items reported within the specified time period will be returned.&lt;br&gt;&lt;br&gt;This parameter will be ignored if &lt;b&gt;itemId&lt;/b&gt; has been specified.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;YYYY-MM-DD HH:MM:SS&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Example&lt;/b&gt;: &lt;code&gt;reportSubmittedDate:[2024-11-14T07:47:48Z..2024-12-14T07:47:48Z]&lt;/code&gt;.
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * This query parameter specifies the unique identifier of an eBay listing. Only the specified reported item will be returned.
         */
        @jakarta.annotation.Nullable
        public String itemId;
        /**
         * The maximum number of entries that can be returned on each page of the paginated response. Use this parameter in conjunction with the &lt;b&gt;offset&lt;/b&gt; parameter to control the pagination of the output.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the call retrieves entries 11 through 20 from the result set.&lt;br&gt;&lt;br&gt;If this parameter is omitted, the default value is used.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 25
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * The number of reports to skip in the result set before returning the first report in the paginated response. Combine offset with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the reports returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 reports from the complete list of reports retrieved by the call. If this query parameter is not set, the default value is used and the first page of reports is returned.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 0
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("filter", filter);
            allQueryParams.put("itemId", itemId);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
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
