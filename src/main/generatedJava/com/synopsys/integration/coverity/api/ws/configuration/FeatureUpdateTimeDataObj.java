
package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for featureUpdateTimeDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="featureUpdateTimeDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="featureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "featureUpdateTimeDataObj", propOrder = {
    "featureName",
    "lastUpdateDate"
})
public class FeatureUpdateTimeDataObj {

    protected String featureName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;

    /**
     * Gets the value of the featureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureName() {
        return featureName;
    }

    /**
     * Sets the value of the featureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureName(String value) {
        this.featureName = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

}
