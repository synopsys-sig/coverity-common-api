
package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setSnapshotPurgeDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setSnapshotPurgeDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="purgeDetailsSpec" type="{http://ws.coverity.com/v9}snapshotPurgeDetailsObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSnapshotPurgeDetails", propOrder = {
    "purgeDetailsSpec"
})
public class SetSnapshotPurgeDetails {

    protected SnapshotPurgeDetailsObj purgeDetailsSpec;

    /**
     * Gets the value of the purgeDetailsSpec property.
     * 
     * @return
     *     possible object is
     *     {@link SnapshotPurgeDetailsObj }
     *     
     */
    public SnapshotPurgeDetailsObj getPurgeDetailsSpec() {
        return purgeDetailsSpec;
    }

    /**
     * Sets the value of the purgeDetailsSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapshotPurgeDetailsObj }
     *     
     */
    public void setPurgeDetailsSpec(SnapshotPurgeDetailsObj value) {
        this.purgeDetailsSpec = value;
    }

}
