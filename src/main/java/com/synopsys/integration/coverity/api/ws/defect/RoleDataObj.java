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
 * <p>Java class for roleDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="roleDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deletable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="editable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="permissionDataObjs" type="{http://ws.coverity.com/v9}permissionDataObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roleId" type="{http://ws.coverity.com/v9}roleIdDataObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roleDataObj", propOrder = {
    "deletable",
    "description",
    "editable",
    "permissionDataObjs",
    "roleId"
})
public class RoleDataObj {

    protected Boolean deletable;
    protected String description;
    protected Boolean editable;
    @XmlElement(nillable = true)
    protected List<PermissionDataObj> permissionDataObjs;
    protected RoleIdDataObj roleId;

    /**
     * Gets the value of the deletable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeletable() {
        return deletable;
    }

    /**
     * Sets the value of the deletable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeletable(Boolean value) {
        this.deletable = value;
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
     * Gets the value of the editable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEditable() {
        return editable;
    }

    /**
     * Sets the value of the editable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditable(Boolean value) {
        this.editable = value;
    }

    /**
     * Gets the value of the permissionDataObjs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permissionDataObjs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermissionDataObjs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionDataObj }
     * 
     * 
     */
    public List<PermissionDataObj> getPermissionDataObjs() {
        if (permissionDataObjs == null) {
            permissionDataObjs = new ArrayList<PermissionDataObj>();
        }
        return this.permissionDataObjs;
    }

    /**
     * Gets the value of the roleId property.
     * 
     * @return
     *     possible object is
     *     {@link RoleIdDataObj }
     *     
     */
    public RoleIdDataObj getRoleId() {
        return roleId;
    }

    /**
     * Sets the value of the roleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleIdDataObj }
     *     
     */
    public void setRoleId(RoleIdDataObj value) {
        this.roleId = value;
    }

}
