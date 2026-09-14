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

package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The exemption type associated with the CPSC profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExemptionTypeEnum implements ValuedEnum {
    TOY_VINTAGE("TOY_VINTAGE"),
    TOY_ANTIQUE("TOY_ANTIQUE"),
    TOY_AGE_LMT("TOY_AGE_LMT"),
    ADULT_PRODUCT_USED("ADULT_PRODUCT_USED"),
    ADULT_APPAREL_SYNTHETIC_OR_WOOL("ADULT_APPAREL_SYNTHETIC_OR_WOOL"),
    ADULT_APPAREL_COTTON_100("ADULT_APPAREL_COTTON_100"),
    ADULT_APPAREL_COTTON_BLENDS("ADULT_APPAREL_COTTON_BLENDS"),
    ADULT_APPAREL_RAYON_VISCOSE_100("ADULT_APPAREL_RAYON_VISCOSE_100"),
    ADULT_APPAREL_MODAL("ADULT_APPAREL_MODAL"),
    ADULT_APPAREL_BAMBOO("ADULT_APPAREL_BAMBOO"),
    ADULT_APPAREL_LINEN_FLAX("ADULT_APPAREL_LINEN_FLAX"),
    ADULT_APPAREL_SILK("ADULT_APPAREL_SILK"),
    ADULT_APPAREL_ACETATE("ADULT_APPAREL_ACETATE"),
    ADULT_APPAREL_SPANDEX_ELASTANE("ADULT_APPAREL_SPANDEX_ELASTANE"),
    ADULT_APPAREL_NYLON_SPANDEX_BLENDS("ADULT_APPAREL_NYLON_SPANDEX_BLENDS"),
    ADULT_APPAREL_POLYESTER_SPANDEX_BLENDS("ADULT_APPAREL_POLYESTER_SPANDEX_BLENDS"),
    ADULT_APPAREL_POLYESTER_RAYON_BLENDS("ADULT_APPAREL_POLYESTER_RAYON_BLENDS"),
    ADULT_APPAREL_WOOL_BLENDS("ADULT_APPAREL_WOOL_BLENDS"),
    ADULT_APPAREL_CASHMERE_BLENDS("ADULT_APPAREL_CASHMERE_BLENDS"),
    ADULT_APPAREL_LINEN_BLENDS("ADULT_APPAREL_LINEN_BLENDS"),
    ADULT_APPAREL_MODAL_BLENDS("ADULT_APPAREL_MODAL_BLENDS"),
    ADULT_APPAREL_SATIN("ADULT_APPAREL_SATIN"),
    ADULT_APPAREL_CHIFFON("ADULT_APPAREL_CHIFFON"),
    ADULT_APPAREL_LACE("ADULT_APPAREL_LACE"),
    ADULT_APPAREL_TULLE("ADULT_APPAREL_TULLE"),
    ADULT_APPAREL_VOILE("ADULT_APPAREL_VOILE"),
    ADULT_APPAREL_ORGANZA("ADULT_APPAREL_ORGANZA"),
    ADULT_APPAREL_GEORGETTE("ADULT_APPAREL_GEORGETTE"),
    ADULT_APPAREL_CREPE("ADULT_APPAREL_CREPE"),
    ADULT_APPAREL_TWILL("ADULT_APPAREL_TWILL"),
    ADULT_APPAREL_JERSEY("ADULT_APPAREL_JERSEY"),
    ADULT_APPAREL_OXFORD_CLOTH("ADULT_APPAREL_OXFORD_CLOTH"),
    ADULT_APPAREL_MESH_NET("ADULT_APPAREL_MESH_NET"),
    ADULT_APPAREL_GAUZE("ADULT_APPAREL_GAUZE"),
    ADULT_APPAREL_CANVAS("ADULT_APPAREL_CANVAS"),
    OTHER_ADULT_PRODUCT("OTHER_ADULT_PRODUCT");
    public final String value;
    ExemptionTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExemptionTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "TOY_VINTAGE": return TOY_VINTAGE;
            case "TOY_ANTIQUE": return TOY_ANTIQUE;
            case "TOY_AGE_LMT": return TOY_AGE_LMT;
            case "ADULT_PRODUCT_USED": return ADULT_PRODUCT_USED;
            case "ADULT_APPAREL_SYNTHETIC_OR_WOOL": return ADULT_APPAREL_SYNTHETIC_OR_WOOL;
            case "ADULT_APPAREL_COTTON_100": return ADULT_APPAREL_COTTON_100;
            case "ADULT_APPAREL_COTTON_BLENDS": return ADULT_APPAREL_COTTON_BLENDS;
            case "ADULT_APPAREL_RAYON_VISCOSE_100": return ADULT_APPAREL_RAYON_VISCOSE_100;
            case "ADULT_APPAREL_MODAL": return ADULT_APPAREL_MODAL;
            case "ADULT_APPAREL_BAMBOO": return ADULT_APPAREL_BAMBOO;
            case "ADULT_APPAREL_LINEN_FLAX": return ADULT_APPAREL_LINEN_FLAX;
            case "ADULT_APPAREL_SILK": return ADULT_APPAREL_SILK;
            case "ADULT_APPAREL_ACETATE": return ADULT_APPAREL_ACETATE;
            case "ADULT_APPAREL_SPANDEX_ELASTANE": return ADULT_APPAREL_SPANDEX_ELASTANE;
            case "ADULT_APPAREL_NYLON_SPANDEX_BLENDS": return ADULT_APPAREL_NYLON_SPANDEX_BLENDS;
            case "ADULT_APPAREL_POLYESTER_SPANDEX_BLENDS": return ADULT_APPAREL_POLYESTER_SPANDEX_BLENDS;
            case "ADULT_APPAREL_POLYESTER_RAYON_BLENDS": return ADULT_APPAREL_POLYESTER_RAYON_BLENDS;
            case "ADULT_APPAREL_WOOL_BLENDS": return ADULT_APPAREL_WOOL_BLENDS;
            case "ADULT_APPAREL_CASHMERE_BLENDS": return ADULT_APPAREL_CASHMERE_BLENDS;
            case "ADULT_APPAREL_LINEN_BLENDS": return ADULT_APPAREL_LINEN_BLENDS;
            case "ADULT_APPAREL_MODAL_BLENDS": return ADULT_APPAREL_MODAL_BLENDS;
            case "ADULT_APPAREL_SATIN": return ADULT_APPAREL_SATIN;
            case "ADULT_APPAREL_CHIFFON": return ADULT_APPAREL_CHIFFON;
            case "ADULT_APPAREL_LACE": return ADULT_APPAREL_LACE;
            case "ADULT_APPAREL_TULLE": return ADULT_APPAREL_TULLE;
            case "ADULT_APPAREL_VOILE": return ADULT_APPAREL_VOILE;
            case "ADULT_APPAREL_ORGANZA": return ADULT_APPAREL_ORGANZA;
            case "ADULT_APPAREL_GEORGETTE": return ADULT_APPAREL_GEORGETTE;
            case "ADULT_APPAREL_CREPE": return ADULT_APPAREL_CREPE;
            case "ADULT_APPAREL_TWILL": return ADULT_APPAREL_TWILL;
            case "ADULT_APPAREL_JERSEY": return ADULT_APPAREL_JERSEY;
            case "ADULT_APPAREL_OXFORD_CLOTH": return ADULT_APPAREL_OXFORD_CLOTH;
            case "ADULT_APPAREL_MESH_NET": return ADULT_APPAREL_MESH_NET;
            case "ADULT_APPAREL_GAUZE": return ADULT_APPAREL_GAUZE;
            case "ADULT_APPAREL_CANVAS": return ADULT_APPAREL_CANVAS;
            case "OTHER_ADULT_PRODUCT": return OTHER_ADULT_PRODUCT;
            default: return null;
        }
    }
}
