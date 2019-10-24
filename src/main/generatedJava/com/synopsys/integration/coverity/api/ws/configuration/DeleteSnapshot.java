
package com.synopsys.integration.coverity.api.ws.configuration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteSnapshot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteSnapshot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="snapshotId" type="{http://ws.coverity.com/v9}snapshotIdDataObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteSnapshot", propOrder = {
    "snapshotId"
})
public class DeleteSnapshot {

    protected List<SnapshotIdDataObj> snapshotId;

    /**
     * Gets the value of the snapshotId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snapshotId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnapshotId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SnapshotIdDataObj }
     * 
     * 
     */
    public List<SnapshotIdDataObj> getSnapshotId() {
        if (snapshotId == null) {
            snapshotId = new ArrayList<SnapshotIdDataObj>();
        }
        return this.snapshotId;
    }

}
