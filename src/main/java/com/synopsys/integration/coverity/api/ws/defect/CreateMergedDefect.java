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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for createMergedDefect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createMergedDefect"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mergeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateOriginated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="externalPreventVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internalPreventVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createMergedDefect", propOrder = {
    "mergeKey",
    "dateOriginated",
    "externalPreventVersion",
    "internalPreventVersion",
    "checkerName",
    "domainName"
})
public class CreateMergedDefect {

    protected String mergeKey;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOriginated;
    protected String externalPreventVersion;
    protected String internalPreventVersion;
    protected String checkerName;
    protected String domainName;

    /**
     * Gets the value of the mergeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMergeKey() {
        return mergeKey;
    }

    /**
     * Sets the value of the mergeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMergeKey(String value) {
        this.mergeKey = value;
    }

    /**
     * Gets the value of the dateOriginated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOriginated() {
        return dateOriginated;
    }

    /**
     * Sets the value of the dateOriginated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOriginated(XMLGregorianCalendar value) {
        this.dateOriginated = value;
    }

    /**
     * Gets the value of the externalPreventVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPreventVersion() {
        return externalPreventVersion;
    }

    /**
     * Sets the value of the externalPreventVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPreventVersion(String value) {
        this.externalPreventVersion = value;
    }

    /**
     * Gets the value of the internalPreventVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalPreventVersion() {
        return internalPreventVersion;
    }

    /**
     * Sets the value of the internalPreventVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalPreventVersion(String value) {
        this.internalPreventVersion = value;
    }

    /**
     * Gets the value of the checkerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckerName() {
        return checkerName;
    }

    /**
     * Sets the value of the checkerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckerName(String value) {
        this.checkerName = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

}
