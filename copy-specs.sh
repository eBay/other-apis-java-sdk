#!/usr/bin/env bash
set -euo pipefail

PHP_SDK_DIR="/Users/hkim26/Documents/Development/github.corp.ebay.com/globalcommerce/other-apis-php-sdk"
JAVA_SDK_DIR="/Users/hkim26/Documents/Development/github.corp.ebay.com/globalcommerce/java-sdk/other-apis"

# Copy specs
cp "$PHP_SDK_DIR/specs"/*.yaml "$JAVA_SDK_DIR/specs/"
cp "$PHP_SDK_DIR/specs"/*.graphqls "$JAVA_SDK_DIR/specs/" 2>/dev/null || true

# Copy operations.json
cp "$PHP_SDK_DIR/operations.json" "$JAVA_SDK_DIR/"

echo "Specs and operations.json copied successfully"
