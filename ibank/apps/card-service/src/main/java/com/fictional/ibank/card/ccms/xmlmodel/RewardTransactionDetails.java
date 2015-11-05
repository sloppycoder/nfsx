
package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RewardTransactionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RewardTransactionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tranType" type="{http://entity.service.common.scb}CodeDesc" minOccurs="0"/&gt;
 *         &lt;element name="currQuarterCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currQuarterPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="previousQuarterCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="previousQuarterPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RewardTransactionDetails", propOrder = {
    "tranType",
    "currQuarterCount",
    "currQuarterPoint",
    "previousQuarterCount",
    "previousQuarterPoint"
})
public class RewardTransactionDetails {

    @XmlElementRef(name = "tranType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDesc> tranType;
    @XmlElementRef(name = "currQuarterCount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currQuarterCount;
    @XmlElementRef(name = "currQuarterPoint", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currQuarterPoint;
    @XmlElementRef(name = "previousQuarterCount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousQuarterCount;
    @XmlElementRef(name = "previousQuarterPoint", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousQuarterPoint;

    /**
     * Gets the value of the tranType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}
     *     
     */
    public JAXBElement<CodeDesc> getTranType() {
        return tranType;
    }

    /**
     * Sets the value of the tranType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}
     *     
     */
    public void setTranType(JAXBElement<CodeDesc> value) {
        this.tranType = value;
    }

    /**
     * Gets the value of the currQuarterCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrQuarterCount() {
        return currQuarterCount;
    }

    /**
     * Sets the value of the currQuarterCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrQuarterCount(JAXBElement<String> value) {
        this.currQuarterCount = value;
    }

    /**
     * Gets the value of the currQuarterPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrQuarterPoint() {
        return currQuarterPoint;
    }

    /**
     * Sets the value of the currQuarterPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrQuarterPoint(JAXBElement<String> value) {
        this.currQuarterPoint = value;
    }

    /**
     * Gets the value of the previousQuarterCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousQuarterCount() {
        return previousQuarterCount;
    }

    /**
     * Sets the value of the previousQuarterCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousQuarterCount(JAXBElement<String> value) {
        this.previousQuarterCount = value;
    }

    /**
     * Gets the value of the previousQuarterPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousQuarterPoint() {
        return previousQuarterPoint;
    }

    /**
     * Sets the value of the previousQuarterPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousQuarterPoint(JAXBElement<String> value) {
        this.previousQuarterPoint = value;
    }

}
