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
package com.synopsys.integration.coverity.api.rest;

public class ViewRow {
    private Long cid;
    private String displayType;
    private String displayImpact;
    private String status;
    private String firstDetected;
    private String owner;
    private String classification;
    private String severity;
    private String action;
    private String displayComponent;
    private String displayCategory;
    private String displayFile;
    private String displayFunction;

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(final String displayType) {
        this.displayType = displayType;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(final Long cid) {
        this.cid = cid;
    }

    public String getDisplayImpact() {
        return displayImpact;
    }

    public void setDisplayImpact(final String displayImpact) {
        this.displayImpact = displayImpact;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getFirstDetected() {
        return firstDetected;
    }

    public void setFirstDetected(final String firstDetected) {
        this.firstDetected = firstDetected;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(final String owner) {
        this.owner = owner;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(final String classification) {
        this.classification = classification;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(final String severity) {
        this.severity = severity;
    }

    public String getAction() {
        return action;
    }

    public void setAction(final String action) {
        this.action = action;
    }

    public String getDisplayComponent() {
        return displayComponent;
    }

    public void setDisplayComponent(final String displayComponent) {
        this.displayComponent = displayComponent;
    }

    public String getDisplayCategory() {
        return displayCategory;
    }

    public void setDisplayCategory(final String displayCategory) {
        this.displayCategory = displayCategory;
    }

    public String getDisplayFile() {
        return displayFile;
    }

    public void setDisplayFile(final String displayFile) {
        this.displayFile = displayFile;
    }

    public String getDisplayFunction() {
        return displayFunction;
    }

    public void setDisplayFunction(final String displayFunction) {
        this.displayFunction = displayFunction;
    }
}
