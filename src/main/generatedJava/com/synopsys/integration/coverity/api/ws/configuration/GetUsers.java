
package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUsers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filterSpec" type="{http://ws.coverity.com/v9}userFilterSpecDataObj" minOccurs="0"/&gt;
 *         &lt;element name="pageSpec" type="{http://ws.coverity.com/v9}pageSpecDataObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUsers", propOrder = {
    "filterSpec",
    "pageSpec"
})
public class GetUsers {

    protected UserFilterSpecDataObj filterSpec;
    protected PageSpecDataObj pageSpec;

    /**
     * Gets the value of the filterSpec property.
     * 
     * @return
     *     possible object is
     *     {@link UserFilterSpecDataObj }
     *     
     */
    public UserFilterSpecDataObj getFilterSpec() {
        return filterSpec;
    }

    /**
     * Sets the value of the filterSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFilterSpecDataObj }
     *     
     */
    public void setFilterSpec(UserFilterSpecDataObj value) {
        this.filterSpec = value;
    }

    /**
     * Gets the value of the pageSpec property.
     * 
     * @return
     *     possible object is
     *     {@link PageSpecDataObj }
     *     
     */
    public PageSpecDataObj getPageSpec() {
        return pageSpec;
    }

    /**
     * Sets the value of the pageSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageSpecDataObj }
     *     
     */
    public void setPageSpec(PageSpecDataObj value) {
        this.pageSpec = value;
    }

}
