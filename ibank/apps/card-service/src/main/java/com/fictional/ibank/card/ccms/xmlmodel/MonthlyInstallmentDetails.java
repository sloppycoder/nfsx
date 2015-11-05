
package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonthlyInstallmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonthlyInstallmentDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="installmentTenor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyInstallmentDetails", propOrder = {
    "installmentAmount",
    "installmentTenor",
    "statementDate"
})
public class MonthlyInstallmentDetails {

    @XmlElementRef(name = "installmentAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> installmentAmount;
    @XmlElementRef(name = "installmentTenor", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> installmentTenor;
    @XmlElementRef(name = "statementDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statementDate;

    /**
     * Gets the value of the installmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstallmentAmount() {
        return installmentAmount;
    }

    /**
     * Sets the value of the installmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstallmentAmount(JAXBElement<String> value) {
        this.installmentAmount = value;
    }

    /**
     * Gets the value of the installmentTenor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstallmentTenor() {
        return installmentTenor;
    }

    /**
     * Sets the value of the installmentTenor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstallmentTenor(JAXBElement<String> value) {
        this.installmentTenor = value;
    }

    /**
     * Gets the value of the statementDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatementDate() {
        return statementDate;
    }

    /**
     * Sets the value of the statementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatementDate(JAXBElement<String> value) {
        this.statementDate = value;
    }

}
