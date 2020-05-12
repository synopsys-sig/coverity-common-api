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
 * <p>Java class for defectDetectionHistoryDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="defectDetectionHistoryDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defectDetection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detection" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="inCurrentSnapshot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="snapshotId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="streams" type="{http://ws.coverity.com/v9}streamIdDataObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defectDetectionHistoryDataObj", propOrder = {
    "defectDetection",
    "detection",
    "inCurrentSnapshot",
    "snapshotId",
    "streams",
    "userName"
})
public class DefectDetectionHistoryDataObj {

    protected String defectDetection;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar detection;
    protected Boolean inCurrentSnapshot;
    protected Long snapshotId;
    @XmlElement(nillable = true)
    protected List<StreamIdDataObj> streams;
    protected String userName;

    /**
     * Gets the value of the defectDetection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefectDetection() {
        return defectDetection;
    }

    /**
     * Sets the value of the defectDetection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefectDetection(String value) {
        this.defectDetection = value;
    }

    /**
     * Gets the value of the detection property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDetection() {
        return detection;
    }

    /**
     * Sets the value of the detection property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDetection(XMLGregorianCalendar value) {
        this.detection = value;
    }

    /**
     * Gets the value of the inCurrentSnapshot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInCurrentSnapshot() {
        return inCurrentSnapshot;
    }

    /**
     * Sets the value of the inCurrentSnapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInCurrentSnapshot(Boolean value) {
        this.inCurrentSnapshot = value;
    }

    /**
     * Gets the value of the snapshotId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSnapshotId() {
        return snapshotId;
    }

    /**
     * Sets the value of the snapshotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSnapshotId(Long value) {
        this.snapshotId = value;
    }

    /**
     * Gets the value of the streams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreamIdDataObj }
     * 
     * 
     */
    public List<StreamIdDataObj> getStreams() {
        if (streams == null) {
            streams = new ArrayList<StreamIdDataObj>();
        }
        return this.streams;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

}
