
package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanBankInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanBankInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="panBankProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="panBankpoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanBankInfo", propOrder = {
    "panBankProductCode",
    "panBankpoints"
})
public class PanBankInfo {

    @XmlElementRef(name = "panBankProductCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> panBankProductCode;
    @XmlElementRef(name = "panBankpoints", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> panBankpoints;

    /**
     * Gets the value of the panBankProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPanBankProductCode() {
        return panBankProductCode;
    }

    /**
     * Sets the value of the panBankProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPanBankProductCode(JAXBElement<String> value) {
        this.panBankProductCode = value;
    }

    /**
     * Gets the value of the panBankpoints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPanBankpoints() {
        return panBankpoints;
    }

    /**
     * Sets the value of the panBankpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPanBankpoints(JAXBElement<String> value) {
        this.panBankpoints = value;
    }

}
