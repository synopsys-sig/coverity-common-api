/**
 * coverity-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for snapshotScopeSpecDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="snapshotScopeSpecDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="compareOutdatedStreams" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="compareSelector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="showOutdatedStreams" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="showSelector" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "snapshotScopeSpecDataObj", propOrder = {
    "compareOutdatedStreams",
    "compareSelector",
    "showOutdatedStreams",
    "showSelector"
})
public class SnapshotScopeSpecDataObj {

    @XmlElement(defaultValue = "false")
    protected Boolean compareOutdatedStreams;
    @XmlElement(defaultValue = "")
    protected String compareSelector;
    @XmlElement(defaultValue = "false")
    protected Boolean showOutdatedStreams;
    @XmlElement(required = true, defaultValue = "last()")
    protected String showSelector;

    /**
     * Gets the value of the compareOutdatedStreams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompareOutdatedStreams() {
        return compareOutdatedStreams;
    }

    /**
     * Sets the value of the compareOutdatedStreams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompareOutdatedStreams(Boolean value) {
        this.compareOutdatedStreams = value;
    }

    /**
     * Gets the value of the compareSelector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompareSelector() {
        return compareSelector;
    }

    /**
     * Sets the value of the compareSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompareSelector(String value) {
        this.compareSelector = value;
    }

    /**
     * Gets the value of the showOutdatedStreams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOutdatedStreams() {
        return showOutdatedStreams;
    }

    /**
     * Sets the value of the showOutdatedStreams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOutdatedStreams(Boolean value) {
        this.showOutdatedStreams = value;
    }

    /**
     * Gets the value of the showSelector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowSelector() {
        return showSelector;
    }

    /**
     * Sets the value of the showSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowSelector(String value) {
        this.showSelector = value;
    }

}
