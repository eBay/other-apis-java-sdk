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

package com.ebay.otherapis.generated.veroapiv2.vero_report;

import com.ebay.otherapis.generated.veroapiv2.vero_report.item.WithVeroReportItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /vero_report
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VeroReportRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.otherapis.generated.veroapiv2.vero_report.item collection
     * @param vero_report_id This path parameter specifies the unique identifier of the VeRO report being retrieved.&lt;br&gt;&lt;br&gt;This value is returned when creating a VeRO report through the &lt;a href=&quot;/develop/api/sell/vero_api_v2#sell-vero_api_v2-report_vero_violations-reportveroviolations&quot;&gt;reportVeroViolations&lt;/a&gt; method.
     * @return a {@link WithVeroReportItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithVeroReportItemRequestBuilder byVero_report_id(@jakarta.annotation.Nonnull final String vero_report_id) {
        Objects.requireNonNull(vero_report_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("vero_report_id", vero_report_id);
        return new WithVeroReportItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link VeroReportRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VeroReportRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/vero_report", pathParameters);
    }
    /**
     * Instantiates a new {@link VeroReportRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VeroReportRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/vero_report", rawUrl);
    }
}
