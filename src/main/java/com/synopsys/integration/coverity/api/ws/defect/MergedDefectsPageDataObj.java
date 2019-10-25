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

package com.synopsys.integration.coverity.api.ws.defect;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mergedDefectsPageDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mergedDefectsPageDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mergedDefectIds" type="{http://ws.coverity.com/v9}mergedDefectIdDataObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mergedDefects" type="{http://ws.coverity.com/v9}mergedDefectDataObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalNumberOfRecords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergedDefectsPageDataObj", propOrder = {
    "mergedDefectIds",
    "mergedDefects",
    "totalNumberOfRecords"
})
public class MergedDefectsPageDataObj {

    @XmlElement(nillable = true)
    protected List<MergedDefectIdDataObj> mergedDefectIds;
    @XmlElement(nillable = true)
    protected List<MergedDefectDataObj> mergedDefects;
    protected Integer totalNumberOfRecords;

    /**
     * Gets the value of the mergedDefectIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mergedDefectIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMergedDefectIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MergedDefectIdDataObj }
     * 
     * 
     */
    public List<MergedDefectIdDataObj> getMergedDefectIds() {
        if (mergedDefectIds == null) {
            mergedDefectIds = new ArrayList<MergedDefectIdDataObj>();
        }
        return this.mergedDefectIds;
    }

    /**
     * Gets the value of the mergedDefects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mergedDefects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMergedDefects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MergedDefectDataObj }
     * 
     * 
     */
    public List<MergedDefectDataObj> getMergedDefects() {
        if (mergedDefects == null) {
            mergedDefects = new ArrayList<MergedDefectDataObj>();
        }
        return this.mergedDefects;
    }

    /**
     * Gets the value of the totalNumberOfRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberOfRecords() {
        return totalNumberOfRecords;
    }

    /**
     * Sets the value of the totalNumberOfRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberOfRecords(Integer value) {
        this.totalNumberOfRecords = value;
    }

}
