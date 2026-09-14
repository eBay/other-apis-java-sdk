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

package com.ebay.otherapis.generated.veroapiv2;

import com.ebay.otherapis.generated.veroapiv2.report_vero_violations.ReportVeroViolationsRequestBuilder;
import com.ebay.otherapis.generated.veroapiv2.vero_reason_code.VeroReasonCodeRequestBuilder;
import com.ebay.otherapis.generated.veroapiv2.vero_report_items.VeroReportItemsRequestBuilder;
import com.ebay.otherapis.generated.veroapiv2.vero_report.VeroReportRequestBuilder;
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
public class VeroApiV2ApiClient extends BaseRequestBuilder {
    /**
     * The report_vero_violations property
     * @return a {@link ReportVeroViolationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReportVeroViolationsRequestBuilder reportVeroViolations() {
        return new ReportVeroViolationsRequestBuilder(pathParameters, requestAdapter);
    }
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
     * Instantiates a new {@link VeroApiV2ApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VeroApiV2ApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
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
