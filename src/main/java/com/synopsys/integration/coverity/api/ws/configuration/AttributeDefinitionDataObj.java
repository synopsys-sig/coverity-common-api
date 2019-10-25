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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attributeDefinitionDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attributeDefinitionDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributeDefinitionId" type="{http://ws.coverity.com/v9}attributeDefinitionIdDataObj" minOccurs="0"/&gt;
 *         &lt;element name="attributeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="builtIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="configurableValues" type="{http://ws.coverity.com/v9}attributeValueDataObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="showInTriage" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attributeDefinitionDataObj", propOrder = {
    "attributeDefinitionId",
    "attributeType",
    "builtIn",
    "configurableValues",
    "defaultValue",
    "description",
    "displayDescription",
    "displayName",
    "showInTriage"
})
public class AttributeDefinitionDataObj {

    protected AttributeDefinitionIdDataObj attributeDefinitionId;
    protected String attributeType;
    protected boolean builtIn;
    @XmlElement(nillable = true)
    protected List<AttributeValueDataObj> configurableValues;
    protected String defaultValue;
    protected String description;
    protected String displayDescription;
    protected String displayName;
    protected boolean showInTriage;

    /**
     * Gets the value of the attributeDefinitionId property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeDefinitionIdDataObj }
     *     
     */
    public AttributeDefinitionIdDataObj getAttributeDefinitionId() {
        return attributeDefinitionId;
    }

    /**
     * Sets the value of the attributeDefinitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeDefinitionIdDataObj }
     *     
     */
    public void setAttributeDefinitionId(AttributeDefinitionIdDataObj value) {
        this.attributeDefinitionId = value;
    }

    /**
     * Gets the value of the attributeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeType() {
        return attributeType;
    }

    /**
     * Sets the value of the attributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeType(String value) {
        this.attributeType = value;
    }

    /**
     * Gets the value of the builtIn property.
     * 
     */
    public boolean isBuiltIn() {
        return builtIn;
    }

    /**
     * Sets the value of the builtIn property.
     * 
     */
    public void setBuiltIn(boolean value) {
        this.builtIn = value;
    }

    /**
     * Gets the value of the configurableValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configurableValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigurableValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeValueDataObj }
     * 
     * 
     */
    public List<AttributeValueDataObj> getConfigurableValues() {
        if (configurableValues == null) {
            configurableValues = new ArrayList<AttributeValueDataObj>();
        }
        return this.configurableValues;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
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
     * Gets the value of the displayDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayDescription() {
        return displayDescription;
    }

    /**
     * Sets the value of the displayDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayDescription(String value) {
        this.displayDescription = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the showInTriage property.
     * 
     */
    public boolean isShowInTriage() {
        return showInTriage;
    }

    /**
     * Sets the value of the showInTriage property.
     * 
     */
    public void setShowInTriage(boolean value) {
        this.showInTriage = value;
    }

}
