
package com.synopsys.integration.coverity.api.ws.defect;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for defectStateAttributeValueDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="defectStateAttributeValueDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributeDefinitionId" type="{http://ws.coverity.com/v9}attributeDefinitionIdDataObj" minOccurs="0"/&gt;
 *         &lt;element name="attributeValueId" type="{http://ws.coverity.com/v9}attributeValueIdDataObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defectStateAttributeValueDataObj", propOrder = {
    "attributeDefinitionId",
    "attributeValueId"
})
public class DefectStateAttributeValueDataObj {

    protected AttributeDefinitionIdDataObj attributeDefinitionId;
    protected AttributeValueIdDataObj attributeValueId;

    /**
     * Gets the value of the attributeDefinitionId property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeDefinitionIdDataObj }
     *     
     */
    public AttributeDefinitionIdDataObj getAttributeDefinitionId() {
        return attributeDefinitionId;
    }

    /**
     * Sets the value of the attributeDefinitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeDefinitionIdDataObj }
     *     
     */
    public void setAttributeDefinitionId(AttributeDefinitionIdDataObj value) {
        this.attributeDefinitionId = value;
    }

    /**
     * Gets the value of the attributeValueId property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeValueIdDataObj }
     *     
     */
    public AttributeValueIdDataObj getAttributeValueId() {
        return attributeValueId;
    }

    /**
     * Sets the value of the attributeValueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeValueIdDataObj }
     *     
     */
    public void setAttributeValueId(AttributeValueIdDataObj value) {
        this.attributeValueId = value;
    }

}
