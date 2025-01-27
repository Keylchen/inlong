/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.inlong.sort.standalone.metrics;

import java.util.Map;

import org.apache.inlong.common.metric.MetricValue;

/**
 * 
 * MetricItemValue
 */
public class MetricItemValue {

    private final String key;
    private final Map<String, String> dimensions;
    private final Map<String, MetricValue> metrics;

    /**
     * Constructor
     * 
     * @param key
     * @param dimensions
     * @param metrics
     */
    public MetricItemValue(String key, Map<String, String> dimensions, Map<String, MetricValue> metrics) {
        this.key = key;
        this.dimensions = dimensions;
        this.metrics = metrics;
    }

    /**
     * get key
     * 
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * get dimensions
     * 
     * @return the dimensions
     */
    public Map<String, String> getDimensions() {
        return dimensions;
    }

    /**
     * get metrics
     * 
     * @return the metrics
     */
    public Map<String, MetricValue> getMetrics() {
        return metrics;
    }
}
