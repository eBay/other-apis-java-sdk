package com.ebay.otherapis.generated.internationalshipping;

import com.ebay.otherapis.generated.internationalshipping.actual_costs.ActualCostsRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.address_preference.AddressPreferenceRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.agents.AgentsRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.battery_qualifications.BatteryQualificationsRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.bundle.BundleRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.complaint.ComplaintRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.consign_preference.ConsignPreferenceRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.dropoff_sites.DropoffSitesRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.handover_sheet.HandoverSheetRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.labels.LabelsRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.packageescaped.PackageRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.services.ServicesRequestBuilder;
import com.ebay.otherapis.generated.internationalshipping.tracking.TrackingRequestBuilder;
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
public class InternationalShippingApiClient extends BaseRequestBuilder {
    /**
     * The actual_costs property
     * @return a {@link ActualCostsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActualCostsRequestBuilder actualCosts() {
        return new ActualCostsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The address_preference property
     * @return a {@link AddressPreferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddressPreferenceRequestBuilder addressPreference() {
        return new AddressPreferenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The agents property
     * @return a {@link AgentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AgentsRequestBuilder agents() {
        return new AgentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The battery_qualifications property
     * @return a {@link BatteryQualificationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BatteryQualificationsRequestBuilder batteryQualifications() {
        return new BatteryQualificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bundle property
     * @return a {@link BundleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BundleRequestBuilder bundle() {
        return new BundleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The complaint property
     * @return a {@link ComplaintRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ComplaintRequestBuilder complaint() {
        return new ComplaintRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The consign_preference property
     * @return a {@link ConsignPreferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConsignPreferenceRequestBuilder consignPreference() {
        return new ConsignPreferenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dropoff_sites property
     * @return a {@link DropoffSitesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DropoffSitesRequestBuilder dropoffSites() {
        return new DropoffSitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The handover_sheet property
     * @return a {@link HandoverSheetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HandoverSheetRequestBuilder handoverSheet() {
        return new HandoverSheetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The labels property
     * @return a {@link LabelsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LabelsRequestBuilder labels() {
        return new LabelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The package property
     * @return a {@link PackageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PackageRequestBuilder packageEscaped() {
        return new PackageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The services property
     * @return a {@link ServicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServicesRequestBuilder services() {
        return new ServicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The tracking property
     * @return a {@link TrackingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TrackingRequestBuilder tracking() {
        return new TrackingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link InternationalShippingApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InternationalShippingApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
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
