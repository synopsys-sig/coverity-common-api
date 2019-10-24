
package com.synopsys.integration.coverity.api.ws.defect;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fileIdDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fileIdDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contentsMD5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="filePathname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fileIdDataObj", propOrder = {
    "contentsMD5",
    "filePathname"
})
public class FileIdDataObj {

    @XmlElement(required = true)
    protected String contentsMD5;
    @XmlElement(required = true)
    protected String filePathname;

    /**
     * Gets the value of the contentsMD5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentsMD5() {
        return contentsMD5;
    }

    /**
     * Sets the value of the contentsMD5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentsMD5(String value) {
        this.contentsMD5 = value;
    }

    /**
     * Gets the value of the filePathname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePathname() {
        return filePathname;
    }

    /**
     * Sets the value of the filePathname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePathname(String value) {
        this.filePathname = value;
    }

}
