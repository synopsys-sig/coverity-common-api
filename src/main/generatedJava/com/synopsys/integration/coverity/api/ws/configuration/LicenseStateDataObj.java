
package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for licenseStateDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="licenseStateDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="desktopAnalysisEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "licenseStateDataObj", propOrder = {
    "desktopAnalysisEnabled"
})
public class LicenseStateDataObj {

    protected boolean desktopAnalysisEnabled;

    /**
     * Gets the value of the desktopAnalysisEnabled property.
     * 
     */
    public boolean isDesktopAnalysisEnabled() {
        return desktopAnalysisEnabled;
    }

    /**
     * Sets the value of the desktopAnalysisEnabled property.
     * 
     */
    public void setDesktopAnalysisEnabled(boolean value) {
        this.desktopAnalysisEnabled = value;
    }

}
