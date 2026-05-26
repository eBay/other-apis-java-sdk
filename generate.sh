#!/bin/bash
set -e
echo "Generating Other APIs Java SDK with Kiota..."
rm -rf src/main/java/com/ebay/otherapis/generated

echo "Generating Identity API client..."
kiota generate -l java -d specs/commerce_identity_v1_oas3.yaml \
  -c IdentityApiClient -n com.ebay.otherapis.generated.identity \
  -o src/main/java/com/ebay/otherapis/generated/identity --ebc --co

echo "Generating Translation API client..."
kiota generate -l java -d specs/commerce_translation_v1_beta_oas3.yaml \
  -c TranslationApiClient -n com.ebay.otherapis.generated.translation \
  -o src/main/java/com/ebay/otherapis/generated/translation --ebc --co

echo "Generating Vero API client..."
kiota generate -l java -d specs/commerce_vero_v1_oas3.yaml \
  -c VeroApiClient -n com.ebay.otherapis.generated.vero \
  -o src/main/java/com/ebay/otherapis/generated/vero --ebc --co

echo "Generating International Shipping API client..."
kiota generate -l java -d specs/sell_edelivery_international_shipping_oas3.yaml \
  -c InternationalShippingApiClient -n com.ebay.otherapis.generated.internationalshipping \
  -o src/main/java/com/ebay/otherapis/generated/internationalshipping --ebc --co


echo "Adding license headers to generated files..."
./add-license-headers.sh ./src

echo "Code generation complete!"
