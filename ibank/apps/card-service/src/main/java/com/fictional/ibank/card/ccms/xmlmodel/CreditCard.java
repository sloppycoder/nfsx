
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
 * <p>Java class for CreditCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardHolderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardHolderStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blockCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blockCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alternateBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relationshipNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pastDueAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="previousBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentCredt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purchaseDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashAdvance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="financialCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cycleDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minAmountDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfTotalAuthorization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalAuthorizationAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfTodayAuthorization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="todayAuthorizationAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfOutstandAuthorization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outstandAuthorizationAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outstandAuthorizationAmtDec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="earlySettlementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payoffAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interestPerDiem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accrualDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accruedThroughDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfReturnedCheques" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastReturnedChequeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastPurchaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastAdvancedAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastCashAdvanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastPurchaseAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastPaymentAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastPaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfAuthorisedTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorisedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorisedCashAdvance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastCreditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastCreditLimitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tmpLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tmpLimitExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableCashLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditLimitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="highBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="highBalanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retailBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outstandBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ccmsCustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardUsageStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currYearCashAdvIntPaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastYearCashAdvIntPaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currYearIntPaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastYearIntPaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productTiedToCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastTransactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastActiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pinReIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentDueAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalDueAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xdays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="embossingName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="embossingName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="embossingName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="embossingName4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="autoDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purgeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="singleDualCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastReplacementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="membershipNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="behaviourScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerRiskScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exposureAtRisk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corporateCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethodDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastCardRequestDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastPinRequestDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastPinMaintenanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newTransferCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transferEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retailBaseRatePA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashBaseRatePA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retailInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lateNotices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="annualFees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prePay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lateCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overlimitCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalDisputedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retailDisputeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashDisputedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardFeeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardFeeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctdFees0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctdFees1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctdFees2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctdFees3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="permanentCreditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableRewardPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rewardPointsErndInCurrCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rewardPointsRedeemedInCurrCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="previousStmtPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastDelinquencyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priorDelinquencyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balance30Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balance60Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balance90Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balance120Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balance150Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balance180Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balance210Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pastDueBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xDayBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="embossedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="joiningFees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segmentCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curBlockDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block1Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block2Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block3Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block4Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block5Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block6Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block7Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block8Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block9Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block10Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block11Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block12Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block13Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block14Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block15Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block16Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block17Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block18Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block19Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block20Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block21Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block22Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block23Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block24Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="block25Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextPageKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pageRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="advanceCash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableCreditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retailAccruedInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashAccruedInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="openedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="closedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corporateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="projectedAccruedInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statementBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minimumDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statementFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relationshipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inCollectionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentDueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directDebitRoutingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directDebitAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROBEPermCreditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outstandingAuthAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfTotalTrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfBilledTrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfUnbilledTrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hostID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subFunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pageTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organisationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastSyncDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardProfile" type="{http://entity.cards.common.scb}CardProfile" minOccurs="0"/&gt;
 *         &lt;element name="temporaryCreditLimitEffDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="permanentThershold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="temporaryThershold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeXDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="time30Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="time60Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="time90Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="time120Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="time150Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="time180Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="time210Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corporateCustDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custRiskGrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custRiskGradeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateRiskChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ddaAcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ddaBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DDASwiftBIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ddaBankDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collateral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="systemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statementCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prevStmtBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalpointsForteited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointEarnedToday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextCashBackDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsEarnedYTD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="panBankInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="limitFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashPymntAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retailPymntAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastStatementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="affinityGroupNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pmntApportionment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pmntApportionmentExpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sendDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLCLetterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warningReportDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deliveryDemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deliveryMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acknowledgementStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acknowledgementStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mailingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberOfTxnsYTD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnAmountYTD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="barcodeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NCCCMerchantCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberOfCards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnReasonDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="altCustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://entity.cards.common.scb}CCAddress" minOccurs="0"/&gt;
 *         &lt;element name="actionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actionTaken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actionTakenDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pickupDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressChanged" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receivedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vendorDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redeemDollars" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applicationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transmissionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="batchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountApplied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remitAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tenure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentBlockDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableFundTransferLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashAdvOKFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fundXferOKFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfVisitThisYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfVisitLastYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalFeeChargedCurrentYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalFeeChargedLastYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfFreeVisitUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activationFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PermanentCashLimitPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashLimitMatrixPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CashLimitPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tmpCashLimitPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offeringCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SIDebitAcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repaymentScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfParkingThisYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfParkinLastYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalParkingFeeChargedCurrentYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalParkingFeeChargedLastYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfFreeParkingUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mpsLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mpsAvailLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mpsExpiryDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mps1LimitUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mps1AcctLimitUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mps1LastReqDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mps1LastReqOnTempLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mps2LimitUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mps2AcctLimitUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mps3AcctLimitUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstIntWaiverDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="waivePenaltyIntCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastResetDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableCreditLimit2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableCashLimit2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="revolverFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prefMerchant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="capReachDtOverall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="capReachDtatPrefMerchant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfTotalRPCTrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="programCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="octopusCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rejectReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flatRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tenor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="topupAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="topupDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="topupFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rewriteFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sequenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusUpdate" type="{http://entity.service.common.scb}MaintInfo" minOccurs="0"/&gt;
 *         &lt;element name="blackList" type="{http://entity.service.common.scb}MaintInfo" minOccurs="0"/&gt;
 *         &lt;element name="activeCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="openingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsEarnedBilled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsRedeemedBilled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsEarnedUnbilled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsRedeemedUnbilled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastMinPymtDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custAvailableCash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custCreditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custAvailableCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postDueFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bonusRewardPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="consolidatedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linkedAcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastBillDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastBillAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debtorRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusUpdatedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blacklistFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blacklistReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blacklistDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="openDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reloadAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="autoPayAcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="futureExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ackUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ackDtSurfMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ackDtRegMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="perpetuityPin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flexiPay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="srcCode" type="{http://entity.service.common.scb}CodeDesc" minOccurs="0"/&gt;
 *         &lt;element name="atmLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insureCode" type="{http://entity.service.common.scb}CodeDesc" minOccurs="0"/&gt;
 *         &lt;element name="currExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lateNoticesDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceChargesDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alternateBlockCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actionDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardsRequested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryCards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryCardsDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardsIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardsReturned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prevAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prevActionDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardFeatures" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profile01To06" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profile07To12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profile13To18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profile19To24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentTierRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="previousTierRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileLastEffDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileLastMaintDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryBlockCodeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CVI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="principalCardFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryCardFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextStatementDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pymtApportionmentFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fullPymt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directDebitBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastActivityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overLimitOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tierEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hoganCustIDInclusiveIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="highYieldCAAcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="embosserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusDateChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusTimeChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardActivationChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardActivationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardActivationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardDeActivationChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardDeActivationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardDeActivationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceRequestor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custIDNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pageNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moreRecordInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="poBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateofBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custCurrTotalPointsSIGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custCurrTotalPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custCurrTotalCashDollarBalSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custCurrTotalCashDollarBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redemFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardExpMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardExpYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redemPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashRedem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="topUpAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashBackAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tranDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tranTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tranAuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processingFeeAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="topUpStmtDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feeStmtDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custPointsBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custCashDollarBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardNoAuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryShadowAcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senderCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiverCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsToBeTransferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transferFeeAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senderPrimaryShadowAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiverPrimaryShadowAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minpointsReqTransfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxpointsallowtransfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inputFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="installmentProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialInstallmentProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overseasInstallmentProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="normalInstallmentProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inputDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inputBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cancelIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberOfInstlmnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableTransactionCounter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="neAvailableTransactionCounter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="neAvailableTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialTransactionCounter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="neSpecialTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overseaTransactionCounter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="neOverseaTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="normalTransactionCounter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="neNormalTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availaCreditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availaCashLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditLmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardExpyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastMinAmountDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="consolidateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pastDueFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crmODRowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subProduct" type="{http://entity.service.common.scb}CodeDesc" minOccurs="0"/&gt;
 *         &lt;element name="branch" type="{http://entity.service.common.scb}CodeDesc" minOccurs="0"/&gt;
 *         &lt;element name="referralId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourcingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="closingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastStmtDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rewardPointPrintedCurrentQuarter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstOTP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondOTP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tokenCardInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tokenStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ddaPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ddaAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalStmtBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coOwnerOfficePhoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memoLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardEmbossName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nricNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tempBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tempLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tempLimitExpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonOfRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveOrDecline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approvalAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="declineReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardForecastDetails" type="{http://entity.cards.common.scb}Forecast" minOccurs="0"/&gt;
 *         &lt;element name="lastPaymentAmtFCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pastDueAmountFCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minPaymentFCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balanceFCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minPaymentLCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balanceLCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtCreditBalOccur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="existingFeeDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="affinityFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custOrgNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionOrgNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outOfBalanceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dualMailingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="summaryInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondaryCustOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondaryCustNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="previousBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="earnedCycleDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usedCycleDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalBilledTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tranType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="srcName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="branchNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operandNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pinFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outstandBalFCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditLimitFCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableCreditLimitFCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashLimitFCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableCashLimitFCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balCcyCodeFCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="limitCcyCodeFCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rewardFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="points" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rtnInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tranMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postingDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tranNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tranYr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="option" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enquiryFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notesDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memoDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blockDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdatedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryCreditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupAccNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="friendName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="favoriteCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="favoriteColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suppCardInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="embossingDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstYrFeeAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmtMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="housing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="housingExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reserve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="keyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupAccBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupAccAuthBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupAccOutstandBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupAccCashOutstandBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupAccLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tranGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="earlySettlementDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrearsFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overLimitFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="governTaxes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preClosurePenalty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instPlanBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acctCcy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fixedInstAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emvChipEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relshipNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryCust" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notesStored" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pendingSCB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="optSCBRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pendingManhattan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="optManhattanRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pendingPrime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="optPrimeRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="savingsAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDDMAmountDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownershipFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maximumSpecialAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maximumOverseasAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maximumNormAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthlyInstallmentAmountSpecial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handlingFeePercentageSpecial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handlingFeeAmountSpecial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthlyInstallmentAmountOversea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handlingFeePercentageOversea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handlingFeeAmountOversea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthlyInstallmentAmountNormal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handlingFeePercentageNormal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handlingFeeAmountNormal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialProductAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overseasProductAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactlessIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authTransaction" type="{http://entity.cards.common.scb}AuthTransaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OAAATransaction" type="{http://entity.cards.common.scb}OAAATransaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RewardSummary" type="{http://entity.cards.common.scb}RewardSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MerchandiseDetail" type="{http://entity.cards.common.scb}MerchandiseDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CreditHistory" type="{http://entity.cards.common.scb}CreditHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Transaction" type="{http://entity.cards.common.scb}Transaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UnbilledTransaction" type="{http://entity.cards.common.scb}Transaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Memo" type="{http://entity.cards.common.scb}Memo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CurrentPot" type="{http://entity.cards.common.scb}Pot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PendingPot" type="{http://entity.cards.common.scb}Pot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CurrentSubPot" type="{http://entity.cards.common.scb}Pot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PendingSubPot" type="{http://entity.cards.common.scb}Pot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SupplimentCard" type="{http://entity.cards.common.scb}SupplimentCard" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CardDetails" type="{http://entity.cards.common.scb}CardDetails" maxOccurs="15" minOccurs="0"/&gt;
 *         &lt;element name="cardAccessDet" type="{http://entity.cards.common.scb}CardAccessDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cashOneDet" type="{http://entity.cards.common.scb}CashOneDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EarningDetails" type="{http://entity.cards.common.scb}EarningDetails" maxOccurs="7" minOccurs="0"/&gt;
 *         &lt;element name="BalanceHistory" type="{http://entity.cards.common.scb}BalanceHistory" maxOccurs="14" minOccurs="0"/&gt;
 *         &lt;element name="PanBankInfo" type="{http://entity.cards.common.scb}PanBankInfo" maxOccurs="30" minOccurs="0"/&gt;
 *         &lt;element name="ACCELProgramInfo" type="{http://entity.cards.common.scb}ACCELProgramInfo" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="MerchantDetails" type="{http://entity.cards.common.scb}MerchantDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StatusHistory" type="{http://entity.cards.common.scb}StatusHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StatementHistory" type="{http://entity.cards.common.scb}StatementHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PriorityPassDetails" type="{http://entity.cards.common.scb}PriorityPassDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PurgeDetails" type="{http://entity.cards.common.scb}PurgeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BlockDetails" type="{http://entity.cards.common.scb}BlockDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PastTransactions" type="{http://entity.cards.common.scb}PastTransactions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SupplementaryCardholderDetails" type="{http://entity.cards.common.scb}SupplementaryCardholderDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AirlineMembership" type="{http://entity.cards.common.scb}AirlineMembership" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PLCCardDetails" type="{http://entity.cards.common.scb}PLCCardDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CallInTransactions" type="{http://entity.cards.common.scb}CallInTxns" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VIPUsageTransactions" type="{http://entity.cards.common.scb}VIPUsageTransactions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AirportParking" type="{http://entity.cards.common.scb}AirportParking" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SMSAlerts" type="{http://entity.cards.common.scb}SMSAlerts" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IDRPDetails" type="{http://entity.cards.common.scb}IDRPDtls" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CardInsurance" type="{http://entity.cards.common.scb}CardInsurance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CardService" type="{http://entity.cards.common.scb}Service" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PenaltyWaiver" type="{http://entity.cards.common.scb}PenaltyWaiver" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RewardTransactionDetails" type="{http://entity.cards.common.scb}RewardTransactionDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RewardHistory" type="{http://entity.cards.common.scb}RewardHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CardRPCTransactionHistory" type="{http://entity.cards.common.scb}CardRPC" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CardMultipleBonusEnquiry" type="{http://entity.cards.common.scb}Reward" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EarlyRepaymentSavingsDetails" type="{http://entity.cards.common.scb}EarlyRepaySavings" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LineBurnDetails" type="{http://entity.cards.common.scb}LineBurn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CampaignDetails" type="{http://entity.cards.common.scb}CampaignDet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ThirteenMonthHistory" type="{http://entity.cards.common.scb}ThirteenMonth" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxDetails" type="{http://entity.cards.common.scb}TaxDet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DrawDownDetails" type="{http://entity.cards.common.scb}DrawDown" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerDetails" type="{http://entity.cards.common.scb}CustDet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PricingHistory" type="{http://entity.cards.common.scb}PricingHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TopupHistory" type="{http://entity.cards.common.scb}TopupHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Forecast" type="{http://entity.cards.common.scb}Forecast" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Tier" type="{http://entity.cards.common.scb}Tier" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="Gift" type="{http://entity.cards.common.scb}Gift" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EarnDetails" type="{http://entity.cards.common.scb}EarnDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CardSummaryDtl" type="{http://entity.cards.common.scb}CardSummaryDtl" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TransactionDetails" type="{http://entity.cards.common.scb}TransactionDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BalanceBucketsHistory" type="{http://entity.cards.common.scb}BalanceBucketsHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TokenCardList" type="{http://entity.cards.common.scb}TokenCardList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EmbossingDetails" type="{http://entity.cards.common.scb}EmbossingDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LinkedCards" type="{http://entity.cards.common.scb}LinkedCards" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentHistory" type="{http://entity.cards.common.scb}PaymentHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InstallmentPlan" type="{http://entity.cards.common.scb}InstallmentPlan" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubAcctDtl" type="{http://entity.cards.common.scb}SubAcctDtl" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryCard" type="{http://entity.cards.common.scb}PrimaryCard" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NotesData" type="{http://entity.cards.common.scb}NotesData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SCBOverlimit" type="{http://entity.cards.common.scb}SCBOverlimit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ManhattanOverlimit" type="{http://entity.cards.common.scb}ManhattanOverlimit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrimeOverlimit" type="{http://entity.cards.common.scb}PrimeOverlimit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MonthtoDateDetails" type="{http://entity.cards.common.scb}MonthtoDateDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MonthlyInstallmentDetails" type="{http://entity.cards.common.scb}MonthlyInstallmentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Response" type="{http://entity.service.common.scb}ServiceResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCard", propOrder = {
    "creditCardNo",
    "cardType",
    "cardTypeDesc",
    "product",
    "productDesc",
    "cardHolderStatus",
    "cardHolderStatusDesc",
    "blockCode",
    "blockCodeDesc",
    "primaryBlockCode",
    "alternateBlockCode",
    "relationshipNo",
    "stmtType",
    "stmtBalance",
    "pastDueAmount",
    "previousBalance",
    "paymentCredt",
    "purchaseDebit",
    "cashAdvance",
    "financialCharges",
    "stmtDate",
    "cycleDays",
    "dueDate",
    "minAmountDue",
    "lastActivity",
    "noOfTotalAuthorization",
    "totalAuthorizationAmt",
    "noOfTodayAuthorization",
    "todayAuthorizationAmt",
    "noOfOutstandAuthorization",
    "outstandAuthorizationAmt",
    "outstandAuthorizationAmtDec",
    "earlySettlementDate",
    "payoffAmount",
    "interestPerDiem",
    "accrualDate",
    "accruedThroughDate",
    "paymentDate",
    "billingCycle",
    "noOfReturnedCheques",
    "lastReturnedChequeDate",
    "lastPurchaseDate",
    "lastAdvancedAmt",
    "lastCashAdvanceDate",
    "lastPurchaseAmt",
    "lastPaymentAmt",
    "lastPaymentDate",
    "noOfAuthorisedTransaction",
    "authorisedAmount",
    "authorisedCashAdvance",
    "lastCreditLimit",
    "lastCreditLimitDate",
    "tmpLimit",
    "tmpLimitExpiryDate",
    "availableCashLimit",
    "creditLimitDate",
    "highBalance",
    "highBalanceDate",
    "cashBalance",
    "retailBalance",
    "outstandBalance",
    "lastStatement",
    "ccmsCustomerID",
    "cardUsageStatus",
    "currYearCashAdvIntPaid",
    "lastYearCashAdvIntPaid",
    "currYearIntPaid",
    "lastYearIntPaid",
    "productTiedToCard",
    "lastTransactionDate",
    "lastActiveDate",
    "pinReIssueDate",
    "currentDueAmount",
    "totalDueAmount",
    "xdays",
    "embossingName1",
    "embossingName2",
    "embossingName3",
    "embossingName4",
    "autoDebit",
    "purgeDate",
    "region",
    "singleDualCard",
    "lastReplacementDate",
    "membershipNo",
    "cardExpiryDate",
    "behaviourScore",
    "customerRiskScore",
    "exposureAtRisk",
    "corporateCustomer",
    "paymentType",
    "paymentTypeDesc",
    "paymentMethod",
    "paymentMethodDesc",
    "lastCardRequestDate",
    "lastPinRequestDate",
    "lastPinMaintenanceDate",
    "newTransferCardNo",
    "transferEffectiveDate",
    "retailBaseRatePA",
    "cashBaseRatePA",
    "retailInterest",
    "lateNotices",
    "serviceCharges",
    "cashInterest",
    "annualFees",
    "prePay",
    "lateCharges",
    "overlimitCharges",
    "totalDisputedAmount",
    "retailDisputeAmount",
    "cashDisputedAmount",
    "cardFeeDate",
    "cardFeeAmount",
    "ctdFees0",
    "ctdFees1",
    "ctdFees2",
    "ctdFees3",
    "userCode1",
    "userCode2",
    "userCode3",
    "userCode4",
    "permanentCreditLimit",
    "availableRewardPoints",
    "rewardPointsErndInCurrCycle",
    "rewardPointsRedeemedInCurrCycle",
    "previousStmtPoints",
    "lastDelinquencyDate",
    "priorDelinquencyDate",
    "balance30Days",
    "balance60Days",
    "balance90Days",
    "balance120Days",
    "balance150Days",
    "balance180Days",
    "balance210Days",
    "pastDueBalance",
    "currencyCode",
    "xDayBalance",
    "embossedName",
    "joiningFees",
    "accountName",
    "segmentCode",
    "segmentCodeDesc",
    "curBlockCode",
    "curBlockDate",
    "block1",
    "block1Date",
    "block2",
    "block2Date",
    "block3",
    "block3Date",
    "block4",
    "block4Date",
    "block5",
    "block5Date",
    "block6",
    "block6Date",
    "block7",
    "block7Date",
    "block8",
    "block8Date",
    "block9",
    "block9Date",
    "block10",
    "block10Date",
    "block11",
    "block11Date",
    "block12",
    "block12Date",
    "block13",
    "block13Date",
    "block14",
    "block14Date",
    "block15",
    "block15Date",
    "block16",
    "block16Date",
    "block17",
    "block17Date",
    "block18",
    "block18Date",
    "block19",
    "block19Date",
    "block20",
    "block20Date",
    "block21",
    "block21Date",
    "block22",
    "block22Date",
    "block23",
    "block23Date",
    "block24",
    "block24Date",
    "block25",
    "block25Date",
    "nextPageKey",
    "pageRequest",
    "creditLimit",
    "productCode",
    "productCodeDesc",
    "cashLimit",
    "availableCredit",
    "advanceCash",
    "currentBalance",
    "availableCreditLimit",
    "retailAccruedInterest",
    "cashAccruedInterest",
    "referenceNo",
    "openedDate",
    "closedDate",
    "lastUpdate",
    "additionalAddress",
    "corporateID",
    "projectedAccruedInterest",
    "statementBalance",
    "minimumDue",
    "postingFlag",
    "statementFlag",
    "scod",
    "relationshipType",
    "inCollectionIndicator",
    "paymentDueDate",
    "directDebitRoutingNo",
    "directDebitAccountNo",
    "cardCategory",
    "probePermCreditLimit",
    "outstandingAuthAmt",
    "noOfTotalTrans",
    "noOfBilledTrans",
    "noOfUnbilledTrans",
    "entityID",
    "entityType",
    "userID",
    "hostID",
    "functionCode",
    "subFunctionCode",
    "pageTotal",
    "organisationNo",
    "requestFlag",
    "lastSyncDate",
    "cardProfile",
    "temporaryCreditLimitEffDate",
    "permanentThershold",
    "temporaryThershold",
    "timeXDays",
    "time30Days",
    "time60Days",
    "time90Days",
    "time120Days",
    "time150Days",
    "time180Days",
    "time210Days",
    "accountNo",
    "corporateCustDesc",
    "custRiskGrade",
    "custRiskGradeDesc",
    "dateRiskChange",
    "ddaAcctNo",
    "ddaBank",
    "ddaSwiftBIC",
    "ddaBankDesc",
    "collateral",
    "systemID",
    "statementCycle",
    "functionID",
    "prevStmtBalance",
    "totalpointsForteited",
    "pointsEarned",
    "pointEarnedToday",
    "pointsUsed",
    "nextCashBackDate",
    "pointsEarnedYTD",
    "panBankInd",
    "limitFlag",
    "cashPymntAmt",
    "retailPymntAmt",
    "totalBalance",
    "lastStatementDate",
    "affinityGroupNumber",
    "pmntApportionment",
    "pmntApportionmentExpDate",
    "accountType",
    "issuedDate",
    "sendDate",
    "olcLetterDate",
    "warningReportDate",
    "remarks",
    "deliveryDemo",
    "deliveryMemo",
    "acknowledgementStatus",
    "acknowledgementStatusDesc",
    "registerNumber",
    "zipCode",
    "mailingDate",
    "processDate",
    "createdDate",
    "numberOfTxnsYTD",
    "txnAmountYTD",
    "barcodeNumber",
    "ncccMerchantCode",
    "itemNumber",
    "numberOfCards",
    "returnReason",
    "returnReasonDesc",
    "customerID",
    "altCustID",
    "customerName",
    "address",
    "actionDate",
    "actionTaken",
    "actionTakenDesc",
    "pickupDate",
    "addressChanged",
    "returnDate",
    "orderNumber",
    "orderDate",
    "deliveryDate",
    "receivedDate",
    "processDays",
    "vendor",
    "vendorDesc",
    "productName",
    "productType",
    "productTypeDesc",
    "redeemDollars",
    "cashPayment",
    "productNumber",
    "customerNo",
    "applicationNumber",
    "applicationDate",
    "transmissionDate",
    "batchNumber",
    "amountApplied",
    "remitAmount",
    "tenure",
    "remitDate",
    "feeCode",
    "paymentMode",
    "currentBlockCode",
    "currentBlockDate",
    "paymentIndicator",
    "availableFundTransferLimit",
    "cashAdvOKFlag",
    "fundXferOKFlag",
    "noOfVisitThisYear",
    "noOfVisitLastYear",
    "totalFeeChargedCurrentYear",
    "totalFeeChargedLastYear",
    "noOfFreeVisitUsed",
    "activationFlag",
    "permanentCashLimitPercent",
    "cashLimitMatrixPercent",
    "cashLimitPercent",
    "tmpCashLimitPercent",
    "amount",
    "offeringCode",
    "siDebitAcctNo",
    "repaymentScore",
    "noOfParkingThisYear",
    "noOfParkinLastYear",
    "totalParkingFeeChargedCurrentYear",
    "totalParkingFeeChargedLastYear",
    "noOfFreeParkingUsed",
    "reversalFlag",
    "mpsLimit",
    "mpsAvailLimit",
    "mpsExpiryDt",
    "mps1LimitUsed",
    "mps1AcctLimitUsed",
    "mps1LastReqDt",
    "mps1LastReqOnTempLimit",
    "mps2LimitUsed",
    "mps2AcctLimitUsed",
    "mps3AcctLimitUsed",
    "firstIntWaiverDate",
    "waivePenaltyIntCount",
    "lastResetDate",
    "availableCreditLimit2",
    "availableCashLimit2",
    "revolverFlag",
    "prefMerchant",
    "capReachDtOverall",
    "capReachDtatPrefMerchant",
    "noOfTotalRPCTrans",
    "programCode",
    "octopusCardNo",
    "status",
    "rejectReasonCode",
    "interestRate",
    "flatRate",
    "tenor",
    "topupAmt",
    "topupDate",
    "topupFlag",
    "rewriteFlag",
    "sequenceNo",
    "statusUpdate",
    "blackList",
    "activeCount",
    "openingBalance",
    "pointsEarnedBilled",
    "pointsRedeemedBilled",
    "pointsEarnedUnbilled",
    "pointsRedeemedUnbilled",
    "availableBalance",
    "expiryDate",
    "lastMinPymtDue",
    "custAvailableCash",
    "custCreditLimit",
    "custAvailableCredit",
    "postDueFlag",
    "bonusRewardPoints",
    "consolidatedCode",
    "linkedAcctNo",
    "orderAmt",
    "lastBillNo",
    "lastBillDate",
    "lastBillAmt",
    "debtorRefNo",
    "statusUpdatedate",
    "blacklistFlag",
    "blacklistReason",
    "blacklistDate",
    "openDate",
    "reloadAmt",
    "autoPayAcctNo",
    "futureExpiryDate",
    "ackUserId",
    "ackDtSurfMail",
    "ackDtRegMail",
    "perpetuityPin",
    "flexiPay",
    "srcCode",
    "atmLang",
    "insureCode",
    "currExpiryDate",
    "lateNoticesDesc",
    "serviceChargesDesc",
    "alternateBlockCodeDesc",
    "organisation",
    "action",
    "actionDesc",
    "sequence",
    "cardsRequested",
    "supplementaryCards",
    "supplementaryCardsDesc",
    "cardsIssued",
    "cardsReturned",
    "prevAction",
    "prevActionDesc",
    "cardFeatures",
    "lastExpiryDate",
    "profile01To06",
    "profile07To12",
    "profile13To18",
    "profile19To24",
    "currentTierRate",
    "previousTierRate",
    "profileLastEffDate",
    "profileLastMaintDate",
    "primaryBlockCodeDate",
    "cvi",
    "principalCardFee",
    "supplementaryCardFee",
    "nextStatementDt",
    "pymtApportionmentFlag",
    "fullPymt",
    "directDebitBank",
    "lastActivityDate",
    "overLimitOption",
    "tierEffectiveDate",
    "newAmt",
    "stmtCycle",
    "hoganCustIDInclusiveIDType",
    "highYieldCAAcctNo",
    "statementDate",
    "requestType",
    "cardOrganization",
    "cardNo",
    "embosserName",
    "statusFlag",
    "statusDateChange",
    "statusTimeChange",
    "phoneNo",
    "cardActivationChannel",
    "cardActivationDate",
    "cardActivationTime",
    "cardDeActivationChannel",
    "cardDeActivationDate",
    "cardDeActivationTime",
    "sourceFlag",
    "serviceRequestor",
    "custIDType",
    "custIDNo",
    "pageNo",
    "cardInd",
    "returnCode",
    "returnDesc",
    "moreRecordInd",
    "poBox",
    "postCode",
    "dateofBirth",
    "custCurrTotalPointsSIGN",
    "custCurrTotalPoints",
    "custCurrTotalCashDollarBalSign",
    "custCurrTotalCashDollarBal",
    "redemFlag",
    "redemType",
    "orderDesc",
    "cardExpMonth",
    "cardExpYear",
    "redemPoints",
    "cashRedem",
    "topUpAmt",
    "cashBackAmt",
    "tranDate",
    "tranTime",
    "tranAuthCode",
    "processingFeeAmt",
    "topUpStmtDesc",
    "feeStmtDesc",
    "custPointsBal",
    "custCashDollarBal",
    "authCode",
    "cardNoAuth",
    "primaryShadowAcctNo",
    "transferCode",
    "senderCardNo",
    "receiverCardNo",
    "pointsToBeTransferred",
    "transferFeeAmt",
    "senderPrimaryShadowAcct",
    "receiverPrimaryShadowAcct",
    "minpointsReqTransfer",
    "maxpointsallowtransfer",
    "inputFunction",
    "installmentProgram",
    "specialInstallmentProduct",
    "overseasInstallmentProduct",
    "normalInstallmentProduct",
    "inputDate",
    "inputBy",
    "cancelIndicator",
    "productAmount",
    "numberOfInstlmnt",
    "availableTransactionCounter",
    "availableTransactionAmount",
    "neAvailableTransactionCounter",
    "neAvailableTransactionAmount",
    "specialTransactionCounter",
    "neSpecialTransactionAmount",
    "overseaTransactionCounter",
    "neOverseaTransactionAmount",
    "normalTransactionCounter",
    "neNormalTransactionAmount",
    "operatorID",
    "availaCreditLimit",
    "availaCashLimit",
    "creditLmt",
    "cardExpyDate",
    "lastMinAmountDue",
    "consolidateCode",
    "pastDueFlg",
    "crmODRowId",
    "subProduct",
    "branch",
    "referralId",
    "sourcingId",
    "closingId",
    "lastStmtDate",
    "rewardPointPrintedCurrentQuarter",
    "clientId",
    "tokenId",
    "firstOTP",
    "secondOTP",
    "tokenCardInd",
    "tokenStatus",
    "ddaPercentage",
    "ddaAmount",
    "totalStmtBal",
    "nickName",
    "coOwner",
    "coOwnerOfficePhoneNo",
    "memoLine",
    "cardEmbossName",
    "nricNo",
    "tempBranch",
    "agentId",
    "tempLimit",
    "tempLimitExpDate",
    "reasonOfRequest",
    "approveOrDecline",
    "approvalAmt",
    "declineReason",
    "cardForecastDetails",
    "lastPaymentAmtFCY",
    "pastDueAmountFCY",
    "minPaymentFCY",
    "balanceFCY",
    "minPaymentLCY",
    "balanceLCY",
    "chipType",
    "dtCreditBalOccur",
    "existingFeeDt",
    "affinityFlag",
    "startDate",
    "endDate",
    "custOrgNo",
    "transactionCardNo",
    "transactionCardType",
    "transactionOrgNo",
    "outOfBalanceFlag",
    "dualMailingFlag",
    "summaryInd",
    "secondaryCustOrg",
    "secondaryCustNo",
    "previousBlockCode",
    "earnedCycleDt",
    "usedCycleDt",
    "totalBilledTransaction",
    "tranType",
    "bankNo",
    "srcName",
    "branchNo",
    "operandNo",
    "pinFlag",
    "pin",
    "outstandBalFCY",
    "creditLimitFCY",
    "availableCreditLimitFCY",
    "cashLimitFCY",
    "availableCashLimitFCY",
    "balCcyCodeFCY",
    "limitCcyCodeFCY",
    "rewardFlag",
    "checkFlag",
    "points",
    "startDt",
    "endDt",
    "rtnInd",
    "tranMonth",
    "postingDt",
    "tranNo",
    "tranYr",
    "option",
    "enquiryFlag",
    "idType",
    "notesDt",
    "memoDt",
    "blockDt",
    "paidAmt",
    "adjustmentAmt",
    "interest",
    "newBalance",
    "lastUpdatedTime",
    "primaryCreditCardNo",
    "flag",
    "stmtDay",
    "custCategory",
    "groupAccNo",
    "friendName",
    "favoriteCity",
    "favoriteColor",
    "cardStatus",
    "suppCardInd",
    "overCode",
    "appOrigin",
    "embossingDt",
    "firstYrFeeAmt",
    "stmtMode",
    "eMail",
    "housing",
    "housingExt",
    "reserve",
    "keyType",
    "groupAccBal",
    "groupAccAuthBal",
    "groupAccOutstandBal",
    "groupAccCashOutstandBal",
    "groupAccLimit",
    "tranGroup",
    "period",
    "earlySettlementDt",
    "arrearsFee",
    "overLimitFee",
    "transactionFee",
    "governTaxes",
    "preClosurePenalty",
    "instPlanBal",
    "acctCcy",
    "fixedInstAmt",
    "emvChipEnabled",
    "relshipNo",
    "primaryCust",
    "notesStored",
    "functionRequest",
    "pendingSCB",
    "optSCBRequest",
    "pendingManhattan",
    "optManhattanRequest",
    "pendingPrime",
    "optPrimeRequest",
    "checkingAccount",
    "savingsAccount",
    "userAccount",
    "paymentFlag",
    "pddmAmountDue",
    "ownershipFlag",
    "maximumSpecialAmount",
    "maximumOverseasAmount",
    "maximumNormAmount",
    "monthlyInstallmentAmountSpecial",
    "handlingFeePercentageSpecial",
    "handlingFeeAmountSpecial",
    "monthlyInstallmentAmountOversea",
    "handlingFeePercentageOversea",
    "handlingFeeAmountOversea",
    "monthlyInstallmentAmountNormal",
    "handlingFeePercentageNormal",
    "handlingFeeAmountNormal",
    "specialProductAmount",
    "overseasProductAmount",
    "contactlessIndicator",
    "authTransaction",
    "oaaaTransaction",
    "rewardSummary",
    "merchandiseDetail",
    "creditHistory",
    "transaction",
    "unbilledTransaction",
    "memo",
    "currentPot",
    "pendingPot",
    "currentSubPot",
    "pendingSubPot",
    "supplimentCard",
    "cardDetails",
    "cardAccessDet",
    "cashOneDet",
    "earningDetails",
    "balanceHistory",
    "panBankInfo",
    "accelProgramInfo",
    "merchantDetails",
    "statusHistory",
    "statementHistory",
    "priorityPassDetails",
    "purgeDetails",
    "blockDetails",
    "pastTransactions",
    "supplementaryCardholderDetails",
    "airlineMembership",
    "plcCardDetails",
    "callInTransactions",
    "vipUsageTransactions",
    "airportParking",
    "smsAlerts",
    "idrpDetails",
    "cardInsurance",
    "cardService",
    "penaltyWaiver",
    "rewardTransactionDetails",
    "rewardHistory",
    "cardRPCTransactionHistory",
    "cardMultipleBonusEnquiry",
    "earlyRepaymentSavingsDetails",
    "lineBurnDetails",
    "campaignDetails",
    "thirteenMonthHistory",
    "taxDetails",
    "drawDownDetails",
    "customerDetails",
    "pricingHistory",
    "topupHistory",
    "forecast",
    "tier",
    "gift",
    "earnDetails",
    "cardSummaryDtl",
    "transactionDetails",
    "balanceBucketsHistory",
    "tokenCardList",
    "embossingDetails",
    "linkedCards",
    "paymentHistory",
    "installmentPlan",
    "subAcctDtl",
    "primaryCard",
    "notesData",
    "scbOverlimit",
    "manhattanOverlimit",
    "primeOverlimit",
    "monthtoDateDetails",
    "monthlyInstallmentDetails",
    "response"
})
public class CreditCard {

    @XmlElementRef(name = "creditCardNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditCardNo;
    @XmlElementRef(name = "cardType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardType;
    @XmlElementRef(name = "cardTypeDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardTypeDesc;
    @XmlElementRef(name = "product", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product;
    @XmlElementRef(name = "productDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productDesc;
    @XmlElementRef(name = "cardHolderStatus", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardHolderStatus;
    @XmlElementRef(name = "cardHolderStatusDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardHolderStatusDesc;
    @XmlElementRef(name = "blockCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> blockCode;
    @XmlElementRef(name = "blockCodeDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> blockCodeDesc;
    @XmlElementRef(name = "primaryBlockCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryBlockCode;
    @XmlElementRef(name = "alternateBlockCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternateBlockCode;
    @XmlElementRef(name = "relationshipNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relationshipNo;
    @XmlElementRef(name = "stmtType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stmtType;
    @XmlElementRef(name = "stmtBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stmtBalance;
    @XmlElementRef(name = "pastDueAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pastDueAmount;
    @XmlElementRef(name = "previousBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousBalance;
    @XmlElementRef(name = "paymentCredt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentCredt;
    @XmlElementRef(name = "purchaseDebit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchaseDebit;
    @XmlElementRef(name = "cashAdvance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashAdvance;
    @XmlElementRef(name = "financialCharges", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> financialCharges;
    @XmlElementRef(name = "stmtDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stmtDate;
    @XmlElementRef(name = "cycleDays", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cycleDays;
    @XmlElementRef(name = "dueDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dueDate;
    @XmlElementRef(name = "minAmountDue", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minAmountDue;
    @XmlElementRef(name = "lastActivity", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastActivity;
    @XmlElementRef(name = "noOfTotalAuthorization", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfTotalAuthorization;
    @XmlElementRef(name = "totalAuthorizationAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalAuthorizationAmt;
    @XmlElementRef(name = "noOfTodayAuthorization", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfTodayAuthorization;
    @XmlElementRef(name = "todayAuthorizationAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> todayAuthorizationAmt;
    @XmlElementRef(name = "noOfOutstandAuthorization", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfOutstandAuthorization;
    @XmlElementRef(name = "outstandAuthorizationAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outstandAuthorizationAmt;
    @XmlElementRef(name = "outstandAuthorizationAmtDec", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outstandAuthorizationAmtDec;
    @XmlElementRef(name = "earlySettlementDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> earlySettlementDate;
    @XmlElementRef(name = "payoffAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payoffAmount;
    @XmlElementRef(name = "interestPerDiem", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interestPerDiem;
    @XmlElementRef(name = "accrualDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accrualDate;
    @XmlElementRef(name = "accruedThroughDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accruedThroughDate;
    @XmlElementRef(name = "paymentDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentDate;
    @XmlElementRef(name = "billingCycle", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billingCycle;
    @XmlElementRef(name = "noOfReturnedCheques", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfReturnedCheques;
    @XmlElementRef(name = "lastReturnedChequeDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastReturnedChequeDate;
    @XmlElementRef(name = "lastPurchaseDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastPurchaseDate;
    @XmlElementRef(name = "lastAdvancedAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastAdvancedAmt;
    @XmlElementRef(name = "lastCashAdvanceDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastCashAdvanceDate;
    @XmlElementRef(name = "lastPurchaseAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastPurchaseAmt;
    @XmlElementRef(name = "lastPaymentAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastPaymentAmt;
    @XmlElementRef(name = "lastPaymentDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastPaymentDate;
    @XmlElementRef(name = "noOfAuthorisedTransaction", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfAuthorisedTransaction;
    @XmlElementRef(name = "authorisedAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authorisedAmount;
    @XmlElementRef(name = "authorisedCashAdvance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authorisedCashAdvance;
    @XmlElementRef(name = "lastCreditLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastCreditLimit;
    @XmlElementRef(name = "lastCreditLimitDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastCreditLimitDate;
    @XmlElementRef(name = "tmpLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tmpLimit;
    @XmlElementRef(name = "tmpLimitExpiryDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tmpLimitExpiryDate;
    @XmlElementRef(name = "availableCashLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> availableCashLimit;
    @XmlElementRef(name = "creditLimitDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditLimitDate;
    @XmlElementRef(name = "highBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> highBalance;
    @XmlElementRef(name = "highBalanceDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> highBalanceDate;
    @XmlElementRef(name = "cashBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashBalance;
    @XmlElementRef(name = "retailBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailBalance;
    @XmlElementRef(name = "outstandBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outstandBalance;
    @XmlElementRef(name = "lastStatement", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastStatement;
    @XmlElementRef(name = "ccmsCustomerID", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ccmsCustomerID;
    @XmlElementRef(name = "cardUsageStatus", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardUsageStatus;
    @XmlElementRef(name = "currYearCashAdvIntPaid", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currYearCashAdvIntPaid;
    @XmlElementRef(name = "lastYearCashAdvIntPaid", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastYearCashAdvIntPaid;
    @XmlElementRef(name = "currYearIntPaid", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currYearIntPaid;
    @XmlElementRef(name = "lastYearIntPaid", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastYearIntPaid;
    @XmlElementRef(name = "productTiedToCard", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productTiedToCard;
    @XmlElementRef(name = "lastTransactionDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastTransactionDate;
    @XmlElementRef(name = "lastActiveDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastActiveDate;
    @XmlElementRef(name = "pinReIssueDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pinReIssueDate;
    @XmlElementRef(name = "currentDueAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentDueAmount;
    @XmlElementRef(name = "totalDueAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalDueAmount;
    @XmlElementRef(name = "xdays", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xdays;
    @XmlElementRef(name = "embossingName1", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> embossingName1;
    @XmlElementRef(name = "embossingName2", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> embossingName2;
    @XmlElementRef(name = "embossingName3", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> embossingName3;
    @XmlElementRef(name = "embossingName4", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> embossingName4;
    @XmlElementRef(name = "autoDebit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> autoDebit;
    @XmlElementRef(name = "purgeDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purgeDate;
    @XmlElementRef(name = "region", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> region;
    @XmlElementRef(name = "singleDualCard", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> singleDualCard;
    @XmlElementRef(name = "lastReplacementDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastReplacementDate;
    @XmlElementRef(name = "membershipNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> membershipNo;
    @XmlElementRef(name = "cardExpiryDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardExpiryDate;
    @XmlElementRef(name = "behaviourScore", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> behaviourScore;
    @XmlElementRef(name = "customerRiskScore", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerRiskScore;
    @XmlElementRef(name = "exposureAtRisk", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exposureAtRisk;
    @XmlElementRef(name = "corporateCustomer", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corporateCustomer;
    @XmlElementRef(name = "paymentType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentType;
    @XmlElementRef(name = "paymentTypeDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentTypeDesc;
    @XmlElementRef(name = "paymentMethod", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentMethod;
    @XmlElementRef(name = "paymentMethodDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentMethodDesc;
    @XmlElementRef(name = "lastCardRequestDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastCardRequestDate;
    @XmlElementRef(name = "lastPinRequestDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastPinRequestDate;
    @XmlElementRef(name = "lastPinMaintenanceDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastPinMaintenanceDate;
    @XmlElementRef(name = "newTransferCardNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newTransferCardNo;
    @XmlElementRef(name = "transferEffectiveDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transferEffectiveDate;
    @XmlElementRef(name = "retailBaseRatePA", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailBaseRatePA;
    @XmlElementRef(name = "cashBaseRatePA", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashBaseRatePA;
    @XmlElementRef(name = "retailInterest", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailInterest;
    @XmlElementRef(name = "lateNotices", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lateNotices;
    @XmlElementRef(name = "serviceCharges", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceCharges;
    @XmlElementRef(name = "cashInterest", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashInterest;
    @XmlElementRef(name = "annualFees", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> annualFees;
    @XmlElementRef(name = "prePay", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prePay;
    @XmlElementRef(name = "lateCharges", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lateCharges;
    @XmlElementRef(name = "overlimitCharges", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overlimitCharges;
    @XmlElementRef(name = "totalDisputedAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalDisputedAmount;
    @XmlElementRef(name = "retailDisputeAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailDisputeAmount;
    @XmlElementRef(name = "cashDisputedAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashDisputedAmount;
    @XmlElementRef(name = "cardFeeDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardFeeDate;
    @XmlElementRef(name = "cardFeeAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardFeeAmount;
    @XmlElementRef(name = "ctdFees0", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ctdFees0;
    @XmlElementRef(name = "ctdFees1", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ctdFees1;
    @XmlElementRef(name = "ctdFees2", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ctdFees2;
    @XmlElementRef(name = "ctdFees3", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ctdFees3;
    @XmlElementRef(name = "userCode1", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userCode1;
    @XmlElementRef(name = "userCode2", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userCode2;
    @XmlElementRef(name = "userCode3", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userCode3;
    @XmlElementRef(name = "userCode4", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userCode4;
    @XmlElementRef(name = "permanentCreditLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permanentCreditLimit;
    @XmlElementRef(name = "availableRewardPoints", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> availableRewardPoints;
    @XmlElementRef(name = "rewardPointsErndInCurrCycle", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rewardPointsErndInCurrCycle;
    @XmlElementRef(name = "rewardPointsRedeemedInCurrCycle", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rewardPointsRedeemedInCurrCycle;
    @XmlElementRef(name = "previousStmtPoints", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousStmtPoints;
    @XmlElementRef(name = "lastDelinquencyDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastDelinquencyDate;
    @XmlElementRef(name = "priorDelinquencyDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priorDelinquencyDate;
    @XmlElementRef(name = "balance30Days", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> balance30Days;
    @XmlElementRef(name = "balance60Days", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> balance60Days;
    @XmlElementRef(name = "balance90Days", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> balance90Days;
    @XmlElementRef(name = "balance120Days", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> balance120Days;
    @XmlElementRef(name = "balance150Days", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> balance150Days;
    @XmlElementRef(name = "balance180Days", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> balance180Days;
    @XmlElementRef(name = "balance210Days", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> balance210Days;
    @XmlElementRef(name = "pastDueBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pastDueBalance;
    @XmlElementRef(name = "currencyCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "xDayBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xDayBalance;
    @XmlElementRef(name = "embossedName", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> embossedName;
    @XmlElementRef(name = "joiningFees", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> joiningFees;
    @XmlElementRef(name = "accountName", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountName;
    @XmlElementRef(name = "segmentCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segmentCode;
    @XmlElementRef(name = "segmentCodeDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segmentCodeDesc;
    @XmlElementRef(name = "curBlockCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curBlockCode;
    @XmlElementRef(name = "curBlockDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curBlockDate;
    @XmlElementRef(name = "block1", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block1;
    @XmlElementRef(name = "block1Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block1Date;
    @XmlElementRef(name = "block2", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block2;
    @XmlElementRef(name = "block2Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block2Date;
    @XmlElementRef(name = "block3", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block3;
    @XmlElementRef(name = "block3Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block3Date;
    @XmlElementRef(name = "block4", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block4;
    @XmlElementRef(name = "block4Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block4Date;
    @XmlElementRef(name = "block5", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block5;
    @XmlElementRef(name = "block5Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block5Date;
    @XmlElementRef(name = "block6", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block6;
    @XmlElementRef(name = "block6Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block6Date;
    @XmlElementRef(name = "block7", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block7;
    @XmlElementRef(name = "block7Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block7Date;
    @XmlElementRef(name = "block8", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block8;
    @XmlElementRef(name = "block8Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block8Date;
    @XmlElementRef(name = "block9", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block9;
    @XmlElementRef(name = "block9Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block9Date;
    @XmlElementRef(name = "block10", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block10;
    @XmlElementRef(name = "block10Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block10Date;
    @XmlElementRef(name = "block11", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block11;
    @XmlElementRef(name = "block11Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block11Date;
    @XmlElementRef(name = "block12", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block12;
    @XmlElementRef(name = "block12Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block12Date;
    @XmlElementRef(name = "block13", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block13;
    @XmlElementRef(name = "block13Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block13Date;
    @XmlElementRef(name = "block14", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block14;
    @XmlElementRef(name = "block14Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block14Date;
    @XmlElementRef(name = "block15", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block15;
    @XmlElementRef(name = "block15Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block15Date;
    @XmlElementRef(name = "block16", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block16;
    @XmlElementRef(name = "block16Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block16Date;
    @XmlElementRef(name = "block17", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block17;
    @XmlElementRef(name = "block17Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block17Date;
    @XmlElementRef(name = "block18", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block18;
    @XmlElementRef(name = "block18Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block18Date;
    @XmlElementRef(name = "block19", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block19;
    @XmlElementRef(name = "block19Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block19Date;
    @XmlElementRef(name = "block20", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block20;
    @XmlElementRef(name = "block20Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block20Date;
    @XmlElementRef(name = "block21", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block21;
    @XmlElementRef(name = "block21Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block21Date;
    @XmlElementRef(name = "block22", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block22;
    @XmlElementRef(name = "block22Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block22Date;
    @XmlElementRef(name = "block23", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block23;
    @XmlElementRef(name = "block23Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block23Date;
    @XmlElementRef(name = "block24", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block24;
    @XmlElementRef(name = "block24Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block24Date;
    @XmlElementRef(name = "block25", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block25;
    @XmlElementRef(name = "block25Date", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block25Date;
    @XmlElementRef(name = "nextPageKey", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nextPageKey;
    @XmlElementRef(name = "pageRequest", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pageRequest;
    @XmlElementRef(name = "creditLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditLimit;
    @XmlElementRef(name = "productCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productCode;
    @XmlElementRef(name = "productCodeDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productCodeDesc;
    @XmlElementRef(name = "cashLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashLimit;
    @XmlElementRef(name = "availableCredit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> availableCredit;
    @XmlElementRef(name = "advanceCash", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> advanceCash;
    @XmlElementRef(name = "currentBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentBalance;
    @XmlElementRef(name = "availableCreditLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> availableCreditLimit;
    @XmlElementRef(name = "retailAccruedInterest", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailAccruedInterest;
    @XmlElementRef(name = "cashAccruedInterest", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashAccruedInterest;
    @XmlElementRef(name = "referenceNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceNo;
    @XmlElementRef(name = "openedDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> openedDate;
    @XmlElementRef(name = "closedDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> closedDate;
    @XmlElementRef(name = "lastUpdate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdate;
    @XmlElementRef(name = "additionalAddress", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalAddress;
    @XmlElementRef(name = "corporateID", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corporateID;
    @XmlElementRef(name = "projectedAccruedInterest", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectedAccruedInterest;
    @XmlElementRef(name = "statementBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statementBalance;
    @XmlElementRef(name = "minimumDue", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minimumDue;
    @XmlElementRef(name = "postingFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postingFlag;
    @XmlElementRef(name = "statementFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statementFlag;
    @XmlElementRef(name = "SCOD", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scod;
    @XmlElementRef(name = "relationshipType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relationshipType;
    @XmlElementRef(name = "inCollectionIndicator", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inCollectionIndicator;
    @XmlElementRef(name = "paymentDueDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentDueDate;
    @XmlElementRef(name = "directDebitRoutingNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> directDebitRoutingNo;
    @XmlElementRef(name = "directDebitAccountNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> directDebitAccountNo;
    @XmlElementRef(name = "cardCategory", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardCategory;
    @XmlElementRef(name = "PROBEPermCreditLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> probePermCreditLimit;
    @XmlElementRef(name = "outstandingAuthAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outstandingAuthAmt;
    @XmlElementRef(name = "noOfTotalTrans", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfTotalTrans;
    @XmlElementRef(name = "noOfBilledTrans", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfBilledTrans;
    @XmlElementRef(name = "noOfUnbilledTrans", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfUnbilledTrans;
    @XmlElementRef(name = "entityID", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityID;
    @XmlElementRef(name = "entityType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityType;
    @XmlElementRef(name = "userID", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userID;
    @XmlElementRef(name = "hostID", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hostID;
    @XmlElementRef(name = "functionCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> functionCode;
    @XmlElementRef(name = "subFunctionCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subFunctionCode;
    @XmlElementRef(name = "pageTotal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pageTotal;
    @XmlElementRef(name = "organisationNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organisationNo;
    @XmlElementRef(name = "requestFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestFlag;
    @XmlElementRef(name = "lastSyncDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastSyncDate;
    @XmlElementRef(name = "cardProfile", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<CardProfile> cardProfile;
    @XmlElementRef(name = "temporaryCreditLimitEffDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> temporaryCreditLimitEffDate;
    @XmlElementRef(name = "permanentThershold", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permanentThershold;
    @XmlElementRef(name = "temporaryThershold", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> temporaryThershold;
    @XmlElementRef(name = "timeXDays", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeXDays;
    @XmlElementRef(name = "time30Days", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> time30Days;
    @XmlElementRef(name = "time60Days", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> time60Days;
    @XmlElementRef(name = "time90Days", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> time90Days;
    @XmlElementRef(name = "time120Days", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> time120Days;
    @XmlElementRef(name = "time150Days", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> time150Days;
    @XmlElementRef(name = "time180Days", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> time180Days;
    @XmlElementRef(name = "time210Days", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> time210Days;
    @XmlElementRef(name = "accountNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountNo;
    @XmlElementRef(name = "corporateCustDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corporateCustDesc;
    @XmlElementRef(name = "custRiskGrade", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custRiskGrade;
    @XmlElementRef(name = "custRiskGradeDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custRiskGradeDesc;
    @XmlElementRef(name = "dateRiskChange", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateRiskChange;
    @XmlElementRef(name = "ddaAcctNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ddaAcctNo;
    @XmlElementRef(name = "ddaBank", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ddaBank;
    @XmlElementRef(name = "DDASwiftBIC", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ddaSwiftBIC;
    @XmlElementRef(name = "ddaBankDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ddaBankDesc;
    @XmlElementRef(name = "collateral", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> collateral;
    @XmlElementRef(name = "systemID", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> systemID;
    @XmlElementRef(name = "statementCycle", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statementCycle;
    @XmlElementRef(name = "functionID", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> functionID;
    @XmlElementRef(name = "prevStmtBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prevStmtBalance;
    @XmlElementRef(name = "totalpointsForteited", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalpointsForteited;
    @XmlElementRef(name = "pointsEarned", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointsEarned;
    @XmlElementRef(name = "pointEarnedToday", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointEarnedToday;
    @XmlElementRef(name = "pointsUsed", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointsUsed;
    @XmlElementRef(name = "nextCashBackDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nextCashBackDate;
    @XmlElementRef(name = "pointsEarnedYTD", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointsEarnedYTD;
    @XmlElementRef(name = "panBankInd", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> panBankInd;
    @XmlElementRef(name = "limitFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> limitFlag;
    @XmlElementRef(name = "cashPymntAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashPymntAmt;
    @XmlElementRef(name = "retailPymntAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailPymntAmt;
    @XmlElementRef(name = "totalBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalBalance;
    @XmlElementRef(name = "lastStatementDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastStatementDate;
    @XmlElementRef(name = "affinityGroupNumber", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> affinityGroupNumber;
    @XmlElementRef(name = "pmntApportionment", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pmntApportionment;
    @XmlElementRef(name = "pmntApportionmentExpDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pmntApportionmentExpDate;
    @XmlElementRef(name = "accountType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountType;
    @XmlElementRef(name = "issuedDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> issuedDate;
    @XmlElementRef(name = "sendDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sendDate;
    @XmlElementRef(name = "OLCLetterDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> olcLetterDate;
    @XmlElementRef(name = "warningReportDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warningReportDate;
    @XmlElementRef(name = "remarks", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remarks;
    @XmlElementRef(name = "deliveryDemo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryDemo;
    @XmlElementRef(name = "deliveryMemo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryMemo;
    @XmlElementRef(name = "acknowledgementStatus", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acknowledgementStatus;
    @XmlElementRef(name = "acknowledgementStatusDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acknowledgementStatusDesc;
    @XmlElementRef(name = "registerNumber", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registerNumber;
    @XmlElementRef(name = "zipCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zipCode;
    @XmlElementRef(name = "mailingDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailingDate;
    @XmlElementRef(name = "processDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processDate;
    @XmlElementRef(name = "createdDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdDate;
    @XmlElementRef(name = "numberOfTxnsYTD", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberOfTxnsYTD;
    @XmlElementRef(name = "txnAmountYTD", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txnAmountYTD;
    @XmlElementRef(name = "barcodeNumber", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> barcodeNumber;
    @XmlElementRef(name = "NCCCMerchantCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ncccMerchantCode;
    @XmlElementRef(name = "itemNumber", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemNumber;
    @XmlElementRef(name = "numberOfCards", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberOfCards;
    @XmlElementRef(name = "returnReason", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnReason;
    @XmlElementRef(name = "returnReasonDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnReasonDesc;
    @XmlElementRef(name = "customerID", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerID;
    @XmlElementRef(name = "altCustID", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> altCustID;
    @XmlElementRef(name = "customerName", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerName;
    @XmlElementRef(name = "Address", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<CCAddress> address;
    @XmlElementRef(name = "actionDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actionDate;
    @XmlElementRef(name = "actionTaken", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actionTaken;
    @XmlElementRef(name = "actionTakenDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actionTakenDesc;
    @XmlElementRef(name = "pickupDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pickupDate;
    @XmlElementRef(name = "addressChanged", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressChanged;
    @XmlElementRef(name = "returnDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnDate;
    @XmlElementRef(name = "orderNumber", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderNumber;
    @XmlElementRef(name = "orderDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderDate;
    @XmlElementRef(name = "deliveryDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryDate;
    @XmlElementRef(name = "receivedDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receivedDate;
    @XmlElementRef(name = "processDays", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processDays;
    @XmlElementRef(name = "vendor", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendor;
    @XmlElementRef(name = "vendorDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorDesc;
    @XmlElementRef(name = "productName", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productName;
    @XmlElementRef(name = "productType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productType;
    @XmlElementRef(name = "productTypeDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productTypeDesc;
    @XmlElementRef(name = "redeemDollars", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redeemDollars;
    @XmlElementRef(name = "cashPayment", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashPayment;
    @XmlElementRef(name = "productNumber", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productNumber;
    @XmlElementRef(name = "customerNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerNo;
    @XmlElementRef(name = "applicationNumber", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicationNumber;
    @XmlElementRef(name = "applicationDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicationDate;
    @XmlElementRef(name = "transmissionDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transmissionDate;
    @XmlElementRef(name = "batchNumber", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> batchNumber;
    @XmlElementRef(name = "amountApplied", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> amountApplied;
    @XmlElementRef(name = "remitAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remitAmount;
    @XmlElementRef(name = "tenure", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tenure;
    @XmlElementRef(name = "remitDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remitDate;
    @XmlElementRef(name = "feeCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> feeCode;
    @XmlElementRef(name = "paymentMode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentMode;
    @XmlElementRef(name = "currentBlockCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentBlockCode;
    @XmlElementRef(name = "currentBlockDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentBlockDate;
    @XmlElementRef(name = "paymentIndicator", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentIndicator;
    @XmlElementRef(name = "availableFundTransferLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> availableFundTransferLimit;
    @XmlElementRef(name = "cashAdvOKFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashAdvOKFlag;
    @XmlElementRef(name = "fundXferOKFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fundXferOKFlag;
    @XmlElementRef(name = "noOfVisitThisYear", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfVisitThisYear;
    @XmlElementRef(name = "noOfVisitLastYear", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfVisitLastYear;
    @XmlElementRef(name = "totalFeeChargedCurrentYear", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalFeeChargedCurrentYear;
    @XmlElementRef(name = "totalFeeChargedLastYear", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalFeeChargedLastYear;
    @XmlElementRef(name = "noOfFreeVisitUsed", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfFreeVisitUsed;
    @XmlElementRef(name = "activationFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activationFlag;
    @XmlElementRef(name = "PermanentCashLimitPercent", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permanentCashLimitPercent;
    @XmlElementRef(name = "cashLimitMatrixPercent", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashLimitMatrixPercent;
    @XmlElementRef(name = "CashLimitPercent", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashLimitPercent;
    @XmlElementRef(name = "tmpCashLimitPercent", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tmpCashLimitPercent;
    @XmlElementRef(name = "amount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> amount;
    @XmlElementRef(name = "offeringCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> offeringCode;
    @XmlElementRef(name = "SIDebitAcctNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siDebitAcctNo;
    @XmlElementRef(name = "repaymentScore", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> repaymentScore;
    @XmlElementRef(name = "noOfParkingThisYear", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfParkingThisYear;
    @XmlElementRef(name = "noOfParkinLastYear", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfParkinLastYear;
    @XmlElementRef(name = "totalParkingFeeChargedCurrentYear", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalParkingFeeChargedCurrentYear;
    @XmlElementRef(name = "totalParkingFeeChargedLastYear", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalParkingFeeChargedLastYear;
    @XmlElementRef(name = "noOfFreeParkingUsed", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfFreeParkingUsed;
    @XmlElementRef(name = "reversalFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reversalFlag;
    @XmlElementRef(name = "mpsLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mpsLimit;
    @XmlElementRef(name = "mpsAvailLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mpsAvailLimit;
    @XmlElementRef(name = "mpsExpiryDt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mpsExpiryDt;
    @XmlElementRef(name = "mps1LimitUsed", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mps1LimitUsed;
    @XmlElementRef(name = "mps1AcctLimitUsed", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mps1AcctLimitUsed;
    @XmlElementRef(name = "mps1LastReqDt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mps1LastReqDt;
    @XmlElementRef(name = "mps1LastReqOnTempLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mps1LastReqOnTempLimit;
    @XmlElementRef(name = "mps2LimitUsed", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mps2LimitUsed;
    @XmlElementRef(name = "mps2AcctLimitUsed", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mps2AcctLimitUsed;
    @XmlElementRef(name = "mps3AcctLimitUsed", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mps3AcctLimitUsed;
    @XmlElementRef(name = "firstIntWaiverDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstIntWaiverDate;
    @XmlElementRef(name = "waivePenaltyIntCount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> waivePenaltyIntCount;
    @XmlElementRef(name = "lastResetDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastResetDate;
    @XmlElementRef(name = "availableCreditLimit2", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> availableCreditLimit2;
    @XmlElementRef(name = "availableCashLimit2", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> availableCashLimit2;
    @XmlElementRef(name = "revolverFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> revolverFlag;
    @XmlElementRef(name = "prefMerchant", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prefMerchant;
    @XmlElementRef(name = "capReachDtOverall", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> capReachDtOverall;
    @XmlElementRef(name = "capReachDtatPrefMerchant", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> capReachDtatPrefMerchant;
    @XmlElementRef(name = "noOfTotalRPCTrans", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfTotalRPCTrans;
    @XmlElementRef(name = "programCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> programCode;
    @XmlElementRef(name = "octopusCardNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> octopusCardNo;
    @XmlElementRef(name = "status", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "rejectReasonCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rejectReasonCode;
    @XmlElementRef(name = "interestRate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interestRate;
    @XmlElementRef(name = "flatRate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flatRate;
    @XmlElementRef(name = "tenor", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tenor;
    @XmlElementRef(name = "topupAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> topupAmt;
    @XmlElementRef(name = "topupDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> topupDate;
    @XmlElementRef(name = "topupFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> topupFlag;
    @XmlElementRef(name = "rewriteFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rewriteFlag;
    @XmlElementRef(name = "sequenceNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sequenceNo;
    @XmlElementRef(name = "statusUpdate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<MaintInfo> statusUpdate;
    @XmlElementRef(name = "blackList", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<MaintInfo> blackList;
    @XmlElementRef(name = "activeCount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeCount;
    @XmlElementRef(name = "openingBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> openingBalance;
    @XmlElementRef(name = "pointsEarnedBilled", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointsEarnedBilled;
    @XmlElementRef(name = "pointsRedeemedBilled", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointsRedeemedBilled;
    @XmlElementRef(name = "pointsEarnedUnbilled", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointsEarnedUnbilled;
    @XmlElementRef(name = "pointsRedeemedUnbilled", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointsRedeemedUnbilled;
    @XmlElementRef(name = "availableBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> availableBalance;
    @XmlElementRef(name = "expiryDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expiryDate;
    @XmlElementRef(name = "lastMinPymtDue", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastMinPymtDue;
    @XmlElementRef(name = "custAvailableCash", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custAvailableCash;
    @XmlElementRef(name = "custCreditLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custCreditLimit;
    @XmlElementRef(name = "custAvailableCredit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custAvailableCredit;
    @XmlElementRef(name = "postDueFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postDueFlag;
    @XmlElementRef(name = "bonusRewardPoints", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bonusRewardPoints;
    @XmlElementRef(name = "consolidatedCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consolidatedCode;
    @XmlElementRef(name = "linkedAcctNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> linkedAcctNo;
    @XmlElementRef(name = "orderAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderAmt;
    @XmlElementRef(name = "lastBillNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastBillNo;
    @XmlElementRef(name = "lastBillDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastBillDate;
    @XmlElementRef(name = "lastBillAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastBillAmt;
    @XmlElementRef(name = "debtorRefNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> debtorRefNo;
    @XmlElementRef(name = "statusUpdatedate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusUpdatedate;
    @XmlElementRef(name = "blacklistFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> blacklistFlag;
    @XmlElementRef(name = "blacklistReason", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> blacklistReason;
    @XmlElementRef(name = "blacklistDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> blacklistDate;
    @XmlElementRef(name = "openDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> openDate;
    @XmlElementRef(name = "reloadAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reloadAmt;
    @XmlElementRef(name = "autoPayAcctNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> autoPayAcctNo;
    @XmlElementRef(name = "futureExpiryDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> futureExpiryDate;
    @XmlElementRef(name = "ackUserId", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ackUserId;
    @XmlElementRef(name = "ackDtSurfMail", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ackDtSurfMail;
    @XmlElementRef(name = "ackDtRegMail", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ackDtRegMail;
    @XmlElementRef(name = "perpetuityPin", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> perpetuityPin;
    @XmlElementRef(name = "flexiPay", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flexiPay;
    @XmlElementRef(name = "srcCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDesc> srcCode;
    @XmlElementRef(name = "atmLang", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> atmLang;
    @XmlElementRef(name = "insureCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDesc> insureCode;
    @XmlElementRef(name = "currExpiryDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currExpiryDate;
    @XmlElementRef(name = "lateNoticesDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lateNoticesDesc;
    @XmlElementRef(name = "serviceChargesDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceChargesDesc;
    @XmlElementRef(name = "alternateBlockCodeDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternateBlockCodeDesc;
    @XmlElementRef(name = "organisation", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organisation;
    @XmlElementRef(name = "action", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> action;
    @XmlElementRef(name = "actionDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actionDesc;
    @XmlElementRef(name = "sequence", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sequence;
    @XmlElementRef(name = "cardsRequested", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardsRequested;
    @XmlElementRef(name = "supplementaryCards", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplementaryCards;
    @XmlElementRef(name = "supplementaryCardsDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplementaryCardsDesc;
    @XmlElementRef(name = "cardsIssued", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardsIssued;
    @XmlElementRef(name = "cardsReturned", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardsReturned;
    @XmlElementRef(name = "prevAction", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prevAction;
    @XmlElementRef(name = "prevActionDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prevActionDesc;
    @XmlElementRef(name = "cardFeatures", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardFeatures;
    @XmlElementRef(name = "lastExpiryDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastExpiryDate;
    @XmlElementRef(name = "profile01To06", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profile01To06;
    @XmlElementRef(name = "profile07To12", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profile07To12;
    @XmlElementRef(name = "profile13To18", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profile13To18;
    @XmlElementRef(name = "profile19To24", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profile19To24;
    @XmlElementRef(name = "CurrentTierRate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentTierRate;
    @XmlElementRef(name = "previousTierRate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousTierRate;
    @XmlElementRef(name = "profileLastEffDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileLastEffDate;
    @XmlElementRef(name = "profileLastMaintDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileLastMaintDate;
    @XmlElementRef(name = "primaryBlockCodeDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryBlockCodeDate;
    @XmlElementRef(name = "CVI", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cvi;
    @XmlElementRef(name = "principalCardFee", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> principalCardFee;
    @XmlElementRef(name = "supplementaryCardFee", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplementaryCardFee;
    @XmlElementRef(name = "nextStatementDt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nextStatementDt;
    @XmlElementRef(name = "pymtApportionmentFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pymtApportionmentFlag;
    @XmlElementRef(name = "fullPymt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fullPymt;
    @XmlElementRef(name = "directDebitBank", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> directDebitBank;
    @XmlElementRef(name = "lastActivityDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastActivityDate;
    @XmlElementRef(name = "overLimitOption", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overLimitOption;
    @XmlElementRef(name = "tierEffectiveDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tierEffectiveDate;
    @XmlElementRef(name = "newAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newAmt;
    @XmlElementRef(name = "stmtCycle", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stmtCycle;
    @XmlElementRef(name = "hoganCustIDInclusiveIDType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hoganCustIDInclusiveIDType;
    @XmlElementRef(name = "highYieldCAAcctNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> highYieldCAAcctNo;
    @XmlElementRef(name = "statementDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statementDate;
    @XmlElementRef(name = "requestType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestType;
    @XmlElementRef(name = "cardOrganization", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardOrganization;
    @XmlElementRef(name = "cardNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardNo;
    @XmlElementRef(name = "embosserName", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> embosserName;
    @XmlElementRef(name = "statusFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusFlag;
    @XmlElementRef(name = "statusDateChange", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusDateChange;
    @XmlElementRef(name = "statusTimeChange", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusTimeChange;
    @XmlElementRef(name = "phoneNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneNo;
    @XmlElementRef(name = "cardActivationChannel", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardActivationChannel;
    @XmlElementRef(name = "cardActivationDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardActivationDate;
    @XmlElementRef(name = "cardActivationTime", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardActivationTime;
    @XmlElementRef(name = "cardDeActivationChannel", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardDeActivationChannel;
    @XmlElementRef(name = "cardDeActivationDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardDeActivationDate;
    @XmlElementRef(name = "cardDeActivationTime", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardDeActivationTime;
    @XmlElementRef(name = "sourceFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceFlag;
    @XmlElementRef(name = "serviceRequestor", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceRequestor;
    @XmlElementRef(name = "custIDType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custIDType;
    @XmlElementRef(name = "custIDNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custIDNo;
    @XmlElementRef(name = "pageNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pageNo;
    @XmlElementRef(name = "cardInd", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardInd;
    @XmlElementRef(name = "returnCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnCode;
    @XmlElementRef(name = "returnDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnDesc;
    @XmlElementRef(name = "moreRecordInd", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> moreRecordInd;
    @XmlElementRef(name = "poBox", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poBox;
    @XmlElementRef(name = "postCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postCode;
    @XmlElementRef(name = "dateofBirth", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateofBirth;
    @XmlElementRef(name = "custCurrTotalPointsSIGN", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custCurrTotalPointsSIGN;
    @XmlElementRef(name = "custCurrTotalPoints", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custCurrTotalPoints;
    @XmlElementRef(name = "custCurrTotalCashDollarBalSign", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custCurrTotalCashDollarBalSign;
    @XmlElementRef(name = "custCurrTotalCashDollarBal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custCurrTotalCashDollarBal;
    @XmlElementRef(name = "redemFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redemFlag;
    @XmlElementRef(name = "redemType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redemType;
    @XmlElementRef(name = "orderDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderDesc;
    @XmlElementRef(name = "cardExpMonth", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardExpMonth;
    @XmlElementRef(name = "cardExpYear", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardExpYear;
    @XmlElementRef(name = "redemPoints", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redemPoints;
    @XmlElementRef(name = "cashRedem", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashRedem;
    @XmlElementRef(name = "topUpAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> topUpAmt;
    @XmlElementRef(name = "cashBackAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashBackAmt;
    @XmlElementRef(name = "tranDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tranDate;
    @XmlElementRef(name = "tranTime", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tranTime;
    @XmlElementRef(name = "tranAuthCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tranAuthCode;
    @XmlElementRef(name = "processingFeeAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processingFeeAmt;
    @XmlElementRef(name = "topUpStmtDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> topUpStmtDesc;
    @XmlElementRef(name = "feeStmtDesc", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> feeStmtDesc;
    @XmlElementRef(name = "custPointsBal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custPointsBal;
    @XmlElementRef(name = "custCashDollarBal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custCashDollarBal;
    @XmlElementRef(name = "authCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authCode;
    @XmlElementRef(name = "cardNoAuth", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardNoAuth;
    @XmlElementRef(name = "primaryShadowAcctNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryShadowAcctNo;
    @XmlElementRef(name = "transferCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transferCode;
    @XmlElementRef(name = "senderCardNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderCardNo;
    @XmlElementRef(name = "receiverCardNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverCardNo;
    @XmlElementRef(name = "pointsToBeTransferred", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointsToBeTransferred;
    @XmlElementRef(name = "transferFeeAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transferFeeAmt;
    @XmlElementRef(name = "senderPrimaryShadowAcct", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderPrimaryShadowAcct;
    @XmlElementRef(name = "receiverPrimaryShadowAcct", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverPrimaryShadowAcct;
    @XmlElementRef(name = "minpointsReqTransfer", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minpointsReqTransfer;
    @XmlElementRef(name = "maxpointsallowtransfer", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maxpointsallowtransfer;
    protected String inputFunction;
    protected String installmentProgram;
    protected String specialInstallmentProduct;
    protected String overseasInstallmentProduct;
    protected String normalInstallmentProduct;
    protected String inputDate;
    protected String inputBy;
    protected String cancelIndicator;
    protected String productAmount;
    protected String numberOfInstlmnt;
    protected String availableTransactionCounter;
    protected String availableTransactionAmount;
    protected String neAvailableTransactionCounter;
    protected String neAvailableTransactionAmount;
    protected String specialTransactionCounter;
    protected String neSpecialTransactionAmount;
    protected String overseaTransactionCounter;
    protected String neOverseaTransactionAmount;
    protected String normalTransactionCounter;
    protected String neNormalTransactionAmount;
    @XmlElementRef(name = "operatorID", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operatorID;
    @XmlElementRef(name = "availaCreditLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> availaCreditLimit;
    @XmlElementRef(name = "availaCashLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> availaCashLimit;
    @XmlElementRef(name = "creditLmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditLmt;
    @XmlElementRef(name = "cardExpyDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardExpyDate;
    @XmlElementRef(name = "lastMinAmountDue", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastMinAmountDue;
    @XmlElementRef(name = "consolidateCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consolidateCode;
    @XmlElementRef(name = "pastDueFlg", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pastDueFlg;
    @XmlElementRef(name = "crmODRowId", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crmODRowId;
    @XmlElementRef(name = "subProduct", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDesc> subProduct;
    @XmlElementRef(name = "branch", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDesc> branch;
    @XmlElementRef(name = "referralId", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referralId;
    @XmlElementRef(name = "sourcingId", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourcingId;
    @XmlElementRef(name = "closingId", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> closingId;
    @XmlElementRef(name = "lastStmtDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastStmtDate;
    @XmlElementRef(name = "rewardPointPrintedCurrentQuarter", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rewardPointPrintedCurrentQuarter;
    @XmlElementRef(name = "clientId", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientId;
    @XmlElementRef(name = "tokenId", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenId;
    @XmlElementRef(name = "firstOTP", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstOTP;
    @XmlElementRef(name = "secondOTP", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secondOTP;
    @XmlElementRef(name = "tokenCardInd", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenCardInd;
    @XmlElementRef(name = "tokenStatus", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenStatus;
    @XmlElementRef(name = "ddaPercentage", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ddaPercentage;
    @XmlElementRef(name = "ddaAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ddaAmount;
    @XmlElementRef(name = "totalStmtBal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalStmtBal;
    @XmlElementRef(name = "nickName", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nickName;
    @XmlElementRef(name = "coOwner", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coOwner;
    @XmlElementRef(name = "coOwnerOfficePhoneNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coOwnerOfficePhoneNo;
    @XmlElementRef(name = "memoLine", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memoLine;
    @XmlElementRef(name = "cardEmbossName", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardEmbossName;
    @XmlElementRef(name = "nricNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nricNo;
    @XmlElementRef(name = "tempBranch", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tempBranch;
    @XmlElementRef(name = "agentId", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agentId;
    @XmlElementRef(name = "tempLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tempLimit;
    @XmlElementRef(name = "tempLimitExpDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tempLimitExpDate;
    @XmlElementRef(name = "reasonOfRequest", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reasonOfRequest;
    @XmlElementRef(name = "approveOrDecline", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> approveOrDecline;
    @XmlElementRef(name = "approvalAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> approvalAmt;
    @XmlElementRef(name = "declineReason", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> declineReason;
    protected Forecast cardForecastDetails;
    @XmlElementRef(name = "lastPaymentAmtFCY", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastPaymentAmtFCY;
    @XmlElementRef(name = "pastDueAmountFCY", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pastDueAmountFCY;
    @XmlElementRef(name = "minPaymentFCY", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minPaymentFCY;
    @XmlElementRef(name = "balanceFCY", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> balanceFCY;
    @XmlElementRef(name = "minPaymentLCY", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minPaymentLCY;
    @XmlElementRef(name = "balanceLCY", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> balanceLCY;
    @XmlElementRef(name = "chipType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chipType;
    protected String dtCreditBalOccur;
    protected String existingFeeDt;
    protected String affinityFlag;
    @XmlElementRef(name = "startDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startDate;
    @XmlElementRef(name = "endDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endDate;
    @XmlElementRef(name = "custOrgNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custOrgNo;
    @XmlElementRef(name = "transactionCardNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionCardNo;
    @XmlElementRef(name = "transactionCardType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionCardType;
    @XmlElementRef(name = "transactionOrgNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionOrgNo;
    @XmlElementRef(name = "outOfBalanceFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outOfBalanceFlag;
    @XmlElementRef(name = "dualMailingFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dualMailingFlag;
    @XmlElementRef(name = "summaryInd", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> summaryInd;
    @XmlElementRef(name = "secondaryCustOrg", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secondaryCustOrg;
    @XmlElementRef(name = "secondaryCustNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secondaryCustNo;
    @XmlElementRef(name = "previousBlockCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousBlockCode;
    @XmlElementRef(name = "earnedCycleDt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> earnedCycleDt;
    @XmlElementRef(name = "usedCycleDt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usedCycleDt;
    @XmlElementRef(name = "totalBilledTransaction", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalBilledTransaction;
    @XmlElementRef(name = "tranType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tranType;
    @XmlElementRef(name = "bankNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankNo;
    @XmlElementRef(name = "srcName", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> srcName;
    @XmlElementRef(name = "branchNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> branchNo;
    @XmlElementRef(name = "operandNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operandNo;
    @XmlElementRef(name = "pinFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pinFlag;
    @XmlElementRef(name = "pin", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pin;
    @XmlElementRef(name = "outstandBalFCY", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outstandBalFCY;
    @XmlElementRef(name = "creditLimitFCY", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditLimitFCY;
    @XmlElementRef(name = "availableCreditLimitFCY", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> availableCreditLimitFCY;
    @XmlElementRef(name = "cashLimitFCY", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashLimitFCY;
    @XmlElementRef(name = "availableCashLimitFCY", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> availableCashLimitFCY;
    @XmlElementRef(name = "balCcyCodeFCY", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> balCcyCodeFCY;
    @XmlElementRef(name = "limitCcyCodeFCY", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> limitCcyCodeFCY;
    @XmlElementRef(name = "rewardFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rewardFlag;
    @XmlElementRef(name = "checkFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> checkFlag;
    @XmlElementRef(name = "points", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> points;
    @XmlElementRef(name = "startDt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startDt;
    @XmlElementRef(name = "endDt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endDt;
    @XmlElementRef(name = "rtnInd", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rtnInd;
    @XmlElementRef(name = "tranMonth", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tranMonth;
    @XmlElementRef(name = "postingDt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postingDt;
    @XmlElementRef(name = "tranNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tranNo;
    @XmlElementRef(name = "tranYr", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tranYr;
    @XmlElementRef(name = "option", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> option;
    @XmlElementRef(name = "enquiryFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enquiryFlag;
    @XmlElementRef(name = "idType", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idType;
    @XmlElementRef(name = "notesDt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notesDt;
    @XmlElementRef(name = "memoDt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memoDt;
    @XmlElementRef(name = "blockDt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> blockDt;
    @XmlElementRef(name = "paidAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paidAmt;
    @XmlElementRef(name = "adjustmentAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adjustmentAmt;
    @XmlElementRef(name = "interest", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interest;
    @XmlElementRef(name = "newBalance", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newBalance;
    @XmlElementRef(name = "lastUpdatedTime", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdatedTime;
    @XmlElementRef(name = "primaryCreditCardNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryCreditCardNo;
    @XmlElementRef(name = "flag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flag;
    @XmlElementRef(name = "stmtDay", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stmtDay;
    @XmlElementRef(name = "custCategory", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custCategory;
    @XmlElementRef(name = "groupAccNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupAccNo;
    @XmlElementRef(name = "friendName", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> friendName;
    @XmlElementRef(name = "favoriteCity", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> favoriteCity;
    @XmlElementRef(name = "favoriteColor", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> favoriteColor;
    @XmlElementRef(name = "cardStatus", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardStatus;
    @XmlElementRef(name = "suppCardInd", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suppCardInd;
    @XmlElementRef(name = "overCode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overCode;
    @XmlElementRef(name = "appOrigin", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> appOrigin;
    @XmlElementRef(name = "embossingDt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> embossingDt;
    @XmlElementRef(name = "firstYrFeeAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstYrFeeAmt;
    @XmlElementRef(name = "stmtMode", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stmtMode;
    @XmlElementRef(name = "eMail", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eMail;
    @XmlElementRef(name = "housing", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> housing;
    @XmlElementRef(name = "housingExt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> housingExt;
    protected String reserve;
    protected String keyType;
    @XmlElementRef(name = "groupAccBal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupAccBal;
    @XmlElementRef(name = "groupAccAuthBal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupAccAuthBal;
    @XmlElementRef(name = "groupAccOutstandBal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupAccOutstandBal;
    @XmlElementRef(name = "groupAccCashOutstandBal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupAccCashOutstandBal;
    @XmlElementRef(name = "groupAccLimit", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupAccLimit;
    @XmlElementRef(name = "tranGroup", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tranGroup;
    @XmlElementRef(name = "period", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> period;
    @XmlElementRef(name = "earlySettlementDt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> earlySettlementDt;
    @XmlElementRef(name = "arrearsFee", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrearsFee;
    @XmlElementRef(name = "overLimitFee", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overLimitFee;
    @XmlElementRef(name = "transactionFee", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionFee;
    @XmlElementRef(name = "governTaxes", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> governTaxes;
    @XmlElementRef(name = "preClosurePenalty", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preClosurePenalty;
    @XmlElementRef(name = "instPlanBal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instPlanBal;
    @XmlElementRef(name = "acctCcy", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acctCcy;
    @XmlElementRef(name = "fixedInstAmt", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fixedInstAmt;
    protected String emvChipEnabled;
    @XmlElementRef(name = "relshipNo", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relshipNo;
    @XmlElementRef(name = "primaryCust", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryCust;
    @XmlElementRef(name = "notesStored", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notesStored;
    protected String functionRequest;
    protected String pendingSCB;
    protected String optSCBRequest;
    protected String pendingManhattan;
    protected String optManhattanRequest;
    protected String pendingPrime;
    protected String optPrimeRequest;
    @XmlElementRef(name = "checkingAccount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> checkingAccount;
    @XmlElementRef(name = "savingsAccount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> savingsAccount;
    @XmlElementRef(name = "userAccount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userAccount;
    @XmlElementRef(name = "paymentFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentFlag;
    @XmlElementRef(name = "PDDMAmountDue", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pddmAmountDue;
    @XmlElementRef(name = "ownershipFlag", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownershipFlag;
    @XmlElementRef(name = "maximumSpecialAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maximumSpecialAmount;
    @XmlElementRef(name = "maximumOverseasAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maximumOverseasAmount;
    @XmlElementRef(name = "maximumNormAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maximumNormAmount;
    @XmlElementRef(name = "monthlyInstallmentAmountSpecial", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monthlyInstallmentAmountSpecial;
    @XmlElementRef(name = "handlingFeePercentageSpecial", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> handlingFeePercentageSpecial;
    @XmlElementRef(name = "handlingFeeAmountSpecial", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> handlingFeeAmountSpecial;
    @XmlElementRef(name = "monthlyInstallmentAmountOversea", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monthlyInstallmentAmountOversea;
    @XmlElementRef(name = "handlingFeePercentageOversea", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> handlingFeePercentageOversea;
    @XmlElementRef(name = "handlingFeeAmountOversea", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> handlingFeeAmountOversea;
    @XmlElementRef(name = "monthlyInstallmentAmountNormal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monthlyInstallmentAmountNormal;
    @XmlElementRef(name = "handlingFeePercentageNormal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> handlingFeePercentageNormal;
    @XmlElementRef(name = "handlingFeeAmountNormal", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> handlingFeeAmountNormal;
    @XmlElementRef(name = "specialProductAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialProductAmount;
    @XmlElementRef(name = "overseasProductAmount", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overseasProductAmount;
    @XmlElementRef(name = "contactlessIndicator", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactlessIndicator;
    @XmlElement(nillable = true)
    protected List<AuthTransaction> authTransaction;
    @XmlElement(name = "OAAATransaction", nillable = true)
    protected List<OAAATransaction> oaaaTransaction;
    @XmlElement(name = "RewardSummary", nillable = true)
    protected List<RewardSummary> rewardSummary;
    @XmlElement(name = "MerchandiseDetail", nillable = true)
    protected List<MerchandiseDetail> merchandiseDetail;
    @XmlElement(name = "CreditHistory", nillable = true)
    protected List<CreditHistory> creditHistory;
    @XmlElement(name = "Transaction", nillable = true)
    protected List<Transaction> transaction;
    @XmlElement(name = "UnbilledTransaction", nillable = true)
    protected List<Transaction> unbilledTransaction;
    @XmlElement(name = "Memo", nillable = true)
    protected List<Memo> memo;
    @XmlElement(name = "CurrentPot", nillable = true)
    protected List<Pot> currentPot;
    @XmlElement(name = "PendingPot", nillable = true)
    protected List<Pot> pendingPot;
    @XmlElement(name = "CurrentSubPot", nillable = true)
    protected List<Pot> currentSubPot;
    @XmlElement(name = "PendingSubPot", nillable = true)
    protected List<Pot> pendingSubPot;
    @XmlElement(name = "SupplimentCard", nillable = true)
    protected List<SupplimentCard> supplimentCard;
    @XmlElement(name = "CardDetails", nillable = true)
    protected List<CardDetails> cardDetails;
    @XmlElement(nillable = true)
    protected List<CardAccessDetails> cardAccessDet;
    @XmlElement(nillable = true)
    protected List<CashOneDetails> cashOneDet;
    @XmlElement(name = "EarningDetails", nillable = true)
    protected List<EarningDetails> earningDetails;
    @XmlElement(name = "BalanceHistory", nillable = true)
    protected List<BalanceHistory> balanceHistory;
    @XmlElement(name = "PanBankInfo", nillable = true)
    protected List<PanBankInfo> panBankInfo;
    @XmlElement(name = "ACCELProgramInfo", nillable = true)
    protected List<ACCELProgramInfo> accelProgramInfo;
    @XmlElement(name = "MerchantDetails", nillable = true)
    protected List<MerchantDetail> merchantDetails;
    @XmlElement(name = "StatusHistory", nillable = true)
    protected List<StatusHistory> statusHistory;
    @XmlElement(name = "StatementHistory", nillable = true)
    protected List<StatementHistory> statementHistory;
    @XmlElement(name = "PriorityPassDetails", nillable = true)
    protected List<PriorityPassDetail> priorityPassDetails;
    @XmlElement(name = "PurgeDetails", nillable = true)
    protected List<PurgeDetails> purgeDetails;
    @XmlElement(name = "BlockDetails", nillable = true)
    protected List<BlockDetail> blockDetails;
    @XmlElement(name = "PastTransactions", nillable = true)
    protected List<PastTransactions> pastTransactions;
    @XmlElement(name = "SupplementaryCardholderDetails", nillable = true)
    protected List<SupplementaryCardholderDetails> supplementaryCardholderDetails;
    @XmlElement(name = "AirlineMembership", nillable = true)
    protected List<AirlineMembership> airlineMembership;
    @XmlElement(name = "PLCCardDetails", nillable = true)
    protected List<PLCCardDetails> plcCardDetails;
    @XmlElement(name = "CallInTransactions", nillable = true)
    protected List<CallInTxns> callInTransactions;
    @XmlElement(name = "VIPUsageTransactions", nillable = true)
    protected List<VIPUsageTransactions> vipUsageTransactions;
    @XmlElement(name = "AirportParking", nillable = true)
    protected List<AirportParking> airportParking;
    @XmlElement(name = "SMSAlerts", nillable = true)
    protected List<SMSAlerts> smsAlerts;
    @XmlElement(name = "IDRPDetails", nillable = true)
    protected List<IDRPDtls> idrpDetails;
    @XmlElement(name = "CardInsurance", nillable = true)
    protected List<CardInsurance> cardInsurance;
    @XmlElement(name = "CardService", nillable = true)
    protected List<Service> cardService;
    @XmlElement(name = "PenaltyWaiver", nillable = true)
    protected List<PenaltyWaiver> penaltyWaiver;
    @XmlElement(name = "RewardTransactionDetails", nillable = true)
    protected List<RewardTransactionDetails> rewardTransactionDetails;
    @XmlElement(name = "RewardHistory", nillable = true)
    protected List<RewardHistory> rewardHistory;
    @XmlElement(name = "CardRPCTransactionHistory", nillable = true)
    protected List<CardRPC> cardRPCTransactionHistory;
    @XmlElement(name = "CardMultipleBonusEnquiry", nillable = true)
    protected List<Reward> cardMultipleBonusEnquiry;
    @XmlElement(name = "EarlyRepaymentSavingsDetails", nillable = true)
    protected List<EarlyRepaySavings> earlyRepaymentSavingsDetails;
    @XmlElement(name = "LineBurnDetails", nillable = true)
    protected List<LineBurn> lineBurnDetails;
    @XmlElement(name = "CampaignDetails", nillable = true)
    protected List<CampaignDet> campaignDetails;
    @XmlElement(name = "ThirteenMonthHistory", nillable = true)
    protected List<ThirteenMonth> thirteenMonthHistory;
    @XmlElement(name = "TaxDetails", nillable = true)
    protected List<TaxDet> taxDetails;
    @XmlElement(name = "DrawDownDetails", nillable = true)
    protected List<DrawDown> drawDownDetails;
    @XmlElement(name = "CustomerDetails", nillable = true)
    protected List<CustDet> customerDetails;
    @XmlElement(name = "PricingHistory", nillable = true)
    protected List<PricingHistory> pricingHistory;
    @XmlElement(name = "TopupHistory", nillable = true)
    protected List<TopupHistory> topupHistory;
    @XmlElement(name = "Forecast", nillable = true)
    protected List<Forecast> forecast;
    @XmlElement(name = "Tier", nillable = true)
    protected List<Tier> tier;
    @XmlElement(name = "Gift", nillable = true)
    protected List<Gift> gift;
    @XmlElement(name = "EarnDetails", nillable = true)
    protected List<EarnDetails> earnDetails;
    @XmlElement(name = "CardSummaryDtl", nillable = true)
    protected List<CardSummaryDtl> cardSummaryDtl;
    @XmlElement(name = "TransactionDetails", nillable = true)
    protected List<TransactionDetails> transactionDetails;
    @XmlElement(name = "BalanceBucketsHistory", nillable = true)
    protected List<BalanceBucketsHistory> balanceBucketsHistory;
    @XmlElement(name = "TokenCardList", nillable = true)
    protected List<TokenCardList> tokenCardList;
    @XmlElement(name = "EmbossingDetails", nillable = true)
    protected List<EmbossingDetails> embossingDetails;
    @XmlElement(name = "LinkedCards", nillable = true)
    protected List<LinkedCards> linkedCards;
    @XmlElement(name = "PaymentHistory", nillable = true)
    protected List<PaymentHistory> paymentHistory;
    @XmlElement(name = "InstallmentPlan", nillable = true)
    protected List<InstallmentPlan> installmentPlan;
    @XmlElement(name = "SubAcctDtl", nillable = true)
    protected List<SubAcctDtl> subAcctDtl;
    @XmlElement(name = "PrimaryCard", nillable = true)
    protected List<PrimaryCard> primaryCard;
    @XmlElement(name = "NotesData", nillable = true)
    protected List<NotesData> notesData;
    @XmlElement(name = "SCBOverlimit", nillable = true)
    protected List<SCBOverlimit> scbOverlimit;
    @XmlElement(name = "ManhattanOverlimit", nillable = true)
    protected List<ManhattanOverlimit> manhattanOverlimit;
    @XmlElement(name = "PrimeOverlimit", nillable = true)
    protected List<PrimeOverlimit> primeOverlimit;
    @XmlElement(name = "MonthtoDateDetails", nillable = true)
    protected List<MonthtoDateDetails> monthtoDateDetails;
    @XmlElement(name = "MonthlyInstallmentDetails", nillable = true)
    protected List<MonthlyInstallmentDetails> monthlyInstallmentDetails;
    @XmlElementRef(name = "Response", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceResponse> response;

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
     * Gets the value of the cardTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardTypeDesc() {
        return cardTypeDesc;
    }

    /**
     * Sets the value of the cardTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardTypeDesc(JAXBElement<String> value) {
        this.cardTypeDesc = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct(JAXBElement<String> value) {
        this.product = value;
    }

    /**
     * Gets the value of the productDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductDesc() {
        return productDesc;
    }

    /**
     * Sets the value of the productDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductDesc(JAXBElement<String> value) {
        this.productDesc = value;
    }

    /**
     * Gets the value of the cardHolderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardHolderStatus() {
        return cardHolderStatus;
    }

    /**
     * Sets the value of the cardHolderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardHolderStatus(JAXBElement<String> value) {
        this.cardHolderStatus = value;
    }

    /**
     * Gets the value of the cardHolderStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardHolderStatusDesc() {
        return cardHolderStatusDesc;
    }

    /**
     * Sets the value of the cardHolderStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardHolderStatusDesc(JAXBElement<String> value) {
        this.cardHolderStatusDesc = value;
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
     * Gets the value of the blockCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlockCodeDesc() {
        return blockCodeDesc;
    }

    /**
     * Sets the value of the blockCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlockCodeDesc(JAXBElement<String> value) {
        this.blockCodeDesc = value;
    }

    /**
     * Gets the value of the primaryBlockCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryBlockCode() {
        return primaryBlockCode;
    }

    /**
     * Sets the value of the primaryBlockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryBlockCode(JAXBElement<String> value) {
        this.primaryBlockCode = value;
    }

    /**
     * Gets the value of the alternateBlockCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlternateBlockCode() {
        return alternateBlockCode;
    }

    /**
     * Sets the value of the alternateBlockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlternateBlockCode(JAXBElement<String> value) {
        this.alternateBlockCode = value;
    }

    /**
     * Gets the value of the relationshipNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelationshipNo() {
        return relationshipNo;
    }

    /**
     * Sets the value of the relationshipNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelationshipNo(JAXBElement<String> value) {
        this.relationshipNo = value;
    }

    /**
     * Gets the value of the stmtType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStmtType() {
        return stmtType;
    }

    /**
     * Sets the value of the stmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStmtType(JAXBElement<String> value) {
        this.stmtType = value;
    }

    /**
     * Gets the value of the stmtBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStmtBalance() {
        return stmtBalance;
    }

    /**
     * Sets the value of the stmtBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStmtBalance(JAXBElement<String> value) {
        this.stmtBalance = value;
    }

    /**
     * Gets the value of the pastDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPastDueAmount() {
        return pastDueAmount;
    }

    /**
     * Sets the value of the pastDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPastDueAmount(JAXBElement<String> value) {
        this.pastDueAmount = value;
    }

    /**
     * Gets the value of the previousBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousBalance() {
        return previousBalance;
    }

    /**
     * Sets the value of the previousBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousBalance(JAXBElement<String> value) {
        this.previousBalance = value;
    }

    /**
     * Gets the value of the paymentCredt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentCredt() {
        return paymentCredt;
    }

    /**
     * Sets the value of the paymentCredt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentCredt(JAXBElement<String> value) {
        this.paymentCredt = value;
    }

    /**
     * Gets the value of the purchaseDebit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurchaseDebit() {
        return purchaseDebit;
    }

    /**
     * Sets the value of the purchaseDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurchaseDebit(JAXBElement<String> value) {
        this.purchaseDebit = value;
    }

    /**
     * Gets the value of the cashAdvance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashAdvance() {
        return cashAdvance;
    }

    /**
     * Sets the value of the cashAdvance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashAdvance(JAXBElement<String> value) {
        this.cashAdvance = value;
    }

    /**
     * Gets the value of the financialCharges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinancialCharges() {
        return financialCharges;
    }

    /**
     * Sets the value of the financialCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinancialCharges(JAXBElement<String> value) {
        this.financialCharges = value;
    }

    /**
     * Gets the value of the stmtDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStmtDate() {
        return stmtDate;
    }

    /**
     * Sets the value of the stmtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStmtDate(JAXBElement<String> value) {
        this.stmtDate = value;
    }

    /**
     * Gets the value of the cycleDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCycleDays() {
        return cycleDays;
    }

    /**
     * Sets the value of the cycleDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCycleDays(JAXBElement<String> value) {
        this.cycleDays = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDueDate(JAXBElement<String> value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the minAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinAmountDue() {
        return minAmountDue;
    }

    /**
     * Sets the value of the minAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinAmountDue(JAXBElement<String> value) {
        this.minAmountDue = value;
    }

    /**
     * Gets the value of the lastActivity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastActivity() {
        return lastActivity;
    }

    /**
     * Sets the value of the lastActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastActivity(JAXBElement<String> value) {
        this.lastActivity = value;
    }

    /**
     * Gets the value of the noOfTotalAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfTotalAuthorization() {
        return noOfTotalAuthorization;
    }

    /**
     * Sets the value of the noOfTotalAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfTotalAuthorization(JAXBElement<String> value) {
        this.noOfTotalAuthorization = value;
    }

    /**
     * Gets the value of the totalAuthorizationAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalAuthorizationAmt() {
        return totalAuthorizationAmt;
    }

    /**
     * Sets the value of the totalAuthorizationAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalAuthorizationAmt(JAXBElement<String> value) {
        this.totalAuthorizationAmt = value;
    }

    /**
     * Gets the value of the noOfTodayAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfTodayAuthorization() {
        return noOfTodayAuthorization;
    }

    /**
     * Sets the value of the noOfTodayAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfTodayAuthorization(JAXBElement<String> value) {
        this.noOfTodayAuthorization = value;
    }

    /**
     * Gets the value of the todayAuthorizationAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTodayAuthorizationAmt() {
        return todayAuthorizationAmt;
    }

    /**
     * Sets the value of the todayAuthorizationAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTodayAuthorizationAmt(JAXBElement<String> value) {
        this.todayAuthorizationAmt = value;
    }

    /**
     * Gets the value of the noOfOutstandAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfOutstandAuthorization() {
        return noOfOutstandAuthorization;
    }

    /**
     * Sets the value of the noOfOutstandAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfOutstandAuthorization(JAXBElement<String> value) {
        this.noOfOutstandAuthorization = value;
    }

    /**
     * Gets the value of the outstandAuthorizationAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutstandAuthorizationAmt() {
        return outstandAuthorizationAmt;
    }

    /**
     * Sets the value of the outstandAuthorizationAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutstandAuthorizationAmt(JAXBElement<String> value) {
        this.outstandAuthorizationAmt = value;
    }

    /**
     * Gets the value of the outstandAuthorizationAmtDec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutstandAuthorizationAmtDec() {
        return outstandAuthorizationAmtDec;
    }

    /**
     * Sets the value of the outstandAuthorizationAmtDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutstandAuthorizationAmtDec(JAXBElement<String> value) {
        this.outstandAuthorizationAmtDec = value;
    }

    /**
     * Gets the value of the earlySettlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEarlySettlementDate() {
        return earlySettlementDate;
    }

    /**
     * Sets the value of the earlySettlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEarlySettlementDate(JAXBElement<String> value) {
        this.earlySettlementDate = value;
    }

    /**
     * Gets the value of the payoffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayoffAmount() {
        return payoffAmount;
    }

    /**
     * Sets the value of the payoffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayoffAmount(JAXBElement<String> value) {
        this.payoffAmount = value;
    }

    /**
     * Gets the value of the interestPerDiem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterestPerDiem() {
        return interestPerDiem;
    }

    /**
     * Sets the value of the interestPerDiem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterestPerDiem(JAXBElement<String> value) {
        this.interestPerDiem = value;
    }

    /**
     * Gets the value of the accrualDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccrualDate() {
        return accrualDate;
    }

    /**
     * Sets the value of the accrualDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccrualDate(JAXBElement<String> value) {
        this.accrualDate = value;
    }

    /**
     * Gets the value of the accruedThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccruedThroughDate() {
        return accruedThroughDate;
    }

    /**
     * Sets the value of the accruedThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccruedThroughDate(JAXBElement<String> value) {
        this.accruedThroughDate = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentDate(JAXBElement<String> value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the billingCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillingCycle() {
        return billingCycle;
    }

    /**
     * Sets the value of the billingCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillingCycle(JAXBElement<String> value) {
        this.billingCycle = value;
    }

    /**
     * Gets the value of the noOfReturnedCheques property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfReturnedCheques() {
        return noOfReturnedCheques;
    }

    /**
     * Sets the value of the noOfReturnedCheques property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfReturnedCheques(JAXBElement<String> value) {
        this.noOfReturnedCheques = value;
    }

    /**
     * Gets the value of the lastReturnedChequeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastReturnedChequeDate() {
        return lastReturnedChequeDate;
    }

    /**
     * Sets the value of the lastReturnedChequeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastReturnedChequeDate(JAXBElement<String> value) {
        this.lastReturnedChequeDate = value;
    }

    /**
     * Gets the value of the lastPurchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastPurchaseDate() {
        return lastPurchaseDate;
    }

    /**
     * Sets the value of the lastPurchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastPurchaseDate(JAXBElement<String> value) {
        this.lastPurchaseDate = value;
    }

    /**
     * Gets the value of the lastAdvancedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastAdvancedAmt() {
        return lastAdvancedAmt;
    }

    /**
     * Sets the value of the lastAdvancedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastAdvancedAmt(JAXBElement<String> value) {
        this.lastAdvancedAmt = value;
    }

    /**
     * Gets the value of the lastCashAdvanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastCashAdvanceDate() {
        return lastCashAdvanceDate;
    }

    /**
     * Sets the value of the lastCashAdvanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastCashAdvanceDate(JAXBElement<String> value) {
        this.lastCashAdvanceDate = value;
    }

    /**
     * Gets the value of the lastPurchaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastPurchaseAmt() {
        return lastPurchaseAmt;
    }

    /**
     * Sets the value of the lastPurchaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastPurchaseAmt(JAXBElement<String> value) {
        this.lastPurchaseAmt = value;
    }

    /**
     * Gets the value of the lastPaymentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastPaymentAmt() {
        return lastPaymentAmt;
    }

    /**
     * Sets the value of the lastPaymentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastPaymentAmt(JAXBElement<String> value) {
        this.lastPaymentAmt = value;
    }

    /**
     * Gets the value of the lastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastPaymentDate() {
        return lastPaymentDate;
    }

    /**
     * Sets the value of the lastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastPaymentDate(JAXBElement<String> value) {
        this.lastPaymentDate = value;
    }

    /**
     * Gets the value of the noOfAuthorisedTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfAuthorisedTransaction() {
        return noOfAuthorisedTransaction;
    }

    /**
     * Sets the value of the noOfAuthorisedTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfAuthorisedTransaction(JAXBElement<String> value) {
        this.noOfAuthorisedTransaction = value;
    }

    /**
     * Gets the value of the authorisedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthorisedAmount() {
        return authorisedAmount;
    }

    /**
     * Sets the value of the authorisedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthorisedAmount(JAXBElement<String> value) {
        this.authorisedAmount = value;
    }

    /**
     * Gets the value of the authorisedCashAdvance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthorisedCashAdvance() {
        return authorisedCashAdvance;
    }

    /**
     * Sets the value of the authorisedCashAdvance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthorisedCashAdvance(JAXBElement<String> value) {
        this.authorisedCashAdvance = value;
    }

    /**
     * Gets the value of the lastCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastCreditLimit() {
        return lastCreditLimit;
    }

    /**
     * Sets the value of the lastCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastCreditLimit(JAXBElement<String> value) {
        this.lastCreditLimit = value;
    }

    /**
     * Gets the value of the lastCreditLimitDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastCreditLimitDate() {
        return lastCreditLimitDate;
    }

    /**
     * Sets the value of the lastCreditLimitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastCreditLimitDate(JAXBElement<String> value) {
        this.lastCreditLimitDate = value;
    }

    /**
     * Gets the value of the tmpLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTmpLimit() {
        return tmpLimit;
    }

    /**
     * Sets the value of the tmpLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTmpLimit(JAXBElement<String> value) {
        this.tmpLimit = value;
    }

    /**
     * Gets the value of the tmpLimitExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTmpLimitExpiryDate() {
        return tmpLimitExpiryDate;
    }

    /**
     * Sets the value of the tmpLimitExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTmpLimitExpiryDate(JAXBElement<String> value) {
        this.tmpLimitExpiryDate = value;
    }

    /**
     * Gets the value of the availableCashLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvailableCashLimit() {
        return availableCashLimit;
    }

    /**
     * Sets the value of the availableCashLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvailableCashLimit(JAXBElement<String> value) {
        this.availableCashLimit = value;
    }

    /**
     * Gets the value of the creditLimitDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditLimitDate() {
        return creditLimitDate;
    }

    /**
     * Sets the value of the creditLimitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditLimitDate(JAXBElement<String> value) {
        this.creditLimitDate = value;
    }

    /**
     * Gets the value of the highBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHighBalance() {
        return highBalance;
    }

    /**
     * Sets the value of the highBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHighBalance(JAXBElement<String> value) {
        this.highBalance = value;
    }

    /**
     * Gets the value of the highBalanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHighBalanceDate() {
        return highBalanceDate;
    }

    /**
     * Sets the value of the highBalanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHighBalanceDate(JAXBElement<String> value) {
        this.highBalanceDate = value;
    }

    /**
     * Gets the value of the cashBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashBalance() {
        return cashBalance;
    }

    /**
     * Sets the value of the cashBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashBalance(JAXBElement<String> value) {
        this.cashBalance = value;
    }

    /**
     * Gets the value of the retailBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailBalance() {
        return retailBalance;
    }

    /**
     * Sets the value of the retailBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailBalance(JAXBElement<String> value) {
        this.retailBalance = value;
    }

    /**
     * Gets the value of the outstandBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutstandBalance() {
        return outstandBalance;
    }

    /**
     * Sets the value of the outstandBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutstandBalance(JAXBElement<String> value) {
        this.outstandBalance = value;
    }

    /**
     * Gets the value of the lastStatement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastStatement() {
        return lastStatement;
    }

    /**
     * Sets the value of the lastStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastStatement(JAXBElement<String> value) {
        this.lastStatement = value;
    }

    /**
     * Gets the value of the ccmsCustomerID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcmsCustomerID() {
        return ccmsCustomerID;
    }

    /**
     * Sets the value of the ccmsCustomerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcmsCustomerID(JAXBElement<String> value) {
        this.ccmsCustomerID = value;
    }

    /**
     * Gets the value of the cardUsageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardUsageStatus() {
        return cardUsageStatus;
    }

    /**
     * Sets the value of the cardUsageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardUsageStatus(JAXBElement<String> value) {
        this.cardUsageStatus = value;
    }

    /**
     * Gets the value of the currYearCashAdvIntPaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrYearCashAdvIntPaid() {
        return currYearCashAdvIntPaid;
    }

    /**
     * Sets the value of the currYearCashAdvIntPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrYearCashAdvIntPaid(JAXBElement<String> value) {
        this.currYearCashAdvIntPaid = value;
    }

    /**
     * Gets the value of the lastYearCashAdvIntPaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastYearCashAdvIntPaid() {
        return lastYearCashAdvIntPaid;
    }

    /**
     * Sets the value of the lastYearCashAdvIntPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastYearCashAdvIntPaid(JAXBElement<String> value) {
        this.lastYearCashAdvIntPaid = value;
    }

    /**
     * Gets the value of the currYearIntPaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrYearIntPaid() {
        return currYearIntPaid;
    }

    /**
     * Sets the value of the currYearIntPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrYearIntPaid(JAXBElement<String> value) {
        this.currYearIntPaid = value;
    }

    /**
     * Gets the value of the lastYearIntPaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastYearIntPaid() {
        return lastYearIntPaid;
    }

    /**
     * Sets the value of the lastYearIntPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastYearIntPaid(JAXBElement<String> value) {
        this.lastYearIntPaid = value;
    }

    /**
     * Gets the value of the productTiedToCard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductTiedToCard() {
        return productTiedToCard;
    }

    /**
     * Sets the value of the productTiedToCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductTiedToCard(JAXBElement<String> value) {
        this.productTiedToCard = value;
    }

    /**
     * Gets the value of the lastTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastTransactionDate() {
        return lastTransactionDate;
    }

    /**
     * Sets the value of the lastTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastTransactionDate(JAXBElement<String> value) {
        this.lastTransactionDate = value;
    }

    /**
     * Gets the value of the lastActiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastActiveDate() {
        return lastActiveDate;
    }

    /**
     * Sets the value of the lastActiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastActiveDate(JAXBElement<String> value) {
        this.lastActiveDate = value;
    }

    /**
     * Gets the value of the pinReIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinReIssueDate() {
        return pinReIssueDate;
    }

    /**
     * Sets the value of the pinReIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinReIssueDate(JAXBElement<String> value) {
        this.pinReIssueDate = value;
    }

    /**
     * Gets the value of the currentDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentDueAmount() {
        return currentDueAmount;
    }

    /**
     * Sets the value of the currentDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentDueAmount(JAXBElement<String> value) {
        this.currentDueAmount = value;
    }

    /**
     * Gets the value of the totalDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalDueAmount() {
        return totalDueAmount;
    }

    /**
     * Sets the value of the totalDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalDueAmount(JAXBElement<String> value) {
        this.totalDueAmount = value;
    }

    /**
     * Gets the value of the xdays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXdays() {
        return xdays;
    }

    /**
     * Sets the value of the xdays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXdays(JAXBElement<String> value) {
        this.xdays = value;
    }

    /**
     * Gets the value of the embossingName1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmbossingName1() {
        return embossingName1;
    }

    /**
     * Sets the value of the embossingName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmbossingName1(JAXBElement<String> value) {
        this.embossingName1 = value;
    }

    /**
     * Gets the value of the embossingName2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmbossingName2() {
        return embossingName2;
    }

    /**
     * Sets the value of the embossingName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmbossingName2(JAXBElement<String> value) {
        this.embossingName2 = value;
    }

    /**
     * Gets the value of the embossingName3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmbossingName3() {
        return embossingName3;
    }

    /**
     * Sets the value of the embossingName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmbossingName3(JAXBElement<String> value) {
        this.embossingName3 = value;
    }

    /**
     * Gets the value of the embossingName4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmbossingName4() {
        return embossingName4;
    }

    /**
     * Sets the value of the embossingName4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmbossingName4(JAXBElement<String> value) {
        this.embossingName4 = value;
    }

    /**
     * Gets the value of the autoDebit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutoDebit() {
        return autoDebit;
    }

    /**
     * Sets the value of the autoDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutoDebit(JAXBElement<String> value) {
        this.autoDebit = value;
    }

    /**
     * Gets the value of the purgeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurgeDate() {
        return purgeDate;
    }

    /**
     * Sets the value of the purgeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurgeDate(JAXBElement<String> value) {
        this.purgeDate = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegion(JAXBElement<String> value) {
        this.region = value;
    }

    /**
     * Gets the value of the singleDualCard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSingleDualCard() {
        return singleDualCard;
    }

    /**
     * Sets the value of the singleDualCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSingleDualCard(JAXBElement<String> value) {
        this.singleDualCard = value;
    }

    /**
     * Gets the value of the lastReplacementDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastReplacementDate() {
        return lastReplacementDate;
    }

    /**
     * Sets the value of the lastReplacementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastReplacementDate(JAXBElement<String> value) {
        this.lastReplacementDate = value;
    }

    /**
     * Gets the value of the membershipNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMembershipNo() {
        return membershipNo;
    }

    /**
     * Sets the value of the membershipNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMembershipNo(JAXBElement<String> value) {
        this.membershipNo = value;
    }

    /**
     * Gets the value of the cardExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardExpiryDate() {
        return cardExpiryDate;
    }

    /**
     * Sets the value of the cardExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardExpiryDate(JAXBElement<String> value) {
        this.cardExpiryDate = value;
    }

    /**
     * Gets the value of the behaviourScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBehaviourScore() {
        return behaviourScore;
    }

    /**
     * Sets the value of the behaviourScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBehaviourScore(JAXBElement<String> value) {
        this.behaviourScore = value;
    }

    /**
     * Gets the value of the customerRiskScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerRiskScore() {
        return customerRiskScore;
    }

    /**
     * Sets the value of the customerRiskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerRiskScore(JAXBElement<String> value) {
        this.customerRiskScore = value;
    }

    /**
     * Gets the value of the exposureAtRisk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExposureAtRisk() {
        return exposureAtRisk;
    }

    /**
     * Sets the value of the exposureAtRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExposureAtRisk(JAXBElement<String> value) {
        this.exposureAtRisk = value;
    }

    /**
     * Gets the value of the corporateCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorporateCustomer() {
        return corporateCustomer;
    }

    /**
     * Sets the value of the corporateCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorporateCustomer(JAXBElement<String> value) {
        this.corporateCustomer = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentType(JAXBElement<String> value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the paymentTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentTypeDesc() {
        return paymentTypeDesc;
    }

    /**
     * Sets the value of the paymentTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentTypeDesc(JAXBElement<String> value) {
        this.paymentTypeDesc = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentMethod(JAXBElement<String> value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the paymentMethodDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentMethodDesc() {
        return paymentMethodDesc;
    }

    /**
     * Sets the value of the paymentMethodDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentMethodDesc(JAXBElement<String> value) {
        this.paymentMethodDesc = value;
    }

    /**
     * Gets the value of the lastCardRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastCardRequestDate() {
        return lastCardRequestDate;
    }

    /**
     * Sets the value of the lastCardRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastCardRequestDate(JAXBElement<String> value) {
        this.lastCardRequestDate = value;
    }

    /**
     * Gets the value of the lastPinRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastPinRequestDate() {
        return lastPinRequestDate;
    }

    /**
     * Sets the value of the lastPinRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastPinRequestDate(JAXBElement<String> value) {
        this.lastPinRequestDate = value;
    }

    /**
     * Gets the value of the lastPinMaintenanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastPinMaintenanceDate() {
        return lastPinMaintenanceDate;
    }

    /**
     * Sets the value of the lastPinMaintenanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastPinMaintenanceDate(JAXBElement<String> value) {
        this.lastPinMaintenanceDate = value;
    }

    /**
     * Gets the value of the newTransferCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewTransferCardNo() {
        return newTransferCardNo;
    }

    /**
     * Sets the value of the newTransferCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewTransferCardNo(JAXBElement<String> value) {
        this.newTransferCardNo = value;
    }

    /**
     * Gets the value of the transferEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransferEffectiveDate() {
        return transferEffectiveDate;
    }

    /**
     * Sets the value of the transferEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransferEffectiveDate(JAXBElement<String> value) {
        this.transferEffectiveDate = value;
    }

    /**
     * Gets the value of the retailBaseRatePA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailBaseRatePA() {
        return retailBaseRatePA;
    }

    /**
     * Sets the value of the retailBaseRatePA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailBaseRatePA(JAXBElement<String> value) {
        this.retailBaseRatePA = value;
    }

    /**
     * Gets the value of the cashBaseRatePA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashBaseRatePA() {
        return cashBaseRatePA;
    }

    /**
     * Sets the value of the cashBaseRatePA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashBaseRatePA(JAXBElement<String> value) {
        this.cashBaseRatePA = value;
    }

    /**
     * Gets the value of the retailInterest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailInterest() {
        return retailInterest;
    }

    /**
     * Sets the value of the retailInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailInterest(JAXBElement<String> value) {
        this.retailInterest = value;
    }

    /**
     * Gets the value of the lateNotices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLateNotices() {
        return lateNotices;
    }

    /**
     * Sets the value of the lateNotices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLateNotices(JAXBElement<String> value) {
        this.lateNotices = value;
    }

    /**
     * Gets the value of the serviceCharges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceCharges() {
        return serviceCharges;
    }

    /**
     * Sets the value of the serviceCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceCharges(JAXBElement<String> value) {
        this.serviceCharges = value;
    }

    /**
     * Gets the value of the cashInterest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashInterest() {
        return cashInterest;
    }

    /**
     * Sets the value of the cashInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashInterest(JAXBElement<String> value) {
        this.cashInterest = value;
    }

    /**
     * Gets the value of the annualFees property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnnualFees() {
        return annualFees;
    }

    /**
     * Sets the value of the annualFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnnualFees(JAXBElement<String> value) {
        this.annualFees = value;
    }

    /**
     * Gets the value of the prePay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrePay() {
        return prePay;
    }

    /**
     * Sets the value of the prePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrePay(JAXBElement<String> value) {
        this.prePay = value;
    }

    /**
     * Gets the value of the lateCharges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLateCharges() {
        return lateCharges;
    }

    /**
     * Sets the value of the lateCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLateCharges(JAXBElement<String> value) {
        this.lateCharges = value;
    }

    /**
     * Gets the value of the overlimitCharges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverlimitCharges() {
        return overlimitCharges;
    }

    /**
     * Sets the value of the overlimitCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverlimitCharges(JAXBElement<String> value) {
        this.overlimitCharges = value;
    }

    /**
     * Gets the value of the totalDisputedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalDisputedAmount() {
        return totalDisputedAmount;
    }

    /**
     * Sets the value of the totalDisputedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalDisputedAmount(JAXBElement<String> value) {
        this.totalDisputedAmount = value;
    }

    /**
     * Gets the value of the retailDisputeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailDisputeAmount() {
        return retailDisputeAmount;
    }

    /**
     * Sets the value of the retailDisputeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailDisputeAmount(JAXBElement<String> value) {
        this.retailDisputeAmount = value;
    }

    /**
     * Gets the value of the cashDisputedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashDisputedAmount() {
        return cashDisputedAmount;
    }

    /**
     * Sets the value of the cashDisputedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashDisputedAmount(JAXBElement<String> value) {
        this.cashDisputedAmount = value;
    }

    /**
     * Gets the value of the cardFeeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardFeeDate() {
        return cardFeeDate;
    }

    /**
     * Sets the value of the cardFeeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardFeeDate(JAXBElement<String> value) {
        this.cardFeeDate = value;
    }

    /**
     * Gets the value of the cardFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardFeeAmount() {
        return cardFeeAmount;
    }

    /**
     * Sets the value of the cardFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardFeeAmount(JAXBElement<String> value) {
        this.cardFeeAmount = value;
    }

    /**
     * Gets the value of the ctdFees0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtdFees0() {
        return ctdFees0;
    }

    /**
     * Sets the value of the ctdFees0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtdFees0(JAXBElement<String> value) {
        this.ctdFees0 = value;
    }

    /**
     * Gets the value of the ctdFees1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtdFees1() {
        return ctdFees1;
    }

    /**
     * Sets the value of the ctdFees1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtdFees1(JAXBElement<String> value) {
        this.ctdFees1 = value;
    }

    /**
     * Gets the value of the ctdFees2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtdFees2() {
        return ctdFees2;
    }

    /**
     * Sets the value of the ctdFees2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtdFees2(JAXBElement<String> value) {
        this.ctdFees2 = value;
    }

    /**
     * Gets the value of the ctdFees3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtdFees3() {
        return ctdFees3;
    }

    /**
     * Sets the value of the ctdFees3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtdFees3(JAXBElement<String> value) {
        this.ctdFees3 = value;
    }

    /**
     * Gets the value of the userCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserCode1() {
        return userCode1;
    }

    /**
     * Sets the value of the userCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserCode1(JAXBElement<String> value) {
        this.userCode1 = value;
    }

    /**
     * Gets the value of the userCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserCode2() {
        return userCode2;
    }

    /**
     * Sets the value of the userCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserCode2(JAXBElement<String> value) {
        this.userCode2 = value;
    }

    /**
     * Gets the value of the userCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserCode3() {
        return userCode3;
    }

    /**
     * Sets the value of the userCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserCode3(JAXBElement<String> value) {
        this.userCode3 = value;
    }

    /**
     * Gets the value of the userCode4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserCode4() {
        return userCode4;
    }

    /**
     * Sets the value of the userCode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserCode4(JAXBElement<String> value) {
        this.userCode4 = value;
    }

    /**
     * Gets the value of the permanentCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermanentCreditLimit() {
        return permanentCreditLimit;
    }

    /**
     * Sets the value of the permanentCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermanentCreditLimit(JAXBElement<String> value) {
        this.permanentCreditLimit = value;
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

    /**
     * Gets the value of the rewardPointsErndInCurrCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRewardPointsErndInCurrCycle() {
        return rewardPointsErndInCurrCycle;
    }

    /**
     * Sets the value of the rewardPointsErndInCurrCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRewardPointsErndInCurrCycle(JAXBElement<String> value) {
        this.rewardPointsErndInCurrCycle = value;
    }

    /**
     * Gets the value of the rewardPointsRedeemedInCurrCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRewardPointsRedeemedInCurrCycle() {
        return rewardPointsRedeemedInCurrCycle;
    }

    /**
     * Sets the value of the rewardPointsRedeemedInCurrCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRewardPointsRedeemedInCurrCycle(JAXBElement<String> value) {
        this.rewardPointsRedeemedInCurrCycle = value;
    }

    /**
     * Gets the value of the previousStmtPoints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousStmtPoints() {
        return previousStmtPoints;
    }

    /**
     * Sets the value of the previousStmtPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousStmtPoints(JAXBElement<String> value) {
        this.previousStmtPoints = value;
    }

    /**
     * Gets the value of the lastDelinquencyDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastDelinquencyDate() {
        return lastDelinquencyDate;
    }

    /**
     * Sets the value of the lastDelinquencyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastDelinquencyDate(JAXBElement<String> value) {
        this.lastDelinquencyDate = value;
    }

    /**
     * Gets the value of the priorDelinquencyDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriorDelinquencyDate() {
        return priorDelinquencyDate;
    }

    /**
     * Sets the value of the priorDelinquencyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriorDelinquencyDate(JAXBElement<String> value) {
        this.priorDelinquencyDate = value;
    }

    /**
     * Gets the value of the balance30Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBalance30Days() {
        return balance30Days;
    }

    /**
     * Sets the value of the balance30Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBalance30Days(JAXBElement<String> value) {
        this.balance30Days = value;
    }

    /**
     * Gets the value of the balance60Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBalance60Days() {
        return balance60Days;
    }

    /**
     * Sets the value of the balance60Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBalance60Days(JAXBElement<String> value) {
        this.balance60Days = value;
    }

    /**
     * Gets the value of the balance90Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBalance90Days() {
        return balance90Days;
    }

    /**
     * Sets the value of the balance90Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBalance90Days(JAXBElement<String> value) {
        this.balance90Days = value;
    }

    /**
     * Gets the value of the balance120Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBalance120Days() {
        return balance120Days;
    }

    /**
     * Sets the value of the balance120Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBalance120Days(JAXBElement<String> value) {
        this.balance120Days = value;
    }

    /**
     * Gets the value of the balance150Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBalance150Days() {
        return balance150Days;
    }

    /**
     * Sets the value of the balance150Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBalance150Days(JAXBElement<String> value) {
        this.balance150Days = value;
    }

    /**
     * Gets the value of the balance180Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBalance180Days() {
        return balance180Days;
    }

    /**
     * Sets the value of the balance180Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBalance180Days(JAXBElement<String> value) {
        this.balance180Days = value;
    }

    /**
     * Gets the value of the balance210Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBalance210Days() {
        return balance210Days;
    }

    /**
     * Sets the value of the balance210Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBalance210Days(JAXBElement<String> value) {
        this.balance210Days = value;
    }

    /**
     * Gets the value of the pastDueBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPastDueBalance() {
        return pastDueBalance;
    }

    /**
     * Sets the value of the pastDueBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPastDueBalance(JAXBElement<String> value) {
        this.pastDueBalance = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the xDayBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXDayBalance() {
        return xDayBalance;
    }

    /**
     * Sets the value of the xDayBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXDayBalance(JAXBElement<String> value) {
        this.xDayBalance = value;
    }

    /**
     * Gets the value of the embossedName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmbossedName() {
        return embossedName;
    }

    /**
     * Sets the value of the embossedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmbossedName(JAXBElement<String> value) {
        this.embossedName = value;
    }

    /**
     * Gets the value of the joiningFees property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJoiningFees() {
        return joiningFees;
    }

    /**
     * Sets the value of the joiningFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJoiningFees(JAXBElement<String> value) {
        this.joiningFees = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountName(JAXBElement<String> value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the segmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegmentCode() {
        return segmentCode;
    }

    /**
     * Sets the value of the segmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegmentCode(JAXBElement<String> value) {
        this.segmentCode = value;
    }

    /**
     * Gets the value of the segmentCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegmentCodeDesc() {
        return segmentCodeDesc;
    }

    /**
     * Sets the value of the segmentCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegmentCodeDesc(JAXBElement<String> value) {
        this.segmentCodeDesc = value;
    }

    /**
     * Gets the value of the curBlockCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurBlockCode() {
        return curBlockCode;
    }

    /**
     * Sets the value of the curBlockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurBlockCode(JAXBElement<String> value) {
        this.curBlockCode = value;
    }

    /**
     * Gets the value of the curBlockDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurBlockDate() {
        return curBlockDate;
    }

    /**
     * Sets the value of the curBlockDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurBlockDate(JAXBElement<String> value) {
        this.curBlockDate = value;
    }

    /**
     * Gets the value of the block1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock1() {
        return block1;
    }

    /**
     * Sets the value of the block1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock1(JAXBElement<String> value) {
        this.block1 = value;
    }

    /**
     * Gets the value of the block1Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock1Date() {
        return block1Date;
    }

    /**
     * Sets the value of the block1Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock1Date(JAXBElement<String> value) {
        this.block1Date = value;
    }

    /**
     * Gets the value of the block2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock2() {
        return block2;
    }

    /**
     * Sets the value of the block2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock2(JAXBElement<String> value) {
        this.block2 = value;
    }

    /**
     * Gets the value of the block2Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock2Date() {
        return block2Date;
    }

    /**
     * Sets the value of the block2Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock2Date(JAXBElement<String> value) {
        this.block2Date = value;
    }

    /**
     * Gets the value of the block3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock3() {
        return block3;
    }

    /**
     * Sets the value of the block3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock3(JAXBElement<String> value) {
        this.block3 = value;
    }

    /**
     * Gets the value of the block3Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock3Date() {
        return block3Date;
    }

    /**
     * Sets the value of the block3Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock3Date(JAXBElement<String> value) {
        this.block3Date = value;
    }

    /**
     * Gets the value of the block4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock4() {
        return block4;
    }

    /**
     * Sets the value of the block4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock4(JAXBElement<String> value) {
        this.block4 = value;
    }

    /**
     * Gets the value of the block4Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock4Date() {
        return block4Date;
    }

    /**
     * Sets the value of the block4Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock4Date(JAXBElement<String> value) {
        this.block4Date = value;
    }

    /**
     * Gets the value of the block5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock5() {
        return block5;
    }

    /**
     * Sets the value of the block5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock5(JAXBElement<String> value) {
        this.block5 = value;
    }

    /**
     * Gets the value of the block5Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock5Date() {
        return block5Date;
    }

    /**
     * Sets the value of the block5Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock5Date(JAXBElement<String> value) {
        this.block5Date = value;
    }

    /**
     * Gets the value of the block6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock6() {
        return block6;
    }

    /**
     * Sets the value of the block6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock6(JAXBElement<String> value) {
        this.block6 = value;
    }

    /**
     * Gets the value of the block6Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock6Date() {
        return block6Date;
    }

    /**
     * Sets the value of the block6Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock6Date(JAXBElement<String> value) {
        this.block6Date = value;
    }

    /**
     * Gets the value of the block7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock7() {
        return block7;
    }

    /**
     * Sets the value of the block7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock7(JAXBElement<String> value) {
        this.block7 = value;
    }

    /**
     * Gets the value of the block7Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock7Date() {
        return block7Date;
    }

    /**
     * Sets the value of the block7Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock7Date(JAXBElement<String> value) {
        this.block7Date = value;
    }

    /**
     * Gets the value of the block8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock8() {
        return block8;
    }

    /**
     * Sets the value of the block8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock8(JAXBElement<String> value) {
        this.block8 = value;
    }

    /**
     * Gets the value of the block8Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock8Date() {
        return block8Date;
    }

    /**
     * Sets the value of the block8Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock8Date(JAXBElement<String> value) {
        this.block8Date = value;
    }

    /**
     * Gets the value of the block9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock9() {
        return block9;
    }

    /**
     * Sets the value of the block9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock9(JAXBElement<String> value) {
        this.block9 = value;
    }

    /**
     * Gets the value of the block9Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock9Date() {
        return block9Date;
    }

    /**
     * Sets the value of the block9Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock9Date(JAXBElement<String> value) {
        this.block9Date = value;
    }

    /**
     * Gets the value of the block10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock10() {
        return block10;
    }

    /**
     * Sets the value of the block10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock10(JAXBElement<String> value) {
        this.block10 = value;
    }

    /**
     * Gets the value of the block10Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock10Date() {
        return block10Date;
    }

    /**
     * Sets the value of the block10Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock10Date(JAXBElement<String> value) {
        this.block10Date = value;
    }

    /**
     * Gets the value of the block11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock11() {
        return block11;
    }

    /**
     * Sets the value of the block11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock11(JAXBElement<String> value) {
        this.block11 = value;
    }

    /**
     * Gets the value of the block11Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock11Date() {
        return block11Date;
    }

    /**
     * Sets the value of the block11Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock11Date(JAXBElement<String> value) {
        this.block11Date = value;
    }

    /**
     * Gets the value of the block12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock12() {
        return block12;
    }

    /**
     * Sets the value of the block12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock12(JAXBElement<String> value) {
        this.block12 = value;
    }

    /**
     * Gets the value of the block12Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock12Date() {
        return block12Date;
    }

    /**
     * Sets the value of the block12Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock12Date(JAXBElement<String> value) {
        this.block12Date = value;
    }

    /**
     * Gets the value of the block13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock13() {
        return block13;
    }

    /**
     * Sets the value of the block13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock13(JAXBElement<String> value) {
        this.block13 = value;
    }

    /**
     * Gets the value of the block13Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock13Date() {
        return block13Date;
    }

    /**
     * Sets the value of the block13Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock13Date(JAXBElement<String> value) {
        this.block13Date = value;
    }

    /**
     * Gets the value of the block14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock14() {
        return block14;
    }

    /**
     * Sets the value of the block14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock14(JAXBElement<String> value) {
        this.block14 = value;
    }

    /**
     * Gets the value of the block14Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock14Date() {
        return block14Date;
    }

    /**
     * Sets the value of the block14Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock14Date(JAXBElement<String> value) {
        this.block14Date = value;
    }

    /**
     * Gets the value of the block15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock15() {
        return block15;
    }

    /**
     * Sets the value of the block15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock15(JAXBElement<String> value) {
        this.block15 = value;
    }

    /**
     * Gets the value of the block15Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock15Date() {
        return block15Date;
    }

    /**
     * Sets the value of the block15Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock15Date(JAXBElement<String> value) {
        this.block15Date = value;
    }

    /**
     * Gets the value of the block16 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock16() {
        return block16;
    }

    /**
     * Sets the value of the block16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock16(JAXBElement<String> value) {
        this.block16 = value;
    }

    /**
     * Gets the value of the block16Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock16Date() {
        return block16Date;
    }

    /**
     * Sets the value of the block16Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock16Date(JAXBElement<String> value) {
        this.block16Date = value;
    }

    /**
     * Gets the value of the block17 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock17() {
        return block17;
    }

    /**
     * Sets the value of the block17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock17(JAXBElement<String> value) {
        this.block17 = value;
    }

    /**
     * Gets the value of the block17Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock17Date() {
        return block17Date;
    }

    /**
     * Sets the value of the block17Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock17Date(JAXBElement<String> value) {
        this.block17Date = value;
    }

    /**
     * Gets the value of the block18 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock18() {
        return block18;
    }

    /**
     * Sets the value of the block18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock18(JAXBElement<String> value) {
        this.block18 = value;
    }

    /**
     * Gets the value of the block18Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock18Date() {
        return block18Date;
    }

    /**
     * Sets the value of the block18Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock18Date(JAXBElement<String> value) {
        this.block18Date = value;
    }

    /**
     * Gets the value of the block19 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock19() {
        return block19;
    }

    /**
     * Sets the value of the block19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock19(JAXBElement<String> value) {
        this.block19 = value;
    }

    /**
     * Gets the value of the block19Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock19Date() {
        return block19Date;
    }

    /**
     * Sets the value of the block19Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock19Date(JAXBElement<String> value) {
        this.block19Date = value;
    }

    /**
     * Gets the value of the block20 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock20() {
        return block20;
    }

    /**
     * Sets the value of the block20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock20(JAXBElement<String> value) {
        this.block20 = value;
    }

    /**
     * Gets the value of the block20Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock20Date() {
        return block20Date;
    }

    /**
     * Sets the value of the block20Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock20Date(JAXBElement<String> value) {
        this.block20Date = value;
    }

    /**
     * Gets the value of the block21 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock21() {
        return block21;
    }

    /**
     * Sets the value of the block21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock21(JAXBElement<String> value) {
        this.block21 = value;
    }

    /**
     * Gets the value of the block21Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock21Date() {
        return block21Date;
    }

    /**
     * Sets the value of the block21Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock21Date(JAXBElement<String> value) {
        this.block21Date = value;
    }

    /**
     * Gets the value of the block22 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock22() {
        return block22;
    }

    /**
     * Sets the value of the block22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock22(JAXBElement<String> value) {
        this.block22 = value;
    }

    /**
     * Gets the value of the block22Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock22Date() {
        return block22Date;
    }

    /**
     * Sets the value of the block22Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock22Date(JAXBElement<String> value) {
        this.block22Date = value;
    }

    /**
     * Gets the value of the block23 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock23() {
        return block23;
    }

    /**
     * Sets the value of the block23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock23(JAXBElement<String> value) {
        this.block23 = value;
    }

    /**
     * Gets the value of the block23Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock23Date() {
        return block23Date;
    }

    /**
     * Sets the value of the block23Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock23Date(JAXBElement<String> value) {
        this.block23Date = value;
    }

    /**
     * Gets the value of the block24 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock24() {
        return block24;
    }

    /**
     * Sets the value of the block24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock24(JAXBElement<String> value) {
        this.block24 = value;
    }

    /**
     * Gets the value of the block24Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock24Date() {
        return block24Date;
    }

    /**
     * Sets the value of the block24Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock24Date(JAXBElement<String> value) {
        this.block24Date = value;
    }

    /**
     * Gets the value of the block25 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock25() {
        return block25;
    }

    /**
     * Sets the value of the block25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock25(JAXBElement<String> value) {
        this.block25 = value;
    }

    /**
     * Gets the value of the block25Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock25Date() {
        return block25Date;
    }

    /**
     * Sets the value of the block25Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock25Date(JAXBElement<String> value) {
        this.block25Date = value;
    }

    /**
     * Gets the value of the nextPageKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNextPageKey() {
        return nextPageKey;
    }

    /**
     * Sets the value of the nextPageKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNextPageKey(JAXBElement<String> value) {
        this.nextPageKey = value;
    }

    /**
     * Gets the value of the pageRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPageRequest() {
        return pageRequest;
    }

    /**
     * Sets the value of the pageRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPageRequest(JAXBElement<String> value) {
        this.pageRequest = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditLimit(JAXBElement<String> value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductCode(JAXBElement<String> value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the productCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductCodeDesc() {
        return productCodeDesc;
    }

    /**
     * Sets the value of the productCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductCodeDesc(JAXBElement<String> value) {
        this.productCodeDesc = value;
    }

    /**
     * Gets the value of the cashLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashLimit() {
        return cashLimit;
    }

    /**
     * Sets the value of the cashLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashLimit(JAXBElement<String> value) {
        this.cashLimit = value;
    }

    /**
     * Gets the value of the availableCredit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvailableCredit() {
        return availableCredit;
    }

    /**
     * Sets the value of the availableCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvailableCredit(JAXBElement<String> value) {
        this.availableCredit = value;
    }

    /**
     * Gets the value of the advanceCash property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdvanceCash() {
        return advanceCash;
    }

    /**
     * Sets the value of the advanceCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdvanceCash(JAXBElement<String> value) {
        this.advanceCash = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentBalance(JAXBElement<String> value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the availableCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvailableCreditLimit() {
        return availableCreditLimit;
    }

    /**
     * Sets the value of the availableCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvailableCreditLimit(JAXBElement<String> value) {
        this.availableCreditLimit = value;
    }

    /**
     * Gets the value of the retailAccruedInterest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailAccruedInterest() {
        return retailAccruedInterest;
    }

    /**
     * Sets the value of the retailAccruedInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailAccruedInterest(JAXBElement<String> value) {
        this.retailAccruedInterest = value;
    }

    /**
     * Gets the value of the cashAccruedInterest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashAccruedInterest() {
        return cashAccruedInterest;
    }

    /**
     * Sets the value of the cashAccruedInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashAccruedInterest(JAXBElement<String> value) {
        this.cashAccruedInterest = value;
    }

    /**
     * Gets the value of the referenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceNo() {
        return referenceNo;
    }

    /**
     * Sets the value of the referenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceNo(JAXBElement<String> value) {
        this.referenceNo = value;
    }

    /**
     * Gets the value of the openedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpenedDate() {
        return openedDate;
    }

    /**
     * Sets the value of the openedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpenedDate(JAXBElement<String> value) {
        this.openedDate = value;
    }

    /**
     * Gets the value of the closedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClosedDate() {
        return closedDate;
    }

    /**
     * Sets the value of the closedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClosedDate(JAXBElement<String> value) {
        this.closedDate = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdate(JAXBElement<String> value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the additionalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalAddress() {
        return additionalAddress;
    }

    /**
     * Sets the value of the additionalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalAddress(JAXBElement<String> value) {
        this.additionalAddress = value;
    }

    /**
     * Gets the value of the corporateID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorporateID() {
        return corporateID;
    }

    /**
     * Sets the value of the corporateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorporateID(JAXBElement<String> value) {
        this.corporateID = value;
    }

    /**
     * Gets the value of the projectedAccruedInterest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectedAccruedInterest() {
        return projectedAccruedInterest;
    }

    /**
     * Sets the value of the projectedAccruedInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectedAccruedInterest(JAXBElement<String> value) {
        this.projectedAccruedInterest = value;
    }

    /**
     * Gets the value of the statementBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatementBalance() {
        return statementBalance;
    }

    /**
     * Sets the value of the statementBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatementBalance(JAXBElement<String> value) {
        this.statementBalance = value;
    }

    /**
     * Gets the value of the minimumDue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinimumDue() {
        return minimumDue;
    }

    /**
     * Sets the value of the minimumDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinimumDue(JAXBElement<String> value) {
        this.minimumDue = value;
    }

    /**
     * Gets the value of the postingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostingFlag() {
        return postingFlag;
    }

    /**
     * Sets the value of the postingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostingFlag(JAXBElement<String> value) {
        this.postingFlag = value;
    }

    /**
     * Gets the value of the statementFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatementFlag() {
        return statementFlag;
    }

    /**
     * Sets the value of the statementFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatementFlag(JAXBElement<String> value) {
        this.statementFlag = value;
    }

    /**
     * Gets the value of the scod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCOD() {
        return scod;
    }

    /**
     * Sets the value of the scod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCOD(JAXBElement<String> value) {
        this.scod = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelationshipType(JAXBElement<String> value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the inCollectionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInCollectionIndicator() {
        return inCollectionIndicator;
    }

    /**
     * Sets the value of the inCollectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInCollectionIndicator(JAXBElement<String> value) {
        this.inCollectionIndicator = value;
    }

    /**
     * Gets the value of the paymentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * Sets the value of the paymentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentDueDate(JAXBElement<String> value) {
        this.paymentDueDate = value;
    }

    /**
     * Gets the value of the directDebitRoutingNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirectDebitRoutingNo() {
        return directDebitRoutingNo;
    }

    /**
     * Sets the value of the directDebitRoutingNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirectDebitRoutingNo(JAXBElement<String> value) {
        this.directDebitRoutingNo = value;
    }

    /**
     * Gets the value of the directDebitAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirectDebitAccountNo() {
        return directDebitAccountNo;
    }

    /**
     * Sets the value of the directDebitAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirectDebitAccountNo(JAXBElement<String> value) {
        this.directDebitAccountNo = value;
    }

    /**
     * Gets the value of the cardCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardCategory() {
        return cardCategory;
    }

    /**
     * Sets the value of the cardCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardCategory(JAXBElement<String> value) {
        this.cardCategory = value;
    }

    /**
     * Gets the value of the probePermCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPROBEPermCreditLimit() {
        return probePermCreditLimit;
    }

    /**
     * Sets the value of the probePermCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPROBEPermCreditLimit(JAXBElement<String> value) {
        this.probePermCreditLimit = value;
    }

    /**
     * Gets the value of the outstandingAuthAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutstandingAuthAmt() {
        return outstandingAuthAmt;
    }

    /**
     * Sets the value of the outstandingAuthAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutstandingAuthAmt(JAXBElement<String> value) {
        this.outstandingAuthAmt = value;
    }

    /**
     * Gets the value of the noOfTotalTrans property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfTotalTrans() {
        return noOfTotalTrans;
    }

    /**
     * Sets the value of the noOfTotalTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfTotalTrans(JAXBElement<String> value) {
        this.noOfTotalTrans = value;
    }

    /**
     * Gets the value of the noOfBilledTrans property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfBilledTrans() {
        return noOfBilledTrans;
    }

    /**
     * Sets the value of the noOfBilledTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfBilledTrans(JAXBElement<String> value) {
        this.noOfBilledTrans = value;
    }

    /**
     * Gets the value of the noOfUnbilledTrans property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfUnbilledTrans() {
        return noOfUnbilledTrans;
    }

    /**
     * Sets the value of the noOfUnbilledTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfUnbilledTrans(JAXBElement<String> value) {
        this.noOfUnbilledTrans = value;
    }

    /**
     * Gets the value of the entityID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityID() {
        return entityID;
    }

    /**
     * Sets the value of the entityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityID(JAXBElement<String> value) {
        this.entityID = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityType(JAXBElement<String> value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserID(JAXBElement<String> value) {
        this.userID = value;
    }

    /**
     * Gets the value of the hostID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHostID() {
        return hostID;
    }

    /**
     * Sets the value of the hostID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHostID(JAXBElement<String> value) {
        this.hostID = value;
    }

    /**
     * Gets the value of the functionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunctionCode() {
        return functionCode;
    }

    /**
     * Sets the value of the functionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunctionCode(JAXBElement<String> value) {
        this.functionCode = value;
    }

    /**
     * Gets the value of the subFunctionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubFunctionCode() {
        return subFunctionCode;
    }

    /**
     * Sets the value of the subFunctionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubFunctionCode(JAXBElement<String> value) {
        this.subFunctionCode = value;
    }

    /**
     * Gets the value of the pageTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPageTotal() {
        return pageTotal;
    }

    /**
     * Sets the value of the pageTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPageTotal(JAXBElement<String> value) {
        this.pageTotal = value;
    }

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
     * Gets the value of the requestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestFlag() {
        return requestFlag;
    }

    /**
     * Sets the value of the requestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestFlag(JAXBElement<String> value) {
        this.requestFlag = value;
    }

    /**
     * Gets the value of the lastSyncDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastSyncDate() {
        return lastSyncDate;
    }

    /**
     * Sets the value of the lastSyncDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastSyncDate(JAXBElement<String> value) {
        this.lastSyncDate = value;
    }

    /**
     * Gets the value of the cardProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CardProfile }{@code >}
     *     
     */
    public JAXBElement<CardProfile> getCardProfile() {
        return cardProfile;
    }

    /**
     * Sets the value of the cardProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CardProfile }{@code >}
     *     
     */
    public void setCardProfile(JAXBElement<CardProfile> value) {
        this.cardProfile = value;
    }

    /**
     * Gets the value of the temporaryCreditLimitEffDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTemporaryCreditLimitEffDate() {
        return temporaryCreditLimitEffDate;
    }

    /**
     * Sets the value of the temporaryCreditLimitEffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTemporaryCreditLimitEffDate(JAXBElement<String> value) {
        this.temporaryCreditLimitEffDate = value;
    }

    /**
     * Gets the value of the permanentThershold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermanentThershold() {
        return permanentThershold;
    }

    /**
     * Sets the value of the permanentThershold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermanentThershold(JAXBElement<String> value) {
        this.permanentThershold = value;
    }

    /**
     * Gets the value of the temporaryThershold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTemporaryThershold() {
        return temporaryThershold;
    }

    /**
     * Sets the value of the temporaryThershold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTemporaryThershold(JAXBElement<String> value) {
        this.temporaryThershold = value;
    }

    /**
     * Gets the value of the timeXDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeXDays() {
        return timeXDays;
    }

    /**
     * Sets the value of the timeXDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeXDays(JAXBElement<String> value) {
        this.timeXDays = value;
    }

    /**
     * Gets the value of the time30Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTime30Days() {
        return time30Days;
    }

    /**
     * Sets the value of the time30Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTime30Days(JAXBElement<String> value) {
        this.time30Days = value;
    }

    /**
     * Gets the value of the time60Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTime60Days() {
        return time60Days;
    }

    /**
     * Sets the value of the time60Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTime60Days(JAXBElement<String> value) {
        this.time60Days = value;
    }

    /**
     * Gets the value of the time90Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTime90Days() {
        return time90Days;
    }

    /**
     * Sets the value of the time90Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTime90Days(JAXBElement<String> value) {
        this.time90Days = value;
    }

    /**
     * Gets the value of the time120Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTime120Days() {
        return time120Days;
    }

    /**
     * Sets the value of the time120Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTime120Days(JAXBElement<String> value) {
        this.time120Days = value;
    }

    /**
     * Gets the value of the time150Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTime150Days() {
        return time150Days;
    }

    /**
     * Sets the value of the time150Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTime150Days(JAXBElement<String> value) {
        this.time150Days = value;
    }

    /**
     * Gets the value of the time180Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTime180Days() {
        return time180Days;
    }

    /**
     * Sets the value of the time180Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTime180Days(JAXBElement<String> value) {
        this.time180Days = value;
    }

    /**
     * Gets the value of the time210Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTime210Days() {
        return time210Days;
    }

    /**
     * Sets the value of the time210Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTime210Days(JAXBElement<String> value) {
        this.time210Days = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountNo(JAXBElement<String> value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the corporateCustDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorporateCustDesc() {
        return corporateCustDesc;
    }

    /**
     * Sets the value of the corporateCustDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorporateCustDesc(JAXBElement<String> value) {
        this.corporateCustDesc = value;
    }

    /**
     * Gets the value of the custRiskGrade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustRiskGrade() {
        return custRiskGrade;
    }

    /**
     * Sets the value of the custRiskGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustRiskGrade(JAXBElement<String> value) {
        this.custRiskGrade = value;
    }

    /**
     * Gets the value of the custRiskGradeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustRiskGradeDesc() {
        return custRiskGradeDesc;
    }

    /**
     * Sets the value of the custRiskGradeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustRiskGradeDesc(JAXBElement<String> value) {
        this.custRiskGradeDesc = value;
    }

    /**
     * Gets the value of the dateRiskChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateRiskChange() {
        return dateRiskChange;
    }

    /**
     * Sets the value of the dateRiskChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateRiskChange(JAXBElement<String> value) {
        this.dateRiskChange = value;
    }

    /**
     * Gets the value of the ddaAcctNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDdaAcctNo() {
        return ddaAcctNo;
    }

    /**
     * Sets the value of the ddaAcctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDdaAcctNo(JAXBElement<String> value) {
        this.ddaAcctNo = value;
    }

    /**
     * Gets the value of the ddaBank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDdaBank() {
        return ddaBank;
    }

    /**
     * Sets the value of the ddaBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDdaBank(JAXBElement<String> value) {
        this.ddaBank = value;
    }

    /**
     * Gets the value of the ddaSwiftBIC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDDASwiftBIC() {
        return ddaSwiftBIC;
    }

    /**
     * Sets the value of the ddaSwiftBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDDASwiftBIC(JAXBElement<String> value) {
        this.ddaSwiftBIC = value;
    }

    /**
     * Gets the value of the ddaBankDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDdaBankDesc() {
        return ddaBankDesc;
    }

    /**
     * Sets the value of the ddaBankDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDdaBankDesc(JAXBElement<String> value) {
        this.ddaBankDesc = value;
    }

    /**
     * Gets the value of the collateral property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCollateral() {
        return collateral;
    }

    /**
     * Sets the value of the collateral property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCollateral(JAXBElement<String> value) {
        this.collateral = value;
    }

    /**
     * Gets the value of the systemID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSystemID() {
        return systemID;
    }

    /**
     * Sets the value of the systemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSystemID(JAXBElement<String> value) {
        this.systemID = value;
    }

    /**
     * Gets the value of the statementCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatementCycle() {
        return statementCycle;
    }

    /**
     * Sets the value of the statementCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatementCycle(JAXBElement<String> value) {
        this.statementCycle = value;
    }

    /**
     * Gets the value of the functionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunctionID() {
        return functionID;
    }

    /**
     * Sets the value of the functionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunctionID(JAXBElement<String> value) {
        this.functionID = value;
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
     * Gets the value of the totalpointsForteited property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalpointsForteited() {
        return totalpointsForteited;
    }

    /**
     * Sets the value of the totalpointsForteited property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalpointsForteited(JAXBElement<String> value) {
        this.totalpointsForteited = value;
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
     * Gets the value of the pointEarnedToday property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointEarnedToday() {
        return pointEarnedToday;
    }

    /**
     * Sets the value of the pointEarnedToday property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointEarnedToday(JAXBElement<String> value) {
        this.pointEarnedToday = value;
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
     * Gets the value of the nextCashBackDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNextCashBackDate() {
        return nextCashBackDate;
    }

    /**
     * Sets the value of the nextCashBackDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNextCashBackDate(JAXBElement<String> value) {
        this.nextCashBackDate = value;
    }

    /**
     * Gets the value of the pointsEarnedYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointsEarnedYTD() {
        return pointsEarnedYTD;
    }

    /**
     * Sets the value of the pointsEarnedYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointsEarnedYTD(JAXBElement<String> value) {
        this.pointsEarnedYTD = value;
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
     * Gets the value of the limitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLimitFlag() {
        return limitFlag;
    }

    /**
     * Sets the value of the limitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLimitFlag(JAXBElement<String> value) {
        this.limitFlag = value;
    }

    /**
     * Gets the value of the cashPymntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashPymntAmt() {
        return cashPymntAmt;
    }

    /**
     * Sets the value of the cashPymntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashPymntAmt(JAXBElement<String> value) {
        this.cashPymntAmt = value;
    }

    /**
     * Gets the value of the retailPymntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailPymntAmt() {
        return retailPymntAmt;
    }

    /**
     * Sets the value of the retailPymntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailPymntAmt(JAXBElement<String> value) {
        this.retailPymntAmt = value;
    }

    /**
     * Gets the value of the totalBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalBalance() {
        return totalBalance;
    }

    /**
     * Sets the value of the totalBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalBalance(JAXBElement<String> value) {
        this.totalBalance = value;
    }

    /**
     * Gets the value of the lastStatementDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastStatementDate() {
        return lastStatementDate;
    }

    /**
     * Sets the value of the lastStatementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastStatementDate(JAXBElement<String> value) {
        this.lastStatementDate = value;
    }

    /**
     * Gets the value of the affinityGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAffinityGroupNumber() {
        return affinityGroupNumber;
    }

    /**
     * Sets the value of the affinityGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAffinityGroupNumber(JAXBElement<String> value) {
        this.affinityGroupNumber = value;
    }

    /**
     * Gets the value of the pmntApportionment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPmntApportionment() {
        return pmntApportionment;
    }

    /**
     * Sets the value of the pmntApportionment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPmntApportionment(JAXBElement<String> value) {
        this.pmntApportionment = value;
    }

    /**
     * Gets the value of the pmntApportionmentExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPmntApportionmentExpDate() {
        return pmntApportionmentExpDate;
    }

    /**
     * Sets the value of the pmntApportionmentExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPmntApportionmentExpDate(JAXBElement<String> value) {
        this.pmntApportionmentExpDate = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountType(JAXBElement<String> value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the issuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIssuedDate() {
        return issuedDate;
    }

    /**
     * Sets the value of the issuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIssuedDate(JAXBElement<String> value) {
        this.issuedDate = value;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSendDate(JAXBElement<String> value) {
        this.sendDate = value;
    }

    /**
     * Gets the value of the olcLetterDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOLCLetterDate() {
        return olcLetterDate;
    }

    /**
     * Sets the value of the olcLetterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOLCLetterDate(JAXBElement<String> value) {
        this.olcLetterDate = value;
    }

    /**
     * Gets the value of the warningReportDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarningReportDate() {
        return warningReportDate;
    }

    /**
     * Sets the value of the warningReportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarningReportDate(JAXBElement<String> value) {
        this.warningReportDate = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemarks(JAXBElement<String> value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the deliveryDemo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryDemo() {
        return deliveryDemo;
    }

    /**
     * Sets the value of the deliveryDemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryDemo(JAXBElement<String> value) {
        this.deliveryDemo = value;
    }

    /**
     * Gets the value of the deliveryMemo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryMemo() {
        return deliveryMemo;
    }

    /**
     * Sets the value of the deliveryMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryMemo(JAXBElement<String> value) {
        this.deliveryMemo = value;
    }

    /**
     * Gets the value of the acknowledgementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcknowledgementStatus() {
        return acknowledgementStatus;
    }

    /**
     * Sets the value of the acknowledgementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcknowledgementStatus(JAXBElement<String> value) {
        this.acknowledgementStatus = value;
    }

    /**
     * Gets the value of the acknowledgementStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcknowledgementStatusDesc() {
        return acknowledgementStatusDesc;
    }

    /**
     * Sets the value of the acknowledgementStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcknowledgementStatusDesc(JAXBElement<String> value) {
        this.acknowledgementStatusDesc = value;
    }

    /**
     * Gets the value of the registerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegisterNumber() {
        return registerNumber;
    }

    /**
     * Sets the value of the registerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegisterNumber(JAXBElement<String> value) {
        this.registerNumber = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZipCode(JAXBElement<String> value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the mailingDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailingDate() {
        return mailingDate;
    }

    /**
     * Sets the value of the mailingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailingDate(JAXBElement<String> value) {
        this.mailingDate = value;
    }

    /**
     * Gets the value of the processDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessDate() {
        return processDate;
    }

    /**
     * Sets the value of the processDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessDate(JAXBElement<String> value) {
        this.processDate = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedDate(JAXBElement<String> value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the numberOfTxnsYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberOfTxnsYTD() {
        return numberOfTxnsYTD;
    }

    /**
     * Sets the value of the numberOfTxnsYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberOfTxnsYTD(JAXBElement<String> value) {
        this.numberOfTxnsYTD = value;
    }

    /**
     * Gets the value of the txnAmountYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTxnAmountYTD() {
        return txnAmountYTD;
    }

    /**
     * Sets the value of the txnAmountYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTxnAmountYTD(JAXBElement<String> value) {
        this.txnAmountYTD = value;
    }

    /**
     * Gets the value of the barcodeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBarcodeNumber() {
        return barcodeNumber;
    }

    /**
     * Sets the value of the barcodeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBarcodeNumber(JAXBElement<String> value) {
        this.barcodeNumber = value;
    }

    /**
     * Gets the value of the ncccMerchantCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNCCCMerchantCode() {
        return ncccMerchantCode;
    }

    /**
     * Sets the value of the ncccMerchantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNCCCMerchantCode(JAXBElement<String> value) {
        this.ncccMerchantCode = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemNumber(JAXBElement<String> value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the numberOfCards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberOfCards() {
        return numberOfCards;
    }

    /**
     * Sets the value of the numberOfCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberOfCards(JAXBElement<String> value) {
        this.numberOfCards = value;
    }

    /**
     * Gets the value of the returnReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnReason() {
        return returnReason;
    }

    /**
     * Sets the value of the returnReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnReason(JAXBElement<String> value) {
        this.returnReason = value;
    }

    /**
     * Gets the value of the returnReasonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnReasonDesc() {
        return returnReasonDesc;
    }

    /**
     * Sets the value of the returnReasonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnReasonDesc(JAXBElement<String> value) {
        this.returnReasonDesc = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerID(JAXBElement<String> value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the altCustID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAltCustID() {
        return altCustID;
    }

    /**
     * Sets the value of the altCustID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAltCustID(JAXBElement<String> value) {
        this.altCustID = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerName(JAXBElement<String> value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CCAddress }{@code >}
     *     
     */
    public JAXBElement<CCAddress> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CCAddress }{@code >}
     *     
     */
    public void setAddress(JAXBElement<CCAddress> value) {
        this.address = value;
    }

    /**
     * Gets the value of the actionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActionDate() {
        return actionDate;
    }

    /**
     * Sets the value of the actionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActionDate(JAXBElement<String> value) {
        this.actionDate = value;
    }

    /**
     * Gets the value of the actionTaken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActionTaken() {
        return actionTaken;
    }

    /**
     * Sets the value of the actionTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActionTaken(JAXBElement<String> value) {
        this.actionTaken = value;
    }

    /**
     * Gets the value of the actionTakenDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActionTakenDesc() {
        return actionTakenDesc;
    }

    /**
     * Sets the value of the actionTakenDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActionTakenDesc(JAXBElement<String> value) {
        this.actionTakenDesc = value;
    }

    /**
     * Gets the value of the pickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPickupDate() {
        return pickupDate;
    }

    /**
     * Sets the value of the pickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPickupDate(JAXBElement<String> value) {
        this.pickupDate = value;
    }

    /**
     * Gets the value of the addressChanged property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressChanged() {
        return addressChanged;
    }

    /**
     * Sets the value of the addressChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressChanged(JAXBElement<String> value) {
        this.addressChanged = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnDate(JAXBElement<String> value) {
        this.returnDate = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderNumber(JAXBElement<String> value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderDate(JAXBElement<String> value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryDate(JAXBElement<String> value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceivedDate(JAXBElement<String> value) {
        this.receivedDate = value;
    }

    /**
     * Gets the value of the processDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessDays() {
        return processDays;
    }

    /**
     * Sets the value of the processDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessDays(JAXBElement<String> value) {
        this.processDays = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendor(JAXBElement<String> value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the vendorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendorDesc() {
        return vendorDesc;
    }

    /**
     * Sets the value of the vendorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendorDesc(JAXBElement<String> value) {
        this.vendorDesc = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductName(JAXBElement<String> value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductType(JAXBElement<String> value) {
        this.productType = value;
    }

    /**
     * Gets the value of the productTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductTypeDesc() {
        return productTypeDesc;
    }

    /**
     * Sets the value of the productTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductTypeDesc(JAXBElement<String> value) {
        this.productTypeDesc = value;
    }

    /**
     * Gets the value of the redeemDollars property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedeemDollars() {
        return redeemDollars;
    }

    /**
     * Sets the value of the redeemDollars property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedeemDollars(JAXBElement<String> value) {
        this.redeemDollars = value;
    }

    /**
     * Gets the value of the cashPayment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashPayment() {
        return cashPayment;
    }

    /**
     * Sets the value of the cashPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashPayment(JAXBElement<String> value) {
        this.cashPayment = value;
    }

    /**
     * Gets the value of the productNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductNumber() {
        return productNumber;
    }

    /**
     * Sets the value of the productNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductNumber(JAXBElement<String> value) {
        this.productNumber = value;
    }

    /**
     * Gets the value of the customerNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerNo() {
        return customerNo;
    }

    /**
     * Sets the value of the customerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerNo(JAXBElement<String> value) {
        this.customerNo = value;
    }

    /**
     * Gets the value of the applicationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * Sets the value of the applicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicationNumber(JAXBElement<String> value) {
        this.applicationNumber = value;
    }

    /**
     * Gets the value of the applicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicationDate(JAXBElement<String> value) {
        this.applicationDate = value;
    }

    /**
     * Gets the value of the transmissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransmissionDate() {
        return transmissionDate;
    }

    /**
     * Sets the value of the transmissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransmissionDate(JAXBElement<String> value) {
        this.transmissionDate = value;
    }

    /**
     * Gets the value of the batchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatchNumber() {
        return batchNumber;
    }

    /**
     * Sets the value of the batchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatchNumber(JAXBElement<String> value) {
        this.batchNumber = value;
    }

    /**
     * Gets the value of the amountApplied property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAmountApplied() {
        return amountApplied;
    }

    /**
     * Sets the value of the amountApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAmountApplied(JAXBElement<String> value) {
        this.amountApplied = value;
    }

    /**
     * Gets the value of the remitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemitAmount() {
        return remitAmount;
    }

    /**
     * Sets the value of the remitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemitAmount(JAXBElement<String> value) {
        this.remitAmount = value;
    }

    /**
     * Gets the value of the tenure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTenure() {
        return tenure;
    }

    /**
     * Sets the value of the tenure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTenure(JAXBElement<String> value) {
        this.tenure = value;
    }

    /**
     * Gets the value of the remitDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemitDate() {
        return remitDate;
    }

    /**
     * Sets the value of the remitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemitDate(JAXBElement<String> value) {
        this.remitDate = value;
    }

    /**
     * Gets the value of the feeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFeeCode() {
        return feeCode;
    }

    /**
     * Sets the value of the feeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFeeCode(JAXBElement<String> value) {
        this.feeCode = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentMode(JAXBElement<String> value) {
        this.paymentMode = value;
    }

    /**
     * Gets the value of the currentBlockCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentBlockCode() {
        return currentBlockCode;
    }

    /**
     * Sets the value of the currentBlockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentBlockCode(JAXBElement<String> value) {
        this.currentBlockCode = value;
    }

    /**
     * Gets the value of the currentBlockDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentBlockDate() {
        return currentBlockDate;
    }

    /**
     * Sets the value of the currentBlockDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentBlockDate(JAXBElement<String> value) {
        this.currentBlockDate = value;
    }

    /**
     * Gets the value of the paymentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentIndicator() {
        return paymentIndicator;
    }

    /**
     * Sets the value of the paymentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentIndicator(JAXBElement<String> value) {
        this.paymentIndicator = value;
    }

    /**
     * Gets the value of the availableFundTransferLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvailableFundTransferLimit() {
        return availableFundTransferLimit;
    }

    /**
     * Sets the value of the availableFundTransferLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvailableFundTransferLimit(JAXBElement<String> value) {
        this.availableFundTransferLimit = value;
    }

    /**
     * Gets the value of the cashAdvOKFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashAdvOKFlag() {
        return cashAdvOKFlag;
    }

    /**
     * Sets the value of the cashAdvOKFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashAdvOKFlag(JAXBElement<String> value) {
        this.cashAdvOKFlag = value;
    }

    /**
     * Gets the value of the fundXferOKFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFundXferOKFlag() {
        return fundXferOKFlag;
    }

    /**
     * Sets the value of the fundXferOKFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFundXferOKFlag(JAXBElement<String> value) {
        this.fundXferOKFlag = value;
    }

    /**
     * Gets the value of the noOfVisitThisYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfVisitThisYear() {
        return noOfVisitThisYear;
    }

    /**
     * Sets the value of the noOfVisitThisYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfVisitThisYear(JAXBElement<String> value) {
        this.noOfVisitThisYear = value;
    }

    /**
     * Gets the value of the noOfVisitLastYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfVisitLastYear() {
        return noOfVisitLastYear;
    }

    /**
     * Sets the value of the noOfVisitLastYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfVisitLastYear(JAXBElement<String> value) {
        this.noOfVisitLastYear = value;
    }

    /**
     * Gets the value of the totalFeeChargedCurrentYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalFeeChargedCurrentYear() {
        return totalFeeChargedCurrentYear;
    }

    /**
     * Sets the value of the totalFeeChargedCurrentYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalFeeChargedCurrentYear(JAXBElement<String> value) {
        this.totalFeeChargedCurrentYear = value;
    }

    /**
     * Gets the value of the totalFeeChargedLastYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalFeeChargedLastYear() {
        return totalFeeChargedLastYear;
    }

    /**
     * Sets the value of the totalFeeChargedLastYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalFeeChargedLastYear(JAXBElement<String> value) {
        this.totalFeeChargedLastYear = value;
    }

    /**
     * Gets the value of the noOfFreeVisitUsed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfFreeVisitUsed() {
        return noOfFreeVisitUsed;
    }

    /**
     * Sets the value of the noOfFreeVisitUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfFreeVisitUsed(JAXBElement<String> value) {
        this.noOfFreeVisitUsed = value;
    }

    /**
     * Gets the value of the activationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActivationFlag() {
        return activationFlag;
    }

    /**
     * Sets the value of the activationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActivationFlag(JAXBElement<String> value) {
        this.activationFlag = value;
    }

    /**
     * Gets the value of the permanentCashLimitPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermanentCashLimitPercent() {
        return permanentCashLimitPercent;
    }

    /**
     * Sets the value of the permanentCashLimitPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermanentCashLimitPercent(JAXBElement<String> value) {
        this.permanentCashLimitPercent = value;
    }

    /**
     * Gets the value of the cashLimitMatrixPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashLimitMatrixPercent() {
        return cashLimitMatrixPercent;
    }

    /**
     * Sets the value of the cashLimitMatrixPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashLimitMatrixPercent(JAXBElement<String> value) {
        this.cashLimitMatrixPercent = value;
    }

    /**
     * Gets the value of the cashLimitPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashLimitPercent() {
        return cashLimitPercent;
    }

    /**
     * Sets the value of the cashLimitPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashLimitPercent(JAXBElement<String> value) {
        this.cashLimitPercent = value;
    }

    /**
     * Gets the value of the tmpCashLimitPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTmpCashLimitPercent() {
        return tmpCashLimitPercent;
    }

    /**
     * Sets the value of the tmpCashLimitPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTmpCashLimitPercent(JAXBElement<String> value) {
        this.tmpCashLimitPercent = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAmount(JAXBElement<String> value) {
        this.amount = value;
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
     * Gets the value of the siDebitAcctNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSIDebitAcctNo() {
        return siDebitAcctNo;
    }

    /**
     * Sets the value of the siDebitAcctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSIDebitAcctNo(JAXBElement<String> value) {
        this.siDebitAcctNo = value;
    }

    /**
     * Gets the value of the repaymentScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRepaymentScore() {
        return repaymentScore;
    }

    /**
     * Sets the value of the repaymentScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRepaymentScore(JAXBElement<String> value) {
        this.repaymentScore = value;
    }

    /**
     * Gets the value of the noOfParkingThisYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfParkingThisYear() {
        return noOfParkingThisYear;
    }

    /**
     * Sets the value of the noOfParkingThisYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfParkingThisYear(JAXBElement<String> value) {
        this.noOfParkingThisYear = value;
    }

    /**
     * Gets the value of the noOfParkinLastYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfParkinLastYear() {
        return noOfParkinLastYear;
    }

    /**
     * Sets the value of the noOfParkinLastYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfParkinLastYear(JAXBElement<String> value) {
        this.noOfParkinLastYear = value;
    }

    /**
     * Gets the value of the totalParkingFeeChargedCurrentYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalParkingFeeChargedCurrentYear() {
        return totalParkingFeeChargedCurrentYear;
    }

    /**
     * Sets the value of the totalParkingFeeChargedCurrentYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalParkingFeeChargedCurrentYear(JAXBElement<String> value) {
        this.totalParkingFeeChargedCurrentYear = value;
    }

    /**
     * Gets the value of the totalParkingFeeChargedLastYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalParkingFeeChargedLastYear() {
        return totalParkingFeeChargedLastYear;
    }

    /**
     * Sets the value of the totalParkingFeeChargedLastYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalParkingFeeChargedLastYear(JAXBElement<String> value) {
        this.totalParkingFeeChargedLastYear = value;
    }

    /**
     * Gets the value of the noOfFreeParkingUsed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfFreeParkingUsed() {
        return noOfFreeParkingUsed;
    }

    /**
     * Sets the value of the noOfFreeParkingUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfFreeParkingUsed(JAXBElement<String> value) {
        this.noOfFreeParkingUsed = value;
    }

    /**
     * Gets the value of the reversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReversalFlag() {
        return reversalFlag;
    }

    /**
     * Sets the value of the reversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReversalFlag(JAXBElement<String> value) {
        this.reversalFlag = value;
    }

    /**
     * Gets the value of the mpsLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMpsLimit() {
        return mpsLimit;
    }

    /**
     * Sets the value of the mpsLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMpsLimit(JAXBElement<String> value) {
        this.mpsLimit = value;
    }

    /**
     * Gets the value of the mpsAvailLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMpsAvailLimit() {
        return mpsAvailLimit;
    }

    /**
     * Sets the value of the mpsAvailLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMpsAvailLimit(JAXBElement<String> value) {
        this.mpsAvailLimit = value;
    }

    /**
     * Gets the value of the mpsExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMpsExpiryDt() {
        return mpsExpiryDt;
    }

    /**
     * Sets the value of the mpsExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMpsExpiryDt(JAXBElement<String> value) {
        this.mpsExpiryDt = value;
    }

    /**
     * Gets the value of the mps1LimitUsed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMps1LimitUsed() {
        return mps1LimitUsed;
    }

    /**
     * Sets the value of the mps1LimitUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMps1LimitUsed(JAXBElement<String> value) {
        this.mps1LimitUsed = value;
    }

    /**
     * Gets the value of the mps1AcctLimitUsed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMps1AcctLimitUsed() {
        return mps1AcctLimitUsed;
    }

    /**
     * Sets the value of the mps1AcctLimitUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMps1AcctLimitUsed(JAXBElement<String> value) {
        this.mps1AcctLimitUsed = value;
    }

    /**
     * Gets the value of the mps1LastReqDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMps1LastReqDt() {
        return mps1LastReqDt;
    }

    /**
     * Sets the value of the mps1LastReqDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMps1LastReqDt(JAXBElement<String> value) {
        this.mps1LastReqDt = value;
    }

    /**
     * Gets the value of the mps1LastReqOnTempLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMps1LastReqOnTempLimit() {
        return mps1LastReqOnTempLimit;
    }

    /**
     * Sets the value of the mps1LastReqOnTempLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMps1LastReqOnTempLimit(JAXBElement<String> value) {
        this.mps1LastReqOnTempLimit = value;
    }

    /**
     * Gets the value of the mps2LimitUsed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMps2LimitUsed() {
        return mps2LimitUsed;
    }

    /**
     * Sets the value of the mps2LimitUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMps2LimitUsed(JAXBElement<String> value) {
        this.mps2LimitUsed = value;
    }

    /**
     * Gets the value of the mps2AcctLimitUsed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMps2AcctLimitUsed() {
        return mps2AcctLimitUsed;
    }

    /**
     * Sets the value of the mps2AcctLimitUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMps2AcctLimitUsed(JAXBElement<String> value) {
        this.mps2AcctLimitUsed = value;
    }

    /**
     * Gets the value of the mps3AcctLimitUsed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMps3AcctLimitUsed() {
        return mps3AcctLimitUsed;
    }

    /**
     * Sets the value of the mps3AcctLimitUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMps3AcctLimitUsed(JAXBElement<String> value) {
        this.mps3AcctLimitUsed = value;
    }

    /**
     * Gets the value of the firstIntWaiverDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstIntWaiverDate() {
        return firstIntWaiverDate;
    }

    /**
     * Sets the value of the firstIntWaiverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstIntWaiverDate(JAXBElement<String> value) {
        this.firstIntWaiverDate = value;
    }

    /**
     * Gets the value of the waivePenaltyIntCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWaivePenaltyIntCount() {
        return waivePenaltyIntCount;
    }

    /**
     * Sets the value of the waivePenaltyIntCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWaivePenaltyIntCount(JAXBElement<String> value) {
        this.waivePenaltyIntCount = value;
    }

    /**
     * Gets the value of the lastResetDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastResetDate() {
        return lastResetDate;
    }

    /**
     * Sets the value of the lastResetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastResetDate(JAXBElement<String> value) {
        this.lastResetDate = value;
    }

    /**
     * Gets the value of the availableCreditLimit2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvailableCreditLimit2() {
        return availableCreditLimit2;
    }

    /**
     * Sets the value of the availableCreditLimit2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvailableCreditLimit2(JAXBElement<String> value) {
        this.availableCreditLimit2 = value;
    }

    /**
     * Gets the value of the availableCashLimit2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvailableCashLimit2() {
        return availableCashLimit2;
    }

    /**
     * Sets the value of the availableCashLimit2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvailableCashLimit2(JAXBElement<String> value) {
        this.availableCashLimit2 = value;
    }

    /**
     * Gets the value of the revolverFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRevolverFlag() {
        return revolverFlag;
    }

    /**
     * Sets the value of the revolverFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRevolverFlag(JAXBElement<String> value) {
        this.revolverFlag = value;
    }

    /**
     * Gets the value of the prefMerchant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefMerchant() {
        return prefMerchant;
    }

    /**
     * Sets the value of the prefMerchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefMerchant(JAXBElement<String> value) {
        this.prefMerchant = value;
    }

    /**
     * Gets the value of the capReachDtOverall property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCapReachDtOverall() {
        return capReachDtOverall;
    }

    /**
     * Sets the value of the capReachDtOverall property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCapReachDtOverall(JAXBElement<String> value) {
        this.capReachDtOverall = value;
    }

    /**
     * Gets the value of the capReachDtatPrefMerchant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCapReachDtatPrefMerchant() {
        return capReachDtatPrefMerchant;
    }

    /**
     * Sets the value of the capReachDtatPrefMerchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCapReachDtatPrefMerchant(JAXBElement<String> value) {
        this.capReachDtatPrefMerchant = value;
    }

    /**
     * Gets the value of the noOfTotalRPCTrans property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfTotalRPCTrans() {
        return noOfTotalRPCTrans;
    }

    /**
     * Sets the value of the noOfTotalRPCTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfTotalRPCTrans(JAXBElement<String> value) {
        this.noOfTotalRPCTrans = value;
    }

    /**
     * Gets the value of the programCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgramCode() {
        return programCode;
    }

    /**
     * Sets the value of the programCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgramCode(JAXBElement<String> value) {
        this.programCode = value;
    }

    /**
     * Gets the value of the octopusCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOctopusCardNo() {
        return octopusCardNo;
    }

    /**
     * Sets the value of the octopusCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOctopusCardNo(JAXBElement<String> value) {
        this.octopusCardNo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the rejectReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRejectReasonCode() {
        return rejectReasonCode;
    }

    /**
     * Sets the value of the rejectReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRejectReasonCode(JAXBElement<String> value) {
        this.rejectReasonCode = value;
    }

    /**
     * Gets the value of the interestRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterestRate(JAXBElement<String> value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the flatRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlatRate() {
        return flatRate;
    }

    /**
     * Sets the value of the flatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlatRate(JAXBElement<String> value) {
        this.flatRate = value;
    }

    /**
     * Gets the value of the tenor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTenor() {
        return tenor;
    }

    /**
     * Sets the value of the tenor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTenor(JAXBElement<String> value) {
        this.tenor = value;
    }

    /**
     * Gets the value of the topupAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTopupAmt() {
        return topupAmt;
    }

    /**
     * Sets the value of the topupAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTopupAmt(JAXBElement<String> value) {
        this.topupAmt = value;
    }

    /**
     * Gets the value of the topupDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTopupDate() {
        return topupDate;
    }

    /**
     * Sets the value of the topupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTopupDate(JAXBElement<String> value) {
        this.topupDate = value;
    }

    /**
     * Gets the value of the topupFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTopupFlag() {
        return topupFlag;
    }

    /**
     * Sets the value of the topupFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTopupFlag(JAXBElement<String> value) {
        this.topupFlag = value;
    }

    /**
     * Gets the value of the rewriteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRewriteFlag() {
        return rewriteFlag;
    }

    /**
     * Sets the value of the rewriteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRewriteFlag(JAXBElement<String> value) {
        this.rewriteFlag = value;
    }

    /**
     * Gets the value of the sequenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSequenceNo() {
        return sequenceNo;
    }

    /**
     * Sets the value of the sequenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSequenceNo(JAXBElement<String> value) {
        this.sequenceNo = value;
    }

    /**
     * Gets the value of the statusUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MaintInfo }{@code >}
     *     
     */
    public JAXBElement<MaintInfo> getStatusUpdate() {
        return statusUpdate;
    }

    /**
     * Sets the value of the statusUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MaintInfo }{@code >}
     *     
     */
    public void setStatusUpdate(JAXBElement<MaintInfo> value) {
        this.statusUpdate = value;
    }

    /**
     * Gets the value of the blackList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MaintInfo }{@code >}
     *     
     */
    public JAXBElement<MaintInfo> getBlackList() {
        return blackList;
    }

    /**
     * Sets the value of the blackList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MaintInfo }{@code >}
     *     
     */
    public void setBlackList(JAXBElement<MaintInfo> value) {
        this.blackList = value;
    }

    /**
     * Gets the value of the activeCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveCount() {
        return activeCount;
    }

    /**
     * Sets the value of the activeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveCount(JAXBElement<String> value) {
        this.activeCount = value;
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
     * Gets the value of the pointsEarnedBilled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointsEarnedBilled() {
        return pointsEarnedBilled;
    }

    /**
     * Sets the value of the pointsEarnedBilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointsEarnedBilled(JAXBElement<String> value) {
        this.pointsEarnedBilled = value;
    }

    /**
     * Gets the value of the pointsRedeemedBilled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointsRedeemedBilled() {
        return pointsRedeemedBilled;
    }

    /**
     * Sets the value of the pointsRedeemedBilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointsRedeemedBilled(JAXBElement<String> value) {
        this.pointsRedeemedBilled = value;
    }

    /**
     * Gets the value of the pointsEarnedUnbilled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointsEarnedUnbilled() {
        return pointsEarnedUnbilled;
    }

    /**
     * Sets the value of the pointsEarnedUnbilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointsEarnedUnbilled(JAXBElement<String> value) {
        this.pointsEarnedUnbilled = value;
    }

    /**
     * Gets the value of the pointsRedeemedUnbilled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointsRedeemedUnbilled() {
        return pointsRedeemedUnbilled;
    }

    /**
     * Sets the value of the pointsRedeemedUnbilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointsRedeemedUnbilled(JAXBElement<String> value) {
        this.pointsRedeemedUnbilled = value;
    }

    /**
     * Gets the value of the availableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Sets the value of the availableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvailableBalance(JAXBElement<String> value) {
        this.availableBalance = value;
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
     * Gets the value of the lastMinPymtDue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastMinPymtDue() {
        return lastMinPymtDue;
    }

    /**
     * Sets the value of the lastMinPymtDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastMinPymtDue(JAXBElement<String> value) {
        this.lastMinPymtDue = value;
    }

    /**
     * Gets the value of the custAvailableCash property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustAvailableCash() {
        return custAvailableCash;
    }

    /**
     * Sets the value of the custAvailableCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustAvailableCash(JAXBElement<String> value) {
        this.custAvailableCash = value;
    }

    /**
     * Gets the value of the custCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustCreditLimit() {
        return custCreditLimit;
    }

    /**
     * Sets the value of the custCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustCreditLimit(JAXBElement<String> value) {
        this.custCreditLimit = value;
    }

    /**
     * Gets the value of the custAvailableCredit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustAvailableCredit() {
        return custAvailableCredit;
    }

    /**
     * Sets the value of the custAvailableCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustAvailableCredit(JAXBElement<String> value) {
        this.custAvailableCredit = value;
    }

    /**
     * Gets the value of the postDueFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostDueFlag() {
        return postDueFlag;
    }

    /**
     * Sets the value of the postDueFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostDueFlag(JAXBElement<String> value) {
        this.postDueFlag = value;
    }

    /**
     * Gets the value of the bonusRewardPoints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBonusRewardPoints() {
        return bonusRewardPoints;
    }

    /**
     * Sets the value of the bonusRewardPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBonusRewardPoints(JAXBElement<String> value) {
        this.bonusRewardPoints = value;
    }

    /**
     * Gets the value of the consolidatedCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsolidatedCode() {
        return consolidatedCode;
    }

    /**
     * Sets the value of the consolidatedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsolidatedCode(JAXBElement<String> value) {
        this.consolidatedCode = value;
    }

    /**
     * Gets the value of the linkedAcctNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLinkedAcctNo() {
        return linkedAcctNo;
    }

    /**
     * Sets the value of the linkedAcctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLinkedAcctNo(JAXBElement<String> value) {
        this.linkedAcctNo = value;
    }

    /**
     * Gets the value of the orderAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderAmt() {
        return orderAmt;
    }

    /**
     * Sets the value of the orderAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderAmt(JAXBElement<String> value) {
        this.orderAmt = value;
    }

    /**
     * Gets the value of the lastBillNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastBillNo() {
        return lastBillNo;
    }

    /**
     * Sets the value of the lastBillNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastBillNo(JAXBElement<String> value) {
        this.lastBillNo = value;
    }

    /**
     * Gets the value of the lastBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastBillDate() {
        return lastBillDate;
    }

    /**
     * Sets the value of the lastBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastBillDate(JAXBElement<String> value) {
        this.lastBillDate = value;
    }

    /**
     * Gets the value of the lastBillAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastBillAmt() {
        return lastBillAmt;
    }

    /**
     * Sets the value of the lastBillAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastBillAmt(JAXBElement<String> value) {
        this.lastBillAmt = value;
    }

    /**
     * Gets the value of the debtorRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDebtorRefNo() {
        return debtorRefNo;
    }

    /**
     * Sets the value of the debtorRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDebtorRefNo(JAXBElement<String> value) {
        this.debtorRefNo = value;
    }

    /**
     * Gets the value of the statusUpdatedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusUpdatedate() {
        return statusUpdatedate;
    }

    /**
     * Sets the value of the statusUpdatedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusUpdatedate(JAXBElement<String> value) {
        this.statusUpdatedate = value;
    }

    /**
     * Gets the value of the blacklistFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlacklistFlag() {
        return blacklistFlag;
    }

    /**
     * Sets the value of the blacklistFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlacklistFlag(JAXBElement<String> value) {
        this.blacklistFlag = value;
    }

    /**
     * Gets the value of the blacklistReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlacklistReason() {
        return blacklistReason;
    }

    /**
     * Sets the value of the blacklistReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlacklistReason(JAXBElement<String> value) {
        this.blacklistReason = value;
    }

    /**
     * Gets the value of the blacklistDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlacklistDate() {
        return blacklistDate;
    }

    /**
     * Sets the value of the blacklistDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlacklistDate(JAXBElement<String> value) {
        this.blacklistDate = value;
    }

    /**
     * Gets the value of the openDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpenDate() {
        return openDate;
    }

    /**
     * Sets the value of the openDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpenDate(JAXBElement<String> value) {
        this.openDate = value;
    }

    /**
     * Gets the value of the reloadAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReloadAmt() {
        return reloadAmt;
    }

    /**
     * Sets the value of the reloadAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReloadAmt(JAXBElement<String> value) {
        this.reloadAmt = value;
    }

    /**
     * Gets the value of the autoPayAcctNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutoPayAcctNo() {
        return autoPayAcctNo;
    }

    /**
     * Sets the value of the autoPayAcctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutoPayAcctNo(JAXBElement<String> value) {
        this.autoPayAcctNo = value;
    }

    /**
     * Gets the value of the futureExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFutureExpiryDate() {
        return futureExpiryDate;
    }

    /**
     * Sets the value of the futureExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFutureExpiryDate(JAXBElement<String> value) {
        this.futureExpiryDate = value;
    }

    /**
     * Gets the value of the ackUserId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAckUserId() {
        return ackUserId;
    }

    /**
     * Sets the value of the ackUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAckUserId(JAXBElement<String> value) {
        this.ackUserId = value;
    }

    /**
     * Gets the value of the ackDtSurfMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAckDtSurfMail() {
        return ackDtSurfMail;
    }

    /**
     * Sets the value of the ackDtSurfMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAckDtSurfMail(JAXBElement<String> value) {
        this.ackDtSurfMail = value;
    }

    /**
     * Gets the value of the ackDtRegMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAckDtRegMail() {
        return ackDtRegMail;
    }

    /**
     * Sets the value of the ackDtRegMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAckDtRegMail(JAXBElement<String> value) {
        this.ackDtRegMail = value;
    }

    /**
     * Gets the value of the perpetuityPin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerpetuityPin() {
        return perpetuityPin;
    }

    /**
     * Sets the value of the perpetuityPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerpetuityPin(JAXBElement<String> value) {
        this.perpetuityPin = value;
    }

    /**
     * Gets the value of the flexiPay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlexiPay() {
        return flexiPay;
    }

    /**
     * Sets the value of the flexiPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlexiPay(JAXBElement<String> value) {
        this.flexiPay = value;
    }

    /**
     * Gets the value of the srcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}
     *     
     */
    public JAXBElement<CodeDesc> getSrcCode() {
        return srcCode;
    }

    /**
     * Sets the value of the srcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}
     *     
     */
    public void setSrcCode(JAXBElement<CodeDesc> value) {
        this.srcCode = value;
    }

    /**
     * Gets the value of the atmLang property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtmLang() {
        return atmLang;
    }

    /**
     * Sets the value of the atmLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtmLang(JAXBElement<String> value) {
        this.atmLang = value;
    }

    /**
     * Gets the value of the insureCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}
     *     
     */
    public JAXBElement<CodeDesc> getInsureCode() {
        return insureCode;
    }

    /**
     * Sets the value of the insureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}
     *     
     */
    public void setInsureCode(JAXBElement<CodeDesc> value) {
        this.insureCode = value;
    }

    /**
     * Gets the value of the currExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrExpiryDate() {
        return currExpiryDate;
    }

    /**
     * Sets the value of the currExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrExpiryDate(JAXBElement<String> value) {
        this.currExpiryDate = value;
    }

    /**
     * Gets the value of the lateNoticesDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLateNoticesDesc() {
        return lateNoticesDesc;
    }

    /**
     * Sets the value of the lateNoticesDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLateNoticesDesc(JAXBElement<String> value) {
        this.lateNoticesDesc = value;
    }

    /**
     * Gets the value of the serviceChargesDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceChargesDesc() {
        return serviceChargesDesc;
    }

    /**
     * Sets the value of the serviceChargesDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceChargesDesc(JAXBElement<String> value) {
        this.serviceChargesDesc = value;
    }

    /**
     * Gets the value of the alternateBlockCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlternateBlockCodeDesc() {
        return alternateBlockCodeDesc;
    }

    /**
     * Sets the value of the alternateBlockCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlternateBlockCodeDesc(JAXBElement<String> value) {
        this.alternateBlockCodeDesc = value;
    }

    /**
     * Gets the value of the organisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganisation(JAXBElement<String> value) {
        this.organisation = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAction(JAXBElement<String> value) {
        this.action = value;
    }

    /**
     * Gets the value of the actionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActionDesc() {
        return actionDesc;
    }

    /**
     * Sets the value of the actionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActionDesc(JAXBElement<String> value) {
        this.actionDesc = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSequence(JAXBElement<String> value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the cardsRequested property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardsRequested() {
        return cardsRequested;
    }

    /**
     * Sets the value of the cardsRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardsRequested(JAXBElement<String> value) {
        this.cardsRequested = value;
    }

    /**
     * Gets the value of the supplementaryCards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplementaryCards() {
        return supplementaryCards;
    }

    /**
     * Sets the value of the supplementaryCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplementaryCards(JAXBElement<String> value) {
        this.supplementaryCards = value;
    }

    /**
     * Gets the value of the supplementaryCardsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplementaryCardsDesc() {
        return supplementaryCardsDesc;
    }

    /**
     * Sets the value of the supplementaryCardsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplementaryCardsDesc(JAXBElement<String> value) {
        this.supplementaryCardsDesc = value;
    }

    /**
     * Gets the value of the cardsIssued property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardsIssued() {
        return cardsIssued;
    }

    /**
     * Sets the value of the cardsIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardsIssued(JAXBElement<String> value) {
        this.cardsIssued = value;
    }

    /**
     * Gets the value of the cardsReturned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardsReturned() {
        return cardsReturned;
    }

    /**
     * Sets the value of the cardsReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardsReturned(JAXBElement<String> value) {
        this.cardsReturned = value;
    }

    /**
     * Gets the value of the prevAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrevAction() {
        return prevAction;
    }

    /**
     * Sets the value of the prevAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrevAction(JAXBElement<String> value) {
        this.prevAction = value;
    }

    /**
     * Gets the value of the prevActionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrevActionDesc() {
        return prevActionDesc;
    }

    /**
     * Sets the value of the prevActionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrevActionDesc(JAXBElement<String> value) {
        this.prevActionDesc = value;
    }

    /**
     * Gets the value of the cardFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardFeatures() {
        return cardFeatures;
    }

    /**
     * Sets the value of the cardFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardFeatures(JAXBElement<String> value) {
        this.cardFeatures = value;
    }

    /**
     * Gets the value of the lastExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastExpiryDate() {
        return lastExpiryDate;
    }

    /**
     * Sets the value of the lastExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastExpiryDate(JAXBElement<String> value) {
        this.lastExpiryDate = value;
    }

    /**
     * Gets the value of the profile01To06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfile01To06() {
        return profile01To06;
    }

    /**
     * Sets the value of the profile01To06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfile01To06(JAXBElement<String> value) {
        this.profile01To06 = value;
    }

    /**
     * Gets the value of the profile07To12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfile07To12() {
        return profile07To12;
    }

    /**
     * Sets the value of the profile07To12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfile07To12(JAXBElement<String> value) {
        this.profile07To12 = value;
    }

    /**
     * Gets the value of the profile13To18 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfile13To18() {
        return profile13To18;
    }

    /**
     * Sets the value of the profile13To18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfile13To18(JAXBElement<String> value) {
        this.profile13To18 = value;
    }

    /**
     * Gets the value of the profile19To24 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfile19To24() {
        return profile19To24;
    }

    /**
     * Sets the value of the profile19To24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfile19To24(JAXBElement<String> value) {
        this.profile19To24 = value;
    }

    /**
     * Gets the value of the currentTierRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentTierRate() {
        return currentTierRate;
    }

    /**
     * Sets the value of the currentTierRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentTierRate(JAXBElement<String> value) {
        this.currentTierRate = value;
    }

    /**
     * Gets the value of the previousTierRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousTierRate() {
        return previousTierRate;
    }

    /**
     * Sets the value of the previousTierRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousTierRate(JAXBElement<String> value) {
        this.previousTierRate = value;
    }

    /**
     * Gets the value of the profileLastEffDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileLastEffDate() {
        return profileLastEffDate;
    }

    /**
     * Sets the value of the profileLastEffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileLastEffDate(JAXBElement<String> value) {
        this.profileLastEffDate = value;
    }

    /**
     * Gets the value of the profileLastMaintDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileLastMaintDate() {
        return profileLastMaintDate;
    }

    /**
     * Sets the value of the profileLastMaintDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileLastMaintDate(JAXBElement<String> value) {
        this.profileLastMaintDate = value;
    }

    /**
     * Gets the value of the primaryBlockCodeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryBlockCodeDate() {
        return primaryBlockCodeDate;
    }

    /**
     * Sets the value of the primaryBlockCodeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryBlockCodeDate(JAXBElement<String> value) {
        this.primaryBlockCodeDate = value;
    }

    /**
     * Gets the value of the cvi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCVI() {
        return cvi;
    }

    /**
     * Sets the value of the cvi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCVI(JAXBElement<String> value) {
        this.cvi = value;
    }

    /**
     * Gets the value of the principalCardFee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrincipalCardFee() {
        return principalCardFee;
    }

    /**
     * Sets the value of the principalCardFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrincipalCardFee(JAXBElement<String> value) {
        this.principalCardFee = value;
    }

    /**
     * Gets the value of the supplementaryCardFee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplementaryCardFee() {
        return supplementaryCardFee;
    }

    /**
     * Sets the value of the supplementaryCardFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplementaryCardFee(JAXBElement<String> value) {
        this.supplementaryCardFee = value;
    }

    /**
     * Gets the value of the nextStatementDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNextStatementDt() {
        return nextStatementDt;
    }

    /**
     * Sets the value of the nextStatementDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNextStatementDt(JAXBElement<String> value) {
        this.nextStatementDt = value;
    }

    /**
     * Gets the value of the pymtApportionmentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPymtApportionmentFlag() {
        return pymtApportionmentFlag;
    }

    /**
     * Sets the value of the pymtApportionmentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPymtApportionmentFlag(JAXBElement<String> value) {
        this.pymtApportionmentFlag = value;
    }

    /**
     * Gets the value of the fullPymt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFullPymt() {
        return fullPymt;
    }

    /**
     * Sets the value of the fullPymt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFullPymt(JAXBElement<String> value) {
        this.fullPymt = value;
    }

    /**
     * Gets the value of the directDebitBank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirectDebitBank() {
        return directDebitBank;
    }

    /**
     * Sets the value of the directDebitBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirectDebitBank(JAXBElement<String> value) {
        this.directDebitBank = value;
    }

    /**
     * Gets the value of the lastActivityDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets the value of the lastActivityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastActivityDate(JAXBElement<String> value) {
        this.lastActivityDate = value;
    }

    /**
     * Gets the value of the overLimitOption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverLimitOption() {
        return overLimitOption;
    }

    /**
     * Sets the value of the overLimitOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverLimitOption(JAXBElement<String> value) {
        this.overLimitOption = value;
    }

    /**
     * Gets the value of the tierEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTierEffectiveDate() {
        return tierEffectiveDate;
    }

    /**
     * Sets the value of the tierEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTierEffectiveDate(JAXBElement<String> value) {
        this.tierEffectiveDate = value;
    }

    /**
     * Gets the value of the newAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewAmt() {
        return newAmt;
    }

    /**
     * Sets the value of the newAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewAmt(JAXBElement<String> value) {
        this.newAmt = value;
    }

    /**
     * Gets the value of the stmtCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStmtCycle() {
        return stmtCycle;
    }

    /**
     * Sets the value of the stmtCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStmtCycle(JAXBElement<String> value) {
        this.stmtCycle = value;
    }

    /**
     * Gets the value of the hoganCustIDInclusiveIDType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHoganCustIDInclusiveIDType() {
        return hoganCustIDInclusiveIDType;
    }

    /**
     * Sets the value of the hoganCustIDInclusiveIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHoganCustIDInclusiveIDType(JAXBElement<String> value) {
        this.hoganCustIDInclusiveIDType = value;
    }

    /**
     * Gets the value of the highYieldCAAcctNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHighYieldCAAcctNo() {
        return highYieldCAAcctNo;
    }

    /**
     * Sets the value of the highYieldCAAcctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHighYieldCAAcctNo(JAXBElement<String> value) {
        this.highYieldCAAcctNo = value;
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

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestType(JAXBElement<String> value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the cardOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardOrganization() {
        return cardOrganization;
    }

    /**
     * Sets the value of the cardOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardOrganization(JAXBElement<String> value) {
        this.cardOrganization = value;
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
     * Gets the value of the embosserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmbosserName() {
        return embosserName;
    }

    /**
     * Sets the value of the embosserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmbosserName(JAXBElement<String> value) {
        this.embosserName = value;
    }

    /**
     * Gets the value of the statusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusFlag() {
        return statusFlag;
    }

    /**
     * Sets the value of the statusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusFlag(JAXBElement<String> value) {
        this.statusFlag = value;
    }

    /**
     * Gets the value of the statusDateChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusDateChange() {
        return statusDateChange;
    }

    /**
     * Sets the value of the statusDateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusDateChange(JAXBElement<String> value) {
        this.statusDateChange = value;
    }

    /**
     * Gets the value of the statusTimeChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusTimeChange() {
        return statusTimeChange;
    }

    /**
     * Sets the value of the statusTimeChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusTimeChange(JAXBElement<String> value) {
        this.statusTimeChange = value;
    }

    /**
     * Gets the value of the phoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneNo() {
        return phoneNo;
    }

    /**
     * Sets the value of the phoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneNo(JAXBElement<String> value) {
        this.phoneNo = value;
    }

    /**
     * Gets the value of the cardActivationChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardActivationChannel() {
        return cardActivationChannel;
    }

    /**
     * Sets the value of the cardActivationChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardActivationChannel(JAXBElement<String> value) {
        this.cardActivationChannel = value;
    }

    /**
     * Gets the value of the cardActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardActivationDate() {
        return cardActivationDate;
    }

    /**
     * Sets the value of the cardActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardActivationDate(JAXBElement<String> value) {
        this.cardActivationDate = value;
    }

    /**
     * Gets the value of the cardActivationTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardActivationTime() {
        return cardActivationTime;
    }

    /**
     * Sets the value of the cardActivationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardActivationTime(JAXBElement<String> value) {
        this.cardActivationTime = value;
    }

    /**
     * Gets the value of the cardDeActivationChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardDeActivationChannel() {
        return cardDeActivationChannel;
    }

    /**
     * Sets the value of the cardDeActivationChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardDeActivationChannel(JAXBElement<String> value) {
        this.cardDeActivationChannel = value;
    }

    /**
     * Gets the value of the cardDeActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardDeActivationDate() {
        return cardDeActivationDate;
    }

    /**
     * Sets the value of the cardDeActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardDeActivationDate(JAXBElement<String> value) {
        this.cardDeActivationDate = value;
    }

    /**
     * Gets the value of the cardDeActivationTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardDeActivationTime() {
        return cardDeActivationTime;
    }

    /**
     * Sets the value of the cardDeActivationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardDeActivationTime(JAXBElement<String> value) {
        this.cardDeActivationTime = value;
    }

    /**
     * Gets the value of the sourceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceFlag() {
        return sourceFlag;
    }

    /**
     * Sets the value of the sourceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceFlag(JAXBElement<String> value) {
        this.sourceFlag = value;
    }

    /**
     * Gets the value of the serviceRequestor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceRequestor() {
        return serviceRequestor;
    }

    /**
     * Sets the value of the serviceRequestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceRequestor(JAXBElement<String> value) {
        this.serviceRequestor = value;
    }

    /**
     * Gets the value of the custIDType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustIDType() {
        return custIDType;
    }

    /**
     * Sets the value of the custIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustIDType(JAXBElement<String> value) {
        this.custIDType = value;
    }

    /**
     * Gets the value of the custIDNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustIDNo() {
        return custIDNo;
    }

    /**
     * Sets the value of the custIDNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustIDNo(JAXBElement<String> value) {
        this.custIDNo = value;
    }

    /**
     * Gets the value of the pageNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPageNo() {
        return pageNo;
    }

    /**
     * Sets the value of the pageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPageNo(JAXBElement<String> value) {
        this.pageNo = value;
    }

    /**
     * Gets the value of the cardInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardInd() {
        return cardInd;
    }

    /**
     * Sets the value of the cardInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardInd(JAXBElement<String> value) {
        this.cardInd = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnCode(JAXBElement<String> value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the returnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnDesc() {
        return returnDesc;
    }

    /**
     * Sets the value of the returnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnDesc(JAXBElement<String> value) {
        this.returnDesc = value;
    }

    /**
     * Gets the value of the moreRecordInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMoreRecordInd() {
        return moreRecordInd;
    }

    /**
     * Sets the value of the moreRecordInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMoreRecordInd(JAXBElement<String> value) {
        this.moreRecordInd = value;
    }

    /**
     * Gets the value of the poBox property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoBox(JAXBElement<String> value) {
        this.poBox = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostCode(JAXBElement<String> value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the dateofBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateofBirth() {
        return dateofBirth;
    }

    /**
     * Sets the value of the dateofBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateofBirth(JAXBElement<String> value) {
        this.dateofBirth = value;
    }

    /**
     * Gets the value of the custCurrTotalPointsSIGN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustCurrTotalPointsSIGN() {
        return custCurrTotalPointsSIGN;
    }

    /**
     * Sets the value of the custCurrTotalPointsSIGN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustCurrTotalPointsSIGN(JAXBElement<String> value) {
        this.custCurrTotalPointsSIGN = value;
    }

    /**
     * Gets the value of the custCurrTotalPoints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustCurrTotalPoints() {
        return custCurrTotalPoints;
    }

    /**
     * Sets the value of the custCurrTotalPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustCurrTotalPoints(JAXBElement<String> value) {
        this.custCurrTotalPoints = value;
    }

    /**
     * Gets the value of the custCurrTotalCashDollarBalSign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustCurrTotalCashDollarBalSign() {
        return custCurrTotalCashDollarBalSign;
    }

    /**
     * Sets the value of the custCurrTotalCashDollarBalSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustCurrTotalCashDollarBalSign(JAXBElement<String> value) {
        this.custCurrTotalCashDollarBalSign = value;
    }

    /**
     * Gets the value of the custCurrTotalCashDollarBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustCurrTotalCashDollarBal() {
        return custCurrTotalCashDollarBal;
    }

    /**
     * Sets the value of the custCurrTotalCashDollarBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustCurrTotalCashDollarBal(JAXBElement<String> value) {
        this.custCurrTotalCashDollarBal = value;
    }

    /**
     * Gets the value of the redemFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedemFlag() {
        return redemFlag;
    }

    /**
     * Sets the value of the redemFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedemFlag(JAXBElement<String> value) {
        this.redemFlag = value;
    }

    /**
     * Gets the value of the redemType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedemType() {
        return redemType;
    }

    /**
     * Sets the value of the redemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedemType(JAXBElement<String> value) {
        this.redemType = value;
    }

    /**
     * Gets the value of the orderDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderDesc() {
        return orderDesc;
    }

    /**
     * Sets the value of the orderDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderDesc(JAXBElement<String> value) {
        this.orderDesc = value;
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
     * Gets the value of the redemPoints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedemPoints() {
        return redemPoints;
    }

    /**
     * Sets the value of the redemPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedemPoints(JAXBElement<String> value) {
        this.redemPoints = value;
    }

    /**
     * Gets the value of the cashRedem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashRedem() {
        return cashRedem;
    }

    /**
     * Sets the value of the cashRedem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashRedem(JAXBElement<String> value) {
        this.cashRedem = value;
    }

    /**
     * Gets the value of the topUpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTopUpAmt() {
        return topUpAmt;
    }

    /**
     * Sets the value of the topUpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTopUpAmt(JAXBElement<String> value) {
        this.topUpAmt = value;
    }

    /**
     * Gets the value of the cashBackAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashBackAmt() {
        return cashBackAmt;
    }

    /**
     * Sets the value of the cashBackAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashBackAmt(JAXBElement<String> value) {
        this.cashBackAmt = value;
    }

    /**
     * Gets the value of the tranDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTranDate() {
        return tranDate;
    }

    /**
     * Sets the value of the tranDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTranDate(JAXBElement<String> value) {
        this.tranDate = value;
    }

    /**
     * Gets the value of the tranTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTranTime() {
        return tranTime;
    }

    /**
     * Sets the value of the tranTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTranTime(JAXBElement<String> value) {
        this.tranTime = value;
    }

    /**
     * Gets the value of the tranAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTranAuthCode() {
        return tranAuthCode;
    }

    /**
     * Sets the value of the tranAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTranAuthCode(JAXBElement<String> value) {
        this.tranAuthCode = value;
    }

    /**
     * Gets the value of the processingFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessingFeeAmt() {
        return processingFeeAmt;
    }

    /**
     * Sets the value of the processingFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessingFeeAmt(JAXBElement<String> value) {
        this.processingFeeAmt = value;
    }

    /**
     * Gets the value of the topUpStmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTopUpStmtDesc() {
        return topUpStmtDesc;
    }

    /**
     * Sets the value of the topUpStmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTopUpStmtDesc(JAXBElement<String> value) {
        this.topUpStmtDesc = value;
    }

    /**
     * Gets the value of the feeStmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFeeStmtDesc() {
        return feeStmtDesc;
    }

    /**
     * Sets the value of the feeStmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFeeStmtDesc(JAXBElement<String> value) {
        this.feeStmtDesc = value;
    }

    /**
     * Gets the value of the custPointsBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustPointsBal() {
        return custPointsBal;
    }

    /**
     * Sets the value of the custPointsBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustPointsBal(JAXBElement<String> value) {
        this.custPointsBal = value;
    }

    /**
     * Gets the value of the custCashDollarBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustCashDollarBal() {
        return custCashDollarBal;
    }

    /**
     * Sets the value of the custCashDollarBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustCashDollarBal(JAXBElement<String> value) {
        this.custCashDollarBal = value;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthCode(JAXBElement<String> value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the cardNoAuth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardNoAuth() {
        return cardNoAuth;
    }

    /**
     * Sets the value of the cardNoAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardNoAuth(JAXBElement<String> value) {
        this.cardNoAuth = value;
    }

    /**
     * Gets the value of the primaryShadowAcctNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryShadowAcctNo() {
        return primaryShadowAcctNo;
    }

    /**
     * Sets the value of the primaryShadowAcctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryShadowAcctNo(JAXBElement<String> value) {
        this.primaryShadowAcctNo = value;
    }

    /**
     * Gets the value of the transferCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransferCode() {
        return transferCode;
    }

    /**
     * Sets the value of the transferCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransferCode(JAXBElement<String> value) {
        this.transferCode = value;
    }

    /**
     * Gets the value of the senderCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderCardNo() {
        return senderCardNo;
    }

    /**
     * Sets the value of the senderCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderCardNo(JAXBElement<String> value) {
        this.senderCardNo = value;
    }

    /**
     * Gets the value of the receiverCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverCardNo() {
        return receiverCardNo;
    }

    /**
     * Sets the value of the receiverCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverCardNo(JAXBElement<String> value) {
        this.receiverCardNo = value;
    }

    /**
     * Gets the value of the pointsToBeTransferred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointsToBeTransferred() {
        return pointsToBeTransferred;
    }

    /**
     * Sets the value of the pointsToBeTransferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointsToBeTransferred(JAXBElement<String> value) {
        this.pointsToBeTransferred = value;
    }

    /**
     * Gets the value of the transferFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransferFeeAmt() {
        return transferFeeAmt;
    }

    /**
     * Sets the value of the transferFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransferFeeAmt(JAXBElement<String> value) {
        this.transferFeeAmt = value;
    }

    /**
     * Gets the value of the senderPrimaryShadowAcct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderPrimaryShadowAcct() {
        return senderPrimaryShadowAcct;
    }

    /**
     * Sets the value of the senderPrimaryShadowAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderPrimaryShadowAcct(JAXBElement<String> value) {
        this.senderPrimaryShadowAcct = value;
    }

    /**
     * Gets the value of the receiverPrimaryShadowAcct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverPrimaryShadowAcct() {
        return receiverPrimaryShadowAcct;
    }

    /**
     * Sets the value of the receiverPrimaryShadowAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverPrimaryShadowAcct(JAXBElement<String> value) {
        this.receiverPrimaryShadowAcct = value;
    }

    /**
     * Gets the value of the minpointsReqTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinpointsReqTransfer() {
        return minpointsReqTransfer;
    }

    /**
     * Sets the value of the minpointsReqTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinpointsReqTransfer(JAXBElement<String> value) {
        this.minpointsReqTransfer = value;
    }

    /**
     * Gets the value of the maxpointsallowtransfer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaxpointsallowtransfer() {
        return maxpointsallowtransfer;
    }

    /**
     * Sets the value of the maxpointsallowtransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaxpointsallowtransfer(JAXBElement<String> value) {
        this.maxpointsallowtransfer = value;
    }

    /**
     * Gets the value of the inputFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputFunction() {
        return inputFunction;
    }

    /**
     * Sets the value of the inputFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputFunction(String value) {
        this.inputFunction = value;
    }

    /**
     * Gets the value of the installmentProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallmentProgram() {
        return installmentProgram;
    }

    /**
     * Sets the value of the installmentProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentProgram(String value) {
        this.installmentProgram = value;
    }

    /**
     * Gets the value of the specialInstallmentProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstallmentProduct() {
        return specialInstallmentProduct;
    }

    /**
     * Sets the value of the specialInstallmentProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInstallmentProduct(String value) {
        this.specialInstallmentProduct = value;
    }

    /**
     * Gets the value of the overseasInstallmentProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverseasInstallmentProduct() {
        return overseasInstallmentProduct;
    }

    /**
     * Sets the value of the overseasInstallmentProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverseasInstallmentProduct(String value) {
        this.overseasInstallmentProduct = value;
    }

    /**
     * Gets the value of the normalInstallmentProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalInstallmentProduct() {
        return normalInstallmentProduct;
    }

    /**
     * Sets the value of the normalInstallmentProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalInstallmentProduct(String value) {
        this.normalInstallmentProduct = value;
    }

    /**
     * Gets the value of the inputDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputDate() {
        return inputDate;
    }

    /**
     * Sets the value of the inputDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputDate(String value) {
        this.inputDate = value;
    }

    /**
     * Gets the value of the inputBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputBy() {
        return inputBy;
    }

    /**
     * Sets the value of the inputBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputBy(String value) {
        this.inputBy = value;
    }

    /**
     * Gets the value of the cancelIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelIndicator() {
        return cancelIndicator;
    }

    /**
     * Sets the value of the cancelIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelIndicator(String value) {
        this.cancelIndicator = value;
    }

    /**
     * Gets the value of the productAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductAmount() {
        return productAmount;
    }

    /**
     * Sets the value of the productAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductAmount(String value) {
        this.productAmount = value;
    }

    /**
     * Gets the value of the numberOfInstlmnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfInstlmnt() {
        return numberOfInstlmnt;
    }

    /**
     * Sets the value of the numberOfInstlmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfInstlmnt(String value) {
        this.numberOfInstlmnt = value;
    }

    /**
     * Gets the value of the availableTransactionCounter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableTransactionCounter() {
        return availableTransactionCounter;
    }

    /**
     * Sets the value of the availableTransactionCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableTransactionCounter(String value) {
        this.availableTransactionCounter = value;
    }

    /**
     * Gets the value of the availableTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableTransactionAmount() {
        return availableTransactionAmount;
    }

    /**
     * Sets the value of the availableTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableTransactionAmount(String value) {
        this.availableTransactionAmount = value;
    }

    /**
     * Gets the value of the neAvailableTransactionCounter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeAvailableTransactionCounter() {
        return neAvailableTransactionCounter;
    }

    /**
     * Sets the value of the neAvailableTransactionCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeAvailableTransactionCounter(String value) {
        this.neAvailableTransactionCounter = value;
    }

    /**
     * Gets the value of the neAvailableTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeAvailableTransactionAmount() {
        return neAvailableTransactionAmount;
    }

    /**
     * Sets the value of the neAvailableTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeAvailableTransactionAmount(String value) {
        this.neAvailableTransactionAmount = value;
    }

    /**
     * Gets the value of the specialTransactionCounter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialTransactionCounter() {
        return specialTransactionCounter;
    }

    /**
     * Sets the value of the specialTransactionCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialTransactionCounter(String value) {
        this.specialTransactionCounter = value;
    }

    /**
     * Gets the value of the neSpecialTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeSpecialTransactionAmount() {
        return neSpecialTransactionAmount;
    }

    /**
     * Sets the value of the neSpecialTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeSpecialTransactionAmount(String value) {
        this.neSpecialTransactionAmount = value;
    }

    /**
     * Gets the value of the overseaTransactionCounter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverseaTransactionCounter() {
        return overseaTransactionCounter;
    }

    /**
     * Sets the value of the overseaTransactionCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverseaTransactionCounter(String value) {
        this.overseaTransactionCounter = value;
    }

    /**
     * Gets the value of the neOverseaTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeOverseaTransactionAmount() {
        return neOverseaTransactionAmount;
    }

    /**
     * Sets the value of the neOverseaTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeOverseaTransactionAmount(String value) {
        this.neOverseaTransactionAmount = value;
    }

    /**
     * Gets the value of the normalTransactionCounter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalTransactionCounter() {
        return normalTransactionCounter;
    }

    /**
     * Sets the value of the normalTransactionCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalTransactionCounter(String value) {
        this.normalTransactionCounter = value;
    }

    /**
     * Gets the value of the neNormalTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeNormalTransactionAmount() {
        return neNormalTransactionAmount;
    }

    /**
     * Sets the value of the neNormalTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeNormalTransactionAmount(String value) {
        this.neNormalTransactionAmount = value;
    }

    /**
     * Gets the value of the operatorID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatorID() {
        return operatorID;
    }

    /**
     * Sets the value of the operatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatorID(JAXBElement<String> value) {
        this.operatorID = value;
    }

    /**
     * Gets the value of the availaCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvailaCreditLimit() {
        return availaCreditLimit;
    }

    /**
     * Sets the value of the availaCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvailaCreditLimit(JAXBElement<String> value) {
        this.availaCreditLimit = value;
    }

    /**
     * Gets the value of the availaCashLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvailaCashLimit() {
        return availaCashLimit;
    }

    /**
     * Sets the value of the availaCashLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvailaCashLimit(JAXBElement<String> value) {
        this.availaCashLimit = value;
    }

    /**
     * Gets the value of the creditLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditLmt() {
        return creditLmt;
    }

    /**
     * Sets the value of the creditLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditLmt(JAXBElement<String> value) {
        this.creditLmt = value;
    }

    /**
     * Gets the value of the cardExpyDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardExpyDate() {
        return cardExpyDate;
    }

    /**
     * Sets the value of the cardExpyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardExpyDate(JAXBElement<String> value) {
        this.cardExpyDate = value;
    }

    /**
     * Gets the value of the lastMinAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastMinAmountDue() {
        return lastMinAmountDue;
    }

    /**
     * Sets the value of the lastMinAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastMinAmountDue(JAXBElement<String> value) {
        this.lastMinAmountDue = value;
    }

    /**
     * Gets the value of the consolidateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsolidateCode() {
        return consolidateCode;
    }

    /**
     * Sets the value of the consolidateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsolidateCode(JAXBElement<String> value) {
        this.consolidateCode = value;
    }

    /**
     * Gets the value of the pastDueFlg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPastDueFlg() {
        return pastDueFlg;
    }

    /**
     * Sets the value of the pastDueFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPastDueFlg(JAXBElement<String> value) {
        this.pastDueFlg = value;
    }

    /**
     * Gets the value of the crmODRowId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrmODRowId() {
        return crmODRowId;
    }

    /**
     * Sets the value of the crmODRowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrmODRowId(JAXBElement<String> value) {
        this.crmODRowId = value;
    }

    /**
     * Gets the value of the subProduct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}
     *     
     */
    public JAXBElement<CodeDesc> getSubProduct() {
        return subProduct;
    }

    /**
     * Sets the value of the subProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}
     *     
     */
    public void setSubProduct(JAXBElement<CodeDesc> value) {
        this.subProduct = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}
     *     
     */
    public JAXBElement<CodeDesc> getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}
     *     
     */
    public void setBranch(JAXBElement<CodeDesc> value) {
        this.branch = value;
    }

    /**
     * Gets the value of the referralId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferralId() {
        return referralId;
    }

    /**
     * Sets the value of the referralId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferralId(JAXBElement<String> value) {
        this.referralId = value;
    }

    /**
     * Gets the value of the sourcingId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourcingId() {
        return sourcingId;
    }

    /**
     * Sets the value of the sourcingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourcingId(JAXBElement<String> value) {
        this.sourcingId = value;
    }

    /**
     * Gets the value of the closingId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClosingId() {
        return closingId;
    }

    /**
     * Sets the value of the closingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClosingId(JAXBElement<String> value) {
        this.closingId = value;
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
     * Gets the value of the rewardPointPrintedCurrentQuarter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRewardPointPrintedCurrentQuarter() {
        return rewardPointPrintedCurrentQuarter;
    }

    /**
     * Sets the value of the rewardPointPrintedCurrentQuarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRewardPointPrintedCurrentQuarter(JAXBElement<String> value) {
        this.rewardPointPrintedCurrentQuarter = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientId(JAXBElement<String> value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenId(JAXBElement<String> value) {
        this.tokenId = value;
    }

    /**
     * Gets the value of the firstOTP property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstOTP() {
        return firstOTP;
    }

    /**
     * Sets the value of the firstOTP property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstOTP(JAXBElement<String> value) {
        this.firstOTP = value;
    }

    /**
     * Gets the value of the secondOTP property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecondOTP() {
        return secondOTP;
    }

    /**
     * Sets the value of the secondOTP property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecondOTP(JAXBElement<String> value) {
        this.secondOTP = value;
    }

    /**
     * Gets the value of the tokenCardInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenCardInd() {
        return tokenCardInd;
    }

    /**
     * Sets the value of the tokenCardInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenCardInd(JAXBElement<String> value) {
        this.tokenCardInd = value;
    }

    /**
     * Gets the value of the tokenStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenStatus() {
        return tokenStatus;
    }

    /**
     * Sets the value of the tokenStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenStatus(JAXBElement<String> value) {
        this.tokenStatus = value;
    }

    /**
     * Gets the value of the ddaPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDdaPercentage() {
        return ddaPercentage;
    }

    /**
     * Sets the value of the ddaPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDdaPercentage(JAXBElement<String> value) {
        this.ddaPercentage = value;
    }

    /**
     * Gets the value of the ddaAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDdaAmount() {
        return ddaAmount;
    }

    /**
     * Sets the value of the ddaAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDdaAmount(JAXBElement<String> value) {
        this.ddaAmount = value;
    }

    /**
     * Gets the value of the totalStmtBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalStmtBal() {
        return totalStmtBal;
    }

    /**
     * Sets the value of the totalStmtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalStmtBal(JAXBElement<String> value) {
        this.totalStmtBal = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNickName(JAXBElement<String> value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the coOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoOwner() {
        return coOwner;
    }

    /**
     * Sets the value of the coOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoOwner(JAXBElement<String> value) {
        this.coOwner = value;
    }

    /**
     * Gets the value of the coOwnerOfficePhoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoOwnerOfficePhoneNo() {
        return coOwnerOfficePhoneNo;
    }

    /**
     * Sets the value of the coOwnerOfficePhoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoOwnerOfficePhoneNo(JAXBElement<String> value) {
        this.coOwnerOfficePhoneNo = value;
    }

    /**
     * Gets the value of the memoLine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemoLine() {
        return memoLine;
    }

    /**
     * Sets the value of the memoLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemoLine(JAXBElement<String> value) {
        this.memoLine = value;
    }

    /**
     * Gets the value of the cardEmbossName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardEmbossName() {
        return cardEmbossName;
    }

    /**
     * Sets the value of the cardEmbossName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardEmbossName(JAXBElement<String> value) {
        this.cardEmbossName = value;
    }

    /**
     * Gets the value of the nricNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNricNo() {
        return nricNo;
    }

    /**
     * Sets the value of the nricNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNricNo(JAXBElement<String> value) {
        this.nricNo = value;
    }

    /**
     * Gets the value of the tempBranch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTempBranch() {
        return tempBranch;
    }

    /**
     * Sets the value of the tempBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTempBranch(JAXBElement<String> value) {
        this.tempBranch = value;
    }

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgentId(JAXBElement<String> value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the tempLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTempLimit() {
        return tempLimit;
    }

    /**
     * Sets the value of the tempLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTempLimit(JAXBElement<String> value) {
        this.tempLimit = value;
    }

    /**
     * Gets the value of the tempLimitExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTempLimitExpDate() {
        return tempLimitExpDate;
    }

    /**
     * Sets the value of the tempLimitExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTempLimitExpDate(JAXBElement<String> value) {
        this.tempLimitExpDate = value;
    }

    /**
     * Gets the value of the reasonOfRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonOfRequest() {
        return reasonOfRequest;
    }

    /**
     * Sets the value of the reasonOfRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonOfRequest(JAXBElement<String> value) {
        this.reasonOfRequest = value;
    }

    /**
     * Gets the value of the approveOrDecline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApproveOrDecline() {
        return approveOrDecline;
    }

    /**
     * Sets the value of the approveOrDecline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApproveOrDecline(JAXBElement<String> value) {
        this.approveOrDecline = value;
    }

    /**
     * Gets the value of the approvalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApprovalAmt() {
        return approvalAmt;
    }

    /**
     * Sets the value of the approvalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApprovalAmt(JAXBElement<String> value) {
        this.approvalAmt = value;
    }

    /**
     * Gets the value of the declineReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeclineReason() {
        return declineReason;
    }

    /**
     * Sets the value of the declineReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeclineReason(JAXBElement<String> value) {
        this.declineReason = value;
    }

    /**
     * Gets the value of the cardForecastDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Forecast }
     *     
     */
    public Forecast getCardForecastDetails() {
        return cardForecastDetails;
    }

    /**
     * Sets the value of the cardForecastDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Forecast }
     *     
     */
    public void setCardForecastDetails(Forecast value) {
        this.cardForecastDetails = value;
    }

    /**
     * Gets the value of the lastPaymentAmtFCY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastPaymentAmtFCY() {
        return lastPaymentAmtFCY;
    }

    /**
     * Sets the value of the lastPaymentAmtFCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastPaymentAmtFCY(JAXBElement<String> value) {
        this.lastPaymentAmtFCY = value;
    }

    /**
     * Gets the value of the pastDueAmountFCY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPastDueAmountFCY() {
        return pastDueAmountFCY;
    }

    /**
     * Sets the value of the pastDueAmountFCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPastDueAmountFCY(JAXBElement<String> value) {
        this.pastDueAmountFCY = value;
    }

    /**
     * Gets the value of the minPaymentFCY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinPaymentFCY() {
        return minPaymentFCY;
    }

    /**
     * Sets the value of the minPaymentFCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinPaymentFCY(JAXBElement<String> value) {
        this.minPaymentFCY = value;
    }

    /**
     * Gets the value of the balanceFCY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBalanceFCY() {
        return balanceFCY;
    }

    /**
     * Sets the value of the balanceFCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBalanceFCY(JAXBElement<String> value) {
        this.balanceFCY = value;
    }

    /**
     * Gets the value of the minPaymentLCY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinPaymentLCY() {
        return minPaymentLCY;
    }

    /**
     * Sets the value of the minPaymentLCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinPaymentLCY(JAXBElement<String> value) {
        this.minPaymentLCY = value;
    }

    /**
     * Gets the value of the balanceLCY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBalanceLCY() {
        return balanceLCY;
    }

    /**
     * Sets the value of the balanceLCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBalanceLCY(JAXBElement<String> value) {
        this.balanceLCY = value;
    }

    /**
     * Gets the value of the chipType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChipType() {
        return chipType;
    }

    /**
     * Sets the value of the chipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChipType(JAXBElement<String> value) {
        this.chipType = value;
    }

    /**
     * Gets the value of the dtCreditBalOccur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtCreditBalOccur() {
        return dtCreditBalOccur;
    }

    /**
     * Sets the value of the dtCreditBalOccur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtCreditBalOccur(String value) {
        this.dtCreditBalOccur = value;
    }

    /**
     * Gets the value of the existingFeeDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistingFeeDt() {
        return existingFeeDt;
    }

    /**
     * Sets the value of the existingFeeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistingFeeDt(String value) {
        this.existingFeeDt = value;
    }

    /**
     * Gets the value of the affinityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffinityFlag() {
        return affinityFlag;
    }

    /**
     * Sets the value of the affinityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffinityFlag(String value) {
        this.affinityFlag = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<String> value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<String> value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the custOrgNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustOrgNo() {
        return custOrgNo;
    }

    /**
     * Sets the value of the custOrgNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustOrgNo(JAXBElement<String> value) {
        this.custOrgNo = value;
    }

    /**
     * Gets the value of the transactionCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionCardNo() {
        return transactionCardNo;
    }

    /**
     * Sets the value of the transactionCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionCardNo(JAXBElement<String> value) {
        this.transactionCardNo = value;
    }

    /**
     * Gets the value of the transactionCardType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionCardType() {
        return transactionCardType;
    }

    /**
     * Sets the value of the transactionCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionCardType(JAXBElement<String> value) {
        this.transactionCardType = value;
    }

    /**
     * Gets the value of the transactionOrgNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionOrgNo() {
        return transactionOrgNo;
    }

    /**
     * Sets the value of the transactionOrgNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionOrgNo(JAXBElement<String> value) {
        this.transactionOrgNo = value;
    }

    /**
     * Gets the value of the outOfBalanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutOfBalanceFlag() {
        return outOfBalanceFlag;
    }

    /**
     * Sets the value of the outOfBalanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutOfBalanceFlag(JAXBElement<String> value) {
        this.outOfBalanceFlag = value;
    }

    /**
     * Gets the value of the dualMailingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDualMailingFlag() {
        return dualMailingFlag;
    }

    /**
     * Sets the value of the dualMailingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDualMailingFlag(JAXBElement<String> value) {
        this.dualMailingFlag = value;
    }

    /**
     * Gets the value of the summaryInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSummaryInd() {
        return summaryInd;
    }

    /**
     * Sets the value of the summaryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSummaryInd(JAXBElement<String> value) {
        this.summaryInd = value;
    }

    /**
     * Gets the value of the secondaryCustOrg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecondaryCustOrg() {
        return secondaryCustOrg;
    }

    /**
     * Sets the value of the secondaryCustOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecondaryCustOrg(JAXBElement<String> value) {
        this.secondaryCustOrg = value;
    }

    /**
     * Gets the value of the secondaryCustNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecondaryCustNo() {
        return secondaryCustNo;
    }

    /**
     * Sets the value of the secondaryCustNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecondaryCustNo(JAXBElement<String> value) {
        this.secondaryCustNo = value;
    }

    /**
     * Gets the value of the previousBlockCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousBlockCode() {
        return previousBlockCode;
    }

    /**
     * Sets the value of the previousBlockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousBlockCode(JAXBElement<String> value) {
        this.previousBlockCode = value;
    }

    /**
     * Gets the value of the earnedCycleDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEarnedCycleDt() {
        return earnedCycleDt;
    }

    /**
     * Sets the value of the earnedCycleDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEarnedCycleDt(JAXBElement<String> value) {
        this.earnedCycleDt = value;
    }

    /**
     * Gets the value of the usedCycleDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsedCycleDt() {
        return usedCycleDt;
    }

    /**
     * Sets the value of the usedCycleDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsedCycleDt(JAXBElement<String> value) {
        this.usedCycleDt = value;
    }

    /**
     * Gets the value of the totalBilledTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalBilledTransaction() {
        return totalBilledTransaction;
    }

    /**
     * Sets the value of the totalBilledTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalBilledTransaction(JAXBElement<String> value) {
        this.totalBilledTransaction = value;
    }

    /**
     * Gets the value of the tranType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTranType() {
        return tranType;
    }

    /**
     * Sets the value of the tranType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTranType(JAXBElement<String> value) {
        this.tranType = value;
    }

    /**
     * Gets the value of the bankNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankNo() {
        return bankNo;
    }

    /**
     * Sets the value of the bankNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankNo(JAXBElement<String> value) {
        this.bankNo = value;
    }

    /**
     * Gets the value of the srcName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcName() {
        return srcName;
    }

    /**
     * Sets the value of the srcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcName(JAXBElement<String> value) {
        this.srcName = value;
    }

    /**
     * Gets the value of the branchNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBranchNo() {
        return branchNo;
    }

    /**
     * Sets the value of the branchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBranchNo(JAXBElement<String> value) {
        this.branchNo = value;
    }

    /**
     * Gets the value of the operandNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperandNo() {
        return operandNo;
    }

    /**
     * Sets the value of the operandNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperandNo(JAXBElement<String> value) {
        this.operandNo = value;
    }

    /**
     * Gets the value of the pinFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinFlag() {
        return pinFlag;
    }

    /**
     * Sets the value of the pinFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinFlag(JAXBElement<String> value) {
        this.pinFlag = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPin(JAXBElement<String> value) {
        this.pin = value;
    }

    /**
     * Gets the value of the outstandBalFCY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutstandBalFCY() {
        return outstandBalFCY;
    }

    /**
     * Sets the value of the outstandBalFCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutstandBalFCY(JAXBElement<String> value) {
        this.outstandBalFCY = value;
    }

    /**
     * Gets the value of the creditLimitFCY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditLimitFCY() {
        return creditLimitFCY;
    }

    /**
     * Sets the value of the creditLimitFCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditLimitFCY(JAXBElement<String> value) {
        this.creditLimitFCY = value;
    }

    /**
     * Gets the value of the availableCreditLimitFCY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvailableCreditLimitFCY() {
        return availableCreditLimitFCY;
    }

    /**
     * Sets the value of the availableCreditLimitFCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvailableCreditLimitFCY(JAXBElement<String> value) {
        this.availableCreditLimitFCY = value;
    }

    /**
     * Gets the value of the cashLimitFCY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashLimitFCY() {
        return cashLimitFCY;
    }

    /**
     * Sets the value of the cashLimitFCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashLimitFCY(JAXBElement<String> value) {
        this.cashLimitFCY = value;
    }

    /**
     * Gets the value of the availableCashLimitFCY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvailableCashLimitFCY() {
        return availableCashLimitFCY;
    }

    /**
     * Sets the value of the availableCashLimitFCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvailableCashLimitFCY(JAXBElement<String> value) {
        this.availableCashLimitFCY = value;
    }

    /**
     * Gets the value of the balCcyCodeFCY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBalCcyCodeFCY() {
        return balCcyCodeFCY;
    }

    /**
     * Sets the value of the balCcyCodeFCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBalCcyCodeFCY(JAXBElement<String> value) {
        this.balCcyCodeFCY = value;
    }

    /**
     * Gets the value of the limitCcyCodeFCY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLimitCcyCodeFCY() {
        return limitCcyCodeFCY;
    }

    /**
     * Sets the value of the limitCcyCodeFCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLimitCcyCodeFCY(JAXBElement<String> value) {
        this.limitCcyCodeFCY = value;
    }

    /**
     * Gets the value of the rewardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRewardFlag() {
        return rewardFlag;
    }

    /**
     * Sets the value of the rewardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRewardFlag(JAXBElement<String> value) {
        this.rewardFlag = value;
    }

    /**
     * Gets the value of the checkFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckFlag() {
        return checkFlag;
    }

    /**
     * Sets the value of the checkFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckFlag(JAXBElement<String> value) {
        this.checkFlag = value;
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoints(JAXBElement<String> value) {
        this.points = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartDt(JAXBElement<String> value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndDt(JAXBElement<String> value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the rtnInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRtnInd() {
        return rtnInd;
    }

    /**
     * Sets the value of the rtnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRtnInd(JAXBElement<String> value) {
        this.rtnInd = value;
    }

    /**
     * Gets the value of the tranMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTranMonth() {
        return tranMonth;
    }

    /**
     * Sets the value of the tranMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTranMonth(JAXBElement<String> value) {
        this.tranMonth = value;
    }

    /**
     * Gets the value of the postingDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostingDt() {
        return postingDt;
    }

    /**
     * Sets the value of the postingDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostingDt(JAXBElement<String> value) {
        this.postingDt = value;
    }

    /**
     * Gets the value of the tranNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTranNo() {
        return tranNo;
    }

    /**
     * Sets the value of the tranNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTranNo(JAXBElement<String> value) {
        this.tranNo = value;
    }

    /**
     * Gets the value of the tranYr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTranYr() {
        return tranYr;
    }

    /**
     * Sets the value of the tranYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTranYr(JAXBElement<String> value) {
        this.tranYr = value;
    }

    /**
     * Gets the value of the option property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOption() {
        return option;
    }

    /**
     * Sets the value of the option property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOption(JAXBElement<String> value) {
        this.option = value;
    }

    /**
     * Gets the value of the enquiryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnquiryFlag() {
        return enquiryFlag;
    }

    /**
     * Sets the value of the enquiryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnquiryFlag(JAXBElement<String> value) {
        this.enquiryFlag = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdType(JAXBElement<String> value) {
        this.idType = value;
    }

    /**
     * Gets the value of the notesDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotesDt() {
        return notesDt;
    }

    /**
     * Sets the value of the notesDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotesDt(JAXBElement<String> value) {
        this.notesDt = value;
    }

    /**
     * Gets the value of the memoDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemoDt() {
        return memoDt;
    }

    /**
     * Sets the value of the memoDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemoDt(JAXBElement<String> value) {
        this.memoDt = value;
    }

    /**
     * Gets the value of the blockDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlockDt() {
        return blockDt;
    }

    /**
     * Sets the value of the blockDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlockDt(JAXBElement<String> value) {
        this.blockDt = value;
    }

    /**
     * Gets the value of the paidAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaidAmt() {
        return paidAmt;
    }

    /**
     * Sets the value of the paidAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaidAmt(JAXBElement<String> value) {
        this.paidAmt = value;
    }

    /**
     * Gets the value of the adjustmentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdjustmentAmt() {
        return adjustmentAmt;
    }

    /**
     * Sets the value of the adjustmentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdjustmentAmt(JAXBElement<String> value) {
        this.adjustmentAmt = value;
    }

    /**
     * Gets the value of the interest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterest() {
        return interest;
    }

    /**
     * Sets the value of the interest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterest(JAXBElement<String> value) {
        this.interest = value;
    }

    /**
     * Gets the value of the newBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewBalance() {
        return newBalance;
    }

    /**
     * Sets the value of the newBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewBalance(JAXBElement<String> value) {
        this.newBalance = value;
    }

    /**
     * Gets the value of the lastUpdatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * Sets the value of the lastUpdatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdatedTime(JAXBElement<String> value) {
        this.lastUpdatedTime = value;
    }

    /**
     * Gets the value of the primaryCreditCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryCreditCardNo() {
        return primaryCreditCardNo;
    }

    /**
     * Sets the value of the primaryCreditCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryCreditCardNo(JAXBElement<String> value) {
        this.primaryCreditCardNo = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlag(JAXBElement<String> value) {
        this.flag = value;
    }

    /**
     * Gets the value of the stmtDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStmtDay() {
        return stmtDay;
    }

    /**
     * Sets the value of the stmtDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStmtDay(JAXBElement<String> value) {
        this.stmtDay = value;
    }

    /**
     * Gets the value of the custCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustCategory() {
        return custCategory;
    }

    /**
     * Sets the value of the custCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustCategory(JAXBElement<String> value) {
        this.custCategory = value;
    }

    /**
     * Gets the value of the groupAccNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupAccNo() {
        return groupAccNo;
    }

    /**
     * Sets the value of the groupAccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupAccNo(JAXBElement<String> value) {
        this.groupAccNo = value;
    }

    /**
     * Gets the value of the friendName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFriendName() {
        return friendName;
    }

    /**
     * Sets the value of the friendName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFriendName(JAXBElement<String> value) {
        this.friendName = value;
    }

    /**
     * Gets the value of the favoriteCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFavoriteCity() {
        return favoriteCity;
    }

    /**
     * Sets the value of the favoriteCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFavoriteCity(JAXBElement<String> value) {
        this.favoriteCity = value;
    }

    /**
     * Gets the value of the favoriteColor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFavoriteColor() {
        return favoriteColor;
    }

    /**
     * Sets the value of the favoriteColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFavoriteColor(JAXBElement<String> value) {
        this.favoriteColor = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardStatus(JAXBElement<String> value) {
        this.cardStatus = value;
    }

    /**
     * Gets the value of the suppCardInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuppCardInd() {
        return suppCardInd;
    }

    /**
     * Sets the value of the suppCardInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuppCardInd(JAXBElement<String> value) {
        this.suppCardInd = value;
    }

    /**
     * Gets the value of the overCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverCode() {
        return overCode;
    }

    /**
     * Sets the value of the overCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverCode(JAXBElement<String> value) {
        this.overCode = value;
    }

    /**
     * Gets the value of the appOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAppOrigin() {
        return appOrigin;
    }

    /**
     * Sets the value of the appOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAppOrigin(JAXBElement<String> value) {
        this.appOrigin = value;
    }

    /**
     * Gets the value of the embossingDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmbossingDt() {
        return embossingDt;
    }

    /**
     * Sets the value of the embossingDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmbossingDt(JAXBElement<String> value) {
        this.embossingDt = value;
    }

    /**
     * Gets the value of the firstYrFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstYrFeeAmt() {
        return firstYrFeeAmt;
    }

    /**
     * Sets the value of the firstYrFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstYrFeeAmt(JAXBElement<String> value) {
        this.firstYrFeeAmt = value;
    }

    /**
     * Gets the value of the stmtMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStmtMode() {
        return stmtMode;
    }

    /**
     * Sets the value of the stmtMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStmtMode(JAXBElement<String> value) {
        this.stmtMode = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMail(JAXBElement<String> value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the housing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHousing() {
        return housing;
    }

    /**
     * Sets the value of the housing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHousing(JAXBElement<String> value) {
        this.housing = value;
    }

    /**
     * Gets the value of the housingExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHousingExt() {
        return housingExt;
    }

    /**
     * Sets the value of the housingExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHousingExt(JAXBElement<String> value) {
        this.housingExt = value;
    }

    /**
     * Gets the value of the reserve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * Sets the value of the reserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserve(String value) {
        this.reserve = value;
    }

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyType(String value) {
        this.keyType = value;
    }

    /**
     * Gets the value of the groupAccBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupAccBal() {
        return groupAccBal;
    }

    /**
     * Sets the value of the groupAccBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupAccBal(JAXBElement<String> value) {
        this.groupAccBal = value;
    }

    /**
     * Gets the value of the groupAccAuthBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupAccAuthBal() {
        return groupAccAuthBal;
    }

    /**
     * Sets the value of the groupAccAuthBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupAccAuthBal(JAXBElement<String> value) {
        this.groupAccAuthBal = value;
    }

    /**
     * Gets the value of the groupAccOutstandBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupAccOutstandBal() {
        return groupAccOutstandBal;
    }

    /**
     * Sets the value of the groupAccOutstandBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupAccOutstandBal(JAXBElement<String> value) {
        this.groupAccOutstandBal = value;
    }

    /**
     * Gets the value of the groupAccCashOutstandBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupAccCashOutstandBal() {
        return groupAccCashOutstandBal;
    }

    /**
     * Sets the value of the groupAccCashOutstandBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupAccCashOutstandBal(JAXBElement<String> value) {
        this.groupAccCashOutstandBal = value;
    }

    /**
     * Gets the value of the groupAccLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupAccLimit() {
        return groupAccLimit;
    }

    /**
     * Sets the value of the groupAccLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupAccLimit(JAXBElement<String> value) {
        this.groupAccLimit = value;
    }

    /**
     * Gets the value of the tranGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTranGroup() {
        return tranGroup;
    }

    /**
     * Sets the value of the tranGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTranGroup(JAXBElement<String> value) {
        this.tranGroup = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPeriod(JAXBElement<String> value) {
        this.period = value;
    }

    /**
     * Gets the value of the earlySettlementDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEarlySettlementDt() {
        return earlySettlementDt;
    }

    /**
     * Sets the value of the earlySettlementDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEarlySettlementDt(JAXBElement<String> value) {
        this.earlySettlementDt = value;
    }

    /**
     * Gets the value of the arrearsFee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrearsFee() {
        return arrearsFee;
    }

    /**
     * Sets the value of the arrearsFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrearsFee(JAXBElement<String> value) {
        this.arrearsFee = value;
    }

    /**
     * Gets the value of the overLimitFee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverLimitFee() {
        return overLimitFee;
    }

    /**
     * Sets the value of the overLimitFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverLimitFee(JAXBElement<String> value) {
        this.overLimitFee = value;
    }

    /**
     * Gets the value of the transactionFee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionFee() {
        return transactionFee;
    }

    /**
     * Sets the value of the transactionFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionFee(JAXBElement<String> value) {
        this.transactionFee = value;
    }

    /**
     * Gets the value of the governTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGovernTaxes() {
        return governTaxes;
    }

    /**
     * Sets the value of the governTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGovernTaxes(JAXBElement<String> value) {
        this.governTaxes = value;
    }

    /**
     * Gets the value of the preClosurePenalty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreClosurePenalty() {
        return preClosurePenalty;
    }

    /**
     * Sets the value of the preClosurePenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreClosurePenalty(JAXBElement<String> value) {
        this.preClosurePenalty = value;
    }

    /**
     * Gets the value of the instPlanBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstPlanBal() {
        return instPlanBal;
    }

    /**
     * Sets the value of the instPlanBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstPlanBal(JAXBElement<String> value) {
        this.instPlanBal = value;
    }

    /**
     * Gets the value of the acctCcy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcctCcy() {
        return acctCcy;
    }

    /**
     * Sets the value of the acctCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcctCcy(JAXBElement<String> value) {
        this.acctCcy = value;
    }

    /**
     * Gets the value of the fixedInstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFixedInstAmt() {
        return fixedInstAmt;
    }

    /**
     * Sets the value of the fixedInstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFixedInstAmt(JAXBElement<String> value) {
        this.fixedInstAmt = value;
    }

    /**
     * Gets the value of the emvChipEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmvChipEnabled() {
        return emvChipEnabled;
    }

    /**
     * Sets the value of the emvChipEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmvChipEnabled(String value) {
        this.emvChipEnabled = value;
    }

    /**
     * Gets the value of the relshipNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelshipNo() {
        return relshipNo;
    }

    /**
     * Sets the value of the relshipNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelshipNo(JAXBElement<String> value) {
        this.relshipNo = value;
    }

    /**
     * Gets the value of the primaryCust property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryCust() {
        return primaryCust;
    }

    /**
     * Sets the value of the primaryCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryCust(JAXBElement<String> value) {
        this.primaryCust = value;
    }

    /**
     * Gets the value of the notesStored property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotesStored() {
        return notesStored;
    }

    /**
     * Sets the value of the notesStored property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotesStored(JAXBElement<String> value) {
        this.notesStored = value;
    }

    /**
     * Gets the value of the functionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionRequest() {
        return functionRequest;
    }

    /**
     * Sets the value of the functionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionRequest(String value) {
        this.functionRequest = value;
    }

    /**
     * Gets the value of the pendingSCB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingSCB() {
        return pendingSCB;
    }

    /**
     * Sets the value of the pendingSCB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingSCB(String value) {
        this.pendingSCB = value;
    }

    /**
     * Gets the value of the optSCBRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptSCBRequest() {
        return optSCBRequest;
    }

    /**
     * Sets the value of the optSCBRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptSCBRequest(String value) {
        this.optSCBRequest = value;
    }

    /**
     * Gets the value of the pendingManhattan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingManhattan() {
        return pendingManhattan;
    }

    /**
     * Sets the value of the pendingManhattan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingManhattan(String value) {
        this.pendingManhattan = value;
    }

    /**
     * Gets the value of the optManhattanRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptManhattanRequest() {
        return optManhattanRequest;
    }

    /**
     * Sets the value of the optManhattanRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptManhattanRequest(String value) {
        this.optManhattanRequest = value;
    }

    /**
     * Gets the value of the pendingPrime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingPrime() {
        return pendingPrime;
    }

    /**
     * Sets the value of the pendingPrime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingPrime(String value) {
        this.pendingPrime = value;
    }

    /**
     * Gets the value of the optPrimeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptPrimeRequest() {
        return optPrimeRequest;
    }

    /**
     * Sets the value of the optPrimeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptPrimeRequest(String value) {
        this.optPrimeRequest = value;
    }

    /**
     * Gets the value of the checkingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckingAccount() {
        return checkingAccount;
    }

    /**
     * Sets the value of the checkingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckingAccount(JAXBElement<String> value) {
        this.checkingAccount = value;
    }

    /**
     * Gets the value of the savingsAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSavingsAccount() {
        return savingsAccount;
    }

    /**
     * Sets the value of the savingsAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSavingsAccount(JAXBElement<String> value) {
        this.savingsAccount = value;
    }

    /**
     * Gets the value of the userAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserAccount() {
        return userAccount;
    }

    /**
     * Sets the value of the userAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserAccount(JAXBElement<String> value) {
        this.userAccount = value;
    }

    /**
     * Gets the value of the paymentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentFlag() {
        return paymentFlag;
    }

    /**
     * Sets the value of the paymentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentFlag(JAXBElement<String> value) {
        this.paymentFlag = value;
    }

    /**
     * Gets the value of the pddmAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPDDMAmountDue() {
        return pddmAmountDue;
    }

    /**
     * Sets the value of the pddmAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPDDMAmountDue(JAXBElement<String> value) {
        this.pddmAmountDue = value;
    }

    /**
     * Gets the value of the ownershipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnershipFlag() {
        return ownershipFlag;
    }

    /**
     * Sets the value of the ownershipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnershipFlag(JAXBElement<String> value) {
        this.ownershipFlag = value;
    }

    /**
     * Gets the value of the maximumSpecialAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaximumSpecialAmount() {
        return maximumSpecialAmount;
    }

    /**
     * Sets the value of the maximumSpecialAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaximumSpecialAmount(JAXBElement<String> value) {
        this.maximumSpecialAmount = value;
    }

    /**
     * Gets the value of the maximumOverseasAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaximumOverseasAmount() {
        return maximumOverseasAmount;
    }

    /**
     * Sets the value of the maximumOverseasAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaximumOverseasAmount(JAXBElement<String> value) {
        this.maximumOverseasAmount = value;
    }

    /**
     * Gets the value of the maximumNormAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaximumNormAmount() {
        return maximumNormAmount;
    }

    /**
     * Sets the value of the maximumNormAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaximumNormAmount(JAXBElement<String> value) {
        this.maximumNormAmount = value;
    }

    /**
     * Gets the value of the monthlyInstallmentAmountSpecial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonthlyInstallmentAmountSpecial() {
        return monthlyInstallmentAmountSpecial;
    }

    /**
     * Sets the value of the monthlyInstallmentAmountSpecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonthlyInstallmentAmountSpecial(JAXBElement<String> value) {
        this.monthlyInstallmentAmountSpecial = value;
    }

    /**
     * Gets the value of the handlingFeePercentageSpecial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHandlingFeePercentageSpecial() {
        return handlingFeePercentageSpecial;
    }

    /**
     * Sets the value of the handlingFeePercentageSpecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHandlingFeePercentageSpecial(JAXBElement<String> value) {
        this.handlingFeePercentageSpecial = value;
    }

    /**
     * Gets the value of the handlingFeeAmountSpecial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHandlingFeeAmountSpecial() {
        return handlingFeeAmountSpecial;
    }

    /**
     * Sets the value of the handlingFeeAmountSpecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHandlingFeeAmountSpecial(JAXBElement<String> value) {
        this.handlingFeeAmountSpecial = value;
    }

    /**
     * Gets the value of the monthlyInstallmentAmountOversea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonthlyInstallmentAmountOversea() {
        return monthlyInstallmentAmountOversea;
    }

    /**
     * Sets the value of the monthlyInstallmentAmountOversea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonthlyInstallmentAmountOversea(JAXBElement<String> value) {
        this.monthlyInstallmentAmountOversea = value;
    }

    /**
     * Gets the value of the handlingFeePercentageOversea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHandlingFeePercentageOversea() {
        return handlingFeePercentageOversea;
    }

    /**
     * Sets the value of the handlingFeePercentageOversea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHandlingFeePercentageOversea(JAXBElement<String> value) {
        this.handlingFeePercentageOversea = value;
    }

    /**
     * Gets the value of the handlingFeeAmountOversea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHandlingFeeAmountOversea() {
        return handlingFeeAmountOversea;
    }

    /**
     * Sets the value of the handlingFeeAmountOversea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHandlingFeeAmountOversea(JAXBElement<String> value) {
        this.handlingFeeAmountOversea = value;
    }

    /**
     * Gets the value of the monthlyInstallmentAmountNormal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonthlyInstallmentAmountNormal() {
        return monthlyInstallmentAmountNormal;
    }

    /**
     * Sets the value of the monthlyInstallmentAmountNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonthlyInstallmentAmountNormal(JAXBElement<String> value) {
        this.monthlyInstallmentAmountNormal = value;
    }

    /**
     * Gets the value of the handlingFeePercentageNormal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHandlingFeePercentageNormal() {
        return handlingFeePercentageNormal;
    }

    /**
     * Sets the value of the handlingFeePercentageNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHandlingFeePercentageNormal(JAXBElement<String> value) {
        this.handlingFeePercentageNormal = value;
    }

    /**
     * Gets the value of the handlingFeeAmountNormal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHandlingFeeAmountNormal() {
        return handlingFeeAmountNormal;
    }

    /**
     * Sets the value of the handlingFeeAmountNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHandlingFeeAmountNormal(JAXBElement<String> value) {
        this.handlingFeeAmountNormal = value;
    }

    /**
     * Gets the value of the specialProductAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialProductAmount() {
        return specialProductAmount;
    }

    /**
     * Sets the value of the specialProductAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialProductAmount(JAXBElement<String> value) {
        this.specialProductAmount = value;
    }

    /**
     * Gets the value of the overseasProductAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverseasProductAmount() {
        return overseasProductAmount;
    }

    /**
     * Sets the value of the overseasProductAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverseasProductAmount(JAXBElement<String> value) {
        this.overseasProductAmount = value;
    }

    /**
     * Gets the value of the contactlessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactlessIndicator() {
        return contactlessIndicator;
    }

    /**
     * Sets the value of the contactlessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactlessIndicator(JAXBElement<String> value) {
        this.contactlessIndicator = value;
    }

    /**
     * Gets the value of the authTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthTransaction }
     * 
     * 
     */
    public List<AuthTransaction> getAuthTransaction() {
        if (authTransaction == null) {
            authTransaction = new ArrayList<AuthTransaction>();
        }
        return this.authTransaction;
    }

    /**
     * Gets the value of the oaaaTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oaaaTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOAAATransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OAAATransaction }
     * 
     * 
     */
    public List<OAAATransaction> getOAAATransaction() {
        if (oaaaTransaction == null) {
            oaaaTransaction = new ArrayList<OAAATransaction>();
        }
        return this.oaaaTransaction;
    }

    /**
     * Gets the value of the rewardSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rewardSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRewardSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RewardSummary }
     * 
     * 
     */
    public List<RewardSummary> getRewardSummary() {
        if (rewardSummary == null) {
            rewardSummary = new ArrayList<RewardSummary>();
        }
        return this.rewardSummary;
    }

    /**
     * Gets the value of the merchandiseDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the merchandiseDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMerchandiseDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MerchandiseDetail }
     * 
     * 
     */
    public List<MerchandiseDetail> getMerchandiseDetail() {
        if (merchandiseDetail == null) {
            merchandiseDetail = new ArrayList<MerchandiseDetail>();
        }
        return this.merchandiseDetail;
    }

    /**
     * Gets the value of the creditHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditHistory }
     * 
     * 
     */
    public List<CreditHistory> getCreditHistory() {
        if (creditHistory == null) {
            creditHistory = new ArrayList<CreditHistory>();
        }
        return this.creditHistory;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transaction }
     * 
     * 
     */
    public List<Transaction> getTransaction() {
        if (transaction == null) {
            transaction = new ArrayList<Transaction>();
        }
        return this.transaction;
    }

    /**
     * Gets the value of the unbilledTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unbilledTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnbilledTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transaction }
     * 
     * 
     */
    public List<Transaction> getUnbilledTransaction() {
        if (unbilledTransaction == null) {
            unbilledTransaction = new ArrayList<Transaction>();
        }
        return this.unbilledTransaction;
    }

    /**
     * Gets the value of the memo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Memo }
     * 
     * 
     */
    public List<Memo> getMemo() {
        if (memo == null) {
            memo = new ArrayList<Memo>();
        }
        return this.memo;
    }

    /**
     * Gets the value of the currentPot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentPot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentPot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pot }
     * 
     * 
     */
    public List<Pot> getCurrentPot() {
        if (currentPot == null) {
            currentPot = new ArrayList<Pot>();
        }
        return this.currentPot;
    }

    /**
     * Gets the value of the pendingPot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pendingPot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPendingPot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pot }
     * 
     * 
     */
    public List<Pot> getPendingPot() {
        if (pendingPot == null) {
            pendingPot = new ArrayList<Pot>();
        }
        return this.pendingPot;
    }

    /**
     * Gets the value of the currentSubPot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentSubPot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentSubPot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pot }
     * 
     * 
     */
    public List<Pot> getCurrentSubPot() {
        if (currentSubPot == null) {
            currentSubPot = new ArrayList<Pot>();
        }
        return this.currentSubPot;
    }

    /**
     * Gets the value of the pendingSubPot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pendingSubPot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPendingSubPot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pot }
     * 
     * 
     */
    public List<Pot> getPendingSubPot() {
        if (pendingSubPot == null) {
            pendingSubPot = new ArrayList<Pot>();
        }
        return this.pendingSubPot;
    }

    /**
     * Gets the value of the supplimentCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplimentCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplimentCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplimentCard }
     * 
     * 
     */
    public List<SupplimentCard> getSupplimentCard() {
        if (supplimentCard == null) {
            supplimentCard = new ArrayList<SupplimentCard>();
        }
        return this.supplimentCard;
    }

    /**
     * Gets the value of the cardDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDetails }
     * 
     * 
     */
    public List<CardDetails> getCardDetails() {
        if (cardDetails == null) {
            cardDetails = new ArrayList<CardDetails>();
        }
        return this.cardDetails;
    }

    /**
     * Gets the value of the cardAccessDet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardAccessDet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardAccessDet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardAccessDetails }
     * 
     * 
     */
    public List<CardAccessDetails> getCardAccessDet() {
        if (cardAccessDet == null) {
            cardAccessDet = new ArrayList<CardAccessDetails>();
        }
        return this.cardAccessDet;
    }

    /**
     * Gets the value of the cashOneDet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashOneDet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCashOneDet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOneDetails }
     * 
     * 
     */
    public List<CashOneDetails> getCashOneDet() {
        if (cashOneDet == null) {
            cashOneDet = new ArrayList<CashOneDetails>();
        }
        return this.cashOneDet;
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
     * Gets the value of the balanceHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceHistory }
     * 
     * 
     */
    public List<BalanceHistory> getBalanceHistory() {
        if (balanceHistory == null) {
            balanceHistory = new ArrayList<BalanceHistory>();
        }
        return this.balanceHistory;
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
     * Gets the value of the merchantDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the merchantDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMerchantDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MerchantDetail }
     * 
     * 
     */
    public List<MerchantDetail> getMerchantDetails() {
        if (merchantDetails == null) {
            merchantDetails = new ArrayList<MerchantDetail>();
        }
        return this.merchantDetails;
    }

    /**
     * Gets the value of the statusHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusHistory }
     * 
     * 
     */
    public List<StatusHistory> getStatusHistory() {
        if (statusHistory == null) {
            statusHistory = new ArrayList<StatusHistory>();
        }
        return this.statusHistory;
    }

    /**
     * Gets the value of the statementHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementHistory }
     * 
     * 
     */
    public List<StatementHistory> getStatementHistory() {
        if (statementHistory == null) {
            statementHistory = new ArrayList<StatementHistory>();
        }
        return this.statementHistory;
    }

    /**
     * Gets the value of the priorityPassDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorityPassDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorityPassDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorityPassDetail }
     * 
     * 
     */
    public List<PriorityPassDetail> getPriorityPassDetails() {
        if (priorityPassDetails == null) {
            priorityPassDetails = new ArrayList<PriorityPassDetail>();
        }
        return this.priorityPassDetails;
    }

    /**
     * Gets the value of the purgeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purgeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurgeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurgeDetails }
     * 
     * 
     */
    public List<PurgeDetails> getPurgeDetails() {
        if (purgeDetails == null) {
            purgeDetails = new ArrayList<PurgeDetails>();
        }
        return this.purgeDetails;
    }

    /**
     * Gets the value of the blockDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlockDetail }
     * 
     * 
     */
    public List<BlockDetail> getBlockDetails() {
        if (blockDetails == null) {
            blockDetails = new ArrayList<BlockDetail>();
        }
        return this.blockDetails;
    }

    /**
     * Gets the value of the pastTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pastTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPastTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PastTransactions }
     * 
     * 
     */
    public List<PastTransactions> getPastTransactions() {
        if (pastTransactions == null) {
            pastTransactions = new ArrayList<PastTransactions>();
        }
        return this.pastTransactions;
    }

    /**
     * Gets the value of the supplementaryCardholderDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplementaryCardholderDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplementaryCardholderDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryCardholderDetails }
     * 
     * 
     */
    public List<SupplementaryCardholderDetails> getSupplementaryCardholderDetails() {
        if (supplementaryCardholderDetails == null) {
            supplementaryCardholderDetails = new ArrayList<SupplementaryCardholderDetails>();
        }
        return this.supplementaryCardholderDetails;
    }

    /**
     * Gets the value of the airlineMembership property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airlineMembership property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirlineMembership().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlineMembership }
     * 
     * 
     */
    public List<AirlineMembership> getAirlineMembership() {
        if (airlineMembership == null) {
            airlineMembership = new ArrayList<AirlineMembership>();
        }
        return this.airlineMembership;
    }

    /**
     * Gets the value of the plcCardDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plcCardDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPLCCardDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PLCCardDetails }
     * 
     * 
     */
    public List<PLCCardDetails> getPLCCardDetails() {
        if (plcCardDetails == null) {
            plcCardDetails = new ArrayList<PLCCardDetails>();
        }
        return this.plcCardDetails;
    }

    /**
     * Gets the value of the callInTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callInTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallInTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallInTxns }
     * 
     * 
     */
    public List<CallInTxns> getCallInTransactions() {
        if (callInTransactions == null) {
            callInTransactions = new ArrayList<CallInTxns>();
        }
        return this.callInTransactions;
    }

    /**
     * Gets the value of the vipUsageTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vipUsageTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVIPUsageTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VIPUsageTransactions }
     * 
     * 
     */
    public List<VIPUsageTransactions> getVIPUsageTransactions() {
        if (vipUsageTransactions == null) {
            vipUsageTransactions = new ArrayList<VIPUsageTransactions>();
        }
        return this.vipUsageTransactions;
    }

    /**
     * Gets the value of the airportParking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportParking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportParking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportParking }
     * 
     * 
     */
    public List<AirportParking> getAirportParking() {
        if (airportParking == null) {
            airportParking = new ArrayList<AirportParking>();
        }
        return this.airportParking;
    }

    /**
     * Gets the value of the smsAlerts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smsAlerts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSMSAlerts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SMSAlerts }
     * 
     * 
     */
    public List<SMSAlerts> getSMSAlerts() {
        if (smsAlerts == null) {
            smsAlerts = new ArrayList<SMSAlerts>();
        }
        return this.smsAlerts;
    }

    /**
     * Gets the value of the idrpDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idrpDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDRPDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDRPDtls }
     * 
     * 
     */
    public List<IDRPDtls> getIDRPDetails() {
        if (idrpDetails == null) {
            idrpDetails = new ArrayList<IDRPDtls>();
        }
        return this.idrpDetails;
    }

    /**
     * Gets the value of the cardInsurance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardInsurance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardInsurance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardInsurance }
     * 
     * 
     */
    public List<CardInsurance> getCardInsurance() {
        if (cardInsurance == null) {
            cardInsurance = new ArrayList<CardInsurance>();
        }
        return this.cardInsurance;
    }

    /**
     * Gets the value of the cardService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Service }
     * 
     * 
     */
    public List<Service> getCardService() {
        if (cardService == null) {
            cardService = new ArrayList<Service>();
        }
        return this.cardService;
    }

    /**
     * Gets the value of the penaltyWaiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyWaiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyWaiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenaltyWaiver }
     * 
     * 
     */
    public List<PenaltyWaiver> getPenaltyWaiver() {
        if (penaltyWaiver == null) {
            penaltyWaiver = new ArrayList<PenaltyWaiver>();
        }
        return this.penaltyWaiver;
    }

    /**
     * Gets the value of the rewardTransactionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rewardTransactionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRewardTransactionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RewardTransactionDetails }
     * 
     * 
     */
    public List<RewardTransactionDetails> getRewardTransactionDetails() {
        if (rewardTransactionDetails == null) {
            rewardTransactionDetails = new ArrayList<RewardTransactionDetails>();
        }
        return this.rewardTransactionDetails;
    }

    /**
     * Gets the value of the rewardHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rewardHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRewardHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RewardHistory }
     * 
     * 
     */
    public List<RewardHistory> getRewardHistory() {
        if (rewardHistory == null) {
            rewardHistory = new ArrayList<RewardHistory>();
        }
        return this.rewardHistory;
    }

    /**
     * Gets the value of the cardRPCTransactionHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardRPCTransactionHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardRPCTransactionHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardRPC }
     * 
     * 
     */
    public List<CardRPC> getCardRPCTransactionHistory() {
        if (cardRPCTransactionHistory == null) {
            cardRPCTransactionHistory = new ArrayList<CardRPC>();
        }
        return this.cardRPCTransactionHistory;
    }

    /**
     * Gets the value of the cardMultipleBonusEnquiry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardMultipleBonusEnquiry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardMultipleBonusEnquiry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reward }
     * 
     * 
     */
    public List<Reward> getCardMultipleBonusEnquiry() {
        if (cardMultipleBonusEnquiry == null) {
            cardMultipleBonusEnquiry = new ArrayList<Reward>();
        }
        return this.cardMultipleBonusEnquiry;
    }

    /**
     * Gets the value of the earlyRepaymentSavingsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earlyRepaymentSavingsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarlyRepaymentSavingsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EarlyRepaySavings }
     * 
     * 
     */
    public List<EarlyRepaySavings> getEarlyRepaymentSavingsDetails() {
        if (earlyRepaymentSavingsDetails == null) {
            earlyRepaymentSavingsDetails = new ArrayList<EarlyRepaySavings>();
        }
        return this.earlyRepaymentSavingsDetails;
    }

    /**
     * Gets the value of the lineBurnDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineBurnDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineBurnDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineBurn }
     * 
     * 
     */
    public List<LineBurn> getLineBurnDetails() {
        if (lineBurnDetails == null) {
            lineBurnDetails = new ArrayList<LineBurn>();
        }
        return this.lineBurnDetails;
    }

    /**
     * Gets the value of the campaignDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignDet }
     * 
     * 
     */
    public List<CampaignDet> getCampaignDetails() {
        if (campaignDetails == null) {
            campaignDetails = new ArrayList<CampaignDet>();
        }
        return this.campaignDetails;
    }

    /**
     * Gets the value of the thirteenMonthHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirteenMonthHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThirteenMonthHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirteenMonth }
     * 
     * 
     */
    public List<ThirteenMonth> getThirteenMonthHistory() {
        if (thirteenMonthHistory == null) {
            thirteenMonthHistory = new ArrayList<ThirteenMonth>();
        }
        return this.thirteenMonthHistory;
    }

    /**
     * Gets the value of the taxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDet }
     * 
     * 
     */
    public List<TaxDet> getTaxDetails() {
        if (taxDetails == null) {
            taxDetails = new ArrayList<TaxDet>();
        }
        return this.taxDetails;
    }

    /**
     * Gets the value of the drawDownDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drawDownDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrawDownDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DrawDown }
     * 
     * 
     */
    public List<DrawDown> getDrawDownDetails() {
        if (drawDownDetails == null) {
            drawDownDetails = new ArrayList<DrawDown>();
        }
        return this.drawDownDetails;
    }

    /**
     * Gets the value of the customerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustDet }
     * 
     * 
     */
    public List<CustDet> getCustomerDetails() {
        if (customerDetails == null) {
            customerDetails = new ArrayList<CustDet>();
        }
        return this.customerDetails;
    }

    /**
     * Gets the value of the pricingHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingHistory }
     * 
     * 
     */
    public List<PricingHistory> getPricingHistory() {
        if (pricingHistory == null) {
            pricingHistory = new ArrayList<PricingHistory>();
        }
        return this.pricingHistory;
    }

    /**
     * Gets the value of the topupHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topupHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopupHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopupHistory }
     * 
     * 
     */
    public List<TopupHistory> getTopupHistory() {
        if (topupHistory == null) {
            topupHistory = new ArrayList<TopupHistory>();
        }
        return this.topupHistory;
    }

    /**
     * Gets the value of the forecast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Forecast }
     * 
     * 
     */
    public List<Forecast> getForecast() {
        if (forecast == null) {
            forecast = new ArrayList<Forecast>();
        }
        return this.forecast;
    }

    /**
     * Gets the value of the tier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tier }
     * 
     * 
     */
    public List<Tier> getTier() {
        if (tier == null) {
            tier = new ArrayList<Tier>();
        }
        return this.tier;
    }

    /**
     * Gets the value of the gift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Gift }
     * 
     * 
     */
    public List<Gift> getGift() {
        if (gift == null) {
            gift = new ArrayList<Gift>();
        }
        return this.gift;
    }

    /**
     * Gets the value of the earnDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earnDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarnDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EarnDetails }
     * 
     * 
     */
    public List<EarnDetails> getEarnDetails() {
        if (earnDetails == null) {
            earnDetails = new ArrayList<EarnDetails>();
        }
        return this.earnDetails;
    }

    /**
     * Gets the value of the cardSummaryDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardSummaryDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardSummaryDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardSummaryDtl }
     * 
     * 
     */
    public List<CardSummaryDtl> getCardSummaryDtl() {
        if (cardSummaryDtl == null) {
            cardSummaryDtl = new ArrayList<CardSummaryDtl>();
        }
        return this.cardSummaryDtl;
    }

    /**
     * Gets the value of the transactionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionDetails }
     * 
     * 
     */
    public List<TransactionDetails> getTransactionDetails() {
        if (transactionDetails == null) {
            transactionDetails = new ArrayList<TransactionDetails>();
        }
        return this.transactionDetails;
    }

    /**
     * Gets the value of the balanceBucketsHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceBucketsHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceBucketsHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceBucketsHistory }
     * 
     * 
     */
    public List<BalanceBucketsHistory> getBalanceBucketsHistory() {
        if (balanceBucketsHistory == null) {
            balanceBucketsHistory = new ArrayList<BalanceBucketsHistory>();
        }
        return this.balanceBucketsHistory;
    }

    /**
     * Gets the value of the tokenCardList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tokenCardList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTokenCardList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TokenCardList }
     * 
     * 
     */
    public List<TokenCardList> getTokenCardList() {
        if (tokenCardList == null) {
            tokenCardList = new ArrayList<TokenCardList>();
        }
        return this.tokenCardList;
    }

    /**
     * Gets the value of the embossingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the embossingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmbossingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmbossingDetails }
     * 
     * 
     */
    public List<EmbossingDetails> getEmbossingDetails() {
        if (embossingDetails == null) {
            embossingDetails = new ArrayList<EmbossingDetails>();
        }
        return this.embossingDetails;
    }

    /**
     * Gets the value of the linkedCards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedCards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedCards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedCards }
     * 
     * 
     */
    public List<LinkedCards> getLinkedCards() {
        if (linkedCards == null) {
            linkedCards = new ArrayList<LinkedCards>();
        }
        return this.linkedCards;
    }

    /**
     * Gets the value of the paymentHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentHistory }
     * 
     * 
     */
    public List<PaymentHistory> getPaymentHistory() {
        if (paymentHistory == null) {
            paymentHistory = new ArrayList<PaymentHistory>();
        }
        return this.paymentHistory;
    }

    /**
     * Gets the value of the installmentPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installmentPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstallmentPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstallmentPlan }
     * 
     * 
     */
    public List<InstallmentPlan> getInstallmentPlan() {
        if (installmentPlan == null) {
            installmentPlan = new ArrayList<InstallmentPlan>();
        }
        return this.installmentPlan;
    }

    /**
     * Gets the value of the subAcctDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subAcctDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAcctDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubAcctDtl }
     * 
     * 
     */
    public List<SubAcctDtl> getSubAcctDtl() {
        if (subAcctDtl == null) {
            subAcctDtl = new ArrayList<SubAcctDtl>();
        }
        return this.subAcctDtl;
    }

    /**
     * Gets the value of the primaryCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrimaryCard }
     * 
     * 
     */
    public List<PrimaryCard> getPrimaryCard() {
        if (primaryCard == null) {
            primaryCard = new ArrayList<PrimaryCard>();
        }
        return this.primaryCard;
    }

    /**
     * Gets the value of the notesData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notesData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotesData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotesData }
     * 
     * 
     */
    public List<NotesData> getNotesData() {
        if (notesData == null) {
            notesData = new ArrayList<NotesData>();
        }
        return this.notesData;
    }

    /**
     * Gets the value of the scbOverlimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scbOverlimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSCBOverlimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCBOverlimit }
     * 
     * 
     */
    public List<SCBOverlimit> getSCBOverlimit() {
        if (scbOverlimit == null) {
            scbOverlimit = new ArrayList<SCBOverlimit>();
        }
        return this.scbOverlimit;
    }

    /**
     * Gets the value of the manhattanOverlimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manhattanOverlimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManhattanOverlimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManhattanOverlimit }
     * 
     * 
     */
    public List<ManhattanOverlimit> getManhattanOverlimit() {
        if (manhattanOverlimit == null) {
            manhattanOverlimit = new ArrayList<ManhattanOverlimit>();
        }
        return this.manhattanOverlimit;
    }

    /**
     * Gets the value of the primeOverlimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primeOverlimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimeOverlimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrimeOverlimit }
     * 
     * 
     */
    public List<PrimeOverlimit> getPrimeOverlimit() {
        if (primeOverlimit == null) {
            primeOverlimit = new ArrayList<PrimeOverlimit>();
        }
        return this.primeOverlimit;
    }

    /**
     * Gets the value of the monthtoDateDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthtoDateDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthtoDateDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthtoDateDetails }
     * 
     * 
     */
    public List<MonthtoDateDetails> getMonthtoDateDetails() {
        if (monthtoDateDetails == null) {
            monthtoDateDetails = new ArrayList<MonthtoDateDetails>();
        }
        return this.monthtoDateDetails;
    }

    /**
     * Gets the value of the monthlyInstallmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthlyInstallmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthlyInstallmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthlyInstallmentDetails }
     * 
     * 
     */
    public List<MonthlyInstallmentDetails> getMonthlyInstallmentDetails() {
        if (monthlyInstallmentDetails == null) {
            monthlyInstallmentDetails = new ArrayList<MonthlyInstallmentDetails>();
        }
        return this.monthlyInstallmentDetails;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}
     *     
     */
    public JAXBElement<ServiceResponse> getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}
     *     
     */
    public void setResponse(JAXBElement<ServiceResponse> value) {
        this.response = value;
    }

}
