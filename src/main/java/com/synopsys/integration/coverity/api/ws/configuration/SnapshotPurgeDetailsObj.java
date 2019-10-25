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
 * <p>Java class for snapshotPurgeDetailsObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="snapshotPurgeDetailsObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="daysBeforeSkeletonization" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fridayEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="minSnapshotsToKeep" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mondayEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="saturdayEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sundayEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="thursdayEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="timeOfDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tuesdayEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="wednesdayEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "snapshotPurgeDetailsObj", propOrder = {
    "daysBeforeSkeletonization",
    "fridayEnabled",
    "minSnapshotsToKeep",
    "mondayEnabled",
    "saturdayEnabled",
    "sundayEnabled",
    "thursdayEnabled",
    "timeOfDay",
    "tuesdayEnabled",
    "wednesdayEnabled"
})
public class SnapshotPurgeDetailsObj {

    protected int daysBeforeSkeletonization;
    protected boolean fridayEnabled;
    protected int minSnapshotsToKeep;
    protected boolean mondayEnabled;
    protected boolean saturdayEnabled;
    protected boolean sundayEnabled;
    protected boolean thursdayEnabled;
    protected String timeOfDay;
    protected boolean tuesdayEnabled;
    protected boolean wednesdayEnabled;

    /**
     * Gets the value of the daysBeforeSkeletonization property.
     * 
     */
    public int getDaysBeforeSkeletonization() {
        return daysBeforeSkeletonization;
    }

    /**
     * Sets the value of the daysBeforeSkeletonization property.
     * 
     */
    public void setDaysBeforeSkeletonization(int value) {
        this.daysBeforeSkeletonization = value;
    }

    /**
     * Gets the value of the fridayEnabled property.
     * 
     */
    public boolean isFridayEnabled() {
        return fridayEnabled;
    }

    /**
     * Sets the value of the fridayEnabled property.
     * 
     */
    public void setFridayEnabled(boolean value) {
        this.fridayEnabled = value;
    }

    /**
     * Gets the value of the minSnapshotsToKeep property.
     * 
     */
    public int getMinSnapshotsToKeep() {
        return minSnapshotsToKeep;
    }

    /**
     * Sets the value of the minSnapshotsToKeep property.
     * 
     */
    public void setMinSnapshotsToKeep(int value) {
        this.minSnapshotsToKeep = value;
    }

    /**
     * Gets the value of the mondayEnabled property.
     * 
     */
    public boolean isMondayEnabled() {
        return mondayEnabled;
    }

    /**
     * Sets the value of the mondayEnabled property.
     * 
     */
    public void setMondayEnabled(boolean value) {
        this.mondayEnabled = value;
    }

    /**
     * Gets the value of the saturdayEnabled property.
     * 
     */
    public boolean isSaturdayEnabled() {
        return saturdayEnabled;
    }

    /**
     * Sets the value of the saturdayEnabled property.
     * 
     */
    public void setSaturdayEnabled(boolean value) {
        this.saturdayEnabled = value;
    }

    /**
     * Gets the value of the sundayEnabled property.
     * 
     */
    public boolean isSundayEnabled() {
        return sundayEnabled;
    }

    /**
     * Sets the value of the sundayEnabled property.
     * 
     */
    public void setSundayEnabled(boolean value) {
        this.sundayEnabled = value;
    }

    /**
     * Gets the value of the thursdayEnabled property.
     * 
     */
    public boolean isThursdayEnabled() {
        return thursdayEnabled;
    }

    /**
     * Sets the value of the thursdayEnabled property.
     * 
     */
    public void setThursdayEnabled(boolean value) {
        this.thursdayEnabled = value;
    }

    /**
     * Gets the value of the timeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOfDay() {
        return timeOfDay;
    }

    /**
     * Sets the value of the timeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfDay(String value) {
        this.timeOfDay = value;
    }

    /**
     * Gets the value of the tuesdayEnabled property.
     * 
     */
    public boolean isTuesdayEnabled() {
        return tuesdayEnabled;
    }

    /**
     * Sets the value of the tuesdayEnabled property.
     * 
     */
    public void setTuesdayEnabled(boolean value) {
        this.tuesdayEnabled = value;
    }

    /**
     * Gets the value of the wednesdayEnabled property.
     * 
     */
    public boolean isWednesdayEnabled() {
        return wednesdayEnabled;
    }

    /**
     * Sets the value of the wednesdayEnabled property.
     * 
     */
    public void setWednesdayEnabled(boolean value) {
        this.wednesdayEnabled = value;
    }

}
