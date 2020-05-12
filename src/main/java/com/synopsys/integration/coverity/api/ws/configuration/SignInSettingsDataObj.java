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
 * <p>Java class for signInSettingsDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="signInSettingsDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allowPasswordRecovery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="authenticationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="disableLocalPasswordAuth" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="enableLdapAuth" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="enableSessionTimeout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ldapUserAutoCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="limitFailedSignIns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="maxFailedSignInAttempts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="maxSessionIdleTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="requireLdapGroupMembership" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signInSettingsDataObj", propOrder = {
    "allowPasswordRecovery",
    "authenticationMethod",
    "disableLocalPasswordAuth",
    "enableLdapAuth",
    "enableSessionTimeout",
    "ldapUserAutoCreate",
    "limitFailedSignIns",
    "maxFailedSignInAttempts",
    "maxSessionIdleTime",
    "requireLdapGroupMembership"
})
public class SignInSettingsDataObj {

    protected Boolean allowPasswordRecovery;
    protected String authenticationMethod;
    protected Boolean disableLocalPasswordAuth;
    protected Boolean enableLdapAuth;
    protected Boolean enableSessionTimeout;
    protected Boolean ldapUserAutoCreate;
    protected Boolean limitFailedSignIns;
    protected Integer maxFailedSignInAttempts;
    protected Integer maxSessionIdleTime;
    protected Boolean requireLdapGroupMembership;

    /**
     * Gets the value of the allowPasswordRecovery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPasswordRecovery() {
        return allowPasswordRecovery;
    }

    /**
     * Sets the value of the allowPasswordRecovery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPasswordRecovery(Boolean value) {
        this.allowPasswordRecovery = value;
    }

    /**
     * Gets the value of the authenticationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    /**
     * Sets the value of the authenticationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationMethod(String value) {
        this.authenticationMethod = value;
    }

    /**
     * Gets the value of the disableLocalPasswordAuth property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableLocalPasswordAuth() {
        return disableLocalPasswordAuth;
    }

    /**
     * Sets the value of the disableLocalPasswordAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableLocalPasswordAuth(Boolean value) {
        this.disableLocalPasswordAuth = value;
    }

    /**
     * Gets the value of the enableLdapAuth property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableLdapAuth() {
        return enableLdapAuth;
    }

    /**
     * Sets the value of the enableLdapAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableLdapAuth(Boolean value) {
        this.enableLdapAuth = value;
    }

    /**
     * Gets the value of the enableSessionTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSessionTimeout() {
        return enableSessionTimeout;
    }

    /**
     * Sets the value of the enableSessionTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSessionTimeout(Boolean value) {
        this.enableSessionTimeout = value;
    }

    /**
     * Gets the value of the ldapUserAutoCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLdapUserAutoCreate() {
        return ldapUserAutoCreate;
    }

    /**
     * Sets the value of the ldapUserAutoCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLdapUserAutoCreate(Boolean value) {
        this.ldapUserAutoCreate = value;
    }

    /**
     * Gets the value of the limitFailedSignIns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLimitFailedSignIns() {
        return limitFailedSignIns;
    }

    /**
     * Sets the value of the limitFailedSignIns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLimitFailedSignIns(Boolean value) {
        this.limitFailedSignIns = value;
    }

    /**
     * Gets the value of the maxFailedSignInAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFailedSignInAttempts() {
        return maxFailedSignInAttempts;
    }

    /**
     * Sets the value of the maxFailedSignInAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFailedSignInAttempts(Integer value) {
        this.maxFailedSignInAttempts = value;
    }

    /**
     * Gets the value of the maxSessionIdleTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSessionIdleTime() {
        return maxSessionIdleTime;
    }

    /**
     * Sets the value of the maxSessionIdleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSessionIdleTime(Integer value) {
        this.maxSessionIdleTime = value;
    }

    /**
     * Gets the value of the requireLdapGroupMembership property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireLdapGroupMembership() {
        return requireLdapGroupMembership;
    }

    /**
     * Sets the value of the requireLdapGroupMembership property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireLdapGroupMembership(Boolean value) {
        this.requireLdapGroupMembership = value;
    }

}
