
package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setAcceptingNewCommits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setAcceptingNewCommits"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acceptNewCommits" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setAcceptingNewCommits", propOrder = {
    "acceptNewCommits"
})
public class SetAcceptingNewCommits {

    protected boolean acceptNewCommits;

    /**
     * Gets the value of the acceptNewCommits property.
     * 
     */
    public boolean isAcceptNewCommits() {
        return acceptNewCommits;
    }

    /**
     * Sets the value of the acceptNewCommits property.
     * 
     */
    public void setAcceptNewCommits(boolean value) {
        this.acceptNewCommits = value;
    }

}
