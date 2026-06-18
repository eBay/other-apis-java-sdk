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

import java.net.URI;
import java.util.Set;
import java.util.HashSet;

/**
 * Configuration for the Other APIs SDK.
 * Provides base URLs for Identity, Translation, VeRO, and International Shipping APIs,
 * and optional fallback access token.
 */
public final class OtherApisConfiguration {
    private static final Set<String> ALLOWED_HOSTS = Set.of("apiz.ebay.com", "api.ebay.com");

    // Base URLs for each API (private final — set at construction time)
    private final String identityBaseUrl;
    private final String translationBaseUrl;
    private final String veroBaseUrl;
    private final String internationalShippingBaseUrl;

    private String accessToken;  // static fallback; per-call token takes precedence
    private boolean diagnosticLogging = false;

    /**
     * Default request options (headers) applied to all SDK calls.
     * Per-call RequestOptions will override these.
     */
    private RequestOptions defaultRequestOptions = new RequestOptions();

    /** No-arg constructor uses eBay production URLs. */
    public OtherApisConfiguration() {
        this.identityBaseUrl = "https://apiz.ebay.com/commerce/identity/v1";
        this.translationBaseUrl = "https://api.ebay.com/commerce/translation/v1_beta";
        this.veroBaseUrl = "https://api.ebay.com/commerce/vero/v1";
        this.internationalShippingBaseUrl = "https://api.ebay.com/sell/edelivery/international_shipping";
    }

    /**
     * Constructor that accepts custom base URLs.
     * Each URL host is validated against the eBay allowed-hosts list.
     *
     * @param identityBaseUrl             Identity API base URL
     * @param translationBaseUrl          Translation API base URL
     * @param veroBaseUrl                 VeRO API base URL
     * @param internationalShippingBaseUrl International Shipping API base URL
     */
    public OtherApisConfiguration(
            String identityBaseUrl,
            String translationBaseUrl,
            String veroBaseUrl,
            String internationalShippingBaseUrl) {
        this.identityBaseUrl = validateHost(identityBaseUrl);
        this.translationBaseUrl = validateHost(translationBaseUrl);
        this.veroBaseUrl = validateHost(veroBaseUrl);
        this.internationalShippingBaseUrl = validateHost(internationalShippingBaseUrl);
    }

    // Getters (no setters for URL fields — private final)
    public String getIdentityBaseUrl() { return identityBaseUrl; }
    public String getTranslationBaseUrl() { return translationBaseUrl; }
    public String getVeroBaseUrl() { return veroBaseUrl; }
    public String getInternationalShippingBaseUrl() { return internationalShippingBaseUrl; }

    /**
     * Sets the fallback OAuth access token.
     *
     * <p><strong>Security note:</strong> Access tokens are held as plain {@code String} objects
     * on the Java heap and cannot be zeroed after use. Minimise the token lifetime by preferring
     * per-call tokens over a long-lived config token wherever possible.
     */
    public String getAccessToken() { return accessToken; }
    public void setAccessToken(String accessToken) { this.accessToken = accessToken; }

    public boolean isDiagnosticLogging() { return diagnosticLogging; }
    public void setDiagnosticLogging(boolean diagnosticLogging) { this.diagnosticLogging = diagnosticLogging; }

    public RequestOptions getDefaultRequestOptions() { return defaultRequestOptions; }
    public void setDefaultRequestOptions(RequestOptions defaultRequestOptions) {
        this.defaultRequestOptions = defaultRequestOptions;
    }

    /**
     * All hostnames tokens may be sent to; used by AllowedHostsValidator.
     */
    public Set<String> getAllowedHosts() {
        Set<String> hosts = new HashSet<>();
        hosts.add(extractHost(identityBaseUrl));
        hosts.add(extractHost(translationBaseUrl));
        hosts.add(extractHost(veroBaseUrl));
        hosts.add(extractHost(internationalShippingBaseUrl));
        return hosts;
    }

    private static String validateHost(String url) {
        try {
            String host = new java.net.URI(url).getHost();
            if (host == null || !ALLOWED_HOSTS.contains(host)) {
                throw new IllegalArgumentException("URL host not in allowed list: " + url);
            }
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URL: " + url, e);
        }
        return url;
    }

    private String extractHost(String url) {
        try {
            return URI.create(url).getHost();
        } catch (Exception e) {
            return "api.ebay.com"; // fallback
        }
    }
}
