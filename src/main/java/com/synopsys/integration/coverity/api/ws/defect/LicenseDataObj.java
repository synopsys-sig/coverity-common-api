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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for licenseDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="licenseDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="licenseEditionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="locLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="userCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="userLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "licenseDataObj", propOrder = {
    "customer",
    "expirationDate",
    "licenseEditionName",
    "loc",
    "locLimit",
    "userCount",
    "userLimit"
})
public class LicenseDataObj {

    protected String customer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected String licenseEditionName;
    protected Long loc;
    protected Long locLimit;
    protected int userCount;
    protected String userLimit;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the licenseEditionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseEditionName() {
        return licenseEditionName;
    }

    /**
     * Sets the value of the licenseEditionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseEditionName(String value) {
        this.licenseEditionName = value;
    }

    /**
     * Gets the value of the loc property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLoc() {
        return loc;
    }

    /**
     * Sets the value of the loc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLoc(Long value) {
        this.loc = value;
    }

    /**
     * Gets the value of the locLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocLimit() {
        return locLimit;
    }

    /**
     * Sets the value of the locLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocLimit(Long value) {
        this.locLimit = value;
    }

    /**
     * Gets the value of the userCount property.
     * 
     */
    public int getUserCount() {
        return userCount;
    }

    /**
     * Sets the value of the userCount property.
     * 
     */
    public void setUserCount(int value) {
        this.userCount = value;
    }

    /**
     * Gets the value of the userLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLimit() {
        return userLimit;
    }

    /**
     * Sets the value of the userLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLimit(String value) {
        this.userLimit = value;
    }

}
