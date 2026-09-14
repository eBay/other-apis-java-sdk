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

package com.ebay.otherapis.clients.rest;

import com.ebay.otherapis.configuration.OtherApisConfiguration;
import com.ebay.otherapis.configuration.RequestOptions;
import com.ebay.otherapis.configuration.TokenContext;
import com.ebay.otherapis.generated.veroapiv2.VeroApiV2ApiClient;
import com.ebay.otherapis.generated.veroapiv2.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.io.InputStream;
import com.microsoft.kiota.serialization.UntypedNode;

public final class VeroApiV2Client {
    private final VeroApiV2ApiClient kiota;
    private final OtherApisConfiguration config;

    public VeroApiV2Client(VeroApiV2ApiClient kiota, OtherApisConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    public CompletableFuture<VeroReasonCode> getVeroReasonCodeAsync(
            String veroReasonCodeId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.veroReasonCode().byVero_reason_code_id(Params.requireValid("veroReasonCodeId", veroReasonCodeId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<VeroReasonCodeDetailResponse> getVeroReasonCodesAsync(
            String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.veroReasonCode().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (xEBAYCMARKETPLACEID != null) config.headers.add("X-EBAY-C-MARKETPLACE-ID", xEBAYCMARKETPLACEID);
            });
        }));
    }

    public CompletableFuture<ReportVeroViolationResponse> reportVeroViolationsAsync(
            ReportVeroViolationRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.reportVeroViolations().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<VeroReport> getVeroReportAsync(
            String veroReportId, Boolean includeReportDetails, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.veroReport().byVero_report_id(Params.requireValid("veroReportId", veroReportId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (includeReportDetails != null) config.queryParameters.includeReportDetails = includeReportDetails;
            });
        }));
    }

    public CompletableFuture<VeroReportStatusResponse> getVeroReportItemsAsync(
            String filter, String itemId, Integer limit, Integer offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.veroReportItems().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (itemId != null) config.queryParameters.itemId = itemId;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }
}
