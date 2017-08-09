/*
 *  Copyright 2015-2017 Vladimir Bukhtoyarov
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package io.github.bucket4j;

/**
 * Represents an extension point of bucket4j library.
 *
 * @param <T>
 */
public interface Extension<T extends ConfigurationBuilder<T>> {

    /**
     * Creates new instance of builder specific for this particular extension.
     *
     * @return new builder instance
     */
    T builder();

    /**
     * Describes whether or not this extension supports asynchronous mode.
     *
     * <p>If asynchronous mode is  not supported any attempt to call {@link Bucket#asAsync()} will fail with {@link UnsupportedOperationException}
     *
     * @return true if this extension supports asynchronous mode.
     */
    boolean isAsyncModeSupported();

    /**
     * Describes whether or not this extension supports the customization of time measurement.
     *
     * <p>If customization of time measurement is  not supported any attempt to call {@link ConfigurationBuilder#withCustomTimePrecision(TimeMeter)}, {@link ConfigurationBuilder#withMillisecondPrecision()}, {@link ConfigurationBuilder#withNanosecondPrecision()} will fail with {@link UnsupportedOperationException}
     *
     * @return true if this extension supports the customization of time measurement.
     */
    boolean isCustomTimeMeasurementSupported();

}
