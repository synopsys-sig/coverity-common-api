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
package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateRole"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roleId" type="{http://ws.coverity.com/v9}roleIdDataObj" minOccurs="0"/&gt;
 *         &lt;element name="roleSpec" type="{http://ws.coverity.com/v9}roleSpecDataObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRole", propOrder = {
    "roleId",
    "roleSpec"
})
public class UpdateRole {

    protected RoleIdDataObj roleId;
    protected RoleSpecDataObj roleSpec;

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

    /**
     * Gets the value of the roleSpec property.
     * 
     * @return
     *     possible object is
     *     {@link RoleSpecDataObj }
     *     
     */
    public RoleSpecDataObj getRoleSpec() {
        return roleSpec;
    }

    /**
     * Sets the value of the roleSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleSpecDataObj }
     *     
     */
    public void setRoleSpec(RoleSpecDataObj value) {
        this.roleSpec = value;
    }

}
