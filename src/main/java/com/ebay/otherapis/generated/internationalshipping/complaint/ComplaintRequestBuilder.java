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

package com.ebay.otherapis.generated.internationalshipping.complaint;

import com.ebay.otherapis.generated.internationalshipping.models.AddComplaintRequest;
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
 * Builds and executes requests for operations under /complaint
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComplaintRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ComplaintRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ComplaintRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/complaint", pathParameters);
    }
    /**
     * Instantiates a new {@link ComplaintRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ComplaintRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/complaint", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a complaint about a shipment order. Complaints can be filed if there is a pickup delay on an order or if an item has been lost in transit.&lt;br&gt;&lt;br&gt;The complaint reason, complaint type, and the date the issue occurred must be specified in the request. If the complaint is being filed for a missing package, the affected &lt;b&gt;packageId&lt;/b&gt; values must also be specified in the &lt;b&gt;affectedPackages&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;If the call was successful, HTTP status code &lt;b&gt;201 Created&lt;/b&gt; will be returned, and the complaint will be created.
     * @param body This type is used to define the request container of the &lt;b&gt;createComplaint&lt;/b&gt; method.
     * @return a {@link ComplaintPostResponse}
     */
    @jakarta.annotation.Nullable
    public ComplaintPostResponse post(@jakarta.annotation.Nonnull final AddComplaintRequest body) {
        return post(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a complaint about a shipment order. Complaints can be filed if there is a pickup delay on an order or if an item has been lost in transit.&lt;br&gt;&lt;br&gt;The complaint reason, complaint type, and the date the issue occurred must be specified in the request. If the complaint is being filed for a missing package, the affected &lt;b&gt;packageId&lt;/b&gt; values must also be specified in the &lt;b&gt;affectedPackages&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;If the call was successful, HTTP status code &lt;b&gt;201 Created&lt;/b&gt; will be returned, and the complaint will be created.
     * @param body This type is used to define the request container of the &lt;b&gt;createComplaint&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ComplaintPostResponse}
     */
    @jakarta.annotation.Nullable
    public ComplaintPostResponse post(@jakarta.annotation.Nonnull final AddComplaintRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ComplaintPostResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a complaint about a shipment order. Complaints can be filed if there is a pickup delay on an order or if an item has been lost in transit.&lt;br&gt;&lt;br&gt;The complaint reason, complaint type, and the date the issue occurred must be specified in the request. If the complaint is being filed for a missing package, the affected &lt;b&gt;packageId&lt;/b&gt; values must also be specified in the &lt;b&gt;affectedPackages&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;If the call was successful, HTTP status code &lt;b&gt;201 Created&lt;/b&gt; will be returned, and the complaint will be created.
     * @param body This type is used to define the request container of the &lt;b&gt;createComplaint&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddComplaintRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a complaint about a shipment order. Complaints can be filed if there is a pickup delay on an order or if an item has been lost in transit.&lt;br&gt;&lt;br&gt;The complaint reason, complaint type, and the date the issue occurred must be specified in the request. If the complaint is being filed for a missing package, the affected &lt;b&gt;packageId&lt;/b&gt; values must also be specified in the &lt;b&gt;affectedPackages&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;If the call was successful, HTTP status code &lt;b&gt;201 Created&lt;/b&gt; will be returned, and the complaint will be created.
     * @param body This type is used to define the request container of the &lt;b&gt;createComplaint&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddComplaintRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ComplaintRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ComplaintRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ComplaintRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
