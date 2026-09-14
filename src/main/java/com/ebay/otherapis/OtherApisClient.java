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

package com.ebay.otherapis;

import com.ebay.otherapis.clients.rest.IdentityClient;
import com.ebay.otherapis.clients.rest.InternationalShippingClient;
import com.ebay.otherapis.clients.rest.TranslationClient;
import com.ebay.otherapis.clients.rest.VeroApiV2Client;
import com.ebay.otherapis.clients.rest.VeroClient;
import com.ebay.otherapis.configuration.KiotaAuthProvider;
import com.ebay.otherapis.configuration.OtherApisConfiguration;
import com.ebay.otherapis.generated.identity.IdentityApiClient;
import com.ebay.otherapis.generated.internationalshipping.InternationalShippingApiClient;
import com.ebay.otherapis.generated.translation.TranslationApiClient;
import com.ebay.otherapis.generated.veroapiv2.VeroApiV2ApiClient;
import com.ebay.otherapis.generated.vero.VeroApiClient;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import okhttp3.OkHttpClient;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/**
 * Main facade for the Other APIs SDK.
 */
public final class OtherApisClient implements Closeable {
    private final OkHttpClient sharedHttpClient;

    public final IdentityClient identity;
    public final InternationalShippingClient internationalShipping;
    public final TranslationClient translation;
    public final VeroApiV2Client veroApiV2;
    public final VeroClient vero;

    public OtherApisClient(OtherApisConfiguration config) {
        this.sharedHttpClient = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build();

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        var identityAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        identityAdapter.setBaseUrl(config.getIdentityBaseUrl());
        this.identity = new IdentityClient(new IdentityApiClient(identityAdapter), config);

        var internationalShippingAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        internationalShippingAdapter.setBaseUrl(config.getInternationalShippingBaseUrl());
        this.internationalShipping = new InternationalShippingClient(new InternationalShippingApiClient(internationalShippingAdapter), config);

        var translationAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        translationAdapter.setBaseUrl(config.getTranslationBaseUrl());
        this.translation = new TranslationClient(new TranslationApiClient(translationAdapter), config);

        var veroApiV2Adapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        veroApiV2Adapter.setBaseUrl(config.getVeroApiV2BaseUrl());
        this.veroApiV2 = new VeroApiV2Client(new VeroApiV2ApiClient(veroApiV2Adapter), config);

        var veroAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        veroAdapter.setBaseUrl(config.getVeroBaseUrl());
        this.vero = new VeroClient(new VeroApiClient(veroAdapter), config);
    }

    @Override
    public void close() {
        sharedHttpClient.dispatcher().executorService().shutdown();
        sharedHttpClient.connectionPool().evictAll();
    }
}
