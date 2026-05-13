# Other APIs Java SDK

Java SDK for eBay Other APIs, providing access to Identity, Translation, VeRO, and International Shipping services.

## Features

- **Identity API**: Retrieve authenticated user account information
- **Translation API**: Translate listing titles and descriptions between languages
- **VeRO API**: Create and manage VeRO (Verified Rights Owner) reports
- **International Shipping API**: Manage international shipping packages, bundles, labels, and tracking
- Per-call token support for multi-tenant scenarios
- Custom header support via RequestOptions
- Built with Kiota 1.9.2 for type-safe REST operations

## Installation

Add the dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>com.ebay</groupId>
    <artifactId>other-apis-java-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

Or install locally:

```bash
mvn clean install -DskipTests
```

## Quick Start

### Basic Usage

```java
import com.ebay.otherapis.OtherApisClient;
import com.ebay.otherapis.configuration.OtherApisConfiguration;

var config = new OtherApisConfiguration();
config.setAccessToken("your-ebay-oauth-token");

try (var sdk = new OtherApisClient(config)) {
    // Get authenticated user information
    var user = sdk.identity.getUser(null, null);
    System.out.println("User ID: " + user.getUserId());
}
```

### Identity API

```java
// Get user account information
var user = sdk.identity.getUser(accessToken, requestOptions);
System.out.println("Username: " + user.getUsername());
```

### Translation API

```java
import com.ebay.otherapis.generated.translation.models.*;

var request = new TranslateRequest();
request.setFrom("en_US");
request.setTo("de_DE");
request.setText(List.of(
    Map.of("textFieldName", "title", "textFieldValue", "Vintage Camera"),
    Map.of("textFieldName", "description", "textFieldValue", "In excellent condition")
));

var result = sdk.translation.translate(request, accessToken, null);
System.out.println("Translated text: " + result.getTranslations());
```

### VeRO API

```java
import com.ebay.otherapis.generated.vero.models.*;

// Create a VeRO report
var reportRequest = new VeroReportItemsRequest();
// ... configure report details

var report = sdk.vero.createVeroReport(reportRequest, accessToken, null);

// Get VeRO reason codes
var reasonCodes = sdk.vero.getVeroReasonCodes(accessToken, null);

// Get specific reason code
var reasonCode = sdk.vero.getVeroReasonCode("code-id", accessToken, null);

// Get report status
var status = sdk.vero.getVeroReport("report-id", "true", accessToken, null);

// Get reported items
var items = sdk.vero.getVeroReportItems(
    "filter-expression",
    "item-id",
    "50",
    "0",
    accessToken,
    null
);
```

### International Shipping API

```java
import com.ebay.otherapis.generated.internationalshipping.models.*;

// Create a package
var packageRequest = new AddPackageRequest();
// ... configure package details
var packageResponse = sdk.internationalShipping.createPackage(packageRequest, accessToken, null);

// Get package details
var packageDetails = sdk.internationalShipping.getPackage("order-line-item-id", accessToken, null);

// Create a bundle
var bundleRequest = new CreateBundleRequest();
// ... configure bundle details
var bundle = sdk.internationalShipping.createBundle(bundleRequest, accessToken, null);

// Get labels
var labels = sdk.internationalShipping.getLabels(
    "tracking-numbers",
    "page-size",
    "print-preference",
    accessToken,
    null
);

// Get tracking information
var tracking = sdk.internationalShipping.getTracking("tracking-number", accessToken, null);

// Bulk operations
var cancelRequest = new CancelPackagesRequest();
sdk.internationalShipping.bulkCancelPackages(cancelRequest, accessToken, null);
```

## Per-Call Tokens

Support multi-tenant scenarios by passing tokens per-call:

```java
var config = new OtherApisConfiguration();
// Optional fallback token
config.setAccessToken("default-token");

try (var sdk = new OtherApisClient(config)) {
    // Use fallback token
    var user1 = sdk.identity.getUser(null, null);
    
    // Override with per-call token
    var user2 = sdk.identity.getUser("user-specific-token", null);
}
```

## Custom Headers

Use RequestOptions to set custom headers per request:

```java
import com.ebay.otherapis.configuration.RequestOptions;

var options = new RequestOptions();
options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");
options.addHeader("X-Request-ID", "correlation-123");

var user = sdk.identity.getUser(accessToken, options);
```

### Default Headers

Set headers for all requests via configuration:

```java
var config = new OtherApisConfiguration();
config.getDefaultRequestOptions().addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");

try (var sdk = new OtherApisClient(config)) {
    // All requests include the default header
    var user = sdk.identity.getUser(accessToken, null);
    
    // Per-call headers override defaults
    var options = new RequestOptions();
    options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_UK");
    var userUK = sdk.identity.getUser(accessToken, options);
}
```

## Configuration

```java
var config = new OtherApisConfiguration();

// Override base URLs (optional)
config.setIdentityBaseUrl("https://apiz.ebay.com/commerce/identity/v1");
config.setTranslationBaseUrl("https://api.ebay.com/commerce/translation/v1_beta");
config.setVeroBaseUrl("https://api.ebay.com/commerce/vero/v1");
config.setInternationalShippingBaseUrl("https://api.ebay.com/sell/edelivery/international_shipping");

// Set fallback access token
config.setAccessToken("your-token");

// Enable diagnostic logging
config.setDiagnosticLogging(true);
```

## Architecture

The SDK follows a consistent pattern:

- **OtherApisClient**: Main facade exposing all API clients
- **Configuration**: Centralized configuration with base URLs and auth settings
- **TokenContext**: ThreadLocal carrier for per-call tokens
- **RequestOptions**: Per-call custom headers support
- **KiotaAuthProvider**: Bridges TokenContext and config into Kiota auth
- **REST Clients**: Hand-crafted wrappers over Kiota-generated code
  - `IdentityClient`: Identity API operations
  - `TranslationClient`: Translation API operations
  - `VeroClient`: VeRO API operations
  - `InternationalShippingClient`: International Shipping API operations

## Code Generation

The SDK uses Microsoft Kiota to generate type-safe REST clients from OpenAPI specs:

```bash
# Regenerate from specs
./generate.sh
```

Generated code is committed to source control for stability.

## Requirements

- Java 17+
- Maven 3.6+

## Build

```bash
# Compile
mvn clean compile

# Run tests
mvn test

# Install locally
mvn clean install
```

## License

Internal use only - eBay Global Commerce.
