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
 * <p>Java class for streamDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="streamDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autoDeleteOnExpiry" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="componentMapId" type="{http://ws.coverity.com/v9}componentMapIdDataObj" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://ws.coverity.com/v9}streamIdDataObj" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outdated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="primaryProjectId" type="{http://ws.coverity.com/v9}projectIdDataObj" minOccurs="0"/&gt;
 *         &lt;element name="triageStoreId" type="{http://ws.coverity.com/v9}triageStoreIdDataObj" minOccurs="0"/&gt;
 *         &lt;element name="roleAssignments" type="{http://ws.coverity.com/v9}roleAssignmentDataObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="analysisVersionOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="summaryExpirationDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pluginVersionOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="versionMismatchMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enableDesktopAnalysis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ownerAssignmentOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "streamDataObj", propOrder = {
    "autoDeleteOnExpiry",
    "componentMapId",
    "description",
    "id",
    "language",
    "outdated",
    "primaryProjectId",
    "triageStoreId",
    "roleAssignments",
    "analysisVersionOverride",
    "summaryExpirationDays",
    "pluginVersionOverride",
    "versionMismatchMessage",
    "enableDesktopAnalysis",
    "ownerAssignmentOption"
})
public class StreamDataObj {

    protected boolean autoDeleteOnExpiry;
    protected ComponentMapIdDataObj componentMapId;
    protected String description;
    protected StreamIdDataObj id;
    protected String language;
    protected Boolean outdated;
    protected ProjectIdDataObj primaryProjectId;
    protected TriageStoreIdDataObj triageStoreId;
    @XmlElement(nillable = true)
    protected List<RoleAssignmentDataObj> roleAssignments;
    protected String analysisVersionOverride;
    protected Integer summaryExpirationDays;
    protected String pluginVersionOverride;
    protected String versionMismatchMessage;
    protected Boolean enableDesktopAnalysis;
    protected String ownerAssignmentOption;

    /**
     * Gets the value of the autoDeleteOnExpiry property.
     * 
     */
    public boolean isAutoDeleteOnExpiry() {
        return autoDeleteOnExpiry;
    }

    /**
     * Sets the value of the autoDeleteOnExpiry property.
     * 
     */
    public void setAutoDeleteOnExpiry(boolean value) {
        this.autoDeleteOnExpiry = value;
    }

    /**
     * Gets the value of the componentMapId property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentMapIdDataObj }
     *     
     */
    public ComponentMapIdDataObj getComponentMapId() {
        return componentMapId;
    }

    /**
     * Sets the value of the componentMapId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentMapIdDataObj }
     *     
     */
    public void setComponentMapId(ComponentMapIdDataObj value) {
        this.componentMapId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link StreamIdDataObj }
     *     
     */
    public StreamIdDataObj getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamIdDataObj }
     *     
     */
    public void setId(StreamIdDataObj value) {
        this.id = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the outdated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutdated() {
        return outdated;
    }

    /**
     * Sets the value of the outdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutdated(Boolean value) {
        this.outdated = value;
    }

    /**
     * Gets the value of the primaryProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdDataObj }
     *     
     */
    public ProjectIdDataObj getPrimaryProjectId() {
        return primaryProjectId;
    }

    /**
     * Sets the value of the primaryProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdDataObj }
     *     
     */
    public void setPrimaryProjectId(ProjectIdDataObj value) {
        this.primaryProjectId = value;
    }

    /**
     * Gets the value of the triageStoreId property.
     * 
     * @return
     *     possible object is
     *     {@link TriageStoreIdDataObj }
     *     
     */
    public TriageStoreIdDataObj getTriageStoreId() {
        return triageStoreId;
    }

    /**
     * Sets the value of the triageStoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriageStoreIdDataObj }
     *     
     */
    public void setTriageStoreId(TriageStoreIdDataObj value) {
        this.triageStoreId = value;
    }

    /**
     * Gets the value of the roleAssignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleAssignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleAssignmentDataObj }
     * 
     * 
     */
    public List<RoleAssignmentDataObj> getRoleAssignments() {
        if (roleAssignments == null) {
            roleAssignments = new ArrayList<RoleAssignmentDataObj>();
        }
        return this.roleAssignments;
    }

    /**
     * Gets the value of the analysisVersionOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysisVersionOverride() {
        return analysisVersionOverride;
    }

    /**
     * Sets the value of the analysisVersionOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisVersionOverride(String value) {
        this.analysisVersionOverride = value;
    }

    /**
     * Gets the value of the summaryExpirationDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSummaryExpirationDays() {
        return summaryExpirationDays;
    }

    /**
     * Sets the value of the summaryExpirationDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSummaryExpirationDays(Integer value) {
        this.summaryExpirationDays = value;
    }

    /**
     * Gets the value of the pluginVersionOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginVersionOverride() {
        return pluginVersionOverride;
    }

    /**
     * Sets the value of the pluginVersionOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginVersionOverride(String value) {
        this.pluginVersionOverride = value;
    }

    /**
     * Gets the value of the versionMismatchMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionMismatchMessage() {
        return versionMismatchMessage;
    }

    /**
     * Sets the value of the versionMismatchMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionMismatchMessage(String value) {
        this.versionMismatchMessage = value;
    }

    /**
     * Gets the value of the enableDesktopAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDesktopAnalysis() {
        return enableDesktopAnalysis;
    }

    /**
     * Sets the value of the enableDesktopAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDesktopAnalysis(Boolean value) {
        this.enableDesktopAnalysis = value;
    }

    /**
     * Gets the value of the ownerAssignmentOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerAssignmentOption() {
        return ownerAssignmentOption;
    }

    /**
     * Sets the value of the ownerAssignmentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerAssignmentOption(String value) {
        this.ownerAssignmentOption = value;
    }

}
