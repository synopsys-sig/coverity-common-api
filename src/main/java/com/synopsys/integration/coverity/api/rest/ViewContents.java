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
package com.synopsys.integration.coverity.api.rest;

import java.util.List;

public class ViewContents {
    private Long totalRows;
    private Long rowsOffset;
    private List<ViewColumn> columns;
    private List<ViewRow> rows;

    public Long getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(final Long totalRows) {
        this.totalRows = totalRows;
    }

    public Long getRowsOffset() {
        return rowsOffset;
    }

    public void setRowsOffset(final Long rowsOffset) {
        this.rowsOffset = rowsOffset;
    }

    public List<ViewColumn> getColumns() {
        return columns;
    }

    public void setColumns(final List<ViewColumn> columns) {
        this.columns = columns;
    }

    public List<ViewRow> getRows() {
        return rows;
    }

    public void setRows(final List<ViewRow> rows) {
        this.rows = rows;
    }
}
