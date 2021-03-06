/*
 * Copyright 2019 Felipe Joglar Santos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fjoglar.lyricly.data.source.local.preferences;

public interface PreferencesDataSource {

    String LAST_UPDATED_TIME_KEY = "last_updated_time";
    String IS_ON_BOARDING_SHOWN_KEY = "is_on_boarding_shown";

    /**
     * Gets the last time the top songs were updated.
     *
     * @return the time of the last update in millis.
     */
    long getLastUpdatedTimeInMillis();

    /**
     * Sets the last updated time the top songs were fetched.
     */
    void setLastUpdatedTimeInMillis();

    /**
     * Get the values of the on boarding screen show.
     *
     * @return true if on boarding has been shown, false otherwise.
     */
    boolean hasOnBoardingBeenShown();

    /**
     * Set the value of the on boarding screen shown or not
     */
    void setHasOnBoardingBeenShown();
}
