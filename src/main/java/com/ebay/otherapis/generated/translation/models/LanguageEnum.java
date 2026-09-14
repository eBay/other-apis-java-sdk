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

package com.ebay.otherapis.generated.translation.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The enumeration value indicates the language of the input text.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LanguageEnum implements ValuedEnum {
    De("de"),
    En("en"),
    Es("es"),
    Fr("fr"),
    It("it"),
    Ja("ja"),
    Pl("pl"),
    Pt("pt"),
    Ru("ru"),
    Zh("zh");
    public final String value;
    LanguageEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LanguageEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "de": return De;
            case "en": return En;
            case "es": return Es;
            case "fr": return Fr;
            case "it": return It;
            case "ja": return Ja;
            case "pl": return Pl;
            case "pt": return Pt;
            case "ru": return Ru;
            case "zh": return Zh;
            default: return null;
        }
    }
}
