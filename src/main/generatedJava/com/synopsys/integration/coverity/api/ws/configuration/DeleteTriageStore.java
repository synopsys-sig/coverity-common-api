
package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteTriageStore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteTriageStore"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="triageStoreId" type="{http://ws.coverity.com/v9}triageStoreIdDataObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteTriageStore", propOrder = {
    "triageStoreId"
})
public class DeleteTriageStore {

    protected TriageStoreIdDataObj triageStoreId;

    /**
     * Gets the value of the triageStoreId property.
     * 
     * @return
     *     possible object is
     *     {@link TriageStoreIdDataObj }
     *     
     */
    public TriageStoreIdDataObj getTriageStoreId() {
        return triageStoreId;
    }

    /**
     * Sets the value of the triageStoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriageStoreIdDataObj }
     *     
     */
    public void setTriageStoreId(TriageStoreIdDataObj value) {
        this.triageStoreId = value;
    }

}
