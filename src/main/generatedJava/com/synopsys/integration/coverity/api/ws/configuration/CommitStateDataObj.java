
package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commitStateDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commitStateDataObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentCommitCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isAcceptingNewCommits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commitStateDataObj", propOrder = {
    "currentCommitCount",
    "isAcceptingNewCommits"
})
public class CommitStateDataObj {

    protected Integer currentCommitCount;
    protected Boolean isAcceptingNewCommits;

    /**
     * Gets the value of the currentCommitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentCommitCount() {
        return currentCommitCount;
    }

    /**
     * Sets the value of the currentCommitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentCommitCount(Integer value) {
        this.currentCommitCount = value;
    }

    /**
     * Gets the value of the isAcceptingNewCommits property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAcceptingNewCommits() {
        return isAcceptingNewCommits;
    }

    /**
     * Sets the value of the isAcceptingNewCommits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAcceptingNewCommits(Boolean value) {
        this.isAcceptingNewCommits = value;
    }

}
