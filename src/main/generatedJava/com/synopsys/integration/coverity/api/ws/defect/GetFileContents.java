
package com.synopsys.integration.coverity.api.ws.defect;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFileContents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFileContents"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="streamId" type="{http://ws.coverity.com/v9}streamIdDataObj" minOccurs="0"/&gt;
 *         &lt;element name="fileId" type="{http://ws.coverity.com/v9}fileIdDataObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFileContents", propOrder = {
    "streamId",
    "fileId"
})
public class GetFileContents {

    protected StreamIdDataObj streamId;
    protected FileIdDataObj fileId;

    /**
     * Gets the value of the streamId property.
     * 
     * @return
     *     possible object is
     *     {@link StreamIdDataObj }
     *     
     */
    public StreamIdDataObj getStreamId() {
        return streamId;
    }

    /**
     * Sets the value of the streamId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamIdDataObj }
     *     
     */
    public void setStreamId(StreamIdDataObj value) {
        this.streamId = value;
    }

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link FileIdDataObj }
     *     
     */
    public FileIdDataObj getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileIdDataObj }
     *     
     */
    public void setFileId(FileIdDataObj value) {
        this.fileId = value;
    }

}
