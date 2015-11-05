
package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAccessDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAccessDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priorityPassNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldPriorityPassNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAccessDetails", propOrder = {
    "priorityPassNo",
    "expiryDate",
    "oldPriorityPassNo"
})
public class CardAccessDetails {

    @XmlElementRef(name = "priorityPassNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priorityPassNo;
    @XmlElementRef(name = "expiryDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expiryDate;
    @XmlElementRef(name = "oldPriorityPassNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oldPriorityPassNo;

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

}
