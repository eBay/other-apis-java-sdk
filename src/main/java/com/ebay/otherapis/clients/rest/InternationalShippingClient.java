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
import com.ebay.otherapis.generated.internationalshipping.InternationalShippingApiClient;
import com.ebay.otherapis.generated.internationalshipping.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.io.InputStream;
import com.microsoft.kiota.serialization.UntypedNode;

public final class InternationalShippingClient {
    private final InternationalShippingApiClient kiota;
    private final OtherApisConfiguration config;

    public InternationalShippingClient(InternationalShippingApiClient kiota, OtherApisConfiguration config) {
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

    public CompletableFuture<GetActualCostResponses> getActualCostsAsync(
            String trackingNumbers, String transBeginTime, String transEndTime, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.actualCosts().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (trackingNumbers != null) config.queryParameters.trackingNumbers = trackingNumbers;
                if (transBeginTime != null) config.queryParameters.transBeginTime = transBeginTime;
                if (transEndTime != null) config.queryParameters.transEndTime = transEndTime;
            });
        }));
    }

    public CompletableFuture<GetAddressPreferenceListResponses> getAddressPreferencesAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.addressPreference().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<CreateAddressPreferenceResponses> createAddressPreferenceAsync(
            CreateAddressPreferenceRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.addressPreference().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<GetAgentListResponses> getAgentsAsync(
            String limit, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.agents().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<GetBatteryQualListResponses> getBatteryQualificationsAsync(
            String limit, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.batteryQualifications().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<Void> cancelBundleAsync(
            String bundleId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.bundle().byBundle_id(Params.requireValid("bundleId", bundleId)).cancel().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<CreateBundleResponse> createBundleAsync(
            CreateBundleRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.bundle().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BundleDetailResponse> getBundleAsync(
            String bundleId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.bundle().byBundle_id(Params.requireValid("bundleId", bundleId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BundleLabelResponse> getBundleLabelAsync(
            String bundleId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.bundle().byBundle_id(Params.requireValid("bundleId", bundleId)).label().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> createComplaintAsync(
            AddComplaintRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.complaint().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<GetConsignPreferenceListResponses> getConsignPreferencesAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.consignPreference().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<CreateConsignPreferenceResponses> createConsignPreferenceAsync(
            CreateConsignPreferenceRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.consignPreference().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<GetCpscProfilesResponse> getCpscProfilesAsync(
            String limit, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.cpscProfiles().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<GetDropoffSiteListResponses> getDropoffSitesAsync(
            String limit, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.dropoffSites().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<GetHandoverSheetResponses> getHandoverSheetAsync(
            String trackingNumbers, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.handoverSheet().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (trackingNumbers != null) config.queryParameters.trackingNumbers = trackingNumbers;
            });
        }));
    }

    public CompletableFuture<GetLabelListResponses> getLabelsAsync(
            String pageSize, String printPreference, String trackingNumbers, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.labels().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (pageSize != null) config.queryParameters.pageSize = pageSize;
                if (printPreference != null) config.queryParameters.printPreference = printPreference;
                if (trackingNumbers != null) config.queryParameters.trackingNumbers = trackingNumbers;
            });
        }));
    }

    public CompletableFuture<CancelPackagesResponses> bulkCancelPackagesAsync(
            CancelPackagesRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.packageEscaped().bulkCancelPackages().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<ConfirmPackagesResponses> bulkConfirmPackagesAsync(
            ConfirmPackagesRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.packageEscaped().bulkConfirmPackages().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<DeletePackagesResponses> bulkDeletePackagesAsync(
            DeletePackagesRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.packageEscaped().bulkDeletePackages().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> cancelPackageAsync(
            String packageId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.packageEscaped().byOrder_line_item_Id(Params.requireValid("packageId", packageId)).cancel().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<ClonePackageResponses> clonePackageAsync(
            String packageId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.packageEscaped().byOrder_line_item_Id(Params.requireValid("packageId", packageId)).clone().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> confirmPackageAsync(
            String packageId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.packageEscaped().byOrder_line_item_Id(Params.requireValid("packageId", packageId)).confirm().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<AddPackageResponses> createPackageAsync(
            AddPackageRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.packageEscaped().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<GetPackageDetailResponses> getPackageAsync(
            String packageId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.packageEscaped().byOrder_line_item_Id(Params.requireValid("packageId", packageId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> deletePackageAsync(
            String packageId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.packageEscaped().byOrder_line_item_Id(Params.requireValid("packageId", packageId)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<GetItemPackageIdResponses> getPackagesByLineItemIDAsync(
            String orderLineItemId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.packageEscaped().byOrder_line_item_Id(Params.requireValid("orderLineItemId", orderLineItemId)).item().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<GetServiceListResponses> getServicesAsync(
            String limit, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.services().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<GetTrackingDetailResponses> getTrackingAsync(
            String trackingNumber, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.tracking().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (trackingNumber != null) config.queryParameters.trackingNumber = trackingNumber;
            });
        }));
    }
}
