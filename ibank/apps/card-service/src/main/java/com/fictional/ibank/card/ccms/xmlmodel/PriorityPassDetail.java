
package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriorityPassDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriorityPassDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priorityPassHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priorityPassNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastMaintainedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldPriorityPassNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noofTimesCardIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loungeVisitOwn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loungeVisitGuest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorityPassDetail", propOrder = {
    "priorityPassHolderName",
    "priorityPassNo",
    "expiryDate",
    "lastMaintainedDate",
    "oldPriorityPassNo",
    "noofTimesCardIssued",
    "creditCardNo",
    "loungeVisitOwn",
    "loungeVisitGuest"
})
public class PriorityPassDetail {

    @XmlElementRef(name = "priorityPassHolderName", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priorityPassHolderName;
    @XmlElementRef(name = "priorityPassNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priorityPassNo;
    @XmlElementRef(name = "expiryDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expiryDate;
    @XmlElementRef(name = "lastMaintainedDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastMaintainedDate;
    @XmlElementRef(name = "oldPriorityPassNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oldPriorityPassNo;
    @XmlElementRef(name = "noofTimesCardIssued", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noofTimesCardIssued;
    @XmlElementRef(name = "creditCardNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditCardNo;
    @XmlElementRef(name = "loungeVisitOwn", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loungeVisitOwn;
    @XmlElementRef(name = "loungeVisitGuest", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loungeVisitGuest;

    /**
     * Gets the value of the priorityPassHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriorityPassHolderName() {
        return priorityPassHolderName;
    }

    /**
     * Sets the value of the priorityPassHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriorityPassHolderName(JAXBElement<String> value) {
        this.priorityPassHolderName = value;
    }

    /**
     * Gets the value of the priorityPassNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriorityPassNo() {
        return priorityPassNo;
    }

    /**
     * Sets the value of the priorityPassNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriorityPassNo(JAXBElement<String> value) {
        this.priorityPassNo = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpiryDate(JAXBElement<String> value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the lastMaintainedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastMaintainedDate() {
        return lastMaintainedDate;
    }

    /**
     * Sets the value of the lastMaintainedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastMaintainedDate(JAXBElement<String> value) {
        this.lastMaintainedDate = value;
    }

    /**
     * Gets the value of the oldPriorityPassNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOldPriorityPassNo() {
        return oldPriorityPassNo;
    }

    /**
     * Sets the value of the oldPriorityPassNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOldPriorityPassNo(JAXBElement<String> value) {
        this.oldPriorityPassNo = value;
    }

    /**
     * Gets the value of the noofTimesCardIssued property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoofTimesCardIssued() {
        return noofTimesCardIssued;
    }

    /**
     * Sets the value of the noofTimesCardIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoofTimesCardIssued(JAXBElement<String> value) {
        this.noofTimesCardIssued = value;
    }

    /**
     * Gets the value of the creditCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditCardNo() {
        return creditCardNo;
    }

    /**
     * Sets the value of the creditCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditCardNo(JAXBElement<String> value) {
        this.creditCardNo = value;
    }

    /**
     * Gets the value of the loungeVisitOwn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoungeVisitOwn() {
        return loungeVisitOwn;
    }

    /**
     * Sets the value of the loungeVisitOwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoungeVisitOwn(JAXBElement<String> value) {
        this.loungeVisitOwn = value;
    }

    /**
     * Gets the value of the loungeVisitGuest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoungeVisitGuest() {
        return loungeVisitGuest;
    }

    /**
     * Sets the value of the loungeVisitGuest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoungeVisitGuest(JAXBElement<String> value) {
        this.loungeVisitGuest = value;
    }

}
