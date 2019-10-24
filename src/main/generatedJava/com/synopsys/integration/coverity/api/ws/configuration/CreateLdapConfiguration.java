
package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createLdapConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createLdapConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ldapConfigurationSpec" type="{http://ws.coverity.com/v9}ldapConfigurationSpecDataObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createLdapConfiguration", propOrder = {
    "ldapConfigurationSpec"
})
public class CreateLdapConfiguration {

    protected LdapConfigurationSpecDataObj ldapConfigurationSpec;

    /**
     * Gets the value of the ldapConfigurationSpec property.
     * 
     * @return
     *     possible object is
     *     {@link LdapConfigurationSpecDataObj }
     *     
     */
    public LdapConfigurationSpecDataObj getLdapConfigurationSpec() {
        return ldapConfigurationSpec;
    }

    /**
     * Sets the value of the ldapConfigurationSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapConfigurationSpecDataObj }
     *     
     */
    public void setLdapConfigurationSpec(LdapConfigurationSpecDataObj value) {
        this.ldapConfigurationSpec = value;
    }

}
