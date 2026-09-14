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

package com.ebay.otherapis.configuration;

import jakarta.annotation.Nullable;
import java.util.HashSet;
import java.util.Set;

public final class OtherApisConfiguration {
    private @Nullable String accessToken;
    private RequestOptions defaultRequestOptions = new RequestOptions();

    private final String identityBaseUrl;
    private final String internationalShippingBaseUrl;
    private final String translationBaseUrl;
    private final String veroApiV2BaseUrl;
    private final String veroBaseUrl;

    public OtherApisConfiguration() {
        this.identityBaseUrl = "https://apiz.ebay.com/commerce/identity/v1";
        this.internationalShippingBaseUrl = "https://api.ebay.com/sell/edelivery_international_shipping/v1";
        this.translationBaseUrl = "https://api.ebay.com/commerce/translation/v1_beta";
        this.veroApiV2BaseUrl = "https://api.ebay.com/commerce/vero/v2";
        this.veroBaseUrl = "https://api.ebay.com/commerce/vero/v1";
    }

    public OtherApisConfiguration(
            String identityBaseUrl,
            String internationalShippingBaseUrl,
            String translationBaseUrl,
            String veroApiV2BaseUrl,
            String veroBaseUrl) {
        this.identityBaseUrl = validateHost(identityBaseUrl);
        this.internationalShippingBaseUrl = validateHost(internationalShippingBaseUrl);
        this.translationBaseUrl = validateHost(translationBaseUrl);
        this.veroApiV2BaseUrl = validateHost(veroApiV2BaseUrl);
        this.veroBaseUrl = validateHost(veroBaseUrl);
    }

    private String validateHost(String url) {
        try {
            String host = new java.net.URI(url).getHost();
            if (host == null || !getAllowedHosts().contains(host)) {
                throw new IllegalArgumentException("URL host not in allowed list: " + url);
            }
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URL: " + url, e);
        }
        return url;
    }

    /**
     * Sets the OAuth Bearer token used for API calls when no per-call token is provided.
     *
     * <p><b>Security note:</b> The token is stored as a Java {@code String} and will remain
     * in heap memory until garbage collected. To minimize exposure: do not log this
     * configuration object, null out the token reference when it is no longer needed,
     * and avoid storing the configuration longer than the client lifecycle.
     */
    public void setAccessToken(@Nullable String token) {
        this.accessToken = token;
    }

    public @Nullable String getAccessToken() {
        return accessToken;
    }

    public RequestOptions getDefaultRequestOptions() {
        return defaultRequestOptions;
    }

    public Set<String> getAllowedHosts() {
        Set<String> hosts = new HashSet<>();
        hosts.add("api.ebay.com");
        hosts.add("apiz.ebay.com");
        return hosts;
    }

    public String getIdentityBaseUrl() {
        return identityBaseUrl;
    }

    public String getInternationalShippingBaseUrl() {
        return internationalShippingBaseUrl;
    }

    public String getTranslationBaseUrl() {
        return translationBaseUrl;
    }

    public String getVeroApiV2BaseUrl() {
        return veroApiV2BaseUrl;
    }

    public String getVeroBaseUrl() {
        return veroBaseUrl;
    }
}
