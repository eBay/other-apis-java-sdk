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

package com.ebay.otherapis.generated.internationalshipping.packageescaped;

import com.ebay.otherapis.generated.internationalshipping.models.AddPackageRequest;
import com.ebay.otherapis.generated.internationalshipping.models.AddPackageResponses;
import com.ebay.otherapis.generated.internationalshipping.models.Error;
import com.ebay.otherapis.generated.internationalshipping.packageescaped.bulk_cancel_packages.BulkCancelPackagesRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.packageescaped.bulk_confirm_packages.BulkConfirmPackagesRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.packageescaped.bulk_delete_packages.BulkDeletePackagesRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.packageescaped.item.OrderLineItemItemRequestBuilder;
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
 * Builds and executes requests for operations under /package
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PackageRequestBuilder extends BaseRequestBuilder {
    /**
     * The bulk_cancel_packages property
     * @return a {@link BulkCancelPackagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkCancelPackagesRequestBuilder bulkCancelPackages() {
        return new BulkCancelPackagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_confirm_packages property
     * @return a {@link BulkConfirmPackagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkConfirmPackagesRequestBuilder bulkConfirmPackages() {
        return new BulkConfirmPackagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_delete_packages property
     * @return a {@link BulkDeletePackagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkDeletePackagesRequestBuilder bulkDeletePackages() {
        return new BulkDeletePackagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.otherapis.generated.internationalshipping.package.item collection
     * @param order_line_item_Id This path parameter specifies the unique identifier of the package being retrieved.&lt;br&gt;&lt;br&gt;This ID value is returned when creating a package through the &lt;a href=&quot;/develop/api/sell/edelivery_international_shipping_api#sell-edelivery_international_shipping_api-package-createpackage&quot;&gt;createPackage&lt;/a&gt; method.
     * @return a {@link OrderLineItemItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrderLineItemItemRequestBuilder byOrder_line_item_Id(@jakarta.annotation.Nonnull final String order_line_item_Id) {
        Objects.requireNonNull(order_line_item_Id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("order_line_item_%2Did", order_line_item_Id);
        return new OrderLineItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PackageRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PackageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/package", pathParameters);
    }
    /**
     * Instantiates a new {@link PackageRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PackageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/package", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a package for an order.&lt;br&gt;&lt;br&gt;To create a package, the package&apos;s shipping information, such as the dimensions, weight, ship from, and ship to address, as well as information about the item(s) it contains must be specified in the request.&lt;br&gt;&lt;br&gt;If the call is successful, the &lt;b&gt;packageId&lt;/b&gt; and tracking number for the newly created package will be returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of the returned &lt;b&gt;packageId&lt;/b&gt;, as there is no programmatic way to retrieve this value at this time.&lt;/span&gt;
     * @param body This type defines the request container used in the &lt;b&gt;createPackage&lt;/b&gt; method.
     * @return a {@link AddPackageResponses}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AddPackageResponses post(@jakarta.annotation.Nonnull final AddPackageRequest body) {
        return post(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a package for an order.&lt;br&gt;&lt;br&gt;To create a package, the package&apos;s shipping information, such as the dimensions, weight, ship from, and ship to address, as well as information about the item(s) it contains must be specified in the request.&lt;br&gt;&lt;br&gt;If the call is successful, the &lt;b&gt;packageId&lt;/b&gt; and tracking number for the newly created package will be returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of the returned &lt;b&gt;packageId&lt;/b&gt;, as there is no programmatic way to retrieve this value at this time.&lt;/span&gt;
     * @param body This type defines the request container used in the &lt;b&gt;createPackage&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AddPackageResponses}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AddPackageResponses post(@jakarta.annotation.Nonnull final AddPackageRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("401", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AddPackageResponses::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a package for an order.&lt;br&gt;&lt;br&gt;To create a package, the package&apos;s shipping information, such as the dimensions, weight, ship from, and ship to address, as well as information about the item(s) it contains must be specified in the request.&lt;br&gt;&lt;br&gt;If the call is successful, the &lt;b&gt;packageId&lt;/b&gt; and tracking number for the newly created package will be returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of the returned &lt;b&gt;packageId&lt;/b&gt;, as there is no programmatic way to retrieve this value at this time.&lt;/span&gt;
     * @param body This type defines the request container used in the &lt;b&gt;createPackage&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddPackageRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create a package for an order.&lt;br&gt;&lt;br&gt;To create a package, the package&apos;s shipping information, such as the dimensions, weight, ship from, and ship to address, as well as information about the item(s) it contains must be specified in the request.&lt;br&gt;&lt;br&gt;If the call is successful, the &lt;b&gt;packageId&lt;/b&gt; and tracking number for the newly created package will be returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers should keep track of the returned &lt;b&gt;packageId&lt;/b&gt;, as there is no programmatic way to retrieve this value at this time.&lt;/span&gt;
     * @param body This type defines the request container used in the &lt;b&gt;createPackage&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddPackageRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link PackageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PackageRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PackageRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
