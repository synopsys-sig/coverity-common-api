
package com.synopsys.integration.coverity.api.ws.defect;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for defectStateSpecDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="defectStateSpecDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defectStateAttributeValues" type="{http://ws.coverity.com/v9}defectStateAttributeValueDataObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defectStateSpecDataObj", propOrder = {
    "defectStateAttributeValues"
})
public class DefectStateSpecDataObj {

    @XmlElement(nillable = true)
    protected List<DefectStateAttributeValueDataObj> defectStateAttributeValues;

    /**
     * Gets the value of the defectStateAttributeValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defectStateAttributeValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefectStateAttributeValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefectStateAttributeValueDataObj }
     * 
     * 
     */
    public List<DefectStateAttributeValueDataObj> getDefectStateAttributeValues() {
        if (defectStateAttributeValues == null) {
            defectStateAttributeValues = new ArrayList<DefectStateAttributeValueDataObj>();
        }
        return this.defectStateAttributeValues;
    }

}
