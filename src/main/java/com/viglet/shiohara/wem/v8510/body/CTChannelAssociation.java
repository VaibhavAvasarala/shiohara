//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.17 at 02:23:34 PM BRT 
//


package com.viglet.shiohara.wem.v8510.body;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *   ---------------------------------------------------------------------------
 *   - Name:  CT_channelAssociation
 *   - Desc:  Defines a content association to a channel.
 *   -        This tag can appear in <contentInstance> and <staticFile>
 *   -        XML fragments.  The representation of relationships
 *   -        between a Channel and content appearing in either object
 *   -        uses the same construct.
 *   -        Appearing within a <contentInstance> or <staticFile>, each
 *   -        <referencId> tag within the <contentAssociation> element contains
 *   -        the AppSvcs ID to one or more channels.
 *   ---------------------------------------------------------------------------
 * 			
 * 
 * <p>Java class for CT_channelAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_channelAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceId" type="{http://www.vignette.com/xmlschemas/importexport}CT_id" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_channelAssociation", propOrder = {
    "referenceId"
})
public class CTChannelAssociation {

    @XmlElement(required = true)
    protected List<CTId> referenceId;

    /**
     * Gets the value of the referenceId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTId }
     * 
     * 
     */
    public List<CTId> getReferenceId() {
        if (referenceId == null) {
            referenceId = new ArrayList<CTId>();
        }
        return this.referenceId;
    }

}
