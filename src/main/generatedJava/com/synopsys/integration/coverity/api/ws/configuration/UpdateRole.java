
package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateRole"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roleId" type="{http://ws.coverity.com/v9}roleIdDataObj" minOccurs="0"/&gt;
 *         &lt;element name="roleSpec" type="{http://ws.coverity.com/v9}roleSpecDataObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRole", propOrder = {
    "roleId",
    "roleSpec"
})
public class UpdateRole {

    protected RoleIdDataObj roleId;
    protected RoleSpecDataObj roleSpec;

    /**
     * Gets the value of the roleId property.
     * 
     * @return
     *     possible object is
     *     {@link RoleIdDataObj }
     *     
     */
    public RoleIdDataObj getRoleId() {
        return roleId;
    }

    /**
     * Sets the value of the roleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleIdDataObj }
     *     
     */
    public void setRoleId(RoleIdDataObj value) {
        this.roleId = value;
    }

    /**
     * Gets the value of the roleSpec property.
     * 
     * @return
     *     possible object is
     *     {@link RoleSpecDataObj }
     *     
     */
    public RoleSpecDataObj getRoleSpec() {
        return roleSpec;
    }

    /**
     * Sets the value of the roleSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleSpecDataObj }
     *     
     */
    public void setRoleSpec(RoleSpecDataObj value) {
        this.roleSpec = value;
    }

}
