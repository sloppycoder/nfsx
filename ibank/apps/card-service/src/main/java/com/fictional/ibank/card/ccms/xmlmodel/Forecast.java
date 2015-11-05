
package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Forecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Forecast"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="promotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coupon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://entity.service.common.scb}CodeDesc" minOccurs="0"/&gt;
 *         &lt;element name="retailSpendAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashSpendAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="spendLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="penaltyChgFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expSpendAmtLevel1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expStmtAmtLevel1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expSpendAmtLevel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expStmtAmtLevel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expSpendAmtLevel3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expStmtAmtLevel3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prevSpendLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextRenewalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastMaintDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastMaintainedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Forecast", propOrder = {
    "promotionCode",
    "coupon",
    "status",
    "retailSpendAmt",
    "cashSpendAmt",
    "spendLevel",
    "penaltyChgFlag",
    "expSpendAmtLevel1",
    "expStmtAmtLevel1",
    "expSpendAmtLevel2",
    "expStmtAmtLevel2",
    "expSpendAmtLevel3",
    "expStmtAmtLevel3",
    "prevSpendLevel",
    "nextRenewalDate",
    "lastMaintDate",
    "lastMaintainedBy"
})
public class Forecast {

    @XmlElementRef(name = "promotionCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotionCode;
    @XmlElementRef(name = "coupon", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coupon;
    @XmlElementRef(name = "status", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDesc> status;
    @XmlElementRef(name = "retailSpendAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailSpendAmt;
    @XmlElementRef(name = "cashSpendAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashSpendAmt;
    @XmlElementRef(name = "spendLevel", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spendLevel;
    @XmlElementRef(name = "penaltyChgFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> penaltyChgFlag;
    @XmlElementRef(name = "expSpendAmtLevel1", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expSpendAmtLevel1;
    @XmlElementRef(name = "expStmtAmtLevel1", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expStmtAmtLevel1;
    @XmlElementRef(name = "expSpendAmtLevel2", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expSpendAmtLevel2;
    @XmlElementRef(name = "expStmtAmtLevel2", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expStmtAmtLevel2;
    @XmlElementRef(name = "expSpendAmtLevel3", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expSpendAmtLevel3;
    @XmlElementRef(name = "expStmtAmtLevel3", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expStmtAmtLevel3;
    @XmlElementRef(name = "prevSpendLevel", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prevSpendLevel;
    @XmlElementRef(name = "nextRenewalDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nextRenewalDate;
    @XmlElementRef(name = "lastMaintDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastMaintDate;
    @XmlElementRef(name = "lastMaintainedBy", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastMaintainedBy;

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromotionCode(JAXBElement<String> value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the coupon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoupon() {
        return coupon;
    }

    /**
     * Sets the value of the coupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoupon(JAXBElement<String> value) {
        this.coupon = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}
     *     
     */
    public JAXBElement<CodeDesc> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}
     *     
     */
    public void setStatus(JAXBElement<CodeDesc> value) {
        this.status = value;
    }

    /**
     * Gets the value of the retailSpendAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailSpendAmt() {
        return retailSpendAmt;
    }

    /**
     * Sets the value of the retailSpendAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailSpendAmt(JAXBElement<String> value) {
        this.retailSpendAmt = value;
    }

    /**
     * Gets the value of the cashSpendAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashSpendAmt() {
        return cashSpendAmt;
    }

    /**
     * Sets the value of the cashSpendAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashSpendAmt(JAXBElement<String> value) {
        this.cashSpendAmt = value;
    }

    /**
     * Gets the value of the spendLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpendLevel() {
        return spendLevel;
    }

    /**
     * Sets the value of the spendLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpendLevel(JAXBElement<String> value) {
        this.spendLevel = value;
    }

    /**
     * Gets the value of the penaltyChgFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPenaltyChgFlag() {
        return penaltyChgFlag;
    }

    /**
     * Sets the value of the penaltyChgFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPenaltyChgFlag(JAXBElement<String> value) {
        this.penaltyChgFlag = value;
    }

    /**
     * Gets the value of the expSpendAmtLevel1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpSpendAmtLevel1() {
        return expSpendAmtLevel1;
    }

    /**
     * Sets the value of the expSpendAmtLevel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpSpendAmtLevel1(JAXBElement<String> value) {
        this.expSpendAmtLevel1 = value;
    }

    /**
     * Gets the value of the expStmtAmtLevel1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpStmtAmtLevel1() {
        return expStmtAmtLevel1;
    }

    /**
     * Sets the value of the expStmtAmtLevel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpStmtAmtLevel1(JAXBElement<String> value) {
        this.expStmtAmtLevel1 = value;
    }

    /**
     * Gets the value of the expSpendAmtLevel2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpSpendAmtLevel2() {
        return expSpendAmtLevel2;
    }

    /**
     * Sets the value of the expSpendAmtLevel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpSpendAmtLevel2(JAXBElement<String> value) {
        this.expSpendAmtLevel2 = value;
    }

    /**
     * Gets the value of the expStmtAmtLevel2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpStmtAmtLevel2() {
        return expStmtAmtLevel2;
    }

    /**
     * Sets the value of the expStmtAmtLevel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpStmtAmtLevel2(JAXBElement<String> value) {
        this.expStmtAmtLevel2 = value;
    }

    /**
     * Gets the value of the expSpendAmtLevel3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpSpendAmtLevel3() {
        return expSpendAmtLevel3;
    }

    /**
     * Sets the value of the expSpendAmtLevel3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpSpendAmtLevel3(JAXBElement<String> value) {
        this.expSpendAmtLevel3 = value;
    }

    /**
     * Gets the value of the expStmtAmtLevel3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpStmtAmtLevel3() {
        return expStmtAmtLevel3;
    }

    /**
     * Sets the value of the expStmtAmtLevel3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpStmtAmtLevel3(JAXBElement<String> value) {
        this.expStmtAmtLevel3 = value;
    }

    /**
     * Gets the value of the prevSpendLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrevSpendLevel() {
        return prevSpendLevel;
    }

    /**
     * Sets the value of the prevSpendLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrevSpendLevel(JAXBElement<String> value) {
        this.prevSpendLevel = value;
    }

    /**
     * Gets the value of the nextRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNextRenewalDate() {
        return nextRenewalDate;
    }

    /**
     * Sets the value of the nextRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNextRenewalDate(JAXBElement<String> value) {
        this.nextRenewalDate = value;
    }

    /**
     * Gets the value of the lastMaintDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastMaintDate() {
        return lastMaintDate;
    }

    /**
     * Sets the value of the lastMaintDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastMaintDate(JAXBElement<String> value) {
        this.lastMaintDate = value;
    }

    /**
     * Gets the value of the lastMaintainedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastMaintainedBy() {
        return lastMaintainedBy;
    }

    /**
     * Sets the value of the lastMaintainedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastMaintainedBy(JAXBElement<String> value) {
        this.lastMaintainedBy = value;
    }

}
