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
import com.ebay.otherapis.generated.vero.VeroApiClient;
import com.ebay.otherapis.generated.vero.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Commerce VeRO API.
 * Provides methods to create and manage VeRO (Verified Rights Owner) reports.
 */
public final class VeroClient {
    private final VeroApiClient kiota;
    private final OtherApisConfiguration config;

    public VeroClient(VeroApiClient kiota, OtherApisConfiguration config) {
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
     * Create a VeRO report for one or more listings (max 150 items).
     *
     * @param body Report request with items to report
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers
     * @return CompletableFuture containing VeroReportItemsResponse with report details
     */
    public CompletableFuture<VeroReportItemsResponse> createVeroReportAsync(
            VeroReportItemsRequest body,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.veroReport().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Retrieve details of a specific VeRO reason code.
     *
     * @param veroReasonCodeId The VeRO reason code ID
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers
     * @return CompletableFuture containing VeroReasonCodeResponse with reason code details
     */
    public CompletableFuture<VeroReasonCodeResponse> getVeroReasonCodeAsync(
            String veroReasonCodeId,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.veroReasonCode().byVero_reason_code_id(veroReasonCodeId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Retrieve details of all VeRO reason codes.
     *
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers
     * @return CompletableFuture containing VeroReasonCodeDetailResponse with all reason codes
     */
    public CompletableFuture<VeroReasonCodeDetailResponse> getVeroReasonCodesAsync(
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.veroReasonCode().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Retrieve status information about a submitted VeRO report.
     *
     * @param veroReportId The VeRO report ID
     * @param includeItemDetails Whether to include item details (optional)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers
     * @return CompletableFuture containing ReportStatusResponse with report status
     */
    public CompletableFuture<ReportStatusResponse> getVeroReportAsync(
            String veroReportId,
            String includeItemDetails,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.veroReport().byVero_report_id(veroReportId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (includeItemDetails != null) {
                    config.queryParameters.includeItemDetails = includeItemDetails;
                }
            });
        });
    }

    /**
     * Retrieve status information about VeRO reported items.
     *
     * @param filter Filter expression (optional)
     * @param itemId Item ID to filter by (optional)
     * @param limit Number of results to return (optional)
     * @param offset Pagination offset (optional)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers
     * @return CompletableFuture containing VeroReportStatusResponse with reported items
     */
    public CompletableFuture<VeroReportStatusResponse> getVeroReportItemsAsync(
            String filter,
            String itemId,
            String limit,
            String offset,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.veroReportItems().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) {
                    config.queryParameters.filter = filter;
                }
                if (itemId != null) {
                    config.queryParameters.itemId = itemId;
                }
                if (limit != null) {
                    config.queryParameters.limit = limit;
                }
                if (offset != null) {
                    config.queryParameters.offset = offset;
                }
            });
        });
    }
}
