
package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardSummaryDtl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardSummaryDtl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organisationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blockCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardSummaryDtl", propOrder = {
    "organisationNo",
    "custNo",
    "custType",
    "cardNo",
    "blockCode"
})
public class CardSummaryDtl {

    @XmlElementRef(name = "organisationNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organisationNo;
    @XmlElementRef(name = "custNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custNo;
    @XmlElementRef(name = "custType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custType;
    @XmlElementRef(name = "cardNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardNo;
    @XmlElementRef(name = "blockCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> blockCode;

    /**
     * Gets the value of the organisationNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganisationNo() {
        return organisationNo;
    }

    /**
     * Sets the value of the organisationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganisationNo(JAXBElement<String> value) {
        this.organisationNo = value;
    }

    /**
     * Gets the value of the custNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustNo() {
        return custNo;
    }

    /**
     * Sets the value of the custNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustNo(JAXBElement<String> value) {
        this.custNo = value;
    }

    /**
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustType(JAXBElement<String> value) {
        this.custType = value;
    }

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardNo(JAXBElement<String> value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the blockCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlockCode() {
        return blockCode;
    }

    /**
     * Sets the value of the blockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlockCode(JAXBElement<String> value) {
        this.blockCode = value;
    }

}
