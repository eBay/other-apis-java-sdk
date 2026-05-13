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
    // Base URLs for each API
    private String identityBaseUrl = "https://apiz.ebay.com/commerce/identity/v1";
    private String translationBaseUrl = "https://api.ebay.com/commerce/translation/v1_beta";
    private String veroBaseUrl = "https://api.ebay.com/commerce/vero/v1";
    private String internationalShippingBaseUrl = "https://api.ebay.com/sell/edelivery_international_shipping/v1";

    private String accessToken;  // static fallback; per-call token takes precedence
    private boolean diagnosticLogging = false;

    /**
     * Default request options (headers) applied to all SDK calls.
     * Per-call RequestOptions will override these.
     */
    private RequestOptions defaultRequestOptions = new RequestOptions();

    // Getters and setters
    public String getIdentityBaseUrl() { return identityBaseUrl; }
    public void setIdentityBaseUrl(String identityBaseUrl) { this.identityBaseUrl = identityBaseUrl; }

    public String getTranslationBaseUrl() { return translationBaseUrl; }
    public void setTranslationBaseUrl(String translationBaseUrl) { this.translationBaseUrl = translationBaseUrl; }

    public String getVeroBaseUrl() { return veroBaseUrl; }
    public void setVeroBaseUrl(String veroBaseUrl) { this.veroBaseUrl = veroBaseUrl; }

    public String getInternationalShippingBaseUrl() { return internationalShippingBaseUrl; }
    public void setInternationalShippingBaseUrl(String internationalShippingBaseUrl) {
        this.internationalShippingBaseUrl = internationalShippingBaseUrl;
    }

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

    private String extractHost(String url) {
        try {
            return URI.create(url).getHost();
        } catch (Exception e) {
            return "api.ebay.com"; // fallback
        }
    }
}
