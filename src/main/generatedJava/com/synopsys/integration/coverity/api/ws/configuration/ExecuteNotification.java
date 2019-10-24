
package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="viewname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeNotification", propOrder = {
    "viewname"
})
public class ExecuteNotification {

    protected String viewname;

    /**
     * Gets the value of the viewname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewname() {
        return viewname;
    }

    /**
     * Sets the value of the viewname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewname(String value) {
        this.viewname = value;
    }

}
