#!/bin/bash
set -e
echo "Generating Other APIs Java SDK with Kiota..."
rm -rf src/main/java/com/ebay/otherapis/generated

echo "Generating Identity API client..."
kiota generate -l java -d specs/openapi/identity.yaml \
  -c IdentityApiClient -n com.ebay.otherapis.generated.identity \
  -o src/main/java/com/ebay/otherapis/generated/identity --ebc --co

echo "Generating Translation API client..."
kiota generate -l java -d specs/openapi/translation.yaml \
  -c TranslationApiClient -n com.ebay.otherapis.generated.translation \
  -o src/main/java/com/ebay/otherapis/generated/translation --ebc --co

echo "Generating Vero API client..."
kiota generate -l java -d specs/openapi/vero.yaml \
  -c VeroApiClient -n com.ebay.otherapis.generated.vero \
  -o src/main/java/com/ebay/otherapis/generated/vero --ebc --co

echo "Generating International Shipping API client..."
kiota generate -l java -d specs/openapi/international-shipping.yaml \
  -c InternationalShippingApiClient -n com.ebay.otherapis.generated.internationalshipping \
  -o src/main/java/com/ebay/otherapis/generated/internationalshipping --ebc --co


echo "Adding license headers to generated files..."
./add-license-headers.sh ./src

echo "Code generation complete!"
