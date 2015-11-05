
package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cycleDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="openingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsEarnedCurrentCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsUsedCurrentCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalAvailableBalancePoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="catrPointsCurrentCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashbackPointsCurrentCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableRewardPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceHistory", propOrder = {
    "cycleDate",
    "openingBalance",
    "pointsEarnedCurrentCycle",
    "pointsUsedCurrentCycle",
    "totalAvailableBalancePoints",
    "catrPointsCurrentCycle",
    "cashbackPointsCurrentCycle",
    "availableRewardPoints"
})
public class BalanceHistory {

    @XmlElementRef(name = "cycleDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cycleDate;
    @XmlElementRef(name = "openingBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> openingBalance;
    @XmlElementRef(name = "pointsEarnedCurrentCycle", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointsEarnedCurrentCycle;
    @XmlElementRef(name = "pointsUsedCurrentCycle", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointsUsedCurrentCycle;
    @XmlElementRef(name = "totalAvailableBalancePoints", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalAvailableBalancePoints;
    @XmlElementRef(name = "catrPointsCurrentCycle", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> catrPointsCurrentCycle;
    @XmlElementRef(name = "cashbackPointsCurrentCycle", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashbackPointsCurrentCycle;
    @XmlElementRef(name = "availableRewardPoints", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> availableRewardPoints;

    /**
     * Gets the value of the cycleDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCycleDate() {
        return cycleDate;
    }

    /**
     * Sets the value of the cycleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCycleDate(JAXBElement<String> value) {
        this.cycleDate = value;
    }

    /**
     * Gets the value of the openingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpeningBalance() {
        return openingBalance;
    }

    /**
     * Sets the value of the openingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpeningBalance(JAXBElement<String> value) {
        this.openingBalance = value;
    }

    /**
     * Gets the value of the pointsEarnedCurrentCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointsEarnedCurrentCycle() {
        return pointsEarnedCurrentCycle;
    }

    /**
     * Sets the value of the pointsEarnedCurrentCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointsEarnedCurrentCycle(JAXBElement<String> value) {
        this.pointsEarnedCurrentCycle = value;
    }

    /**
     * Gets the value of the pointsUsedCurrentCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointsUsedCurrentCycle() {
        return pointsUsedCurrentCycle;
    }

    /**
     * Sets the value of the pointsUsedCurrentCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointsUsedCurrentCycle(JAXBElement<String> value) {
        this.pointsUsedCurrentCycle = value;
    }

    /**
     * Gets the value of the totalAvailableBalancePoints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalAvailableBalancePoints() {
        return totalAvailableBalancePoints;
    }

    /**
     * Sets the value of the totalAvailableBalancePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalAvailableBalancePoints(JAXBElement<String> value) {
        this.totalAvailableBalancePoints = value;
    }

    /**
     * Gets the value of the catrPointsCurrentCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCatrPointsCurrentCycle() {
        return catrPointsCurrentCycle;
    }

    /**
     * Sets the value of the catrPointsCurrentCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCatrPointsCurrentCycle(JAXBElement<String> value) {
        this.catrPointsCurrentCycle = value;
    }

    /**
     * Gets the value of the cashbackPointsCurrentCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashbackPointsCurrentCycle() {
        return cashbackPointsCurrentCycle;
    }

    /**
     * Sets the value of the cashbackPointsCurrentCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashbackPointsCurrentCycle(JAXBElement<String> value) {
        this.cashbackPointsCurrentCycle = value;
    }

    /**
     * Gets the value of the availableRewardPoints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvailableRewardPoints() {
        return availableRewardPoints;
    }

    /**
     * Sets the value of the availableRewardPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvailableRewardPoints(JAXBElement<String> value) {
        this.availableRewardPoints = value;
    }

}
