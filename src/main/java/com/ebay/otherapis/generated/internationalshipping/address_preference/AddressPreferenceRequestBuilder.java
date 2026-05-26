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

package com.ebay.otherapis.generated.internationalshipping.address_preference;

import com.ebay.otherapis.generated.internationalshipping.models.CreateAddressPreferenceRequest;
import com.ebay.otherapis.generated.internationalshipping.models.CreateAddressPreferenceResponses;
import com.ebay.otherapis.generated.internationalshipping.models.GetAddressPreferenceListResponses;
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
 * Builds and executes requests for operations under /address_preference
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddressPreferenceRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AddressPreferenceRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddressPreferenceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/address_preference", pathParameters);
    }
    /**
     * Instantiates a new {@link AddressPreferenceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddressPreferenceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/address_preference", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve information about all the ship-from and/or return addresses associated with a seller&apos;s eDIS account.
     * @return a {@link GetAddressPreferenceListResponses}
     */
    @jakarta.annotation.Nullable
    public GetAddressPreferenceListResponses get() {
        return get(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve information about all the ship-from and/or return addresses associated with a seller&apos;s eDIS account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetAddressPreferenceListResponses}
     */
    @jakarta.annotation.Nullable
    public GetAddressPreferenceListResponses get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetAddressPreferenceListResponses::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create an address on your eDIS account.&lt;br&gt;&lt;br&gt;The following types of addresses can be created through this method:&lt;ul&gt;&lt;li&gt;&lt;code&gt;SHIP_FROM_ADDRESS&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RETURN_ADDRESS&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;The address information for the address, including location details, contact information, and address type, must be provided in the &lt;b&gt;shipFromAddress&lt;/b&gt; container. If the call is successful, the &lt;b&gt;addressId&lt;/b&gt; for the newly created address will be returned. This identifier can then be used when creating a package to specify the address to use for the shipment.
     * @param body This type is used to define the request container used in the &lt;b&gt;createAddressPreference&lt;/b&gt; method.
     * @return a {@link CreateAddressPreferenceResponses}
     */
    @jakarta.annotation.Nullable
    public CreateAddressPreferenceResponses post(@jakarta.annotation.Nonnull final CreateAddressPreferenceRequest body) {
        return post(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create an address on your eDIS account.&lt;br&gt;&lt;br&gt;The following types of addresses can be created through this method:&lt;ul&gt;&lt;li&gt;&lt;code&gt;SHIP_FROM_ADDRESS&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RETURN_ADDRESS&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;The address information for the address, including location details, contact information, and address type, must be provided in the &lt;b&gt;shipFromAddress&lt;/b&gt; container. If the call is successful, the &lt;b&gt;addressId&lt;/b&gt; for the newly created address will be returned. This identifier can then be used when creating a package to specify the address to use for the shipment.
     * @param body This type is used to define the request container used in the &lt;b&gt;createAddressPreference&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CreateAddressPreferenceResponses}
     */
    @jakarta.annotation.Nullable
    public CreateAddressPreferenceResponses post(@jakarta.annotation.Nonnull final CreateAddressPreferenceRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CreateAddressPreferenceResponses::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve information about all the ship-from and/or return addresses associated with a seller&apos;s eDIS account.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve information about all the ship-from and/or return addresses associated with a seller&apos;s eDIS account.
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
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create an address on your eDIS account.&lt;br&gt;&lt;br&gt;The following types of addresses can be created through this method:&lt;ul&gt;&lt;li&gt;&lt;code&gt;SHIP_FROM_ADDRESS&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RETURN_ADDRESS&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;The address information for the address, including location details, contact information, and address type, must be provided in the &lt;b&gt;shipFromAddress&lt;/b&gt; container. If the call is successful, the &lt;b&gt;addressId&lt;/b&gt; for the newly created address will be returned. This identifier can then be used when creating a package to specify the address to use for the shipment.
     * @param body This type is used to define the request container used in the &lt;b&gt;createAddressPreference&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateAddressPreferenceRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; This method is only available for Greater-China based sellers with an active eDIS account.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to create an address on your eDIS account.&lt;br&gt;&lt;br&gt;The following types of addresses can be created through this method:&lt;ul&gt;&lt;li&gt;&lt;code&gt;SHIP_FROM_ADDRESS&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RETURN_ADDRESS&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;The address information for the address, including location details, contact information, and address type, must be provided in the &lt;b&gt;shipFromAddress&lt;/b&gt; container. If the call is successful, the &lt;b&gt;addressId&lt;/b&gt; for the newly created address will be returned. This identifier can then be used when creating a package to specify the address to use for the shipment.
     * @param body This type is used to define the request container used in the &lt;b&gt;createAddressPreference&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateAddressPreferenceRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AddressPreferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddressPreferenceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AddressPreferenceRequestBuilder(rawUrl, requestAdapter);
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
