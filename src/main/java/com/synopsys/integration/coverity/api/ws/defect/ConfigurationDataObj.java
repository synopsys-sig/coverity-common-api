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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configurationDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configurationDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commitPort" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dbDialect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dbDriver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issueExportUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maindbName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maindbUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maindbUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configurationDataObj", propOrder = {
    "commitPort",
    "dbDialect",
    "dbDriver",
    "issueExportUrl",
    "maindbName",
    "maindbUrl",
    "maindbUser"
})
public class ConfigurationDataObj {

    protected Long commitPort;
    protected String dbDialect;
    protected String dbDriver;
    protected String issueExportUrl;
    protected String maindbName;
    protected String maindbUrl;
    protected String maindbUser;

    /**
     * Gets the value of the commitPort property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCommitPort() {
        return commitPort;
    }

    /**
     * Sets the value of the commitPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCommitPort(Long value) {
        this.commitPort = value;
    }

    /**
     * Gets the value of the dbDialect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbDialect() {
        return dbDialect;
    }

    /**
     * Sets the value of the dbDialect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbDialect(String value) {
        this.dbDialect = value;
    }

    /**
     * Gets the value of the dbDriver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbDriver() {
        return dbDriver;
    }

    /**
     * Sets the value of the dbDriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbDriver(String value) {
        this.dbDriver = value;
    }

    /**
     * Gets the value of the issueExportUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueExportUrl() {
        return issueExportUrl;
    }

    /**
     * Sets the value of the issueExportUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueExportUrl(String value) {
        this.issueExportUrl = value;
    }

    /**
     * Gets the value of the maindbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaindbName() {
        return maindbName;
    }

    /**
     * Sets the value of the maindbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaindbName(String value) {
        this.maindbName = value;
    }

    /**
     * Gets the value of the maindbUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaindbUrl() {
        return maindbUrl;
    }

    /**
     * Sets the value of the maindbUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaindbUrl(String value) {
        this.maindbUrl = value;
    }

    /**
     * Gets the value of the maindbUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaindbUser() {
        return maindbUser;
    }

    /**
     * Sets the value of the maindbUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaindbUser(String value) {
        this.maindbUser = value;
    }

}
