
package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateSnapshotInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateSnapshotInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="snapshotId" type="{http://ws.coverity.com/v9}snapshotIdDataObj" minOccurs="0"/&gt;
 *         &lt;element name="snapshotData" type="{http://ws.coverity.com/v9}snapshotInfoDataObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateSnapshotInfo", propOrder = {
    "snapshotId",
    "snapshotData"
})
public class UpdateSnapshotInfo {

    protected SnapshotIdDataObj snapshotId;
    protected SnapshotInfoDataObj snapshotData;

    /**
     * Gets the value of the snapshotId property.
     * 
     * @return
     *     possible object is
     *     {@link SnapshotIdDataObj }
     *     
     */
    public SnapshotIdDataObj getSnapshotId() {
        return snapshotId;
    }

    /**
     * Sets the value of the snapshotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapshotIdDataObj }
     *     
     */
    public void setSnapshotId(SnapshotIdDataObj value) {
        this.snapshotId = value;
    }

    /**
     * Gets the value of the snapshotData property.
     * 
     * @return
     *     possible object is
     *     {@link SnapshotInfoDataObj }
     *     
     */
    public SnapshotInfoDataObj getSnapshotData() {
        return snapshotData;
    }

    /**
     * Sets the value of the snapshotData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapshotInfoDataObj }
     *     
     */
    public void setSnapshotData(SnapshotInfoDataObj value) {
        this.snapshotData = value;
    }

}
