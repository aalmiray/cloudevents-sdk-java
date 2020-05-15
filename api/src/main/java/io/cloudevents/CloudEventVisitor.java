/*
 * Copyright 2018-Present The CloudEvents Authors
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.cloudevents;

public interface CloudEventVisitor<V> extends CloudEventAttributesVisitor, CloudEventExtensionsVisitor {

    // TODO maybe, one day, we'll convert this to some byte stream
    void setBody(byte[] value) throws CloudEventVisitException;

    /**
     * End the visit
     *
     * @return an eventual return value
     */
    V end();

}