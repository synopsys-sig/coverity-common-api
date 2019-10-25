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
 * <p>Java class for functionInfoDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="functionInfoDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileId" type="{http://ws.coverity.com/v9}fileIdDataObj" minOccurs="0"/&gt;
 *         &lt;element name="functionDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionMangledName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionMergeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "functionInfoDataObj", propOrder = {
    "fileId",
    "functionDisplayName",
    "functionMangledName",
    "functionMergeName"
})
public class FunctionInfoDataObj {

    protected FileIdDataObj fileId;
    protected String functionDisplayName;
    protected String functionMangledName;
    protected String functionMergeName;

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link FileIdDataObj }
     *     
     */
    public FileIdDataObj getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileIdDataObj }
     *     
     */
    public void setFileId(FileIdDataObj value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the functionDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionDisplayName() {
        return functionDisplayName;
    }

    /**
     * Sets the value of the functionDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionDisplayName(String value) {
        this.functionDisplayName = value;
    }

    /**
     * Gets the value of the functionMangledName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionMangledName() {
        return functionMangledName;
    }

    /**
     * Sets the value of the functionMangledName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionMangledName(String value) {
        this.functionMangledName = value;
    }

    /**
     * Gets the value of the functionMergeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionMergeName() {
        return functionMergeName;
    }

    /**
     * Sets the value of the functionMergeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionMergeName(String value) {
        this.functionMergeName = value;
    }

}
