package com.ebay.otherapis.clients.rest;

import com.ebay.otherapis.configuration.OtherApisConfiguration;
import com.ebay.otherapis.configuration.RequestOptions;
import com.ebay.otherapis.configuration.TokenContext;
import com.ebay.otherapis.generated.translation.TranslationApiClient;
import com.ebay.otherapis.generated.translation.models.TranslateRequest;
import com.ebay.otherapis.generated.translation.models.TranslateResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Commerce Translation API.
 * Provides methods to translate listing titles and descriptions between languages.
 */
public final class TranslationClient {
    private final TranslationApiClient kiota;
    private final OtherApisConfiguration config;

    public TranslationClient(TranslationApiClient kiota, OtherApisConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    /**
     * Merges default headers from config with per-call headers.
     * Per-call headers override defaults.
     */
    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    /**
     * Translate listing title and description text from one language to another.
     *
     * @param body Translation request with source and target languages
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers
     * @return CompletableFuture containing TranslateResponse with translated text
     */
    public CompletableFuture<TranslateResponse> translateAsync(
            TranslateRequest body,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.translate().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }
}
