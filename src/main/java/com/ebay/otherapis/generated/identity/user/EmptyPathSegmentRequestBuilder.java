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

package com.ebay.otherapis.generated.identity.user;

import com.ebay.otherapis.generated.identity.models.Error;
import com.ebay.otherapis.generated.identity.models.UserResponse;
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
 * Builds and executes requests for operations under /user/
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmptyPathSegmentRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link EmptyPathSegmentRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmptyPathSegmentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user/", pathParameters);
    }
    /**
     * Instantiates a new {@link EmptyPathSegmentRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmptyPathSegmentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user/", rawUrl);
    }
    /**
     * This method retrieves the account profile information for an authenticated user, which requires a &lt;strong&gt;User access token&lt;/strong&gt;. What is returned is controlled by the &lt;strong&gt;scopes&lt;/strong&gt;. &lt;p&gt;For a business account you use the default scope &lt;code&gt;commerce.identity.readonly&lt;/code&gt;, which returns all the fields in the &lt;strong&gt;businessAccount&lt;/strong&gt; container. These are returned because this is all public information.&lt;/p&gt;  &lt;p&gt; For an individual account, the fields returned in the &lt;strong&gt;individualAccount&lt;/strong&gt; container are based on the scope you use. Using the default scope, only public information, such as eBay user ID, are returned. For details about what each scope returns, see the &lt;strong&gt;Identity API scopes&lt;/strong&gt;.&lt;/p&gt;
     * @return a {@link UserResponse}
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public UserResponse get() {
        return get(null);
    }
    /**
     * This method retrieves the account profile information for an authenticated user, which requires a &lt;strong&gt;User access token&lt;/strong&gt;. What is returned is controlled by the &lt;strong&gt;scopes&lt;/strong&gt;. &lt;p&gt;For a business account you use the default scope &lt;code&gt;commerce.identity.readonly&lt;/code&gt;, which returns all the fields in the &lt;strong&gt;businessAccount&lt;/strong&gt; container. These are returned because this is all public information.&lt;/p&gt;  &lt;p&gt; For an individual account, the fields returned in the &lt;strong&gt;individualAccount&lt;/strong&gt; container are based on the scope you use. Using the default scope, only public information, such as eBay user ID, are returned. For details about what each scope returns, see the &lt;strong&gt;Identity API scopes&lt;/strong&gt;.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UserResponse}
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public UserResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UserResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves the account profile information for an authenticated user, which requires a &lt;strong&gt;User access token&lt;/strong&gt;. What is returned is controlled by the &lt;strong&gt;scopes&lt;/strong&gt;. &lt;p&gt;For a business account you use the default scope &lt;code&gt;commerce.identity.readonly&lt;/code&gt;, which returns all the fields in the &lt;strong&gt;businessAccount&lt;/strong&gt; container. These are returned because this is all public information.&lt;/p&gt;  &lt;p&gt; For an individual account, the fields returned in the &lt;strong&gt;individualAccount&lt;/strong&gt; container are based on the scope you use. Using the default scope, only public information, such as eBay user ID, are returned. For details about what each scope returns, see the &lt;strong&gt;Identity API scopes&lt;/strong&gt;.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the account profile information for an authenticated user, which requires a &lt;strong&gt;User access token&lt;/strong&gt;. What is returned is controlled by the &lt;strong&gt;scopes&lt;/strong&gt;. &lt;p&gt;For a business account you use the default scope &lt;code&gt;commerce.identity.readonly&lt;/code&gt;, which returns all the fields in the &lt;strong&gt;businessAccount&lt;/strong&gt; container. These are returned because this is all public information.&lt;/p&gt;  &lt;p&gt; For an individual account, the fields returned in the &lt;strong&gt;individualAccount&lt;/strong&gt; container are based on the scope you use. Using the default scope, only public information, such as eBay user ID, are returned. For details about what each scope returns, see the &lt;strong&gt;Identity API scopes&lt;/strong&gt;.&lt;/p&gt;
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
     * @return a {@link EmptyPathSegmentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmptyPathSegmentRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EmptyPathSegmentRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
