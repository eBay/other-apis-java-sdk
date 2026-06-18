# eBay Other APIs Java SDK

A production-ready Java SDK for eBay miscellaneous APIs, providing unified access to Identity, Translation, VeRO, and International Shipping REST APIs.

## Features

- **Identity API**: Retrieve authenticated user account information (1 operation)
- **Translation API**: Translate listing titles and descriptions between languages (1 operation)
- **VeRO API**: Create and manage Verified Rights Owner reports (5 operations)
- **International Shipping API**: Manage packages, bundles, labels, and tracking (6 operations)
- **Strong Typing**: Internal Kiota-generated types with public client wrappers
- **Per-call Overrides**: Pass per-request headers and access tokens alongside SDK-wide defaults

## Architecture

```
src/main/java/com/ebay/otherapis/
├── generated/                              # Kiota-generated REST clients (internal)
│   ├── identity/
│   ├── translation/
│   ├── vero/
│   └── internationalshipping/
├── clients/
│   └── rest/
│       ├── IdentityClient.java             # REST client wrappers (public API)
│       ├── TranslationClient.java
│       ├── VeroClient.java
│       └── InternationalShippingClient.java
├── configuration/                          # SDK configuration and auth
├── exceptions/                             # SDK exceptions
└── OtherApisClient.java                    # Main SDK facade
```

## Requirements

- Java 17+
- Maven

## Installation

```xml
<dependency>
    <groupId>com.ebay</groupId>
    <artifactId>other-apis-java-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Quick Start

```java
var config = new OtherApisConfiguration();
config.setAccessToken("your-oauth-token");

try (var sdk = new OtherApisClient(config)) {
    var user = sdk.identity.getUser(null, null);

    var request = new TranslateRequest();
    request.setFrom("en_US");
    request.setTo("de_DE");
    var result = sdk.translation.translate(request, null, null);

    var reasonCodes = sdk.vero.getVeroReasonCodes(null, null);

    var pkg = sdk.internationalShipping.getPackage("order-line-item-id", null, null);
}
```

Per-request headers and tokens can be passed to any method:

```java
var options = new RequestOptions();
options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");

sdk.identity.getUser("per-call-token", options);
```

## API Operations

### Identity API

| Method | Description |
|---|---|
| `getUser` | Get authenticated user account information |

### Translation API

| Method | Description |
|---|---|
| `translate` | Translate text between supported languages |

### VeRO API

| Method | Description |
|---|---|
| `createVeroReport` | Create a VeRO report for infringing items |
| `getVeroReasonCodes` | Get all VeRO reason codes |
| `getVeroReasonCode` | Get a specific VeRO reason code |
| `getVeroReport` | Get the status of a VeRO report |
| `getVeroReportItems` | Get items in a VeRO report |

### International Shipping API

| Method | Description |
|---|---|
| `createPackage` | Create an international shipping package |
| `getPackage` | Get package details by order line item ID |
| `createBundle` | Create a bundle of packages |
| `getLabels` | Get shipping labels |
| `getTracking` | Get tracking information |
| `bulkCancelPackages` | Bulk cancel packages |

## Rate Limiting and Retry

The SDK does not include built-in retry logic or rate-limit handling. eBay's APIs return HTTP 429 Too Many Requests when rate limits are exceeded. Implement exponential back-off in your application layer when calling bulk endpoints in loops.

Refer to eBay's API call limits documentation for per-endpoint rate limit details.

---

## Error Handling

```java
try {
    var user = sdk.identity.getUser(null, null);
} catch (OtherApisException ex) {
    System.err.println("SDK error: " + ex.getMessage());
}
```

## Configuration Options

| Property | Default | Description |
|---|---|---|
| `identityBaseUrl` | `https://apiz.ebay.com/commerce/identity/v1` | Identity API base URL |
| `translationBaseUrl` | `https://api.ebay.com/commerce/translation/v1_beta` | Translation API base URL |
| `veroBaseUrl` | `https://api.ebay.com/commerce/vero/v1` | VeRO API base URL |
| `internationalShippingBaseUrl` | `https://api.ebay.com/sell/edelivery/international_shipping` | International Shipping base URL |
| `accessToken` | `null` | Static fallback token; per-call token takes precedence |
| `defaultRequestOptions` | `RequestOptions()` | Default headers applied to all SDK calls |
| `diagnosticLogging` | `false` | Enable diagnostic request/response logging |

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
./generate.sh
mvn clean install
```

## Development

```bash
mvn clean install   # Build and install
mvn test            # Run tests
mvn package         # Package
```

## Specs

- `commerce_identity_v1_oas3.yaml` — Identity V1
- `commerce_translation_v1_beta_oas3.yaml` — Translation V1 Beta
- `commerce_vero_v1_oas3.yaml` — VeRO V1
- `sell_edelivery_international_shipping_oas3.yaml` — International Shipping
- `eBay_Graph.graphqls` — eBay Graph schema

## Dependencies

- **microsoft-kiota-bundle**: REST client generation and runtime
- **okhttp3**: HTTP client
- **jackson-databind**: JSON processing
- **slf4j-api**: Logging facade

## License

Apache 2.0 © 2026 eBay Inc. See [LICENSE](LICENSE) for details.
