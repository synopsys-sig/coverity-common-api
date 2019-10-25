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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for streamDefectIdDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="streamDefectIdDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defectTriageId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="defectTriageVerNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="verNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "streamDefectIdDataObj", propOrder = {
    "defectTriageId",
    "defectTriageVerNum",
    "id",
    "verNum"
})
public class StreamDefectIdDataObj {

    protected long defectTriageId;
    protected int defectTriageVerNum;
    protected long id;
    protected int verNum;

    /**
     * Gets the value of the defectTriageId property.
     * 
     */
    public long getDefectTriageId() {
        return defectTriageId;
    }

    /**
     * Sets the value of the defectTriageId property.
     * 
     */
    public void setDefectTriageId(long value) {
        this.defectTriageId = value;
    }

    /**
     * Gets the value of the defectTriageVerNum property.
     * 
     */
    public int getDefectTriageVerNum() {
        return defectTriageVerNum;
    }

    /**
     * Sets the value of the defectTriageVerNum property.
     * 
     */
    public void setDefectTriageVerNum(int value) {
        this.defectTriageVerNum = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the verNum property.
     * 
     */
    public int getVerNum() {
        return verNum;
    }

    /**
     * Sets the value of the verNum property.
     * 
     */
    public void setVerNum(int value) {
        this.verNum = value;
    }

}
