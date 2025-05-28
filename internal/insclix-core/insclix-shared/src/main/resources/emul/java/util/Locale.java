/*
 * #%L
 * insclix-consumer-upgrades-client
 * %%
 * Copyright (C) 2017 - 2019 Insclix
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package java.util;

public class Locale {


    public static final Locale ROOT = null;

    public static final Locale ENGLISH = null;

    public static final Locale FRENCH = null;

    public static final Locale US = null;

    private static Locale defaultLocale = null;

    /**
     * Returns an instance that represents the browser's default locale (not necessarily the one
     * defined by 'gwt.locale').
     */
    public static Locale getDefault() {
        return defaultLocale;
    }

    public String getLanguage() {
        return this.toString();
    }

    // Hidden as we don't support manual creation of Locales.
    private Locale() {
    }
}
