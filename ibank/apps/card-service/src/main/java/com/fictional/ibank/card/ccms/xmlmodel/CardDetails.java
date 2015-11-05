
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
 * <p>Java class for CardDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prevStmtBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offeringCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentAdjustment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EarningDetails" type="{http://entity.cards.common.scb}EarningDetails" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="PanBankInfo" type="{http://entity.cards.common.scb}PanBankInfo" maxOccurs="20" minOccurs="0"/&gt;
 *         &lt;element name="ACCELProgramInfo" type="{http://entity.cards.common.scb}ACCELProgramInfo" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="cardAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryShadowAcctNoMiRev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currREBonusPointsSIGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currREBonusPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currRECashDollarSIGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currRECashDollar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardExpYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardExpMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blockCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shadowAcctStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offeringKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceProdID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashBackFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="panBankInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rewardsPrevBalSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rewardsPrevBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalEarnedRewardsSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalEarnedRewards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsRedeemedTransferredExpSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsRedeemedTransferredExp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalPointsBalSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalPointsBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastStmtDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryPointDetails" type="{http://entity.cards.common.scb}ExpiryPointDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ccyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardDetails", propOrder = {
    "creditCardNo",
    "prevStmtBalance",
    "currBalance",
    "pointsEarned",
    "pointsUsed",
    "offeringCode",
    "currentAdjustment",
    "earningDetails",
    "panBankInfo",
    "accelProgramInfo",
    "cardAcct",
    "primaryShadowAcctNoMiRev",
    "currREBonusPointsSIGN",
    "currREBonusPoints",
    "currRECashDollarSIGN",
    "currRECashDollar",
    "cardExpYear",
    "cardExpMonth",
    "blockCode",
    "shadowAcctStatus",
    "offeringKey",
    "sourceProdID",
    "cardType",
    "cashBackFlag",
    "panBankInd",
    "rewardsPrevBalSign",
    "rewardsPrevBal",
    "totalEarnedRewardsSign",
    "totalEarnedRewards",
    "pointsRedeemedTransferredExpSign",
    "pointsRedeemedTransferredExp",
    "totalPointsBalSign",
    "totalPointsBal",
    "lastStmtDate",
    "expiryPointDetails",
    "ccyCode"
})
public class CardDetails {

