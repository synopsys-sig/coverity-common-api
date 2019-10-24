
package com.synopsys.integration.coverity.api.ws.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createStreamInProject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createStreamInProject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="projectId" type="{http://ws.coverity.com/v9}projectIdDataObj" minOccurs="0"/&gt;
 *         &lt;element name="streamSpec" type="{http://ws.coverity.com/v9}streamSpecDataObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createStreamInProject", propOrder = {
    "projectId",
    "streamSpec"
})
public class CreateStreamInProject {

    protected ProjectIdDataObj projectId;
    protected StreamSpecDataObj streamSpec;

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdDataObj }
     *     
     */
    public ProjectIdDataObj getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdDataObj }
     *     
     */
    public void setProjectId(ProjectIdDataObj value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the streamSpec property.
     * 
     * @return
     *     possible object is
     *     {@link StreamSpecDataObj }
     *     
     */
    public StreamSpecDataObj getStreamSpec() {
        return streamSpec;
    }

    /**
     * Sets the value of the streamSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamSpecDataObj }
     *     
     */
    public void setStreamSpec(StreamSpecDataObj value) {
        this.streamSpec = value;
    }

}
