#!/usr/bin/env bash

# Copyright 2026 eBay Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -euo pipefail

KIOTA_VERSION=$(kiota --version 2>/dev/null | cut -d'+' -f1)
if [ "$KIOTA_VERSION" != "1.35.0" ]; then
  echo "Error: kiota 1.35.0 required, found '${KIOTA_VERSION:-not installed}'"
  echo "See https://learn.microsoft.com/en-us/openapi/kiota/install for installation options."
  exit 1
fi

echo "Generating Other APIs Java SDK with Kiota..."
rm -rf src/main/java/com/ebay/otherapis/generated

echo "Generating IdentityApiClient..."
kiota generate -l java -d specs/openapi/identity.json \
  -c IdentityApiClient -n com.ebay.otherapis.generated.identity \
  -o src/main/java/com/ebay/otherapis/generated/identity --ebc --co

echo "Generating InternationalShippingApiClient..."
kiota generate -l java -d specs/openapi/international-shipping.json \
  -c InternationalShippingApiClient -n com.ebay.otherapis.generated.internationalshipping \
  -o src/main/java/com/ebay/otherapis/generated/internationalshipping --ebc --co

echo "Generating TranslationApiClient..."
kiota generate -l java -d specs/openapi/translation.json \
  -c TranslationApiClient -n com.ebay.otherapis.generated.translation \
  -o src/main/java/com/ebay/otherapis/generated/translation --ebc --co

echo "Generating VeroApiV2ApiClient..."
kiota generate -l java -d specs/openapi/vero-api-v2.json \
  -c VeroApiV2ApiClient -n com.ebay.otherapis.generated.veroapiv2 \
  -o src/main/java/com/ebay/otherapis/generated/veroapiv2 --ebc --co

echo "Adding license headers to generated files..."
./add-license-headers.sh ./src
echo "Code generation complete!"
