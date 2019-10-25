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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStreamDefects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStreamDefects"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mergedDefectIdDataObjs" type="{http://ws.coverity.com/v9}mergedDefectIdDataObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="filterSpec" type="{http://ws.coverity.com/v9}streamDefectFilterSpecDataObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStreamDefects", propOrder = {
    "mergedDefectIdDataObjs",
    "filterSpec"
})
public class GetStreamDefects {

    protected List<MergedDefectIdDataObj> mergedDefectIdDataObjs;
    protected StreamDefectFilterSpecDataObj filterSpec;

    /**
     * Gets the value of the mergedDefectIdDataObjs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mergedDefectIdDataObjs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMergedDefectIdDataObjs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MergedDefectIdDataObj }
     * 
     * 
     */
    public List<MergedDefectIdDataObj> getMergedDefectIdDataObjs() {
        if (mergedDefectIdDataObjs == null) {
            mergedDefectIdDataObjs = new ArrayList<MergedDefectIdDataObj>();
        }
        return this.mergedDefectIdDataObjs;
    }

    /**
     * Gets the value of the filterSpec property.
     * 
     * @return
     *     possible object is
     *     {@link StreamDefectFilterSpecDataObj }
     *     
     */
    public StreamDefectFilterSpecDataObj getFilterSpec() {
        return filterSpec;
    }

    /**
     * Sets the value of the filterSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamDefectFilterSpecDataObj }
     *     
     */
    public void setFilterSpec(StreamDefectFilterSpecDataObj value) {
        this.filterSpec = value;
    }

}
