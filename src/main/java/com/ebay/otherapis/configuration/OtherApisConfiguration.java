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
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public final class OtherApisConfiguration {
    private @Nullable String accessToken;
    /** eBay hosts that receive the access token by default. */
    public static final Set<String> DEFAULT_ALLOWED_HOSTS = Collections.unmodifiableSet(new LinkedHashSet<>(java.util.List.of(
        "api.ebay.com",
        "api.sandbox.ebay.com",
        "apiz.ebay.com",
        "apiz.sandbox.ebay.com"
    )));

    /** Hosts that may use plain http, for example a local mock server. They must still be allowed hosts. */
    public static final Set<String> LOOPBACK_HOSTS = Set.of("127.0.0.1", "::1", "localhost");

    private RequestOptions defaultRequestOptions = new RequestOptions();
    private final Set<String> allowedHosts;

    private final String identityBaseUrl;
    private final String internationalShippingBaseUrl;
    private final String translationBaseUrl;
    private final String veroApiV2BaseUrl;

    public OtherApisConfiguration() {
        this.allowedHosts = Collections.emptySet();
        this.identityBaseUrl = "https://apiz.ebay.com/commerce/identity/v1";
        this.internationalShippingBaseUrl = "https://api.ebay.com/sell/edelivery_international_shipping/v1";
        this.translationBaseUrl = "https://api.ebay.com/commerce/translation/v1_beta";
        this.veroApiV2BaseUrl = "https://api.ebay.com/commerce/vero/v2";
    }

    public OtherApisConfiguration(
            String identityBaseUrl,
            String internationalShippingBaseUrl,
            String translationBaseUrl,
            String veroApiV2BaseUrl) {
        this(identityBaseUrl, internationalShippingBaseUrl, translationBaseUrl, veroApiV2BaseUrl, Collections.emptySet());
    }

    /**
     * @param allowedHosts additional hosts trusted with the access token, for example
     *     {@code api.sandbox.ebay.com}, or {@code 127.0.0.1} for a local mock server. Every base URL
     *     must use a host from {@link #DEFAULT_ALLOWED_HOSTS} or this collection, and https unless
     *     the host is in {@link #LOOPBACK_HOSTS}.
     * @throws IllegalArgumentException when a base URL is not trusted
     */
    public OtherApisConfiguration(
            String identityBaseUrl,
            String internationalShippingBaseUrl,
            String translationBaseUrl,
            String veroApiV2BaseUrl,
            Collection<String> allowedHosts) {
        this.allowedHosts = lowerCased(allowedHosts);
        this.identityBaseUrl = validateHost(identityBaseUrl);
        this.internationalShippingBaseUrl = validateHost(internationalShippingBaseUrl);
        this.translationBaseUrl = validateHost(translationBaseUrl);
        this.veroApiV2BaseUrl = validateHost(veroApiV2BaseUrl);
    }

    private String validateHost(String url) {
        String problem = untrustedReason(url);
        if (problem != null) {
            throw new IllegalArgumentException(problem + ": " + url);
        }
        return url;
    }

    /**
     * True when {@code url} uses a host from {@link #getAllowedHosts()} and https, or http on a
     * host from {@link #LOOPBACK_HOSTS}. Hosts compare lowercased, without IPv6 brackets.
     */
    public boolean isTrustedUrl(String url) {
        return untrustedReason(url) == null;
    }

    private @Nullable String untrustedReason(String url) {
        java.net.URI uri;
        try {
            uri = new java.net.URI(url);
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URL: " + url, e);
        }
        String host = uri.getHost();
        if (host == null) {
            return "URL has no host";
        }
        String normalizedHost = normalizeHost(host);
        String scheme = uri.getScheme();
        if (!"https".equalsIgnoreCase(scheme)
                && !("http".equalsIgnoreCase(scheme) && LOOPBACK_HOSTS.contains(normalizedHost))) {
            return "URL must use https, or http on a loopback host";
        }
        if (!getAllowedHosts().contains(normalizedHost)) {
            return "Host " + normalizedHost + " is not trusted; add it to allowedHosts to send the access token there";
        }
        return null;
    }

    private static String normalizeHost(String host) {
        String lower = host.toLowerCase(Locale.ROOT);
        return lower.startsWith("[") && lower.endsWith("]") ? lower.substring(1, lower.length() - 1) : lower;
    }

    private static Set<String> lowerCased(Collection<String> hosts) {
        Set<String> result = new HashSet<>();
        for (String host : hosts) {
            result.add(normalizeHost(host));
        }
        return Collections.unmodifiableSet(result);
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

    /** Hosts the access token may be sent to: {@link #DEFAULT_ALLOWED_HOSTS} plus configured extras. */
    public Set<String> getAllowedHosts() {
        Set<String> hosts = new HashSet<>(DEFAULT_ALLOWED_HOSTS);
        hosts.addAll(allowedHosts);
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
}
