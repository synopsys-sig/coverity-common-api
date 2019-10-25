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
 * <p>Java class for updateSignInConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateSignInConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="signInSettingsDataObj" type="{http://ws.coverity.com/v9}signInSettingsDataObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateSignInConfiguration", propOrder = {
    "signInSettingsDataObj"
})
public class UpdateSignInConfiguration {

    protected SignInSettingsDataObj signInSettingsDataObj;

    /**
     * Gets the value of the signInSettingsDataObj property.
     * 
     * @return
     *     possible object is
     *     {@link SignInSettingsDataObj }
     *     
     */
    public SignInSettingsDataObj getSignInSettingsDataObj() {
        return signInSettingsDataObj;
    }

    /**
     * Sets the value of the signInSettingsDataObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignInSettingsDataObj }
     *     
     */
    public void setSignInSettingsDataObj(SignInSettingsDataObj value) {
        this.signInSettingsDataObj = value;
    }

}
