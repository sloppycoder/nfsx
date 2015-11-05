
package com.fictional.ibank.card.ccms.xmlmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceBucketsHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceBucketsHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashIntUnpaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashServiceChargeUnpaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retailIntUnpaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retailServiceChargeUnpaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retailFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retailInsUnpaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retailMemshipUnpaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retailBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashInstallUnpaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retailInstallUnpaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RPCBlock" type="{http://entity.cards.common.scb}RPCBlock" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceBucketsHistory", propOrder = {
    "date",
    "cashIntUnpaid",
    "cashServiceChargeUnpaid",
    "cashBal",
    "retailIntUnpaid",
    "retailServiceChargeUnpaid",
    "retailFee",
    "retailInsUnpaid",
    "retailMemshipUnpaid",
    "retailBal",
    "cashInstallUnpaid",
    "retailInstallUnpaid",
    "rpcBlock"
})
public class BalanceBucketsHistory {

    @XmlElementRef(name = "date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> date;
    @XmlElementRef(name = "cashIntUnpaid", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashIntUnpaid;
    @XmlElementRef(name = "cashServiceChargeUnpaid", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashServiceChargeUnpaid;
    @XmlElementRef(name = "cashBal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashBal;
    @XmlElementRef(name = "retailIntUnpaid", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailIntUnpaid;
    @XmlElementRef(name = "retailServiceChargeUnpaid", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailServiceChargeUnpaid;
    @XmlElementRef(name = "retailFee", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailFee;
    @XmlElementRef(name = "retailInsUnpaid", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailInsUnpaid;
    @XmlElementRef(name = "retailMemshipUnpaid", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailMemshipUnpaid;
    @XmlElementRef(name = "retailBal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailBal;
    @XmlElementRef(name = "cashInstallUnpaid", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashInstallUnpaid;
    @XmlElementRef(name = "retailInstallUnpaid", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailInstallUnpaid;
    @XmlElement(name = "RPCBlock", nillable = true)
    protected List<RPCBlock> rpcBlock;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDate(JAXBElement<String> value) {
        this.date = value;
    }

    /**
     * Gets the value of the cashIntUnpaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashIntUnpaid() {
        return cashIntUnpaid;
    }

    /**
     * Sets the value of the cashIntUnpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashIntUnpaid(JAXBElement<String> value) {
        this.cashIntUnpaid = value;
    }

    /**
     * Gets the value of the cashServiceChargeUnpaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashServiceChargeUnpaid() {
        return cashServiceChargeUnpaid;
    }

    /**
     * Sets the value of the cashServiceChargeUnpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashServiceChargeUnpaid(JAXBElement<String> value) {
        this.cashServiceChargeUnpaid = value;
    }

    /**
     * Gets the value of the cashBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashBal() {
        return cashBal;
    }

    /**
     * Sets the value of the cashBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashBal(JAXBElement<String> value) {
        this.cashBal = value;
    }

    /**
     * Gets the value of the retailIntUnpaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailIntUnpaid() {
        return retailIntUnpaid;
    }

    /**
     * Sets the value of the retailIntUnpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailIntUnpaid(JAXBElement<String> value) {
        this.retailIntUnpaid = value;
    }

    /**
     * Gets the value of the retailServiceChargeUnpaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailServiceChargeUnpaid() {
        return retailServiceChargeUnpaid;
    }

    /**
     * Sets the value of the retailServiceChargeUnpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailServiceChargeUnpaid(JAXBElement<String> value) {
        this.retailServiceChargeUnpaid = value;
    }

    /**
     * Gets the value of the retailFee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailFee() {
        return retailFee;
    }

    /**
     * Sets the value of the retailFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailFee(JAXBElement<String> value) {
        this.retailFee = value;
    }

    /**
     * Gets the value of the retailInsUnpaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailInsUnpaid() {
        return retailInsUnpaid;
    }

    /**
     * Sets the value of the retailInsUnpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailInsUnpaid(JAXBElement<String> value) {
        this.retailInsUnpaid = value;
    }

    /**
     * Gets the value of the retailMemshipUnpaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailMemshipUnpaid() {
        return retailMemshipUnpaid;
    }

    /**
     * Sets the value of the retailMemshipUnpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailMemshipUnpaid(JAXBElement<String> value) {
        this.retailMemshipUnpaid = value;
    }

    /**
     * Gets the value of the retailBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailBal() {
        return retailBal;
    }

    /**
     * Sets the value of the retailBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailBal(JAXBElement<String> value) {
        this.retailBal = value;
    }

    /**
     * Gets the value of the cashInstallUnpaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashInstallUnpaid() {
        return cashInstallUnpaid;
    }

    /**
     * Sets the value of the cashInstallUnpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashInstallUnpaid(JAXBElement<String> value) {
        this.cashInstallUnpaid = value;
    }

    /**
     * Gets the value of the retailInstallUnpaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailInstallUnpaid() {
        return retailInstallUnpaid;
    }

    /**
     * Sets the value of the retailInstallUnpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailInstallUnpaid(JAXBElement<String> value) {
        this.retailInstallUnpaid = value;
    }

    /**
     * Gets the value of the rpcBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpcBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRPCBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RPCBlock }
     * 
     * 
     */
    public List<RPCBlock> getRPCBlock() {
        if (rpcBlock == null) {
            rpcBlock = new ArrayList<RPCBlock>();
        }
        return this.rpcBlock;
    }

}