    @XmlElementRef(name = "creditCardNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditCardNo;
    @XmlElementRef(name = "prevStmtBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prevStmtBalance;
    @XmlElementRef(name = "currBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currBalance;
    @XmlElementRef(name = "pointsEarned", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointsEarned;
    @XmlElementRef(name = "pointsUsed", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointsUsed;
    @XmlElementRef(name = "offeringCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> offeringCode;
    @XmlElementRef(name = "currentAdjustment", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentAdjustment;
    @XmlElement(name = "EarningDetails", nillable = true)
    protected List<EarningDetails> earningDetails;
    @XmlElement(name = "PanBankInfo", nillable = true)
    protected List<PanBankInfo> panBankInfo;
    @XmlElement(name = "ACCELProgramInfo", nillable = true)
    protected List<ACCELProgramInfo> accelProgramInfo;
    @XmlElementRef(name = "cardAcct", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardAcct;
    @XmlElementRef(name = "primaryShadowAcctNoMiRev", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryShadowAcctNoMiRev;
    @XmlElementRef(name = "currREBonusPointsSIGN", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currREBonusPointsSIGN;
    @XmlElementRef(name = "currREBonusPoints", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currREBonusPoints;
    @XmlElementRef(name = "currRECashDollarSIGN", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currRECashDollarSIGN;
    @XmlElementRef(name = "currRECashDollar", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currRECashDollar;
    @XmlElementRef(name = "cardExpYear", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardExpYear;
    @XmlElementRef(name = "cardExpMonth", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardExpMonth;
    @XmlElementRef(name = "blockCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> blockCode;
    @XmlElementRef(name = "shadowAcctStatus", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shadowAcctStatus;
    @XmlElementRef(name = "offeringKey", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> offeringKey;
    @XmlElementRef(name = "sourceProdID", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceProdID;
    @XmlElementRef(name = "cardType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardType;
    @XmlElementRef(name = "cashBackFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashBackFlag;
    @XmlElementRef(name = "panBankInd", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> panBankInd;
    @XmlElementRef(name = "rewardsPrevBalSign", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rewardsPrevBalSign;
    @XmlElementRef(name = "rewardsPrevBal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rewardsPrevBal;
    @XmlElementRef(name = "totalEarnedRewardsSign", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalEarnedRewardsSign;
    @XmlElementRef(name = "totalEarnedRewards", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalEarnedRewards;
    @XmlElementRef(name = "pointsRedeemedTransferredExpSign", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointsRedeemedTransferredExpSign;
    @XmlElementRef(name = "pointsRedeemedTransferredExp", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointsRedeemedTransferredExp;
    @XmlElementRef(name = "totalPointsBalSign", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalPointsBalSign;
    @XmlElementRef(name = "totalPointsBal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalPointsBal;
    @XmlElementRef(name = "lastStmtDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastStmtDate;
    @XmlElement(name = "ExpiryPointDetails", nillable = true)
    protected List<ExpiryPointDetails> expiryPointDetails;
    @XmlElementRef(name = "ccyCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ccyCode;

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
     * Gets the value of the prevStmtBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrevStmtBalance() {
        return prevStmtBalance;
    }

    /**
     * Sets the value of the prevStmtBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrevStmtBalance(JAXBElement<String> value) {
        this.prevStmtBalance = value;
    }

    /**
     * Gets the value of the currBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrBalance() {
        return currBalance;
    }

    /**
     * Sets the value of the currBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrBalance(JAXBElement<String> value) {
        this.currBalance = value;
    }

    /**
     * Gets the value of the pointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointsEarned() {
        return pointsEarned;
    }

    /**
     * Sets the value of the pointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointsEarned(JAXBElement<String> value) {
        this.pointsEarned = value;
    }

    /**
     * Gets the value of the pointsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointsUsed() {
        return pointsUsed;
    }

    /**
     * Sets the value of the pointsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointsUsed(JAXBElement<String> value) {
        this.pointsUsed = value;
    }

    /**
     * Gets the value of the offeringCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfferingCode() {
        return offeringCode;
    }

    /**
     * Sets the value of the offeringCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfferingCode(JAXBElement<String> value) {
        this.offeringCode = value;
    }

    /**
     * Gets the value of the currentAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentAdjustment() {
        return currentAdjustment;
    }

    /**
     * Sets the value of the currentAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentAdjustment(JAXBElement<String> value) {
        this.currentAdjustment = value;
    }

    /**
     * Gets the value of the earningDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earningDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarningDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EarningDetails }
     * 
     * 
     */
    public List<EarningDetails> getEarningDetails() {
        if (earningDetails == null) {
            earningDetails = new ArrayList<EarningDetails>();
        }
        return this.earningDetails;
    }

    /**
     * Gets the value of the panBankInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the panBankInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPanBankInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PanBankInfo }
     * 
     * 
     */
    public List<PanBankInfo> getPanBankInfo() {
        if (panBankInfo == null) {
            panBankInfo = new ArrayList<PanBankInfo>();
        }
        return this.panBankInfo;
    }

    /**
     * Gets the value of the accelProgramInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accelProgramInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACCELProgramInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACCELProgramInfo }
     * 
     * 
     */
    public List<ACCELProgramInfo> getACCELProgramInfo() {
        if (accelProgramInfo == null) {
            accelProgramInfo = new ArrayList<ACCELProgramInfo>();
        }
        return this.accelProgramInfo;
    }

    /**
     * Gets the value of the cardAcct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardAcct() {
        return cardAcct;
    }

    /**
     * Sets the value of the cardAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardAcct(JAXBElement<String> value) {
        this.cardAcct = value;
    }

    /**
     * Gets the value of the primaryShadowAcctNoMiRev property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryShadowAcctNoMiRev() {
        return primaryShadowAcctNoMiRev;
    }

    /**
     * Sets the value of the primaryShadowAcctNoMiRev property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryShadowAcctNoMiRev(JAXBElement<String> value) {
        this.primaryShadowAcctNoMiRev = value;
    }

    /**
     * Gets the value of the currREBonusPointsSIGN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrREBonusPointsSIGN() {
        return currREBonusPointsSIGN;
    }

    /**
     * Sets the value of the currREBonusPointsSIGN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrREBonusPointsSIGN(JAXBElement<String> value) {
        this.currREBonusPointsSIGN = value;
    }

    /**
     * Gets the value of the currREBonusPoints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrREBonusPoints() {
        return currREBonusPoints;
    }

    /**
     * Sets the value of the currREBonusPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrREBonusPoints(JAXBElement<String> value) {
        this.currREBonusPoints = value;
    }

    /**
     * Gets the value of the currRECashDollarSIGN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrRECashDollarSIGN() {
        return currRECashDollarSIGN;
    }

    /**
     * Sets the value of the currRECashDollarSIGN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrRECashDollarSIGN(JAXBElement<String> value) {
        this.currRECashDollarSIGN = value;
    }

    /**
     * Gets the value of the currRECashDollar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrRECashDollar() {
        return currRECashDollar;
    }

    /**
     * Sets the value of the currRECashDollar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrRECashDollar(JAXBElement<String> value) {
        this.currRECashDollar = value;
    }

    /**
     * Gets the value of the cardExpYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardExpYear() {
        return cardExpYear;
    }

    /**
     * Sets the value of the cardExpYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardExpYear(JAXBElement<String> value) {
        this.cardExpYear = value;
    }

    /**
     * Gets the value of the cardExpMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardExpMonth() {
        return cardExpMonth;
    }

    /**
     * Sets the value of the cardExpMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardExpMonth(JAXBElement<String> value) {
        this.cardExpMonth = value;
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

    /**
     * Gets the value of the shadowAcctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShadowAcctStatus() {
        return shadowAcctStatus;
    }

    /**
     * Sets the value of the shadowAcctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShadowAcctStatus(JAXBElement<String> value) {
        this.shadowAcctStatus = value;
    }

    /**
     * Gets the value of the offeringKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfferingKey() {
        return offeringKey;
    }

    /**
     * Sets the value of the offeringKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfferingKey(JAXBElement<String> value) {
        this.offeringKey = value;
    }

    /**
     * Gets the value of the sourceProdID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceProdID() {
        return sourceProdID;
    }

    /**
     * Sets the value of the sourceProdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceProdID(JAXBElement<String> value) {
        this.sourceProdID = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardType(JAXBElement<String> value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cashBackFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashBackFlag() {
        return cashBackFlag;
    }

    /**
     * Sets the value of the cashBackFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashBackFlag(JAXBElement<String> value) {
        this.cashBackFlag = value;
    }

    /**
     * Gets the value of the panBankInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPanBankInd() {
        return panBankInd;
    }

    /**
     * Sets the value of the panBankInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPanBankInd(JAXBElement<String> value) {
        this.panBankInd = value;
    }

    /**
     * Gets the value of the rewardsPrevBalSign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRewardsPrevBalSign() {
        return rewardsPrevBalSign;
    }

    /**
     * Sets the value of the rewardsPrevBalSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRewardsPrevBalSign(JAXBElement<String> value) {
        this.rewardsPrevBalSign = value;
    }

    /**
     * Gets the value of the rewardsPrevBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRewardsPrevBal() {
        return rewardsPrevBal;
    }

    /**
     * Sets the value of the rewardsPrevBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRewardsPrevBal(JAXBElement<String> value) {
        this.rewardsPrevBal = value;
    }

    /**
     * Gets the value of the totalEarnedRewardsSign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalEarnedRewardsSign() {
        return totalEarnedRewardsSign;
    }

    /**
     * Sets the value of the totalEarnedRewardsSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalEarnedRewardsSign(JAXBElement<String> value) {
        this.totalEarnedRewardsSign = value;
    }

    /**
     * Gets the value of the totalEarnedRewards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalEarnedRewards() {
        return totalEarnedRewards;
    }

    /**
     * Sets the value of the totalEarnedRewards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalEarnedRewards(JAXBElement<String> value) {
        this.totalEarnedRewards = value;
    }

    /**
     * Gets the value of the pointsRedeemedTransferredExpSign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointsRedeemedTransferredExpSign() {
        return pointsRedeemedTransferredExpSign;
    }

    /**
     * Sets the value of the pointsRedeemedTransferredExpSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointsRedeemedTransferredExpSign(JAXBElement<String> value) {
        this.pointsRedeemedTransferredExpSign = value;
    }

    /**
     * Gets the value of the pointsRedeemedTransferredExp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointsRedeemedTransferredExp() {
        return pointsRedeemedTransferredExp;
    }

    /**
     * Sets the value of the pointsRedeemedTransferredExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointsRedeemedTransferredExp(JAXBElement<String> value) {
        this.pointsRedeemedTransferredExp = value;
    }

    /**
     * Gets the value of the totalPointsBalSign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalPointsBalSign() {
        return totalPointsBalSign;
    }

    /**
     * Sets the value of the totalPointsBalSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalPointsBalSign(JAXBElement<String> value) {
        this.totalPointsBalSign = value;
    }

    /**
     * Gets the value of the totalPointsBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalPointsBal() {
        return totalPointsBal;
    }

    /**
     * Sets the value of the totalPointsBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalPointsBal(JAXBElement<String> value) {
        this.totalPointsBal = value;
    }

    /**
     * Gets the value of the lastStmtDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastStmtDate() {
        return lastStmtDate;
    }

    /**
     * Sets the value of the lastStmtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastStmtDate(JAXBElement<String> value) {
        this.lastStmtDate = value;
    }

    /**
     * Gets the value of the expiryPointDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expiryPointDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpiryPointDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpiryPointDetails }
     * 
     * 
     */
    public List<ExpiryPointDetails> getExpiryPointDetails() {
        if (expiryPointDetails == null) {
            expiryPointDetails = new ArrayList<ExpiryPointDetails>();
        }
        return this.expiryPointDetails;
    }

    /**
     * Gets the value of the ccyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcyCode() {
        return ccyCode;
    }

    /**
     * Sets the value of the ccyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcyCode(JAXBElement<String> value) {
        this.ccyCode = value;
    }

}
