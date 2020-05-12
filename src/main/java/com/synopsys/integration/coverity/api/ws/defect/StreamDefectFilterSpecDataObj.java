/**
 * coverity-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for streamDefectFilterSpecDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="streamDefectFilterSpecDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defectStateEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="defectStateStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="includeDefectInstances" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includeHistory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includeTotalDefectInstanceCount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="maxDefectInstances" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="streamIdList" type="{http://ws.coverity.com/v9}streamIdDataObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "streamDefectFilterSpecDataObj", propOrder = {
    "defectStateEndDate",
    "defectStateStartDate",
    "includeDefectInstances",
    "includeHistory",
    "includeTotalDefectInstanceCount",
    "maxDefectInstances",
    "streamIdList"
})
public class StreamDefectFilterSpecDataObj {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar defectStateEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar defectStateStartDate;
    protected boolean includeDefectInstances;
    protected boolean includeHistory;
    protected boolean includeTotalDefectInstanceCount;
    protected int maxDefectInstances;
    @XmlElement(nillable = true)
    protected List<StreamIdDataObj> streamIdList;

    /**
     * Gets the value of the defectStateEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDefectStateEndDate() {
        return defectStateEndDate;
    }

    /**
     * Sets the value of the defectStateEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDefectStateEndDate(XMLGregorianCalendar value) {
        this.defectStateEndDate = value;
    }

    /**
     * Gets the value of the defectStateStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDefectStateStartDate() {
        return defectStateStartDate;
    }

    /**
     * Sets the value of the defectStateStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDefectStateStartDate(XMLGregorianCalendar value) {
        this.defectStateStartDate = value;
    }

    /**
     * Gets the value of the includeDefectInstances property.
     * 
     */
    public boolean isIncludeDefectInstances() {
        return includeDefectInstances;
    }

    /**
     * Sets the value of the includeDefectInstances property.
     * 
     */
    public void setIncludeDefectInstances(boolean value) {
        this.includeDefectInstances = value;
    }

    /**
     * Gets the value of the includeHistory property.
     * 
     */
    public boolean isIncludeHistory() {
        return includeHistory;
    }

    /**
     * Sets the value of the includeHistory property.
     * 
     */
    public void setIncludeHistory(boolean value) {
        this.includeHistory = value;
    }

    /**
     * Gets the value of the includeTotalDefectInstanceCount property.
     * 
     */
    public boolean isIncludeTotalDefectInstanceCount() {
        return includeTotalDefectInstanceCount;
    }

    /**
     * Sets the value of the includeTotalDefectInstanceCount property.
     * 
     */
    public void setIncludeTotalDefectInstanceCount(boolean value) {
        this.includeTotalDefectInstanceCount = value;
    }

    /**
     * Gets the value of the maxDefectInstances property.
     * 
     */
    public int getMaxDefectInstances() {
        return maxDefectInstances;
    }

    /**
     * Sets the value of the maxDefectInstances property.
     * 
     */
    public void setMaxDefectInstances(int value) {
        this.maxDefectInstances = value;
    }

    /**
     * Gets the value of the streamIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streamIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreamIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreamIdDataObj }
     * 
     * 
     */
    public List<StreamIdDataObj> getStreamIdList() {
        if (streamIdList == null) {
            streamIdList = new ArrayList<StreamIdDataObj>();
        }
        return this.streamIdList;
    }

}
