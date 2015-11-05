
package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArmType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArmType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="armCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="armDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArmType", namespace = "http://entity.service.common.scb", propOrder = {
    "armCode",
    "armDesc"
})
public class ArmType {

    @XmlElementRef(name = "armCode", namespace = "http://entity.service.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> armCode;
    @XmlElementRef(name = "armDesc", namespace = "http://entity.service.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> armDesc;

    /**
     * Gets the value of the armCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArmCode() {
        return armCode;
    }

    /**
     * Sets the value of the armCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArmCode(JAXBElement<String> value) {
        this.armCode = value;
    }

    /**
     * Gets the value of the armDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArmDesc() {
        return armDesc;
    }

    /**
     * Sets the value of the armDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArmDesc(JAXBElement<String> value) {
        this.armDesc = value;
    }

}
