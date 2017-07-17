//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.17 at 02:23:34 PM BRT 
//


package com.viglet.shiohara.wem.v8510.body;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *   ---------------------------------------------------------------------------
 *   - Name:  CT_relation
 *   - Desc:  Defines content type relation to attribute definitions.
 *   ---------------------------------------------------------------------------
 *   			
 * 
 * <p>Java class for CT_relation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_relation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parentRelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="beanPropertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suppressBeanProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attributeDefinition" type="{http://www.vignette.com/xmlschemas/importexport}CT_attributeDefinitionData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://www.vignette.com/xmlschemas/importexport}CT_reference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.vignette.com/xmlschemas/importexport}AG_appSvcsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_relation", propOrder = {
    "parentRelation",
    "name",
    "displayName",
    "minimum",
    "maximum",
    "beanPropertyName",
    "suppressBeanProperty",
    "attributeDefinition",
    "reference"
})
public class CTRelation {

    protected String parentRelation;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String displayName;
    @XmlElement(required = true)
    protected BigInteger minimum;
    @XmlElement(required = true)
    protected BigInteger maximum;
    protected String beanPropertyName;
    protected Boolean suppressBeanProperty;
    protected List<CTAttributeDefinitionData> attributeDefinition;
    protected List<CTReference> reference;
    @XmlAttribute(name = "mgmtId")
    protected String mgmtId;

    /**
     * Gets the value of the parentRelation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentRelation() {
        return parentRelation;
    }

    /**
     * Sets the value of the parentRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentRelation(String value) {
        this.parentRelation = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the minimum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimum(BigInteger value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximum(BigInteger value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the beanPropertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeanPropertyName() {
        return beanPropertyName;
    }

    /**
     * Sets the value of the beanPropertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeanPropertyName(String value) {
        this.beanPropertyName = value;
    }

    /**
     * Gets the value of the suppressBeanProperty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressBeanProperty() {
        return suppressBeanProperty;
    }

    /**
     * Sets the value of the suppressBeanProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressBeanProperty(Boolean value) {
        this.suppressBeanProperty = value;
    }

    /**
     * Gets the value of the attributeDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTAttributeDefinitionData }
     * 
     * 
     */
    public List<CTAttributeDefinitionData> getAttributeDefinition() {
        if (attributeDefinition == null) {
            attributeDefinition = new ArrayList<CTAttributeDefinitionData>();
        }
        return this.attributeDefinition;
    }

    /**
     * Gets the value of the reference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTReference }
     * 
     * 
     */
    public List<CTReference> getReference() {
        if (reference == null) {
            reference = new ArrayList<CTReference>();
        }
        return this.reference;
    }

    /**
     * Gets the value of the mgmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMgmtId() {
        return mgmtId;
    }

    /**
     * Sets the value of the mgmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMgmtId(String value) {
        this.mgmtId = value;
    }

}
