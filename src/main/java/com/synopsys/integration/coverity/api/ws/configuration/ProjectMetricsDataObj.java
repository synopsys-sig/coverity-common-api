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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for projectMetricsDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="projectMetricsDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blankLineCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codeLineCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="commentLineCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dismissedCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fixedCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="inspectedCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="metricsDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="newCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="outstandingCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="projectId" type="{http://ws.coverity.com/v9}projectIdDataObj"/&gt;
 *         &lt;element name="resolvedCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="triagedCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "projectMetricsDataObj", propOrder = {
    "blankLineCount",
    "codeLineCount",
    "commentLineCount",
    "dismissedCount",
    "fixedCount",
    "inspectedCount",
    "metricsDate",
    "newCount",
    "outstandingCount",
    "projectId",
    "resolvedCount",
    "totalCount",
    "triagedCount"
})
public class ProjectMetricsDataObj {

    protected int blankLineCount;
    protected int codeLineCount;
    protected int commentLineCount;
    protected int dismissedCount;
    protected int fixedCount;
    protected int inspectedCount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar metricsDate;
    protected int newCount;
    protected int outstandingCount;
    @XmlElement(required = true)
    protected ProjectIdDataObj projectId;
    protected int resolvedCount;
    protected int totalCount;
    protected int triagedCount;

    /**
     * Gets the value of the blankLineCount property.
     * 
     */
    public int getBlankLineCount() {
        return blankLineCount;
    }

    /**
     * Sets the value of the blankLineCount property.
     * 
     */
    public void setBlankLineCount(int value) {
        this.blankLineCount = value;
    }

    /**
     * Gets the value of the codeLineCount property.
     * 
     */
    public int getCodeLineCount() {
        return codeLineCount;
    }

    /**
     * Sets the value of the codeLineCount property.
     * 
     */
    public void setCodeLineCount(int value) {
        this.codeLineCount = value;
    }

    /**
     * Gets the value of the commentLineCount property.
     * 
     */
    public int getCommentLineCount() {
        return commentLineCount;
    }

    /**
     * Sets the value of the commentLineCount property.
     * 
     */
    public void setCommentLineCount(int value) {
        this.commentLineCount = value;
    }

    /**
     * Gets the value of the dismissedCount property.
     * 
     */
    public int getDismissedCount() {
        return dismissedCount;
    }

    /**
     * Sets the value of the dismissedCount property.
     * 
     */
    public void setDismissedCount(int value) {
        this.dismissedCount = value;
    }

    /**
     * Gets the value of the fixedCount property.
     * 
     */
    public int getFixedCount() {
        return fixedCount;
    }

    /**
     * Sets the value of the fixedCount property.
     * 
     */
    public void setFixedCount(int value) {
        this.fixedCount = value;
    }

    /**
     * Gets the value of the inspectedCount property.
     * 
     */
    public int getInspectedCount() {
        return inspectedCount;
    }

    /**
     * Sets the value of the inspectedCount property.
     * 
     */
    public void setInspectedCount(int value) {
        this.inspectedCount = value;
    }

    /**
     * Gets the value of the metricsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMetricsDate() {
        return metricsDate;
    }

    /**
     * Sets the value of the metricsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMetricsDate(XMLGregorianCalendar value) {
        this.metricsDate = value;
    }

    /**
     * Gets the value of the newCount property.
     * 
     */
    public int getNewCount() {
        return newCount;
    }

    /**
     * Sets the value of the newCount property.
     * 
     */
    public void setNewCount(int value) {
        this.newCount = value;
    }

    /**
     * Gets the value of the outstandingCount property.
     * 
     */
    public int getOutstandingCount() {
        return outstandingCount;
    }

    /**
     * Sets the value of the outstandingCount property.
     * 
     */
    public void setOutstandingCount(int value) {
        this.outstandingCount = value;
    }

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
     * Gets the value of the resolvedCount property.
     * 
     */
    public int getResolvedCount() {
        return resolvedCount;
    }

    /**
     * Sets the value of the resolvedCount property.
     * 
     */
    public void setResolvedCount(int value) {
        this.resolvedCount = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the triagedCount property.
     * 
     */
    public int getTriagedCount() {
        return triagedCount;
    }

    /**
     * Sets the value of the triagedCount property.
     * 
     */
    public void setTriagedCount(int value) {
        this.triagedCount = value;
    }

}
