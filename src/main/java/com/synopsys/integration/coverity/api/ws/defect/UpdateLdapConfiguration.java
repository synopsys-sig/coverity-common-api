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
 * <p>Java class for updateLdapConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateLdapConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serverDomainIdDataObj" type="{http://ws.coverity.com/v9}serverDomainIdDataObj" minOccurs="0"/&gt;
 *         &lt;element name="ldapConfigurationSpec" type="{http://ws.coverity.com/v9}ldapConfigurationSpecDataObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateLdapConfiguration", propOrder = {
    "serverDomainIdDataObj",
    "ldapConfigurationSpec"
})
public class UpdateLdapConfiguration {

    protected ServerDomainIdDataObj serverDomainIdDataObj;
    protected LdapConfigurationSpecDataObj ldapConfigurationSpec;

    /**
     * Gets the value of the serverDomainIdDataObj property.
     * 
     * @return
     *     possible object is
     *     {@link ServerDomainIdDataObj }
     *     
     */
    public ServerDomainIdDataObj getServerDomainIdDataObj() {
        return serverDomainIdDataObj;
    }

    /**
     * Sets the value of the serverDomainIdDataObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerDomainIdDataObj }
     *     
     */
    public void setServerDomainIdDataObj(ServerDomainIdDataObj value) {
        this.serverDomainIdDataObj = value;
    }

    /**
     * Gets the value of the ldapConfigurationSpec property.
     * 
     * @return
     *     possible object is
     *     {@link LdapConfigurationSpecDataObj }
     *     
     */
    public LdapConfigurationSpecDataObj getLdapConfigurationSpec() {
        return ldapConfigurationSpec;
    }

    /**
     * Sets the value of the ldapConfigurationSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapConfigurationSpecDataObj }
     *     
     */
    public void setLdapConfigurationSpec(LdapConfigurationSpecDataObj value) {
        this.ldapConfigurationSpec = value;
    }

}
