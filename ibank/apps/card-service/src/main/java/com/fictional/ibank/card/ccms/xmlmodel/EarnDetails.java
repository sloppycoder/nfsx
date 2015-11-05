
package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EarnDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EarnDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prefMerchant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="capReachDtOverall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="capReachDtatPrefMerchant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointEarnedToday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarnDetails", propOrder = {
    "prefMerchant",
    "capReachDtOverall",
    "capReachDtatPrefMerchant",
    "pointEarnedToday"
})
public class EarnDetails {

    @XmlElementRef(name = "prefMerchant", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prefMerchant;
    @XmlElementRef(name = "capReachDtOverall", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> capReachDtOverall;
    @XmlElementRef(name = "capReachDtatPrefMerchant", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> capReachDtatPrefMerchant;
    @XmlElementRef(name = "pointEarnedToday", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointEarnedToday;

    /**
     * Gets the value of the prefMerchant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefMerchant() {
        return prefMerchant;
    }

    /**
     * Sets the value of the prefMerchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefMerchant(JAXBElement<String> value) {
        this.prefMerchant = value;
    }

    /**
     * Gets the value of the capReachDtOverall property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCapReachDtOverall() {
        return capReachDtOverall;
    }

    /**
     * Sets the value of the capReachDtOverall property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCapReachDtOverall(JAXBElement<String> value) {
        this.capReachDtOverall = value;
    }

    /**
     * Gets the value of the capReachDtatPrefMerchant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCapReachDtatPrefMerchant() {
        return capReachDtatPrefMerchant;
    }

    /**
     * Sets the value of the capReachDtatPrefMerchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCapReachDtatPrefMerchant(JAXBElement<String> value) {
        this.capReachDtatPrefMerchant = value;
    }

    /**
     * Gets the value of the pointEarnedToday property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointEarnedToday() {
        return pointEarnedToday;
    }

    /**
     * Sets the value of the pointEarnedToday property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointEarnedToday(JAXBElement<String> value) {
        this.pointEarnedToday = value;
    }

}
