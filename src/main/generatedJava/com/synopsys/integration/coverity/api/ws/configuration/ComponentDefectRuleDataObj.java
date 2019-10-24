
package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for componentDefectRuleDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="componentDefectRuleDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="componentId" type="{http://ws.coverity.com/v9}componentIdDataObj"/&gt;
 *         &lt;element name="defaultOwner" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "componentDefectRuleDataObj", propOrder = {
    "componentId",
    "defaultOwner"
})
public class ComponentDefectRuleDataObj {

    @XmlElement(required = true)
    protected ComponentIdDataObj componentId;
    @XmlElement(required = true)
    protected String defaultOwner;

    /**
     * Gets the value of the componentId property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentIdDataObj }
     *     
     */
    public ComponentIdDataObj getComponentId() {
        return componentId;
    }

    /**
     * Sets the value of the componentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentIdDataObj }
     *     
     */
    public void setComponentId(ComponentIdDataObj value) {
        this.componentId = value;
    }

    /**
     * Gets the value of the defaultOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultOwner() {
        return defaultOwner;
    }

    /**
     * Sets the value of the defaultOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultOwner(String value) {
        this.defaultOwner = value;
    }

}
