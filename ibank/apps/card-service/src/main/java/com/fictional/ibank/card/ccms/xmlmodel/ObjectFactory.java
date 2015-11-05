
package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fictional.ibank.card.ccms.xmlmodel package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SecurityFault_QNAME = new QName("http://fault.service.common.scb", "SecurityFault");
    private final static QName _ServiceFault_QNAME = new QName("http://fault.service.common.scb", "ServiceFault");
    private final static QName _TransactionHistory_QNAME = new QName("http://entity.cards.common.scb", "TransactionHistory");
    private final static QName _AuthorisedTransaction_QNAME = new QName("http://entity.cards.common.scb", "AuthorisedTransaction");
    private final static QName _OAAATransaction_QNAME = new QName("http://entity.cards.common.scb", "OAAATransaction");
    private final static QName _EnquireEarlySettlement_QNAME = new QName("http://entity.cards.common.scb", "EnquireEarlySettlement");
    private final static QName _EnquireCardDetails_QNAME = new QName("http://entity.cards.common.scb", "EnquireCardDetails");
    private final static QName _MerchandiseDetails_QNAME = new QName("http://entity.cards.common.scb", "MerchandiseDetails");
    private final static QName _EnquireRewardPoints_QNAME = new QName("http://entity.cards.common.scb", "EnquireRewardPoints");
    private final static QName _EnquireDelinquencyHistory_QNAME = new QName("http://entity.cards.common.scb", "EnquireDelinquencyHistory");
    private final static QName _EnquireCreditHistory_QNAME = new QName("http://entity.cards.common.scb", "EnquireCreditHistory");
    private final static QName _CreateCardNotes_QNAME = new QName("http://entity.cards.common.scb", "CreateCardNotes");
    private final static QName _EnquireCardNotes_QNAME = new QName("http://entity.cards.common.scb", "EnquireCardNotes");
    private final static QName _EnquireCashOneDetails_QNAME = new QName("http://entity.cards.common.scb", "EnquireCashOneDetails");
    private final static QName _GetCustomerRewardPointsSummary_QNAME = new QName("http://entity.cards.common.scb", "GetCustomerRewardPointsSummary");
    private final static QName _GetCardRewardPointsSummary_QNAME = new QName("http://entity.cards.common.scb", "GetCardRewardPointsSummary");
    private final static QName _GetRewardPointsTransaction_QNAME = new QName("http://entity.cards.common.scb", "GetRewardPointsTransaction");
    private final static QName _EnquireCardCustomer_QNAME = new QName("http://entity.cards.common.scb", "EnquireCardCustomer");
    private final static QName _EnquireLinkedCards_QNAME = new QName("http://entity.cards.common.scb", "EnquireLinkedCards");
    private final static QName _GetRewardRedemptionDetails_QNAME = new QName("http://entity.cards.common.scb", "GetRewardRedemptionDetails");
    private final static QName _GetMerchantDetails_QNAME = new QName("http://entity.cards.common.scb", "GetMerchantDetails");
    private final static QName _GetCardDisputeResolutionDetails_QNAME = new QName("http://entity.cards.common.scb", "GetCardDisputeResolutionDetails");
    private final static QName _GetCardReturnDetails_QNAME = new QName("http://entity.cards.common.scb", "GetCardReturnDetails");
    private final static QName _GetCardRewardRedemptionDetails_QNAME = new QName("http://entity.cards.common.scb", "GetCardRewardRedemptionDetails");
    private final static QName _GetCardStatementHistory_QNAME = new QName("http://entity.cards.common.scb", "GetCardStatementHistory");
    private final static QName _GetPriorityPassDetails_QNAME = new QName("http://entity.cards.common.scb", "GetPriorityPassDetails");
    private final static QName _GetCreditCardPurgeDetails_QNAME = new QName("http://entity.cards.common.scb", "GetCreditCardPurgeDetails");
    private final static QName _GetPastCardTransactions_QNAME = new QName("http://entity.cards.common.scb", "GetPastCardTransactions");
    private final static QName _GetCardBlockCodeDescription_QNAME = new QName("http://entity.cards.common.scb", "GetCardBlockCodeDescription");
    private final static QName _GetCardCallInCashDetails_QNAME = new QName("http://entity.cards.common.scb", "GetCardCallInCashDetails");
    private final static QName _GetCardPaymentActivityList_QNAME = new QName("http://entity.cards.common.scb", "GetCardPaymentActivityList");
    private final static QName _GetCardSpecialTxnHistory_QNAME = new QName("http://entity.cards.common.scb", "GetCardSpecialTxnHistory");
    private final static QName _GetCardSMSAlerts_QNAME = new QName("http://entity.cards.common.scb", "GetCardSMSAlerts");
    private final static QName _GetCardCashLimit_QNAME = new QName("http://entity.cards.common.scb", "GetCardCashLimit");
    private final static QName _GetCardForecastDetails_QNAME = new QName("http://entity.cards.common.scb", "GetCardForecastDetails");
    private final static QName _GetCardInsuranceDetails_QNAME = new QName("http://entity.cards.common.scb", "GetCardInsuranceDetails");
    private final static QName _GetCardSpecialServicesDetails_QNAME = new QName("http://entity.cards.common.scb", "GetCardSpecialServicesDetails");
    private final static QName _GetCardWaiverHistory_QNAME = new QName("http://entity.cards.common.scb", "GetCardWaiverHistory");
    private final static QName _GetCardRPCTransactionHistory_QNAME = new QName("http://entity.cards.common.scb", "GetCardRPCTransactionHistory");
    private final static QName _GetCardMultipleBonusEnquiry_QNAME = new QName("http://entity.cards.common.scb", "GetCardMultipleBonusEnquiry");
    private final static QName _GetEarlyRepaymentSavingsDetails_QNAME = new QName("http://entity.cards.common.scb", "GetEarlyRepaymentSavingsDetails");
    private final static QName _GetCardLineBurnDetails_QNAME = new QName("http://entity.cards.common.scb", "GetCardLineBurnDetails");
    private final static QName _GetCardMPSOrderEnquiry_QNAME = new QName("http://entity.cards.common.scb", "GetCardMPSOrderEnquiry");
    private final static QName _GetOctopusCardDetails_QNAME = new QName("http://entity.cards.common.scb", "GetOctopusCardDetails");
    private final static QName _GetRelPricingCampaignDetail_QNAME = new QName("http://entity.cards.common.scb", "GetRelPricingCampaignDetail");
    private final static QName _GetCardLineBurnTaxDetails_QNAME = new QName("http://entity.cards.common.scb", "GetCardLineBurnTaxDetails");
    private final static QName _GetCardPricingHistory_QNAME = new QName("http://entity.cards.common.scb", "GetCardPricingHistory");
    private final static QName _GetCardTopUpHistory_QNAME = new QName("http://entity.cards.common.scb", "GetCardTopUpHistory");
    private final static QName _GetCardSummary_QNAME = new QName("http://entity.cards.common.scb", "GetCardSummary");
    private final static QName _GetCardSpendDetails_QNAME = new QName("http://entity.cards.common.scb", "GetCardSpendDetails");
    private final static QName _EnquireCardStatus_QNAME = new QName("http://entity.cards.common.scb", "EnquireCardStatus");
    private final static QName _GetCustomerSummary_QNAME = new QName("http://entity.cards.common.scb", "GetCustomerSummary");
    private final static QName _GetStatementSummary_QNAME = new QName("http://entity.cards.common.scb", "GetStatementSummary");
    private final static QName _RedeemBonusPoints_QNAME = new QName("http://entity.cards.common.scb", "RedeemBonusPoints");
    private final static QName _GetTransactionHistory_QNAME = new QName("http://entity.cards.common.scb", "GetTransactionHistory");
    private final static QName _GetPointTransfer_QNAME = new QName("http://entity.cards.common.scb", "GetPointTransfer");
    private final static QName _GetBalanceBucketsHistory_QNAME = new QName("http://entity.cards.common.scb", "GetBalanceBucketsHistory");
    private final static QName _GetTokenCardDetails_QNAME = new QName("http://entity.cards.common.scb", "GetTokenCardDetails");
    private final static QName _UpdateTokenStatus_QNAME = new QName("http://entity.cards.common.scb", "UpdateTokenStatus");
    private final static QName _SynchronizeToken_QNAME = new QName("http://entity.cards.common.scb", "SynchronizeToken");
    private final static QName _GetCardActivationStatus_QNAME = new QName("http://entity.cards.common.scb", "GetCardActivationStatus");
    private final static QName _RequestCreditLimitIncrease_QNAME = new QName("http://entity.cards.common.scb", "RequestCreditLimitIncrease");
    private final static QName _GetAffinityDetails_QNAME = new QName("http://entity.cards.common.scb", "GetAffinityDetails");
    private final static QName _GetInstallmentPrgm_QNAME = new QName("http://entity.cards.common.scb", "GetInstallmentPrgm");
    private final static QName _GetPaymentHistory_QNAME = new QName("http://entity.cards.common.scb", "GetPaymentHistory");
    private final static QName _GetInstallmentplan_QNAME = new QName("http://entity.cards.common.scb", "GetInstallmentplan");
    private final static QName _GetOverlimitOptOutFlag_QNAME = new QName("http://entity.cards.common.scb", "GetOverlimitOptOutFlag");
    private final static QName _SegmentType_QNAME = new QName("http://entity.service.common.scb", "SegmentType");
    private final static QName _ArmType_QNAME = new QName("http://entity.service.common.scb", "ArmType");
    private final static QName _ServiceHeader_QNAME = new QName("http://entity.service.common.scb", "ServiceHeader");
    private final static QName _UserNameTokenUserName_QNAME = new QName("http://entity.service.common.scb", "userName");
    private final static QName _UserNameTokenPassword_QNAME = new QName("http://entity.service.common.scb", "password");
    private final static QName _ServiceResponseResponseCode_QNAME = new QName("http://entity.service.common.scb", "responseCode");
    private final static QName _ServiceResponseResponseDescription_QNAME = new QName("http://entity.service.common.scb", "responseDescription");
    private final static QName _ServiceResponseHostSystem_QNAME = new QName("http://entity.service.common.scb", "hostSystem");
    private final static QName _ContactEMail1_QNAME = new QName("http://entity.service.common.scb", "eMail1");
    private final static QName _ContactEMail2_QNAME = new QName("http://entity.service.common.scb", "eMail2");
    private final static QName _ContactHomePhone_QNAME = new QName("http://entity.service.common.scb", "homePhone");
    private final static QName _ContactMobile_QNAME = new QName("http://entity.service.common.scb", "mobile");
    private final static QName _ContactOffice_QNAME = new QName("http://entity.service.common.scb", "office");
    private final static QName _ContactOfficeExtn_QNAME = new QName("http://entity.service.common.scb", "officeExtn");
    private final static QName _AddressWauFlag_QNAME = new QName("http://entity.service.common.scb", "wauFlag");
    private final static QName _AddressAddressType_QNAME = new QName("http://entity.service.common.scb", "addressType");
    private final static QName _AddressMailingTitle1_QNAME = new QName("http://entity.service.common.scb", "mailingTitle1");
    private final static QName _AddressMailingTitle2_QNAME = new QName("http://entity.service.common.scb", "mailingTitle2");
    private final static QName _AddressAttentionPartyName_QNAME = new QName("http://entity.service.common.scb", "attentionPartyName");
    private final static QName _AddressAddressLine1_QNAME = new QName("http://entity.service.common.scb", "addressLine1");
    private final static QName _AddressAddressLine2_QNAME = new QName("http://entity.service.common.scb", "addressLine2");
    private final static QName _AddressAddressLine3_QNAME = new QName("http://entity.service.common.scb", "addressLine3");
    private final static QName _AddressAddressLine4_QNAME = new QName("http://entity.service.common.scb", "addressLine4");
    private final static QName _AddressCity_QNAME = new QName("http://entity.service.common.scb", "city");
    private final static QName _AddressState_QNAME = new QName("http://entity.service.common.scb", "state");
    private final static QName _AddressPostalCode_QNAME = new QName("http://entity.service.common.scb", "postalCode");
    private final static QName _AddressPoBox_QNAME = new QName("http://entity.service.common.scb", "poBox");
    private final static QName _AddressNearestLandmark_QNAME = new QName("http://entity.service.common.scb", "nearestLandmark");
    private final static QName _AddressCountry_QNAME = new QName("http://entity.service.common.scb", "country");
    private final static QName _MaintInfoBy_QNAME = new QName("http://entity.service.common.scb", "by");
    private final static QName _MaintInfoDate_QNAME = new QName("http://entity.service.common.scb", "date");
    private final static QName _TypeDescType_QNAME = new QName("http://entity.service.common.scb", "type");
    private final static QName _TypeDescDesc_QNAME = new QName("http://entity.service.common.scb", "desc");
    private final static QName _CodeDescCode_QNAME = new QName("http://entity.service.common.scb", "code");
    private final static QName _CurrAmountAmt_QNAME = new QName("http://entity.service.common.scb", "amt");
    private final static QName _CurrAmountCcyCode_QNAME = new QName("http://entity.service.common.scb", "ccyCode");
    private final static QName _CurrAmountCcyDesc_QNAME = new QName("http://entity.service.common.scb", "ccyDesc");
    private final static QName _ServiceHeaderUserNameToken_QNAME = new QName("http://entity.service.common.scb", "userNameToken");
    private final static QName _ServiceHeaderConsumerID_QNAME = new QName("http://entity.service.common.scb", "consumerID");
    private final static QName _ServiceHeaderConsumerCountry_QNAME = new QName("http://entity.service.common.scb", "consumerCountry");
    private final static QName _ServiceHeaderServiceTimeStamp_QNAME = new QName("http://entity.service.common.scb", "serviceTimeStamp");
    private final static QName _ServiceHeaderRequestID_QNAME = new QName("http://entity.service.common.scb", "requestID");
    private final static QName _ServiceHeaderTargetFlag_QNAME = new QName("http://entity.service.common.scb", "targetFlag");
    private final static QName _ArmTypeArmCode_QNAME = new QName("http://entity.service.common.scb", "armCode");
    private final static QName _ArmTypeArmDesc_QNAME = new QName("http://entity.service.common.scb", "armDesc");
    private final static QName _SegmentTypeSegmentCode_QNAME = new QName("http://entity.service.common.scb", "segmentCode");
    private final static QName _SegmentTypeSegmentDesc_QNAME = new QName("http://entity.service.common.scb", "segmentDesc");
    private final static QName _MonthlyInstallmentDetailsInstallmentAmount_QNAME = new QName("http://entity.cards.common.scb", "installmentAmount");
    private final static QName _MonthlyInstallmentDetailsInstallmentTenor_QNAME = new QName("http://entity.cards.common.scb", "installmentTenor");
    private final static QName _MonthlyInstallmentDetailsStatementDate_QNAME = new QName("http://entity.cards.common.scb", "statementDate");
    private final static QName _MonthtoDateDetailsMonthlyToDate_QNAME = new QName("http://entity.cards.common.scb", "monthlyToDate");
    private final static QName _NotesDataNotesDate_QNAME = new QName("http://entity.cards.common.scb", "notesDate");
    private final static QName _NotesDataNotesType_QNAME = new QName("http://entity.cards.common.scb", "notesType");
    private final static QName _NotesDataAcctNotes_QNAME = new QName("http://entity.cards.common.scb", "acctNotes");
    private final static QName _NotesDataArrearsLevel_QNAME = new QName("http://entity.cards.common.scb", "arrearsLevel");
    private final static QName _NotesDataOverrideCode_QNAME = new QName("http://entity.cards.common.scb", "overrideCode");
    private final static QName _NotesDataUserID_QNAME = new QName("http://entity.cards.common.scb", "userID");
    private final static QName _NotesNotesStored_QNAME = new QName("http://entity.cards.common.scb", "notesStored");
    private final static QName _PrimaryCardAcctNo_QNAME = new QName("http://entity.cards.common.scb", "acctNo");
    private final static QName _PrimaryCardStatus_QNAME = new QName("http://entity.cards.common.scb", "status");
    private final static QName _PrimaryCardCurrency_QNAME = new QName("http://entity.cards.common.scb", "currency");
    private final static QName _SubAcctDtlTranGroup_QNAME = new QName("http://entity.cards.common.scb", "tranGroup");
    private final static QName _SubAcctDtlAcctAgreement_QNAME = new QName("http://entity.cards.common.scb", "acctAgreement");
    private final static QName _SubAcctDtlBalance_QNAME = new QName("http://entity.cards.common.scb", "balance");
    private final static QName _InstallmentPlanLoanStartDt_QNAME = new QName("http://entity.cards.common.scb", "loanStartDt");
    private final static QName _InstallmentPlanTotalAmtLoanTaken_QNAME = new QName("http://entity.cards.common.scb", "totalAmtLoanTaken");
    private final static QName _InstallmentPlanIntRateLoan_QNAME = new QName("http://entity.cards.common.scb", "intRateLoan");
    private final static QName _InstallmentPlanTenure_QNAME = new QName("http://entity.cards.common.scb", "tenure");
    private final static QName _InstallmentPlanFixedInst_QNAME = new QName("http://entity.cards.common.scb", "fixedInst");
    private final static QName _InstallmentPlanLoanOutstandAmt_QNAME = new QName("http://entity.cards.common.scb", "loanOutstandAmt");
    private final static QName _PaymentHistoryPeriod_QNAME = new QName("http://entity.cards.common.scb", "period");
    private final static QName _PaymentHistoryPurchase_QNAME = new QName("http://entity.cards.common.scb", "purchase");
    private final static QName _PaymentHistoryPayment_QNAME = new QName("http://entity.cards.common.scb", "payment");
    private final static QName _PaymentHistoryCharges_QNAME = new QName("http://entity.cards.common.scb", "charges");
    private final static QName _PaymentHistoryAmtDue_QNAME = new QName("http://entity.cards.common.scb", "amtDue");
    private final static QName _PaymentHistoryCode_QNAME = new QName("http://entity.cards.common.scb", "code");
    private final static QName _LinkedCardsCardNo_QNAME = new QName("http://entity.cards.common.scb", "cardNo");
    private final static QName _LinkedCardsEmbossedName_QNAME = new QName("http://entity.cards.common.scb", "embossedName");
    private final static QName _LinkedCardsCardType_QNAME = new QName("http://entity.cards.common.scb", "cardType");
    private final static QName _LinkedCardsCardTypeDesc_QNAME = new QName("http://entity.cards.common.scb", "cardTypeDesc");
    private final static QName _LinkedCardsCardExpDt_QNAME = new QName("http://entity.cards.common.scb", "cardExpDt");
    private final static QName _LinkedCardsCardCcy_QNAME = new QName("http://entity.cards.common.scb", "cardCcy");
    private final static QName _PrimeOverlimitPrimeOverlimitValue_QNAME = new QName("http://entity.cards.common.scb", "primeOverlimitValue");
    private final static QName _PrimeOverlimitPrimeOverlimitDate_QNAME = new QName("http://entity.cards.common.scb", "primeOverlimitDate");
    private final static QName _ManhattanOverlimitManhattanOverlimitValue_QNAME = new QName("http://entity.cards.common.scb", "manhattanOverlimitValue");
    private final static QName _ManhattanOverlimitManhattanOverlimitDate_QNAME = new QName("http://entity.cards.common.scb", "manhattanOverlimitDate");
    private final static QName _SCBOverlimitScbOverlimitValue_QNAME = new QName("http://entity.cards.common.scb", "scbOverlimitValue");
    private final static QName _SCBOverlimitScbOverlimitDate_QNAME = new QName("http://entity.cards.common.scb", "scbOverlimitDate");
    private final static QName _EmbossingDetailsNoOfCards_QNAME = new QName("http://entity.cards.common.scb", "noOfCards");
    private final static QName _EmbossingDetailsEmbossingName_QNAME = new QName("http://entity.cards.common.scb", "embossingName");
    private final static QName _EmbossingDetailsCardAction_QNAME = new QName("http://entity.cards.common.scb", "cardAction");
    private final static QName _EmbossingDetailsNoRequested_QNAME = new QName("http://entity.cards.common.scb", "noRequested");
    private final static QName _EmbossingDetailsSupportOption_QNAME = new QName("http://entity.cards.common.scb", "supportOption");
    private final static QName _EmbossingDetailsCardFeature_QNAME = new QName("http://entity.cards.common.scb", "cardFeature");
    private final static QName _EmbossingDetailsNoOfCardsIssued_QNAME = new QName("http://entity.cards.common.scb", "noOfCardsIssued");
    private final static QName _EmbossingDetailsNoOfCardsReturned_QNAME = new QName("http://entity.cards.common.scb", "noOfCardsReturned");
    private final static QName _EmbossingDetailsRqstCardType_QNAME = new QName("http://entity.cards.common.scb", "rqstCardType");
    private final static QName _EmbossingDetailsPreviousAction_QNAME = new QName("http://entity.cards.common.scb", "previousAction");
    private final static QName _EmbossingDetailsPinRecord_QNAME = new QName("http://entity.cards.common.scb", "pinRecord");
    private final static QName _TokenCardListSerialNo_QNAME = new QName("http://entity.cards.common.scb", "serialNo");
    private final static QName _TokenCardListTokenStatus_QNAME = new QName("http://entity.cards.common.scb", "tokenStatus");
    private final static QName _CardSummaryDtlOrganisationNo_QNAME = new QName("http://entity.cards.common.scb", "organisationNo");
    private final static QName _CardSummaryDtlCustNo_QNAME = new QName("http://entity.cards.common.scb", "custNo");
    private final static QName _CardSummaryDtlCustType_QNAME = new QName("http://entity.cards.common.scb", "custType");
    private final static QName _CardSummaryDtlBlockCode_QNAME = new QName("http://entity.cards.common.scb", "blockCode");
    private final static QName _EarnDetailsPrefMerchant_QNAME = new QName("http://entity.cards.common.scb", "prefMerchant");
    private final static QName _EarnDetailsCapReachDtOverall_QNAME = new QName("http://entity.cards.common.scb", "capReachDtOverall");
    private final static QName _EarnDetailsCapReachDtatPrefMerchant_QNAME = new QName("http://entity.cards.common.scb", "capReachDtatPrefMerchant");
    private final static QName _EarnDetailsPointEarnedToday_QNAME = new QName("http://entity.cards.common.scb", "pointEarnedToday");
    private final static QName _TopupHistoryMPSAcctNo_QNAME = new QName("http://entity.cards.common.scb", "MPSAcctNo");
    private final static QName _TopupHistoryProgramCode_QNAME = new QName("http://entity.cards.common.scb", "programCode");
    private final static QName _TopupHistoryProgramDesc_QNAME = new QName("http://entity.cards.common.scb", "programDesc");
    private final static QName _TopupHistoryProductCode_QNAME = new QName("http://entity.cards.common.scb", "productCode");
    private final static QName _TopupHistoryProductDesc_QNAME = new QName("http://entity.cards.common.scb", "productDesc");
    private final static QName _TopupHistorySequenceNo_QNAME = new QName("http://entity.cards.common.scb", "sequenceNo");
    private final static QName _TopupHistoryEffectiveRate_QNAME = new QName("http://entity.cards.common.scb", "effectiveRate");
    private final static QName _TopupHistoryFlatRate_QNAME = new QName("http://entity.cards.common.scb", "flatRate");
    private final static QName _TopupHistoryRemainingInstallment_QNAME = new QName("http://entity.cards.common.scb", "remainingInstallment");
    private final static QName _TopupHistoryOutstandingBal_QNAME = new QName("http://entity.cards.common.scb", "outstandingBal");
    private final static QName _PricingHistoryEffectiveIntRate_QNAME = new QName("http://entity.cards.common.scb", "effectiveIntRate");
    private final static QName _PricingHistoryFlatIntRate_QNAME = new QName("http://entity.cards.common.scb", "flatIntRate");
    private final static QName _PricingHistoryCurrentInstallmentAmt_QNAME = new QName("http://entity.cards.common.scb", "currentInstallmentAmt");
    private final static QName _PricingHistoryNewTenor_QNAME = new QName("http://entity.cards.common.scb", "newTenor");
    private final static QName _PricingHistoryEffectiveDate_QNAME = new QName("http://entity.cards.common.scb", "effectiveDate");
    private final static QName _PricingHistoryCriteria_QNAME = new QName("http://entity.cards.common.scb", "criteria");
    private final static QName _RedemptionProductOrderNo_QNAME = new QName("http://entity.cards.common.scb", "orderNo");
    private final static QName _RedemptionProductOrderDate_QNAME = new QName("http://entity.cards.common.scb", "orderDate");
    private final static QName _RedemptionProductProductName_QNAME = new QName("http://entity.cards.common.scb", "productName");
    private final static QName _RedemptionProductProductNo_QNAME = new QName("http://entity.cards.common.scb", "productNo");
    private final static QName _IDRPDtlsLeadingBank_QNAME = new QName("http://entity.cards.common.scb", "leadingBank");
    private final static QName _IDRPDtlsBankName_QNAME = new QName("http://entity.cards.common.scb", "bankName");
    private final static QName _IDRPDtlsFileDate_QNAME = new QName("http://entity.cards.common.scb", "fileDate");
    private final static QName _IDRPDtlsApplicationDate_QNAME = new QName("http://entity.cards.common.scb", "applicationDate");
    private final static QName _IDRPDtlsRemarks_QNAME = new QName("http://entity.cards.common.scb", "remarks");
    private final static QName _IDRPDtlsInterestRate_QNAME = new QName("http://entity.cards.common.scb", "interestRate");
    private final static QName _IDRPDtlsMonthlyRepaymentAmt_QNAME = new QName("http://entity.cards.common.scb", "monthlyRepaymentAmt");
    private final static QName _IDRPDtlsAgreementSignedRtndDate_QNAME = new QName("http://entity.cards.common.scb", "agreementSignedRtndDate");
    private final static QName _IDRPDtlsApprovedDate_QNAME = new QName("http://entity.cards.common.scb", "approvedDate");
    private final static QName _IDRPDtlsFirstInstallmentDate_QNAME = new QName("http://entity.cards.common.scb", "firstInstallmentDate");
    private final static QName _IDRPDtlsDestroyedConnaughtDay_QNAME = new QName("http://entity.cards.common.scb", "destroyedConnaughtDay");
    private final static QName _IDRPDtlsIDRPNumber_QNAME = new QName("http://entity.cards.common.scb", "IDRPNumber");
    private final static QName _IDRPDtlsHome_QNAME = new QName("http://entity.cards.common.scb", "home");
    private final static QName _IDRPDtlsHomeDesc_QNAME = new QName("http://entity.cards.common.scb", "homeDesc");
    private final static QName _IDRPDtlsAgreementReceived_QNAME = new QName("http://entity.cards.common.scb", "agreementReceived");
    private final static QName _IDRPDtlsAgreementReceivedDesc_QNAME = new QName("http://entity.cards.common.scb", "agreementReceivedDesc");
    private final static QName _IDRPDtlsMobile_QNAME = new QName("http://entity.cards.common.scb", "mobile");
    private final static QName _IDRPDtlsOffice_QNAME = new QName("http://entity.cards.common.scb", "office");
    private final static QName _IDRPDtlsCustomerStatus_QNAME = new QName("http://entity.cards.common.scb", "customerStatus");
    private final static QName _IDRPDtlsAddress_QNAME = new QName("http://entity.cards.common.scb", "Address");
    private final static QName _PriorityPassDetailPriorityPassHolderName_QNAME = new QName("http://entity.cards.common.scb", "priorityPassHolderName");
    private final static QName _PriorityPassDetailPriorityPassNo_QNAME = new QName("http://entity.cards.common.scb", "priorityPassNo");
    private final static QName _PriorityPassDetailExpiryDate_QNAME = new QName("http://entity.cards.common.scb", "expiryDate");
    private final static QName _PriorityPassDetailLastMaintainedDate_QNAME = new QName("http://entity.cards.common.scb", "lastMaintainedDate");
    private final static QName _PriorityPassDetailOldPriorityPassNo_QNAME = new QName("http://entity.cards.common.scb", "oldPriorityPassNo");
    private final static QName _PriorityPassDetailNoofTimesCardIssued_QNAME = new QName("http://entity.cards.common.scb", "noofTimesCardIssued");
    private final static QName _PriorityPassDetailCreditCardNo_QNAME = new QName("http://entity.cards.common.scb", "creditCardNo");
    private final static QName _PriorityPassDetailLoungeVisitOwn_QNAME = new QName("http://entity.cards.common.scb", "loungeVisitOwn");
    private final static QName _PriorityPassDetailLoungeVisitGuest_QNAME = new QName("http://entity.cards.common.scb", "loungeVisitGuest");
    private final static QName _SMSAlertsMobileNo_QNAME = new QName("http://entity.cards.common.scb", "mobileNo");
    private final static QName _SMSAlertsAlertLastUpdatedDate_QNAME = new QName("http://entity.cards.common.scb", "alertLastUpdatedDate");
    private final static QName _SMSAlertsAlertLastUpdatedTime_QNAME = new QName("http://entity.cards.common.scb", "alertLastUpdatedTime");
    private final static QName _SMSAlertsAlertFlag_QNAME = new QName("http://entity.cards.common.scb", "alertFlag");
    private final static QName _SMSAlertsAlertRangeFrom_QNAME = new QName("http://entity.cards.common.scb", "alertRangeFrom");
    private final static QName _SMSAlertsAlertRangeTo_QNAME = new QName("http://entity.cards.common.scb", "alertRangeTo");
    private final static QName _AirportParkingAccountNo_QNAME = new QName("http://entity.cards.common.scb", "accountNo");
    private final static QName _AirportParkingStartDate_QNAME = new QName("http://entity.cards.common.scb", "startDate");
    private final static QName _AirportParkingDueDate_QNAME = new QName("http://entity.cards.common.scb", "dueDate");
    private final static QName _AirportParkingCarNBR_QNAME = new QName("http://entity.cards.common.scb", "carNBR");
    private final static QName _AirportParkingShopID_QNAME = new QName("http://entity.cards.common.scb", "shopID");
    private final static QName _AirportParkingFeeAmt_QNAME = new QName("http://entity.cards.common.scb", "feeAmt");
    private final static QName _AirportParkingNoOfDays_QNAME = new QName("http://entity.cards.common.scb", "noOfDays");
    private final static QName _VIPUsageTransactionsAccessNBR_QNAME = new QName("http://entity.cards.common.scb", "accessNBR");
    private final static QName _VIPUsageTransactionsVIPLounge_QNAME = new QName("http://entity.cards.common.scb", "VIPLounge");
    private final static QName _VIPUsageTransactionsCountry_QNAME = new QName("http://entity.cards.common.scb", "country");
    private final static QName _VIPUsageTransactionsTransactionDate_QNAME = new QName("http://entity.cards.common.scb", "transactionDate");
    private final static QName _VIPUsageTransactionsTransactionAmt_QNAME = new QName("http://entity.cards.common.scb", "transactionAmt");
    private final static QName _VIPUsageTransactionsPostDate_QNAME = new QName("http://entity.cards.common.scb", "postDate");
    private final static QName _VIPUsageTransactionsNoOfCharged_QNAME = new QName("http://entity.cards.common.scb", "noOfCharged");
    private final static QName _VIPUsageTransactionsNoOfVisitors_QNAME = new QName("http://entity.cards.common.scb", "noOfVisitors");
    private final static QName _VIPUsageTransactionsReference_QNAME = new QName("http://entity.cards.common.scb", "reference");
    private final static QName _CallInTxnsBank_QNAME = new QName("http://entity.cards.common.scb", "bank");
    private final static QName _CallInTxnsBranch_QNAME = new QName("http://entity.cards.common.scb", "branch");
    private final static QName _CallInTxnsAccountNumber_QNAME = new QName("http://entity.cards.common.scb", "accountNumber");
    private final static QName _CallInTxnsAccountType_QNAME = new QName("http://entity.cards.common.scb", "accountType");
    private final static QName _PLCCardDetailsPLCCardNumer_QNAME = new QName("http://entity.cards.common.scb", "PLCCardNumer");
    private final static QName _PLCCardDetailsProductType_QNAME = new QName("http://entity.cards.common.scb", "productType");
    private final static QName _PLCCardDetailsAuthorizationCode_QNAME = new QName("http://entity.cards.common.scb", "authorizationCode");
    private final static QName _PLCCardDetailsChannel_QNAME = new QName("http://entity.cards.common.scb", "channel");
    private final static QName _PLCCardDetailsAmountApplied_QNAME = new QName("http://entity.cards.common.scb", "amountApplied");
    private final static QName _PLCCardDetailsRemittance_QNAME = new QName("http://entity.cards.common.scb", "remittance");
    private final static QName _PLCCardDetailsApplicationNo_QNAME = new QName("http://entity.cards.common.scb", "applicationNo");
    private final static QName _PLCCardDetailsTransmissionDate_QNAME = new QName("http://entity.cards.common.scb", "transmissionDate");
    private final static QName _PLCCardDetailsBatchNo_QNAME = new QName("http://entity.cards.common.scb", "batchNo");
    private final static QName _PLCCardDetailsRemittanceAmt_QNAME = new QName("http://entity.cards.common.scb", "remittanceAmt");
    private final static QName _PLCCardDetailsRemittanceDate_QNAME = new QName("http://entity.cards.common.scb", "remittanceDate");
    private final static QName _PLCCardDetailsFeeCode_QNAME = new QName("http://entity.cards.common.scb", "feeCode");
    private final static QName _PLCCardDetailsPaymentMode_QNAME = new QName("http://entity.cards.common.scb", "paymentMode");
    private final static QName _PLCCardDetailsLastBilledNo_QNAME = new QName("http://entity.cards.common.scb", "lastBilledNo");
    private final static QName _PLCCardDetailsLastBilledAmt_QNAME = new QName("http://entity.cards.common.scb", "lastBilledAmt");
    private final static QName _PLCCardDetailsLastBilledDt_QNAME = new QName("http://entity.cards.common.scb", "lastBilledDt");
    private final static QName _PLCCardDetailsIntAmt_QNAME = new QName("http://entity.cards.common.scb", "intAmt");
    private final static QName _PLCCardDetailsInstPeriod_QNAME = new QName("http://entity.cards.common.scb", "instPeriod");
    private final static QName _AirlineMembershipMembershipNumer_QNAME = new QName("http://entity.cards.common.scb", "membershipNumer");
    private final static QName _AirlineMembershipAirlineCode_QNAME = new QName("http://entity.cards.common.scb", "airlineCode");
    private final static QName _AirlineMembershipAirlineCodeDesc_QNAME = new QName("http://entity.cards.common.scb", "airlineCodeDesc");
    private final static QName _AirlineMembershipFamilyName_QNAME = new QName("http://entity.cards.common.scb", "familyName");
    private final static QName _AirlineMembershipGivenName_QNAME = new QName("http://entity.cards.common.scb", "givenName");
    private final static QName _SupplementaryCardholderDetailsCustomerNumer_QNAME = new QName("http://entity.cards.common.scb", "customerNumer");
    private final static QName _SupplementaryCardholderDetailsDateOfBirth_QNAME = new QName("http://entity.cards.common.scb", "dateOfBirth");
    private final static QName _PastTransactionsAdditionalInformation_QNAME = new QName("http://entity.cards.common.scb", "additionalInformation");
    private final static QName _PastTransactionsTransactionAmount_QNAME = new QName("http://entity.cards.common.scb", "transactionAmount");
    private final static QName _PastTransactionsCardHolderBillingAmount_QNAME = new QName("http://entity.cards.common.scb", "cardHolderBillingAmount");
    private final static QName _PastTransactionsPosMode_QNAME = new QName("http://entity.cards.common.scb", "posMode");
    private final static QName _PastTransactionsDate_QNAME = new QName("http://entity.cards.common.scb", "date");
    private final static QName _PastTransactionsRequestType_QNAME = new QName("http://entity.cards.common.scb", "requestType");
    private final static QName _PastTransactionsMerchantCode_QNAME = new QName("http://entity.cards.common.scb", "merchantCode");
    private final static QName _PastTransactionsMerchantDesc_QNAME = new QName("http://entity.cards.common.scb", "merchantDesc");
    private final static QName _PastTransactionsResponse_QNAME = new QName("http://entity.cards.common.scb", "response");
    private final static QName _PastTransactionsResponseCode_QNAME = new QName("http://entity.cards.common.scb", "responseCode");
    private final static QName _PastTransactionsBINICACode_QNAME = new QName("http://entity.cards.common.scb", "BINICACode");
    private final static QName _PastTransactionsNCCC_QNAME = new QName("http://entity.cards.common.scb", "NCCC");
    private final static QName _PastTransactionsTermType_QNAME = new QName("http://entity.cards.common.scb", "termType");
    private final static QName _PastTransactionsMCC_QNAME = new QName("http://entity.cards.common.scb", "MCC");
    private final static QName _BlockDetailBlockCodeDesc_QNAME = new QName("http://entity.cards.common.scb", "blockCodeDesc");
    private final static QName _PurgeDetailsPurgeDate_QNAME = new QName("http://entity.cards.common.scb", "purgeDate");
    private final static QName _PurgeDetailsCreditCardNumber_QNAME = new QName("http://entity.cards.common.scb", "creditCardNumber");
    private final static QName _PurgeDetailsBlockDate_QNAME = new QName("http://entity.cards.common.scb", "blockDate");
    private final static QName _PurgeDetailsOpenDate_QNAME = new QName("http://entity.cards.common.scb", "openDate");
    private final static QName _PurgeDetailsLastPaymentDate_QNAME = new QName("http://entity.cards.common.scb", "lastPaymentDate");
    private final static QName _PurgeDetailsCreditLimit_QNAME = new QName("http://entity.cards.common.scb", "creditLimit");
    private final static QName _StatementHistoryAccumulatedSTDDollars_QNAME = new QName("http://entity.cards.common.scb", "accumulatedSTDDollars");
    private final static QName _StatementHistoryAgingCode_QNAME = new QName("http://entity.cards.common.scb", "agingCode");
    private final static QName _StatementHistoryAgingCodeDesc_QNAME = new QName("http://entity.cards.common.scb", "agingCodeDesc");
    private final static QName _StatementHistoryCashAdvance_QNAME = new QName("http://entity.cards.common.scb", "cashAdvance");
    private final static QName _StatementHistoryCashInterest_QNAME = new QName("http://entity.cards.common.scb", "cashInterest");
    private final static QName _StatementHistoryCashOnly_QNAME = new QName("http://entity.cards.common.scb", "cashOnly");
    private final static QName _StatementHistoryFinanceCharges_QNAME = new QName("http://entity.cards.common.scb", "financeCharges");
    private final static QName _StatementHistoryMinPayment_QNAME = new QName("http://entity.cards.common.scb", "minPayment");
    private final static QName _StatementHistoryOtherFeeCharges_QNAME = new QName("http://entity.cards.common.scb", "otherFeeCharges");
    private final static QName _StatementHistoryRetailInterest_QNAME = new QName("http://entity.cards.common.scb", "retailInterest");
    private final static QName _StatementHistoryRetailOnly_QNAME = new QName("http://entity.cards.common.scb", "retailOnly");
    private final static QName _StatusHistoryLastModifiedDate_QNAME = new QName("http://entity.cards.common.scb", "lastModifiedDate");
    private final static QName _StatusHistoryStatusDesc_QNAME = new QName("http://entity.cards.common.scb", "statusDesc");
    private final static QName _StatusHistoryNonDeliveryReason_QNAME = new QName("http://entity.cards.common.scb", "nonDeliveryReason");
    private final static QName _StatusHistoryNonDeliveryReasonDesc_QNAME = new QName("http://entity.cards.common.scb", "nonDeliveryReasonDesc");
    private final static QName _MerchantDetailNCCCMerchantNo_QNAME = new QName("http://entity.cards.common.scb", "NCCCMerchantNo");
    private final static QName _MerchantDetailMerchantName_QNAME = new QName("http://entity.cards.common.scb", "merchantName");
    private final static QName _MerchantDetailMCCCode_QNAME = new QName("http://entity.cards.common.scb", "MCCCode");
    private final static QName _MerchantDetailSCBMerchantNo_QNAME = new QName("http://entity.cards.common.scb", "SCBMerchantNo");
    private final static QName _RedemptionAuthId_QNAME = new QName("http://entity.cards.common.scb", "authId");
    private final static QName _RedemptionReqId_QNAME = new QName("http://entity.cards.common.scb", "reqId");
    private final static QName _RedemptionReqType_QNAME = new QName("http://entity.cards.common.scb", "reqType");
    private final static QName _RedemptionIBankingUserFlag_QNAME = new QName("http://entity.cards.common.scb", "iBankingUserFlag");
    private final static QName _RedemptionRegDate_QNAME = new QName("http://entity.cards.common.scb", "regDate");
    private final static QName _RedemptionLoginDate_QNAME = new QName("http://entity.cards.common.scb", "loginDate");
    private final static QName _RedemptionResId_QNAME = new QName("http://entity.cards.common.scb", "resId");
    private final static QName _RedemptionResType_QNAME = new QName("http://entity.cards.common.scb", "resType");
    private final static QName _BalanceHistoryCycleDate_QNAME = new QName("http://entity.cards.common.scb", "cycleDate");
    private final static QName _BalanceHistoryOpeningBalance_QNAME = new QName("http://entity.cards.common.scb", "openingBalance");
    private final static QName _BalanceHistoryPointsEarnedCurrentCycle_QNAME = new QName("http://entity.cards.common.scb", "pointsEarnedCurrentCycle");
    private final static QName _BalanceHistoryPointsUsedCurrentCycle_QNAME = new QName("http://entity.cards.common.scb", "pointsUsedCurrentCycle");
    private final static QName _BalanceHistoryTotalAvailableBalancePoints_QNAME = new QName("http://entity.cards.common.scb", "totalAvailableBalancePoints");
    private final static QName _BalanceHistoryCatrPointsCurrentCycle_QNAME = new QName("http://entity.cards.common.scb", "catrPointsCurrentCycle");
    private final static QName _BalanceHistoryCashbackPointsCurrentCycle_QNAME = new QName("http://entity.cards.common.scb", "cashbackPointsCurrentCycle");
    private final static QName _BalanceHistoryAvailableRewardPoints_QNAME = new QName("http://entity.cards.common.scb", "availableRewardPoints");
    private final static QName _ACCELProgramInfoPromotionStartDate_QNAME = new QName("http://entity.cards.common.scb", "promotionStartDate");
    private final static QName _ACCELProgramInfoPromotionEndDate_QNAME = new QName("http://entity.cards.common.scb", "promotionEndDate");
    private final static QName _PanBankInfoPanBankProductCode_QNAME = new QName("http://entity.cards.common.scb", "panBankProductCode");
    private final static QName _PanBankInfoPanBankpoints_QNAME = new QName("http://entity.cards.common.scb", "panBankpoints");
    private final static QName _EarningDetailsExpiringPoints_QNAME = new QName("http://entity.cards.common.scb", "expiringPoints");
    private final static QName _EarningDetailsPointsExpDate_QNAME = new QName("http://entity.cards.common.scb", "pointsExpDate");
    private final static QName _CardDetailsPrevStmtBalance_QNAME = new QName("http://entity.cards.common.scb", "prevStmtBalance");
    private final static QName _CardDetailsCurrBalance_QNAME = new QName("http://entity.cards.common.scb", "currBalance");
    private final static QName _CardDetailsPointsEarned_QNAME = new QName("http://entity.cards.common.scb", "pointsEarned");
    private final static QName _CardDetailsPointsUsed_QNAME = new QName("http://entity.cards.common.scb", "pointsUsed");
    private final static QName _CardDetailsOfferingCode_QNAME = new QName("http://entity.cards.common.scb", "offeringCode");
    private final static QName _CardDetailsCurrentAdjustment_QNAME = new QName("http://entity.cards.common.scb", "currentAdjustment");
    private final static QName _CardDetailsCardAcct_QNAME = new QName("http://entity.cards.common.scb", "cardAcct");
    private final static QName _CardDetailsPrimaryShadowAcctNoMiRev_QNAME = new QName("http://entity.cards.common.scb", "primaryShadowAcctNoMiRev");
    private final static QName _CardDetailsCurrREBonusPointsSIGN_QNAME = new QName("http://entity.cards.common.scb", "currREBonusPointsSIGN");
    private final static QName _CardDetailsCurrREBonusPoints_QNAME = new QName("http://entity.cards.common.scb", "currREBonusPoints");
    private final static QName _CardDetailsCurrRECashDollarSIGN_QNAME = new QName("http://entity.cards.common.scb", "currRECashDollarSIGN");
    private final static QName _CardDetailsCurrRECashDollar_QNAME = new QName("http://entity.cards.common.scb", "currRECashDollar");
    private final static QName _CardDetailsCardExpYear_QNAME = new QName("http://entity.cards.common.scb", "cardExpYear");
    private final static QName _CardDetailsCardExpMonth_QNAME = new QName("http://entity.cards.common.scb", "cardExpMonth");
    private final static QName _CardDetailsShadowAcctStatus_QNAME = new QName("http://entity.cards.common.scb", "shadowAcctStatus");
    private final static QName _CardDetailsOfferingKey_QNAME = new QName("http://entity.cards.common.scb", "offeringKey");
    private final static QName _CardDetailsSourceProdID_QNAME = new QName("http://entity.cards.common.scb", "sourceProdID");
    private final static QName _CardDetailsCashBackFlag_QNAME = new QName("http://entity.cards.common.scb", "cashBackFlag");
    private final static QName _CardDetailsPanBankInd_QNAME = new QName("http://entity.cards.common.scb", "panBankInd");
    private final static QName _CardDetailsRewardsPrevBalSign_QNAME = new QName("http://entity.cards.common.scb", "rewardsPrevBalSign");
    private final static QName _CardDetailsRewardsPrevBal_QNAME = new QName("http://entity.cards.common.scb", "rewardsPrevBal");
    private final static QName _CardDetailsTotalEarnedRewardsSign_QNAME = new QName("http://entity.cards.common.scb", "totalEarnedRewardsSign");
    private final static QName _CardDetailsTotalEarnedRewards_QNAME = new QName("http://entity.cards.common.scb", "totalEarnedRewards");
    private final static QName _CardDetailsPointsRedeemedTransferredExpSign_QNAME = new QName("http://entity.cards.common.scb", "pointsRedeemedTransferredExpSign");
    private final static QName _CardDetailsPointsRedeemedTransferredExp_QNAME = new QName("http://entity.cards.common.scb", "pointsRedeemedTransferredExp");
    private final static QName _CardDetailsTotalPointsBalSign_QNAME = new QName("http://entity.cards.common.scb", "totalPointsBalSign");
    private final static QName _CardDetailsTotalPointsBal_QNAME = new QName("http://entity.cards.common.scb", "totalPointsBal");
    private final static QName _CardDetailsLastStmtDate_QNAME = new QName("http://entity.cards.common.scb", "lastStmtDate");
    private final static QName _CardDetailsCcyCode_QNAME = new QName("http://entity.cards.common.scb", "ccyCode");
    private final static QName _CashOneDetailsInsuranceFee_QNAME = new QName("http://entity.cards.common.scb", "insuranceFee");
    private final static QName _CashOneDetailsMinInsuranceFee_QNAME = new QName("http://entity.cards.common.scb", "minInsuranceFee");
    private final static QName _CashOneDetailsMaxInsuranceFee_QNAME = new QName("http://entity.cards.common.scb", "maxInsuranceFee");
    private final static QName _CashOneDetailsEarlyRepayHandCharge_QNAME = new QName("http://entity.cards.common.scb", "earlyRepayHandCharge");
    private final static QName _CashOneDetailsLoanAmt_QNAME = new QName("http://entity.cards.common.scb", "loanAmt");
    private final static QName _CashOneDetailsDisbursementDate_QNAME = new QName("http://entity.cards.common.scb", "disbursementDate");
    private final static QName _CashOneDetailsInstallmentAmt_QNAME = new QName("http://entity.cards.common.scb", "installmentAmt");
    private final static QName _CashOneDetailsBilledPrincipalAmt_QNAME = new QName("http://entity.cards.common.scb", "billedPrincipalAmt");
    private final static QName _CashOneDetailsBilledIntAmt_QNAME = new QName("http://entity.cards.common.scb", "billedIntAmt");
    private final static QName _CashOneDetailsBilledTotalAmt_QNAME = new QName("http://entity.cards.common.scb", "billedTotalAmt");
    private final static QName _CashOneDetailsRemainingPrincipal_QNAME = new QName("http://entity.cards.common.scb", "remainingPrincipal");
    private final static QName _CashOneDetailsRemainingIntBalance_QNAME = new QName("http://entity.cards.common.scb", "remainingIntBalance");
    private final static QName _CashOneDetailsRemainingTotalBalance_QNAME = new QName("http://entity.cards.common.scb", "remainingTotalBalance");
    private final static QName _CashOneDetailsPaymentModeDesc_QNAME = new QName("http://entity.cards.common.scb", "paymentModeDesc");
    private final static QName _CashOneDetailsIntCalculationMethod_QNAME = new QName("http://entity.cards.common.scb", "intCalculationMethod");
    private final static QName _CashOneDetailsInstallmentNo_QNAME = new QName("http://entity.cards.common.scb", "installmentNo");
    private final static QName _CashOneDetailsBilledInstallment_QNAME = new QName("http://entity.cards.common.scb", "billedInstallment");
    private final static QName _CashOneDetailsNextBillDate_QNAME = new QName("http://entity.cards.common.scb", "nextBillDate");
    private final static QName _CashOneDetailsRedemptionAmount_QNAME = new QName("http://entity.cards.common.scb", "redemptionAmount");
    private final static QName _SupplimentCardEmbossName_QNAME = new QName("http://entity.cards.common.scb", "embossName");
    private final static QName _SupplimentCardBlock_QNAME = new QName("http://entity.cards.common.scb", "block");
    private final static QName _SupplimentCardRelType_QNAME = new QName("http://entity.cards.common.scb", "relType");
    private final static QName _SupplimentCardCardHolderName_QNAME = new QName("http://entity.cards.common.scb", "cardHolderName");
    private final static QName _SupplimentCardNric_QNAME = new QName("http://entity.cards.common.scb", "nric");
    private final static QName _SupplimentCardAction_QNAME = new QName("http://entity.cards.common.scb", "action");
    private final static QName _SupplimentCardActionDesc_QNAME = new QName("http://entity.cards.common.scb", "actionDesc");
    private final static QName _SupplimentCardSequence_QNAME = new QName("http://entity.cards.common.scb", "sequence");
    private final static QName _SupplimentCardCardsRequested_QNAME = new QName("http://entity.cards.common.scb", "cardsRequested");
    private final static QName _SupplimentCardSupplementaryCards_QNAME = new QName("http://entity.cards.common.scb", "supplementaryCards");
    private final static QName _SupplimentCardSupplementaryCardsDesc_QNAME = new QName("http://entity.cards.common.scb", "supplementaryCardsDesc");
    private final static QName _SupplimentCardCardsIssued_QNAME = new QName("http://entity.cards.common.scb", "cardsIssued");
    private final static QName _SupplimentCardCardsReturned_QNAME = new QName("http://entity.cards.common.scb", "cardsReturned");
    private final static QName _SupplimentCardCardFeatures_QNAME = new QName("http://entity.cards.common.scb", "cardFeatures");
    private final static QName _SupplimentCardPrevAction_QNAME = new QName("http://entity.cards.common.scb", "prevAction");
    private final static QName _SupplimentCardPrevActionDesc_QNAME = new QName("http://entity.cards.common.scb", "prevActionDesc");
    private final static QName _SupplimentCardRelshipType_QNAME = new QName("http://entity.cards.common.scb", "relshipType");
    private final static QName _SupplimentCardCardHolderIDNo_QNAME = new QName("http://entity.cards.common.scb", "cardHolderIDNo");
    private final static QName _SupplimentCardChipType_QNAME = new QName("http://entity.cards.common.scb", "chipType");
    private final static QName _SupplimentCardContactlessIndicator_QNAME = new QName("http://entity.cards.common.scb", "contactlessIndicator");
    private final static QName _CCAddressMailingTitle1_QNAME = new QName("http://entity.cards.common.scb", "mailingTitle1");
    private final static QName _CCAddressMailingTitle2_QNAME = new QName("http://entity.cards.common.scb", "mailingTitle2");
    private final static QName _CCAddressAddressLine1_QNAME = new QName("http://entity.cards.common.scb", "addressLine1");
    private final static QName _CCAddressAddressLine2_QNAME = new QName("http://entity.cards.common.scb", "addressLine2");
    private final static QName _CCAddressAddressLine3_QNAME = new QName("http://entity.cards.common.scb", "addressLine3");
    private final static QName _CCAddressAddressLine4_QNAME = new QName("http://entity.cards.common.scb", "addressLine4");
    private final static QName _CCAddressAddressLine5_QNAME = new QName("http://entity.cards.common.scb", "addressLine5");
    private final static QName _CCAddressCity_QNAME = new QName("http://entity.cards.common.scb", "city");
    private final static QName _CCAddressCityDesc_QNAME = new QName("http://entity.cards.common.scb", "cityDesc");
    private final static QName _CCAddressState_QNAME = new QName("http://entity.cards.common.scb", "state");
    private final static QName _CCAddressPostalCode_QNAME = new QName("http://entity.cards.common.scb", "postalCode");
    private final static QName _CCAddressNonMailAddress_QNAME = new QName("http://entity.cards.common.scb", "nonMailAddress");
    private final static QName _CCAddressLastMaintainDate_QNAME = new QName("http://entity.cards.common.scb", "lastMaintainDate");
    private final static QName _CCAddressAttentionParty1_QNAME = new QName("http://entity.cards.common.scb", "attentionParty1");
    private final static QName _CCAddressAttentionParty2_QNAME = new QName("http://entity.cards.common.scb", "attentionParty2");
    private final static QName _CCAddressCountryDesc_QNAME = new QName("http://entity.cards.common.scb", "countryDesc");
    private final static QName _CCAddressHomePhone_QNAME = new QName("http://entity.cards.common.scb", "homePhone");
    private final static QName _CCAddressWorkPhone_QNAME = new QName("http://entity.cards.common.scb", "workPhone");
    private final static QName _CCAddressMobilePhone_QNAME = new QName("http://entity.cards.common.scb", "mobilePhone");
    private final static QName _CCAddressEmail_QNAME = new QName("http://entity.cards.common.scb", "email");
    private final static QName _CCAddressMailingTitle3_QNAME = new QName("http://entity.cards.common.scb", "mailingTitle3");
    private final static QName _CCAddressMailingTitle_QNAME = new QName("http://entity.cards.common.scb", "mailingTitle");
    private final static QName _CCAddressHousing_QNAME = new QName("http://entity.cards.common.scb", "housing");
    private final static QName _CCAddressHousingExt_QNAME = new QName("http://entity.cards.common.scb", "housingExt");
    private final static QName _MemoMemoDate_QNAME = new QName("http://entity.cards.common.scb", "memoDate");
    private final static QName _MemoMemoTime_QNAME = new QName("http://entity.cards.common.scb", "memoTime");
    private final static QName _MemoMemoCategory_QNAME = new QName("http://entity.cards.common.scb", "memoCategory");
    private final static QName _MemoCardholderName_QNAME = new QName("http://entity.cards.common.scb", "cardholderName");
    private final static QName _MemoAgentName_QNAME = new QName("http://entity.cards.common.scb", "agentName");
    private final static QName _MemoAgentID_QNAME = new QName("http://entity.cards.common.scb", "agentID");
    private final static QName _MemoCreatedUserID_QNAME = new QName("http://entity.cards.common.scb", "createdUserID");
    private final static QName _MemoUpdatedUserID_QNAME = new QName("http://entity.cards.common.scb", "updatedUserID");
    private final static QName _MemoMemoContent_QNAME = new QName("http://entity.cards.common.scb", "memoContent");
    private final static QName _MemoMemoExpiryDate_QNAME = new QName("http://entity.cards.common.scb", "memoExpiryDate");
    private final static QName _MemoActionDate_QNAME = new QName("http://entity.cards.common.scb", "actionDate");
    private final static QName _MemoActionCompleteIndicator_QNAME = new QName("http://entity.cards.common.scb", "actionCompleteIndicator");
    private final static QName _MemoDeleteFlag_QNAME = new QName("http://entity.cards.common.scb", "deleteFlag");
    private final static QName _MemoRecordType_QNAME = new QName("http://entity.cards.common.scb", "recordType");
    private final static QName _MemoOwner_QNAME = new QName("http://entity.cards.common.scb", "owner");
    private final static QName _RewardBeginingBalance_QNAME = new QName("http://entity.cards.common.scb", "beginingBalance");
    private final static QName _RewardEarned_QNAME = new QName("http://entity.cards.common.scb", "earned");
    private final static QName _RewardRedeemed_QNAME = new QName("http://entity.cards.common.scb", "redeemed");
    private final static QName _RewardEndingBalance_QNAME = new QName("http://entity.cards.common.scb", "endingBalance");
    private final static QName _RewardAvailableBalance_QNAME = new QName("http://entity.cards.common.scb", "availableBalance");
    private final static QName _RewardPrevStmtBal_QNAME = new QName("http://entity.cards.common.scb", "prevStmtBal");
    private final static QName _RewardSummaryAvailable_QNAME = new QName("http://entity.cards.common.scb", "available");
    private final static QName _RewardSummaryEarnedInCurrentCycle_QNAME = new QName("http://entity.cards.common.scb", "earnedInCurrentCycle");
    private final static QName _RewardSummaryRedeemedInCurrentCycle_QNAME = new QName("http://entity.cards.common.scb", "redeemedInCurrentCycle");
    private final static QName _RewardSummaryPreviousStmtPoints_QNAME = new QName("http://entity.cards.common.scb", "previousStmtPoints");
    private final static QName _RewardSummaryPointsEarnedBilled_QNAME = new QName("http://entity.cards.common.scb", "pointsEarnedBilled");
    private final static QName _RewardSummaryPointsRedeemedBilled_QNAME = new QName("http://entity.cards.common.scb", "pointsRedeemedBilled");
    private final static QName _PotDesc_QNAME = new QName("http://entity.cards.common.scb", "desc");
    private final static QName _PotProduct_QNAME = new QName("http://entity.cards.common.scb", "product");
    private final static QName _PotGroup_QNAME = new QName("http://entity.cards.common.scb", "group");
    private final static QName _CardProfileCode1To6Month_QNAME = new QName("http://entity.cards.common.scb", "code1To6Month");
    private final static QName _CardProfileCode7To12Month_QNAME = new QName("http://entity.cards.common.scb", "code7To12Month");
    private final static QName _CardProfileCode13To18Month_QNAME = new QName("http://entity.cards.common.scb", "code13To18Month");
    private final static QName _CardProfileCode19To24Month_QNAME = new QName("http://entity.cards.common.scb", "code19To24Month");
    private final static QName _OAAATransactionRequestTime_QNAME = new QName("http://entity.cards.common.scb", "requestTime");
    private final static QName _OAAATransactionAmount_QNAME = new QName("http://entity.cards.common.scb", "amount");
    private final static QName _OAAATransactionCurrencyCode_QNAME = new QName("http://entity.cards.common.scb", "currencyCode");
    private final static QName _OAAATransactionBillingAmount_QNAME = new QName("http://entity.cards.common.scb", "billingAmount");
    private final static QName _OAAATransactionBillingCurrencyCode_QNAME = new QName("http://entity.cards.common.scb", "billingCurrencyCode");
    private final static QName _OAAATransactionBINCode_QNAME = new QName("http://entity.cards.common.scb", "BINCode");
    private final static QName _OAAATransactionCountryCode_QNAME = new QName("http://entity.cards.common.scb", "countryCode");
    private final static QName _OAAATransactionReverseCode_QNAME = new QName("http://entity.cards.common.scb", "reverseCode");
    private final static QName _OAAATransactionPOSMode_QNAME = new QName("http://entity.cards.common.scb", "POSMode");
    private final static QName _OAAATransactionAdditionalInfo_QNAME = new QName("http://entity.cards.common.scb", "additionalInfo");
    private final static QName _AuthTransactionDays_QNAME = new QName("http://entity.cards.common.scb", "days");
    private final static QName _AuthTransactionTransactionDesc_QNAME = new QName("http://entity.cards.common.scb", "transactionDesc");
    private final static QName _AuthTransactionReferenceNo_QNAME = new QName("http://entity.cards.common.scb", "referenceNo");
    private final static QName _AuthTransactionTransactionCode_QNAME = new QName("http://entity.cards.common.scb", "transactionCode");
    private final static QName _AuthTransactionAuthorizationAmt_QNAME = new QName("http://entity.cards.common.scb", "authorizationAmt");
    private final static QName _AuthTransactionSourceCode_QNAME = new QName("http://entity.cards.common.scb", "sourceCode");
    private final static QName _AuthTransactionTranSrcCcy_QNAME = new QName("http://entity.cards.common.scb", "tranSrcCcy");
    private final static QName _AuthTransactionAmtBillCcy_QNAME = new QName("http://entity.cards.common.scb", "amtBillCcy");
    private final static QName _AuthTransactionProcessingDtTime_QNAME = new QName("http://entity.cards.common.scb", "processingDtTime");
    private final static QName _TransactionPostingDate_QNAME = new QName("http://entity.cards.common.scb", "postingDate");
    private final static QName _TransactionFCYAmount_QNAME = new QName("http://entity.cards.common.scb", "FCYAmount");
    private final static QName _TransactionArnNumber_QNAME = new QName("http://entity.cards.common.scb", "arnNumber");
    private final static QName _TransactionMerchantID_QNAME = new QName("http://entity.cards.common.scb", "merchantID");
    private final static QName _TransactionRewardPoints_QNAME = new QName("http://entity.cards.common.scb", "rewardPoints");
    private final static QName _TransactionDtotRewardPoints_QNAME = new QName("http://entity.cards.common.scb", "dtotRewardPoints");
    private final static QName _TransactionMembershipNo_QNAME = new QName("http://entity.cards.common.scb", "membershipNo");
    private final static QName _TransactionChargeFees_QNAME = new QName("http://entity.cards.common.scb", "chargeFees");
    private final static QName _TransactionReversalFlag_QNAME = new QName("http://entity.cards.common.scb", "reversalFlag");
    private final static QName _TransactionRate_QNAME = new QName("http://entity.cards.common.scb", "Rate");
    private final static QName _TransactionFees_QNAME = new QName("http://entity.cards.common.scb", "Fees");
    private final static QName _TransactionTerm_QNAME = new QName("http://entity.cards.common.scb", "Term");
    private final static QName _TransactionCount_QNAME = new QName("http://entity.cards.common.scb", "Count");
    private final static QName _TransactionRedemptionOption_QNAME = new QName("http://entity.cards.common.scb", "redemptionOption");
    private final static QName _TransactionCashAmount_QNAME = new QName("http://entity.cards.common.scb", "cashAmount");
    private final static QName _TransactionCashBackAmount_QNAME = new QName("http://entity.cards.common.scb", "cashBackAmount");
    private final static QName _TransactionPromotionPeriodStartDate_QNAME = new QName("http://entity.cards.common.scb", "promotionPeriodStartDate");
    private final static QName _TransactionPromotionPeriodEndDate_QNAME = new QName("http://entity.cards.common.scb", "promotionPeriodEndDate");
    private final static QName _TransactionTotalAmtSpent_QNAME = new QName("http://entity.cards.common.scb", "totalAmtSpent");
    private final static QName _TransactionRequestAmt_QNAME = new QName("http://entity.cards.common.scb", "requestAmt");
    private final static QName _TransactionTotalNo_QNAME = new QName("http://entity.cards.common.scb", "totalNo");
    private final static QName _TransactionRequestNo_QNAME = new QName("http://entity.cards.common.scb", "requestNo");
    private final static QName _TransactionRewardRate_QNAME = new QName("http://entity.cards.common.scb", "rewardRate");
    private final static QName _TransactionInterestTransFlag_QNAME = new QName("http://entity.cards.common.scb", "interestTransFlag");
    private final static QName _TransactionCustomerNo_QNAME = new QName("http://entity.cards.common.scb", "customerNo");
    private final static QName _TransactionCategoryCode_QNAME = new QName("http://entity.cards.common.scb", "categoryCode");
    private final static QName _TransactionPanbankProductCode_QNAME = new QName("http://entity.cards.common.scb", "panbankProductCode");
    private final static QName _TransactionMultiplierOption_QNAME = new QName("http://entity.cards.common.scb", "multiplierOption");
    private final static QName _TransactionMultiplierRate_QNAME = new QName("http://entity.cards.common.scb", "multiplierRate");
    private final static QName _TransactionForAmt_QNAME = new QName("http://entity.cards.common.scb", "forAmt");
    private final static QName _TransactionTransactionType_QNAME = new QName("http://entity.cards.common.scb", "transactionType");
    private final static QName _TransactionTransactionCount_QNAME = new QName("http://entity.cards.common.scb", "transactionCount");
    private final static QName _TransactionTransactionCity_QNAME = new QName("http://entity.cards.common.scb", "transactionCity");
    private final static QName _TransactionTransactionCountry_QNAME = new QName("http://entity.cards.common.scb", "transactionCountry");
    private final static QName _TransactionTransactionTime_QNAME = new QName("http://entity.cards.common.scb", "transactionTime");
    private final static QName _TransactionTransactionResponseCode_QNAME = new QName("http://entity.cards.common.scb", "transactionResponseCode");
    private final static QName _TransactionCurrExpiryDate_QNAME = new QName("http://entity.cards.common.scb", "currExpiryDate");
    private final static QName _TransactionTransactionSequence_QNAME = new QName("http://entity.cards.common.scb", "transactionSequence");
    private final static QName _TransactionTransactionID_QNAME = new QName("http://entity.cards.common.scb", "transactionID");
    private final static QName _TransactionDebitCardSpends_QNAME = new QName("http://entity.cards.common.scb", "debitCardSpends");
    private final static QName _TransactionCreditCardSpends_QNAME = new QName("http://entity.cards.common.scb", "creditCardSpends");
    private final static QName _TransactionTotalSpends_QNAME = new QName("http://entity.cards.common.scb", "totalSpends");
    private final static QName _TransactionAvgDailyBalance_QNAME = new QName("http://entity.cards.common.scb", "avgDailyBalance");
    private final static QName _TransactionMaxAvgDailyBalance_QNAME = new QName("http://entity.cards.common.scb", "MaxAvgDailyBalance");
    private final static QName _TransactionBonusIntRate_QNAME = new QName("http://entity.cards.common.scb", "bonusIntRate");
    private final static QName _TransactionMonthlyEffIntRate_QNAME = new QName("http://entity.cards.common.scb", "monthlyEffIntRate");
    private final static QName _TransactionBonusIntAmt_QNAME = new QName("http://entity.cards.common.scb", "bonusIntAmt");
    private final static QName _TransactionCalendarDays_QNAME = new QName("http://entity.cards.common.scb", "calendarDays");
    private final static QName _TransactionCalendarYear_QNAME = new QName("http://entity.cards.common.scb", "calendarYear");
    private final static QName _TransactionTotalInterestRate_QNAME = new QName("http://entity.cards.common.scb", "totalInterestRate");
    private final static QName _TransactionMerchantCategory_QNAME = new QName("http://entity.cards.common.scb", "merchantCategory");
    private final static QName _TransactionMerchantState_QNAME = new QName("http://entity.cards.common.scb", "merchantState");
    private final static QName _TransactionInternationalFeeInd_QNAME = new QName("http://entity.cards.common.scb", "internationalFeeInd");
    private final static QName _TransactionMerchantCategoryCode_QNAME = new QName("http://entity.cards.common.scb", "merchantCategoryCode");
    private final static QName _TransactionReimbAttribute_QNAME = new QName("http://entity.cards.common.scb", "reimbAttribute");
    private final static QName _TransactionOriginalCcyDecimalpt_QNAME = new QName("http://entity.cards.common.scb", "originalCcyDecimalpt");
    private final static QName _TransactionOnUSCcyConv_QNAME = new QName("http://entity.cards.common.scb", "onUSCcyConv");
    private final static QName _TransactionAlphanumericCcyCode_QNAME = new QName("http://entity.cards.common.scb", "alphanumericCcyCode");
    private final static QName _TransactionPosEntryMode_QNAME = new QName("http://entity.cards.common.scb", "posEntryMode");
    private final static QName _TransactionTransSourceCcy_QNAME = new QName("http://entity.cards.common.scb", "transSourceCcy");
    private final static QName _TransactionTransSrcCcy_QNAME = new QName("http://entity.cards.common.scb", "transSrcCcy");
    private final static QName _TransactionDebitAmt_QNAME = new QName("http://entity.cards.common.scb", "debitAmt");
    private final static QName _TransactionCreditAmt_QNAME = new QName("http://entity.cards.common.scb", "creditAmt");
    private final static QName _TransactionTransactionMonth_QNAME = new QName("http://entity.cards.common.scb", "transactionMonth");
    private final static QName _TransactionTransactionNo_QNAME = new QName("http://entity.cards.common.scb", "transactionNo");
    private final static QName _MerchandiseDetailProgramName_QNAME = new QName("http://entity.cards.common.scb", "programName");
    private final static QName _MerchandiseDetailNoOfInstalments_QNAME = new QName("http://entity.cards.common.scb", "noOfInstalments");
    private final static QName _MerchandiseDetailBilledInstalments_QNAME = new QName("http://entity.cards.common.scb", "billedInstalments");
    private final static QName _MerchandiseDetailOrderAmt_QNAME = new QName("http://entity.cards.common.scb", "orderAmt");
    private final static QName _MerchandiseDetailProductInst_QNAME = new QName("http://entity.cards.common.scb", "productInst");
    private final static QName _MerchandiseDetailBilledAmount_QNAME = new QName("http://entity.cards.common.scb", "billedAmount");
    private final static QName _MerchandiseDetailRemainBalance_QNAME = new QName("http://entity.cards.common.scb", "remainBalance");
    private final static QName _MerchandiseDetailPrincipleAmount_QNAME = new QName("http://entity.cards.common.scb", "principleAmount");
    private final static QName _MerchandiseDetailInterestSaved_QNAME = new QName("http://entity.cards.common.scb", "interestSaved");
    private final static QName _MerchandiseDetailFunctionCode_QNAME = new QName("http://entity.cards.common.scb", "functionCode");
    private final static QName _MerchandiseDetailLinkedAcctNo_QNAME = new QName("http://entity.cards.common.scb", "linkedAcctNo");
    private final static QName _MerchandiseDetailLastBillNo_QNAME = new QName("http://entity.cards.common.scb", "lastBillNo");
    private final static QName _MerchandiseDetailLastBillDate_QNAME = new QName("http://entity.cards.common.scb", "lastBillDate");
    private final static QName _MerchandiseDetailLastBillAmt_QNAME = new QName("http://entity.cards.common.scb", "lastBillAmt");
    private final static QName _CreditHistoryMonthNo_QNAME = new QName("http://entity.cards.common.scb", "monthNo");
    private final static QName _CreditHistoryTotalFinanceCharges_QNAME = new QName("http://entity.cards.common.scb", "totalFinanceCharges");
    private final static QName _RPCBlockRpcCode_QNAME = new QName("http://entity.cards.common.scb", "rpcCode");
    private final static QName _RPCBlockRpccategory_QNAME = new QName("http://entity.cards.common.scb", "rpccategory");
    private final static QName _RPCBlockRpcOutstandBal_QNAME = new QName("http://entity.cards.common.scb", "rpcOutstandBal");
    private final static QName _BalanceBucketsHistoryCashIntUnpaid_QNAME = new QName("http://entity.cards.common.scb", "cashIntUnpaid");
    private final static QName _BalanceBucketsHistoryCashServiceChargeUnpaid_QNAME = new QName("http://entity.cards.common.scb", "cashServiceChargeUnpaid");
    private final static QName _BalanceBucketsHistoryCashBal_QNAME = new QName("http://entity.cards.common.scb", "cashBal");
    private final static QName _BalanceBucketsHistoryRetailIntUnpaid_QNAME = new QName("http://entity.cards.common.scb", "retailIntUnpaid");
    private final static QName _BalanceBucketsHistoryRetailServiceChargeUnpaid_QNAME = new QName("http://entity.cards.common.scb", "retailServiceChargeUnpaid");
    private final static QName _BalanceBucketsHistoryRetailFee_QNAME = new QName("http://entity.cards.common.scb", "retailFee");
    private final static QName _BalanceBucketsHistoryRetailInsUnpaid_QNAME = new QName("http://entity.cards.common.scb", "retailInsUnpaid");
    private final static QName _BalanceBucketsHistoryRetailMemshipUnpaid_QNAME = new QName("http://entity.cards.common.scb", "retailMemshipUnpaid");
    private final static QName _BalanceBucketsHistoryRetailBal_QNAME = new QName("http://entity.cards.common.scb", "retailBal");
    private final static QName _BalanceBucketsHistoryCashInstallUnpaid_QNAME = new QName("http://entity.cards.common.scb", "cashInstallUnpaid");
    private final static QName _BalanceBucketsHistoryRetailInstallUnpaid_QNAME = new QName("http://entity.cards.common.scb", "retailInstallUnpaid");
    private final static QName _ProductDetailsProdCode_QNAME = new QName("http://entity.cards.common.scb", "prodCode");
    private final static QName _ProductDetailsProdSign_QNAME = new QName("http://entity.cards.common.scb", "prodSign");
    private final static QName _ProductDetailsProdPoints_QNAME = new QName("http://entity.cards.common.scb", "prodPoints");
    private final static QName _TransactionDetailsPrimaryShadowAcctNo_QNAME = new QName("http://entity.cards.common.scb", "primaryShadowAcctNo");
    private final static QName _TransactionDetailsPanbankInd_QNAME = new QName("http://entity.cards.common.scb", "panbankInd");
    private final static QName _TransactionDetailsTranDate_QNAME = new QName("http://entity.cards.common.scb", "tranDate");
    private final static QName _TransactionDetailsTranID_QNAME = new QName("http://entity.cards.common.scb", "tranID");
    private final static QName _TransactionDetailsTranDesc_QNAME = new QName("http://entity.cards.common.scb", "tranDesc");
    private final static QName _TransactionDetailsMerchantNo_QNAME = new QName("http://entity.cards.common.scb", "merchantNo");
    private final static QName _TransactionDetailsTranAmtSign_QNAME = new QName("http://entity.cards.common.scb", "tranAmtSign");
    private final static QName _TransactionDetailsTranAmt_QNAME = new QName("http://entity.cards.common.scb", "tranAmt");
    private final static QName _TransactionDetailsRewardPointsSign_QNAME = new QName("http://entity.cards.common.scb", "rewardPointsSign");
    private final static QName _TransactionDetailsDebitCreditInd_QNAME = new QName("http://entity.cards.common.scb", "debitCreditInd");
    private final static QName _TransactionDetailsDailyCyclePointsTotalsSign_QNAME = new QName("http://entity.cards.common.scb", "dailyCyclePointsTotalsSign");
    private final static QName _TransactionDetailsDailyCyclePointsTotals_QNAME = new QName("http://entity.cards.common.scb", "dailyCyclePointsTotals");
    private final static QName _TransactionDetailsAuthCode_QNAME = new QName("http://entity.cards.common.scb", "authCode");
    private final static QName _ExpiryPointDetailsPointsBalSign_QNAME = new QName("http://entity.cards.common.scb", "pointsBalSign");
    private final static QName _ExpiryPointDetailsPointsBal_QNAME = new QName("http://entity.cards.common.scb", "pointsBal");
    private final static QName _ExpiryPointDetailsExpDate_QNAME = new QName("http://entity.cards.common.scb", "expDate");
    private final static QName _ExpiryPointDetailsCashDollarBalSign_QNAME = new QName("http://entity.cards.common.scb", "cashDollarBalSign");
    private final static QName _ExpiryPointDetailsCashDollarBal_QNAME = new QName("http://entity.cards.common.scb", "cashDollarBal");
    private final static QName _ExpiryPointDetailsExpCashDollarDate_QNAME = new QName("http://entity.cards.common.scb", "expCashDollarDate");
    private final static QName _TierCashLimit_QNAME = new QName("http://entity.cards.common.scb", "cashLimit");
    private final static QName _TierCashInt_QNAME = new QName("http://entity.cards.common.scb", "cashInt");
    private final static QName _TierRetailLimit_QNAME = new QName("http://entity.cards.common.scb", "retailLimit");
    private final static QName _TierRetailInt_QNAME = new QName("http://entity.cards.common.scb", "retailInt");
    private final static QName _GiftSeqNo_QNAME = new QName("http://entity.cards.common.scb", "seqNo");
    private final static QName _GiftGift_QNAME = new QName("http://entity.cards.common.scb", "gift");
    private final static QName _GiftGiftdesc_QNAME = new QName("http://entity.cards.common.scb", "giftdesc");
    private final static QName _CustDetCustName_QNAME = new QName("http://entity.cards.common.scb", "custName");
    private final static QName _CustDetCompName_QNAME = new QName("http://entity.cards.common.scb", "compName");
    private final static QName _CustDetOfficePhNo_QNAME = new QName("http://entity.cards.common.scb", "officePhNo");
    private final static QName _DrawDownDrawDownAmt_QNAME = new QName("http://entity.cards.common.scb", "drawDownAmt");
    private final static QName _DrawDownDrawDownAcctNo_QNAME = new QName("http://entity.cards.common.scb", "drawDownAcctNo");
    private final static QName _TaxDetStartDt_QNAME = new QName("http://entity.cards.common.scb", "startDt");
    private final static QName _TaxDetProgram_QNAME = new QName("http://entity.cards.common.scb", "program");
    private final static QName _TaxDetProd_QNAME = new QName("http://entity.cards.common.scb", "prod");
    private final static QName _TaxDetInstAmt_QNAME = new QName("http://entity.cards.common.scb", "instAmt");
    private final static QName _TaxDetAppFee_QNAME = new QName("http://entity.cards.common.scb", "appFee");
    private final static QName _TaxDetHandlingFee_QNAME = new QName("http://entity.cards.common.scb", "handlingFee");
    private final static QName _TaxDetCompanyName_QNAME = new QName("http://entity.cards.common.scb", "companyName");
    private final static QName _TaxDetOfficePhoneNo_QNAME = new QName("http://entity.cards.common.scb", "officePhoneNo");
    private final static QName _ThirteenMonthCashAmt_QNAME = new QName("http://entity.cards.common.scb", "cashAmt");
    private final static QName _ThirteenMonthRetailAmt_QNAME = new QName("http://entity.cards.common.scb", "retailAmt");
    private final static QName _ThirteenMonthPymtAmt_QNAME = new QName("http://entity.cards.common.scb", "pymtAmt");
    private final static QName _ThirteenMonthBal_QNAME = new QName("http://entity.cards.common.scb", "bal");
    private final static QName _ThirteenMonthMinPymt_QNAME = new QName("http://entity.cards.common.scb", "minPymt");
    private final static QName _ThirteenMonthProvInt_QNAME = new QName("http://entity.cards.common.scb", "provInt");
    private final static QName _ThirteenMonthNegativeAnticipatedInt_QNAME = new QName("http://entity.cards.common.scb", "negativeAnticipatedInt");
    private final static QName _ThirteenMonthRevolverFlag_QNAME = new QName("http://entity.cards.common.scb", "revolverFlag");
    private final static QName _ThirteenMonthTotalAmt_QNAME = new QName("http://entity.cards.common.scb", "totalAmt");
    private final static QName _ThirteenMonthBegBal_QNAME = new QName("http://entity.cards.common.scb", "begBal");
    private final static QName _CampaignDetGatingId_QNAME = new QName("http://entity.cards.common.scb", "gatingId");
    private final static QName _CampaignDetCampaign_QNAME = new QName("http://entity.cards.common.scb", "campaign");
    private final static QName _CampaignDetEndDt_QNAME = new QName("http://entity.cards.common.scb", "endDt");
    private final static QName _CampaignDetBenefictEndDt_QNAME = new QName("http://entity.cards.common.scb", "benefictEndDt");
    private final static QName _CampaignDetLastChangeDt_QNAME = new QName("http://entity.cards.common.scb", "lastChangeDt");
    private final static QName _CampaignDetPriority_QNAME = new QName("http://entity.cards.common.scb", "priority");
    private final static QName _CampaignDetTranNo_QNAME = new QName("http://entity.cards.common.scb", "tranNo");
    private final static QName _CampaignDetAmt_QNAME = new QName("http://entity.cards.common.scb", "amt");
    private final static QName _CampaignDetIntAmtBilled_QNAME = new QName("http://entity.cards.common.scb", "intAmtBilled");
    private final static QName _CampaignDetOutstandAmt_QNAME = new QName("http://entity.cards.common.scb", "outstandAmt");
    private final static QName _CampaignDetCat_QNAME = new QName("http://entity.cards.common.scb", "cat");
    private final static QName _CampaignDetRef_QNAME = new QName("http://entity.cards.common.scb", "ref");
    private final static QName _CampaignDetStmtIntAmt_QNAME = new QName("http://entity.cards.common.scb", "stmtIntAmt");
    private final static QName _CampaignDetLastPymtAmt_QNAME = new QName("http://entity.cards.common.scb", "lastPymtAmt");
    private final static QName _OrderAppliedAmt_QNAME = new QName("http://entity.cards.common.scb", "appliedAmt");
    private final static QName _OrderAcctType_QNAME = new QName("http://entity.cards.common.scb", "acctType");
    private final static QName _OrderOrderStatus_QNAME = new QName("http://entity.cards.common.scb", "orderStatus");
    private final static QName _LineBurnCampaignCode_QNAME = new QName("http://entity.cards.common.scb", "campaignCode");
    private final static QName _LineBurnMerchantOrg_QNAME = new QName("http://entity.cards.common.scb", "merchantOrg");
    private final static QName _LineBurnTranType_QNAME = new QName("http://entity.cards.common.scb", "tranType");
    private final static QName _LineBurnPromotionCode_QNAME = new QName("http://entity.cards.common.scb", "promotionCode");
    private final static QName _LineBurnSubChannel_QNAME = new QName("http://entity.cards.common.scb", "subChannel");
    private final static QName _EarlyRepaySavingsIntRate_QNAME = new QName("http://entity.cards.common.scb", "intRate");
    private final static QName _EarlyRepaySavingsIntMethod_QNAME = new QName("http://entity.cards.common.scb", "intMethod");
    private final static QName _EarlyRepaySavingsInstNo_QNAME = new QName("http://entity.cards.common.scb", "instNo");
    private final static QName _EarlyRepaySavingsInstBilled_QNAME = new QName("http://entity.cards.common.scb", "instBilled");
    private final static QName _EarlyRepaySavingsOrderDt_QNAME = new QName("http://entity.cards.common.scb", "orderDt");
    private final static QName _EarlyRepaySavingsNextBillingDt_QNAME = new QName("http://entity.cards.common.scb", "nextBillingDt");
    private final static QName _EarlyRepaySavingsBilledAmt_QNAME = new QName("http://entity.cards.common.scb", "billedAmt");
    private final static QName _EarlyRepaySavingsPrincipalAmt_QNAME = new QName("http://entity.cards.common.scb", "principalAmt");
    private final static QName _EarlyRepaySavingsOutstandBal_QNAME = new QName("http://entity.cards.common.scb", "outstandBal");
    private final static QName _EarlyRepaySavingsIntAmtUnbilled_QNAME = new QName("http://entity.cards.common.scb", "intAmtUnbilled");
    private final static QName _EarlyRepaySavingsInstUnbilled_QNAME = new QName("http://entity.cards.common.scb", "instUnbilled");
    private final static QName _EarlyRepaySavingsRemainingInst_QNAME = new QName("http://entity.cards.common.scb", "remainingInst");
    private final static QName _EarlyRepaySavingsEarlyRepayCharge_QNAME = new QName("http://entity.cards.common.scb", "earlyRepayCharge");
    private final static QName _EarlyRepaySavingsEarlyRepaySavings_QNAME = new QName("http://entity.cards.common.scb", "earlyRepaySavings");
    private final static QName _EarlyRepaySavingsNextBillAmt_QNAME = new QName("http://entity.cards.common.scb", "nextBillAmt");
    private final static QName _EarlyRepaySavingsAddtnlHandlingFee_QNAME = new QName("http://entity.cards.common.scb", "addtnlHandlingFee");
    private final static QName _EarlyRepaySavingsUserHandlingFee_QNAME = new QName("http://entity.cards.common.scb", "userHandlingFee");
    private final static QName _EarlyRepaySavingsEarlyRedemptionDue_QNAME = new QName("http://entity.cards.common.scb", "earlyRedemptionDue");
    private final static QName _CardRPCEffDate_QNAME = new QName("http://entity.cards.common.scb", "effDate");
    private final static QName _CardRPCRpcID_QNAME = new QName("http://entity.cards.common.scb", "rpcID");
    private final static QName _CardRPCOutstandBalance_QNAME = new QName("http://entity.cards.common.scb", "outstandBalance");
    private final static QName _CardRPCAccumulatedBalance_QNAME = new QName("http://entity.cards.common.scb", "accumulatedBalance");
    private final static QName _CardRPCBilledInt_QNAME = new QName("http://entity.cards.common.scb", "billedInt");
    private final static QName _CardRPCAccruedInt_QNAME = new QName("http://entity.cards.common.scb", "accruedInt");
    private final static QName _CardRPCIntRate_QNAME = new QName("http://entity.cards.common.scb", "IntRate");
    private final static QName _RewardHistoryAdjustments_QNAME = new QName("http://entity.cards.common.scb", "adjustments");
    private final static QName _RewardHistoryActualRewardPoint_QNAME = new QName("http://entity.cards.common.scb", "actualRewardPoint");
    private final static QName _RewardTransactionDetailsCurrQuarterCount_QNAME = new QName("http://entity.cards.common.scb", "currQuarterCount");
    private final static QName _RewardTransactionDetailsCurrQuarterPoint_QNAME = new QName("http://entity.cards.common.scb", "currQuarterPoint");
    private final static QName _RewardTransactionDetailsPreviousQuarterCount_QNAME = new QName("http://entity.cards.common.scb", "previousQuarterCount");
    private final static QName _RewardTransactionDetailsPreviousQuarterPoint_QNAME = new QName("http://entity.cards.common.scb", "previousQuarterPoint");
    private final static QName _PenaltyWaiverWaiverType_QNAME = new QName("http://entity.cards.common.scb", "waiverType");
    private final static QName _ServiceCustId_QNAME = new QName("http://entity.cards.common.scb", "custId");
    private final static QName _ServiceIdType_QNAME = new QName("http://entity.cards.common.scb", "idType");
    private final static QName _ServiceFullName_QNAME = new QName("http://entity.cards.common.scb", "fullName");
    private final static QName _ServiceAddValueAmt_QNAME = new QName("http://entity.cards.common.scb", "addValueAmt");
    private final static QName _ServiceRejectReason_QNAME = new QName("http://entity.cards.common.scb", "rejectReason");
    private final static QName _ServiceStatusUpdateDate_QNAME = new QName("http://entity.cards.common.scb", "statusUpdateDate");
    private final static QName _ServiceRequestPCard_QNAME = new QName("http://entity.cards.common.scb", "requestPCard");
    private final static QName _ServiceCardDispatchDate_QNAME = new QName("http://entity.cards.common.scb", "cardDispatchDate");
    private final static QName _ServiceCollectionPoint_QNAME = new QName("http://entity.cards.common.scb", "collectionPoint");
    private final static QName _ServiceBlacklistFlag_QNAME = new QName("http://entity.cards.common.scb", "blacklistFlag");
    private final static QName _ServiceBlacklistedBlockCount_QNAME = new QName("http://entity.cards.common.scb", "blacklistedBlockCount");
    private final static QName _ServiceBlacklistedDate_QNAME = new QName("http://entity.cards.common.scb", "blacklistedDate");
    private final static QName _ServiceUpdateDate_QNAME = new QName("http://entity.cards.common.scb", "updateDate");
    private final static QName _ServiceLastMaintDate_QNAME = new QName("http://entity.cards.common.scb", "lastMaintDate");
    private final static QName _ServiceDebtorRefNo_QNAME = new QName("http://entity.cards.common.scb", "debtorRefNo");
    private final static QName _CardInsuranceUserCode_QNAME = new QName("http://entity.cards.common.scb", "userCode");
    private final static QName _CardInsuranceCancelled_QNAME = new QName("http://entity.cards.common.scb", "cancelled");
    private final static QName _CardInsuranceCancelledCode_QNAME = new QName("http://entity.cards.common.scb", "cancelledCode");
    private final static QName _CardInsurancePremium_QNAME = new QName("http://entity.cards.common.scb", "premium");
    private final static QName _CardInsuranceClaim_QNAME = new QName("http://entity.cards.common.scb", "claim");
    private final static QName _CardInsuranceBilled_QNAME = new QName("http://entity.cards.common.scb", "billed");
    private final static QName _CardInsuranceReinstatedDate_QNAME = new QName("http://entity.cards.common.scb", "reinstatedDate");
    private final static QName _ForecastCoupon_QNAME = new QName("http://entity.cards.common.scb", "coupon");
    private final static QName _ForecastRetailSpendAmt_QNAME = new QName("http://entity.cards.common.scb", "retailSpendAmt");
    private final static QName _ForecastCashSpendAmt_QNAME = new QName("http://entity.cards.common.scb", "cashSpendAmt");
    private final static QName _ForecastSpendLevel_QNAME = new QName("http://entity.cards.common.scb", "spendLevel");
    private final static QName _ForecastPenaltyChgFlag_QNAME = new QName("http://entity.cards.common.scb", "penaltyChgFlag");
    private final static QName _ForecastExpSpendAmtLevel1_QNAME = new QName("http://entity.cards.common.scb", "expSpendAmtLevel1");
    private final static QName _ForecastExpStmtAmtLevel1_QNAME = new QName("http://entity.cards.common.scb", "expStmtAmtLevel1");
    private final static QName _ForecastExpSpendAmtLevel2_QNAME = new QName("http://entity.cards.common.scb", "expSpendAmtLevel2");
    private final static QName _ForecastExpStmtAmtLevel2_QNAME = new QName("http://entity.cards.common.scb", "expStmtAmtLevel2");
    private final static QName _ForecastExpSpendAmtLevel3_QNAME = new QName("http://entity.cards.common.scb", "expSpendAmtLevel3");
    private final static QName _ForecastExpStmtAmtLevel3_QNAME = new QName("http://entity.cards.common.scb", "expStmtAmtLevel3");
    private final static QName _ForecastPrevSpendLevel_QNAME = new QName("http://entity.cards.common.scb", "prevSpendLevel");
    private final static QName _ForecastNextRenewalDate_QNAME = new QName("http://entity.cards.common.scb", "nextRenewalDate");
    private final static QName _ForecastLastMaintainedBy_QNAME = new QName("http://entity.cards.common.scb", "lastMaintainedBy");
    private final static QName _CardCustomerCustomerID_QNAME = new QName("http://entity.cards.common.scb", "customerID");
    private final static QName _CardCustomerEmployerName_QNAME = new QName("http://entity.cards.common.scb", "employerName");
    private final static QName _CardCustomerTitle_QNAME = new QName("http://entity.cards.common.scb", "title");
    private final static QName _CardCustomerDesignation_QNAME = new QName("http://entity.cards.common.scb", "designation");
    private final static QName _CardCustomerCustomerLevelBlock_QNAME = new QName("http://entity.cards.common.scb", "customerLevelBlock");
    private final static QName _CardCustomerCustomerLevelBlockDesc_QNAME = new QName("http://entity.cards.common.scb", "customerLevelBlockDesc");
    private final static QName _CardCustomerPANNo_QNAME = new QName("http://entity.cards.common.scb", "PANNo");
    private final static QName _CardCustomerKYC_QNAME = new QName("http://entity.cards.common.scb", "KYC");
    private final static QName _CardCustomerDateofBirth_QNAME = new QName("http://entity.cards.common.scb", "dateofBirth");
    private final static QName _CardCustomerCustomerSince_QNAME = new QName("http://entity.cards.common.scb", "customerSince");
    private final static QName _CardCustomerAvailCreditLimit_QNAME = new QName("http://entity.cards.common.scb", "availCreditLimit");
    private final static QName _CardCustomerAvailCashLimit_QNAME = new QName("http://entity.cards.common.scb", "availCashLimit");
    private final static QName _CardCustomerMPSLimit_QNAME = new QName("http://entity.cards.common.scb", "MPSLimit");
    private final static QName _CardCustomerMPSAvailLimit_QNAME = new QName("http://entity.cards.common.scb", "MPSAvailLimit");
    private final static QName _CardCustomerMPSExpiryDate_QNAME = new QName("http://entity.cards.common.scb", "MPSExpiryDate");
    private final static QName _CardCustomerCurrentBalance_QNAME = new QName("http://entity.cards.common.scb", "currentBalance");
    private final static QName _CardCustomerOutstandingBalance_QNAME = new QName("http://entity.cards.common.scb", "outstandingBalance");
    private final static QName _CardCustomerDetailsOfLEZCode_QNAME = new QName("http://entity.cards.common.scb", "detailsOfLEZCode");
    private final static QName _CardCustomerNickName_QNAME = new QName("http://entity.cards.common.scb", "nickName");
    private final static QName _CardCustomerRelationshipType_QNAME = new QName("http://entity.cards.common.scb", "relationshipType");
    private final static QName _CardCustomerRelationshipNo_QNAME = new QName("http://entity.cards.common.scb", "relationshipNo");
    private final static QName _CardCustomerOtherAddress_QNAME = new QName("http://entity.cards.common.scb", "OtherAddress");
    private final static QName _CardCustomerPrimaryAccountHolder_QNAME = new QName("http://entity.cards.common.scb", "primaryAccountHolder");
    private final static QName _CardCustomerPrimaryCustomer_QNAME = new QName("http://entity.cards.common.scb", "primaryCustomer");
    private final static QName _CardCustomerCustomerShortName_QNAME = new QName("http://entity.cards.common.scb", "customerShortName");
    private final static QName _CardCustomerBillingCycle_QNAME = new QName("http://entity.cards.common.scb", "billingCycle");
    private final static QName _CardCustomerGstRegistrationNo_QNAME = new QName("http://entity.cards.common.scb", "gstRegistrationNo");
    private final static QName _CardCustomerTotalAvailablePoint_QNAME = new QName("http://entity.cards.common.scb", "totalAvailablePoint");
    private final static QName _CardCustomerTotalStmtBalance_QNAME = new QName("http://entity.cards.common.scb", "totalStmtBalance");
    private final static QName _CardCustomerTotalCurrentBalance_QNAME = new QName("http://entity.cards.common.scb", "totalCurrentBalance");
    private final static QName _CardCustomerTotalMinAmountDue_QNAME = new QName("http://entity.cards.common.scb", "totalMinAmountDue");
    private final static QName _CardCustomerLastPaymentAmount_QNAME = new QName("http://entity.cards.common.scb", "lastPaymentAmount");
    private final static QName _CardCustomerPermanentCreditLimit_QNAME = new QName("http://entity.cards.common.scb", "permanentCreditLimit");
    private final static QName _CardCustomerEntityID_QNAME = new QName("http://entity.cards.common.scb", "entityID");
    private final static QName _CardCustomerEntityType_QNAME = new QName("http://entity.cards.common.scb", "entityType");
    private final static QName _CardCustomerRequestFlag_QNAME = new QName("http://entity.cards.common.scb", "requestFlag");
    private final static QName _CardCustomerSystemID_QNAME = new QName("http://entity.cards.common.scb", "systemID");
    private final static QName _CardCustomerStatementCycle_QNAME = new QName("http://entity.cards.common.scb", "statementCycle");
    private final static QName _CardCustomerFunctionID_QNAME = new QName("http://entity.cards.common.scb", "functionID");
    private final static QName _CardCustomerTotalAvailableBalPoints_QNAME = new QName("http://entity.cards.common.scb", "totalAvailableBalPoints");
    private final static QName _CardCustomerTotalexpPointsRedeemable_QNAME = new QName("http://entity.cards.common.scb", "totalexpPointsRedeemable");
    private final static QName _CardCustomerTotalpointsForteited_QNAME = new QName("http://entity.cards.common.scb", "totalpointsForteited");
    private final static QName _CardCustomerNextPageKey_QNAME = new QName("http://entity.cards.common.scb", "nextPageKey");
    private final static QName _CardCustomerGender_QNAME = new QName("http://entity.cards.common.scb", "gender");
    private final static QName _CardCustomerGenderDesc_QNAME = new QName("http://entity.cards.common.scb", "genderDesc");
    private final static QName _CardCustomerBehaviourScore_QNAME = new QName("http://entity.cards.common.scb", "behaviourScore");
    private final static QName _CardCustomerTotalRemainingBalance_QNAME = new QName("http://entity.cards.common.scb", "totalRemainingBalance");
    private final static QName _CardCustomerLastMaintainenceDate_QNAME = new QName("http://entity.cards.common.scb", "lastMaintainenceDate");
    private final static QName _CardCustomerShadowLimitInd_QNAME = new QName("http://entity.cards.common.scb", "shadowLimitInd");
    private final static QName _CardCustomerShadowLimitExpDate_QNAME = new QName("http://entity.cards.common.scb", "shadowLimitExpDate");
    private final static QName _CardCustomerPaymentApportionment_QNAME = new QName("http://entity.cards.common.scb", "paymentApportionment");
    private final static QName _CardCustomerPaymentApportionmentExpDate_QNAME = new QName("http://entity.cards.common.scb", "paymentApportionmentExpDate");
    private final static QName _CardCustomerCustIDType_QNAME = new QName("http://entity.cards.common.scb", "custIDType");
    private final static QName _CardCustomerSalutation_QNAME = new QName("http://entity.cards.common.scb", "salutation");
    private final static QName _CardCustomerDirectMail_QNAME = new QName("http://entity.cards.common.scb", "directMail");
    private final static QName _CardCustomerCardExpDate_QNAME = new QName("http://entity.cards.common.scb", "cardExpDate");
    private final static QName _CardCustomerLastMinAmtDue_QNAME = new QName("http://entity.cards.common.scb", "lastMinAmtDue");
    private final static QName _CardCustomerConsolidatedCode_QNAME = new QName("http://entity.cards.common.scb", "consolidatedCode");
    private final static QName _CardCustomerCallingCardNo_QNAME = new QName("http://entity.cards.common.scb", "callingCardNo");
    private final static QName _CardCustomerEmploymentDate_QNAME = new QName("http://entity.cards.common.scb", "employmentDate");
    private final static QName _CardCustomerEmployeeFlag_QNAME = new QName("http://entity.cards.common.scb", "employeeFlag");
    private final static QName _CardCustomerPastDueFlag_QNAME = new QName("http://entity.cards.common.scb", "pastDueFlag");
    private final static QName _CardCustomerMailingAddress_QNAME = new QName("http://entity.cards.common.scb", "MailingAddress");
    private final static QName _CardCustomerAvailCreditLimit2_QNAME = new QName("http://entity.cards.common.scb", "availCreditLimit2");
    private final static QName _CardCustomerAvailCashLimit2_QNAME = new QName("http://entity.cards.common.scb", "availCashLimit2");
    private final static QName _CardCustomerSegmentCode_QNAME = new QName("http://entity.cards.common.scb", "segmentCode");
    private final static QName _CardCustomerOverLimitOption_QNAME = new QName("http://entity.cards.common.scb", "overLimitOption");
    private final static QName _CardCustomerCrmODRowId_QNAME = new QName("http://entity.cards.common.scb", "crmODRowId");
    private final static QName _CardCustomerLinkedCustId_QNAME = new QName("http://entity.cards.common.scb", "linkedCustId");
    private final static QName _CardCustomerMaritalStatus_QNAME = new QName("http://entity.cards.common.scb", "maritalStatus");
    private final static QName _CardCustomerGrossAnnualIncome_QNAME = new QName("http://entity.cards.common.scb", "grossAnnualIncome");
    private final static QName _CardCustomerCoOwnerWorkTelephoneNo_QNAME = new QName("http://entity.cards.common.scb", "coOwnerWorkTelephoneNo");
    private final static QName _CardCustomerCardHolderStatus_QNAME = new QName("http://entity.cards.common.scb", "cardHolderStatus");
    private final static QName _CardCustomerIcNo_QNAME = new QName("http://entity.cards.common.scb", "icNo");
    private final static QName _CardCustomerRtnInd_QNAME = new QName("http://entity.cards.common.scb", "rtnInd");
    private final static QName _CardCustomerAdditionalMailingTitle1_QNAME = new QName("http://entity.cards.common.scb", "additionalMailingTitle1");
    private final static QName _CardCustomerAdditionalMailingTitle2_QNAME = new QName("http://entity.cards.common.scb", "additionalMailingTitle2");
    private final static QName _CardCustomerAdditionalAddressState_QNAME = new QName("http://entity.cards.common.scb", "additionalAddressState");
    private final static QName _CardCustomerAdditionalAddressCountry_QNAME = new QName("http://entity.cards.common.scb", "additionalAddressCountry");
    private final static QName _CardCustomerNoOfYearsAtResidence_QNAME = new QName("http://entity.cards.common.scb", "noOfYearsAtResidence");
    private final static QName _CardCustomerResidenceType_QNAME = new QName("http://entity.cards.common.scb", "residenceType");
    private final static QName _CardCustomerOwnershipStatus_QNAME = new QName("http://entity.cards.common.scb", "ownershipStatus");
    private final static QName _CardCustomerNoOfYearsInService_QNAME = new QName("http://entity.cards.common.scb", "noOfYearsInService");
    private final static QName _CardCustomerPositionsHeld_QNAME = new QName("http://entity.cards.common.scb", "positionsHeld");
    private final static QName _CardCustomerNationality_QNAME = new QName("http://entity.cards.common.scb", "nationality");
    private final static QName _CardCustomerMemo1_QNAME = new QName("http://entity.cards.common.scb", "memo1");
    private final static QName _CardCustomerMemo2_QNAME = new QName("http://entity.cards.common.scb", "memo2");
    private final static QName _CardCustomerFaxNo_QNAME = new QName("http://entity.cards.common.scb", "faxNo");
    private final static QName _CardCustomerRetailInterestRate_QNAME = new QName("http://entity.cards.common.scb", "retailInterestRate");
    private final static QName _CardCustomerCashInterestRate_QNAME = new QName("http://entity.cards.common.scb", "cashInterestRate");
    private final static QName _CardCustomerCoOwnerDOB_QNAME = new QName("http://entity.cards.common.scb", "coOwnerDOB");
    private final static QName _CardCustomerAdditionalAddress_QNAME = new QName("http://entity.cards.common.scb", "additionalAddress");
    private final static QName _CardCustomerRedemption_QNAME = new QName("http://entity.cards.common.scb", "Redemption");
    private final static QName _CardCustomerResponse_QNAME = new QName("http://entity.cards.common.scb", "Response");
    private final static QName _CreditCardCardHolderStatusDesc_QNAME = new QName("http://entity.cards.common.scb", "cardHolderStatusDesc");
    private final static QName _CreditCardPrimaryBlockCode_QNAME = new QName("http://entity.cards.common.scb", "primaryBlockCode");
    private final static QName _CreditCardAlternateBlockCode_QNAME = new QName("http://entity.cards.common.scb", "alternateBlockCode");
    private final static QName _CreditCardStmtType_QNAME = new QName("http://entity.cards.common.scb", "stmtType");
    private final static QName _CreditCardStmtBalance_QNAME = new QName("http://entity.cards.common.scb", "stmtBalance");
    private final static QName _CreditCardPastDueAmount_QNAME = new QName("http://entity.cards.common.scb", "pastDueAmount");
    private final static QName _CreditCardPreviousBalance_QNAME = new QName("http://entity.cards.common.scb", "previousBalance");
    private final static QName _CreditCardPaymentCredt_QNAME = new QName("http://entity.cards.common.scb", "paymentCredt");
    private final static QName _CreditCardPurchaseDebit_QNAME = new QName("http://entity.cards.common.scb", "purchaseDebit");
    private final static QName _CreditCardFinancialCharges_QNAME = new QName("http://entity.cards.common.scb", "financialCharges");
    private final static QName _CreditCardStmtDate_QNAME = new QName("http://entity.cards.common.scb", "stmtDate");
    private final static QName _CreditCardCycleDays_QNAME = new QName("http://entity.cards.common.scb", "cycleDays");
    private final static QName _CreditCardMinAmountDue_QNAME = new QName("http://entity.cards.common.scb", "minAmountDue");
    private final static QName _CreditCardLastActivity_QNAME = new QName("http://entity.cards.common.scb", "lastActivity");
    private final static QName _CreditCardNoOfTotalAuthorization_QNAME = new QName("http://entity.cards.common.scb", "noOfTotalAuthorization");
    private final static QName _CreditCardTotalAuthorizationAmt_QNAME = new QName("http://entity.cards.common.scb", "totalAuthorizationAmt");
    private final static QName _CreditCardNoOfTodayAuthorization_QNAME = new QName("http://entity.cards.common.scb", "noOfTodayAuthorization");
    private final static QName _CreditCardTodayAuthorizationAmt_QNAME = new QName("http://entity.cards.common.scb", "todayAuthorizationAmt");
    private final static QName _CreditCardNoOfOutstandAuthorization_QNAME = new QName("http://entity.cards.common.scb", "noOfOutstandAuthorization");
    private final static QName _CreditCardOutstandAuthorizationAmt_QNAME = new QName("http://entity.cards.common.scb", "outstandAuthorizationAmt");
    private final static QName _CreditCardOutstandAuthorizationAmtDec_QNAME = new QName("http://entity.cards.common.scb", "outstandAuthorizationAmtDec");
    private final static QName _CreditCardEarlySettlementDate_QNAME = new QName("http://entity.cards.common.scb", "earlySettlementDate");
    private final static QName _CreditCardPayoffAmount_QNAME = new QName("http://entity.cards.common.scb", "payoffAmount");
    private final static QName _CreditCardInterestPerDiem_QNAME = new QName("http://entity.cards.common.scb", "interestPerDiem");
    private final static QName _CreditCardAccrualDate_QNAME = new QName("http://entity.cards.common.scb", "accrualDate");
    private final static QName _CreditCardAccruedThroughDate_QNAME = new QName("http://entity.cards.common.scb", "accruedThroughDate");
    private final static QName _CreditCardPaymentDate_QNAME = new QName("http://entity.cards.common.scb", "paymentDate");
    private final static QName _CreditCardNoOfReturnedCheques_QNAME = new QName("http://entity.cards.common.scb", "noOfReturnedCheques");
    private final static QName _CreditCardLastReturnedChequeDate_QNAME = new QName("http://entity.cards.common.scb", "lastReturnedChequeDate");
    private final static QName _CreditCardLastPurchaseDate_QNAME = new QName("http://entity.cards.common.scb", "lastPurchaseDate");
    private final static QName _CreditCardLastAdvancedAmt_QNAME = new QName("http://entity.cards.common.scb", "lastAdvancedAmt");
    private final static QName _CreditCardLastCashAdvanceDate_QNAME = new QName("http://entity.cards.common.scb", "lastCashAdvanceDate");
    private final static QName _CreditCardLastPurchaseAmt_QNAME = new QName("http://entity.cards.common.scb", "lastPurchaseAmt");
    private final static QName _CreditCardLastPaymentAmt_QNAME = new QName("http://entity.cards.common.scb", "lastPaymentAmt");
    private final static QName _CreditCardNoOfAuthorisedTransaction_QNAME = new QName("http://entity.cards.common.scb", "noOfAuthorisedTransaction");
    private final static QName _CreditCardAuthorisedAmount_QNAME = new QName("http://entity.cards.common.scb", "authorisedAmount");
    private final static QName _CreditCardAuthorisedCashAdvance_QNAME = new QName("http://entity.cards.common.scb", "authorisedCashAdvance");
    private final static QName _CreditCardLastCreditLimit_QNAME = new QName("http://entity.cards.common.scb", "lastCreditLimit");
    private final static QName _CreditCardLastCreditLimitDate_QNAME = new QName("http://entity.cards.common.scb", "lastCreditLimitDate");
    private final static QName _CreditCardTmpLimit_QNAME = new QName("http://entity.cards.common.scb", "tmpLimit");
    private final static QName _CreditCardTmpLimitExpiryDate_QNAME = new QName("http://entity.cards.common.scb", "tmpLimitExpiryDate");
    private final static QName _CreditCardAvailableCashLimit_QNAME = new QName("http://entity.cards.common.scb", "availableCashLimit");
    private final static QName _CreditCardCreditLimitDate_QNAME = new QName("http://entity.cards.common.scb", "creditLimitDate");
    private final static QName _CreditCardHighBalance_QNAME = new QName("http://entity.cards.common.scb", "highBalance");
    private final static QName _CreditCardHighBalanceDate_QNAME = new QName("http://entity.cards.common.scb", "highBalanceDate");
    private final static QName _CreditCardCashBalance_QNAME = new QName("http://entity.cards.common.scb", "cashBalance");
    private final static QName _CreditCardRetailBalance_QNAME = new QName("http://entity.cards.common.scb", "retailBalance");
    private final static QName _CreditCardLastStatement_QNAME = new QName("http://entity.cards.common.scb", "lastStatement");
    private final static QName _CreditCardCcmsCustomerID_QNAME = new QName("http://entity.cards.common.scb", "ccmsCustomerID");
    private final static QName _CreditCardCardUsageStatus_QNAME = new QName("http://entity.cards.common.scb", "cardUsageStatus");
    private final static QName _CreditCardCurrYearCashAdvIntPaid_QNAME = new QName("http://entity.cards.common.scb", "currYearCashAdvIntPaid");
    private final static QName _CreditCardLastYearCashAdvIntPaid_QNAME = new QName("http://entity.cards.common.scb", "lastYearCashAdvIntPaid");
    private final static QName _CreditCardCurrYearIntPaid_QNAME = new QName("http://entity.cards.common.scb", "currYearIntPaid");
    private final static QName _CreditCardLastYearIntPaid_QNAME = new QName("http://entity.cards.common.scb", "lastYearIntPaid");
    private final static QName _CreditCardProductTiedToCard_QNAME = new QName("http://entity.cards.common.scb", "productTiedToCard");
    private final static QName _CreditCardLastTransactionDate_QNAME = new QName("http://entity.cards.common.scb", "lastTransactionDate");
    private final static QName _CreditCardLastActiveDate_QNAME = new QName("http://entity.cards.common.scb", "lastActiveDate");
    private final static QName _CreditCardPinReIssueDate_QNAME = new QName("http://entity.cards.common.scb", "pinReIssueDate");
    private final static QName _CreditCardCurrentDueAmount_QNAME = new QName("http://entity.cards.common.scb", "currentDueAmount");
    private final static QName _CreditCardTotalDueAmount_QNAME = new QName("http://entity.cards.common.scb", "totalDueAmount");
    private final static QName _CreditCardXdays_QNAME = new QName("http://entity.cards.common.scb", "xdays");
    private final static QName _CreditCardEmbossingName1_QNAME = new QName("http://entity.cards.common.scb", "embossingName1");
    private final static QName _CreditCardEmbossingName2_QNAME = new QName("http://entity.cards.common.scb", "embossingName2");
    private final static QName _CreditCardEmbossingName3_QNAME = new QName("http://entity.cards.common.scb", "embossingName3");
    private final static QName _CreditCardEmbossingName4_QNAME = new QName("http://entity.cards.common.scb", "embossingName4");
    private final static QName _CreditCardAutoDebit_QNAME = new QName("http://entity.cards.common.scb", "autoDebit");
    private final static QName _CreditCardRegion_QNAME = new QName("http://entity.cards.common.scb", "region");
    private final static QName _CreditCardSingleDualCard_QNAME = new QName("http://entity.cards.common.scb", "singleDualCard");
    private final static QName _CreditCardLastReplacementDate_QNAME = new QName("http://entity.cards.common.scb", "lastReplacementDate");
    private final static QName _CreditCardCardExpiryDate_QNAME = new QName("http://entity.cards.common.scb", "cardExpiryDate");
    private final static QName _CreditCardCustomerRiskScore_QNAME = new QName("http://entity.cards.common.scb", "customerRiskScore");
    private final static QName _CreditCardExposureAtRisk_QNAME = new QName("http://entity.cards.common.scb", "exposureAtRisk");
    private final static QName _CreditCardCorporateCustomer_QNAME = new QName("http://entity.cards.common.scb", "corporateCustomer");
    private final static QName _CreditCardPaymentType_QNAME = new QName("http://entity.cards.common.scb", "paymentType");
    private final static QName _CreditCardPaymentTypeDesc_QNAME = new QName("http://entity.cards.common.scb", "paymentTypeDesc");
    private final static QName _CreditCardPaymentMethod_QNAME = new QName("http://entity.cards.common.scb", "paymentMethod");
    private final static QName _CreditCardPaymentMethodDesc_QNAME = new QName("http://entity.cards.common.scb", "paymentMethodDesc");
    private final static QName _CreditCardLastCardRequestDate_QNAME = new QName("http://entity.cards.common.scb", "lastCardRequestDate");
    private final static QName _CreditCardLastPinRequestDate_QNAME = new QName("http://entity.cards.common.scb", "lastPinRequestDate");
    private final static QName _CreditCardLastPinMaintenanceDate_QNAME = new QName("http://entity.cards.common.scb", "lastPinMaintenanceDate");
    private final static QName _CreditCardNewTransferCardNo_QNAME = new QName("http://entity.cards.common.scb", "newTransferCardNo");
    private final static QName _CreditCardTransferEffectiveDate_QNAME = new QName("http://entity.cards.common.scb", "transferEffectiveDate");
    private final static QName _CreditCardRetailBaseRatePA_QNAME = new QName("http://entity.cards.common.scb", "retailBaseRatePA");
    private final static QName _CreditCardCashBaseRatePA_QNAME = new QName("http://entity.cards.common.scb", "cashBaseRatePA");
    private final static QName _CreditCardLateNotices_QNAME = new QName("http://entity.cards.common.scb", "lateNotices");
    private final static QName _CreditCardServiceCharges_QNAME = new QName("http://entity.cards.common.scb", "serviceCharges");
    private final static QName _CreditCardAnnualFees_QNAME = new QName("http://entity.cards.common.scb", "annualFees");
    private final static QName _CreditCardPrePay_QNAME = new QName("http://entity.cards.common.scb", "prePay");
    private final static QName _CreditCardLateCharges_QNAME = new QName("http://entity.cards.common.scb", "lateCharges");
    private final static QName _CreditCardOverlimitCharges_QNAME = new QName("http://entity.cards.common.scb", "overlimitCharges");
    private final static QName _CreditCardTotalDisputedAmount_QNAME = new QName("http://entity.cards.common.scb", "totalDisputedAmount");
    private final static QName _CreditCardRetailDisputeAmount_QNAME = new QName("http://entity.cards.common.scb", "retailDisputeAmount");
    private final static QName _CreditCardCashDisputedAmount_QNAME = new QName("http://entity.cards.common.scb", "cashDisputedAmount");
    private final static QName _CreditCardCardFeeDate_QNAME = new QName("http://entity.cards.common.scb", "cardFeeDate");
    private final static QName _CreditCardCardFeeAmount_QNAME = new QName("http://entity.cards.common.scb", "cardFeeAmount");
    private final static QName _CreditCardCtdFees0_QNAME = new QName("http://entity.cards.common.scb", "ctdFees0");
    private final static QName _CreditCardCtdFees1_QNAME = new QName("http://entity.cards.common.scb", "ctdFees1");
    private final static QName _CreditCardCtdFees2_QNAME = new QName("http://entity.cards.common.scb", "ctdFees2");
    private final static QName _CreditCardCtdFees3_QNAME = new QName("http://entity.cards.common.scb", "ctdFees3");
    private final static QName _CreditCardUserCode1_QNAME = new QName("http://entity.cards.common.scb", "userCode1");
    private final static QName _CreditCardUserCode2_QNAME = new QName("http://entity.cards.common.scb", "userCode2");
    private final static QName _CreditCardUserCode3_QNAME = new QName("http://entity.cards.common.scb", "userCode3");
    private final static QName _CreditCardUserCode4_QNAME = new QName("http://entity.cards.common.scb", "userCode4");
    private final static QName _CreditCardRewardPointsErndInCurrCycle_QNAME = new QName("http://entity.cards.common.scb", "rewardPointsErndInCurrCycle");
    private final static QName _CreditCardRewardPointsRedeemedInCurrCycle_QNAME = new QName("http://entity.cards.common.scb", "rewardPointsRedeemedInCurrCycle");
    private final static QName _CreditCardLastDelinquencyDate_QNAME = new QName("http://entity.cards.common.scb", "lastDelinquencyDate");
    private final static QName _CreditCardPriorDelinquencyDate_QNAME = new QName("http://entity.cards.common.scb", "priorDelinquencyDate");
    private final static QName _CreditCardBalance30Days_QNAME = new QName("http://entity.cards.common.scb", "balance30Days");
    private final static QName _CreditCardBalance60Days_QNAME = new QName("http://entity.cards.common.scb", "balance60Days");
    private final static QName _CreditCardBalance90Days_QNAME = new QName("http://entity.cards.common.scb", "balance90Days");
    private final static QName _CreditCardBalance120Days_QNAME = new QName("http://entity.cards.common.scb", "balance120Days");
    private final static QName _CreditCardBalance150Days_QNAME = new QName("http://entity.cards.common.scb", "balance150Days");
    private final static QName _CreditCardBalance180Days_QNAME = new QName("http://entity.cards.common.scb", "balance180Days");
    private final static QName _CreditCardBalance210Days_QNAME = new QName("http://entity.cards.common.scb", "balance210Days");
    private final static QName _CreditCardPastDueBalance_QNAME = new QName("http://entity.cards.common.scb", "pastDueBalance");
    private final static QName _CreditCardXDayBalance_QNAME = new QName("http://entity.cards.common.scb", "xDayBalance");
    private final static QName _CreditCardJoiningFees_QNAME = new QName("http://entity.cards.common.scb", "joiningFees");
    private final static QName _CreditCardAccountName_QNAME = new QName("http://entity.cards.common.scb", "accountName");
    private final static QName _CreditCardSegmentCodeDesc_QNAME = new QName("http://entity.cards.common.scb", "segmentCodeDesc");
    private final static QName _CreditCardCurBlockCode_QNAME = new QName("http://entity.cards.common.scb", "curBlockCode");
    private final static QName _CreditCardCurBlockDate_QNAME = new QName("http://entity.cards.common.scb", "curBlockDate");
    private final static QName _CreditCardBlock1_QNAME = new QName("http://entity.cards.common.scb", "block1");
    private final static QName _CreditCardBlock1Date_QNAME = new QName("http://entity.cards.common.scb", "block1Date");
    private final static QName _CreditCardBlock2_QNAME = new QName("http://entity.cards.common.scb", "block2");
    private final static QName _CreditCardBlock2Date_QNAME = new QName("http://entity.cards.common.scb", "block2Date");
    private final static QName _CreditCardBlock3_QNAME = new QName("http://entity.cards.common.scb", "block3");
    private final static QName _CreditCardBlock3Date_QNAME = new QName("http://entity.cards.common.scb", "block3Date");
    private final static QName _CreditCardBlock4_QNAME = new QName("http://entity.cards.common.scb", "block4");
    private final static QName _CreditCardBlock4Date_QNAME = new QName("http://entity.cards.common.scb", "block4Date");
    private final static QName _CreditCardBlock5_QNAME = new QName("http://entity.cards.common.scb", "block5");
    private final static QName _CreditCardBlock5Date_QNAME = new QName("http://entity.cards.common.scb", "block5Date");
    private final static QName _CreditCardBlock6_QNAME = new QName("http://entity.cards.common.scb", "block6");
    private final static QName _CreditCardBlock6Date_QNAME = new QName("http://entity.cards.common.scb", "block6Date");
    private final static QName _CreditCardBlock7_QNAME = new QName("http://entity.cards.common.scb", "block7");
    private final static QName _CreditCardBlock7Date_QNAME = new QName("http://entity.cards.common.scb", "block7Date");
    private final static QName _CreditCardBlock8_QNAME = new QName("http://entity.cards.common.scb", "block8");
    private final static QName _CreditCardBlock8Date_QNAME = new QName("http://entity.cards.common.scb", "block8Date");
    private final static QName _CreditCardBlock9_QNAME = new QName("http://entity.cards.common.scb", "block9");
    private final static QName _CreditCardBlock9Date_QNAME = new QName("http://entity.cards.common.scb", "block9Date");
    private final static QName _CreditCardBlock10_QNAME = new QName("http://entity.cards.common.scb", "block10");
    private final static QName _CreditCardBlock10Date_QNAME = new QName("http://entity.cards.common.scb", "block10Date");
    private final static QName _CreditCardBlock11_QNAME = new QName("http://entity.cards.common.scb", "block11");
    private final static QName _CreditCardBlock11Date_QNAME = new QName("http://entity.cards.common.scb", "block11Date");
    private final static QName _CreditCardBlock12_QNAME = new QName("http://entity.cards.common.scb", "block12");
    private final static QName _CreditCardBlock12Date_QNAME = new QName("http://entity.cards.common.scb", "block12Date");
    private final static QName _CreditCardBlock13_QNAME = new QName("http://entity.cards.common.scb", "block13");
    private final static QName _CreditCardBlock13Date_QNAME = new QName("http://entity.cards.common.scb", "block13Date");
    private final static QName _CreditCardBlock14_QNAME = new QName("http://entity.cards.common.scb", "block14");
    private final static QName _CreditCardBlock14Date_QNAME = new QName("http://entity.cards.common.scb", "block14Date");
    private final static QName _CreditCardBlock15_QNAME = new QName("http://entity.cards.common.scb", "block15");
    private final static QName _CreditCardBlock15Date_QNAME = new QName("http://entity.cards.common.scb", "block15Date");
    private final static QName _CreditCardBlock16_QNAME = new QName("http://entity.cards.common.scb", "block16");
    private final static QName _CreditCardBlock16Date_QNAME = new QName("http://entity.cards.common.scb", "block16Date");
    private final static QName _CreditCardBlock17_QNAME = new QName("http://entity.cards.common.scb", "block17");
    private final static QName _CreditCardBlock17Date_QNAME = new QName("http://entity.cards.common.scb", "block17Date");
    private final static QName _CreditCardBlock18_QNAME = new QName("http://entity.cards.common.scb", "block18");
    private final static QName _CreditCardBlock18Date_QNAME = new QName("http://entity.cards.common.scb", "block18Date");
    private final static QName _CreditCardBlock19_QNAME = new QName("http://entity.cards.common.scb", "block19");
    private final static QName _CreditCardBlock19Date_QNAME = new QName("http://entity.cards.common.scb", "block19Date");
    private final static QName _CreditCardBlock20_QNAME = new QName("http://entity.cards.common.scb", "block20");
    private final static QName _CreditCardBlock20Date_QNAME = new QName("http://entity.cards.common.scb", "block20Date");
    private final static QName _CreditCardBlock21_QNAME = new QName("http://entity.cards.common.scb", "block21");
    private final static QName _CreditCardBlock21Date_QNAME = new QName("http://entity.cards.common.scb", "block21Date");
    private final static QName _CreditCardBlock22_QNAME = new QName("http://entity.cards.common.scb", "block22");
    private final static QName _CreditCardBlock22Date_QNAME = new QName("http://entity.cards.common.scb", "block22Date");
    private final static QName _CreditCardBlock23_QNAME = new QName("http://entity.cards.common.scb", "block23");
    private final static QName _CreditCardBlock23Date_QNAME = new QName("http://entity.cards.common.scb", "block23Date");
    private final static QName _CreditCardBlock24_QNAME = new QName("http://entity.cards.common.scb", "block24");
    private final static QName _CreditCardBlock24Date_QNAME = new QName("http://entity.cards.common.scb", "block24Date");
    private final static QName _CreditCardBlock25_QNAME = new QName("http://entity.cards.common.scb", "block25");
    private final static QName _CreditCardBlock25Date_QNAME = new QName("http://entity.cards.common.scb", "block25Date");
    private final static QName _CreditCardPageRequest_QNAME = new QName("http://entity.cards.common.scb", "pageRequest");
    private final static QName _CreditCardProductCodeDesc_QNAME = new QName("http://entity.cards.common.scb", "productCodeDesc");
    private final static QName _CreditCardAvailableCredit_QNAME = new QName("http://entity.cards.common.scb", "availableCredit");
    private final static QName _CreditCardAdvanceCash_QNAME = new QName("http://entity.cards.common.scb", "advanceCash");
    private final static QName _CreditCardAvailableCreditLimit_QNAME = new QName("http://entity.cards.common.scb", "availableCreditLimit");
    private final static QName _CreditCardRetailAccruedInterest_QNAME = new QName("http://entity.cards.common.scb", "retailAccruedInterest");
    private final static QName _CreditCardCashAccruedInterest_QNAME = new QName("http://entity.cards.common.scb", "cashAccruedInterest");
    private final static QName _CreditCardOpenedDate_QNAME = new QName("http://entity.cards.common.scb", "openedDate");
    private final static QName _CreditCardClosedDate_QNAME = new QName("http://entity.cards.common.scb", "closedDate");
    private final static QName _CreditCardLastUpdate_QNAME = new QName("http://entity.cards.common.scb", "lastUpdate");
    private final static QName _CreditCardCorporateID_QNAME = new QName("http://entity.cards.common.scb", "corporateID");
    private final static QName _CreditCardProjectedAccruedInterest_QNAME = new QName("http://entity.cards.common.scb", "projectedAccruedInterest");
    private final static QName _CreditCardStatementBalance_QNAME = new QName("http://entity.cards.common.scb", "statementBalance");
    private final static QName _CreditCardMinimumDue_QNAME = new QName("http://entity.cards.common.scb", "minimumDue");
    private final static QName _CreditCardPostingFlag_QNAME = new QName("http://entity.cards.common.scb", "postingFlag");
    private final static QName _CreditCardStatementFlag_QNAME = new QName("http://entity.cards.common.scb", "statementFlag");
    private final static QName _CreditCardSCOD_QNAME = new QName("http://entity.cards.common.scb", "SCOD");
    private final static QName _CreditCardInCollectionIndicator_QNAME = new QName("http://entity.cards.common.scb", "inCollectionIndicator");
    private final static QName _CreditCardPaymentDueDate_QNAME = new QName("http://entity.cards.common.scb", "paymentDueDate");
    private final static QName _CreditCardDirectDebitRoutingNo_QNAME = new QName("http://entity.cards.common.scb", "directDebitRoutingNo");
    private final static QName _CreditCardDirectDebitAccountNo_QNAME = new QName("http://entity.cards.common.scb", "directDebitAccountNo");
    private final static QName _CreditCardCardCategory_QNAME = new QName("http://entity.cards.common.scb", "cardCategory");
    private final static QName _CreditCardPROBEPermCreditLimit_QNAME = new QName("http://entity.cards.common.scb", "PROBEPermCreditLimit");
    private final static QName _CreditCardOutstandingAuthAmt_QNAME = new QName("http://entity.cards.common.scb", "outstandingAuthAmt");
    private final static QName _CreditCardNoOfTotalTrans_QNAME = new QName("http://entity.cards.common.scb", "noOfTotalTrans");
    private final static QName _CreditCardNoOfBilledTrans_QNAME = new QName("http://entity.cards.common.scb", "noOfBilledTrans");
    private final static QName _CreditCardNoOfUnbilledTrans_QNAME = new QName("http://entity.cards.common.scb", "noOfUnbilledTrans");
    private final static QName _CreditCardHostID_QNAME = new QName("http://entity.cards.common.scb", "hostID");
    private final static QName _CreditCardSubFunctionCode_QNAME = new QName("http://entity.cards.common.scb", "subFunctionCode");
    private final static QName _CreditCardPageTotal_QNAME = new QName("http://entity.cards.common.scb", "pageTotal");
    private final static QName _CreditCardLastSyncDate_QNAME = new QName("http://entity.cards.common.scb", "lastSyncDate");
    private final static QName _CreditCardCardProfile_QNAME = new QName("http://entity.cards.common.scb", "cardProfile");
    private final static QName _CreditCardTemporaryCreditLimitEffDate_QNAME = new QName("http://entity.cards.common.scb", "temporaryCreditLimitEffDate");
    private final static QName _CreditCardPermanentThershold_QNAME = new QName("http://entity.cards.common.scb", "permanentThershold");
    private final static QName _CreditCardTemporaryThershold_QNAME = new QName("http://entity.cards.common.scb", "temporaryThershold");
    private final static QName _CreditCardTimeXDays_QNAME = new QName("http://entity.cards.common.scb", "timeXDays");
    private final static QName _CreditCardTime30Days_QNAME = new QName("http://entity.cards.common.scb", "time30Days");
    private final static QName _CreditCardTime60Days_QNAME = new QName("http://entity.cards.common.scb", "time60Days");
    private final static QName _CreditCardTime90Days_QNAME = new QName("http://entity.cards.common.scb", "time90Days");
    private final static QName _CreditCardTime120Days_QNAME = new QName("http://entity.cards.common.scb", "time120Days");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fictional.ibank.card.ccms.xmlmodel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SecurityFault }
     * 
     */
    public SecurityFault createSecurityFault() {
        return new SecurityFault();
    }

    /**
     * Create an instance of {@link ServiceFault }
     * 
     */
    public ServiceFault createServiceFault() {
        return new ServiceFault();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link CardCustomer }
     * 
     */
    public CardCustomer createCardCustomer() {
        return new CardCustomer();
    }

    /**
     * Create an instance of {@link Forecast }
     * 
     */
    public Forecast createForecast() {
        return new Forecast();
    }

    /**
     * Create an instance of {@link CardInsurance }
     * 
     */
    public CardInsurance createCardInsurance() {
        return new CardInsurance();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link PenaltyWaiver }
     * 
     */
    public PenaltyWaiver createPenaltyWaiver() {
        return new PenaltyWaiver();
    }

    /**
     * Create an instance of {@link RewardTransactionDetails }
     * 
     */
    public RewardTransactionDetails createRewardTransactionDetails() {
        return new RewardTransactionDetails();
    }

    /**
     * Create an instance of {@link RewardHistory }
     * 
     */
    public RewardHistory createRewardHistory() {
        return new RewardHistory();
    }

    /**
     * Create an instance of {@link CardRPC }
     * 
     */
    public CardRPC createCardRPC() {
        return new CardRPC();
    }

    /**
     * Create an instance of {@link EarlyRepaySavings }
     * 
     */
    public EarlyRepaySavings createEarlyRepaySavings() {
        return new EarlyRepaySavings();
    }

    /**
     * Create an instance of {@link LineBurn }
     * 
     */
    public LineBurn createLineBurn() {
        return new LineBurn();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link CampaignDet }
     * 
     */
    public CampaignDet createCampaignDet() {
        return new CampaignDet();
    }

    /**
     * Create an instance of {@link ThirteenMonth }
     * 
     */
    public ThirteenMonth createThirteenMonth() {
        return new ThirteenMonth();
    }

    /**
     * Create an instance of {@link TaxDet }
     * 
     */
    public TaxDet createTaxDet() {
        return new TaxDet();
    }

    /**
     * Create an instance of {@link DrawDown }
     * 
     */
    public DrawDown createDrawDown() {
        return new DrawDown();
    }

    /**
     * Create an instance of {@link CustDet }
     * 
     */
    public CustDet createCustDet() {
        return new CustDet();
    }

    /**
     * Create an instance of {@link Gift }
     * 
     */
    public Gift createGift() {
        return new Gift();
    }

    /**
     * Create an instance of {@link Tier }
     * 
     */
    public Tier createTier() {
        return new Tier();
    }

    /**
     * Create an instance of {@link ExpiryPointDetails }
     * 
     */
    public ExpiryPointDetails createExpiryPointDetails() {
        return new ExpiryPointDetails();
    }

    /**
     * Create an instance of {@link TransactionDetails }
     * 
     */
    public TransactionDetails createTransactionDetails() {
        return new TransactionDetails();
    }

    /**
     * Create an instance of {@link ProductDetails }
     * 
     */
    public ProductDetails createProductDetails() {
        return new ProductDetails();
    }

    /**
     * Create an instance of {@link BalanceBucketsHistory }
     * 
     */
    public BalanceBucketsHistory createBalanceBucketsHistory() {
        return new BalanceBucketsHistory();
    }

    /**
     * Create an instance of {@link RPCBlock }
     * 
     */
    public RPCBlock createRPCBlock() {
        return new RPCBlock();
    }

    /**
     * Create an instance of {@link CreditHistory }
     * 
     */
    public CreditHistory createCreditHistory() {
        return new CreditHistory();
    }

    /**
     * Create an instance of {@link MerchandiseDetail }
     * 
     */
    public MerchandiseDetail createMerchandiseDetail() {
        return new MerchandiseDetail();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link AuthTransaction }
     * 
     */
    public AuthTransaction createAuthTransaction() {
        return new AuthTransaction();
    }

    /**
     * Create an instance of {@link OAAATransaction }
     * 
     */
    public OAAATransaction createOAAATransaction() {
        return new OAAATransaction();
    }

    /**
     * Create an instance of {@link CardProfile }
     * 
     */
    public CardProfile createCardProfile() {
        return new CardProfile();
    }

    /**
     * Create an instance of {@link Pot }
     * 
     */
    public Pot createPot() {
        return new Pot();
    }

    /**
     * Create an instance of {@link RewardSummary }
     * 
     */
    public RewardSummary createRewardSummary() {
        return new RewardSummary();
    }

    /**
     * Create an instance of {@link Reward }
     * 
     */
    public Reward createReward() {
        return new Reward();
    }

    /**
     * Create an instance of {@link Memo }
     * 
     */
    public Memo createMemo() {
        return new Memo();
    }

    /**
     * Create an instance of {@link CCAddress }
     * 
     */
    public CCAddress createCCAddress() {
        return new CCAddress();
    }

    /**
     * Create an instance of {@link SupplimentCard }
     * 
     */
    public SupplimentCard createSupplimentCard() {
        return new SupplimentCard();
    }

    /**
     * Create an instance of {@link CardAccessDetails }
     * 
     */
    public CardAccessDetails createCardAccessDetails() {
        return new CardAccessDetails();
    }

    /**
     * Create an instance of {@link CashOneDetails }
     * 
     */
    public CashOneDetails createCashOneDetails() {
        return new CashOneDetails();
    }

    /**
     * Create an instance of {@link CardDetails }
     * 
     */
    public CardDetails createCardDetails() {
        return new CardDetails();
    }

    /**
     * Create an instance of {@link EarningDetails }
     * 
     */
    public EarningDetails createEarningDetails() {
        return new EarningDetails();
    }

    /**
     * Create an instance of {@link PanBankInfo }
     * 
     */
    public PanBankInfo createPanBankInfo() {
        return new PanBankInfo();
    }

    /**
     * Create an instance of {@link ACCELProgramInfo }
     * 
     */
    public ACCELProgramInfo createACCELProgramInfo() {
        return new ACCELProgramInfo();
    }

    /**
     * Create an instance of {@link BalanceHistory }
     * 
     */
    public BalanceHistory createBalanceHistory() {
        return new BalanceHistory();
    }

    /**
     * Create an instance of {@link Redemption }
     * 
     */
    public Redemption createRedemption() {
        return new Redemption();
    }

    /**
     * Create an instance of {@link MerchantDetail }
     * 
     */
    public MerchantDetail createMerchantDetail() {
        return new MerchantDetail();
    }

    /**
     * Create an instance of {@link StatusHistory }
     * 
     */
    public StatusHistory createStatusHistory() {
        return new StatusHistory();
    }

    /**
     * Create an instance of {@link StatementHistory }
     * 
     */
    public StatementHistory createStatementHistory() {
        return new StatementHistory();
    }

    /**
     * Create an instance of {@link PurgeDetails }
     * 
     */
    public PurgeDetails createPurgeDetails() {
        return new PurgeDetails();
    }

    /**
     * Create an instance of {@link BlockDetail }
     * 
     */
    public BlockDetail createBlockDetail() {
        return new BlockDetail();
    }

    /**
     * Create an instance of {@link PastTransactions }
     * 
     */
    public PastTransactions createPastTransactions() {
        return new PastTransactions();
    }

    /**
     * Create an instance of {@link SupplementaryCardholderDetails }
     * 
     */
    public SupplementaryCardholderDetails createSupplementaryCardholderDetails() {
        return new SupplementaryCardholderDetails();
    }

    /**
     * Create an instance of {@link AirlineMembership }
     * 
     */
    public AirlineMembership createAirlineMembership() {
        return new AirlineMembership();
    }

    /**
     * Create an instance of {@link PLCCardDetails }
     * 
     */
    public PLCCardDetails createPLCCardDetails() {
        return new PLCCardDetails();
    }

    /**
     * Create an instance of {@link CallInTxns }
     * 
     */
    public CallInTxns createCallInTxns() {
        return new CallInTxns();
    }

    /**
     * Create an instance of {@link VIPUsageTransactions }
     * 
     */
    public VIPUsageTransactions createVIPUsageTransactions() {
        return new VIPUsageTransactions();
    }

    /**
     * Create an instance of {@link AirportParking }
     * 
     */
    public AirportParking createAirportParking() {
        return new AirportParking();
    }

    /**
     * Create an instance of {@link SMSAlerts }
     * 
     */
    public SMSAlerts createSMSAlerts() {
        return new SMSAlerts();
    }

    /**
     * Create an instance of {@link PriorityPassDetail }
     * 
     */
    public PriorityPassDetail createPriorityPassDetail() {
        return new PriorityPassDetail();
    }

    /**
     * Create an instance of {@link IDRPDtls }
     * 
     */
    public IDRPDtls createIDRPDtls() {
        return new IDRPDtls();
    }

    /**
     * Create an instance of {@link RedemptionProduct }
     * 
     */
    public RedemptionProduct createRedemptionProduct() {
        return new RedemptionProduct();
    }

    /**
     * Create an instance of {@link PricingHistory }
     * 
     */
    public PricingHistory createPricingHistory() {
        return new PricingHistory();
    }

    /**
     * Create an instance of {@link TopupHistory }
     * 
     */
    public TopupHistory createTopupHistory() {
        return new TopupHistory();
    }

    /**
     * Create an instance of {@link EarnDetails }
     * 
     */
    public EarnDetails createEarnDetails() {
        return new EarnDetails();
    }

    /**
     * Create an instance of {@link CardSummaryDtl }
     * 
     */
    public CardSummaryDtl createCardSummaryDtl() {
        return new CardSummaryDtl();
    }

    /**
     * Create an instance of {@link TokenCardList }
     * 
     */
    public TokenCardList createTokenCardList() {
        return new TokenCardList();
    }

    /**
     * Create an instance of {@link EmbossingDetails }
     * 
     */
    public EmbossingDetails createEmbossingDetails() {
        return new EmbossingDetails();
    }

    /**
     * Create an instance of {@link SCBOverlimit }
     * 
     */
    public SCBOverlimit createSCBOverlimit() {
        return new SCBOverlimit();
    }

    /**
     * Create an instance of {@link ManhattanOverlimit }
     * 
     */
    public ManhattanOverlimit createManhattanOverlimit() {
        return new ManhattanOverlimit();
    }

    /**
     * Create an instance of {@link PrimeOverlimit }
     * 
     */
    public PrimeOverlimit createPrimeOverlimit() {
        return new PrimeOverlimit();
    }

    /**
     * Create an instance of {@link LinkedCards }
     * 
     */
    public LinkedCards createLinkedCards() {
        return new LinkedCards();
    }

    /**
     * Create an instance of {@link PaymentHistory }
     * 
     */
    public PaymentHistory createPaymentHistory() {
        return new PaymentHistory();
    }

    /**
     * Create an instance of {@link InstallmentPlan }
     * 
     */
    public InstallmentPlan createInstallmentPlan() {
        return new InstallmentPlan();
    }

    /**
     * Create an instance of {@link SubAcctDtl }
     * 
     */
    public SubAcctDtl createSubAcctDtl() {
        return new SubAcctDtl();
    }

    /**
     * Create an instance of {@link PrimaryCard }
     * 
     */
    public PrimaryCard createPrimaryCard() {
        return new PrimaryCard();
    }

    /**
     * Create an instance of {@link Notes }
     * 
     */
    public Notes createNotes() {
        return new Notes();
    }

    /**
     * Create an instance of {@link NotesData }
     * 
     */
    public NotesData createNotesData() {
        return new NotesData();
    }

    /**
     * Create an instance of {@link MonthtoDateDetails }
     * 
     */
    public MonthtoDateDetails createMonthtoDateDetails() {
        return new MonthtoDateDetails();
    }

    /**
     * Create an instance of {@link MonthlyInstallmentDetails }
     * 
     */
    public MonthlyInstallmentDetails createMonthlyInstallmentDetails() {
        return new MonthlyInstallmentDetails();
    }

    /**
     * Create an instance of {@link SegmentType }
     * 
     */
    public SegmentType createSegmentType() {
        return new SegmentType();
    }

    /**
     * Create an instance of {@link ArmType }
     * 
     */
    public ArmType createArmType() {
        return new ArmType();
    }

    /**
     * Create an instance of {@link ServiceHeader }
     * 
     */
    public ServiceHeader createServiceHeader() {
        return new ServiceHeader();
    }

    /**
     * Create an instance of {@link CurrAmount }
     * 
     */
    public CurrAmount createCurrAmount() {
        return new CurrAmount();
    }

    /**
     * Create an instance of {@link CodeDesc }
     * 
     */
    public CodeDesc createCodeDesc() {
        return new CodeDesc();
    }

    /**
     * Create an instance of {@link TypeDesc }
     * 
     */
    public TypeDesc createTypeDesc() {
        return new TypeDesc();
    }

    /**
     * Create an instance of {@link MaintInfo }
     * 
     */
    public MaintInfo createMaintInfo() {
        return new MaintInfo();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link UserNameToken }
     * 
     */
    public UserNameToken createUserNameToken() {
        return new UserNameToken();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fault.service.common.scb", name = "SecurityFault")
    public JAXBElement<SecurityFault> createSecurityFault(SecurityFault value) {
        return new JAXBElement<SecurityFault>(_SecurityFault_QNAME, SecurityFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fault.service.common.scb", name = "ServiceFault")
    public JAXBElement<ServiceFault> createServiceFault(ServiceFault value) {
        return new JAXBElement<ServiceFault>(_ServiceFault_QNAME, ServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "TransactionHistory")
    public JAXBElement<CreditCard> createTransactionHistory(CreditCard value) {
        return new JAXBElement<CreditCard>(_TransactionHistory_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "AuthorisedTransaction")
    public JAXBElement<CreditCard> createAuthorisedTransaction(CreditCard value) {
        return new JAXBElement<CreditCard>(_AuthorisedTransaction_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "OAAATransaction")
    public JAXBElement<CreditCard> createOAAATransaction(CreditCard value) {
        return new JAXBElement<CreditCard>(_OAAATransaction_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "EnquireEarlySettlement")
    public JAXBElement<CreditCard> createEnquireEarlySettlement(CreditCard value) {
        return new JAXBElement<CreditCard>(_EnquireEarlySettlement_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "EnquireCardDetails")
    public JAXBElement<CreditCard> createEnquireCardDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_EnquireCardDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "MerchandiseDetails")
    public JAXBElement<CreditCard> createMerchandiseDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_MerchandiseDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "EnquireRewardPoints")
    public JAXBElement<CreditCard> createEnquireRewardPoints(CreditCard value) {
        return new JAXBElement<CreditCard>(_EnquireRewardPoints_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "EnquireDelinquencyHistory")
    public JAXBElement<CreditCard> createEnquireDelinquencyHistory(CreditCard value) {
        return new JAXBElement<CreditCard>(_EnquireDelinquencyHistory_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "EnquireCreditHistory")
    public JAXBElement<CreditCard> createEnquireCreditHistory(CreditCard value) {
        return new JAXBElement<CreditCard>(_EnquireCreditHistory_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "CreateCardNotes")
    public JAXBElement<CreditCard> createCreateCardNotes(CreditCard value) {
        return new JAXBElement<CreditCard>(_CreateCardNotes_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "EnquireCardNotes")
    public JAXBElement<CreditCard> createEnquireCardNotes(CreditCard value) {
        return new JAXBElement<CreditCard>(_EnquireCardNotes_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "EnquireCashOneDetails")
    public JAXBElement<CreditCard> createEnquireCashOneDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_EnquireCashOneDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCustomerRewardPointsSummary")
    public JAXBElement<CardCustomer> createGetCustomerRewardPointsSummary(CardCustomer value) {
        return new JAXBElement<CardCustomer>(_GetCustomerRewardPointsSummary_QNAME, CardCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardRewardPointsSummary")
    public JAXBElement<CreditCard> createGetCardRewardPointsSummary(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardRewardPointsSummary_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetRewardPointsTransaction")
    public JAXBElement<CreditCard> createGetRewardPointsTransaction(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetRewardPointsTransaction_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "EnquireCardCustomer")
    public JAXBElement<CardCustomer> createEnquireCardCustomer(CardCustomer value) {
        return new JAXBElement<CardCustomer>(_EnquireCardCustomer_QNAME, CardCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "EnquireLinkedCards")
    public JAXBElement<CardCustomer> createEnquireLinkedCards(CardCustomer value) {
        return new JAXBElement<CardCustomer>(_EnquireLinkedCards_QNAME, CardCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetRewardRedemptionDetails")
    public JAXBElement<CardCustomer> createGetRewardRedemptionDetails(CardCustomer value) {
        return new JAXBElement<CardCustomer>(_GetRewardRedemptionDetails_QNAME, CardCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetMerchantDetails")
    public JAXBElement<CreditCard> createGetMerchantDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetMerchantDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardDisputeResolutionDetails")
    public JAXBElement<CreditCard> createGetCardDisputeResolutionDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardDisputeResolutionDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardReturnDetails")
    public JAXBElement<CreditCard> createGetCardReturnDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardReturnDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardRewardRedemptionDetails")
    public JAXBElement<CreditCard> createGetCardRewardRedemptionDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardRewardRedemptionDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardStatementHistory")
    public JAXBElement<CreditCard> createGetCardStatementHistory(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardStatementHistory_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetPriorityPassDetails")
    public JAXBElement<CreditCard> createGetPriorityPassDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetPriorityPassDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCreditCardPurgeDetails")
    public JAXBElement<CreditCard> createGetCreditCardPurgeDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCreditCardPurgeDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetPastCardTransactions")
    public JAXBElement<CreditCard> createGetPastCardTransactions(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetPastCardTransactions_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardBlockCodeDescription")
    public JAXBElement<CreditCard> createGetCardBlockCodeDescription(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardBlockCodeDescription_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardCallInCashDetails")
    public JAXBElement<CreditCard> createGetCardCallInCashDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardCallInCashDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardPaymentActivityList")
    public JAXBElement<CreditCard> createGetCardPaymentActivityList(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardPaymentActivityList_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardSpecialTxnHistory")
    public JAXBElement<CreditCard> createGetCardSpecialTxnHistory(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardSpecialTxnHistory_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardSMSAlerts")
    public JAXBElement<CreditCard> createGetCardSMSAlerts(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardSMSAlerts_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardCashLimit")
    public JAXBElement<CreditCard> createGetCardCashLimit(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardCashLimit_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardForecastDetails")
    public JAXBElement<CreditCard> createGetCardForecastDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardForecastDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardInsuranceDetails")
    public JAXBElement<CreditCard> createGetCardInsuranceDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardInsuranceDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardSpecialServicesDetails")
    public JAXBElement<CreditCard> createGetCardSpecialServicesDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardSpecialServicesDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardWaiverHistory")
    public JAXBElement<CreditCard> createGetCardWaiverHistory(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardWaiverHistory_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardRPCTransactionHistory")
    public JAXBElement<CreditCard> createGetCardRPCTransactionHistory(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardRPCTransactionHistory_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardMultipleBonusEnquiry")
    public JAXBElement<CreditCard> createGetCardMultipleBonusEnquiry(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardMultipleBonusEnquiry_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetEarlyRepaymentSavingsDetails")
    public JAXBElement<CreditCard> createGetEarlyRepaymentSavingsDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetEarlyRepaymentSavingsDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardLineBurnDetails")
    public JAXBElement<CreditCard> createGetCardLineBurnDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardLineBurnDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardMPSOrderEnquiry")
    public JAXBElement<CreditCard> createGetCardMPSOrderEnquiry(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardMPSOrderEnquiry_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetOctopusCardDetails")
    public JAXBElement<CreditCard> createGetOctopusCardDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetOctopusCardDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetRelPricingCampaignDetail")
    public JAXBElement<CreditCard> createGetRelPricingCampaignDetail(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetRelPricingCampaignDetail_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardLineBurnTaxDetails")
    public JAXBElement<CreditCard> createGetCardLineBurnTaxDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardLineBurnTaxDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardPricingHistory")
    public JAXBElement<CreditCard> createGetCardPricingHistory(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardPricingHistory_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardTopUpHistory")
    public JAXBElement<CreditCard> createGetCardTopUpHistory(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardTopUpHistory_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardSummary")
    public JAXBElement<CreditCard> createGetCardSummary(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardSummary_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardSpendDetails")
    public JAXBElement<CreditCard> createGetCardSpendDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardSpendDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "EnquireCardStatus")
    public JAXBElement<CreditCard> createEnquireCardStatus(CreditCard value) {
        return new JAXBElement<CreditCard>(_EnquireCardStatus_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCustomerSummary")
    public JAXBElement<CreditCard> createGetCustomerSummary(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCustomerSummary_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetStatementSummary")
    public JAXBElement<CreditCard> createGetStatementSummary(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetStatementSummary_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "RedeemBonusPoints")
    public JAXBElement<CreditCard> createRedeemBonusPoints(CreditCard value) {
        return new JAXBElement<CreditCard>(_RedeemBonusPoints_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetTransactionHistory")
    public JAXBElement<CreditCard> createGetTransactionHistory(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetTransactionHistory_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetPointTransfer")
    public JAXBElement<CreditCard> createGetPointTransfer(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetPointTransfer_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetBalanceBucketsHistory")
    public JAXBElement<CreditCard> createGetBalanceBucketsHistory(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetBalanceBucketsHistory_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetTokenCardDetails")
    public JAXBElement<CreditCard> createGetTokenCardDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetTokenCardDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "UpdateTokenStatus")
    public JAXBElement<CreditCard> createUpdateTokenStatus(CreditCard value) {
        return new JAXBElement<CreditCard>(_UpdateTokenStatus_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "SynchronizeToken")
    public JAXBElement<CreditCard> createSynchronizeToken(CreditCard value) {
        return new JAXBElement<CreditCard>(_SynchronizeToken_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetCardActivationStatus")
    public JAXBElement<CreditCard> createGetCardActivationStatus(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetCardActivationStatus_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "RequestCreditLimitIncrease")
    public JAXBElement<CreditCard> createRequestCreditLimitIncrease(CreditCard value) {
        return new JAXBElement<CreditCard>(_RequestCreditLimitIncrease_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetAffinityDetails")
    public JAXBElement<CreditCard> createGetAffinityDetails(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetAffinityDetails_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetInstallmentPrgm")
    public JAXBElement<CreditCard> createGetInstallmentPrgm(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetInstallmentPrgm_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetPaymentHistory")
    public JAXBElement<CreditCard> createGetPaymentHistory(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetPaymentHistory_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetInstallmentplan")
    public JAXBElement<CreditCard> createGetInstallmentplan(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetInstallmentplan_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "GetOverlimitOptOutFlag")
    public JAXBElement<CreditCard> createGetOverlimitOptOutFlag(CreditCard value) {
        return new JAXBElement<CreditCard>(_GetOverlimitOptOutFlag_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "SegmentType")
    public JAXBElement<SegmentType> createSegmentType(SegmentType value) {
        return new JAXBElement<SegmentType>(_SegmentType_QNAME, SegmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArmType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "ArmType")
    public JAXBElement<ArmType> createArmType(ArmType value) {
        return new JAXBElement<ArmType>(_ArmType_QNAME, ArmType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "ServiceHeader")
    public JAXBElement<ServiceHeader> createServiceHeader(ServiceHeader value) {
        return new JAXBElement<ServiceHeader>(_ServiceHeader_QNAME, ServiceHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "userName", scope = UserNameToken.class)
    public JAXBElement<String> createUserNameTokenUserName(String value) {
        return new JAXBElement<String>(_UserNameTokenUserName_QNAME, String.class, UserNameToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "password", scope = UserNameToken.class)
    public JAXBElement<String> createUserNameTokenPassword(String value) {
        return new JAXBElement<String>(_UserNameTokenPassword_QNAME, String.class, UserNameToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "responseCode", scope = ServiceResponse.class)
    public JAXBElement<String> createServiceResponseResponseCode(String value) {
        return new JAXBElement<String>(_ServiceResponseResponseCode_QNAME, String.class, ServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "responseDescription", scope = ServiceResponse.class)
    public JAXBElement<String> createServiceResponseResponseDescription(String value) {
        return new JAXBElement<String>(_ServiceResponseResponseDescription_QNAME, String.class, ServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "hostSystem", scope = ServiceResponse.class)
    public JAXBElement<String> createServiceResponseHostSystem(String value) {
        return new JAXBElement<String>(_ServiceResponseHostSystem_QNAME, String.class, ServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "eMail1", scope = Contact.class)
    public JAXBElement<String> createContactEMail1(String value) {
        return new JAXBElement<String>(_ContactEMail1_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "eMail2", scope = Contact.class)
    public JAXBElement<CodeDesc> createContactEMail2(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_ContactEMail2_QNAME, CodeDesc.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "homePhone", scope = Contact.class)
    public JAXBElement<String> createContactHomePhone(String value) {
        return new JAXBElement<String>(_ContactHomePhone_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "mobile", scope = Contact.class)
    public JAXBElement<String> createContactMobile(String value) {
        return new JAXBElement<String>(_ContactMobile_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "office", scope = Contact.class)
    public JAXBElement<String> createContactOffice(String value) {
        return new JAXBElement<String>(_ContactOffice_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "officeExtn", scope = Contact.class)
    public JAXBElement<String> createContactOfficeExtn(String value) {
        return new JAXBElement<String>(_ContactOfficeExtn_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "wauFlag", scope = Address.class)
    public JAXBElement<String> createAddressWauFlag(String value) {
        return new JAXBElement<String>(_AddressWauFlag_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "addressType", scope = Address.class)
    public JAXBElement<CodeDesc> createAddressAddressType(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_AddressAddressType_QNAME, CodeDesc.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "mailingTitle1", scope = Address.class)
    public JAXBElement<String> createAddressMailingTitle1(String value) {
        return new JAXBElement<String>(_AddressMailingTitle1_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "mailingTitle2", scope = Address.class)
    public JAXBElement<String> createAddressMailingTitle2(String value) {
        return new JAXBElement<String>(_AddressMailingTitle2_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "attentionPartyName", scope = Address.class)
    public JAXBElement<String> createAddressAttentionPartyName(String value) {
        return new JAXBElement<String>(_AddressAttentionPartyName_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "addressLine1", scope = Address.class)
    public JAXBElement<String> createAddressAddressLine1(String value) {
        return new JAXBElement<String>(_AddressAddressLine1_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "addressLine2", scope = Address.class)
    public JAXBElement<String> createAddressAddressLine2(String value) {
        return new JAXBElement<String>(_AddressAddressLine2_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "addressLine3", scope = Address.class)
    public JAXBElement<String> createAddressAddressLine3(String value) {
        return new JAXBElement<String>(_AddressAddressLine3_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "addressLine4", scope = Address.class)
    public JAXBElement<String> createAddressAddressLine4(String value) {
        return new JAXBElement<String>(_AddressAddressLine4_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "city", scope = Address.class)
    public JAXBElement<CodeDesc> createAddressCity(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_AddressCity_QNAME, CodeDesc.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "state", scope = Address.class)
    public JAXBElement<String> createAddressState(String value) {
        return new JAXBElement<String>(_AddressState_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "postalCode", scope = Address.class)
    public JAXBElement<String> createAddressPostalCode(String value) {
        return new JAXBElement<String>(_AddressPostalCode_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "poBox", scope = Address.class)
    public JAXBElement<String> createAddressPoBox(String value) {
        return new JAXBElement<String>(_AddressPoBox_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "nearestLandmark", scope = Address.class)
    public JAXBElement<String> createAddressNearestLandmark(String value) {
        return new JAXBElement<String>(_AddressNearestLandmark_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "country", scope = Address.class)
    public JAXBElement<CodeDesc> createAddressCountry(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_AddressCountry_QNAME, CodeDesc.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "by", scope = MaintInfo.class)
    public JAXBElement<String> createMaintInfoBy(String value) {
        return new JAXBElement<String>(_MaintInfoBy_QNAME, String.class, MaintInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "date", scope = MaintInfo.class)
    public JAXBElement<String> createMaintInfoDate(String value) {
        return new JAXBElement<String>(_MaintInfoDate_QNAME, String.class, MaintInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "type", scope = TypeDesc.class)
    public JAXBElement<String> createTypeDescType(String value) {
        return new JAXBElement<String>(_TypeDescType_QNAME, String.class, TypeDesc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "desc", scope = TypeDesc.class)
    public JAXBElement<String> createTypeDescDesc(String value) {
        return new JAXBElement<String>(_TypeDescDesc_QNAME, String.class, TypeDesc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "code", scope = CodeDesc.class)
    public JAXBElement<String> createCodeDescCode(String value) {
        return new JAXBElement<String>(_CodeDescCode_QNAME, String.class, CodeDesc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "desc", scope = CodeDesc.class)
    public JAXBElement<String> createCodeDescDesc(String value) {
        return new JAXBElement<String>(_TypeDescDesc_QNAME, String.class, CodeDesc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "amt", scope = CurrAmount.class)
    public JAXBElement<String> createCurrAmountAmt(String value) {
        return new JAXBElement<String>(_CurrAmountAmt_QNAME, String.class, CurrAmount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "ccyCode", scope = CurrAmount.class)
    public JAXBElement<String> createCurrAmountCcyCode(String value) {
        return new JAXBElement<String>(_CurrAmountCcyCode_QNAME, String.class, CurrAmount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "ccyDesc", scope = CurrAmount.class)
    public JAXBElement<String> createCurrAmountCcyDesc(String value) {
        return new JAXBElement<String>(_CurrAmountCcyDesc_QNAME, String.class, CurrAmount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserNameToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "userNameToken", scope = ServiceHeader.class)
    public JAXBElement<UserNameToken> createServiceHeaderUserNameToken(UserNameToken value) {
        return new JAXBElement<UserNameToken>(_ServiceHeaderUserNameToken_QNAME, UserNameToken.class, ServiceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "consumerID", scope = ServiceHeader.class)
    public JAXBElement<String> createServiceHeaderConsumerID(String value) {
        return new JAXBElement<String>(_ServiceHeaderConsumerID_QNAME, String.class, ServiceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "consumerCountry", scope = ServiceHeader.class)
    public JAXBElement<String> createServiceHeaderConsumerCountry(String value) {
        return new JAXBElement<String>(_ServiceHeaderConsumerCountry_QNAME, String.class, ServiceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "serviceTimeStamp", scope = ServiceHeader.class)
    public JAXBElement<String> createServiceHeaderServiceTimeStamp(String value) {
        return new JAXBElement<String>(_ServiceHeaderServiceTimeStamp_QNAME, String.class, ServiceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "requestID", scope = ServiceHeader.class)
    public JAXBElement<String> createServiceHeaderRequestID(String value) {
        return new JAXBElement<String>(_ServiceHeaderRequestID_QNAME, String.class, ServiceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "targetFlag", scope = ServiceHeader.class)
    public JAXBElement<String> createServiceHeaderTargetFlag(String value) {
        return new JAXBElement<String>(_ServiceHeaderTargetFlag_QNAME, String.class, ServiceHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "armCode", scope = ArmType.class)
    public JAXBElement<String> createArmTypeArmCode(String value) {
        return new JAXBElement<String>(_ArmTypeArmCode_QNAME, String.class, ArmType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "armDesc", scope = ArmType.class)
    public JAXBElement<String> createArmTypeArmDesc(String value) {
        return new JAXBElement<String>(_ArmTypeArmDesc_QNAME, String.class, ArmType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "segmentCode", scope = SegmentType.class)
    public JAXBElement<String> createSegmentTypeSegmentCode(String value) {
        return new JAXBElement<String>(_SegmentTypeSegmentCode_QNAME, String.class, SegmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.service.common.scb", name = "segmentDesc", scope = SegmentType.class)
    public JAXBElement<String> createSegmentTypeSegmentDesc(String value) {
        return new JAXBElement<String>(_SegmentTypeSegmentDesc_QNAME, String.class, SegmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "installmentAmount", scope = MonthlyInstallmentDetails.class)
    public JAXBElement<String> createMonthlyInstallmentDetailsInstallmentAmount(String value) {
        return new JAXBElement<String>(_MonthlyInstallmentDetailsInstallmentAmount_QNAME, String.class, MonthlyInstallmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "installmentTenor", scope = MonthlyInstallmentDetails.class)
    public JAXBElement<String> createMonthlyInstallmentDetailsInstallmentTenor(String value) {
        return new JAXBElement<String>(_MonthlyInstallmentDetailsInstallmentTenor_QNAME, String.class, MonthlyInstallmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statementDate", scope = MonthlyInstallmentDetails.class)
    public JAXBElement<String> createMonthlyInstallmentDetailsStatementDate(String value) {
        return new JAXBElement<String>(_MonthlyInstallmentDetailsStatementDate_QNAME, String.class, MonthlyInstallmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "monthlyToDate", scope = MonthtoDateDetails.class)
    public JAXBElement<String> createMonthtoDateDetailsMonthlyToDate(String value) {
        return new JAXBElement<String>(_MonthtoDateDetailsMonthlyToDate_QNAME, String.class, MonthtoDateDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "notesDate", scope = NotesData.class)
    public JAXBElement<String> createNotesDataNotesDate(String value) {
        return new JAXBElement<String>(_NotesDataNotesDate_QNAME, String.class, NotesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "notesType", scope = NotesData.class)
    public JAXBElement<String> createNotesDataNotesType(String value) {
        return new JAXBElement<String>(_NotesDataNotesType_QNAME, String.class, NotesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "acctNotes", scope = NotesData.class)
    public JAXBElement<String> createNotesDataAcctNotes(String value) {
        return new JAXBElement<String>(_NotesDataAcctNotes_QNAME, String.class, NotesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "arrearsLevel", scope = NotesData.class)
    public JAXBElement<String> createNotesDataArrearsLevel(String value) {
        return new JAXBElement<String>(_NotesDataArrearsLevel_QNAME, String.class, NotesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "overrideCode", scope = NotesData.class)
    public JAXBElement<String> createNotesDataOverrideCode(String value) {
        return new JAXBElement<String>(_NotesDataOverrideCode_QNAME, String.class, NotesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "userID", scope = NotesData.class)
    public JAXBElement<String> createNotesDataUserID(String value) {
        return new JAXBElement<String>(_NotesDataUserID_QNAME, String.class, NotesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "notesStored", scope = Notes.class)
    public JAXBElement<String> createNotesNotesStored(String value) {
        return new JAXBElement<String>(_NotesNotesStored_QNAME, String.class, Notes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "acctNo", scope = PrimaryCard.class)
    public JAXBElement<String> createPrimaryCardAcctNo(String value) {
        return new JAXBElement<String>(_PrimaryCardAcctNo_QNAME, String.class, PrimaryCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "status", scope = PrimaryCard.class)
    public JAXBElement<String> createPrimaryCardStatus(String value) {
        return new JAXBElement<String>(_PrimaryCardStatus_QNAME, String.class, PrimaryCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currency", scope = PrimaryCard.class)
    public JAXBElement<String> createPrimaryCardCurrency(String value) {
        return new JAXBElement<String>(_PrimaryCardCurrency_QNAME, String.class, PrimaryCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "acctNo", scope = SubAcctDtl.class)
    public JAXBElement<String> createSubAcctDtlAcctNo(String value) {
        return new JAXBElement<String>(_PrimaryCardAcctNo_QNAME, String.class, SubAcctDtl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranGroup", scope = SubAcctDtl.class)
    public JAXBElement<String> createSubAcctDtlTranGroup(String value) {
        return new JAXBElement<String>(_SubAcctDtlTranGroup_QNAME, String.class, SubAcctDtl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "acctAgreement", scope = SubAcctDtl.class)
    public JAXBElement<String> createSubAcctDtlAcctAgreement(String value) {
        return new JAXBElement<String>(_SubAcctDtlAcctAgreement_QNAME, String.class, SubAcctDtl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "balance", scope = SubAcctDtl.class)
    public JAXBElement<String> createSubAcctDtlBalance(String value) {
        return new JAXBElement<String>(_SubAcctDtlBalance_QNAME, String.class, SubAcctDtl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "loanStartDt", scope = InstallmentPlan.class)
    public JAXBElement<String> createInstallmentPlanLoanStartDt(String value) {
        return new JAXBElement<String>(_InstallmentPlanLoanStartDt_QNAME, String.class, InstallmentPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalAmtLoanTaken", scope = InstallmentPlan.class)
    public JAXBElement<String> createInstallmentPlanTotalAmtLoanTaken(String value) {
        return new JAXBElement<String>(_InstallmentPlanTotalAmtLoanTaken_QNAME, String.class, InstallmentPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "intRateLoan", scope = InstallmentPlan.class)
    public JAXBElement<String> createInstallmentPlanIntRateLoan(String value) {
        return new JAXBElement<String>(_InstallmentPlanIntRateLoan_QNAME, String.class, InstallmentPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tenure", scope = InstallmentPlan.class)
    public JAXBElement<String> createInstallmentPlanTenure(String value) {
        return new JAXBElement<String>(_InstallmentPlanTenure_QNAME, String.class, InstallmentPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "fixedInst", scope = InstallmentPlan.class)
    public JAXBElement<String> createInstallmentPlanFixedInst(String value) {
        return new JAXBElement<String>(_InstallmentPlanFixedInst_QNAME, String.class, InstallmentPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "loanOutstandAmt", scope = InstallmentPlan.class)
    public JAXBElement<String> createInstallmentPlanLoanOutstandAmt(String value) {
        return new JAXBElement<String>(_InstallmentPlanLoanOutstandAmt_QNAME, String.class, InstallmentPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "period", scope = PaymentHistory.class)
    public JAXBElement<String> createPaymentHistoryPeriod(String value) {
        return new JAXBElement<String>(_PaymentHistoryPeriod_QNAME, String.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "purchase", scope = PaymentHistory.class)
    public JAXBElement<String> createPaymentHistoryPurchase(String value) {
        return new JAXBElement<String>(_PaymentHistoryPurchase_QNAME, String.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "payment", scope = PaymentHistory.class)
    public JAXBElement<String> createPaymentHistoryPayment(String value) {
        return new JAXBElement<String>(_PaymentHistoryPayment_QNAME, String.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "charges", scope = PaymentHistory.class)
    public JAXBElement<String> createPaymentHistoryCharges(String value) {
        return new JAXBElement<String>(_PaymentHistoryCharges_QNAME, String.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "balance", scope = PaymentHistory.class)
    public JAXBElement<String> createPaymentHistoryBalance(String value) {
        return new JAXBElement<String>(_SubAcctDtlBalance_QNAME, String.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "amtDue", scope = PaymentHistory.class)
    public JAXBElement<String> createPaymentHistoryAmtDue(String value) {
        return new JAXBElement<String>(_PaymentHistoryAmtDue_QNAME, String.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "status", scope = PaymentHistory.class)
    public JAXBElement<String> createPaymentHistoryStatus(String value) {
        return new JAXBElement<String>(_PrimaryCardStatus_QNAME, String.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "code", scope = PaymentHistory.class)
    public JAXBElement<String> createPaymentHistoryCode(String value) {
        return new JAXBElement<String>(_PaymentHistoryCode_QNAME, String.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardNo", scope = LinkedCards.class)
    public JAXBElement<String> createLinkedCardsCardNo(String value) {
        return new JAXBElement<String>(_LinkedCardsCardNo_QNAME, String.class, LinkedCards.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "embossedName", scope = LinkedCards.class)
    public JAXBElement<String> createLinkedCardsEmbossedName(String value) {
        return new JAXBElement<String>(_LinkedCardsEmbossedName_QNAME, String.class, LinkedCards.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardType", scope = LinkedCards.class)
    public JAXBElement<String> createLinkedCardsCardType(String value) {
        return new JAXBElement<String>(_LinkedCardsCardType_QNAME, String.class, LinkedCards.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardTypeDesc", scope = LinkedCards.class)
    public JAXBElement<String> createLinkedCardsCardTypeDesc(String value) {
        return new JAXBElement<String>(_LinkedCardsCardTypeDesc_QNAME, String.class, LinkedCards.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardExpDt", scope = LinkedCards.class)
    public JAXBElement<String> createLinkedCardsCardExpDt(String value) {
        return new JAXBElement<String>(_LinkedCardsCardExpDt_QNAME, String.class, LinkedCards.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardCcy", scope = LinkedCards.class)
    public JAXBElement<String> createLinkedCardsCardCcy(String value) {
        return new JAXBElement<String>(_LinkedCardsCardCcy_QNAME, String.class, LinkedCards.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "primeOverlimitValue", scope = PrimeOverlimit.class)
    public JAXBElement<String> createPrimeOverlimitPrimeOverlimitValue(String value) {
        return new JAXBElement<String>(_PrimeOverlimitPrimeOverlimitValue_QNAME, String.class, PrimeOverlimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "primeOverlimitDate", scope = PrimeOverlimit.class)
    public JAXBElement<String> createPrimeOverlimitPrimeOverlimitDate(String value) {
        return new JAXBElement<String>(_PrimeOverlimitPrimeOverlimitDate_QNAME, String.class, PrimeOverlimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "manhattanOverlimitValue", scope = ManhattanOverlimit.class)
    public JAXBElement<String> createManhattanOverlimitManhattanOverlimitValue(String value) {
        return new JAXBElement<String>(_ManhattanOverlimitManhattanOverlimitValue_QNAME, String.class, ManhattanOverlimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "manhattanOverlimitDate", scope = ManhattanOverlimit.class)
    public JAXBElement<String> createManhattanOverlimitManhattanOverlimitDate(String value) {
        return new JAXBElement<String>(_ManhattanOverlimitManhattanOverlimitDate_QNAME, String.class, ManhattanOverlimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "scbOverlimitValue", scope = SCBOverlimit.class)
    public JAXBElement<String> createSCBOverlimitScbOverlimitValue(String value) {
        return new JAXBElement<String>(_SCBOverlimitScbOverlimitValue_QNAME, String.class, SCBOverlimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "scbOverlimitDate", scope = SCBOverlimit.class)
    public JAXBElement<String> createSCBOverlimitScbOverlimitDate(String value) {
        return new JAXBElement<String>(_SCBOverlimitScbOverlimitDate_QNAME, String.class, SCBOverlimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfCards", scope = EmbossingDetails.class)
    public JAXBElement<String> createEmbossingDetailsNoOfCards(String value) {
        return new JAXBElement<String>(_EmbossingDetailsNoOfCards_QNAME, String.class, EmbossingDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "embossingName", scope = EmbossingDetails.class)
    public JAXBElement<String> createEmbossingDetailsEmbossingName(String value) {
        return new JAXBElement<String>(_EmbossingDetailsEmbossingName_QNAME, String.class, EmbossingDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardAction", scope = EmbossingDetails.class)
    public JAXBElement<String> createEmbossingDetailsCardAction(String value) {
        return new JAXBElement<String>(_EmbossingDetailsCardAction_QNAME, String.class, EmbossingDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noRequested", scope = EmbossingDetails.class)
    public JAXBElement<String> createEmbossingDetailsNoRequested(String value) {
        return new JAXBElement<String>(_EmbossingDetailsNoRequested_QNAME, String.class, EmbossingDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "supportOption", scope = EmbossingDetails.class)
    public JAXBElement<String> createEmbossingDetailsSupportOption(String value) {
        return new JAXBElement<String>(_EmbossingDetailsSupportOption_QNAME, String.class, EmbossingDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardFeature", scope = EmbossingDetails.class)
    public JAXBElement<String> createEmbossingDetailsCardFeature(String value) {
        return new JAXBElement<String>(_EmbossingDetailsCardFeature_QNAME, String.class, EmbossingDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfCardsIssued", scope = EmbossingDetails.class)
    public JAXBElement<String> createEmbossingDetailsNoOfCardsIssued(String value) {
        return new JAXBElement<String>(_EmbossingDetailsNoOfCardsIssued_QNAME, String.class, EmbossingDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfCardsReturned", scope = EmbossingDetails.class)
    public JAXBElement<String> createEmbossingDetailsNoOfCardsReturned(String value) {
        return new JAXBElement<String>(_EmbossingDetailsNoOfCardsReturned_QNAME, String.class, EmbossingDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rqstCardType", scope = EmbossingDetails.class)
    public JAXBElement<String> createEmbossingDetailsRqstCardType(String value) {
        return new JAXBElement<String>(_EmbossingDetailsRqstCardType_QNAME, String.class, EmbossingDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "previousAction", scope = EmbossingDetails.class)
    public JAXBElement<String> createEmbossingDetailsPreviousAction(String value) {
        return new JAXBElement<String>(_EmbossingDetailsPreviousAction_QNAME, String.class, EmbossingDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pinRecord", scope = EmbossingDetails.class)
    public JAXBElement<String> createEmbossingDetailsPinRecord(String value) {
        return new JAXBElement<String>(_EmbossingDetailsPinRecord_QNAME, String.class, EmbossingDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "serialNo", scope = TokenCardList.class)
    public JAXBElement<String> createTokenCardListSerialNo(String value) {
        return new JAXBElement<String>(_TokenCardListSerialNo_QNAME, String.class, TokenCardList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tokenStatus", scope = TokenCardList.class)
    public JAXBElement<String> createTokenCardListTokenStatus(String value) {
        return new JAXBElement<String>(_TokenCardListTokenStatus_QNAME, String.class, TokenCardList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardNo", scope = TokenCardList.class)
    public JAXBElement<String> createTokenCardListCardNo(String value) {
        return new JAXBElement<String>(_LinkedCardsCardNo_QNAME, String.class, TokenCardList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardType", scope = TokenCardList.class)
    public JAXBElement<String> createTokenCardListCardType(String value) {
        return new JAXBElement<String>(_LinkedCardsCardType_QNAME, String.class, TokenCardList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "organisationNo", scope = CardSummaryDtl.class)
    public JAXBElement<String> createCardSummaryDtlOrganisationNo(String value) {
        return new JAXBElement<String>(_CardSummaryDtlOrganisationNo_QNAME, String.class, CardSummaryDtl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custNo", scope = CardSummaryDtl.class)
    public JAXBElement<String> createCardSummaryDtlCustNo(String value) {
        return new JAXBElement<String>(_CardSummaryDtlCustNo_QNAME, String.class, CardSummaryDtl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custType", scope = CardSummaryDtl.class)
    public JAXBElement<String> createCardSummaryDtlCustType(String value) {
        return new JAXBElement<String>(_CardSummaryDtlCustType_QNAME, String.class, CardSummaryDtl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardNo", scope = CardSummaryDtl.class)
    public JAXBElement<String> createCardSummaryDtlCardNo(String value) {
        return new JAXBElement<String>(_LinkedCardsCardNo_QNAME, String.class, CardSummaryDtl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blockCode", scope = CardSummaryDtl.class)
    public JAXBElement<String> createCardSummaryDtlBlockCode(String value) {
        return new JAXBElement<String>(_CardSummaryDtlBlockCode_QNAME, String.class, CardSummaryDtl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prefMerchant", scope = EarnDetails.class)
    public JAXBElement<String> createEarnDetailsPrefMerchant(String value) {
        return new JAXBElement<String>(_EarnDetailsPrefMerchant_QNAME, String.class, EarnDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "capReachDtOverall", scope = EarnDetails.class)
    public JAXBElement<String> createEarnDetailsCapReachDtOverall(String value) {
        return new JAXBElement<String>(_EarnDetailsCapReachDtOverall_QNAME, String.class, EarnDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "capReachDtatPrefMerchant", scope = EarnDetails.class)
    public JAXBElement<String> createEarnDetailsCapReachDtatPrefMerchant(String value) {
        return new JAXBElement<String>(_EarnDetailsCapReachDtatPrefMerchant_QNAME, String.class, EarnDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointEarnedToday", scope = EarnDetails.class)
    public JAXBElement<String> createEarnDetailsPointEarnedToday(String value) {
        return new JAXBElement<String>(_EarnDetailsPointEarnedToday_QNAME, String.class, EarnDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "MPSAcctNo", scope = TopupHistory.class)
    public JAXBElement<String> createTopupHistoryMPSAcctNo(String value) {
        return new JAXBElement<String>(_TopupHistoryMPSAcctNo_QNAME, String.class, TopupHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "programCode", scope = TopupHistory.class)
    public JAXBElement<String> createTopupHistoryProgramCode(String value) {
        return new JAXBElement<String>(_TopupHistoryProgramCode_QNAME, String.class, TopupHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "programDesc", scope = TopupHistory.class)
    public JAXBElement<String> createTopupHistoryProgramDesc(String value) {
        return new JAXBElement<String>(_TopupHistoryProgramDesc_QNAME, String.class, TopupHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productCode", scope = TopupHistory.class)
    public JAXBElement<String> createTopupHistoryProductCode(String value) {
        return new JAXBElement<String>(_TopupHistoryProductCode_QNAME, String.class, TopupHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productDesc", scope = TopupHistory.class)
    public JAXBElement<String> createTopupHistoryProductDesc(String value) {
        return new JAXBElement<String>(_TopupHistoryProductDesc_QNAME, String.class, TopupHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "sequenceNo", scope = TopupHistory.class)
    public JAXBElement<String> createTopupHistorySequenceNo(String value) {
        return new JAXBElement<String>(_TopupHistorySequenceNo_QNAME, String.class, TopupHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "effectiveRate", scope = TopupHistory.class)
    public JAXBElement<String> createTopupHistoryEffectiveRate(String value) {
        return new JAXBElement<String>(_TopupHistoryEffectiveRate_QNAME, String.class, TopupHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "flatRate", scope = TopupHistory.class)
    public JAXBElement<String> createTopupHistoryFlatRate(String value) {
        return new JAXBElement<String>(_TopupHistoryFlatRate_QNAME, String.class, TopupHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "remainingInstallment", scope = TopupHistory.class)
    public JAXBElement<String> createTopupHistoryRemainingInstallment(String value) {
        return new JAXBElement<String>(_TopupHistoryRemainingInstallment_QNAME, String.class, TopupHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "outstandingBal", scope = TopupHistory.class)
    public JAXBElement<String> createTopupHistoryOutstandingBal(String value) {
        return new JAXBElement<String>(_TopupHistoryOutstandingBal_QNAME, String.class, TopupHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "effectiveIntRate", scope = PricingHistory.class)
    public JAXBElement<String> createPricingHistoryEffectiveIntRate(String value) {
        return new JAXBElement<String>(_PricingHistoryEffectiveIntRate_QNAME, String.class, PricingHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "flatIntRate", scope = PricingHistory.class)
    public JAXBElement<String> createPricingHistoryFlatIntRate(String value) {
        return new JAXBElement<String>(_PricingHistoryFlatIntRate_QNAME, String.class, PricingHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currentInstallmentAmt", scope = PricingHistory.class)
    public JAXBElement<String> createPricingHistoryCurrentInstallmentAmt(String value) {
        return new JAXBElement<String>(_PricingHistoryCurrentInstallmentAmt_QNAME, String.class, PricingHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "newTenor", scope = PricingHistory.class)
    public JAXBElement<String> createPricingHistoryNewTenor(String value) {
        return new JAXBElement<String>(_PricingHistoryNewTenor_QNAME, String.class, PricingHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "effectiveDate", scope = PricingHistory.class)
    public JAXBElement<String> createPricingHistoryEffectiveDate(String value) {
        return new JAXBElement<String>(_PricingHistoryEffectiveDate_QNAME, String.class, PricingHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "criteria", scope = PricingHistory.class)
    public JAXBElement<String> createPricingHistoryCriteria(String value) {
        return new JAXBElement<String>(_PricingHistoryCriteria_QNAME, String.class, PricingHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "orderNo", scope = RedemptionProduct.class)
    public JAXBElement<String> createRedemptionProductOrderNo(String value) {
        return new JAXBElement<String>(_RedemptionProductOrderNo_QNAME, String.class, RedemptionProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "orderDate", scope = RedemptionProduct.class)
    public JAXBElement<String> createRedemptionProductOrderDate(String value) {
        return new JAXBElement<String>(_RedemptionProductOrderDate_QNAME, String.class, RedemptionProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productCode", scope = RedemptionProduct.class)
    public JAXBElement<String> createRedemptionProductProductCode(String value) {
        return new JAXBElement<String>(_TopupHistoryProductCode_QNAME, String.class, RedemptionProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productName", scope = RedemptionProduct.class)
    public JAXBElement<String> createRedemptionProductProductName(String value) {
        return new JAXBElement<String>(_RedemptionProductProductName_QNAME, String.class, RedemptionProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productNo", scope = RedemptionProduct.class)
    public JAXBElement<String> createRedemptionProductProductNo(String value) {
        return new JAXBElement<String>(_RedemptionProductProductNo_QNAME, String.class, RedemptionProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "leadingBank", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsLeadingBank(String value) {
        return new JAXBElement<String>(_IDRPDtlsLeadingBank_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "bankName", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsBankName(String value) {
        return new JAXBElement<String>(_IDRPDtlsBankName_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "fileDate", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsFileDate(String value) {
        return new JAXBElement<String>(_IDRPDtlsFileDate_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "applicationDate", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsApplicationDate(String value) {
        return new JAXBElement<String>(_IDRPDtlsApplicationDate_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "remarks", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsRemarks(String value) {
        return new JAXBElement<String>(_IDRPDtlsRemarks_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tenure", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsTenure(String value) {
        return new JAXBElement<String>(_InstallmentPlanTenure_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "interestRate", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsInterestRate(String value) {
        return new JAXBElement<String>(_IDRPDtlsInterestRate_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "monthlyRepaymentAmt", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsMonthlyRepaymentAmt(String value) {
        return new JAXBElement<String>(_IDRPDtlsMonthlyRepaymentAmt_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "agreementSignedRtndDate", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsAgreementSignedRtndDate(String value) {
        return new JAXBElement<String>(_IDRPDtlsAgreementSignedRtndDate_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "approvedDate", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsApprovedDate(String value) {
        return new JAXBElement<String>(_IDRPDtlsApprovedDate_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "firstInstallmentDate", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsFirstInstallmentDate(String value) {
        return new JAXBElement<String>(_IDRPDtlsFirstInstallmentDate_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "destroyedConnaughtDay", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsDestroyedConnaughtDay(String value) {
        return new JAXBElement<String>(_IDRPDtlsDestroyedConnaughtDay_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "IDRPNumber", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsIDRPNumber(String value) {
        return new JAXBElement<String>(_IDRPDtlsIDRPNumber_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "home", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsHome(String value) {
        return new JAXBElement<String>(_IDRPDtlsHome_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "homeDesc", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsHomeDesc(String value) {
        return new JAXBElement<String>(_IDRPDtlsHomeDesc_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "agreementReceived", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsAgreementReceived(String value) {
        return new JAXBElement<String>(_IDRPDtlsAgreementReceived_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "agreementReceivedDesc", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsAgreementReceivedDesc(String value) {
        return new JAXBElement<String>(_IDRPDtlsAgreementReceivedDesc_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mobile", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsMobile(String value) {
        return new JAXBElement<String>(_IDRPDtlsMobile_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "office", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsOffice(String value) {
        return new JAXBElement<String>(_IDRPDtlsOffice_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "customerStatus", scope = IDRPDtls.class)
    public JAXBElement<String> createIDRPDtlsCustomerStatus(String value) {
        return new JAXBElement<String>(_IDRPDtlsCustomerStatus_QNAME, String.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CCAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "Address", scope = IDRPDtls.class)
    public JAXBElement<CCAddress> createIDRPDtlsAddress(CCAddress value) {
        return new JAXBElement<CCAddress>(_IDRPDtlsAddress_QNAME, CCAddress.class, IDRPDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "priorityPassHolderName", scope = PriorityPassDetail.class)
    public JAXBElement<String> createPriorityPassDetailPriorityPassHolderName(String value) {
        return new JAXBElement<String>(_PriorityPassDetailPriorityPassHolderName_QNAME, String.class, PriorityPassDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "priorityPassNo", scope = PriorityPassDetail.class)
    public JAXBElement<String> createPriorityPassDetailPriorityPassNo(String value) {
        return new JAXBElement<String>(_PriorityPassDetailPriorityPassNo_QNAME, String.class, PriorityPassDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "expiryDate", scope = PriorityPassDetail.class)
    public JAXBElement<String> createPriorityPassDetailExpiryDate(String value) {
        return new JAXBElement<String>(_PriorityPassDetailExpiryDate_QNAME, String.class, PriorityPassDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastMaintainedDate", scope = PriorityPassDetail.class)
    public JAXBElement<String> createPriorityPassDetailLastMaintainedDate(String value) {
        return new JAXBElement<String>(_PriorityPassDetailLastMaintainedDate_QNAME, String.class, PriorityPassDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "oldPriorityPassNo", scope = PriorityPassDetail.class)
    public JAXBElement<String> createPriorityPassDetailOldPriorityPassNo(String value) {
        return new JAXBElement<String>(_PriorityPassDetailOldPriorityPassNo_QNAME, String.class, PriorityPassDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noofTimesCardIssued", scope = PriorityPassDetail.class)
    public JAXBElement<String> createPriorityPassDetailNoofTimesCardIssued(String value) {
        return new JAXBElement<String>(_PriorityPassDetailNoofTimesCardIssued_QNAME, String.class, PriorityPassDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditCardNo", scope = PriorityPassDetail.class)
    public JAXBElement<String> createPriorityPassDetailCreditCardNo(String value) {
        return new JAXBElement<String>(_PriorityPassDetailCreditCardNo_QNAME, String.class, PriorityPassDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "loungeVisitOwn", scope = PriorityPassDetail.class)
    public JAXBElement<String> createPriorityPassDetailLoungeVisitOwn(String value) {
        return new JAXBElement<String>(_PriorityPassDetailLoungeVisitOwn_QNAME, String.class, PriorityPassDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "loungeVisitGuest", scope = PriorityPassDetail.class)
    public JAXBElement<String> createPriorityPassDetailLoungeVisitGuest(String value) {
        return new JAXBElement<String>(_PriorityPassDetailLoungeVisitGuest_QNAME, String.class, PriorityPassDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mobileNo", scope = SMSAlerts.class)
    public JAXBElement<String> createSMSAlertsMobileNo(String value) {
        return new JAXBElement<String>(_SMSAlertsMobileNo_QNAME, String.class, SMSAlerts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "alertLastUpdatedDate", scope = SMSAlerts.class)
    public JAXBElement<String> createSMSAlertsAlertLastUpdatedDate(String value) {
        return new JAXBElement<String>(_SMSAlertsAlertLastUpdatedDate_QNAME, String.class, SMSAlerts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "alertLastUpdatedTime", scope = SMSAlerts.class)
    public JAXBElement<String> createSMSAlertsAlertLastUpdatedTime(String value) {
        return new JAXBElement<String>(_SMSAlertsAlertLastUpdatedTime_QNAME, String.class, SMSAlerts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "alertFlag", scope = SMSAlerts.class)
    public JAXBElement<String> createSMSAlertsAlertFlag(String value) {
        return new JAXBElement<String>(_SMSAlertsAlertFlag_QNAME, String.class, SMSAlerts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "alertRangeFrom", scope = SMSAlerts.class)
    public JAXBElement<String> createSMSAlertsAlertRangeFrom(String value) {
        return new JAXBElement<String>(_SMSAlertsAlertRangeFrom_QNAME, String.class, SMSAlerts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "alertRangeTo", scope = SMSAlerts.class)
    public JAXBElement<String> createSMSAlertsAlertRangeTo(String value) {
        return new JAXBElement<String>(_SMSAlertsAlertRangeTo_QNAME, String.class, SMSAlerts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "accountNo", scope = AirportParking.class)
    public JAXBElement<String> createAirportParkingAccountNo(String value) {
        return new JAXBElement<String>(_AirportParkingAccountNo_QNAME, String.class, AirportParking.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "startDate", scope = AirportParking.class)
    public JAXBElement<String> createAirportParkingStartDate(String value) {
        return new JAXBElement<String>(_AirportParkingStartDate_QNAME, String.class, AirportParking.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "dueDate", scope = AirportParking.class)
    public JAXBElement<String> createAirportParkingDueDate(String value) {
        return new JAXBElement<String>(_AirportParkingDueDate_QNAME, String.class, AirportParking.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "carNBR", scope = AirportParking.class)
    public JAXBElement<String> createAirportParkingCarNBR(String value) {
        return new JAXBElement<String>(_AirportParkingCarNBR_QNAME, String.class, AirportParking.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "shopID", scope = AirportParking.class)
    public JAXBElement<String> createAirportParkingShopID(String value) {
        return new JAXBElement<String>(_AirportParkingShopID_QNAME, String.class, AirportParking.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "feeAmt", scope = AirportParking.class)
    public JAXBElement<String> createAirportParkingFeeAmt(String value) {
        return new JAXBElement<String>(_AirportParkingFeeAmt_QNAME, String.class, AirportParking.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfDays", scope = AirportParking.class)
    public JAXBElement<String> createAirportParkingNoOfDays(String value) {
        return new JAXBElement<String>(_AirportParkingNoOfDays_QNAME, String.class, AirportParking.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "accessNBR", scope = VIPUsageTransactions.class)
    public JAXBElement<String> createVIPUsageTransactionsAccessNBR(String value) {
        return new JAXBElement<String>(_VIPUsageTransactionsAccessNBR_QNAME, String.class, VIPUsageTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "VIPLounge", scope = VIPUsageTransactions.class)
    public JAXBElement<String> createVIPUsageTransactionsVIPLounge(String value) {
        return new JAXBElement<String>(_VIPUsageTransactionsVIPLounge_QNAME, String.class, VIPUsageTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "country", scope = VIPUsageTransactions.class)
    public JAXBElement<String> createVIPUsageTransactionsCountry(String value) {
        return new JAXBElement<String>(_VIPUsageTransactionsCountry_QNAME, String.class, VIPUsageTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionDate", scope = VIPUsageTransactions.class)
    public JAXBElement<String> createVIPUsageTransactionsTransactionDate(String value) {
        return new JAXBElement<String>(_VIPUsageTransactionsTransactionDate_QNAME, String.class, VIPUsageTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionAmt", scope = VIPUsageTransactions.class)
    public JAXBElement<String> createVIPUsageTransactionsTransactionAmt(String value) {
        return new JAXBElement<String>(_VIPUsageTransactionsTransactionAmt_QNAME, String.class, VIPUsageTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "postDate", scope = VIPUsageTransactions.class)
    public JAXBElement<String> createVIPUsageTransactionsPostDate(String value) {
        return new JAXBElement<String>(_VIPUsageTransactionsPostDate_QNAME, String.class, VIPUsageTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfCharged", scope = VIPUsageTransactions.class)
    public JAXBElement<String> createVIPUsageTransactionsNoOfCharged(String value) {
        return new JAXBElement<String>(_VIPUsageTransactionsNoOfCharged_QNAME, String.class, VIPUsageTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfVisitors", scope = VIPUsageTransactions.class)
    public JAXBElement<String> createVIPUsageTransactionsNoOfVisitors(String value) {
        return new JAXBElement<String>(_VIPUsageTransactionsNoOfVisitors_QNAME, String.class, VIPUsageTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "reference", scope = VIPUsageTransactions.class)
    public JAXBElement<String> createVIPUsageTransactionsReference(String value) {
        return new JAXBElement<String>(_VIPUsageTransactionsReference_QNAME, String.class, VIPUsageTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "bank", scope = CallInTxns.class)
    public JAXBElement<String> createCallInTxnsBank(String value) {
        return new JAXBElement<String>(_CallInTxnsBank_QNAME, String.class, CallInTxns.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "branch", scope = CallInTxns.class)
    public JAXBElement<String> createCallInTxnsBranch(String value) {
        return new JAXBElement<String>(_CallInTxnsBranch_QNAME, String.class, CallInTxns.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "accountNumber", scope = CallInTxns.class)
    public JAXBElement<String> createCallInTxnsAccountNumber(String value) {
        return new JAXBElement<String>(_CallInTxnsAccountNumber_QNAME, String.class, CallInTxns.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "accountType", scope = CallInTxns.class)
    public JAXBElement<String> createCallInTxnsAccountType(String value) {
        return new JAXBElement<String>(_CallInTxnsAccountType_QNAME, String.class, CallInTxns.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "PLCCardNumer", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsPLCCardNumer(String value) {
        return new JAXBElement<String>(_PLCCardDetailsPLCCardNumer_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productType", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsProductType(String value) {
        return new JAXBElement<String>(_PLCCardDetailsProductType_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "authorizationCode", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsAuthorizationCode(String value) {
        return new JAXBElement<String>(_PLCCardDetailsAuthorizationCode_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "channel", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsChannel(String value) {
        return new JAXBElement<String>(_PLCCardDetailsChannel_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "amountApplied", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsAmountApplied(String value) {
        return new JAXBElement<String>(_PLCCardDetailsAmountApplied_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "remittance", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsRemittance(String value) {
        return new JAXBElement<String>(_PLCCardDetailsRemittance_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "applicationNo", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsApplicationNo(String value) {
        return new JAXBElement<String>(_PLCCardDetailsApplicationNo_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "applicationDate", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsApplicationDate(String value) {
        return new JAXBElement<String>(_IDRPDtlsApplicationDate_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transmissionDate", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsTransmissionDate(String value) {
        return new JAXBElement<String>(_PLCCardDetailsTransmissionDate_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "batchNo", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsBatchNo(String value) {
        return new JAXBElement<String>(_PLCCardDetailsBatchNo_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "remittanceAmt", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsRemittanceAmt(String value) {
        return new JAXBElement<String>(_PLCCardDetailsRemittanceAmt_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tenure", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsTenure(String value) {
        return new JAXBElement<String>(_InstallmentPlanTenure_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "remittanceDate", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsRemittanceDate(String value) {
        return new JAXBElement<String>(_PLCCardDetailsRemittanceDate_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "feeCode", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsFeeCode(String value) {
        return new JAXBElement<String>(_PLCCardDetailsFeeCode_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paymentMode", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsPaymentMode(String value) {
        return new JAXBElement<String>(_PLCCardDetailsPaymentMode_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastBilledNo", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsLastBilledNo(String value) {
        return new JAXBElement<String>(_PLCCardDetailsLastBilledNo_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastBilledAmt", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsLastBilledAmt(String value) {
        return new JAXBElement<String>(_PLCCardDetailsLastBilledAmt_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastBilledDt", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsLastBilledDt(String value) {
        return new JAXBElement<String>(_PLCCardDetailsLastBilledDt_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "intAmt", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsIntAmt(String value) {
        return new JAXBElement<String>(_PLCCardDetailsIntAmt_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "instPeriod", scope = PLCCardDetails.class)
    public JAXBElement<String> createPLCCardDetailsInstPeriod(String value) {
        return new JAXBElement<String>(_PLCCardDetailsInstPeriod_QNAME, String.class, PLCCardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "membershipNumer", scope = AirlineMembership.class)
    public JAXBElement<String> createAirlineMembershipMembershipNumer(String value) {
        return new JAXBElement<String>(_AirlineMembershipMembershipNumer_QNAME, String.class, AirlineMembership.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "airlineCode", scope = AirlineMembership.class)
    public JAXBElement<String> createAirlineMembershipAirlineCode(String value) {
        return new JAXBElement<String>(_AirlineMembershipAirlineCode_QNAME, String.class, AirlineMembership.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "airlineCodeDesc", scope = AirlineMembership.class)
    public JAXBElement<String> createAirlineMembershipAirlineCodeDesc(String value) {
        return new JAXBElement<String>(_AirlineMembershipAirlineCodeDesc_QNAME, String.class, AirlineMembership.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "familyName", scope = AirlineMembership.class)
    public JAXBElement<String> createAirlineMembershipFamilyName(String value) {
        return new JAXBElement<String>(_AirlineMembershipFamilyName_QNAME, String.class, AirlineMembership.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "givenName", scope = AirlineMembership.class)
    public JAXBElement<String> createAirlineMembershipGivenName(String value) {
        return new JAXBElement<String>(_AirlineMembershipGivenName_QNAME, String.class, AirlineMembership.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "customerNumer", scope = SupplementaryCardholderDetails.class)
    public JAXBElement<String> createSupplementaryCardholderDetailsCustomerNumer(String value) {
        return new JAXBElement<String>(_SupplementaryCardholderDetailsCustomerNumer_QNAME, String.class, SupplementaryCardholderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "dateOfBirth", scope = SupplementaryCardholderDetails.class)
    public JAXBElement<String> createSupplementaryCardholderDetailsDateOfBirth(String value) {
        return new JAXBElement<String>(_SupplementaryCardholderDetailsDateOfBirth_QNAME, String.class, SupplementaryCardholderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "additionalInformation", scope = PastTransactions.class)
    public JAXBElement<String> createPastTransactionsAdditionalInformation(String value) {
        return new JAXBElement<String>(_PastTransactionsAdditionalInformation_QNAME, String.class, PastTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionAmount", scope = PastTransactions.class)
    public JAXBElement<String> createPastTransactionsTransactionAmount(String value) {
        return new JAXBElement<String>(_PastTransactionsTransactionAmount_QNAME, String.class, PastTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardHolderBillingAmount", scope = PastTransactions.class)
    public JAXBElement<String> createPastTransactionsCardHolderBillingAmount(String value) {
        return new JAXBElement<String>(_PastTransactionsCardHolderBillingAmount_QNAME, String.class, PastTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "posMode", scope = PastTransactions.class)
    public JAXBElement<String> createPastTransactionsPosMode(String value) {
        return new JAXBElement<String>(_PastTransactionsPosMode_QNAME, String.class, PastTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "date", scope = PastTransactions.class)
    public JAXBElement<String> createPastTransactionsDate(String value) {
        return new JAXBElement<String>(_PastTransactionsDate_QNAME, String.class, PastTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "requestType", scope = PastTransactions.class)
    public JAXBElement<String> createPastTransactionsRequestType(String value) {
        return new JAXBElement<String>(_PastTransactionsRequestType_QNAME, String.class, PastTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "merchantCode", scope = PastTransactions.class)
    public JAXBElement<String> createPastTransactionsMerchantCode(String value) {
        return new JAXBElement<String>(_PastTransactionsMerchantCode_QNAME, String.class, PastTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "merchantDesc", scope = PastTransactions.class)
    public JAXBElement<String> createPastTransactionsMerchantDesc(String value) {
        return new JAXBElement<String>(_PastTransactionsMerchantDesc_QNAME, String.class, PastTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "country", scope = PastTransactions.class)
    public JAXBElement<String> createPastTransactionsCountry(String value) {
        return new JAXBElement<String>(_VIPUsageTransactionsCountry_QNAME, String.class, PastTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "response", scope = PastTransactions.class)
    public JAXBElement<String> createPastTransactionsResponse(String value) {
        return new JAXBElement<String>(_PastTransactionsResponse_QNAME, String.class, PastTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "responseCode", scope = PastTransactions.class)
    public JAXBElement<String> createPastTransactionsResponseCode(String value) {
        return new JAXBElement<String>(_PastTransactionsResponseCode_QNAME, String.class, PastTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "BINICACode", scope = PastTransactions.class)
    public JAXBElement<String> createPastTransactionsBINICACode(String value) {
        return new JAXBElement<String>(_PastTransactionsBINICACode_QNAME, String.class, PastTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "NCCC", scope = PastTransactions.class)
    public JAXBElement<String> createPastTransactionsNCCC(String value) {
        return new JAXBElement<String>(_PastTransactionsNCCC_QNAME, String.class, PastTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "termType", scope = PastTransactions.class)
    public JAXBElement<String> createPastTransactionsTermType(String value) {
        return new JAXBElement<String>(_PastTransactionsTermType_QNAME, String.class, PastTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "MCC", scope = PastTransactions.class)
    public JAXBElement<String> createPastTransactionsMCC(String value) {
        return new JAXBElement<String>(_PastTransactionsMCC_QNAME, String.class, PastTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blockCode", scope = BlockDetail.class)
    public JAXBElement<String> createBlockDetailBlockCode(String value) {
        return new JAXBElement<String>(_CardSummaryDtlBlockCode_QNAME, String.class, BlockDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blockCodeDesc", scope = BlockDetail.class)
    public JAXBElement<String> createBlockDetailBlockCodeDesc(String value) {
        return new JAXBElement<String>(_BlockDetailBlockCodeDesc_QNAME, String.class, BlockDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "purgeDate", scope = PurgeDetails.class)
    public JAXBElement<String> createPurgeDetailsPurgeDate(String value) {
        return new JAXBElement<String>(_PurgeDetailsPurgeDate_QNAME, String.class, PurgeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditCardNumber", scope = PurgeDetails.class)
    public JAXBElement<String> createPurgeDetailsCreditCardNumber(String value) {
        return new JAXBElement<String>(_PurgeDetailsCreditCardNumber_QNAME, String.class, PurgeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blockCode", scope = PurgeDetails.class)
    public JAXBElement<String> createPurgeDetailsBlockCode(String value) {
        return new JAXBElement<String>(_CardSummaryDtlBlockCode_QNAME, String.class, PurgeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blockCodeDesc", scope = PurgeDetails.class)
    public JAXBElement<String> createPurgeDetailsBlockCodeDesc(String value) {
        return new JAXBElement<String>(_BlockDetailBlockCodeDesc_QNAME, String.class, PurgeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blockDate", scope = PurgeDetails.class)
    public JAXBElement<String> createPurgeDetailsBlockDate(String value) {
        return new JAXBElement<String>(_PurgeDetailsBlockDate_QNAME, String.class, PurgeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "openDate", scope = PurgeDetails.class)
    public JAXBElement<String> createPurgeDetailsOpenDate(String value) {
        return new JAXBElement<String>(_PurgeDetailsOpenDate_QNAME, String.class, PurgeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "expiryDate", scope = PurgeDetails.class)
    public JAXBElement<String> createPurgeDetailsExpiryDate(String value) {
        return new JAXBElement<String>(_PriorityPassDetailExpiryDate_QNAME, String.class, PurgeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastPaymentDate", scope = PurgeDetails.class)
    public JAXBElement<String> createPurgeDetailsLastPaymentDate(String value) {
        return new JAXBElement<String>(_PurgeDetailsLastPaymentDate_QNAME, String.class, PurgeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditLimit", scope = PurgeDetails.class)
    public JAXBElement<String> createPurgeDetailsCreditLimit(String value) {
        return new JAXBElement<String>(_PurgeDetailsCreditLimit_QNAME, String.class, PurgeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "accumulatedSTDDollars", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryAccumulatedSTDDollars(String value) {
        return new JAXBElement<String>(_StatementHistoryAccumulatedSTDDollars_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "agingCode", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryAgingCode(String value) {
        return new JAXBElement<String>(_StatementHistoryAgingCode_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "agingCodeDesc", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryAgingCodeDesc(String value) {
        return new JAXBElement<String>(_StatementHistoryAgingCodeDesc_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "balance", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryBalance(String value) {
        return new JAXBElement<String>(_SubAcctDtlBalance_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashAdvance", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryCashAdvance(String value) {
        return new JAXBElement<String>(_StatementHistoryCashAdvance_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashInterest", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryCashInterest(String value) {
        return new JAXBElement<String>(_StatementHistoryCashInterest_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashOnly", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryCashOnly(String value) {
        return new JAXBElement<String>(_StatementHistoryCashOnly_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditLimit", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryCreditLimit(String value) {
        return new JAXBElement<String>(_PurgeDetailsCreditLimit_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "financeCharges", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryFinanceCharges(String value) {
        return new JAXBElement<String>(_StatementHistoryFinanceCharges_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "minPayment", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryMinPayment(String value) {
        return new JAXBElement<String>(_StatementHistoryMinPayment_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "otherFeeCharges", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryOtherFeeCharges(String value) {
        return new JAXBElement<String>(_StatementHistoryOtherFeeCharges_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "payment", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryPayment(String value) {
        return new JAXBElement<String>(_PaymentHistoryPayment_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "purchase", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryPurchase(String value) {
        return new JAXBElement<String>(_PaymentHistoryPurchase_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailInterest", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryRetailInterest(String value) {
        return new JAXBElement<String>(_StatementHistoryRetailInterest_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailOnly", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryRetailOnly(String value) {
        return new JAXBElement<String>(_StatementHistoryRetailOnly_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statementDate", scope = StatementHistory.class)
    public JAXBElement<String> createStatementHistoryStatementDate(String value) {
        return new JAXBElement<String>(_MonthlyInstallmentDetailsStatementDate_QNAME, String.class, StatementHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastModifiedDate", scope = StatusHistory.class)
    public JAXBElement<String> createStatusHistoryLastModifiedDate(String value) {
        return new JAXBElement<String>(_StatusHistoryLastModifiedDate_QNAME, String.class, StatusHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "status", scope = StatusHistory.class)
    public JAXBElement<String> createStatusHistoryStatus(String value) {
        return new JAXBElement<String>(_PrimaryCardStatus_QNAME, String.class, StatusHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statusDesc", scope = StatusHistory.class)
    public JAXBElement<String> createStatusHistoryStatusDesc(String value) {
        return new JAXBElement<String>(_StatusHistoryStatusDesc_QNAME, String.class, StatusHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nonDeliveryReason", scope = StatusHistory.class)
    public JAXBElement<String> createStatusHistoryNonDeliveryReason(String value) {
        return new JAXBElement<String>(_StatusHistoryNonDeliveryReason_QNAME, String.class, StatusHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nonDeliveryReasonDesc", scope = StatusHistory.class)
    public JAXBElement<String> createStatusHistoryNonDeliveryReasonDesc(String value) {
        return new JAXBElement<String>(_StatusHistoryNonDeliveryReasonDesc_QNAME, String.class, StatusHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "NCCCMerchantNo", scope = MerchantDetail.class)
    public JAXBElement<String> createMerchantDetailNCCCMerchantNo(String value) {
        return new JAXBElement<String>(_MerchantDetailNCCCMerchantNo_QNAME, String.class, MerchantDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "merchantName", scope = MerchantDetail.class)
    public JAXBElement<String> createMerchantDetailMerchantName(String value) {
        return new JAXBElement<String>(_MerchantDetailMerchantName_QNAME, String.class, MerchantDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "MCCCode", scope = MerchantDetail.class)
    public JAXBElement<String> createMerchantDetailMCCCode(String value) {
        return new JAXBElement<String>(_MerchantDetailMCCCode_QNAME, String.class, MerchantDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "SCBMerchantNo", scope = MerchantDetail.class)
    public JAXBElement<String> createMerchantDetailSCBMerchantNo(String value) {
        return new JAXBElement<String>(_MerchantDetailSCBMerchantNo_QNAME, String.class, MerchantDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "status", scope = MerchantDetail.class)
    public JAXBElement<String> createMerchantDetailStatus(String value) {
        return new JAXBElement<String>(_PrimaryCardStatus_QNAME, String.class, MerchantDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "authId", scope = Redemption.class)
    public JAXBElement<String> createRedemptionAuthId(String value) {
        return new JAXBElement<String>(_RedemptionAuthId_QNAME, String.class, Redemption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "reqId", scope = Redemption.class)
    public JAXBElement<String> createRedemptionReqId(String value) {
        return new JAXBElement<String>(_RedemptionReqId_QNAME, String.class, Redemption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "reqType", scope = Redemption.class)
    public JAXBElement<String> createRedemptionReqType(String value) {
        return new JAXBElement<String>(_RedemptionReqType_QNAME, String.class, Redemption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "iBankingUserFlag", scope = Redemption.class)
    public JAXBElement<String> createRedemptionIBankingUserFlag(String value) {
        return new JAXBElement<String>(_RedemptionIBankingUserFlag_QNAME, String.class, Redemption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "regDate", scope = Redemption.class)
    public JAXBElement<String> createRedemptionRegDate(String value) {
        return new JAXBElement<String>(_RedemptionRegDate_QNAME, String.class, Redemption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "loginDate", scope = Redemption.class)
    public JAXBElement<String> createRedemptionLoginDate(String value) {
        return new JAXBElement<String>(_RedemptionLoginDate_QNAME, String.class, Redemption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "resId", scope = Redemption.class)
    public JAXBElement<String> createRedemptionResId(String value) {
        return new JAXBElement<String>(_RedemptionResId_QNAME, String.class, Redemption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "resType", scope = Redemption.class)
    public JAXBElement<String> createRedemptionResType(String value) {
        return new JAXBElement<String>(_RedemptionResType_QNAME, String.class, Redemption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cycleDate", scope = BalanceHistory.class)
    public JAXBElement<String> createBalanceHistoryCycleDate(String value) {
        return new JAXBElement<String>(_BalanceHistoryCycleDate_QNAME, String.class, BalanceHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "openingBalance", scope = BalanceHistory.class)
    public JAXBElement<String> createBalanceHistoryOpeningBalance(String value) {
        return new JAXBElement<String>(_BalanceHistoryOpeningBalance_QNAME, String.class, BalanceHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsEarnedCurrentCycle", scope = BalanceHistory.class)
    public JAXBElement<String> createBalanceHistoryPointsEarnedCurrentCycle(String value) {
        return new JAXBElement<String>(_BalanceHistoryPointsEarnedCurrentCycle_QNAME, String.class, BalanceHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsUsedCurrentCycle", scope = BalanceHistory.class)
    public JAXBElement<String> createBalanceHistoryPointsUsedCurrentCycle(String value) {
        return new JAXBElement<String>(_BalanceHistoryPointsUsedCurrentCycle_QNAME, String.class, BalanceHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalAvailableBalancePoints", scope = BalanceHistory.class)
    public JAXBElement<String> createBalanceHistoryTotalAvailableBalancePoints(String value) {
        return new JAXBElement<String>(_BalanceHistoryTotalAvailableBalancePoints_QNAME, String.class, BalanceHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "catrPointsCurrentCycle", scope = BalanceHistory.class)
    public JAXBElement<String> createBalanceHistoryCatrPointsCurrentCycle(String value) {
        return new JAXBElement<String>(_BalanceHistoryCatrPointsCurrentCycle_QNAME, String.class, BalanceHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashbackPointsCurrentCycle", scope = BalanceHistory.class)
    public JAXBElement<String> createBalanceHistoryCashbackPointsCurrentCycle(String value) {
        return new JAXBElement<String>(_BalanceHistoryCashbackPointsCurrentCycle_QNAME, String.class, BalanceHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availableRewardPoints", scope = BalanceHistory.class)
    public JAXBElement<String> createBalanceHistoryAvailableRewardPoints(String value) {
        return new JAXBElement<String>(_BalanceHistoryAvailableRewardPoints_QNAME, String.class, BalanceHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "programCode", scope = ACCELProgramInfo.class)
    public JAXBElement<String> createACCELProgramInfoProgramCode(String value) {
        return new JAXBElement<String>(_TopupHistoryProgramCode_QNAME, String.class, ACCELProgramInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "programDesc", scope = ACCELProgramInfo.class)
    public JAXBElement<String> createACCELProgramInfoProgramDesc(String value) {
        return new JAXBElement<String>(_TopupHistoryProgramDesc_QNAME, String.class, ACCELProgramInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "promotionStartDate", scope = ACCELProgramInfo.class)
    public JAXBElement<String> createACCELProgramInfoPromotionStartDate(String value) {
        return new JAXBElement<String>(_ACCELProgramInfoPromotionStartDate_QNAME, String.class, ACCELProgramInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "promotionEndDate", scope = ACCELProgramInfo.class)
    public JAXBElement<String> createACCELProgramInfoPromotionEndDate(String value) {
        return new JAXBElement<String>(_ACCELProgramInfoPromotionEndDate_QNAME, String.class, ACCELProgramInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "panBankProductCode", scope = PanBankInfo.class)
    public JAXBElement<String> createPanBankInfoPanBankProductCode(String value) {
        return new JAXBElement<String>(_PanBankInfoPanBankProductCode_QNAME, String.class, PanBankInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "panBankpoints", scope = PanBankInfo.class)
    public JAXBElement<String> createPanBankInfoPanBankpoints(String value) {
        return new JAXBElement<String>(_PanBankInfoPanBankpoints_QNAME, String.class, PanBankInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "expiringPoints", scope = EarningDetails.class)
    public JAXBElement<String> createEarningDetailsExpiringPoints(String value) {
        return new JAXBElement<String>(_EarningDetailsExpiringPoints_QNAME, String.class, EarningDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsExpDate", scope = EarningDetails.class)
    public JAXBElement<String> createEarningDetailsPointsExpDate(String value) {
        return new JAXBElement<String>(_EarningDetailsPointsExpDate_QNAME, String.class, EarningDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditCardNo", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsCreditCardNo(String value) {
        return new JAXBElement<String>(_PriorityPassDetailCreditCardNo_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prevStmtBalance", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsPrevStmtBalance(String value) {
        return new JAXBElement<String>(_CardDetailsPrevStmtBalance_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currBalance", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsCurrBalance(String value) {
        return new JAXBElement<String>(_CardDetailsCurrBalance_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsEarned", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsPointsEarned(String value) {
        return new JAXBElement<String>(_CardDetailsPointsEarned_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsUsed", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsPointsUsed(String value) {
        return new JAXBElement<String>(_CardDetailsPointsUsed_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "offeringCode", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsOfferingCode(String value) {
        return new JAXBElement<String>(_CardDetailsOfferingCode_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currentAdjustment", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsCurrentAdjustment(String value) {
        return new JAXBElement<String>(_CardDetailsCurrentAdjustment_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardAcct", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsCardAcct(String value) {
        return new JAXBElement<String>(_CardDetailsCardAcct_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "primaryShadowAcctNoMiRev", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsPrimaryShadowAcctNoMiRev(String value) {
        return new JAXBElement<String>(_CardDetailsPrimaryShadowAcctNoMiRev_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currREBonusPointsSIGN", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsCurrREBonusPointsSIGN(String value) {
        return new JAXBElement<String>(_CardDetailsCurrREBonusPointsSIGN_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currREBonusPoints", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsCurrREBonusPoints(String value) {
        return new JAXBElement<String>(_CardDetailsCurrREBonusPoints_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currRECashDollarSIGN", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsCurrRECashDollarSIGN(String value) {
        return new JAXBElement<String>(_CardDetailsCurrRECashDollarSIGN_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currRECashDollar", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsCurrRECashDollar(String value) {
        return new JAXBElement<String>(_CardDetailsCurrRECashDollar_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardExpYear", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsCardExpYear(String value) {
        return new JAXBElement<String>(_CardDetailsCardExpYear_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardExpMonth", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsCardExpMonth(String value) {
        return new JAXBElement<String>(_CardDetailsCardExpMonth_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blockCode", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsBlockCode(String value) {
        return new JAXBElement<String>(_CardSummaryDtlBlockCode_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "shadowAcctStatus", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsShadowAcctStatus(String value) {
        return new JAXBElement<String>(_CardDetailsShadowAcctStatus_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "offeringKey", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsOfferingKey(String value) {
        return new JAXBElement<String>(_CardDetailsOfferingKey_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "sourceProdID", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsSourceProdID(String value) {
        return new JAXBElement<String>(_CardDetailsSourceProdID_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardType", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsCardType(String value) {
        return new JAXBElement<String>(_LinkedCardsCardType_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashBackFlag", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsCashBackFlag(String value) {
        return new JAXBElement<String>(_CardDetailsCashBackFlag_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "panBankInd", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsPanBankInd(String value) {
        return new JAXBElement<String>(_CardDetailsPanBankInd_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rewardsPrevBalSign", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsRewardsPrevBalSign(String value) {
        return new JAXBElement<String>(_CardDetailsRewardsPrevBalSign_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rewardsPrevBal", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsRewardsPrevBal(String value) {
        return new JAXBElement<String>(_CardDetailsRewardsPrevBal_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalEarnedRewardsSign", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsTotalEarnedRewardsSign(String value) {
        return new JAXBElement<String>(_CardDetailsTotalEarnedRewardsSign_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalEarnedRewards", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsTotalEarnedRewards(String value) {
        return new JAXBElement<String>(_CardDetailsTotalEarnedRewards_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsRedeemedTransferredExpSign", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsPointsRedeemedTransferredExpSign(String value) {
        return new JAXBElement<String>(_CardDetailsPointsRedeemedTransferredExpSign_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsRedeemedTransferredExp", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsPointsRedeemedTransferredExp(String value) {
        return new JAXBElement<String>(_CardDetailsPointsRedeemedTransferredExp_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalPointsBalSign", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsTotalPointsBalSign(String value) {
        return new JAXBElement<String>(_CardDetailsTotalPointsBalSign_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalPointsBal", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsTotalPointsBal(String value) {
        return new JAXBElement<String>(_CardDetailsTotalPointsBal_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastStmtDate", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsLastStmtDate(String value) {
        return new JAXBElement<String>(_CardDetailsLastStmtDate_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ccyCode", scope = CardDetails.class)
    public JAXBElement<String> createCardDetailsCcyCode(String value) {
        return new JAXBElement<String>(_CardDetailsCcyCode_QNAME, String.class, CardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditCardNo", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsCreditCardNo(String value) {
        return new JAXBElement<String>(_PriorityPassDetailCreditCardNo_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "programCode", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsProgramCode(String value) {
        return new JAXBElement<String>(_TopupHistoryProgramCode_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "programDesc", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsProgramDesc(String value) {
        return new JAXBElement<String>(_TopupHistoryProgramDesc_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productCode", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsProductCode(String value) {
        return new JAXBElement<String>(_TopupHistoryProductCode_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productDesc", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsProductDesc(String value) {
        return new JAXBElement<String>(_TopupHistoryProductDesc_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "insuranceFee", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsInsuranceFee(String value) {
        return new JAXBElement<String>(_CashOneDetailsInsuranceFee_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "minInsuranceFee", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsMinInsuranceFee(String value) {
        return new JAXBElement<String>(_CashOneDetailsMinInsuranceFee_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "maxInsuranceFee", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsMaxInsuranceFee(String value) {
        return new JAXBElement<String>(_CashOneDetailsMaxInsuranceFee_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "earlyRepayHandCharge", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsEarlyRepayHandCharge(String value) {
        return new JAXBElement<String>(_CashOneDetailsEarlyRepayHandCharge_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "loanAmt", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsLoanAmt(String value) {
        return new JAXBElement<String>(_CashOneDetailsLoanAmt_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "disbursementDate", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsDisbursementDate(String value) {
        return new JAXBElement<String>(_CashOneDetailsDisbursementDate_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "installmentAmt", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsInstallmentAmt(String value) {
        return new JAXBElement<String>(_CashOneDetailsInstallmentAmt_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "billedPrincipalAmt", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsBilledPrincipalAmt(String value) {
        return new JAXBElement<String>(_CashOneDetailsBilledPrincipalAmt_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "billedIntAmt", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsBilledIntAmt(String value) {
        return new JAXBElement<String>(_CashOneDetailsBilledIntAmt_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "billedTotalAmt", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsBilledTotalAmt(String value) {
        return new JAXBElement<String>(_CashOneDetailsBilledTotalAmt_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "remainingPrincipal", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsRemainingPrincipal(String value) {
        return new JAXBElement<String>(_CashOneDetailsRemainingPrincipal_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "remainingIntBalance", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsRemainingIntBalance(String value) {
        return new JAXBElement<String>(_CashOneDetailsRemainingIntBalance_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "remainingTotalBalance", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsRemainingTotalBalance(String value) {
        return new JAXBElement<String>(_CashOneDetailsRemainingTotalBalance_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "status", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsStatus(String value) {
        return new JAXBElement<String>(_PrimaryCardStatus_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statusDesc", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsStatusDesc(String value) {
        return new JAXBElement<String>(_StatusHistoryStatusDesc_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paymentMode", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsPaymentMode(String value) {
        return new JAXBElement<String>(_PLCCardDetailsPaymentMode_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paymentModeDesc", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsPaymentModeDesc(String value) {
        return new JAXBElement<String>(_CashOneDetailsPaymentModeDesc_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "flatIntRate", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsFlatIntRate(String value) {
        return new JAXBElement<String>(_PricingHistoryFlatIntRate_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "effectiveIntRate", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsEffectiveIntRate(String value) {
        return new JAXBElement<String>(_PricingHistoryEffectiveIntRate_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "intCalculationMethod", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsIntCalculationMethod(String value) {
        return new JAXBElement<String>(_CashOneDetailsIntCalculationMethod_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "installmentNo", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsInstallmentNo(String value) {
        return new JAXBElement<String>(_CashOneDetailsInstallmentNo_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "billedInstallment", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsBilledInstallment(String value) {
        return new JAXBElement<String>(_CashOneDetailsBilledInstallment_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nextBillDate", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsNextBillDate(String value) {
        return new JAXBElement<String>(_CashOneDetailsNextBillDate_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "redemptionAmount", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsRedemptionAmount(String value) {
        return new JAXBElement<String>(_CashOneDetailsRedemptionAmount_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "sequenceNo", scope = CashOneDetails.class)
    public JAXBElement<String> createCashOneDetailsSequenceNo(String value) {
        return new JAXBElement<String>(_TopupHistorySequenceNo_QNAME, String.class, CashOneDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "priorityPassNo", scope = CardAccessDetails.class)
    public JAXBElement<String> createCardAccessDetailsPriorityPassNo(String value) {
        return new JAXBElement<String>(_PriorityPassDetailPriorityPassNo_QNAME, String.class, CardAccessDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "expiryDate", scope = CardAccessDetails.class)
    public JAXBElement<String> createCardAccessDetailsExpiryDate(String value) {
        return new JAXBElement<String>(_PriorityPassDetailExpiryDate_QNAME, String.class, CardAccessDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "oldPriorityPassNo", scope = CardAccessDetails.class)
    public JAXBElement<String> createCardAccessDetailsOldPriorityPassNo(String value) {
        return new JAXBElement<String>(_PriorityPassDetailOldPriorityPassNo_QNAME, String.class, CardAccessDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardNo", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardCardNo(String value) {
        return new JAXBElement<String>(_LinkedCardsCardNo_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "embossName", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardEmbossName(String value) {
        return new JAXBElement<String>(_SupplimentCardEmbossName_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardType", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardCardType(String value) {
        return new JAXBElement<String>(_LinkedCardsCardType_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardTypeDesc", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardCardTypeDesc(String value) {
        return new JAXBElement<String>(_LinkedCardsCardTypeDesc_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardBlock(String value) {
        return new JAXBElement<String>(_SupplimentCardBlock_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "relType", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardRelType(String value) {
        return new JAXBElement<String>(_SupplimentCardRelType_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardHolderName", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardCardHolderName(String value) {
        return new JAXBElement<String>(_SupplimentCardCardHolderName_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nric", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardNric(String value) {
        return new JAXBElement<String>(_SupplimentCardNric_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "action", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardAction(String value) {
        return new JAXBElement<String>(_SupplimentCardAction_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "actionDesc", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardActionDesc(String value) {
        return new JAXBElement<String>(_SupplimentCardActionDesc_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "sequence", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardSequence(String value) {
        return new JAXBElement<String>(_SupplimentCardSequence_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardsRequested", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardCardsRequested(String value) {
        return new JAXBElement<String>(_SupplimentCardCardsRequested_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "supplementaryCards", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardSupplementaryCards(String value) {
        return new JAXBElement<String>(_SupplimentCardSupplementaryCards_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "supplementaryCardsDesc", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardSupplementaryCardsDesc(String value) {
        return new JAXBElement<String>(_SupplimentCardSupplementaryCardsDesc_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardsIssued", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardCardsIssued(String value) {
        return new JAXBElement<String>(_SupplimentCardCardsIssued_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardsReturned", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardCardsReturned(String value) {
        return new JAXBElement<String>(_SupplimentCardCardsReturned_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardFeatures", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardCardFeatures(String value) {
        return new JAXBElement<String>(_SupplimentCardCardFeatures_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prevAction", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardPrevAction(String value) {
        return new JAXBElement<String>(_SupplimentCardPrevAction_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prevActionDesc", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardPrevActionDesc(String value) {
        return new JAXBElement<String>(_SupplimentCardPrevActionDesc_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "relshipType", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardRelshipType(String value) {
        return new JAXBElement<String>(_SupplimentCardRelshipType_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardHolderIDNo", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardCardHolderIDNo(String value) {
        return new JAXBElement<String>(_SupplimentCardCardHolderIDNo_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "chipType", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardChipType(String value) {
        return new JAXBElement<String>(_SupplimentCardChipType_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardCcy", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardCardCcy(String value) {
        return new JAXBElement<String>(_LinkedCardsCardCcy_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "contactlessIndicator", scope = SupplimentCard.class)
    public JAXBElement<String> createSupplimentCardContactlessIndicator(String value) {
        return new JAXBElement<String>(_SupplimentCardContactlessIndicator_QNAME, String.class, SupplimentCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mailingTitle1", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressMailingTitle1(String value) {
        return new JAXBElement<String>(_CCAddressMailingTitle1_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mailingTitle2", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressMailingTitle2(String value) {
        return new JAXBElement<String>(_CCAddressMailingTitle2_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "addressLine1", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressAddressLine1(String value) {
        return new JAXBElement<String>(_CCAddressAddressLine1_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "addressLine2", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressAddressLine2(String value) {
        return new JAXBElement<String>(_CCAddressAddressLine2_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "addressLine3", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressAddressLine3(String value) {
        return new JAXBElement<String>(_CCAddressAddressLine3_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "addressLine4", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressAddressLine4(String value) {
        return new JAXBElement<String>(_CCAddressAddressLine4_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "addressLine5", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressAddressLine5(String value) {
        return new JAXBElement<String>(_CCAddressAddressLine5_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "city", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressCity(String value) {
        return new JAXBElement<String>(_CCAddressCity_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cityDesc", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressCityDesc(String value) {
        return new JAXBElement<String>(_CCAddressCityDesc_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "state", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressState(String value) {
        return new JAXBElement<String>(_CCAddressState_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "postalCode", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressPostalCode(String value) {
        return new JAXBElement<String>(_CCAddressPostalCode_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "country", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressCountry(String value) {
        return new JAXBElement<String>(_VIPUsageTransactionsCountry_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nonMailAddress", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressNonMailAddress(String value) {
        return new JAXBElement<String>(_CCAddressNonMailAddress_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastMaintainDate", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressLastMaintainDate(String value) {
        return new JAXBElement<String>(_CCAddressLastMaintainDate_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "attentionParty1", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressAttentionParty1(String value) {
        return new JAXBElement<String>(_CCAddressAttentionParty1_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "attentionParty2", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressAttentionParty2(String value) {
        return new JAXBElement<String>(_CCAddressAttentionParty2_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "countryDesc", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressCountryDesc(String value) {
        return new JAXBElement<String>(_CCAddressCountryDesc_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "homePhone", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressHomePhone(String value) {
        return new JAXBElement<String>(_CCAddressHomePhone_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "workPhone", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressWorkPhone(String value) {
        return new JAXBElement<String>(_CCAddressWorkPhone_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mobilePhone", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressMobilePhone(String value) {
        return new JAXBElement<String>(_CCAddressMobilePhone_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "email", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressEmail(String value) {
        return new JAXBElement<String>(_CCAddressEmail_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mailingTitle3", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressMailingTitle3(String value) {
        return new JAXBElement<String>(_CCAddressMailingTitle3_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mailingTitle", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressMailingTitle(String value) {
        return new JAXBElement<String>(_CCAddressMailingTitle_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "housing", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressHousing(String value) {
        return new JAXBElement<String>(_CCAddressHousing_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "housingExt", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressHousingExt(String value) {
        return new JAXBElement<String>(_CCAddressHousingExt_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "home", scope = CCAddress.class)
    public JAXBElement<String> createCCAddressHome(String value) {
        return new JAXBElement<String>(_IDRPDtlsHome_QNAME, String.class, CCAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "memoDate", scope = Memo.class)
    public JAXBElement<String> createMemoMemoDate(String value) {
        return new JAXBElement<String>(_MemoMemoDate_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "memoTime", scope = Memo.class)
    public JAXBElement<String> createMemoMemoTime(String value) {
        return new JAXBElement<String>(_MemoMemoTime_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "memoCategory", scope = Memo.class)
    public JAXBElement<String> createMemoMemoCategory(String value) {
        return new JAXBElement<String>(_MemoMemoCategory_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardholderName", scope = Memo.class)
    public JAXBElement<String> createMemoCardholderName(String value) {
        return new JAXBElement<String>(_MemoCardholderName_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "agentName", scope = Memo.class)
    public JAXBElement<String> createMemoAgentName(String value) {
        return new JAXBElement<String>(_MemoAgentName_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "agentID", scope = Memo.class)
    public JAXBElement<String> createMemoAgentID(String value) {
        return new JAXBElement<String>(_MemoAgentID_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "createdUserID", scope = Memo.class)
    public JAXBElement<String> createMemoCreatedUserID(String value) {
        return new JAXBElement<String>(_MemoCreatedUserID_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "updatedUserID", scope = Memo.class)
    public JAXBElement<String> createMemoUpdatedUserID(String value) {
        return new JAXBElement<String>(_MemoUpdatedUserID_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "memoContent", scope = Memo.class)
    public JAXBElement<String> createMemoMemoContent(String value) {
        return new JAXBElement<String>(_MemoMemoContent_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "memoExpiryDate", scope = Memo.class)
    public JAXBElement<String> createMemoMemoExpiryDate(String value) {
        return new JAXBElement<String>(_MemoMemoExpiryDate_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "actionDate", scope = Memo.class)
    public JAXBElement<String> createMemoActionDate(String value) {
        return new JAXBElement<String>(_MemoActionDate_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "actionCompleteIndicator", scope = Memo.class)
    public JAXBElement<String> createMemoActionCompleteIndicator(String value) {
        return new JAXBElement<String>(_MemoActionCompleteIndicator_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "deleteFlag", scope = Memo.class)
    public JAXBElement<String> createMemoDeleteFlag(String value) {
        return new JAXBElement<String>(_MemoDeleteFlag_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "recordType", scope = Memo.class)
    public JAXBElement<String> createMemoRecordType(String value) {
        return new JAXBElement<String>(_MemoRecordType_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "owner", scope = Memo.class)
    public JAXBElement<String> createMemoOwner(String value) {
        return new JAXBElement<String>(_MemoOwner_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "sequence", scope = Memo.class)
    public JAXBElement<String> createMemoSequence(String value) {
        return new JAXBElement<String>(_SupplimentCardSequence_QNAME, String.class, Memo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cycleDate", scope = Reward.class)
    public JAXBElement<String> createRewardCycleDate(String value) {
        return new JAXBElement<String>(_BalanceHistoryCycleDate_QNAME, String.class, Reward.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "beginingBalance", scope = Reward.class)
    public JAXBElement<String> createRewardBeginingBalance(String value) {
        return new JAXBElement<String>(_RewardBeginingBalance_QNAME, String.class, Reward.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "earned", scope = Reward.class)
    public JAXBElement<String> createRewardEarned(String value) {
        return new JAXBElement<String>(_RewardEarned_QNAME, String.class, Reward.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "redeemed", scope = Reward.class)
    public JAXBElement<String> createRewardRedeemed(String value) {
        return new JAXBElement<String>(_RewardRedeemed_QNAME, String.class, Reward.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "endingBalance", scope = Reward.class)
    public JAXBElement<String> createRewardEndingBalance(String value) {
        return new JAXBElement<String>(_RewardEndingBalance_QNAME, String.class, Reward.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availableBalance", scope = Reward.class)
    public JAXBElement<String> createRewardAvailableBalance(String value) {
        return new JAXBElement<String>(_RewardAvailableBalance_QNAME, String.class, Reward.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prevStmtBal", scope = Reward.class)
    public JAXBElement<String> createRewardPrevStmtBal(String value) {
        return new JAXBElement<String>(_RewardPrevStmtBal_QNAME, String.class, Reward.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statementDate", scope = Reward.class)
    public JAXBElement<String> createRewardStatementDate(String value) {
        return new JAXBElement<String>(_MonthlyInstallmentDetailsStatementDate_QNAME, String.class, Reward.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditCardNo", scope = RewardSummary.class)
    public JAXBElement<String> createRewardSummaryCreditCardNo(String value) {
        return new JAXBElement<String>(_PriorityPassDetailCreditCardNo_QNAME, String.class, RewardSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "available", scope = RewardSummary.class)
    public JAXBElement<String> createRewardSummaryAvailable(String value) {
        return new JAXBElement<String>(_RewardSummaryAvailable_QNAME, String.class, RewardSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "earnedInCurrentCycle", scope = RewardSummary.class)
    public JAXBElement<String> createRewardSummaryEarnedInCurrentCycle(String value) {
        return new JAXBElement<String>(_RewardSummaryEarnedInCurrentCycle_QNAME, String.class, RewardSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "redeemedInCurrentCycle", scope = RewardSummary.class)
    public JAXBElement<String> createRewardSummaryRedeemedInCurrentCycle(String value) {
        return new JAXBElement<String>(_RewardSummaryRedeemedInCurrentCycle_QNAME, String.class, RewardSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "previousStmtPoints", scope = RewardSummary.class)
    public JAXBElement<String> createRewardSummaryPreviousStmtPoints(String value) {
        return new JAXBElement<String>(_RewardSummaryPreviousStmtPoints_QNAME, String.class, RewardSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsEarnedBilled", scope = RewardSummary.class)
    public JAXBElement<String> createRewardSummaryPointsEarnedBilled(String value) {
        return new JAXBElement<String>(_RewardSummaryPointsEarnedBilled_QNAME, String.class, RewardSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsRedeemedBilled", scope = RewardSummary.class)
    public JAXBElement<String> createRewardSummaryPointsRedeemedBilled(String value) {
        return new JAXBElement<String>(_RewardSummaryPointsRedeemedBilled_QNAME, String.class, RewardSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "expiryDate", scope = RewardSummary.class)
    public JAXBElement<String> createRewardSummaryExpiryDate(String value) {
        return new JAXBElement<String>(_PriorityPassDetailExpiryDate_QNAME, String.class, RewardSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "code", scope = Pot.class)
    public JAXBElement<String> createPotCode(String value) {
        return new JAXBElement<String>(_PaymentHistoryCode_QNAME, String.class, Pot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "desc", scope = Pot.class)
    public JAXBElement<String> createPotDesc(String value) {
        return new JAXBElement<String>(_PotDesc_QNAME, String.class, Pot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "product", scope = Pot.class)
    public JAXBElement<String> createPotProduct(String value) {
        return new JAXBElement<String>(_PotProduct_QNAME, String.class, Pot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "sequence", scope = Pot.class)
    public JAXBElement<String> createPotSequence(String value) {
        return new JAXBElement<String>(_SupplimentCardSequence_QNAME, String.class, Pot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "effectiveDate", scope = Pot.class)
    public JAXBElement<String> createPotEffectiveDate(String value) {
        return new JAXBElement<String>(_PricingHistoryEffectiveDate_QNAME, String.class, Pot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "expiryDate", scope = Pot.class)
    public JAXBElement<String> createPotExpiryDate(String value) {
        return new JAXBElement<String>(_PriorityPassDetailExpiryDate_QNAME, String.class, Pot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "group", scope = Pot.class)
    public JAXBElement<String> createPotGroup(String value) {
        return new JAXBElement<String>(_PotGroup_QNAME, String.class, Pot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "code1To6Month", scope = CardProfile.class)
    public JAXBElement<String> createCardProfileCode1To6Month(String value) {
        return new JAXBElement<String>(_CardProfileCode1To6Month_QNAME, String.class, CardProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "code7To12Month", scope = CardProfile.class)
    public JAXBElement<String> createCardProfileCode7To12Month(String value) {
        return new JAXBElement<String>(_CardProfileCode7To12Month_QNAME, String.class, CardProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "code13To18Month", scope = CardProfile.class)
    public JAXBElement<String> createCardProfileCode13To18Month(String value) {
        return new JAXBElement<String>(_CardProfileCode13To18Month_QNAME, String.class, CardProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "code19To24Month", scope = CardProfile.class)
    public JAXBElement<String> createCardProfileCode19To24Month(String value) {
        return new JAXBElement<String>(_CardProfileCode19To24Month_QNAME, String.class, CardProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "date", scope = OAAATransaction.class)
    public JAXBElement<String> createOAAATransactionDate(String value) {
        return new JAXBElement<String>(_PastTransactionsDate_QNAME, String.class, OAAATransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "requestTime", scope = OAAATransaction.class)
    public JAXBElement<String> createOAAATransactionRequestTime(String value) {
        return new JAXBElement<String>(_OAAATransactionRequestTime_QNAME, String.class, OAAATransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "requestType", scope = OAAATransaction.class)
    public JAXBElement<String> createOAAATransactionRequestType(String value) {
        return new JAXBElement<String>(_PastTransactionsRequestType_QNAME, String.class, OAAATransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "response", scope = OAAATransaction.class)
    public JAXBElement<String> createOAAATransactionResponse(String value) {
        return new JAXBElement<String>(_PastTransactionsResponse_QNAME, String.class, OAAATransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "amount", scope = OAAATransaction.class)
    public JAXBElement<String> createOAAATransactionAmount(String value) {
        return new JAXBElement<String>(_OAAATransactionAmount_QNAME, String.class, OAAATransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currencyCode", scope = OAAATransaction.class)
    public JAXBElement<String> createOAAATransactionCurrencyCode(String value) {
        return new JAXBElement<String>(_OAAATransactionCurrencyCode_QNAME, String.class, OAAATransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "billingAmount", scope = OAAATransaction.class)
    public JAXBElement<String> createOAAATransactionBillingAmount(String value) {
        return new JAXBElement<String>(_OAAATransactionBillingAmount_QNAME, String.class, OAAATransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "billingCurrencyCode", scope = OAAATransaction.class)
    public JAXBElement<String> createOAAATransactionBillingCurrencyCode(String value) {
        return new JAXBElement<String>(_OAAATransactionBillingCurrencyCode_QNAME, String.class, OAAATransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "BINCode", scope = OAAATransaction.class)
    public JAXBElement<String> createOAAATransactionBINCode(String value) {
        return new JAXBElement<String>(_OAAATransactionBINCode_QNAME, String.class, OAAATransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "MCCCode", scope = OAAATransaction.class)
    public JAXBElement<String> createOAAATransactionMCCCode(String value) {
        return new JAXBElement<String>(_MerchantDetailMCCCode_QNAME, String.class, OAAATransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "countryCode", scope = OAAATransaction.class)
    public JAXBElement<String> createOAAATransactionCountryCode(String value) {
        return new JAXBElement<String>(_OAAATransactionCountryCode_QNAME, String.class, OAAATransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "reverseCode", scope = OAAATransaction.class)
    public JAXBElement<String> createOAAATransactionReverseCode(String value) {
        return new JAXBElement<String>(_OAAATransactionReverseCode_QNAME, String.class, OAAATransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "NCCC", scope = OAAATransaction.class)
    public JAXBElement<String> createOAAATransactionNCCC(String value) {
        return new JAXBElement<String>(_PastTransactionsNCCC_QNAME, String.class, OAAATransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "POSMode", scope = OAAATransaction.class)
    public JAXBElement<String> createOAAATransactionPOSMode(String value) {
        return new JAXBElement<String>(_OAAATransactionPOSMode_QNAME, String.class, OAAATransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "additionalInfo", scope = OAAATransaction.class)
    public JAXBElement<String> createOAAATransactionAdditionalInfo(String value) {
        return new JAXBElement<String>(_OAAATransactionAdditionalInfo_QNAME, String.class, OAAATransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "sequenceNo", scope = AuthTransaction.class)
    public JAXBElement<String> createAuthTransactionSequenceNo(String value) {
        return new JAXBElement<String>(_TopupHistorySequenceNo_QNAME, String.class, AuthTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "effectiveDate", scope = AuthTransaction.class)
    public JAXBElement<String> createAuthTransactionEffectiveDate(String value) {
        return new JAXBElement<String>(_PricingHistoryEffectiveDate_QNAME, String.class, AuthTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "days", scope = AuthTransaction.class)
    public JAXBElement<String> createAuthTransactionDays(String value) {
        return new JAXBElement<String>(_AuthTransactionDays_QNAME, String.class, AuthTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionDesc", scope = AuthTransaction.class)
    public JAXBElement<String> createAuthTransactionTransactionDesc(String value) {
        return new JAXBElement<String>(_AuthTransactionTransactionDesc_QNAME, String.class, AuthTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "referenceNo", scope = AuthTransaction.class)
    public JAXBElement<String> createAuthTransactionReferenceNo(String value) {
        return new JAXBElement<String>(_AuthTransactionReferenceNo_QNAME, String.class, AuthTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionCode", scope = AuthTransaction.class)
    public JAXBElement<String> createAuthTransactionTransactionCode(String value) {
        return new JAXBElement<String>(_AuthTransactionTransactionCode_QNAME, String.class, AuthTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currencyCode", scope = AuthTransaction.class)
    public JAXBElement<String> createAuthTransactionCurrencyCode(String value) {
        return new JAXBElement<String>(_OAAATransactionCurrencyCode_QNAME, String.class, AuthTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "authorizationAmt", scope = AuthTransaction.class)
    public JAXBElement<String> createAuthTransactionAuthorizationAmt(String value) {
        return new JAXBElement<String>(_AuthTransactionAuthorizationAmt_QNAME, String.class, AuthTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "sourceCode", scope = AuthTransaction.class)
    public JAXBElement<String> createAuthTransactionSourceCode(String value) {
        return new JAXBElement<String>(_AuthTransactionSourceCode_QNAME, String.class, AuthTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranSrcCcy", scope = AuthTransaction.class)
    public JAXBElement<String> createAuthTransactionTranSrcCcy(String value) {
        return new JAXBElement<String>(_AuthTransactionTranSrcCcy_QNAME, String.class, AuthTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "amtBillCcy", scope = AuthTransaction.class)
    public JAXBElement<String> createAuthTransactionAmtBillCcy(String value) {
        return new JAXBElement<String>(_AuthTransactionAmtBillCcy_QNAME, String.class, AuthTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "processingDtTime", scope = AuthTransaction.class)
    public JAXBElement<String> createAuthTransactionProcessingDtTime(String value) {
        return new JAXBElement<String>(_AuthTransactionProcessingDtTime_QNAME, String.class, AuthTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "postingDate", scope = Transaction.class)
    public JAXBElement<String> createTransactionPostingDate(String value) {
        return new JAXBElement<String>(_TransactionPostingDate_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionDate", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransactionDate(String value) {
        return new JAXBElement<String>(_VIPUsageTransactionsTransactionDate_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionDesc", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransactionDesc(String value) {
        return new JAXBElement<String>(_AuthTransactionTransactionDesc_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionCode", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransactionCode(String value) {
        return new JAXBElement<String>(_AuthTransactionTransactionCode_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currencyCode", scope = Transaction.class)
    public JAXBElement<String> createTransactionCurrencyCode(String value) {
        return new JAXBElement<String>(_OAAATransactionCurrencyCode_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "FCYAmount", scope = Transaction.class)
    public JAXBElement<String> createTransactionFCYAmount(String value) {
        return new JAXBElement<String>(_TransactionFCYAmount_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "referenceNo", scope = Transaction.class)
    public JAXBElement<String> createTransactionReferenceNo(String value) {
        return new JAXBElement<String>(_AuthTransactionReferenceNo_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionAmount", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransactionAmount(String value) {
        return new JAXBElement<String>(_PastTransactionsTransactionAmount_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "sourceCode", scope = Transaction.class)
    public JAXBElement<String> createTransactionSourceCode(String value) {
        return new JAXBElement<String>(_AuthTransactionSourceCode_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "arnNumber", scope = Transaction.class)
    public JAXBElement<String> createTransactionArnNumber(String value) {
        return new JAXBElement<String>(_TransactionArnNumber_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "merchantID", scope = Transaction.class)
    public JAXBElement<String> createTransactionMerchantID(String value) {
        return new JAXBElement<String>(_TransactionMerchantID_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "offeringKey", scope = Transaction.class)
    public JAXBElement<String> createTransactionOfferingKey(String value) {
        return new JAXBElement<String>(_CardDetailsOfferingKey_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rewardPoints", scope = Transaction.class)
    public JAXBElement<String> createTransactionRewardPoints(String value) {
        return new JAXBElement<String>(_TransactionRewardPoints_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "dtotRewardPoints", scope = Transaction.class)
    public JAXBElement<String> createTransactionDtotRewardPoints(String value) {
        return new JAXBElement<String>(_TransactionDtotRewardPoints_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "membershipNo", scope = Transaction.class)
    public JAXBElement<String> createTransactionMembershipNo(String value) {
        return new JAXBElement<String>(_TransactionMembershipNo_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productCode", scope = Transaction.class)
    public JAXBElement<String> createTransactionProductCode(String value) {
        return new JAXBElement<String>(_TopupHistoryProductCode_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productDesc", scope = Transaction.class)
    public JAXBElement<String> createTransactionProductDesc(String value) {
        return new JAXBElement<String>(_TopupHistoryProductDesc_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "chargeFees", scope = Transaction.class)
    public JAXBElement<String> createTransactionChargeFees(String value) {
        return new JAXBElement<String>(_TransactionChargeFees_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "reversalFlag", scope = Transaction.class)
    public JAXBElement<String> createTransactionReversalFlag(String value) {
        return new JAXBElement<String>(_TransactionReversalFlag_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsEarned", scope = Transaction.class)
    public JAXBElement<String> createTransactionPointsEarned(String value) {
        return new JAXBElement<String>(_CardDetailsPointsEarned_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "Rate", scope = Transaction.class)
    public JAXBElement<String> createTransactionRate(String value) {
        return new JAXBElement<String>(_TransactionRate_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "Fees", scope = Transaction.class)
    public JAXBElement<String> createTransactionFees(String value) {
        return new JAXBElement<String>(_TransactionFees_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "Term", scope = Transaction.class)
    public JAXBElement<String> createTransactionTerm(String value) {
        return new JAXBElement<String>(_TransactionTerm_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "Count", scope = Transaction.class)
    public JAXBElement<String> createTransactionCount(String value) {
        return new JAXBElement<String>(_TransactionCount_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "redemptionOption", scope = Transaction.class)
    public JAXBElement<String> createTransactionRedemptionOption(String value) {
        return new JAXBElement<String>(_TransactionRedemptionOption_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashAmount", scope = Transaction.class)
    public JAXBElement<String> createTransactionCashAmount(String value) {
        return new JAXBElement<String>(_TransactionCashAmount_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashBackAmount", scope = Transaction.class)
    public JAXBElement<String> createTransactionCashBackAmount(String value) {
        return new JAXBElement<String>(_TransactionCashBackAmount_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "promotionPeriodStartDate", scope = Transaction.class)
    public JAXBElement<String> createTransactionPromotionPeriodStartDate(String value) {
        return new JAXBElement<String>(_TransactionPromotionPeriodStartDate_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "promotionPeriodEndDate", scope = Transaction.class)
    public JAXBElement<String> createTransactionPromotionPeriodEndDate(String value) {
        return new JAXBElement<String>(_TransactionPromotionPeriodEndDate_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalAmtSpent", scope = Transaction.class)
    public JAXBElement<String> createTransactionTotalAmtSpent(String value) {
        return new JAXBElement<String>(_TransactionTotalAmtSpent_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "requestAmt", scope = Transaction.class)
    public JAXBElement<String> createTransactionRequestAmt(String value) {
        return new JAXBElement<String>(_TransactionRequestAmt_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalNo", scope = Transaction.class)
    public JAXBElement<String> createTransactionTotalNo(String value) {
        return new JAXBElement<String>(_TransactionTotalNo_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "requestNo", scope = Transaction.class)
    public JAXBElement<String> createTransactionRequestNo(String value) {
        return new JAXBElement<String>(_TransactionRequestNo_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rewardRate", scope = Transaction.class)
    public JAXBElement<String> createTransactionRewardRate(String value) {
        return new JAXBElement<String>(_TransactionRewardRate_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "interestTransFlag", scope = Transaction.class)
    public JAXBElement<String> createTransactionInterestTransFlag(String value) {
        return new JAXBElement<String>(_TransactionInterestTransFlag_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "customerNo", scope = Transaction.class)
    public JAXBElement<String> createTransactionCustomerNo(String value) {
        return new JAXBElement<String>(_TransactionCustomerNo_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "categoryCode", scope = Transaction.class)
    public JAXBElement<String> createTransactionCategoryCode(String value) {
        return new JAXBElement<String>(_TransactionCategoryCode_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "panbankProductCode", scope = Transaction.class)
    public JAXBElement<String> createTransactionPanbankProductCode(String value) {
        return new JAXBElement<String>(_TransactionPanbankProductCode_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "multiplierOption", scope = Transaction.class)
    public JAXBElement<String> createTransactionMultiplierOption(String value) {
        return new JAXBElement<String>(_TransactionMultiplierOption_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "multiplierRate", scope = Transaction.class)
    public JAXBElement<String> createTransactionMultiplierRate(String value) {
        return new JAXBElement<String>(_TransactionMultiplierRate_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "forAmt", scope = Transaction.class)
    public JAXBElement<String> createTransactionForAmt(String value) {
        return new JAXBElement<String>(_TransactionForAmt_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionType", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransactionType(String value) {
        return new JAXBElement<String>(_TransactionTransactionType_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionCount", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransactionCount(String value) {
        return new JAXBElement<String>(_TransactionTransactionCount_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionCity", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransactionCity(String value) {
        return new JAXBElement<String>(_TransactionTransactionCity_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionCountry", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransactionCountry(String value) {
        return new JAXBElement<String>(_TransactionTransactionCountry_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionTime", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransactionTime(String value) {
        return new JAXBElement<String>(_TransactionTransactionTime_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "channel", scope = Transaction.class)
    public JAXBElement<String> createTransactionChannel(String value) {
        return new JAXBElement<String>(_PLCCardDetailsChannel_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionResponseCode", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransactionResponseCode(String value) {
        return new JAXBElement<String>(_TransactionTransactionResponseCode_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditCardNumber", scope = Transaction.class)
    public JAXBElement<String> createTransactionCreditCardNumber(String value) {
        return new JAXBElement<String>(_PurgeDetailsCreditCardNumber_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardType", scope = Transaction.class)
    public JAXBElement<String> createTransactionCardType(String value) {
        return new JAXBElement<String>(_LinkedCardsCardType_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "userID", scope = Transaction.class)
    public JAXBElement<String> createTransactionUserID(String value) {
        return new JAXBElement<String>(_NotesDataUserID_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currExpiryDate", scope = Transaction.class)
    public JAXBElement<String> createTransactionCurrExpiryDate(String value) {
        return new JAXBElement<String>(_TransactionCurrExpiryDate_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionSequence", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransactionSequence(String value) {
        return new JAXBElement<String>(_TransactionTransactionSequence_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionID", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransactionID(String value) {
        return new JAXBElement<String>(_TransactionTransactionID_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "debitCardSpends", scope = Transaction.class)
    public JAXBElement<String> createTransactionDebitCardSpends(String value) {
        return new JAXBElement<String>(_TransactionDebitCardSpends_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditCardSpends", scope = Transaction.class)
    public JAXBElement<String> createTransactionCreditCardSpends(String value) {
        return new JAXBElement<String>(_TransactionCreditCardSpends_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalSpends", scope = Transaction.class)
    public JAXBElement<String> createTransactionTotalSpends(String value) {
        return new JAXBElement<String>(_TransactionTotalSpends_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "avgDailyBalance", scope = Transaction.class)
    public JAXBElement<String> createTransactionAvgDailyBalance(String value) {
        return new JAXBElement<String>(_TransactionAvgDailyBalance_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "MaxAvgDailyBalance", scope = Transaction.class)
    public JAXBElement<String> createTransactionMaxAvgDailyBalance(String value) {
        return new JAXBElement<String>(_TransactionMaxAvgDailyBalance_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "bonusIntRate", scope = Transaction.class)
    public JAXBElement<String> createTransactionBonusIntRate(String value) {
        return new JAXBElement<String>(_TransactionBonusIntRate_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "monthlyEffIntRate", scope = Transaction.class)
    public JAXBElement<String> createTransactionMonthlyEffIntRate(String value) {
        return new JAXBElement<String>(_TransactionMonthlyEffIntRate_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "bonusIntAmt", scope = Transaction.class)
    public JAXBElement<String> createTransactionBonusIntAmt(String value) {
        return new JAXBElement<String>(_TransactionBonusIntAmt_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "calendarDays", scope = Transaction.class)
    public JAXBElement<String> createTransactionCalendarDays(String value) {
        return new JAXBElement<String>(_TransactionCalendarDays_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "calendarYear", scope = Transaction.class)
    public JAXBElement<String> createTransactionCalendarYear(String value) {
        return new JAXBElement<String>(_TransactionCalendarYear_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalInterestRate", scope = Transaction.class)
    public JAXBElement<String> createTransactionTotalInterestRate(String value) {
        return new JAXBElement<String>(_TransactionTotalInterestRate_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "merchantCategory", scope = Transaction.class)
    public JAXBElement<String> createTransactionMerchantCategory(String value) {
        return new JAXBElement<String>(_TransactionMerchantCategory_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "merchantState", scope = Transaction.class)
    public JAXBElement<String> createTransactionMerchantState(String value) {
        return new JAXBElement<String>(_TransactionMerchantState_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "internationalFeeInd", scope = Transaction.class)
    public JAXBElement<String> createTransactionInternationalFeeInd(String value) {
        return new JAXBElement<String>(_TransactionInternationalFeeInd_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "merchantCategoryCode", scope = Transaction.class)
    public JAXBElement<String> createTransactionMerchantCategoryCode(String value) {
        return new JAXBElement<String>(_TransactionMerchantCategoryCode_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "authorizationCode", scope = Transaction.class)
    public JAXBElement<String> createTransactionAuthorizationCode(String value) {
        return new JAXBElement<String>(_PLCCardDetailsAuthorizationCode_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "reimbAttribute", scope = Transaction.class)
    public JAXBElement<String> createTransactionReimbAttribute(String value) {
        return new JAXBElement<String>(_TransactionReimbAttribute_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "originalCcyDecimalpt", scope = Transaction.class)
    public JAXBElement<String> createTransactionOriginalCcyDecimalpt(String value) {
        return new JAXBElement<String>(_TransactionOriginalCcyDecimalpt_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "onUSCcyConv", scope = Transaction.class)
    public JAXBElement<String> createTransactionOnUSCcyConv(String value) {
        return new JAXBElement<String>(_TransactionOnUSCcyConv_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "alphanumericCcyCode", scope = Transaction.class)
    public JAXBElement<String> createTransactionAlphanumericCcyCode(String value) {
        return new JAXBElement<String>(_TransactionAlphanumericCcyCode_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "posEntryMode", scope = Transaction.class)
    public JAXBElement<String> createTransactionPosEntryMode(String value) {
        return new JAXBElement<String>(_TransactionPosEntryMode_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transSourceCcy", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransSourceCcy(String value) {
        return new JAXBElement<String>(_TransactionTransSourceCcy_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transSrcCcy", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransSrcCcy(String value) {
        return new JAXBElement<String>(_TransactionTransSrcCcy_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "period", scope = Transaction.class)
    public JAXBElement<String> createTransactionPeriod(String value) {
        return new JAXBElement<String>(_PaymentHistoryPeriod_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "debitAmt", scope = Transaction.class)
    public JAXBElement<String> createTransactionDebitAmt(String value) {
        return new JAXBElement<String>(_TransactionDebitAmt_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditAmt", scope = Transaction.class)
    public JAXBElement<String> createTransactionCreditAmt(String value) {
        return new JAXBElement<String>(_TransactionCreditAmt_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionMonth", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransactionMonth(String value) {
        return new JAXBElement<String>(_TransactionTransactionMonth_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionNo", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransactionNo(String value) {
        return new JAXBElement<String>(_TransactionTransactionNo_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "sequenceNo", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailSequenceNo(String value) {
        return new JAXBElement<String>(_TopupHistorySequenceNo_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "programCode", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailProgramCode(String value) {
        return new JAXBElement<String>(_TopupHistoryProgramCode_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "programName", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailProgramName(String value) {
        return new JAXBElement<String>(_MerchandiseDetailProgramName_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productCode", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailProductCode(String value) {
        return new JAXBElement<String>(_TopupHistoryProductCode_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productDesc", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailProductDesc(String value) {
        return new JAXBElement<String>(_TopupHistoryProductDesc_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfInstalments", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailNoOfInstalments(String value) {
        return new JAXBElement<String>(_MerchandiseDetailNoOfInstalments_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "billedInstalments", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailBilledInstalments(String value) {
        return new JAXBElement<String>(_MerchandiseDetailBilledInstalments_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "orderDate", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailOrderDate(String value) {
        return new JAXBElement<String>(_RedemptionProductOrderDate_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "orderAmt", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailOrderAmt(String value) {
        return new JAXBElement<String>(_MerchandiseDetailOrderAmt_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nextBillDate", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailNextBillDate(String value) {
        return new JAXBElement<String>(_CashOneDetailsNextBillDate_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productInst", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailProductInst(String value) {
        return new JAXBElement<String>(_MerchandiseDetailProductInst_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "billedAmount", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailBilledAmount(String value) {
        return new JAXBElement<String>(_MerchandiseDetailBilledAmount_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "remainBalance", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailRemainBalance(String value) {
        return new JAXBElement<String>(_MerchandiseDetailRemainBalance_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "status", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailStatus(String value) {
        return new JAXBElement<String>(_PrimaryCardStatus_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statusDesc", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailStatusDesc(String value) {
        return new JAXBElement<String>(_StatusHistoryStatusDesc_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "interestRate", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailInterestRate(String value) {
        return new JAXBElement<String>(_IDRPDtlsInterestRate_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "principleAmount", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailPrincipleAmount(String value) {
        return new JAXBElement<String>(_MerchandiseDetailPrincipleAmount_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "interestSaved", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailInterestSaved(String value) {
        return new JAXBElement<String>(_MerchandiseDetailInterestSaved_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "functionCode", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailFunctionCode(String value) {
        return new JAXBElement<String>(_MerchandiseDetailFunctionCode_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "linkedAcctNo", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailLinkedAcctNo(String value) {
        return new JAXBElement<String>(_MerchandiseDetailLinkedAcctNo_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastBillNo", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailLastBillNo(String value) {
        return new JAXBElement<String>(_MerchandiseDetailLastBillNo_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastBillDate", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailLastBillDate(String value) {
        return new JAXBElement<String>(_MerchandiseDetailLastBillDate_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastBillAmt", scope = MerchandiseDetail.class)
    public JAXBElement<String> createMerchandiseDetailLastBillAmt(String value) {
        return new JAXBElement<String>(_MerchandiseDetailLastBillAmt_QNAME, String.class, MerchandiseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "monthNo", scope = CreditHistory.class)
    public JAXBElement<String> createCreditHistoryMonthNo(String value) {
        return new JAXBElement<String>(_CreditHistoryMonthNo_QNAME, String.class, CreditHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "date", scope = CreditHistory.class)
    public JAXBElement<String> createCreditHistoryDate(String value) {
        return new JAXBElement<String>(_PastTransactionsDate_QNAME, String.class, CreditHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashOnly", scope = CreditHistory.class)
    public JAXBElement<String> createCreditHistoryCashOnly(String value) {
        return new JAXBElement<String>(_StatementHistoryCashOnly_QNAME, String.class, CreditHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailOnly", scope = CreditHistory.class)
    public JAXBElement<String> createCreditHistoryRetailOnly(String value) {
        return new JAXBElement<String>(_StatementHistoryRetailOnly_QNAME, String.class, CreditHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalFinanceCharges", scope = CreditHistory.class)
    public JAXBElement<String> createCreditHistoryTotalFinanceCharges(String value) {
        return new JAXBElement<String>(_CreditHistoryTotalFinanceCharges_QNAME, String.class, CreditHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashInterest", scope = CreditHistory.class)
    public JAXBElement<String> createCreditHistoryCashInterest(String value) {
        return new JAXBElement<String>(_StatementHistoryCashInterest_QNAME, String.class, CreditHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailInterest", scope = CreditHistory.class)
    public JAXBElement<String> createCreditHistoryRetailInterest(String value) {
        return new JAXBElement<String>(_StatementHistoryRetailInterest_QNAME, String.class, CreditHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "otherFeeCharges", scope = CreditHistory.class)
    public JAXBElement<String> createCreditHistoryOtherFeeCharges(String value) {
        return new JAXBElement<String>(_StatementHistoryOtherFeeCharges_QNAME, String.class, CreditHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rpcCode", scope = RPCBlock.class)
    public JAXBElement<String> createRPCBlockRpcCode(String value) {
        return new JAXBElement<String>(_RPCBlockRpcCode_QNAME, String.class, RPCBlock.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rpccategory", scope = RPCBlock.class)
    public JAXBElement<String> createRPCBlockRpccategory(String value) {
        return new JAXBElement<String>(_RPCBlockRpccategory_QNAME, String.class, RPCBlock.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rpcOutstandBal", scope = RPCBlock.class)
    public JAXBElement<String> createRPCBlockRpcOutstandBal(String value) {
        return new JAXBElement<String>(_RPCBlockRpcOutstandBal_QNAME, String.class, RPCBlock.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "date", scope = BalanceBucketsHistory.class)
    public JAXBElement<String> createBalanceBucketsHistoryDate(String value) {
        return new JAXBElement<String>(_PastTransactionsDate_QNAME, String.class, BalanceBucketsHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashIntUnpaid", scope = BalanceBucketsHistory.class)
    public JAXBElement<String> createBalanceBucketsHistoryCashIntUnpaid(String value) {
        return new JAXBElement<String>(_BalanceBucketsHistoryCashIntUnpaid_QNAME, String.class, BalanceBucketsHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashServiceChargeUnpaid", scope = BalanceBucketsHistory.class)
    public JAXBElement<String> createBalanceBucketsHistoryCashServiceChargeUnpaid(String value) {
        return new JAXBElement<String>(_BalanceBucketsHistoryCashServiceChargeUnpaid_QNAME, String.class, BalanceBucketsHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashBal", scope = BalanceBucketsHistory.class)
    public JAXBElement<String> createBalanceBucketsHistoryCashBal(String value) {
        return new JAXBElement<String>(_BalanceBucketsHistoryCashBal_QNAME, String.class, BalanceBucketsHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailIntUnpaid", scope = BalanceBucketsHistory.class)
    public JAXBElement<String> createBalanceBucketsHistoryRetailIntUnpaid(String value) {
        return new JAXBElement<String>(_BalanceBucketsHistoryRetailIntUnpaid_QNAME, String.class, BalanceBucketsHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailServiceChargeUnpaid", scope = BalanceBucketsHistory.class)
    public JAXBElement<String> createBalanceBucketsHistoryRetailServiceChargeUnpaid(String value) {
        return new JAXBElement<String>(_BalanceBucketsHistoryRetailServiceChargeUnpaid_QNAME, String.class, BalanceBucketsHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailFee", scope = BalanceBucketsHistory.class)
    public JAXBElement<String> createBalanceBucketsHistoryRetailFee(String value) {
        return new JAXBElement<String>(_BalanceBucketsHistoryRetailFee_QNAME, String.class, BalanceBucketsHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailInsUnpaid", scope = BalanceBucketsHistory.class)
    public JAXBElement<String> createBalanceBucketsHistoryRetailInsUnpaid(String value) {
        return new JAXBElement<String>(_BalanceBucketsHistoryRetailInsUnpaid_QNAME, String.class, BalanceBucketsHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailMemshipUnpaid", scope = BalanceBucketsHistory.class)
    public JAXBElement<String> createBalanceBucketsHistoryRetailMemshipUnpaid(String value) {
        return new JAXBElement<String>(_BalanceBucketsHistoryRetailMemshipUnpaid_QNAME, String.class, BalanceBucketsHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailBal", scope = BalanceBucketsHistory.class)
    public JAXBElement<String> createBalanceBucketsHistoryRetailBal(String value) {
        return new JAXBElement<String>(_BalanceBucketsHistoryRetailBal_QNAME, String.class, BalanceBucketsHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashInstallUnpaid", scope = BalanceBucketsHistory.class)
    public JAXBElement<String> createBalanceBucketsHistoryCashInstallUnpaid(String value) {
        return new JAXBElement<String>(_BalanceBucketsHistoryCashInstallUnpaid_QNAME, String.class, BalanceBucketsHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailInstallUnpaid", scope = BalanceBucketsHistory.class)
    public JAXBElement<String> createBalanceBucketsHistoryRetailInstallUnpaid(String value) {
        return new JAXBElement<String>(_BalanceBucketsHistoryRetailInstallUnpaid_QNAME, String.class, BalanceBucketsHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prodCode", scope = ProductDetails.class)
    public JAXBElement<String> createProductDetailsProdCode(String value) {
        return new JAXBElement<String>(_ProductDetailsProdCode_QNAME, String.class, ProductDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prodSign", scope = ProductDetails.class)
    public JAXBElement<String> createProductDetailsProdSign(String value) {
        return new JAXBElement<String>(_ProductDetailsProdSign_QNAME, String.class, ProductDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prodPoints", scope = ProductDetails.class)
    public JAXBElement<String> createProductDetailsProdPoints(String value) {
        return new JAXBElement<String>(_ProductDetailsProdPoints_QNAME, String.class, ProductDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardNo", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsCardNo(String value) {
        return new JAXBElement<String>(_LinkedCardsCardNo_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "primaryShadowAcctNo", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsPrimaryShadowAcctNo(String value) {
        return new JAXBElement<String>(_TransactionDetailsPrimaryShadowAcctNo_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "panbankInd", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsPanbankInd(String value) {
        return new JAXBElement<String>(_TransactionDetailsPanbankInd_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranDate", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsTranDate(String value) {
        return new JAXBElement<String>(_TransactionDetailsTranDate_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "postingDate", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsPostingDate(String value) {
        return new JAXBElement<String>(_TransactionPostingDate_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranID", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsTranID(String value) {
        return new JAXBElement<String>(_TransactionDetailsTranID_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranDesc", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsTranDesc(String value) {
        return new JAXBElement<String>(_TransactionDetailsTranDesc_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "merchantNo", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsMerchantNo(String value) {
        return new JAXBElement<String>(_TransactionDetailsMerchantNo_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ccyCode", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsCcyCode(String value) {
        return new JAXBElement<String>(_CardDetailsCcyCode_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranAmtSign", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsTranAmtSign(String value) {
        return new JAXBElement<String>(_TransactionDetailsTranAmtSign_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranAmt", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsTranAmt(String value) {
        return new JAXBElement<String>(_TransactionDetailsTranAmt_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rewardPointsSign", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsRewardPointsSign(String value) {
        return new JAXBElement<String>(_TransactionDetailsRewardPointsSign_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rewardPoints", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsRewardPoints(String value) {
        return new JAXBElement<String>(_TransactionRewardPoints_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "debitCreditInd", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsDebitCreditInd(String value) {
        return new JAXBElement<String>(_TransactionDetailsDebitCreditInd_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "dailyCyclePointsTotalsSign", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsDailyCyclePointsTotalsSign(String value) {
        return new JAXBElement<String>(_TransactionDetailsDailyCyclePointsTotalsSign_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "dailyCyclePointsTotals", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsDailyCyclePointsTotals(String value) {
        return new JAXBElement<String>(_TransactionDetailsDailyCyclePointsTotals_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "authCode", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsAuthCode(String value) {
        return new JAXBElement<String>(_TransactionDetailsAuthCode_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transSrcCcy", scope = TransactionDetails.class)
    public JAXBElement<String> createTransactionDetailsTransSrcCcy(String value) {
        return new JAXBElement<String>(_TransactionTransSrcCcy_QNAME, String.class, TransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsBalSign", scope = ExpiryPointDetails.class)
    public JAXBElement<String> createExpiryPointDetailsPointsBalSign(String value) {
        return new JAXBElement<String>(_ExpiryPointDetailsPointsBalSign_QNAME, String.class, ExpiryPointDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsBal", scope = ExpiryPointDetails.class)
    public JAXBElement<String> createExpiryPointDetailsPointsBal(String value) {
        return new JAXBElement<String>(_ExpiryPointDetailsPointsBal_QNAME, String.class, ExpiryPointDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "expDate", scope = ExpiryPointDetails.class)
    public JAXBElement<String> createExpiryPointDetailsExpDate(String value) {
        return new JAXBElement<String>(_ExpiryPointDetailsExpDate_QNAME, String.class, ExpiryPointDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashDollarBalSign", scope = ExpiryPointDetails.class)
    public JAXBElement<String> createExpiryPointDetailsCashDollarBalSign(String value) {
        return new JAXBElement<String>(_ExpiryPointDetailsCashDollarBalSign_QNAME, String.class, ExpiryPointDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashDollarBal", scope = ExpiryPointDetails.class)
    public JAXBElement<String> createExpiryPointDetailsCashDollarBal(String value) {
        return new JAXBElement<String>(_ExpiryPointDetailsCashDollarBal_QNAME, String.class, ExpiryPointDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "expCashDollarDate", scope = ExpiryPointDetails.class)
    public JAXBElement<String> createExpiryPointDetailsExpCashDollarDate(String value) {
        return new JAXBElement<String>(_ExpiryPointDetailsExpCashDollarDate_QNAME, String.class, ExpiryPointDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashLimit", scope = Tier.class)
    public JAXBElement<String> createTierCashLimit(String value) {
        return new JAXBElement<String>(_TierCashLimit_QNAME, String.class, Tier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashInt", scope = Tier.class)
    public JAXBElement<String> createTierCashInt(String value) {
        return new JAXBElement<String>(_TierCashInt_QNAME, String.class, Tier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailLimit", scope = Tier.class)
    public JAXBElement<String> createTierRetailLimit(String value) {
        return new JAXBElement<String>(_TierRetailLimit_QNAME, String.class, Tier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailInt", scope = Tier.class)
    public JAXBElement<String> createTierRetailInt(String value) {
        return new JAXBElement<String>(_TierRetailInt_QNAME, String.class, Tier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "seqNo", scope = Gift.class)
    public JAXBElement<String> createGiftSeqNo(String value) {
        return new JAXBElement<String>(_GiftSeqNo_QNAME, String.class, Gift.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "gift", scope = Gift.class)
    public JAXBElement<String> createGiftGift(String value) {
        return new JAXBElement<String>(_GiftGift_QNAME, String.class, Gift.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "giftdesc", scope = Gift.class)
    public JAXBElement<String> createGiftGiftdesc(String value) {
        return new JAXBElement<String>(_GiftGiftdesc_QNAME, String.class, Gift.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custName", scope = CustDet.class)
    public JAXBElement<String> createCustDetCustName(String value) {
        return new JAXBElement<String>(_CustDetCustName_QNAME, String.class, CustDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "compName", scope = CustDet.class)
    public JAXBElement<String> createCustDetCompName(String value) {
        return new JAXBElement<String>(_CustDetCompName_QNAME, String.class, CustDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "officePhNo", scope = CustDet.class)
    public JAXBElement<String> createCustDetOfficePhNo(String value) {
        return new JAXBElement<String>(_CustDetOfficePhNo_QNAME, String.class, CustDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "drawDownAmt", scope = DrawDown.class)
    public JAXBElement<String> createDrawDownDrawDownAmt(String value) {
        return new JAXBElement<String>(_DrawDownDrawDownAmt_QNAME, String.class, DrawDown.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "drawDownAcctNo", scope = DrawDown.class)
    public JAXBElement<String> createDrawDownDrawDownAcctNo(String value) {
        return new JAXBElement<String>(_DrawDownDrawDownAcctNo_QNAME, String.class, DrawDown.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranAmt", scope = DrawDown.class)
    public JAXBElement<String> createDrawDownTranAmt(String value) {
        return new JAXBElement<String>(_TransactionDetailsTranAmt_QNAME, String.class, DrawDown.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "seqNo", scope = TaxDet.class)
    public JAXBElement<String> createTaxDetSeqNo(String value) {
        return new JAXBElement<String>(_GiftSeqNo_QNAME, String.class, TaxDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "startDt", scope = TaxDet.class)
    public JAXBElement<String> createTaxDetStartDt(String value) {
        return new JAXBElement<String>(_TaxDetStartDt_QNAME, String.class, TaxDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "program", scope = TaxDet.class)
    public JAXBElement<CodeDesc> createTaxDetProgram(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_TaxDetProgram_QNAME, CodeDesc.class, TaxDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prod", scope = TaxDet.class)
    public JAXBElement<CodeDesc> createTaxDetProd(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_TaxDetProd_QNAME, CodeDesc.class, TaxDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "loanAmt", scope = TaxDet.class)
    public JAXBElement<String> createTaxDetLoanAmt(String value) {
        return new JAXBElement<String>(_CashOneDetailsLoanAmt_QNAME, String.class, TaxDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "period", scope = TaxDet.class)
    public JAXBElement<String> createTaxDetPeriod(String value) {
        return new JAXBElement<String>(_PaymentHistoryPeriod_QNAME, String.class, TaxDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "instAmt", scope = TaxDet.class)
    public JAXBElement<String> createTaxDetInstAmt(String value) {
        return new JAXBElement<String>(_TaxDetInstAmt_QNAME, String.class, TaxDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "appFee", scope = TaxDet.class)
    public JAXBElement<String> createTaxDetAppFee(String value) {
        return new JAXBElement<String>(_TaxDetAppFee_QNAME, String.class, TaxDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "handlingFee", scope = TaxDet.class)
    public JAXBElement<String> createTaxDetHandlingFee(String value) {
        return new JAXBElement<String>(_TaxDetHandlingFee_QNAME, String.class, TaxDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "companyName", scope = TaxDet.class)
    public JAXBElement<String> createTaxDetCompanyName(String value) {
        return new JAXBElement<String>(_TaxDetCompanyName_QNAME, String.class, TaxDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "officePhoneNo", scope = TaxDet.class)
    public JAXBElement<String> createTaxDetOfficePhoneNo(String value) {
        return new JAXBElement<String>(_TaxDetOfficePhoneNo_QNAME, String.class, TaxDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custName", scope = TaxDet.class)
    public JAXBElement<String> createTaxDetCustName(String value) {
        return new JAXBElement<String>(_CustDetCustName_QNAME, String.class, TaxDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "date", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthDate(String value) {
        return new JAXBElement<String>(_PastTransactionsDate_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashAmt", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthCashAmt(String value) {
        return new JAXBElement<String>(_ThirteenMonthCashAmt_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailAmt", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthRetailAmt(String value) {
        return new JAXBElement<String>(_ThirteenMonthRetailAmt_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pymtAmt", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthPymtAmt(String value) {
        return new JAXBElement<String>(_ThirteenMonthPymtAmt_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "bal", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthBal(String value) {
        return new JAXBElement<String>(_ThirteenMonthBal_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "agingCode", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthAgingCode(String value) {
        return new JAXBElement<String>(_StatementHistoryAgingCode_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditLimit", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthCreditLimit(String value) {
        return new JAXBElement<String>(_PurgeDetailsCreditLimit_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "minPymt", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthMinPymt(String value) {
        return new JAXBElement<String>(_ThirteenMonthMinPymt_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailOnly", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthRetailOnly(String value) {
        return new JAXBElement<String>(_StatementHistoryRetailOnly_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashOnly", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthCashOnly(String value) {
        return new JAXBElement<String>(_StatementHistoryCashOnly_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailInt", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthRetailInt(String value) {
        return new JAXBElement<String>(_TierRetailInt_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashInt", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthCashInt(String value) {
        return new JAXBElement<String>(_TierCashInt_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "feeAmt", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthFeeAmt(String value) {
        return new JAXBElement<String>(_AirportParkingFeeAmt_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "provInt", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthProvInt(String value) {
        return new JAXBElement<String>(_ThirteenMonthProvInt_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "negativeAnticipatedInt", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthNegativeAnticipatedInt(String value) {
        return new JAXBElement<String>(_ThirteenMonthNegativeAnticipatedInt_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "revolverFlag", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthRevolverFlag(String value) {
        return new JAXBElement<String>(_ThirteenMonthRevolverFlag_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalAmt", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthTotalAmt(String value) {
        return new JAXBElement<String>(_ThirteenMonthTotalAmt_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "begBal", scope = ThirteenMonth.class)
    public JAXBElement<String> createThirteenMonthBegBal(String value) {
        return new JAXBElement<String>(_ThirteenMonthBegBal_QNAME, String.class, ThirteenMonth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "gatingId", scope = CampaignDet.class)
    public JAXBElement<String> createCampaignDetGatingId(String value) {
        return new JAXBElement<String>(_CampaignDetGatingId_QNAME, String.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "campaign", scope = CampaignDet.class)
    public JAXBElement<CodeDesc> createCampaignDetCampaign(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_CampaignDetCampaign_QNAME, CodeDesc.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "startDt", scope = CampaignDet.class)
    public JAXBElement<String> createCampaignDetStartDt(String value) {
        return new JAXBElement<String>(_TaxDetStartDt_QNAME, String.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "endDt", scope = CampaignDet.class)
    public JAXBElement<String> createCampaignDetEndDt(String value) {
        return new JAXBElement<String>(_CampaignDetEndDt_QNAME, String.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "benefictEndDt", scope = CampaignDet.class)
    public JAXBElement<String> createCampaignDetBenefictEndDt(String value) {
        return new JAXBElement<String>(_CampaignDetBenefictEndDt_QNAME, String.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastChangeDt", scope = CampaignDet.class)
    public JAXBElement<String> createCampaignDetLastChangeDt(String value) {
        return new JAXBElement<String>(_CampaignDetLastChangeDt_QNAME, String.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "priority", scope = CampaignDet.class)
    public JAXBElement<String> createCampaignDetPriority(String value) {
        return new JAXBElement<String>(_CampaignDetPriority_QNAME, String.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranNo", scope = CampaignDet.class)
    public JAXBElement<String> createCampaignDetTranNo(String value) {
        return new JAXBElement<String>(_CampaignDetTranNo_QNAME, String.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "amt", scope = CampaignDet.class)
    public JAXBElement<String> createCampaignDetAmt(String value) {
        return new JAXBElement<String>(_CampaignDetAmt_QNAME, String.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "intAmtBilled", scope = CampaignDet.class)
    public JAXBElement<String> createCampaignDetIntAmtBilled(String value) {
        return new JAXBElement<String>(_CampaignDetIntAmtBilled_QNAME, String.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "outstandAmt", scope = CampaignDet.class)
    public JAXBElement<String> createCampaignDetOutstandAmt(String value) {
        return new JAXBElement<String>(_CampaignDetOutstandAmt_QNAME, String.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cat", scope = CampaignDet.class)
    public JAXBElement<String> createCampaignDetCat(String value) {
        return new JAXBElement<String>(_CampaignDetCat_QNAME, String.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ref", scope = CampaignDet.class)
    public JAXBElement<String> createCampaignDetRef(String value) {
        return new JAXBElement<String>(_CampaignDetRef_QNAME, String.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "status", scope = CampaignDet.class)
    public JAXBElement<String> createCampaignDetStatus(String value) {
        return new JAXBElement<String>(_PrimaryCardStatus_QNAME, String.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "stmtIntAmt", scope = CampaignDet.class)
    public JAXBElement<String> createCampaignDetStmtIntAmt(String value) {
        return new JAXBElement<String>(_CampaignDetStmtIntAmt_QNAME, String.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastPymtAmt", scope = CampaignDet.class)
    public JAXBElement<String> createCampaignDetLastPymtAmt(String value) {
        return new JAXBElement<String>(_CampaignDetLastPymtAmt_QNAME, String.class, CampaignDet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "acctNo", scope = Order.class)
    public JAXBElement<String> createOrderAcctNo(String value) {
        return new JAXBElement<String>(_PrimaryCardAcctNo_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardHolderName", scope = Order.class)
    public JAXBElement<String> createOrderCardHolderName(String value) {
        return new JAXBElement<String>(_SupplimentCardCardHolderName_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "orderAmt", scope = Order.class)
    public JAXBElement<String> createOrderOrderAmt(String value) {
        return new JAXBElement<String>(_MerchandiseDetailOrderAmt_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "appliedAmt", scope = Order.class)
    public JAXBElement<String> createOrderAppliedAmt(String value) {
        return new JAXBElement<String>(_OrderAppliedAmt_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "acctType", scope = Order.class)
    public JAXBElement<String> createOrderAcctType(String value) {
        return new JAXBElement<String>(_OrderAcctType_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "orderStatus", scope = Order.class)
    public JAXBElement<String> createOrderOrderStatus(String value) {
        return new JAXBElement<String>(_OrderOrderStatus_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "seqNo", scope = LineBurn.class)
    public JAXBElement<String> createLineBurnSeqNo(String value) {
        return new JAXBElement<String>(_GiftSeqNo_QNAME, String.class, LineBurn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "status", scope = LineBurn.class)
    public JAXBElement<String> createLineBurnStatus(String value) {
        return new JAXBElement<String>(_PrimaryCardStatus_QNAME, String.class, LineBurn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "campaignCode", scope = LineBurn.class)
    public JAXBElement<String> createLineBurnCampaignCode(String value) {
        return new JAXBElement<String>(_LineBurnCampaignCode_QNAME, String.class, LineBurn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "merchantOrg", scope = LineBurn.class)
    public JAXBElement<String> createLineBurnMerchantOrg(String value) {
        return new JAXBElement<String>(_LineBurnMerchantOrg_QNAME, String.class, LineBurn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "merchantNo", scope = LineBurn.class)
    public JAXBElement<String> createLineBurnMerchantNo(String value) {
        return new JAXBElement<String>(_TransactionDetailsMerchantNo_QNAME, String.class, LineBurn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "channel", scope = LineBurn.class)
    public JAXBElement<String> createLineBurnChannel(String value) {
        return new JAXBElement<String>(_PLCCardDetailsChannel_QNAME, String.class, LineBurn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardHolderName", scope = LineBurn.class)
    public JAXBElement<String> createLineBurnCardHolderName(String value) {
        return new JAXBElement<String>(_SupplimentCardCardHolderName_QNAME, String.class, LineBurn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "companyName", scope = LineBurn.class)
    public JAXBElement<String> createLineBurnCompanyName(String value) {
        return new JAXBElement<String>(_TaxDetCompanyName_QNAME, String.class, LineBurn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranType", scope = LineBurn.class)
    public JAXBElement<String> createLineBurnTranType(String value) {
        return new JAXBElement<String>(_LineBurnTranType_QNAME, String.class, LineBurn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "acctNo", scope = LineBurn.class)
    public JAXBElement<String> createLineBurnAcctNo(String value) {
        return new JAXBElement<String>(_PrimaryCardAcctNo_QNAME, String.class, LineBurn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "promotionCode", scope = LineBurn.class)
    public JAXBElement<String> createLineBurnPromotionCode(String value) {
        return new JAXBElement<String>(_LineBurnPromotionCode_QNAME, String.class, LineBurn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "subChannel", scope = LineBurn.class)
    public JAXBElement<String> createLineBurnSubChannel(String value) {
        return new JAXBElement<String>(_LineBurnSubChannel_QNAME, String.class, LineBurn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "program", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsProgram(String value) {
        return new JAXBElement<String>(_TaxDetProgram_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "programName", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsProgramName(String value) {
        return new JAXBElement<String>(_MerchandiseDetailProgramName_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prod", scope = EarlyRepaySavings.class)
    public JAXBElement<CodeDesc> createEarlyRepaySavingsProd(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_TaxDetProd_QNAME, CodeDesc.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "intRate", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsIntRate(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsIntRate_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "intMethod", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsIntMethod(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsIntMethod_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "instNo", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsInstNo(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsInstNo_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "instBilled", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsInstBilled(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsInstBilled_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "orderDt", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsOrderDt(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsOrderDt_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nextBillingDt", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsNextBillingDt(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsNextBillingDt_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "billedAmt", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsBilledAmt(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsBilledAmt_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "principalAmt", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsPrincipalAmt(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsPrincipalAmt_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "intAmt", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsIntAmt(String value) {
        return new JAXBElement<String>(_PLCCardDetailsIntAmt_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "appFee", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsAppFee(String value) {
        return new JAXBElement<String>(_TaxDetAppFee_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "handlingFee", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsHandlingFee(String value) {
        return new JAXBElement<String>(_TaxDetHandlingFee_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "outstandBal", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsOutstandBal(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsOutstandBal_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "intAmtUnbilled", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsIntAmtUnbilled(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsIntAmtUnbilled_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "instUnbilled", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsInstUnbilled(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsInstUnbilled_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "remainingInst", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsRemainingInst(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsRemainingInst_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "earlyRepayCharge", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsEarlyRepayCharge(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsEarlyRepayCharge_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "earlyRepaySavings", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsEarlyRepaySavings(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsEarlyRepaySavings_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nextBillAmt", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsNextBillAmt(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsNextBillAmt_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "addtnlHandlingFee", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsAddtnlHandlingFee(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsAddtnlHandlingFee_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "userHandlingFee", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsUserHandlingFee(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsUserHandlingFee_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "seqNo", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsSeqNo(String value) {
        return new JAXBElement<String>(_GiftSeqNo_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "status", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsStatus(String value) {
        return new JAXBElement<String>(_PrimaryCardStatus_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "instPeriod", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsInstPeriod(String value) {
        return new JAXBElement<String>(_PLCCardDetailsInstPeriod_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "earlyRedemptionDue", scope = EarlyRepaySavings.class)
    public JAXBElement<String> createEarlyRepaySavingsEarlyRedemptionDue(String value) {
        return new JAXBElement<String>(_EarlyRepaySavingsEarlyRedemptionDue_QNAME, String.class, EarlyRepaySavings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "postingDate", scope = CardRPC.class)
    public JAXBElement<String> createCardRPCPostingDate(String value) {
        return new JAXBElement<String>(_TransactionPostingDate_QNAME, String.class, CardRPC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "effDate", scope = CardRPC.class)
    public JAXBElement<String> createCardRPCEffDate(String value) {
        return new JAXBElement<String>(_CardRPCEffDate_QNAME, String.class, CardRPC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rpcID", scope = CardRPC.class)
    public JAXBElement<String> createCardRPCRpcID(String value) {
        return new JAXBElement<String>(_CardRPCRpcID_QNAME, String.class, CardRPC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rpcCode", scope = CardRPC.class)
    public JAXBElement<String> createCardRPCRpcCode(String value) {
        return new JAXBElement<String>(_RPCBlockRpcCode_QNAME, String.class, CardRPC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "outstandBalance", scope = CardRPC.class)
    public JAXBElement<String> createCardRPCOutstandBalance(String value) {
        return new JAXBElement<String>(_CardRPCOutstandBalance_QNAME, String.class, CardRPC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "accumulatedBalance", scope = CardRPC.class)
    public JAXBElement<String> createCardRPCAccumulatedBalance(String value) {
        return new JAXBElement<String>(_CardRPCAccumulatedBalance_QNAME, String.class, CardRPC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "billedInt", scope = CardRPC.class)
    public JAXBElement<String> createCardRPCBilledInt(String value) {
        return new JAXBElement<String>(_CardRPCBilledInt_QNAME, String.class, CardRPC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "accruedInt", scope = CardRPC.class)
    public JAXBElement<String> createCardRPCAccruedInt(String value) {
        return new JAXBElement<String>(_CardRPCAccruedInt_QNAME, String.class, CardRPC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "IntRate", scope = CardRPC.class)
    public JAXBElement<String> createCardRPCIntRate(String value) {
        return new JAXBElement<String>(_CardRPCIntRate_QNAME, String.class, CardRPC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "period", scope = RewardHistory.class)
    public JAXBElement<CodeDesc> createRewardHistoryPeriod(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_PaymentHistoryPeriod_QNAME, CodeDesc.class, RewardHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rewardPoints", scope = RewardHistory.class)
    public JAXBElement<String> createRewardHistoryRewardPoints(String value) {
        return new JAXBElement<String>(_TransactionRewardPoints_QNAME, String.class, RewardHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "adjustments", scope = RewardHistory.class)
    public JAXBElement<CodeDesc> createRewardHistoryAdjustments(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_RewardHistoryAdjustments_QNAME, CodeDesc.class, RewardHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "actualRewardPoint", scope = RewardHistory.class)
    public JAXBElement<CodeDesc> createRewardHistoryActualRewardPoint(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_RewardHistoryActualRewardPoint_QNAME, CodeDesc.class, RewardHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranType", scope = RewardTransactionDetails.class)
    public JAXBElement<CodeDesc> createRewardTransactionDetailsTranType(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_LineBurnTranType_QNAME, CodeDesc.class, RewardTransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currQuarterCount", scope = RewardTransactionDetails.class)
    public JAXBElement<String> createRewardTransactionDetailsCurrQuarterCount(String value) {
        return new JAXBElement<String>(_RewardTransactionDetailsCurrQuarterCount_QNAME, String.class, RewardTransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currQuarterPoint", scope = RewardTransactionDetails.class)
    public JAXBElement<String> createRewardTransactionDetailsCurrQuarterPoint(String value) {
        return new JAXBElement<String>(_RewardTransactionDetailsCurrQuarterPoint_QNAME, String.class, RewardTransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "previousQuarterCount", scope = RewardTransactionDetails.class)
    public JAXBElement<String> createRewardTransactionDetailsPreviousQuarterCount(String value) {
        return new JAXBElement<String>(_RewardTransactionDetailsPreviousQuarterCount_QNAME, String.class, RewardTransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "previousQuarterPoint", scope = RewardTransactionDetails.class)
    public JAXBElement<String> createRewardTransactionDetailsPreviousQuarterPoint(String value) {
        return new JAXBElement<String>(_RewardTransactionDetailsPreviousQuarterPoint_QNAME, String.class, RewardTransactionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "waiverType", scope = PenaltyWaiver.class)
    public JAXBElement<CodeDesc> createPenaltyWaiverWaiverType(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_PenaltyWaiverWaiverType_QNAME, CodeDesc.class, PenaltyWaiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "date", scope = PenaltyWaiver.class)
    public JAXBElement<String> createPenaltyWaiverDate(String value) {
        return new JAXBElement<String>(_PastTransactionsDate_QNAME, String.class, PenaltyWaiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardNo", scope = Service.class)
    public JAXBElement<String> createServiceCardNo(String value) {
        return new JAXBElement<String>(_LinkedCardsCardNo_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custId", scope = Service.class)
    public JAXBElement<String> createServiceCustId(String value) {
        return new JAXBElement<String>(_ServiceCustId_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "idType", scope = Service.class)
    public JAXBElement<String> createServiceIdType(String value) {
        return new JAXBElement<String>(_ServiceIdType_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "fullName", scope = Service.class)
    public JAXBElement<String> createServiceFullName(String value) {
        return new JAXBElement<String>(_ServiceFullName_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "status", scope = Service.class)
    public JAXBElement<CodeDesc> createServiceStatus(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_PrimaryCardStatus_QNAME, CodeDesc.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "addValueAmt", scope = Service.class)
    public JAXBElement<String> createServiceAddValueAmt(String value) {
        return new JAXBElement<String>(_ServiceAddValueAmt_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rejectReason", scope = Service.class)
    public JAXBElement<String> createServiceRejectReason(String value) {
        return new JAXBElement<String>(_ServiceRejectReason_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statusUpdateDate", scope = Service.class)
    public JAXBElement<String> createServiceStatusUpdateDate(String value) {
        return new JAXBElement<String>(_ServiceStatusUpdateDate_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "requestPCard", scope = Service.class)
    public JAXBElement<String> createServiceRequestPCard(String value) {
        return new JAXBElement<String>(_ServiceRequestPCard_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardDispatchDate", scope = Service.class)
    public JAXBElement<String> createServiceCardDispatchDate(String value) {
        return new JAXBElement<String>(_ServiceCardDispatchDate_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "collectionPoint", scope = Service.class)
    public JAXBElement<String> createServiceCollectionPoint(String value) {
        return new JAXBElement<String>(_ServiceCollectionPoint_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blacklistFlag", scope = Service.class)
    public JAXBElement<String> createServiceBlacklistFlag(String value) {
        return new JAXBElement<String>(_ServiceBlacklistFlag_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blacklistedBlockCount", scope = Service.class)
    public JAXBElement<String> createServiceBlacklistedBlockCount(String value) {
        return new JAXBElement<String>(_ServiceBlacklistedBlockCount_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blacklistedDate", scope = Service.class)
    public JAXBElement<String> createServiceBlacklistedDate(String value) {
        return new JAXBElement<String>(_ServiceBlacklistedDate_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "openDate", scope = Service.class)
    public JAXBElement<String> createServiceOpenDate(String value) {
        return new JAXBElement<String>(_PurgeDetailsOpenDate_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "updateDate", scope = Service.class)
    public JAXBElement<String> createServiceUpdateDate(String value) {
        return new JAXBElement<String>(_ServiceUpdateDate_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastMaintDate", scope = Service.class)
    public JAXBElement<String> createServiceLastMaintDate(String value) {
        return new JAXBElement<String>(_ServiceLastMaintDate_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "debtorRefNo", scope = Service.class)
    public JAXBElement<String> createServiceDebtorRefNo(String value) {
        return new JAXBElement<String>(_ServiceDebtorRefNo_QNAME, String.class, Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productCode", scope = CardInsurance.class)
    public JAXBElement<CodeDesc> createCardInsuranceProductCode(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_TopupHistoryProductCode_QNAME, CodeDesc.class, CardInsurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "userCode", scope = CardInsurance.class)
    public JAXBElement<String> createCardInsuranceUserCode(String value) {
        return new JAXBElement<String>(_CardInsuranceUserCode_QNAME, String.class, CardInsurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "status", scope = CardInsurance.class)
    public JAXBElement<String> createCardInsuranceStatus(String value) {
        return new JAXBElement<String>(_PrimaryCardStatus_QNAME, String.class, CardInsurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cancelled", scope = CardInsurance.class)
    public JAXBElement<String> createCardInsuranceCancelled(String value) {
        return new JAXBElement<String>(_CardInsuranceCancelled_QNAME, String.class, CardInsurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cancelledCode", scope = CardInsurance.class)
    public JAXBElement<String> createCardInsuranceCancelledCode(String value) {
        return new JAXBElement<String>(_CardInsuranceCancelledCode_QNAME, String.class, CardInsurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "premium", scope = CardInsurance.class)
    public JAXBElement<String> createCardInsurancePremium(String value) {
        return new JAXBElement<String>(_CardInsurancePremium_QNAME, String.class, CardInsurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "claim", scope = CardInsurance.class)
    public JAXBElement<String> createCardInsuranceClaim(String value) {
        return new JAXBElement<String>(_CardInsuranceClaim_QNAME, String.class, CardInsurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "billed", scope = CardInsurance.class)
    public JAXBElement<String> createCardInsuranceBilled(String value) {
        return new JAXBElement<String>(_CardInsuranceBilled_QNAME, String.class, CardInsurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "effDate", scope = CardInsurance.class)
    public JAXBElement<String> createCardInsuranceEffDate(String value) {
        return new JAXBElement<String>(_CardRPCEffDate_QNAME, String.class, CardInsurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "reinstatedDate", scope = CardInsurance.class)
    public JAXBElement<String> createCardInsuranceReinstatedDate(String value) {
        return new JAXBElement<String>(_CardInsuranceReinstatedDate_QNAME, String.class, CardInsurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "promotionCode", scope = Forecast.class)
    public JAXBElement<String> createForecastPromotionCode(String value) {
        return new JAXBElement<String>(_LineBurnPromotionCode_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "coupon", scope = Forecast.class)
    public JAXBElement<String> createForecastCoupon(String value) {
        return new JAXBElement<String>(_ForecastCoupon_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "status", scope = Forecast.class)
    public JAXBElement<CodeDesc> createForecastStatus(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_PrimaryCardStatus_QNAME, CodeDesc.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailSpendAmt", scope = Forecast.class)
    public JAXBElement<String> createForecastRetailSpendAmt(String value) {
        return new JAXBElement<String>(_ForecastRetailSpendAmt_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashSpendAmt", scope = Forecast.class)
    public JAXBElement<String> createForecastCashSpendAmt(String value) {
        return new JAXBElement<String>(_ForecastCashSpendAmt_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "spendLevel", scope = Forecast.class)
    public JAXBElement<String> createForecastSpendLevel(String value) {
        return new JAXBElement<String>(_ForecastSpendLevel_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "penaltyChgFlag", scope = Forecast.class)
    public JAXBElement<String> createForecastPenaltyChgFlag(String value) {
        return new JAXBElement<String>(_ForecastPenaltyChgFlag_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "expSpendAmtLevel1", scope = Forecast.class)
    public JAXBElement<String> createForecastExpSpendAmtLevel1(String value) {
        return new JAXBElement<String>(_ForecastExpSpendAmtLevel1_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "expStmtAmtLevel1", scope = Forecast.class)
    public JAXBElement<String> createForecastExpStmtAmtLevel1(String value) {
        return new JAXBElement<String>(_ForecastExpStmtAmtLevel1_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "expSpendAmtLevel2", scope = Forecast.class)
    public JAXBElement<String> createForecastExpSpendAmtLevel2(String value) {
        return new JAXBElement<String>(_ForecastExpSpendAmtLevel2_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "expStmtAmtLevel2", scope = Forecast.class)
    public JAXBElement<String> createForecastExpStmtAmtLevel2(String value) {
        return new JAXBElement<String>(_ForecastExpStmtAmtLevel2_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "expSpendAmtLevel3", scope = Forecast.class)
    public JAXBElement<String> createForecastExpSpendAmtLevel3(String value) {
        return new JAXBElement<String>(_ForecastExpSpendAmtLevel3_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "expStmtAmtLevel3", scope = Forecast.class)
    public JAXBElement<String> createForecastExpStmtAmtLevel3(String value) {
        return new JAXBElement<String>(_ForecastExpStmtAmtLevel3_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prevSpendLevel", scope = Forecast.class)
    public JAXBElement<String> createForecastPrevSpendLevel(String value) {
        return new JAXBElement<String>(_ForecastPrevSpendLevel_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nextRenewalDate", scope = Forecast.class)
    public JAXBElement<String> createForecastNextRenewalDate(String value) {
        return new JAXBElement<String>(_ForecastNextRenewalDate_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastMaintDate", scope = Forecast.class)
    public JAXBElement<String> createForecastLastMaintDate(String value) {
        return new JAXBElement<String>(_ServiceLastMaintDate_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastMaintainedBy", scope = Forecast.class)
    public JAXBElement<String> createForecastLastMaintainedBy(String value) {
        return new JAXBElement<String>(_ForecastLastMaintainedBy_QNAME, String.class, Forecast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "customerID", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCustomerID(String value) {
        return new JAXBElement<String>(_CardCustomerCustomerID_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "employerName", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerEmployerName(String value) {
        return new JAXBElement<String>(_CardCustomerEmployerName_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "title", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerTitle(String value) {
        return new JAXBElement<String>(_CardCustomerTitle_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "designation", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerDesignation(String value) {
        return new JAXBElement<String>(_CardCustomerDesignation_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "customerLevelBlock", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCustomerLevelBlock(String value) {
        return new JAXBElement<String>(_CardCustomerCustomerLevelBlock_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "customerLevelBlockDesc", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCustomerLevelBlockDesc(String value) {
        return new JAXBElement<String>(_CardCustomerCustomerLevelBlockDesc_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "PANNo", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerPANNo(String value) {
        return new JAXBElement<String>(_CardCustomerPANNo_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "KYC", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerKYC(String value) {
        return new JAXBElement<String>(_CardCustomerKYC_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "dateofBirth", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerDateofBirth(String value) {
        return new JAXBElement<String>(_CardCustomerDateofBirth_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "customerSince", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCustomerSince(String value) {
        return new JAXBElement<String>(_CardCustomerCustomerSince_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availCreditLimit", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerAvailCreditLimit(String value) {
        return new JAXBElement<String>(_CardCustomerAvailCreditLimit_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availCashLimit", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerAvailCashLimit(String value) {
        return new JAXBElement<String>(_CardCustomerAvailCashLimit_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditLimit", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCreditLimit(String value) {
        return new JAXBElement<String>(_PurgeDetailsCreditLimit_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashLimit", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCashLimit(String value) {
        return new JAXBElement<String>(_TierCashLimit_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "companyName", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCompanyName(String value) {
        return new JAXBElement<String>(_TaxDetCompanyName_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "MPSLimit", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerMPSLimit(String value) {
        return new JAXBElement<String>(_CardCustomerMPSLimit_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "MPSAvailLimit", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerMPSAvailLimit(String value) {
        return new JAXBElement<String>(_CardCustomerMPSAvailLimit_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "MPSExpiryDate", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerMPSExpiryDate(String value) {
        return new JAXBElement<String>(_CardCustomerMPSExpiryDate_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currentBalance", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCurrentBalance(String value) {
        return new JAXBElement<String>(_CardCustomerCurrentBalance_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "outstandingBalance", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerOutstandingBalance(String value) {
        return new JAXBElement<String>(_CardCustomerOutstandingBalance_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "detailsOfLEZCode", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerDetailsOfLEZCode(String value) {
        return new JAXBElement<String>(_CardCustomerDetailsOfLEZCode_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nickName", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerNickName(String value) {
        return new JAXBElement<String>(_CardCustomerNickName_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "relationshipType", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerRelationshipType(String value) {
        return new JAXBElement<String>(_CardCustomerRelationshipType_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "relationshipNo", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerRelationshipNo(String value) {
        return new JAXBElement<String>(_CardCustomerRelationshipNo_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "homePhone", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerHomePhone(String value) {
        return new JAXBElement<String>(_CCAddressHomePhone_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "workPhone", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerWorkPhone(String value) {
        return new JAXBElement<String>(_CCAddressWorkPhone_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mobilePhone", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerMobilePhone(String value) {
        return new JAXBElement<String>(_CCAddressMobilePhone_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "email", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerEmail(String value) {
        return new JAXBElement<String>(_CCAddressEmail_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CCAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "Address", scope = CardCustomer.class)
    public JAXBElement<CCAddress> createCardCustomerAddress(CCAddress value) {
        return new JAXBElement<CCAddress>(_IDRPDtlsAddress_QNAME, CCAddress.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CCAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "OtherAddress", scope = CardCustomer.class)
    public JAXBElement<CCAddress> createCardCustomerOtherAddress(CCAddress value) {
        return new JAXBElement<CCAddress>(_CardCustomerOtherAddress_QNAME, CCAddress.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "customerStatus", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCustomerStatus(String value) {
        return new JAXBElement<String>(_IDRPDtlsCustomerStatus_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "fullName", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerFullName(String value) {
        return new JAXBElement<String>(_ServiceFullName_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "primaryAccountHolder", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerPrimaryAccountHolder(String value) {
        return new JAXBElement<String>(_CardCustomerPrimaryAccountHolder_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "primaryCustomer", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerPrimaryCustomer(String value) {
        return new JAXBElement<String>(_CardCustomerPrimaryCustomer_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "customerShortName", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCustomerShortName(String value) {
        return new JAXBElement<String>(_CardCustomerCustomerShortName_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "billingCycle", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerBillingCycle(String value) {
        return new JAXBElement<String>(_CardCustomerBillingCycle_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "gstRegistrationNo", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerGstRegistrationNo(String value) {
        return new JAXBElement<String>(_CardCustomerGstRegistrationNo_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalAvailablePoint", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerTotalAvailablePoint(String value) {
        return new JAXBElement<String>(_CardCustomerTotalAvailablePoint_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalStmtBalance", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerTotalStmtBalance(String value) {
        return new JAXBElement<String>(_CardCustomerTotalStmtBalance_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalCurrentBalance", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerTotalCurrentBalance(String value) {
        return new JAXBElement<String>(_CardCustomerTotalCurrentBalance_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalMinAmountDue", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerTotalMinAmountDue(String value) {
        return new JAXBElement<String>(_CardCustomerTotalMinAmountDue_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastPaymentAmount", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerLastPaymentAmount(String value) {
        return new JAXBElement<String>(_CardCustomerLastPaymentAmount_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastPaymentDate", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerLastPaymentDate(String value) {
        return new JAXBElement<String>(_PurgeDetailsLastPaymentDate_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "permanentCreditLimit", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerPermanentCreditLimit(String value) {
        return new JAXBElement<String>(_CardCustomerPermanentCreditLimit_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "entityID", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerEntityID(String value) {
        return new JAXBElement<String>(_CardCustomerEntityID_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "entityType", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerEntityType(String value) {
        return new JAXBElement<String>(_CardCustomerEntityType_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "organisationNo", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerOrganisationNo(String value) {
        return new JAXBElement<String>(_CardSummaryDtlOrganisationNo_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "requestFlag", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerRequestFlag(String value) {
        return new JAXBElement<String>(_CardCustomerRequestFlag_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "systemID", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerSystemID(String value) {
        return new JAXBElement<String>(_CardCustomerSystemID_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statementCycle", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerStatementCycle(String value) {
        return new JAXBElement<String>(_CardCustomerStatementCycle_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "functionID", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerFunctionID(String value) {
        return new JAXBElement<String>(_CardCustomerFunctionID_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalAvailableBalPoints", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerTotalAvailableBalPoints(String value) {
        return new JAXBElement<String>(_CardCustomerTotalAvailableBalPoints_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalexpPointsRedeemable", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerTotalexpPointsRedeemable(String value) {
        return new JAXBElement<String>(_CardCustomerTotalexpPointsRedeemable_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalpointsForteited", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerTotalpointsForteited(String value) {
        return new JAXBElement<String>(_CardCustomerTotalpointsForteited_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nextPageKey", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerNextPageKey(String value) {
        return new JAXBElement<String>(_CardCustomerNextPageKey_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "gender", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerGender(String value) {
        return new JAXBElement<String>(_CardCustomerGender_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "genderDesc", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerGenderDesc(String value) {
        return new JAXBElement<String>(_CardCustomerGenderDesc_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "behaviourScore", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerBehaviourScore(String value) {
        return new JAXBElement<String>(_CardCustomerBehaviourScore_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalRemainingBalance", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerTotalRemainingBalance(String value) {
        return new JAXBElement<String>(_CardCustomerTotalRemainingBalance_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastMaintainenceDate", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerLastMaintainenceDate(String value) {
        return new JAXBElement<String>(_CardCustomerLastMaintainenceDate_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blockCode", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerBlockCode(String value) {
        return new JAXBElement<String>(_CardSummaryDtlBlockCode_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "shadowLimitInd", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerShadowLimitInd(String value) {
        return new JAXBElement<String>(_CardCustomerShadowLimitInd_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "shadowLimitExpDate", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerShadowLimitExpDate(String value) {
        return new JAXBElement<String>(_CardCustomerShadowLimitExpDate_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paymentApportionment", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerPaymentApportionment(String value) {
        return new JAXBElement<String>(_CardCustomerPaymentApportionment_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paymentApportionmentExpDate", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerPaymentApportionmentExpDate(String value) {
        return new JAXBElement<String>(_CardCustomerPaymentApportionmentExpDate_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "leadingBank", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerLeadingBank(String value) {
        return new JAXBElement<String>(_IDRPDtlsLeadingBank_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "bankName", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerBankName(String value) {
        return new JAXBElement<String>(_IDRPDtlsBankName_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "fileDate", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerFileDate(String value) {
        return new JAXBElement<String>(_IDRPDtlsFileDate_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "applicationDate", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerApplicationDate(String value) {
        return new JAXBElement<String>(_IDRPDtlsApplicationDate_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "remarks", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerRemarks(String value) {
        return new JAXBElement<String>(_IDRPDtlsRemarks_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tenure", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerTenure(String value) {
        return new JAXBElement<String>(_InstallmentPlanTenure_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "interestRate", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerInterestRate(String value) {
        return new JAXBElement<String>(_IDRPDtlsInterestRate_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "monthlyRepaymentAmt", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerMonthlyRepaymentAmt(String value) {
        return new JAXBElement<String>(_IDRPDtlsMonthlyRepaymentAmt_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "agreementSignedRtndDate", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerAgreementSignedRtndDate(String value) {
        return new JAXBElement<String>(_IDRPDtlsAgreementSignedRtndDate_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "approvedDate", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerApprovedDate(String value) {
        return new JAXBElement<String>(_IDRPDtlsApprovedDate_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "firstInstallmentDate", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerFirstInstallmentDate(String value) {
        return new JAXBElement<String>(_IDRPDtlsFirstInstallmentDate_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "destroyedConnaughtDay", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerDestroyedConnaughtDay(String value) {
        return new JAXBElement<String>(_IDRPDtlsDestroyedConnaughtDay_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "IDRPNumber", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerIDRPNumber(String value) {
        return new JAXBElement<String>(_IDRPDtlsIDRPNumber_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "home", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerHome(String value) {
        return new JAXBElement<String>(_IDRPDtlsHome_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "homeDesc", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerHomeDesc(String value) {
        return new JAXBElement<String>(_IDRPDtlsHomeDesc_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "agreementReceived", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerAgreementReceived(String value) {
        return new JAXBElement<String>(_IDRPDtlsAgreementReceived_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "office", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerOffice(String value) {
        return new JAXBElement<String>(_IDRPDtlsOffice_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custIDType", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCustIDType(String value) {
        return new JAXBElement<String>(_CardCustomerCustIDType_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "salutation", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerSalutation(String value) {
        return new JAXBElement<String>(_CardCustomerSalutation_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "directMail", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerDirectMail(String value) {
        return new JAXBElement<String>(_CardCustomerDirectMail_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardExpDate", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCardExpDate(String value) {
        return new JAXBElement<String>(_CardCustomerCardExpDate_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastMinAmtDue", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerLastMinAmtDue(String value) {
        return new JAXBElement<String>(_CardCustomerLastMinAmtDue_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "consolidatedCode", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerConsolidatedCode(String value) {
        return new JAXBElement<String>(_CardCustomerConsolidatedCode_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "callingCardNo", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCallingCardNo(String value) {
        return new JAXBElement<String>(_CardCustomerCallingCardNo_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "employmentDate", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerEmploymentDate(String value) {
        return new JAXBElement<String>(_CardCustomerEmploymentDate_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "employeeFlag", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerEmployeeFlag(String value) {
        return new JAXBElement<String>(_CardCustomerEmployeeFlag_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pastDueFlag", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerPastDueFlag(String value) {
        return new JAXBElement<String>(_CardCustomerPastDueFlag_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CCAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "MailingAddress", scope = CardCustomer.class)
    public JAXBElement<CCAddress> createCardCustomerMailingAddress(CCAddress value) {
        return new JAXBElement<CCAddress>(_CardCustomerMailingAddress_QNAME, CCAddress.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availCreditLimit2", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerAvailCreditLimit2(String value) {
        return new JAXBElement<String>(_CardCustomerAvailCreditLimit2_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availCashLimit2", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerAvailCashLimit2(String value) {
        return new JAXBElement<String>(_CardCustomerAvailCashLimit2_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "segmentCode", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerSegmentCode(String value) {
        return new JAXBElement<String>(_CardCustomerSegmentCode_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "overLimitOption", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerOverLimitOption(String value) {
        return new JAXBElement<String>(_CardCustomerOverLimitOption_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "crmODRowId", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCrmODRowId(String value) {
        return new JAXBElement<String>(_CardCustomerCrmODRowId_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "linkedCustId", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerLinkedCustId(String value) {
        return new JAXBElement<String>(_CardCustomerLinkedCustId_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "maritalStatus", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerMaritalStatus(String value) {
        return new JAXBElement<String>(_CardCustomerMaritalStatus_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "grossAnnualIncome", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerGrossAnnualIncome(String value) {
        return new JAXBElement<String>(_CardCustomerGrossAnnualIncome_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "coOwnerWorkTelephoneNo", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCoOwnerWorkTelephoneNo(String value) {
        return new JAXBElement<String>(_CardCustomerCoOwnerWorkTelephoneNo_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardHolderStatus", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCardHolderStatus(String value) {
        return new JAXBElement<String>(_CardCustomerCardHolderStatus_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "icNo", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerIcNo(String value) {
        return new JAXBElement<String>(_CardCustomerIcNo_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "housing", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerHousing(String value) {
        return new JAXBElement<String>(_CCAddressHousing_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "housingExt", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerHousingExt(String value) {
        return new JAXBElement<String>(_CCAddressHousingExt_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rtnInd", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerRtnInd(String value) {
        return new JAXBElement<String>(_CardCustomerRtnInd_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "additionalMailingTitle1", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerAdditionalMailingTitle1(String value) {
        return new JAXBElement<String>(_CardCustomerAdditionalMailingTitle1_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "additionalMailingTitle2", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerAdditionalMailingTitle2(String value) {
        return new JAXBElement<String>(_CardCustomerAdditionalMailingTitle2_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "additionalAddressState", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerAdditionalAddressState(String value) {
        return new JAXBElement<String>(_CardCustomerAdditionalAddressState_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "additionalAddressCountry", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerAdditionalAddressCountry(String value) {
        return new JAXBElement<String>(_CardCustomerAdditionalAddressCountry_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfYearsAtResidence", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerNoOfYearsAtResidence(String value) {
        return new JAXBElement<String>(_CardCustomerNoOfYearsAtResidence_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "residenceType", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerResidenceType(String value) {
        return new JAXBElement<String>(_CardCustomerResidenceType_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ownershipStatus", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerOwnershipStatus(String value) {
        return new JAXBElement<String>(_CardCustomerOwnershipStatus_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfYearsInService", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerNoOfYearsInService(String value) {
        return new JAXBElement<String>(_CardCustomerNoOfYearsInService_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "positionsHeld", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerPositionsHeld(String value) {
        return new JAXBElement<String>(_CardCustomerPositionsHeld_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nationality", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerNationality(String value) {
        return new JAXBElement<String>(_CardCustomerNationality_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "memo1", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerMemo1(String value) {
        return new JAXBElement<String>(_CardCustomerMemo1_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "memo2", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerMemo2(String value) {
        return new JAXBElement<String>(_CardCustomerMemo2_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "faxNo", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerFaxNo(String value) {
        return new JAXBElement<String>(_CardCustomerFaxNo_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailInterestRate", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerRetailInterestRate(String value) {
        return new JAXBElement<String>(_CardCustomerRetailInterestRate_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashInterestRate", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCashInterestRate(String value) {
        return new JAXBElement<String>(_CardCustomerCashInterestRate_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "coOwnerDOB", scope = CardCustomer.class)
    public JAXBElement<String> createCardCustomerCoOwnerDOB(String value) {
        return new JAXBElement<String>(_CardCustomerCoOwnerDOB_QNAME, String.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CCAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "additionalAddress", scope = CardCustomer.class)
    public JAXBElement<CCAddress> createCardCustomerAdditionalAddress(CCAddress value) {
        return new JAXBElement<CCAddress>(_CardCustomerAdditionalAddress_QNAME, CCAddress.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Redemption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "Redemption", scope = CardCustomer.class)
    public JAXBElement<Redemption> createCardCustomerRedemption(Redemption value) {
        return new JAXBElement<Redemption>(_CardCustomerRedemption_QNAME, Redemption.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "Response", scope = CardCustomer.class)
    public JAXBElement<ServiceResponse> createCardCustomerResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_CardCustomerResponse_QNAME, ServiceResponse.class, CardCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditCardNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCreditCardNo(String value) {
        return new JAXBElement<String>(_PriorityPassDetailCreditCardNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardType", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardType(String value) {
        return new JAXBElement<String>(_LinkedCardsCardType_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardTypeDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardTypeDesc(String value) {
        return new JAXBElement<String>(_LinkedCardsCardTypeDesc_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "product", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProduct(String value) {
        return new JAXBElement<String>(_PotProduct_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProductDesc(String value) {
        return new JAXBElement<String>(_TopupHistoryProductDesc_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardHolderStatus", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardHolderStatus(String value) {
        return new JAXBElement<String>(_CardCustomerCardHolderStatus_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardHolderStatusDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardHolderStatusDesc(String value) {
        return new JAXBElement<String>(_CreditCardCardHolderStatusDesc_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blockCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlockCode(String value) {
        return new JAXBElement<String>(_CardSummaryDtlBlockCode_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blockCodeDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlockCodeDesc(String value) {
        return new JAXBElement<String>(_BlockDetailBlockCodeDesc_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "primaryBlockCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPrimaryBlockCode(String value) {
        return new JAXBElement<String>(_CreditCardPrimaryBlockCode_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "alternateBlockCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAlternateBlockCode(String value) {
        return new JAXBElement<String>(_CreditCardAlternateBlockCode_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "relationshipNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRelationshipNo(String value) {
        return new JAXBElement<String>(_CardCustomerRelationshipNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "stmtType", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStmtType(String value) {
        return new JAXBElement<String>(_CreditCardStmtType_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "stmtBalance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStmtBalance(String value) {
        return new JAXBElement<String>(_CreditCardStmtBalance_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pastDueAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPastDueAmount(String value) {
        return new JAXBElement<String>(_CreditCardPastDueAmount_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "previousBalance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPreviousBalance(String value) {
        return new JAXBElement<String>(_CreditCardPreviousBalance_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paymentCredt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPaymentCredt(String value) {
        return new JAXBElement<String>(_CreditCardPaymentCredt_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "purchaseDebit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPurchaseDebit(String value) {
        return new JAXBElement<String>(_CreditCardPurchaseDebit_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashAdvance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCashAdvance(String value) {
        return new JAXBElement<String>(_StatementHistoryCashAdvance_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "financialCharges", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFinancialCharges(String value) {
        return new JAXBElement<String>(_CreditCardFinancialCharges_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "stmtDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStmtDate(String value) {
        return new JAXBElement<String>(_CreditCardStmtDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cycleDays", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCycleDays(String value) {
        return new JAXBElement<String>(_CreditCardCycleDays_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "dueDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDueDate(String value) {
        return new JAXBElement<String>(_AirportParkingDueDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "minAmountDue", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMinAmountDue(String value) {
        return new JAXBElement<String>(_CreditCardMinAmountDue_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastActivity", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastActivity(String value) {
        return new JAXBElement<String>(_CreditCardLastActivity_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfTotalAuthorization", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNoOfTotalAuthorization(String value) {
        return new JAXBElement<String>(_CreditCardNoOfTotalAuthorization_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalAuthorizationAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTotalAuthorizationAmt(String value) {
        return new JAXBElement<String>(_CreditCardTotalAuthorizationAmt_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfTodayAuthorization", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNoOfTodayAuthorization(String value) {
        return new JAXBElement<String>(_CreditCardNoOfTodayAuthorization_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "todayAuthorizationAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTodayAuthorizationAmt(String value) {
        return new JAXBElement<String>(_CreditCardTodayAuthorizationAmt_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfOutstandAuthorization", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNoOfOutstandAuthorization(String value) {
        return new JAXBElement<String>(_CreditCardNoOfOutstandAuthorization_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "outstandAuthorizationAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOutstandAuthorizationAmt(String value) {
        return new JAXBElement<String>(_CreditCardOutstandAuthorizationAmt_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "outstandAuthorizationAmtDec", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOutstandAuthorizationAmtDec(String value) {
        return new JAXBElement<String>(_CreditCardOutstandAuthorizationAmtDec_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "earlySettlementDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEarlySettlementDate(String value) {
        return new JAXBElement<String>(_CreditCardEarlySettlementDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "payoffAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPayoffAmount(String value) {
        return new JAXBElement<String>(_CreditCardPayoffAmount_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "interestPerDiem", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardInterestPerDiem(String value) {
        return new JAXBElement<String>(_CreditCardInterestPerDiem_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "accrualDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAccrualDate(String value) {
        return new JAXBElement<String>(_CreditCardAccrualDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "accruedThroughDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAccruedThroughDate(String value) {
        return new JAXBElement<String>(_CreditCardAccruedThroughDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paymentDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPaymentDate(String value) {
        return new JAXBElement<String>(_CreditCardPaymentDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "billingCycle", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBillingCycle(String value) {
        return new JAXBElement<String>(_CardCustomerBillingCycle_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfReturnedCheques", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNoOfReturnedCheques(String value) {
        return new JAXBElement<String>(_CreditCardNoOfReturnedCheques_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastReturnedChequeDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastReturnedChequeDate(String value) {
        return new JAXBElement<String>(_CreditCardLastReturnedChequeDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastPurchaseDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastPurchaseDate(String value) {
        return new JAXBElement<String>(_CreditCardLastPurchaseDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastAdvancedAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastAdvancedAmt(String value) {
        return new JAXBElement<String>(_CreditCardLastAdvancedAmt_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastCashAdvanceDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastCashAdvanceDate(String value) {
        return new JAXBElement<String>(_CreditCardLastCashAdvanceDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastPurchaseAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastPurchaseAmt(String value) {
        return new JAXBElement<String>(_CreditCardLastPurchaseAmt_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastPaymentAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastPaymentAmt(String value) {
        return new JAXBElement<String>(_CreditCardLastPaymentAmt_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastPaymentDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastPaymentDate(String value) {
        return new JAXBElement<String>(_PurgeDetailsLastPaymentDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfAuthorisedTransaction", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNoOfAuthorisedTransaction(String value) {
        return new JAXBElement<String>(_CreditCardNoOfAuthorisedTransaction_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "authorisedAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAuthorisedAmount(String value) {
        return new JAXBElement<String>(_CreditCardAuthorisedAmount_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "authorisedCashAdvance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAuthorisedCashAdvance(String value) {
        return new JAXBElement<String>(_CreditCardAuthorisedCashAdvance_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastCreditLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastCreditLimit(String value) {
        return new JAXBElement<String>(_CreditCardLastCreditLimit_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastCreditLimitDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastCreditLimitDate(String value) {
        return new JAXBElement<String>(_CreditCardLastCreditLimitDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tmpLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTmpLimit(String value) {
        return new JAXBElement<String>(_CreditCardTmpLimit_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tmpLimitExpiryDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTmpLimitExpiryDate(String value) {
        return new JAXBElement<String>(_CreditCardTmpLimitExpiryDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availableCashLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAvailableCashLimit(String value) {
        return new JAXBElement<String>(_CreditCardAvailableCashLimit_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditLimitDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCreditLimitDate(String value) {
        return new JAXBElement<String>(_CreditCardCreditLimitDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "highBalance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardHighBalance(String value) {
        return new JAXBElement<String>(_CreditCardHighBalance_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "highBalanceDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardHighBalanceDate(String value) {
        return new JAXBElement<String>(_CreditCardHighBalanceDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashBalance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCashBalance(String value) {
        return new JAXBElement<String>(_CreditCardCashBalance_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailBalance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRetailBalance(String value) {
        return new JAXBElement<String>(_CreditCardRetailBalance_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "outstandBalance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOutstandBalance(String value) {
        return new JAXBElement<String>(_CardRPCOutstandBalance_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastStatement", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastStatement(String value) {
        return new JAXBElement<String>(_CreditCardLastStatement_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ccmsCustomerID", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCcmsCustomerID(String value) {
        return new JAXBElement<String>(_CreditCardCcmsCustomerID_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardUsageStatus", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardUsageStatus(String value) {
        return new JAXBElement<String>(_CreditCardCardUsageStatus_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currYearCashAdvIntPaid", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCurrYearCashAdvIntPaid(String value) {
        return new JAXBElement<String>(_CreditCardCurrYearCashAdvIntPaid_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastYearCashAdvIntPaid", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastYearCashAdvIntPaid(String value) {
        return new JAXBElement<String>(_CreditCardLastYearCashAdvIntPaid_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currYearIntPaid", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCurrYearIntPaid(String value) {
        return new JAXBElement<String>(_CreditCardCurrYearIntPaid_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastYearIntPaid", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastYearIntPaid(String value) {
        return new JAXBElement<String>(_CreditCardLastYearIntPaid_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productTiedToCard", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProductTiedToCard(String value) {
        return new JAXBElement<String>(_CreditCardProductTiedToCard_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastTransactionDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastTransactionDate(String value) {
        return new JAXBElement<String>(_CreditCardLastTransactionDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastActiveDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastActiveDate(String value) {
        return new JAXBElement<String>(_CreditCardLastActiveDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pinReIssueDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPinReIssueDate(String value) {
        return new JAXBElement<String>(_CreditCardPinReIssueDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currentDueAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCurrentDueAmount(String value) {
        return new JAXBElement<String>(_CreditCardCurrentDueAmount_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalDueAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTotalDueAmount(String value) {
        return new JAXBElement<String>(_CreditCardTotalDueAmount_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "xdays", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardXdays(String value) {
        return new JAXBElement<String>(_CreditCardXdays_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "embossingName1", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEmbossingName1(String value) {
        return new JAXBElement<String>(_CreditCardEmbossingName1_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "embossingName2", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEmbossingName2(String value) {
        return new JAXBElement<String>(_CreditCardEmbossingName2_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "embossingName3", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEmbossingName3(String value) {
        return new JAXBElement<String>(_CreditCardEmbossingName3_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "embossingName4", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEmbossingName4(String value) {
        return new JAXBElement<String>(_CreditCardEmbossingName4_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "autoDebit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAutoDebit(String value) {
        return new JAXBElement<String>(_CreditCardAutoDebit_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "purgeDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPurgeDate(String value) {
        return new JAXBElement<String>(_PurgeDetailsPurgeDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "region", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRegion(String value) {
        return new JAXBElement<String>(_CreditCardRegion_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "singleDualCard", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSingleDualCard(String value) {
        return new JAXBElement<String>(_CreditCardSingleDualCard_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastReplacementDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastReplacementDate(String value) {
        return new JAXBElement<String>(_CreditCardLastReplacementDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "membershipNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMembershipNo(String value) {
        return new JAXBElement<String>(_TransactionMembershipNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardExpiryDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardExpiryDate(String value) {
        return new JAXBElement<String>(_CreditCardCardExpiryDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "behaviourScore", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBehaviourScore(String value) {
        return new JAXBElement<String>(_CardCustomerBehaviourScore_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "customerRiskScore", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustomerRiskScore(String value) {
        return new JAXBElement<String>(_CreditCardCustomerRiskScore_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "exposureAtRisk", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardExposureAtRisk(String value) {
        return new JAXBElement<String>(_CreditCardExposureAtRisk_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "corporateCustomer", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCorporateCustomer(String value) {
        return new JAXBElement<String>(_CreditCardCorporateCustomer_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paymentType", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPaymentType(String value) {
        return new JAXBElement<String>(_CreditCardPaymentType_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paymentTypeDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPaymentTypeDesc(String value) {
        return new JAXBElement<String>(_CreditCardPaymentTypeDesc_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paymentMethod", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPaymentMethod(String value) {
        return new JAXBElement<String>(_CreditCardPaymentMethod_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paymentMethodDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPaymentMethodDesc(String value) {
        return new JAXBElement<String>(_CreditCardPaymentMethodDesc_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastCardRequestDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastCardRequestDate(String value) {
        return new JAXBElement<String>(_CreditCardLastCardRequestDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastPinRequestDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastPinRequestDate(String value) {
        return new JAXBElement<String>(_CreditCardLastPinRequestDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastPinMaintenanceDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastPinMaintenanceDate(String value) {
        return new JAXBElement<String>(_CreditCardLastPinMaintenanceDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "newTransferCardNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNewTransferCardNo(String value) {
        return new JAXBElement<String>(_CreditCardNewTransferCardNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transferEffectiveDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTransferEffectiveDate(String value) {
        return new JAXBElement<String>(_CreditCardTransferEffectiveDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailBaseRatePA", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRetailBaseRatePA(String value) {
        return new JAXBElement<String>(_CreditCardRetailBaseRatePA_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashBaseRatePA", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCashBaseRatePA(String value) {
        return new JAXBElement<String>(_CreditCardCashBaseRatePA_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailInterest", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRetailInterest(String value) {
        return new JAXBElement<String>(_StatementHistoryRetailInterest_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lateNotices", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLateNotices(String value) {
        return new JAXBElement<String>(_CreditCardLateNotices_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "serviceCharges", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardServiceCharges(String value) {
        return new JAXBElement<String>(_CreditCardServiceCharges_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashInterest", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCashInterest(String value) {
        return new JAXBElement<String>(_StatementHistoryCashInterest_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "annualFees", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAnnualFees(String value) {
        return new JAXBElement<String>(_CreditCardAnnualFees_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prePay", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPrePay(String value) {
        return new JAXBElement<String>(_CreditCardPrePay_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lateCharges", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLateCharges(String value) {
        return new JAXBElement<String>(_CreditCardLateCharges_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "overlimitCharges", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOverlimitCharges(String value) {
        return new JAXBElement<String>(_CreditCardOverlimitCharges_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalDisputedAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTotalDisputedAmount(String value) {
        return new JAXBElement<String>(_CreditCardTotalDisputedAmount_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailDisputeAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRetailDisputeAmount(String value) {
        return new JAXBElement<String>(_CreditCardRetailDisputeAmount_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashDisputedAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCashDisputedAmount(String value) {
        return new JAXBElement<String>(_CreditCardCashDisputedAmount_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardFeeDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardFeeDate(String value) {
        return new JAXBElement<String>(_CreditCardCardFeeDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardFeeAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardFeeAmount(String value) {
        return new JAXBElement<String>(_CreditCardCardFeeAmount_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ctdFees0", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCtdFees0(String value) {
        return new JAXBElement<String>(_CreditCardCtdFees0_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ctdFees1", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCtdFees1(String value) {
        return new JAXBElement<String>(_CreditCardCtdFees1_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ctdFees2", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCtdFees2(String value) {
        return new JAXBElement<String>(_CreditCardCtdFees2_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ctdFees3", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCtdFees3(String value) {
        return new JAXBElement<String>(_CreditCardCtdFees3_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "userCode1", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardUserCode1(String value) {
        return new JAXBElement<String>(_CreditCardUserCode1_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "userCode2", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardUserCode2(String value) {
        return new JAXBElement<String>(_CreditCardUserCode2_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "userCode3", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardUserCode3(String value) {
        return new JAXBElement<String>(_CreditCardUserCode3_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "userCode4", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardUserCode4(String value) {
        return new JAXBElement<String>(_CreditCardUserCode4_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "permanentCreditLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPermanentCreditLimit(String value) {
        return new JAXBElement<String>(_CardCustomerPermanentCreditLimit_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availableRewardPoints", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAvailableRewardPoints(String value) {
        return new JAXBElement<String>(_BalanceHistoryAvailableRewardPoints_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rewardPointsErndInCurrCycle", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRewardPointsErndInCurrCycle(String value) {
        return new JAXBElement<String>(_CreditCardRewardPointsErndInCurrCycle_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rewardPointsRedeemedInCurrCycle", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRewardPointsRedeemedInCurrCycle(String value) {
        return new JAXBElement<String>(_CreditCardRewardPointsRedeemedInCurrCycle_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "previousStmtPoints", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPreviousStmtPoints(String value) {
        return new JAXBElement<String>(_RewardSummaryPreviousStmtPoints_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastDelinquencyDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastDelinquencyDate(String value) {
        return new JAXBElement<String>(_CreditCardLastDelinquencyDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "priorDelinquencyDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPriorDelinquencyDate(String value) {
        return new JAXBElement<String>(_CreditCardPriorDelinquencyDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "balance30Days", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBalance30Days(String value) {
        return new JAXBElement<String>(_CreditCardBalance30Days_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "balance60Days", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBalance60Days(String value) {
        return new JAXBElement<String>(_CreditCardBalance60Days_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "balance90Days", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBalance90Days(String value) {
        return new JAXBElement<String>(_CreditCardBalance90Days_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "balance120Days", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBalance120Days(String value) {
        return new JAXBElement<String>(_CreditCardBalance120Days_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "balance150Days", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBalance150Days(String value) {
        return new JAXBElement<String>(_CreditCardBalance150Days_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "balance180Days", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBalance180Days(String value) {
        return new JAXBElement<String>(_CreditCardBalance180Days_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "balance210Days", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBalance210Days(String value) {
        return new JAXBElement<String>(_CreditCardBalance210Days_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pastDueBalance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPastDueBalance(String value) {
        return new JAXBElement<String>(_CreditCardPastDueBalance_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currencyCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCurrencyCode(String value) {
        return new JAXBElement<String>(_OAAATransactionCurrencyCode_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "xDayBalance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardXDayBalance(String value) {
        return new JAXBElement<String>(_CreditCardXDayBalance_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "embossedName", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEmbossedName(String value) {
        return new JAXBElement<String>(_LinkedCardsEmbossedName_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "joiningFees", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardJoiningFees(String value) {
        return new JAXBElement<String>(_CreditCardJoiningFees_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "accountName", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAccountName(String value) {
        return new JAXBElement<String>(_CreditCardAccountName_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "segmentCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSegmentCode(String value) {
        return new JAXBElement<String>(_CardCustomerSegmentCode_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "segmentCodeDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSegmentCodeDesc(String value) {
        return new JAXBElement<String>(_CreditCardSegmentCodeDesc_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "curBlockCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCurBlockCode(String value) {
        return new JAXBElement<String>(_CreditCardCurBlockCode_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "curBlockDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCurBlockDate(String value) {
        return new JAXBElement<String>(_CreditCardCurBlockDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block1", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock1(String value) {
        return new JAXBElement<String>(_CreditCardBlock1_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block1Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock1Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock1Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block2", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock2(String value) {
        return new JAXBElement<String>(_CreditCardBlock2_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block2Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock2Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock2Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block3", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock3(String value) {
        return new JAXBElement<String>(_CreditCardBlock3_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block3Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock3Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock3Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block4", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock4(String value) {
        return new JAXBElement<String>(_CreditCardBlock4_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block4Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock4Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock4Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block5", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock5(String value) {
        return new JAXBElement<String>(_CreditCardBlock5_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block5Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock5Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock5Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block6", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock6(String value) {
        return new JAXBElement<String>(_CreditCardBlock6_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block6Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock6Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock6Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block7", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock7(String value) {
        return new JAXBElement<String>(_CreditCardBlock7_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block7Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock7Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock7Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block8", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock8(String value) {
        return new JAXBElement<String>(_CreditCardBlock8_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block8Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock8Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock8Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block9", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock9(String value) {
        return new JAXBElement<String>(_CreditCardBlock9_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block9Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock9Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock9Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block10", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock10(String value) {
        return new JAXBElement<String>(_CreditCardBlock10_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block10Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock10Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock10Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block11", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock11(String value) {
        return new JAXBElement<String>(_CreditCardBlock11_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block11Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock11Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock11Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block12", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock12(String value) {
        return new JAXBElement<String>(_CreditCardBlock12_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block12Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock12Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock12Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block13", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock13(String value) {
        return new JAXBElement<String>(_CreditCardBlock13_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block13Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock13Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock13Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block14", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock14(String value) {
        return new JAXBElement<String>(_CreditCardBlock14_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block14Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock14Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock14Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block15", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock15(String value) {
        return new JAXBElement<String>(_CreditCardBlock15_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block15Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock15Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock15Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block16", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock16(String value) {
        return new JAXBElement<String>(_CreditCardBlock16_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block16Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock16Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock16Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block17", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock17(String value) {
        return new JAXBElement<String>(_CreditCardBlock17_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block17Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock17Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock17Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block18", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock18(String value) {
        return new JAXBElement<String>(_CreditCardBlock18_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block18Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock18Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock18Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block19", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock19(String value) {
        return new JAXBElement<String>(_CreditCardBlock19_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block19Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock19Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock19Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block20", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock20(String value) {
        return new JAXBElement<String>(_CreditCardBlock20_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block20Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock20Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock20Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block21", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock21(String value) {
        return new JAXBElement<String>(_CreditCardBlock21_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block21Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock21Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock21Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block22", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock22(String value) {
        return new JAXBElement<String>(_CreditCardBlock22_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block22Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock22Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock22Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block23", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock23(String value) {
        return new JAXBElement<String>(_CreditCardBlock23_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block23Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock23Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock23Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block24", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock24(String value) {
        return new JAXBElement<String>(_CreditCardBlock24_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block24Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock24Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock24Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block25", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock25(String value) {
        return new JAXBElement<String>(_CreditCardBlock25_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "block25Date", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlock25Date(String value) {
        return new JAXBElement<String>(_CreditCardBlock25Date_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nextPageKey", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNextPageKey(String value) {
        return new JAXBElement<String>(_CardCustomerNextPageKey_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pageRequest", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPageRequest(String value) {
        return new JAXBElement<String>(_CreditCardPageRequest_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCreditLimit(String value) {
        return new JAXBElement<String>(_PurgeDetailsCreditLimit_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProductCode(String value) {
        return new JAXBElement<String>(_TopupHistoryProductCode_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productCodeDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProductCodeDesc(String value) {
        return new JAXBElement<String>(_CreditCardProductCodeDesc_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCashLimit(String value) {
        return new JAXBElement<String>(_TierCashLimit_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availableCredit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAvailableCredit(String value) {
        return new JAXBElement<String>(_CreditCardAvailableCredit_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "advanceCash", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAdvanceCash(String value) {
        return new JAXBElement<String>(_CreditCardAdvanceCash_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currentBalance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCurrentBalance(String value) {
        return new JAXBElement<String>(_CardCustomerCurrentBalance_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availableCreditLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAvailableCreditLimit(String value) {
        return new JAXBElement<String>(_CreditCardAvailableCreditLimit_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailAccruedInterest", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRetailAccruedInterest(String value) {
        return new JAXBElement<String>(_CreditCardRetailAccruedInterest_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashAccruedInterest", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCashAccruedInterest(String value) {
        return new JAXBElement<String>(_CreditCardCashAccruedInterest_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "referenceNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardReferenceNo(String value) {
        return new JAXBElement<String>(_AuthTransactionReferenceNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "openedDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOpenedDate(String value) {
        return new JAXBElement<String>(_CreditCardOpenedDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "closedDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardClosedDate(String value) {
        return new JAXBElement<String>(_CreditCardClosedDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastUpdate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastUpdate(String value) {
        return new JAXBElement<String>(_CreditCardLastUpdate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "additionalAddress", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAdditionalAddress(String value) {
        return new JAXBElement<String>(_CardCustomerAdditionalAddress_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "corporateID", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCorporateID(String value) {
        return new JAXBElement<String>(_CreditCardCorporateID_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "projectedAccruedInterest", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProjectedAccruedInterest(String value) {
        return new JAXBElement<String>(_CreditCardProjectedAccruedInterest_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statementBalance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStatementBalance(String value) {
        return new JAXBElement<String>(_CreditCardStatementBalance_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "minimumDue", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMinimumDue(String value) {
        return new JAXBElement<String>(_CreditCardMinimumDue_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "postingFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPostingFlag(String value) {
        return new JAXBElement<String>(_CreditCardPostingFlag_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statementFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStatementFlag(String value) {
        return new JAXBElement<String>(_CreditCardStatementFlag_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "SCOD", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSCOD(String value) {
        return new JAXBElement<String>(_CreditCardSCOD_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "relationshipType", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRelationshipType(String value) {
        return new JAXBElement<String>(_CardCustomerRelationshipType_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "inCollectionIndicator", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardInCollectionIndicator(String value) {
        return new JAXBElement<String>(_CreditCardInCollectionIndicator_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paymentDueDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPaymentDueDate(String value) {
        return new JAXBElement<String>(_CreditCardPaymentDueDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "directDebitRoutingNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDirectDebitRoutingNo(String value) {
        return new JAXBElement<String>(_CreditCardDirectDebitRoutingNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "directDebitAccountNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDirectDebitAccountNo(String value) {
        return new JAXBElement<String>(_CreditCardDirectDebitAccountNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardCategory", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardCategory(String value) {
        return new JAXBElement<String>(_CreditCardCardCategory_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "PROBEPermCreditLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPROBEPermCreditLimit(String value) {
        return new JAXBElement<String>(_CreditCardPROBEPermCreditLimit_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "outstandingAuthAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOutstandingAuthAmt(String value) {
        return new JAXBElement<String>(_CreditCardOutstandingAuthAmt_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfTotalTrans", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNoOfTotalTrans(String value) {
        return new JAXBElement<String>(_CreditCardNoOfTotalTrans_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfBilledTrans", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNoOfBilledTrans(String value) {
        return new JAXBElement<String>(_CreditCardNoOfBilledTrans_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfUnbilledTrans", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNoOfUnbilledTrans(String value) {
        return new JAXBElement<String>(_CreditCardNoOfUnbilledTrans_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "entityID", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEntityID(String value) {
        return new JAXBElement<String>(_CardCustomerEntityID_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "entityType", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEntityType(String value) {
        return new JAXBElement<String>(_CardCustomerEntityType_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "userID", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardUserID(String value) {
        return new JAXBElement<String>(_NotesDataUserID_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "hostID", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardHostID(String value) {
        return new JAXBElement<String>(_CreditCardHostID_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "functionCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFunctionCode(String value) {
        return new JAXBElement<String>(_MerchandiseDetailFunctionCode_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "subFunctionCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSubFunctionCode(String value) {
        return new JAXBElement<String>(_CreditCardSubFunctionCode_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pageTotal", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPageTotal(String value) {
        return new JAXBElement<String>(_CreditCardPageTotal_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "organisationNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOrganisationNo(String value) {
        return new JAXBElement<String>(_CardSummaryDtlOrganisationNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "requestFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRequestFlag(String value) {
        return new JAXBElement<String>(_CardCustomerRequestFlag_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastSyncDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastSyncDate(String value) {
        return new JAXBElement<String>(_CreditCardLastSyncDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardProfile", scope = CreditCard.class)
    public JAXBElement<CardProfile> createCreditCardCardProfile(CardProfile value) {
        return new JAXBElement<CardProfile>(_CreditCardCardProfile_QNAME, CardProfile.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "temporaryCreditLimitEffDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTemporaryCreditLimitEffDate(String value) {
        return new JAXBElement<String>(_CreditCardTemporaryCreditLimitEffDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "permanentThershold", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPermanentThershold(String value) {
        return new JAXBElement<String>(_CreditCardPermanentThershold_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "temporaryThershold", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTemporaryThershold(String value) {
        return new JAXBElement<String>(_CreditCardTemporaryThershold_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "timeXDays", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTimeXDays(String value) {
        return new JAXBElement<String>(_CreditCardTimeXDays_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "time30Days", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTime30Days(String value) {
        return new JAXBElement<String>(_CreditCardTime30Days_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "time60Days", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTime60Days(String value) {
        return new JAXBElement<String>(_CreditCardTime60Days_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "time90Days", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTime90Days(String value) {
        return new JAXBElement<String>(_CreditCardTime90Days_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "time120Days", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTime120Days(String value) {
        return new JAXBElement<String>(_CreditCardTime120Days_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "time150Days", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTime150Days(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "time150Days"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "time180Days", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTime180Days(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "time180Days"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "time210Days", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTime210Days(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "time210Days"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "accountNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAccountNo(String value) {
        return new JAXBElement<String>(_AirportParkingAccountNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "corporateCustDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCorporateCustDesc(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "corporateCustDesc"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custRiskGrade", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustRiskGrade(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "custRiskGrade"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custRiskGradeDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustRiskGradeDesc(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "custRiskGradeDesc"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "dateRiskChange", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDateRiskChange(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "dateRiskChange"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ddaAcctNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDdaAcctNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "ddaAcctNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ddaBank", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDdaBank(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "ddaBank"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "DDASwiftBIC", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDDASwiftBIC(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "DDASwiftBIC"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ddaBankDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDdaBankDesc(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "ddaBankDesc"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "collateral", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCollateral(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "collateral"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "systemID", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSystemID(String value) {
        return new JAXBElement<String>(_CardCustomerSystemID_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statementCycle", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStatementCycle(String value) {
        return new JAXBElement<String>(_CardCustomerStatementCycle_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "functionID", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFunctionID(String value) {
        return new JAXBElement<String>(_CardCustomerFunctionID_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prevStmtBalance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPrevStmtBalance(String value) {
        return new JAXBElement<String>(_CardDetailsPrevStmtBalance_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalpointsForteited", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTotalpointsForteited(String value) {
        return new JAXBElement<String>(_CardCustomerTotalpointsForteited_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsEarned", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPointsEarned(String value) {
        return new JAXBElement<String>(_CardDetailsPointsEarned_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointEarnedToday", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPointEarnedToday(String value) {
        return new JAXBElement<String>(_EarnDetailsPointEarnedToday_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsUsed", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPointsUsed(String value) {
        return new JAXBElement<String>(_CardDetailsPointsUsed_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nextCashBackDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNextCashBackDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "nextCashBackDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsEarnedYTD", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPointsEarnedYTD(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "pointsEarnedYTD"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "panBankInd", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPanBankInd(String value) {
        return new JAXBElement<String>(_CardDetailsPanBankInd_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "limitFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLimitFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "limitFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashPymntAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCashPymntAmt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cashPymntAmt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "retailPymntAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRetailPymntAmt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "retailPymntAmt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalBalance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTotalBalance(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "totalBalance"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastStatementDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastStatementDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "lastStatementDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "affinityGroupNumber", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAffinityGroupNumber(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "affinityGroupNumber"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pmntApportionment", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPmntApportionment(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "pmntApportionment"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pmntApportionmentExpDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPmntApportionmentExpDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "pmntApportionmentExpDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "accountType", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAccountType(String value) {
        return new JAXBElement<String>(_CallInTxnsAccountType_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "issuedDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardIssuedDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "issuedDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "sendDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSendDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "sendDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "OLCLetterDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOLCLetterDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "OLCLetterDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "warningReportDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardWarningReportDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "warningReportDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "remarks", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRemarks(String value) {
        return new JAXBElement<String>(_IDRPDtlsRemarks_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "deliveryDemo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDeliveryDemo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "deliveryDemo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "deliveryMemo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDeliveryMemo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "deliveryMemo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "acknowledgementStatus", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAcknowledgementStatus(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "acknowledgementStatus"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "acknowledgementStatusDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAcknowledgementStatusDesc(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "acknowledgementStatusDesc"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "registerNumber", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRegisterNumber(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "registerNumber"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "zipCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardZipCode(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "zipCode"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mailingDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMailingDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "mailingDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "processDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProcessDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "processDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "createdDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCreatedDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "createdDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "numberOfTxnsYTD", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNumberOfTxnsYTD(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "numberOfTxnsYTD"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "txnAmountYTD", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTxnAmountYTD(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "txnAmountYTD"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "barcodeNumber", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBarcodeNumber(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "barcodeNumber"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "NCCCMerchantCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNCCCMerchantCode(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "NCCCMerchantCode"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "itemNumber", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardItemNumber(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "itemNumber"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "numberOfCards", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNumberOfCards(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "numberOfCards"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "returnReason", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardReturnReason(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "returnReason"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "returnReasonDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardReturnReasonDesc(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "returnReasonDesc"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "customerID", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustomerID(String value) {
        return new JAXBElement<String>(_CardCustomerCustomerID_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "altCustID", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAltCustID(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "altCustID"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "customerName", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustomerName(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "customerName"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CCAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "Address", scope = CreditCard.class)
    public JAXBElement<CCAddress> createCreditCardAddress(CCAddress value) {
        return new JAXBElement<CCAddress>(_IDRPDtlsAddress_QNAME, CCAddress.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "actionDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardActionDate(String value) {
        return new JAXBElement<String>(_MemoActionDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "actionTaken", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardActionTaken(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "actionTaken"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "actionTakenDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardActionTakenDesc(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "actionTakenDesc"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pickupDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPickupDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "pickupDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "addressChanged", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAddressChanged(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "addressChanged"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "returnDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardReturnDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "returnDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "orderNumber", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOrderNumber(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "orderNumber"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "orderDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOrderDate(String value) {
        return new JAXBElement<String>(_RedemptionProductOrderDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "deliveryDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDeliveryDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "deliveryDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "receivedDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardReceivedDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "receivedDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "processDays", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProcessDays(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "processDays"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "vendor", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardVendor(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "vendor"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "vendorDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardVendorDesc(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "vendorDesc"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productName", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProductName(String value) {
        return new JAXBElement<String>(_RedemptionProductProductName_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productType", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProductType(String value) {
        return new JAXBElement<String>(_PLCCardDetailsProductType_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productTypeDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProductTypeDesc(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "productTypeDesc"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "redeemDollars", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRedeemDollars(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "redeemDollars"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashPayment", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCashPayment(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cashPayment"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "productNumber", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProductNumber(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "productNumber"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "customerNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustomerNo(String value) {
        return new JAXBElement<String>(_TransactionCustomerNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "applicationNumber", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardApplicationNumber(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "applicationNumber"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "applicationDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardApplicationDate(String value) {
        return new JAXBElement<String>(_IDRPDtlsApplicationDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transmissionDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTransmissionDate(String value) {
        return new JAXBElement<String>(_PLCCardDetailsTransmissionDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "batchNumber", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBatchNumber(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "batchNumber"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "amountApplied", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAmountApplied(String value) {
        return new JAXBElement<String>(_PLCCardDetailsAmountApplied_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "remitAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRemitAmount(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "remitAmount"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tenure", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTenure(String value) {
        return new JAXBElement<String>(_InstallmentPlanTenure_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "remitDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRemitDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "remitDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "feeCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFeeCode(String value) {
        return new JAXBElement<String>(_PLCCardDetailsFeeCode_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paymentMode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPaymentMode(String value) {
        return new JAXBElement<String>(_PLCCardDetailsPaymentMode_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currentBlockCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCurrentBlockCode(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "currentBlockCode"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currentBlockDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCurrentBlockDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "currentBlockDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paymentIndicator", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPaymentIndicator(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "paymentIndicator"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availableFundTransferLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAvailableFundTransferLimit(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "availableFundTransferLimit"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashAdvOKFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCashAdvOKFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cashAdvOKFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "fundXferOKFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFundXferOKFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "fundXferOKFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfVisitThisYear", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNoOfVisitThisYear(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "noOfVisitThisYear"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfVisitLastYear", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNoOfVisitLastYear(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "noOfVisitLastYear"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalFeeChargedCurrentYear", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTotalFeeChargedCurrentYear(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "totalFeeChargedCurrentYear"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalFeeChargedLastYear", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTotalFeeChargedLastYear(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "totalFeeChargedLastYear"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfFreeVisitUsed", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNoOfFreeVisitUsed(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "noOfFreeVisitUsed"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "activationFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardActivationFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "activationFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "PermanentCashLimitPercent", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPermanentCashLimitPercent(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "PermanentCashLimitPercent"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashLimitMatrixPercent", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCashLimitMatrixPercent(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cashLimitMatrixPercent"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "CashLimitPercent", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCashLimitPercent(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "CashLimitPercent"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tmpCashLimitPercent", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTmpCashLimitPercent(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "tmpCashLimitPercent"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "amount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAmount(String value) {
        return new JAXBElement<String>(_OAAATransactionAmount_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "offeringCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOfferingCode(String value) {
        return new JAXBElement<String>(_CardDetailsOfferingCode_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "SIDebitAcctNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSIDebitAcctNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "SIDebitAcctNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "repaymentScore", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRepaymentScore(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "repaymentScore"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfParkingThisYear", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNoOfParkingThisYear(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "noOfParkingThisYear"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfParkinLastYear", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNoOfParkinLastYear(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "noOfParkinLastYear"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalParkingFeeChargedCurrentYear", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTotalParkingFeeChargedCurrentYear(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "totalParkingFeeChargedCurrentYear"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalParkingFeeChargedLastYear", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTotalParkingFeeChargedLastYear(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "totalParkingFeeChargedLastYear"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfFreeParkingUsed", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNoOfFreeParkingUsed(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "noOfFreeParkingUsed"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "reversalFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardReversalFlag(String value) {
        return new JAXBElement<String>(_TransactionReversalFlag_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mpsLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMpsLimit(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "mpsLimit"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mpsAvailLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMpsAvailLimit(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "mpsAvailLimit"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mpsExpiryDt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMpsExpiryDt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "mpsExpiryDt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mps1LimitUsed", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMps1LimitUsed(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "mps1LimitUsed"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mps1AcctLimitUsed", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMps1AcctLimitUsed(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "mps1AcctLimitUsed"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mps1LastReqDt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMps1LastReqDt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "mps1LastReqDt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mps1LastReqOnTempLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMps1LastReqOnTempLimit(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "mps1LastReqOnTempLimit"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mps2LimitUsed", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMps2LimitUsed(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "mps2LimitUsed"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mps2AcctLimitUsed", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMps2AcctLimitUsed(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "mps2AcctLimitUsed"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "mps3AcctLimitUsed", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMps3AcctLimitUsed(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "mps3AcctLimitUsed"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "firstIntWaiverDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFirstIntWaiverDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "firstIntWaiverDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "waivePenaltyIntCount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardWaivePenaltyIntCount(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "waivePenaltyIntCount"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastResetDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastResetDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "lastResetDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availableCreditLimit2", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAvailableCreditLimit2(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "availableCreditLimit2"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availableCashLimit2", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAvailableCashLimit2(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "availableCashLimit2"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "revolverFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRevolverFlag(String value) {
        return new JAXBElement<String>(_ThirteenMonthRevolverFlag_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prefMerchant", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPrefMerchant(String value) {
        return new JAXBElement<String>(_EarnDetailsPrefMerchant_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "capReachDtOverall", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCapReachDtOverall(String value) {
        return new JAXBElement<String>(_EarnDetailsCapReachDtOverall_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "capReachDtatPrefMerchant", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCapReachDtatPrefMerchant(String value) {
        return new JAXBElement<String>(_EarnDetailsCapReachDtatPrefMerchant_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "noOfTotalRPCTrans", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNoOfTotalRPCTrans(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "noOfTotalRPCTrans"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "programCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProgramCode(String value) {
        return new JAXBElement<String>(_TopupHistoryProgramCode_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "octopusCardNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOctopusCardNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "octopusCardNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "status", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStatus(String value) {
        return new JAXBElement<String>(_PrimaryCardStatus_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rejectReasonCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRejectReasonCode(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "rejectReasonCode"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "interestRate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardInterestRate(String value) {
        return new JAXBElement<String>(_IDRPDtlsInterestRate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "flatRate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFlatRate(String value) {
        return new JAXBElement<String>(_TopupHistoryFlatRate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tenor", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTenor(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "tenor"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "topupAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTopupAmt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "topupAmt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "topupDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTopupDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "topupDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "topupFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTopupFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "topupFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rewriteFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRewriteFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "rewriteFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "sequenceNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSequenceNo(String value) {
        return new JAXBElement<String>(_TopupHistorySequenceNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statusUpdate", scope = CreditCard.class)
    public JAXBElement<MaintInfo> createCreditCardStatusUpdate(MaintInfo value) {
        return new JAXBElement<MaintInfo>(new QName("http://entity.cards.common.scb", "statusUpdate"), MaintInfo.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blackList", scope = CreditCard.class)
    public JAXBElement<MaintInfo> createCreditCardBlackList(MaintInfo value) {
        return new JAXBElement<MaintInfo>(new QName("http://entity.cards.common.scb", "blackList"), MaintInfo.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "activeCount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardActiveCount(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "activeCount"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "openingBalance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOpeningBalance(String value) {
        return new JAXBElement<String>(_BalanceHistoryOpeningBalance_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsEarnedBilled", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPointsEarnedBilled(String value) {
        return new JAXBElement<String>(_RewardSummaryPointsEarnedBilled_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsRedeemedBilled", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPointsRedeemedBilled(String value) {
        return new JAXBElement<String>(_RewardSummaryPointsRedeemedBilled_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsEarnedUnbilled", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPointsEarnedUnbilled(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "pointsEarnedUnbilled"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsRedeemedUnbilled", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPointsRedeemedUnbilled(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "pointsRedeemedUnbilled"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availableBalance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAvailableBalance(String value) {
        return new JAXBElement<String>(_RewardAvailableBalance_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "expiryDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardExpiryDate(String value) {
        return new JAXBElement<String>(_PriorityPassDetailExpiryDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastMinPymtDue", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastMinPymtDue(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "lastMinPymtDue"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custAvailableCash", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustAvailableCash(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "custAvailableCash"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custCreditLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustCreditLimit(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "custCreditLimit"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custAvailableCredit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustAvailableCredit(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "custAvailableCredit"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "postDueFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPostDueFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "postDueFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "bonusRewardPoints", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBonusRewardPoints(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "bonusRewardPoints"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "consolidatedCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardConsolidatedCode(String value) {
        return new JAXBElement<String>(_CardCustomerConsolidatedCode_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "linkedAcctNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLinkedAcctNo(String value) {
        return new JAXBElement<String>(_MerchandiseDetailLinkedAcctNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "orderAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOrderAmt(String value) {
        return new JAXBElement<String>(_MerchandiseDetailOrderAmt_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastBillNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastBillNo(String value) {
        return new JAXBElement<String>(_MerchandiseDetailLastBillNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastBillDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastBillDate(String value) {
        return new JAXBElement<String>(_MerchandiseDetailLastBillDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastBillAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastBillAmt(String value) {
        return new JAXBElement<String>(_MerchandiseDetailLastBillAmt_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "debtorRefNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDebtorRefNo(String value) {
        return new JAXBElement<String>(_ServiceDebtorRefNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statusUpdatedate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStatusUpdatedate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "statusUpdatedate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blacklistFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlacklistFlag(String value) {
        return new JAXBElement<String>(_ServiceBlacklistFlag_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blacklistReason", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlacklistReason(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "blacklistReason"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blacklistDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlacklistDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "blacklistDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "openDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOpenDate(String value) {
        return new JAXBElement<String>(_PurgeDetailsOpenDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "reloadAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardReloadAmt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "reloadAmt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "autoPayAcctNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAutoPayAcctNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "autoPayAcctNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "futureExpiryDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFutureExpiryDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "futureExpiryDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ackUserId", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAckUserId(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "ackUserId"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ackDtSurfMail", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAckDtSurfMail(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "ackDtSurfMail"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ackDtRegMail", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAckDtRegMail(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "ackDtRegMail"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "perpetuityPin", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPerpetuityPin(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "perpetuityPin"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "flexiPay", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFlexiPay(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "flexiPay"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "srcCode", scope = CreditCard.class)
    public JAXBElement<CodeDesc> createCreditCardSrcCode(CodeDesc value) {
        return new JAXBElement<CodeDesc>(new QName("http://entity.cards.common.scb", "srcCode"), CodeDesc.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "atmLang", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAtmLang(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "atmLang"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "insureCode", scope = CreditCard.class)
    public JAXBElement<CodeDesc> createCreditCardInsureCode(CodeDesc value) {
        return new JAXBElement<CodeDesc>(new QName("http://entity.cards.common.scb", "insureCode"), CodeDesc.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "currExpiryDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCurrExpiryDate(String value) {
        return new JAXBElement<String>(_TransactionCurrExpiryDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lateNoticesDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLateNoticesDesc(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "lateNoticesDesc"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "serviceChargesDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardServiceChargesDesc(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "serviceChargesDesc"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "alternateBlockCodeDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAlternateBlockCodeDesc(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "alternateBlockCodeDesc"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "organisation", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOrganisation(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "organisation"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "action", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAction(String value) {
        return new JAXBElement<String>(_SupplimentCardAction_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "actionDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardActionDesc(String value) {
        return new JAXBElement<String>(_SupplimentCardActionDesc_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "sequence", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSequence(String value) {
        return new JAXBElement<String>(_SupplimentCardSequence_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardsRequested", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardsRequested(String value) {
        return new JAXBElement<String>(_SupplimentCardCardsRequested_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "supplementaryCards", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSupplementaryCards(String value) {
        return new JAXBElement<String>(_SupplimentCardSupplementaryCards_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "supplementaryCardsDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSupplementaryCardsDesc(String value) {
        return new JAXBElement<String>(_SupplimentCardSupplementaryCardsDesc_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardsIssued", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardsIssued(String value) {
        return new JAXBElement<String>(_SupplimentCardCardsIssued_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardsReturned", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardsReturned(String value) {
        return new JAXBElement<String>(_SupplimentCardCardsReturned_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prevAction", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPrevAction(String value) {
        return new JAXBElement<String>(_SupplimentCardPrevAction_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "prevActionDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPrevActionDesc(String value) {
        return new JAXBElement<String>(_SupplimentCardPrevActionDesc_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardFeatures", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardFeatures(String value) {
        return new JAXBElement<String>(_SupplimentCardCardFeatures_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastExpiryDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastExpiryDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "lastExpiryDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "profile01To06", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProfile01To06(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "profile01To06"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "profile07To12", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProfile07To12(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "profile07To12"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "profile13To18", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProfile13To18(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "profile13To18"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "profile19To24", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProfile19To24(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "profile19To24"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "CurrentTierRate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCurrentTierRate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "CurrentTierRate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "previousTierRate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPreviousTierRate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "previousTierRate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "profileLastEffDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProfileLastEffDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "profileLastEffDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "profileLastMaintDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProfileLastMaintDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "profileLastMaintDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "primaryBlockCodeDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPrimaryBlockCodeDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "primaryBlockCodeDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "CVI", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCVI(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "CVI"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "principalCardFee", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPrincipalCardFee(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "principalCardFee"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "supplementaryCardFee", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSupplementaryCardFee(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "supplementaryCardFee"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nextStatementDt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNextStatementDt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "nextStatementDt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pymtApportionmentFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPymtApportionmentFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "pymtApportionmentFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "fullPymt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFullPymt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "fullPymt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "directDebitBank", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDirectDebitBank(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "directDebitBank"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastActivityDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastActivityDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "lastActivityDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "overLimitOption", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOverLimitOption(String value) {
        return new JAXBElement<String>(_CardCustomerOverLimitOption_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tierEffectiveDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTierEffectiveDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "tierEffectiveDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "newAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNewAmt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "newAmt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "stmtCycle", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStmtCycle(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "stmtCycle"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "hoganCustIDInclusiveIDType", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardHoganCustIDInclusiveIDType(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "hoganCustIDInclusiveIDType"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "highYieldCAAcctNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardHighYieldCAAcctNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "highYieldCAAcctNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statementDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStatementDate(String value) {
        return new JAXBElement<String>(_MonthlyInstallmentDetailsStatementDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "requestType", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRequestType(String value) {
        return new JAXBElement<String>(_PastTransactionsRequestType_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardOrganization", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardOrganization(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cardOrganization"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardNo(String value) {
        return new JAXBElement<String>(_LinkedCardsCardNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "embosserName", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEmbosserName(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "embosserName"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statusFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStatusFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "statusFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statusDateChange", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStatusDateChange(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "statusDateChange"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "statusTimeChange", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStatusTimeChange(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "statusTimeChange"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "phoneNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPhoneNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "phoneNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardActivationChannel", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardActivationChannel(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cardActivationChannel"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardActivationDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardActivationDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cardActivationDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardActivationTime", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardActivationTime(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cardActivationTime"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardDeActivationChannel", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardDeActivationChannel(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cardDeActivationChannel"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardDeActivationDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardDeActivationDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cardDeActivationDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardDeActivationTime", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardDeActivationTime(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cardDeActivationTime"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "sourceFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSourceFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "sourceFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "serviceRequestor", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardServiceRequestor(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "serviceRequestor"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custIDType", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustIDType(String value) {
        return new JAXBElement<String>(_CardCustomerCustIDType_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custIDNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustIDNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "custIDNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pageNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPageNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "pageNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardInd", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardInd(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cardInd"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "returnCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardReturnCode(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "returnCode"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "returnDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardReturnDesc(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "returnDesc"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "moreRecordInd", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMoreRecordInd(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "moreRecordInd"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "poBox", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPoBox(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "poBox"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "postCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPostCode(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "postCode"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "dateofBirth", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDateofBirth(String value) {
        return new JAXBElement<String>(_CardCustomerDateofBirth_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custCurrTotalPointsSIGN", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustCurrTotalPointsSIGN(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "custCurrTotalPointsSIGN"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custCurrTotalPoints", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustCurrTotalPoints(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "custCurrTotalPoints"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custCurrTotalCashDollarBalSign", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustCurrTotalCashDollarBalSign(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "custCurrTotalCashDollarBalSign"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custCurrTotalCashDollarBal", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustCurrTotalCashDollarBal(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "custCurrTotalCashDollarBal"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "redemFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRedemFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "redemFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "redemType", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRedemType(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "redemType"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "orderDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOrderDesc(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "orderDesc"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardExpMonth", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardExpMonth(String value) {
        return new JAXBElement<String>(_CardDetailsCardExpMonth_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardExpYear", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardExpYear(String value) {
        return new JAXBElement<String>(_CardDetailsCardExpYear_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "redemPoints", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRedemPoints(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "redemPoints"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashRedem", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCashRedem(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cashRedem"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "topUpAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTopUpAmt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "topUpAmt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashBackAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCashBackAmt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cashBackAmt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTranDate(String value) {
        return new JAXBElement<String>(_TransactionDetailsTranDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranTime", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTranTime(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "tranTime"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranAuthCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTranAuthCode(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "tranAuthCode"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "processingFeeAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardProcessingFeeAmt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "processingFeeAmt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "topUpStmtDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTopUpStmtDesc(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "topUpStmtDesc"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "feeStmtDesc", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFeeStmtDesc(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "feeStmtDesc"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custPointsBal", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustPointsBal(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "custPointsBal"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custCashDollarBal", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustCashDollarBal(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "custCashDollarBal"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "authCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAuthCode(String value) {
        return new JAXBElement<String>(_TransactionDetailsAuthCode_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardNoAuth", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardNoAuth(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cardNoAuth"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "primaryShadowAcctNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPrimaryShadowAcctNo(String value) {
        return new JAXBElement<String>(_TransactionDetailsPrimaryShadowAcctNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transferCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTransferCode(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "transferCode"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "senderCardNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSenderCardNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "senderCardNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "receiverCardNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardReceiverCardNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "receiverCardNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pointsToBeTransferred", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPointsToBeTransferred(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "pointsToBeTransferred"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transferFeeAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTransferFeeAmt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "transferFeeAmt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "senderPrimaryShadowAcct", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSenderPrimaryShadowAcct(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "senderPrimaryShadowAcct"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "receiverPrimaryShadowAcct", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardReceiverPrimaryShadowAcct(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "receiverPrimaryShadowAcct"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "minpointsReqTransfer", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMinpointsReqTransfer(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "minpointsReqTransfer"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "maxpointsallowtransfer", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMaxpointsallowtransfer(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "maxpointsallowtransfer"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "operatorID", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOperatorID(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "operatorID"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availaCreditLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAvailaCreditLimit(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "availaCreditLimit"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availaCashLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAvailaCashLimit(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "availaCashLimit"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditLmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCreditLmt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "creditLmt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardExpyDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardExpyDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cardExpyDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastMinAmountDue", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastMinAmountDue(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "lastMinAmountDue"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "consolidateCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardConsolidateCode(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "consolidateCode"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pastDueFlg", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPastDueFlg(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "pastDueFlg"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "crmODRowId", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCrmODRowId(String value) {
        return new JAXBElement<String>(_CardCustomerCrmODRowId_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "subProduct", scope = CreditCard.class)
    public JAXBElement<CodeDesc> createCreditCardSubProduct(CodeDesc value) {
        return new JAXBElement<CodeDesc>(new QName("http://entity.cards.common.scb", "subProduct"), CodeDesc.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "branch", scope = CreditCard.class)
    public JAXBElement<CodeDesc> createCreditCardBranch(CodeDesc value) {
        return new JAXBElement<CodeDesc>(_CallInTxnsBranch_QNAME, CodeDesc.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "referralId", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardReferralId(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "referralId"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "sourcingId", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSourcingId(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "sourcingId"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "closingId", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardClosingId(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "closingId"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastStmtDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastStmtDate(String value) {
        return new JAXBElement<String>(_CardDetailsLastStmtDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rewardPointPrintedCurrentQuarter", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRewardPointPrintedCurrentQuarter(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "rewardPointPrintedCurrentQuarter"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "clientId", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardClientId(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "clientId"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tokenId", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTokenId(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "tokenId"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "firstOTP", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFirstOTP(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "firstOTP"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "secondOTP", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSecondOTP(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "secondOTP"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tokenCardInd", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTokenCardInd(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "tokenCardInd"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tokenStatus", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTokenStatus(String value) {
        return new JAXBElement<String>(_TokenCardListTokenStatus_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ddaPercentage", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDdaPercentage(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "ddaPercentage"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ddaAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDdaAmount(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "ddaAmount"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalStmtBal", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTotalStmtBal(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "totalStmtBal"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nickName", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNickName(String value) {
        return new JAXBElement<String>(_CardCustomerNickName_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "coOwner", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCoOwner(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "coOwner"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "coOwnerOfficePhoneNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCoOwnerOfficePhoneNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "coOwnerOfficePhoneNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "memoLine", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMemoLine(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "memoLine"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardEmbossName", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardEmbossName(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cardEmbossName"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "nricNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNricNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "nricNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tempBranch", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTempBranch(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "tempBranch"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "agentId", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAgentId(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "agentId"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tempLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTempLimit(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "tempLimit"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tempLimitExpDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTempLimitExpDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "tempLimitExpDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "reasonOfRequest", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardReasonOfRequest(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "reasonOfRequest"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "approveOrDecline", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardApproveOrDecline(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "approveOrDecline"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "approvalAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardApprovalAmt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "approvalAmt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "declineReason", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDeclineReason(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "declineReason"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastPaymentAmtFCY", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastPaymentAmtFCY(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "lastPaymentAmtFCY"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pastDueAmountFCY", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPastDueAmountFCY(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "pastDueAmountFCY"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "minPaymentFCY", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMinPaymentFCY(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "minPaymentFCY"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "balanceFCY", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBalanceFCY(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "balanceFCY"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "minPaymentLCY", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMinPaymentLCY(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "minPaymentLCY"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "balanceLCY", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBalanceLCY(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "balanceLCY"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "chipType", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardChipType(String value) {
        return new JAXBElement<String>(_SupplimentCardChipType_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "startDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStartDate(String value) {
        return new JAXBElement<String>(_AirportParkingStartDate_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "endDate", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEndDate(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "endDate"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custOrgNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustOrgNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "custOrgNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionCardNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTransactionCardNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "transactionCardNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionCardType", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTransactionCardType(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "transactionCardType"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionOrgNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTransactionOrgNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "transactionOrgNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "outOfBalanceFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOutOfBalanceFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "outOfBalanceFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "dualMailingFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardDualMailingFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "dualMailingFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "summaryInd", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSummaryInd(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "summaryInd"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "secondaryCustOrg", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSecondaryCustOrg(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "secondaryCustOrg"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "secondaryCustNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSecondaryCustNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "secondaryCustNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "previousBlockCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPreviousBlockCode(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "previousBlockCode"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "earnedCycleDt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEarnedCycleDt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "earnedCycleDt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "usedCycleDt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardUsedCycleDt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "usedCycleDt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "totalBilledTransaction", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTotalBilledTransaction(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "totalBilledTransaction"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranType", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTranType(String value) {
        return new JAXBElement<String>(_LineBurnTranType_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "bankNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBankNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "bankNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "srcName", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSrcName(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "srcName"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "branchNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBranchNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "branchNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "operandNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOperandNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "operandNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pinFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPinFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "pinFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "pin", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPin(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "pin"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "outstandBalFCY", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOutstandBalFCY(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "outstandBalFCY"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "creditLimitFCY", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCreditLimitFCY(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "creditLimitFCY"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availableCreditLimitFCY", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAvailableCreditLimitFCY(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "availableCreditLimitFCY"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cashLimitFCY", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCashLimitFCY(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cashLimitFCY"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "availableCashLimitFCY", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAvailableCashLimitFCY(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "availableCashLimitFCY"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "balCcyCodeFCY", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBalCcyCodeFCY(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "balCcyCodeFCY"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "limitCcyCodeFCY", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLimitCcyCodeFCY(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "limitCcyCodeFCY"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rewardFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRewardFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "rewardFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "checkFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCheckFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "checkFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "points", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPoints(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "points"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "startDt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStartDt(String value) {
        return new JAXBElement<String>(_TaxDetStartDt_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "endDt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEndDt(String value) {
        return new JAXBElement<String>(_CampaignDetEndDt_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "rtnInd", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRtnInd(String value) {
        return new JAXBElement<String>(_CardCustomerRtnInd_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranMonth", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTranMonth(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "tranMonth"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "postingDt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPostingDt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "postingDt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTranNo(String value) {
        return new JAXBElement<String>(_CampaignDetTranNo_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranYr", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTranYr(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "tranYr"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "option", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOption(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "option"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "enquiryFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEnquiryFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "enquiryFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "idType", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardIdType(String value) {
        return new JAXBElement<String>(_ServiceIdType_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "notesDt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNotesDt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "notesDt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "memoDt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMemoDt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "memoDt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "blockDt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBlockDt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "blockDt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paidAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPaidAmt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "paidAmt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "adjustmentAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAdjustmentAmt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "adjustmentAmt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "interest", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardInterest(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "interest"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "newBalance", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNewBalance(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "newBalance"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "lastUpdatedTime", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastUpdatedTime(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "lastUpdatedTime"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "primaryCreditCardNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPrimaryCreditCardNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "primaryCreditCardNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "flag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "flag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "stmtDay", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStmtDay(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "stmtDay"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "custCategory", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCustCategory(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "custCategory"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "groupAccNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardGroupAccNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "groupAccNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "friendName", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFriendName(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "friendName"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "favoriteCity", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFavoriteCity(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "favoriteCity"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "favoriteColor", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFavoriteColor(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "favoriteColor"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "cardStatus", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardStatus(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "cardStatus"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "suppCardInd", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSuppCardInd(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "suppCardInd"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "overCode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOverCode(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "overCode"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "appOrigin", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAppOrigin(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "appOrigin"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "embossingDt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEmbossingDt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "embossingDt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "firstYrFeeAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFirstYrFeeAmt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "firstYrFeeAmt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "stmtMode", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardStmtMode(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "stmtMode"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "eMail", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEMail(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "eMail"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "housing", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardHousing(String value) {
        return new JAXBElement<String>(_CCAddressHousing_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "housingExt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardHousingExt(String value) {
        return new JAXBElement<String>(_CCAddressHousingExt_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "groupAccBal", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardGroupAccBal(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "groupAccBal"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "groupAccAuthBal", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardGroupAccAuthBal(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "groupAccAuthBal"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "groupAccOutstandBal", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardGroupAccOutstandBal(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "groupAccOutstandBal"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "groupAccCashOutstandBal", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardGroupAccCashOutstandBal(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "groupAccCashOutstandBal"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "groupAccLimit", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardGroupAccLimit(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "groupAccLimit"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "tranGroup", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTranGroup(String value) {
        return new JAXBElement<String>(_SubAcctDtlTranGroup_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "period", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPeriod(String value) {
        return new JAXBElement<String>(_PaymentHistoryPeriod_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "earlySettlementDt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardEarlySettlementDt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "earlySettlementDt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "arrearsFee", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardArrearsFee(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "arrearsFee"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "overLimitFee", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOverLimitFee(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "overLimitFee"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "transactionFee", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardTransactionFee(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "transactionFee"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "governTaxes", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardGovernTaxes(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "governTaxes"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "preClosurePenalty", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPreClosurePenalty(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "preClosurePenalty"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "instPlanBal", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardInstPlanBal(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "instPlanBal"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "acctCcy", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAcctCcy(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "acctCcy"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "fixedInstAmt", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFixedInstAmt(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "fixedInstAmt"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "relshipNo", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardRelshipNo(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "relshipNo"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "primaryCust", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPrimaryCust(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "primaryCust"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "notesStored", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardNotesStored(String value) {
        return new JAXBElement<String>(_NotesNotesStored_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "checkingAccount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCheckingAccount(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "checkingAccount"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "savingsAccount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSavingsAccount(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "savingsAccount"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "userAccount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardUserAccount(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "userAccount"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "paymentFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPaymentFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "paymentFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "PDDMAmountDue", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardPDDMAmountDue(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "PDDMAmountDue"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "ownershipFlag", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOwnershipFlag(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "ownershipFlag"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "maximumSpecialAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMaximumSpecialAmount(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "maximumSpecialAmount"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "maximumOverseasAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMaximumOverseasAmount(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "maximumOverseasAmount"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "maximumNormAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMaximumNormAmount(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "maximumNormAmount"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "monthlyInstallmentAmountSpecial", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMonthlyInstallmentAmountSpecial(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "monthlyInstallmentAmountSpecial"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "handlingFeePercentageSpecial", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardHandlingFeePercentageSpecial(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "handlingFeePercentageSpecial"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "handlingFeeAmountSpecial", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardHandlingFeeAmountSpecial(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "handlingFeeAmountSpecial"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "monthlyInstallmentAmountOversea", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMonthlyInstallmentAmountOversea(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "monthlyInstallmentAmountOversea"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "handlingFeePercentageOversea", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardHandlingFeePercentageOversea(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "handlingFeePercentageOversea"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "handlingFeeAmountOversea", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardHandlingFeeAmountOversea(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "handlingFeeAmountOversea"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "monthlyInstallmentAmountNormal", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardMonthlyInstallmentAmountNormal(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "monthlyInstallmentAmountNormal"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "handlingFeePercentageNormal", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardHandlingFeePercentageNormal(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "handlingFeePercentageNormal"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "handlingFeeAmountNormal", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardHandlingFeeAmountNormal(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "handlingFeeAmountNormal"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "specialProductAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardSpecialProductAmount(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "specialProductAmount"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "overseasProductAmount", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardOverseasProductAmount(String value) {
        return new JAXBElement<String>(new QName("http://entity.cards.common.scb", "overseasProductAmount"), String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "contactlessIndicator", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardContactlessIndicator(String value) {
        return new JAXBElement<String>(_SupplimentCardContactlessIndicator_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.cards.common.scb", name = "Response", scope = CreditCard.class)
    public JAXBElement<ServiceResponse> createCreditCardResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_CardCustomerResponse_QNAME, ServiceResponse.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fault.service.common.scb", name = "code", scope = ServiceFault.class)
    public JAXBElement<String> createServiceFaultCode(String value) {
        return new JAXBElement<String>(new QName("http://fault.service.common.scb", "code"), String.class, ServiceFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fault.service.common.scb", name = "reason", scope = ServiceFault.class)
    public JAXBElement<String> createServiceFaultReason(String value) {
        return new JAXBElement<String>(new QName("http://fault.service.common.scb", "reason"), String.class, ServiceFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fault.service.common.scb", name = "code", scope = SecurityFault.class)
    public JAXBElement<String> createSecurityFaultCode(String value) {
        return new JAXBElement<String>(new QName("http://fault.service.common.scb", "code"), String.class, SecurityFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fault.service.common.scb", name = "reason", scope = SecurityFault.class)
    public JAXBElement<String> createSecurityFaultReason(String value) {
        return new JAXBElement<String>(new QName("http://fault.service.common.scb", "reason"), String.class, SecurityFault.class, value);
    }

}
