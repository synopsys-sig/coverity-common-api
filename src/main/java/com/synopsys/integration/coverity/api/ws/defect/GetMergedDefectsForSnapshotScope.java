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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMergedDefectsForSnapshotScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMergedDefectsForSnapshotScope"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="projectId" type="{http://ws.coverity.com/v9}projectIdDataObj" minOccurs="0"/&gt;
 *         &lt;element name="filterSpec" type="{http://ws.coverity.com/v9}snapshotScopeDefectFilterSpecDataObj" minOccurs="0"/&gt;
 *         &lt;element name="pageSpec" type="{http://ws.coverity.com/v9}pageSpecDataObj" minOccurs="0"/&gt;
 *         &lt;element name="snapshotScope" type="{http://ws.coverity.com/v9}snapshotScopeSpecDataObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMergedDefectsForSnapshotScope", propOrder = {
    "projectId",
    "filterSpec",
    "pageSpec",
    "snapshotScope"
})
public class GetMergedDefectsForSnapshotScope {

    protected ProjectIdDataObj projectId;
    protected SnapshotScopeDefectFilterSpecDataObj filterSpec;
    protected PageSpecDataObj pageSpec;
    protected SnapshotScopeSpecDataObj snapshotScope;

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdDataObj }
     *     
     */
    public ProjectIdDataObj getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdDataObj }
     *     
     */
    public void setProjectId(ProjectIdDataObj value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the filterSpec property.
     * 
     * @return
     *     possible object is
     *     {@link SnapshotScopeDefectFilterSpecDataObj }
     *     
     */
    public SnapshotScopeDefectFilterSpecDataObj getFilterSpec() {
        return filterSpec;
    }

    /**
     * Sets the value of the filterSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapshotScopeDefectFilterSpecDataObj }
     *     
     */
    public void setFilterSpec(SnapshotScopeDefectFilterSpecDataObj value) {
        this.filterSpec = value;
    }

    /**
     * Gets the value of the pageSpec property.
     * 
     * @return
     *     possible object is
     *     {@link PageSpecDataObj }
     *     
     */
    public PageSpecDataObj getPageSpec() {
        return pageSpec;
    }

    /**
     * Sets the value of the pageSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageSpecDataObj }
     *     
     */
    public void setPageSpec(PageSpecDataObj value) {
        this.pageSpec = value;
    }

    /**
     * Gets the value of the snapshotScope property.
     * 
     * @return
     *     possible object is
     *     {@link SnapshotScopeSpecDataObj }
     *     
     */
    public SnapshotScopeSpecDataObj getSnapshotScope() {
        return snapshotScope;
    }

    /**
     * Sets the value of the snapshotScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapshotScopeSpecDataObj }
     *     
     */
    public void setSnapshotScope(SnapshotScopeSpecDataObj value) {
        this.snapshotScope = value;
    }

}
