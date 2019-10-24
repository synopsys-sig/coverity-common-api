
package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for copyStreamResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="copyStreamResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://ws.coverity.com/v9}streamDataObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copyStreamResponse", propOrder = {
    "_return"
})
public class CopyStreamResponse {

    @XmlElement(name = "return")
    protected StreamDataObj _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link StreamDataObj }
     *     
     */
    public StreamDataObj getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamDataObj }
     *     
     */
    public void setReturn(StreamDataObj value) {
        this._return = value;
    }

}
