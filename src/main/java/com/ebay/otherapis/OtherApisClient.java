package com.ebay.otherapis;

import com.ebay.otherapis.clients.rest.IdentityClient;
import com.ebay.otherapis.clients.rest.TranslationClient;
import com.ebay.otherapis.clients.rest.VeroClient;
import com.ebay.otherapis.clients.rest.InternationalShippingClient;
import com.ebay.otherapis.configuration.OtherApisConfiguration;
import com.ebay.otherapis.configuration.KiotaAuthProvider;
import com.ebay.otherapis.generated.identity.IdentityApiClient;
import com.ebay.otherapis.generated.translation.TranslationApiClient;
import com.ebay.otherapis.generated.vero.VeroApiClient;
import com.ebay.otherapis.generated.internationalshipping.InternationalShippingApiClient;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import okhttp3.OkHttpClient;
import java.io.Closeable;

/**
 * Main facade for the Other APIs SDK.
 * Provides unified access to Identity, Translation, VeRO, and International Shipping APIs.
 *
 * <pre>{@code
 * var config = new OtherApisConfiguration();
 * config.setAccessToken("your-token");
 *
 * try (var sdk = new OtherApisClient(config)) {
 *     var user = sdk.identity.getUser(null, null);
 *     System.out.println(user);
 * }
 * }</pre>
 */
public final class OtherApisClient implements Closeable {
    private final OkHttpClient sharedHttpClient;

    public final IdentityClient identity;
    public final TranslationClient translation;
    public final VeroClient vero;
    public final InternationalShippingClient internationalShipping;

    public OtherApisClient(OtherApisConfiguration config) {
        // Shared OkHttpClient for all REST clients
        this.sharedHttpClient = new OkHttpClient.Builder()
            .build();

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        // Identity API client
        var identityAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        identityAdapter.setBaseUrl(config.getIdentityBaseUrl());
        this.identity = new IdentityClient(new IdentityApiClient(identityAdapter), config);

        // Translation API client
        var translationAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        translationAdapter.setBaseUrl(config.getTranslationBaseUrl());
        this.translation = new TranslationClient(new TranslationApiClient(translationAdapter), config);

        // VeRO API client
        var veroAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        veroAdapter.setBaseUrl(config.getVeroBaseUrl());
        this.vero = new VeroClient(new VeroApiClient(veroAdapter), config);

        // International Shipping API client
        var internationalShippingAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        internationalShippingAdapter.setBaseUrl(config.getInternationalShippingBaseUrl());
        this.internationalShipping = new InternationalShippingClient(
            new InternationalShippingApiClient(internationalShippingAdapter), config);
    }

    /**
     * Constructor with custom OkHttpClient.
     * Useful for testing or custom HTTP configuration.
     */
    public OtherApisClient(OtherApisConfiguration config, OkHttpClient httpClient) {
        this.sharedHttpClient = httpClient;

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        var identityAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        identityAdapter.setBaseUrl(config.getIdentityBaseUrl());
        this.identity = new IdentityClient(new IdentityApiClient(identityAdapter), config);

        var translationAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        translationAdapter.setBaseUrl(config.getTranslationBaseUrl());
        this.translation = new TranslationClient(new TranslationApiClient(translationAdapter), config);

        var veroAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        veroAdapter.setBaseUrl(config.getVeroBaseUrl());
        this.vero = new VeroClient(new VeroApiClient(veroAdapter), config);

        var internationalShippingAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        internationalShippingAdapter.setBaseUrl(config.getInternationalShippingBaseUrl());
        this.internationalShipping = new InternationalShippingClient(
            new InternationalShippingApiClient(internationalShippingAdapter), config);
    }

    @Override
    public void close() {
        sharedHttpClient.dispatcher().executorService().shutdown();
        sharedHttpClient.connectionPool().evictAll();
    }
}
