package com.ebay.otherapis.generated.vero;

import com.ebay.otherapis.generated.vero.vero_reason_code.VeroReasonCodeRequestBuilder;
import com.ebay.otherapis.generated.vero.vero_report_items.VeroReportItemsRequestBuilder;
import com.ebay.otherapis.generated.vero.vero_report.VeroReportRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VeroApiClient extends BaseRequestBuilder {
    /**
     * The vero_reason_code property
     * @return a {@link VeroReasonCodeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VeroReasonCodeRequestBuilder veroReasonCode() {
        return new VeroReasonCodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The vero_report property
     * @return a {@link VeroReportRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VeroReportRequestBuilder veroReport() {
        return new VeroReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The vero_report_items property
     * @return a {@link VeroReportItemsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VeroReportItemsRequestBuilder veroReportItems() {
        return new VeroReportItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link VeroApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VeroApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.ebay.com{basePath}");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
