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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for defectChangeDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="defectChangeDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="affectedStreams" type="{http://ws.coverity.com/v9}streamIdDataObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="attributeChanges" type="{http://ws.coverity.com/v9}fieldChangeDataObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="userModified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defectChangeDataObj", propOrder = {
    "affectedStreams",
    "attributeChanges",
    "comments",
    "dateModified",
    "userModified"
})
public class DefectChangeDataObj {

    @XmlElement(nillable = true)
    protected List<StreamIdDataObj> affectedStreams;
    @XmlElement(nillable = true)
    protected List<FieldChangeDataObj> attributeChanges;
    protected String comments;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateModified;
    protected String userModified;

    /**
     * Gets the value of the affectedStreams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedStreams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedStreams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreamIdDataObj }
     * 
     * 
     */
    public List<StreamIdDataObj> getAffectedStreams() {
        if (affectedStreams == null) {
            affectedStreams = new ArrayList<StreamIdDataObj>();
        }
        return this.affectedStreams;
    }

    /**
     * Gets the value of the attributeChanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeChanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeChanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldChangeDataObj }
     * 
     * 
     */
    public List<FieldChangeDataObj> getAttributeChanges() {
        if (attributeChanges == null) {
            attributeChanges = new ArrayList<FieldChangeDataObj>();
        }
        return this.attributeChanges;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the dateModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateModified() {
        return dateModified;
    }

    /**
     * Sets the value of the dateModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateModified(XMLGregorianCalendar value) {
        this.dateModified = value;
    }

    /**
     * Gets the value of the userModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserModified() {
        return userModified;
    }

    /**
     * Sets the value of the userModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserModified(String value) {
        this.userModified = value;
    }

}
