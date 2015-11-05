
package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmbossingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmbossingDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="noOfCards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="embossingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noRequested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supportOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardFeature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfCardsIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfCardsReturned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rqstCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="previousAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pinRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmbossingDetails", propOrder = {
    "noOfCards",
    "embossingName",
    "cardAction",
    "noRequested",
    "supportOption",
    "cardFeature",
    "noOfCardsIssued",
    "noOfCardsReturned",
    "rqstCardType",
    "previousAction",
    "pinRecord"
})
public class EmbossingDetails {

    @XmlElementRef(name = "noOfCards", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfCards;
    @XmlElementRef(name = "embossingName", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> embossingName;
    @XmlElementRef(name = "cardAction", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardAction;
    @XmlElementRef(name = "noRequested", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noRequested;
    @XmlElementRef(name = "supportOption", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supportOption;
    @XmlElementRef(name = "cardFeature", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardFeature;
    @XmlElementRef(name = "noOfCardsIssued", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfCardsIssued;
    @XmlElementRef(name = "noOfCardsReturned", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfCardsReturned;
    @XmlElementRef(name = "rqstCardType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rqstCardType;
    @XmlElementRef(name = "previousAction", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousAction;
    @XmlElementRef(name = "pinRecord", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pinRecord;

    /**
     * Gets the value of the noOfCards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfCards() {
        return noOfCards;
    }

    /**
     * Sets the value of the noOfCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfCards(JAXBElement<String> value) {
        this.noOfCards = value;
    }

    /**
     * Gets the value of the embossingName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmbossingName() {
        return embossingName;
    }

    /**
     * Sets the value of the embossingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmbossingName(JAXBElement<String> value) {
        this.embossingName = value;
    }

    /**
     * Gets the value of the cardAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardAction() {
        return cardAction;
    }

    /**
     * Sets the value of the cardAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardAction(JAXBElement<String> value) {
        this.cardAction = value;
    }

    /**
     * Gets the value of the noRequested property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoRequested() {
        return noRequested;
    }

    /**
     * Sets the value of the noRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoRequested(JAXBElement<String> value) {
        this.noRequested = value;
    }

    /**
     * Gets the value of the supportOption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupportOption() {
        return supportOption;
    }

    /**
     * Sets the value of the supportOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupportOption(JAXBElement<String> value) {
        this.supportOption = value;
    }

    /**
     * Gets the value of the cardFeature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardFeature() {
        return cardFeature;
    }

    /**
     * Sets the value of the cardFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardFeature(JAXBElement<String> value) {
        this.cardFeature = value;
    }

    /**
     * Gets the value of the noOfCardsIssued property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfCardsIssued() {
        return noOfCardsIssued;
    }

    /**
     * Sets the value of the noOfCardsIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfCardsIssued(JAXBElement<String> value) {
        this.noOfCardsIssued = value;
    }

    /**
     * Gets the value of the noOfCardsReturned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfCardsReturned() {
        return noOfCardsReturned;
    }

    /**
     * Sets the value of the noOfCardsReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfCardsReturned(JAXBElement<String> value) {
        this.noOfCardsReturned = value;
    }

    /**
     * Gets the value of the rqstCardType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRqstCardType() {
        return rqstCardType;
    }

    /**
     * Sets the value of the rqstCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRqstCardType(JAXBElement<String> value) {
        this.rqstCardType = value;
    }

    /**
     * Gets the value of the previousAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousAction() {
        return previousAction;
    }

    /**
     * Sets the value of the previousAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousAction(JAXBElement<String> value) {
        this.previousAction = value;
    }

    /**
     * Gets the value of the pinRecord property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinRecord() {
        return pinRecord;
    }

    /**
     * Sets the value of the pinRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinRecord(JAXBElement<String> value) {
        this.pinRecord = value;
    }

}
