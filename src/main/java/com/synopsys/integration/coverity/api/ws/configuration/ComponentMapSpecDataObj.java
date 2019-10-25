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
 * <p>Java class for componentMapSpecDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="componentMapSpecDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="componentMapName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="componentPathRules" type="{http://ws.coverity.com/v9}componentPathRuleDataObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="components" type="{http://ws.coverity.com/v9}componentDataObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="defectRules" type="{http://ws.coverity.com/v9}componentDefectRuleDataObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forceDeleteComponents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "componentMapSpecDataObj", propOrder = {
    "componentMapName",
    "componentPathRules",
    "components",
    "defectRules",
    "description",
    "forceDeleteComponents"
})
public class ComponentMapSpecDataObj {

    protected String componentMapName;
    @XmlElement(nillable = true)
    protected List<ComponentPathRuleDataObj> componentPathRules;
    @XmlElement(nillable = true)
    protected List<ComponentDataObj> components;
    @XmlElement(nillable = true)
    protected List<ComponentDefectRuleDataObj> defectRules;
    protected String description;
    protected Boolean forceDeleteComponents;

    /**
     * Gets the value of the componentMapName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentMapName() {
        return componentMapName;
    }

    /**
     * Sets the value of the componentMapName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentMapName(String value) {
        this.componentMapName = value;
    }

    /**
     * Gets the value of the componentPathRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentPathRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentPathRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentPathRuleDataObj }
     * 
     * 
     */
    public List<ComponentPathRuleDataObj> getComponentPathRules() {
        if (componentPathRules == null) {
            componentPathRules = new ArrayList<ComponentPathRuleDataObj>();
        }
        return this.componentPathRules;
    }

    /**
     * Gets the value of the components property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the components property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentDataObj }
     * 
     * 
     */
    public List<ComponentDataObj> getComponents() {
        if (components == null) {
            components = new ArrayList<ComponentDataObj>();
        }
        return this.components;
    }

    /**
     * Gets the value of the defectRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defectRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefectRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentDefectRuleDataObj }
     * 
     * 
     */
    public List<ComponentDefectRuleDataObj> getDefectRules() {
        if (defectRules == null) {
            defectRules = new ArrayList<ComponentDefectRuleDataObj>();
        }
        return this.defectRules;
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
     * Gets the value of the forceDeleteComponents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceDeleteComponents() {
        return forceDeleteComponents;
    }

    /**
     * Sets the value of the forceDeleteComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceDeleteComponents(Boolean value) {
        this.forceDeleteComponents = value;
    }

}
