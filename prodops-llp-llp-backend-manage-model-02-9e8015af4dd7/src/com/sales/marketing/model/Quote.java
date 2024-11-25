package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;

import java.sql.Timestamp;

/**
 * The persistent class for the "quote" database table.
 *
 */
@Entity
@Table(name = "quote")
@NamedQuery(name = "Quote.findAll", query = "SELECT q FROM Quote q")
public class Quote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "QUOTE_DIID_GENERATOR", sequenceName = "QUOTE_DI_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "QUOTE_DIID_GENERATOR")
	@Column(name = "di_id")
	private int diId;

	@Column(name = "at_inception")
	private BigDecimal atInception;

	@Column(name = "at_month_12")
	private BigDecimal atMonth12;

	@Column(name = "at_month_24")
	private BigDecimal atMonth24;

	@Column(name = "at_month_36")
	private BigDecimal atMonth36;

	@Column(name = "at_month_48")
	private BigDecimal atMonth48;

	@Column(name = "at_month_58")
	private BigDecimal atMonth58;

	@Column(name = "created_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Timestamp createdAt;

	@Column(name = "creation_user_i")
	private String creationUserI;

	@Column(name = "de_advance_payments")
	private BigDecimal deAdvancePayments;

	@Column(name = "de_county_tax_rate_pct")
	private BigDecimal deCountyTaxRatePct;

	@Column(name = "de_exit_equity_target_pct")
	private BigDecimal deExitEquityTargetPct;

	@Column(name = "de_exit_wholesale_value")
	private BigDecimal deExitWholesaleValue;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "de_first_ach")
	private Timestamp deFirstAch;

	@Column(name = "de_initial_equity_target_pct")
	private BigDecimal deInitialEquityTargetPct;

	@Column(name = "de_initial_wholesale_value")
	private BigDecimal deInitialWholesaleValue;

	@Column(name = "de_is_trade_tax_exempt")
	private String deIsTradeTaxExempt;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "de_last_ach")
	private Timestamp deLastAch;

	@Column(name = "de_lease_funding_cost_pct")
	private BigDecimal deLeaseFundingCostPct;

	@Column(name = "de_loan_funding_cost")
	private BigDecimal deLoanFundingCost;

	@Column(name = "de_net_pay_dealer")
	private String deNetPayDealer;

	@Column(name = "de_pay_dealer_dmv_fees")
	private String dePayDealerDmvFees;

	@Column(name = "de_remaining_payments")
	private BigDecimal deRemainingPayments;

	@Column(name = "de_state_of_registration")
	private String deStateOfRegistration;

	@Column(name = "de_state_tax_rate_pct")
	private BigDecimal deStateTaxRatePct;

	@Column(name = "de_total_payments")
	private BigDecimal deTotalPayments;

	@Column(name = "de_tx_tax_pd_by_dealer")
	private String deTxTaxPdByDealer;

	@Column(name = "de_zip_tax_rate_pct")
	private BigDecimal deZipTaxRatePct;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "inactive_d")
	private Timestamp inactiveD;

	@Column(name = "last_updated_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Timestamp lastUpdatedAt;

	@Column(name = "last_updated_user_i")
	private String lastUpdatedUserI;

	@Column(name = "ld_acquisition_fee")
	private BigDecimal ldAcquisitionFee;

	@Column(name = "ld_adj_to_monthly_lease_payment")
	private BigDecimal ldAdjToMonthlyLeasePayment;

	@Column(name = "ld_cash_due_upon_signing")
	private BigDecimal ldCashDueUponSigning;

	@Column(name = "ld_dealer_fee")
	private BigDecimal ldDealerFee;

	@Column(name = "ld_depreciation")
	private BigDecimal ldDepreciation;

	@Column(name = "ld_est_dmv_fee")
	private BigDecimal ldEstDmvFee;

	@Column(name = "ld_final_monthly_lease_payment")
	private BigDecimal ldFinalMonthlyLeasePayment;

	@Column(name = "ld_final_pre_tax_monthly_lease_payment")
	private BigDecimal ldFinalPreTaxMonthlyLeasePayment;

	@Column(name = "ld_initial_pre_tax_lease_payment")
	private BigDecimal ldInitialPreTaxLeasePayment;

	@Column(name = "ld_less_dealer_deposit")
	private BigDecimal ldLessDealerDeposit;

	@Column(name = "ld_less_trade_credit")
	private BigDecimal ldLessTradeCredit;

	@Column(name = "ld_other")
	private BigDecimal ldOther;

	@Column(name = "ld_security_deposit")
	private BigDecimal ldSecurityDeposit;

	@Column(name = "ld_service_contract_fee")
	private BigDecimal ldServiceContractFee;

	@Column(name = "ld_sum_of_lease_payments")
	private BigDecimal ldSumOfLeasePayments;

	@Column(name = "ld_sum_of_pre_tax_lease_payments")
	private BigDecimal ldSumOfPreTaxLeasePayments;

	@Column(name = "ld_tax_due_at_inception")
	private BigDecimal ldTaxDueAtInception;

	@Column(name = "ld_tax_on_fees")
	private BigDecimal ldTaxOnFees;

	@Column(name = "ld_tax_on_initial_lease_payments")
	private BigDecimal ldTaxOnInitialLeasePayments;

	@Column(name = "ld_tax_on_monthly_lease_payment")
	private BigDecimal ldTaxOnMonthlyLeasePayment;

	@Column(name = "ld_total_cap_cost_reduction")
	private BigDecimal ldTotalCapCostReduction;

	@Column(name = "ld_total_due_upon_signing")
	private BigDecimal ldTotalDueUponSigning;

	@Column(name = "ld_total_rental_charge")
	private BigDecimal ldTotalRentalCharge;

	@Column(name = "ld_upfront_lease_payment_due")
	private BigDecimal ldUpfrontLeasePaymentDue;

	@Column(name = "lm_advance_made_signing")
	private BigDecimal lmAdvanceMadeSigning;

	@Column(name = "lm_advance_rental_payments")
	private BigDecimal lmAdvanceRentalPayments;

	@Column(name = "lm_annuity_income_life_of_lease")
	private BigDecimal lmAnnuityIncomeLifeOfLease;

	@Column(name = "lm_annuity_income_monthly")
	private BigDecimal lmAnnuityIncomeMonthly;

	@Column(name = "lm_annuity_reserve_life_of_lease")
	private BigDecimal lmAnnuityReserveLifeOfLease;

	@Column(name = "lm_annuity_reserve_monthly")
	private BigDecimal lmAnnuityReserveMonthly;

	@Column(name = "lm_annuity_revenue_life_of_lease")
	private BigDecimal lmAnnuityRevenueLifeOfLease;

	@Column(name = "lm_annuity_revenue_monthly")
	private BigDecimal lmAnnuityRevenueMonthly;

	@Column(name = "lm_base_monthly_payment")
	private BigDecimal lmBaseMonthlyPayment;

	@Column(name = "lm_cap_cost_reduction")
	private BigDecimal lmCapCostReduction;

	@Column(name = "lm_color")
	private String lmColor;

	@Column(name = "lm_dealer_fees")
	private BigDecimal lmDealerFees;

	@Column(name = "lm_dealer_name")
	private String lmDealerName;

	@Column(name = "lm_est_1year_taxtitlereg_fees")
	private BigDecimal lmEst1yearTaxtitleregFees;

	@Column(name = "lm_inhouse_category")
	private String lmInhouseCategory;

	@Column(name = "lm_lease_acquisition_fee")
	private BigDecimal lmLeaseAcquisitionFee;

	@Column(name = "lm_lease_type")
	private String lmLeaseType;

	@Column(name = "lm_less_dealer_deposit")
	private BigDecimal lmLessDealerDeposit;

	@Column(name = "lm_less_tradein_allowance")
	private BigDecimal lmLessTradeinAllowance;

	@Column(name = "lm_loan_amount")
	private BigDecimal lmLoanAmount;

	@Column(name = "lm_loan_amount_lm")
	private BigDecimal lmLoanAmountLm;

	@Column(name = "lm_loan_payment_estimate")
	private BigDecimal lmLoanPaymentEstimate;

	@Column(name = "lm_make")
	private String lmMake;

	@Column(name = "lm_miles")
	private BigDecimal lmMiles;

	@Column(name = "lm_miles_currently_vehicle")
	private BigDecimal lmMilesCurrentlyVehicle;

	@Column(name = "lm_model")
	private String lmModel;

	@Column(name = "lm_num_payments_in_advance")
	private BigDecimal lmNumPaymentsInAdvance;

	@Column(name = "lm_original_lease_term")
	private BigDecimal lmOriginalLeaseTerm;

	@Column(name = "lm_origination_income")
	private BigDecimal lmOriginationIncome;

	@Column(name = "lm_origination_reserve")
	private BigDecimal lmOriginationReserve;

	@Column(name = "lm_origination_revenue")
	private BigDecimal lmOriginationRevenue;

	@Column(name = "lm_other")
	private BigDecimal lmOther;

	@Column(name = "lm_person_receiving_quote")
	private String lmPersonReceivingQuote;

	@Column(name = "lm_proposed_lessee_name")
	private String lmProposedLesseeName;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "lm_quote")
	private Timestamp lmQuote;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "lm_quote_converted")
	private Timestamp lmQuoteConverted;

	@Column(name = "lm_quote_id")
	private String lmQuoteId;

	@Column(name = "lm_quote_state")
	private String lmQuoteState;

	@Column(name = "lm_quote_status")
	private String lmQuoteStatus;

	@Column(name = "lm_quote_valid_days")
	private BigDecimal lmQuoteValidDays;

	@Column(name = "lm_remaining_payments")
	private BigDecimal lmRemainingPayments;

	@Column(name = "lm_residual_at_end_of_term")
	private BigDecimal lmResidualAtEndOfTerm;

	@Column(name = "lm_sales_agent")
	private String lmSalesAgent;

	@Column(name = "lm_security_deposit")
	private BigDecimal lmSecurityDeposit;

	@Column(name = "lm_selling_price")
	private BigDecimal lmSellingPrice;

	@Column(name = "lm_selling_price_lm")
	private BigDecimal lmSellingPriceLm;

	@Column(name = "lm_service_contract_fee")
	private BigDecimal lmServiceContractFee;

	@Column(name = "lm_source")
	private String lmSource;

	@Column(name = "lm_tax_due_at_inception")
	private BigDecimal lmTaxDueAtInception;

	@Column(name = "lm_tax_due_on_cash_cap_red")
	private BigDecimal lmTaxDueOnCashCapRed;

	@Column(name = "lm_tax_due_on_pmts_cap_cost")
	private BigDecimal lmTaxDueOnPmtsCapCost;

	@Column(name = "lm_tax_on_fees")
	private BigDecimal lmTaxOnFees;

	@Column(name = "lm_tax_on_payment")
	private BigDecimal lmTaxOnPayment;

	@Column(name = "lm_tax_on_trade")
	private BigDecimal lmTaxOnTrade;

	@Column(name = "lm_total_capitalized_cost")
	private BigDecimal lmTotalCapitalizedCost;

	@Column(name = "lm_total_due_at_signing")
	private BigDecimal lmTotalDueAtSigning;

	@Column(name = "lm_total_income_life_of_lease")
	private BigDecimal lmTotalIncomeLifeOfLease;

	@Column(name = "lm_total_monthly_payment")
	private BigDecimal lmTotalMonthlyPayment;

	@Column(name = "lm_total_reserve_life_of_lease")
	private BigDecimal lmTotalReserveLifeOfLease;

	@Column(name = "lm_total_revenue_life_of_lease")
	private BigDecimal lmTotalRevenueLifeOfLease;

	@Column(name = "lm_trim")
	private String lmTrim;

	@Column(name = "lm_vehicle_apprised_value")
	private BigDecimal lmVehicleApprisedValue;

	@Column(name = "lm_vin")
	private String lmVin;

	@Column(name = "lm_year")
	private BigDecimal lmYear;

	@Column(name = "override_fraud")
	private String overrideFraud;

	@Column(name = "vd_cash_cap_reduction")
	private BigDecimal vdCashCapReduction;

	@Column(name = "vd_dealer_txn_fee")
	private BigDecimal vdDealerTxnFee;

	@Column(name = "vd_lease_cap_cost")
	private BigDecimal vdLeaseCapCost;

	@Column(name = "vd_lease_residual")
	private BigDecimal vdLeaseResidual;

	@Column(name = "vd_llp_final_residual")
	private BigDecimal vdLlpFinalResidual;

	@Column(name = "vd_llp_initial_residual")
	private BigDecimal vdLlpInitialResidual;

	@Column(name = "vd_llp_residual_adjustment")
	private BigDecimal vdLlpResidualAdjustment;

	@Column(name = "vd_monthly_depreciation")
	private BigDecimal vdMonthlyDepreciation;

	@Column(name = "vd_residual_revenue")
	private BigDecimal vdResidualRevenue;

	@Column(name = "vd_total_cap_reduction")
	private BigDecimal vdTotalCapReduction;

	@Column(name = "vd_total_price")
	private BigDecimal vdTotalPrice;

	@Column(name = "vd_trade_credit")
	private BigDecimal vdTradeCredit;

	@Column(name = "vd_trade_payoff")
	private BigDecimal vdTradePayoff;

	@Column(name = "vd_trade_value")
	private BigDecimal vdTradeValue;

	@Column(name = "vd_vehicle_price")
	private BigDecimal vdVehiclePrice;

	@Column(name = "state_fips_c")
	private String stateFipsC;

	@Column(name = "street1")
	private String street1;

	@Column(name = "street2")
	private String street2;

	@Column(name = "work_number")
	private String workNumber;

	@Column(name = "zip_code")
	private String zipCode;

	@Column(name = "city")
	private String city;

	@Column(name = "country")
	private String country;

	@Column(name = "email")
	private String email;

	@Column(name = "fax_number")
	private String faxNumber;

	@Column(name = "mobile_number")
	private String mobileNumber;

	@Column(name = "customer_Id")
	private int customerId;

	@Column(name = "inhouse_category")
	private String inhouseCategory;

	@Column(name = "employee_id")
	private int employeeId;
	
	@Column(name = "credit_analyst_id")
	private Integer creditAnalystId;
	
	@Transient
	private String custFraudInd;
	
	@Transient
	private String custRedFlagReason;
	
	@Transient
	private String dealerFraudInd;
	
	@Transient
	private String dealerRedFlagReason;
	
	@Column(name = "merge_Id")
	private Long mergeId;
	
	public String getCustFraudInd() {
		return custFraudInd;
	}

	public void setCustFraudInd(String custFraudInd) {
		this.custFraudInd = custFraudInd;
	}

	public String getCustRedFlagReason() {
		return custRedFlagReason;
	}

	public void setCustRedFlagReason(String custRedFlagReason) {
		this.custRedFlagReason = custRedFlagReason;
	}

	public String getDealerFraudInd() {
		return dealerFraudInd;
	}

	public void setDealerFraudInd(String dealerFraudInd) {
		this.dealerFraudInd = dealerFraudInd;
	}

	public String getDealerRedFlagReason() {
		return dealerRedFlagReason;
	}

	public void setDealerRedFlagReason(String dealerRedFlagReason) {
		this.dealerRedFlagReason = dealerRedFlagReason;
	}

	public Integer getCreditAnalystId() {
		return creditAnalystId;
	}

	public void setCreditAnalystId(Integer creditAnalystId) {
		this.creditAnalystId = creditAnalystId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public Long getMergeId() {
		return mergeId;
	}

	public void setMergeId(Long mergeId) {
		this.mergeId = mergeId;
	}

	@Column(name = "dealer_id")
	private int dealerId;

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	@Column(name = "business_contact_full_name")
	private String businessContactFullName;

	public String getBusinessContactFullName() {
		return businessContactFullName;
	}

	public void setBusinessContactFullName(String businessContactFullName) {
		this.businessContactFullName = businessContactFullName;
	}

	public Quote() {
	}

	public int getDiId() {
		return this.diId;
	}

	public void setDiId(int diId) {
		this.diId = diId;
	}

	public String getOverrideFraud() {
		return overrideFraud;
	}

	public void setOverrideFraud(String overrideFraud) {
		this.overrideFraud = overrideFraud;
	}

	public BigDecimal getAtInception() {
		return this.atInception;
	}

	public void setAtInception(BigDecimal atInception) {
		this.atInception = atInception;
	}

	public BigDecimal getAtMonth12() {
		return this.atMonth12;
	}

	public void setAtMonth12(BigDecimal atMonth12) {
		this.atMonth12 = atMonth12;
	}

	public BigDecimal getAtMonth24() {
		return this.atMonth24;
	}

	public void setAtMonth24(BigDecimal atMonth24) {
		this.atMonth24 = atMonth24;
	}

	public BigDecimal getAtMonth36() {
		return this.atMonth36;
	}

	public void setAtMonth36(BigDecimal atMonth36) {
		this.atMonth36 = atMonth36;
	}

	public BigDecimal getAtMonth48() {
		return this.atMonth48;
	}

	public void setAtMonth48(BigDecimal atMonth48) {
		this.atMonth48 = atMonth48;
	}

	public BigDecimal getAtMonth58() {
		return this.atMonth58;
	}

	public void setAtMonth58(BigDecimal atMonth58) {
		this.atMonth58 = atMonth58;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreationUserI() {
		return this.creationUserI;
	}

	public void setCreationUserI(String creationUserI) {
		this.creationUserI = creationUserI;
	}

	public BigDecimal getDeAdvancePayments() {
		return this.deAdvancePayments;
	}

	public void setDeAdvancePayments(BigDecimal deAdvancePayments) {
		this.deAdvancePayments = deAdvancePayments;
	}

	public BigDecimal getDeCountyTaxRatePct() {
		return this.deCountyTaxRatePct;
	}

	public void setDeCountyTaxRatePct(BigDecimal deCountyTaxRatePct) {
		this.deCountyTaxRatePct = deCountyTaxRatePct;
	}

	public BigDecimal getDeExitEquityTargetPct() {
		return this.deExitEquityTargetPct;
	}

	public void setDeExitEquityTargetPct(BigDecimal deExitEquityTargetPct) {
		this.deExitEquityTargetPct = deExitEquityTargetPct;
	}

	public BigDecimal getDeExitWholesaleValue() {
		return this.deExitWholesaleValue;
	}

	public void setDeExitWholesaleValue(BigDecimal deExitWholesaleValue) {
		this.deExitWholesaleValue = deExitWholesaleValue;
	}

	public Timestamp getDeFirstAch() {
		return this.deFirstAch;
	}

	public void setDeFirstAch(Timestamp deFirstAch) {
		this.deFirstAch = deFirstAch;
	}

	public BigDecimal getDeInitialEquityTargetPct() {
		return this.deInitialEquityTargetPct;
	}

	public void setDeInitialEquityTargetPct(BigDecimal deInitialEquityTargetPct) {
		this.deInitialEquityTargetPct = deInitialEquityTargetPct;
	}

	public BigDecimal getDeInitialWholesaleValue() {
		return this.deInitialWholesaleValue;
	}

	public void setDeInitialWholesaleValue(BigDecimal deInitialWholesaleValue) {
		this.deInitialWholesaleValue = deInitialWholesaleValue;
	}

	public String getDeIsTradeTaxExempt() {
		return this.deIsTradeTaxExempt;
	}

	public void setDeIsTradeTaxExempt(String deIsTradeTaxExempt) {
		this.deIsTradeTaxExempt = deIsTradeTaxExempt;
	}

	public Timestamp getDeLastAch() {
		return this.deLastAch;
	}

	public void setDeLastAch(Timestamp deLastAch) {
		this.deLastAch = deLastAch;
	}

	public BigDecimal getDeLeaseFundingCostPct() {
		return this.deLeaseFundingCostPct;
	}

	public void setDeLeaseFundingCostPct(BigDecimal deLeaseFundingCostPct) {
		this.deLeaseFundingCostPct = deLeaseFundingCostPct;
	}

	public BigDecimal getDeLoanFundingCost() {
		return this.deLoanFundingCost;
	}

	public void setDeLoanFundingCost(BigDecimal deLoanFundingCost) {
		this.deLoanFundingCost = deLoanFundingCost;
	}

	public String getDeNetPayDealer() {
		return this.deNetPayDealer;
	}

	public void setDeNetPayDealer(String deNetPayDealer) {
		this.deNetPayDealer = deNetPayDealer;
	}

	public String getDePayDealerDmvFees() {
		return this.dePayDealerDmvFees;
	}

	public void setDePayDealerDmvFees(String dePayDealerDmvFees) {
		this.dePayDealerDmvFees = dePayDealerDmvFees;
	}

	public BigDecimal getDeRemainingPayments() {
		return this.deRemainingPayments;
	}

	public void setDeRemainingPayments(BigDecimal deRemainingPayments) {
		this.deRemainingPayments = deRemainingPayments;
	}

	public String getDeStateOfRegistration() {
		return this.deStateOfRegistration;
	}

	public void setDeStateOfRegistration(String deStateOfRegistration) {
		this.deStateOfRegistration = deStateOfRegistration;
	}

	public BigDecimal getDeStateTaxRatePct() {
		return this.deStateTaxRatePct;
	}

	public void setDeStateTaxRatePct(BigDecimal deStateTaxRatePct) {
		this.deStateTaxRatePct = deStateTaxRatePct;
	}

	public BigDecimal getDeTotalPayments() {
		return this.deTotalPayments;
	}

	public void setDeTotalPayments(BigDecimal deTotalPayments) {
		this.deTotalPayments = deTotalPayments;
	}

	public String getDeTxTaxPdByDealer() {
		return this.deTxTaxPdByDealer;
	}

	public void setDeTxTaxPdByDealer(String deTxTaxPdByDealer) {
		this.deTxTaxPdByDealer = deTxTaxPdByDealer;
	}

	public BigDecimal getDeZipTaxRatePct() {
		return this.deZipTaxRatePct;
	}

	public void setDeZipTaxRatePct(BigDecimal deZipTaxRatePct) {
		this.deZipTaxRatePct = deZipTaxRatePct;
	}

	public Timestamp getInactiveD() {
		return this.inactiveD;
	}

	public void setInactiveD(Timestamp inactiveD) {
		this.inactiveD = inactiveD;
	}

	public Timestamp getLastUpdatedAt() {
		return this.lastUpdatedAt;
	}

	public void setLastUpdatedAt(Timestamp lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	public String getLastUpdatedUserI() {
		return this.lastUpdatedUserI;
	}

	public void setLastUpdatedUserI(String lastUpdatedUserI) {
		this.lastUpdatedUserI = lastUpdatedUserI;
	}

	public BigDecimal getLdAcquisitionFee() {
		return this.ldAcquisitionFee;
	}

	public void setLdAcquisitionFee(BigDecimal ldAcquisitionFee) {
		this.ldAcquisitionFee = ldAcquisitionFee;
	}

	public BigDecimal getLdAdjToMonthlyLeasePayment() {
		return this.ldAdjToMonthlyLeasePayment;
	}

	public void setLdAdjToMonthlyLeasePayment(BigDecimal ldAdjToMonthlyLeasePayment) {
		this.ldAdjToMonthlyLeasePayment = ldAdjToMonthlyLeasePayment;
	}

	public BigDecimal getLdCashDueUponSigning() {
		return this.ldCashDueUponSigning;
	}

	public void setLdCashDueUponSigning(BigDecimal ldCashDueUponSigning) {
		this.ldCashDueUponSigning = ldCashDueUponSigning;
	}

	public BigDecimal getLdDealerFee() {
		return this.ldDealerFee;
	}

	public void setLdDealerFee(BigDecimal ldDealerFee) {
		this.ldDealerFee = ldDealerFee;
	}

	public BigDecimal getLdDepreciation() {
		return this.ldDepreciation;
	}

	public void setLdDepreciation(BigDecimal ldDepreciation) {
		this.ldDepreciation = ldDepreciation;
	}

	public BigDecimal getLdEstDmvFee() {
		return this.ldEstDmvFee;
	}

	public void setLdEstDmvFee(BigDecimal ldEstDmvFee) {
		this.ldEstDmvFee = ldEstDmvFee;
	}

	public BigDecimal getLdFinalMonthlyLeasePayment() {
		return this.ldFinalMonthlyLeasePayment;
	}

	public void setLdFinalMonthlyLeasePayment(BigDecimal ldFinalMonthlyLeasePayment) {
		this.ldFinalMonthlyLeasePayment = ldFinalMonthlyLeasePayment;
	}

	public BigDecimal getLdFinalPreTaxMonthlyLeasePayment() {
		return this.ldFinalPreTaxMonthlyLeasePayment;
	}

	public void setLdFinalPreTaxMonthlyLeasePayment(BigDecimal ldFinalPreTaxMonthlyLeasePayment) {
		this.ldFinalPreTaxMonthlyLeasePayment = ldFinalPreTaxMonthlyLeasePayment;
	}

	public BigDecimal getLdInitialPreTaxLeasePayment() {
		return this.ldInitialPreTaxLeasePayment;
	}

	public void setLdInitialPreTaxLeasePayment(BigDecimal ldInitialPreTaxLeasePayment) {
		this.ldInitialPreTaxLeasePayment = ldInitialPreTaxLeasePayment;
	}

	public BigDecimal getLdLessDealerDeposit() {
		return this.ldLessDealerDeposit;
	}

	public void setLdLessDealerDeposit(BigDecimal ldLessDealerDeposit) {
		this.ldLessDealerDeposit = ldLessDealerDeposit;
	}

	public BigDecimal getLdLessTradeCredit() {
		return this.ldLessTradeCredit;
	}

	public void setLdLessTradeCredit(BigDecimal ldLessTradeCredit) {
		this.ldLessTradeCredit = ldLessTradeCredit;
	}

	public BigDecimal getLdOther() {
		return this.ldOther;
	}

	public void setLdOther(BigDecimal ldOther) {
		this.ldOther = ldOther;
	}

	public BigDecimal getLdSecurityDeposit() {
		return this.ldSecurityDeposit;
	}

	public void setLdSecurityDeposit(BigDecimal ldSecurityDeposit) {
		this.ldSecurityDeposit = ldSecurityDeposit;
	}

	public BigDecimal getLdServiceContractFee() {
		return this.ldServiceContractFee;
	}

	public void setLdServiceContractFee(BigDecimal ldServiceContractFee) {
		this.ldServiceContractFee = ldServiceContractFee;
	}

	public BigDecimal getLdSumOfLeasePayments() {
		return this.ldSumOfLeasePayments;
	}

	public void setLdSumOfLeasePayments(BigDecimal ldSumOfLeasePayments) {
		this.ldSumOfLeasePayments = ldSumOfLeasePayments;
	}

	public BigDecimal getLdSumOfPreTaxLeasePayments() {
		return this.ldSumOfPreTaxLeasePayments;
	}

	public void setLdSumOfPreTaxLeasePayments(BigDecimal ldSumOfPreTaxLeasePayments) {
		this.ldSumOfPreTaxLeasePayments = ldSumOfPreTaxLeasePayments;
	}

	public BigDecimal getLdTaxDueAtInception() {
		return this.ldTaxDueAtInception;
	}

	public void setLdTaxDueAtInception(BigDecimal ldTaxDueAtInception) {
		this.ldTaxDueAtInception = ldTaxDueAtInception;
	}

	public BigDecimal getLdTaxOnFees() {
		return this.ldTaxOnFees;
	}

	public void setLdTaxOnFees(BigDecimal ldTaxOnFees) {
		this.ldTaxOnFees = ldTaxOnFees;
	}

	public BigDecimal getLdTaxOnInitialLeasePayments() {
		return this.ldTaxOnInitialLeasePayments;
	}

	public void setLdTaxOnInitialLeasePayments(BigDecimal ldTaxOnInitialLeasePayments) {
		this.ldTaxOnInitialLeasePayments = ldTaxOnInitialLeasePayments;
	}

	public BigDecimal getLdTaxOnMonthlyLeasePayment() {
		return this.ldTaxOnMonthlyLeasePayment;
	}

	public void setLdTaxOnMonthlyLeasePayment(BigDecimal ldTaxOnMonthlyLeasePayment) {
		this.ldTaxOnMonthlyLeasePayment = ldTaxOnMonthlyLeasePayment;
	}

	public BigDecimal getLdTotalCapCostReduction() {
		return this.ldTotalCapCostReduction;
	}

	public void setLdTotalCapCostReduction(BigDecimal ldTotalCapCostReduction) {
		this.ldTotalCapCostReduction = ldTotalCapCostReduction;
	}

	public BigDecimal getLdTotalDueUponSigning() {
		return this.ldTotalDueUponSigning;
	}

	public void setLdTotalDueUponSigning(BigDecimal ldTotalDueUponSigning) {
		this.ldTotalDueUponSigning = ldTotalDueUponSigning;
	}

	public BigDecimal getLdTotalRentalCharge() {
		return this.ldTotalRentalCharge;
	}

	public void setLdTotalRentalCharge(BigDecimal ldTotalRentalCharge) {
		this.ldTotalRentalCharge = ldTotalRentalCharge;
	}

	public BigDecimal getLdUpfrontLeasePaymentDue() {
		return this.ldUpfrontLeasePaymentDue;
	}

	public void setLdUpfrontLeasePaymentDue(BigDecimal ldUpfrontLeasePaymentDue) {
		this.ldUpfrontLeasePaymentDue = ldUpfrontLeasePaymentDue;
	}

	public BigDecimal getLmAdvanceMadeSigning() {
		return this.lmAdvanceMadeSigning;
	}

	public void setLmAdvanceMadeSigning(BigDecimal lmAdvanceMadeSigning) {
		this.lmAdvanceMadeSigning = lmAdvanceMadeSigning;
	}

	public BigDecimal getLmAdvanceRentalPayments() {
		return this.lmAdvanceRentalPayments;
	}

	public void setLmAdvanceRentalPayments(BigDecimal lmAdvanceRentalPayments) {
		this.lmAdvanceRentalPayments = lmAdvanceRentalPayments;
	}

	public BigDecimal getLmAnnuityIncomeLifeOfLease() {
		return this.lmAnnuityIncomeLifeOfLease;
	}

	public void setLmAnnuityIncomeLifeOfLease(BigDecimal lmAnnuityIncomeLifeOfLease) {
		this.lmAnnuityIncomeLifeOfLease = lmAnnuityIncomeLifeOfLease;
	}

	public BigDecimal getLmAnnuityIncomeMonthly() {
		return this.lmAnnuityIncomeMonthly;
	}

	public void setLmAnnuityIncomeMonthly(BigDecimal lmAnnuityIncomeMonthly) {
		this.lmAnnuityIncomeMonthly = lmAnnuityIncomeMonthly;
	}

	public BigDecimal getLmAnnuityReserveLifeOfLease() {
		return this.lmAnnuityReserveLifeOfLease;
	}

	public void setLmAnnuityReserveLifeOfLease(BigDecimal lmAnnuityReserveLifeOfLease) {
		this.lmAnnuityReserveLifeOfLease = lmAnnuityReserveLifeOfLease;
	}

	public BigDecimal getLmAnnuityReserveMonthly() {
		return this.lmAnnuityReserveMonthly;
	}

	public void setLmAnnuityReserveMonthly(BigDecimal lmAnnuityReserveMonthly) {
		this.lmAnnuityReserveMonthly = lmAnnuityReserveMonthly;
	}

	public BigDecimal getLmAnnuityRevenueLifeOfLease() {
		return this.lmAnnuityRevenueLifeOfLease;
	}

	public void setLmAnnuityRevenueLifeOfLease(BigDecimal lmAnnuityRevenueLifeOfLease) {
		this.lmAnnuityRevenueLifeOfLease = lmAnnuityRevenueLifeOfLease;
	}

	public BigDecimal getLmAnnuityRevenueMonthly() {
		return this.lmAnnuityRevenueMonthly;
	}

	public void setLmAnnuityRevenueMonthly(BigDecimal lmAnnuityRevenueMonthly) {
		this.lmAnnuityRevenueMonthly = lmAnnuityRevenueMonthly;
	}

	public BigDecimal getLmBaseMonthlyPayment() {
		return this.lmBaseMonthlyPayment;
	}

	public void setLmBaseMonthlyPayment(BigDecimal lmBaseMonthlyPayment) {
		this.lmBaseMonthlyPayment = lmBaseMonthlyPayment;
	}

	public BigDecimal getLmCapCostReduction() {
		return this.lmCapCostReduction;
	}

	public void setLmCapCostReduction(BigDecimal lmCapCostReduction) {
		this.lmCapCostReduction = lmCapCostReduction;
	}

	public String getLmColor() {
		return this.lmColor;
	}

	public void setLmColor(String lmColor) {
		this.lmColor = lmColor;
	}

	public BigDecimal getLmDealerFees() {
		return this.lmDealerFees;
	}

	public void setLmDealerFees(BigDecimal lmDealerFees) {
		this.lmDealerFees = lmDealerFees;
	}

	public String getLmDealerName() {
		return this.lmDealerName;
	}

	public void setLmDealerName(String lmDealerName) {
		this.lmDealerName = lmDealerName;
	}

	public BigDecimal getLmEst1yearTaxtitleregFees() {
		return this.lmEst1yearTaxtitleregFees;
	}

	public void setLmEst1yearTaxtitleregFees(BigDecimal lmEst1yearTaxtitleregFees) {
		this.lmEst1yearTaxtitleregFees = lmEst1yearTaxtitleregFees;
	}

	public String getLmInhouseCategory() {
		return this.lmInhouseCategory;
	}

	public void setLmInhouseCategory(String lmInhouseCategory) {
		this.lmInhouseCategory = lmInhouseCategory;
	}

	public BigDecimal getLmLeaseAcquisitionFee() {
		return this.lmLeaseAcquisitionFee;
	}

	public void setLmLeaseAcquisitionFee(BigDecimal lmLeaseAcquisitionFee) {
		this.lmLeaseAcquisitionFee = lmLeaseAcquisitionFee;
	}

	public String getLmLeaseType() {
		return this.lmLeaseType;
	}

	public void setLmLeaseType(String lmLeaseType) {
		this.lmLeaseType = lmLeaseType;
	}

	public BigDecimal getLmLessDealerDeposit() {
		return this.lmLessDealerDeposit;
	}

	public void setLmLessDealerDeposit(BigDecimal lmLessDealerDeposit) {
		this.lmLessDealerDeposit = lmLessDealerDeposit;
	}

	public BigDecimal getLmLessTradeinAllowance() {
		return this.lmLessTradeinAllowance;
	}

	public void setLmLessTradeinAllowance(BigDecimal lmLessTradeinAllowance) {
		this.lmLessTradeinAllowance = lmLessTradeinAllowance;
	}

	public BigDecimal getLmLoanAmount() {
		return this.lmLoanAmount;
	}

	public void setLmLoanAmount(BigDecimal lmLoanAmount) {
		this.lmLoanAmount = lmLoanAmount;
	}

	public BigDecimal getLmLoanAmountLm() {
		return this.lmLoanAmountLm;
	}

	public void setLmLoanAmountLm(BigDecimal lmLoanAmountLm) {
		this.lmLoanAmountLm = lmLoanAmountLm;
	}

	public BigDecimal getLmLoanPaymentEstimate() {
		return this.lmLoanPaymentEstimate;
	}

	public void setLmLoanPaymentEstimate(BigDecimal lmLoanPaymentEstimate) {
		this.lmLoanPaymentEstimate = lmLoanPaymentEstimate;
	}

	public String getLmMake() {
		return this.lmMake;
	}

	public void setLmMake(String lmMake) {
		this.lmMake = lmMake;
	}

	public BigDecimal getLmMiles() {
		return this.lmMiles;
	}

	public void setLmMiles(BigDecimal lmMiles) {
		this.lmMiles = lmMiles;
	}

	public BigDecimal getLmMilesCurrentlyVehicle() {
		return this.lmMilesCurrentlyVehicle;
	}

	public void setLmMilesCurrentlyVehicle(BigDecimal lmMilesCurrentlyVehicle) {
		this.lmMilesCurrentlyVehicle = lmMilesCurrentlyVehicle;
	}

	public String getLmModel() {
		return this.lmModel;
	}

	public void setLmModel(String lmModel) {
		this.lmModel = lmModel;
	}

	public BigDecimal getLmNumPaymentsInAdvance() {
		return this.lmNumPaymentsInAdvance;
	}

	public void setLmNumPaymentsInAdvance(BigDecimal lmNumPaymentsInAdvance) {
		this.lmNumPaymentsInAdvance = lmNumPaymentsInAdvance;
	}

	public BigDecimal getLmOriginalLeaseTerm() {
		return this.lmOriginalLeaseTerm;
	}

	public void setLmOriginalLeaseTerm(BigDecimal lmOriginalLeaseTerm) {
		this.lmOriginalLeaseTerm = lmOriginalLeaseTerm;
	}

	public BigDecimal getLmOriginationIncome() {
		return this.lmOriginationIncome;
	}

	public void setLmOriginationIncome(BigDecimal lmOriginationIncome) {
		this.lmOriginationIncome = lmOriginationIncome;
	}

	public BigDecimal getLmOriginationReserve() {
		return this.lmOriginationReserve;
	}

	public void setLmOriginationReserve(BigDecimal lmOriginationReserve) {
		this.lmOriginationReserve = lmOriginationReserve;
	}

	public BigDecimal getLmOriginationRevenue() {
		return this.lmOriginationRevenue;
	}

	public void setLmOriginationRevenue(BigDecimal lmOriginationRevenue) {
		this.lmOriginationRevenue = lmOriginationRevenue;
	}

	public BigDecimal getLmOther() {
		return this.lmOther;
	}

	public void setLmOther(BigDecimal lmOther) {
		this.lmOther = lmOther;
	}

	public String getLmPersonReceivingQuote() {
		return this.lmPersonReceivingQuote;
	}

	public void setLmPersonReceivingQuote(String lmPersonReceivingQuote) {
		this.lmPersonReceivingQuote = lmPersonReceivingQuote;
	}

	public String getLmProposedLesseeName() {
		return this.lmProposedLesseeName;
	}

	public void setLmProposedLesseeName(String lmProposedLesseeName) {
		this.lmProposedLesseeName = lmProposedLesseeName;
	}

	public Timestamp getLmQuote() {
		return this.lmQuote;
	}

	public void setLmQuote(Timestamp lmQuote) {
		this.lmQuote = lmQuote;
	}

	public Timestamp getLmQuoteConverted() {
		return this.lmQuoteConverted;
	}

	public void setLmQuoteConverted(Timestamp lmQuoteConverted) {
		this.lmQuoteConverted = lmQuoteConverted;
	}

	public String getLmQuoteId() {
		return this.lmQuoteId;
	}

	public void setLmQuoteId(String lmQuoteId) {
		this.lmQuoteId = lmQuoteId;
	}

	public String getLmQuoteState() {
		return this.lmQuoteState;
	}

	public void setLmQuoteState(String lmQuoteState) {
		this.lmQuoteState = lmQuoteState;
	}

	public String getLmQuoteStatus() {
		return this.lmQuoteStatus;
	}

	public void setLmQuoteStatus(String lmQuoteStatus) {
		this.lmQuoteStatus = lmQuoteStatus;
	}

	public BigDecimal getLmQuoteValidDays() {
		return this.lmQuoteValidDays;
	}

	public void setLmQuoteValidDays(BigDecimal lmQuoteValidDays) {
		this.lmQuoteValidDays = lmQuoteValidDays;
	}

	public BigDecimal getLmRemainingPayments() {
		return this.lmRemainingPayments;
	}

	public void setLmRemainingPayments(BigDecimal lmRemainingPayments) {
		this.lmRemainingPayments = lmRemainingPayments;
	}

	public BigDecimal getLmResidualAtEndOfTerm() {
		return this.lmResidualAtEndOfTerm;
	}

	public void setLmResidualAtEndOfTerm(BigDecimal lmResidualAtEndOfTerm) {
		this.lmResidualAtEndOfTerm = lmResidualAtEndOfTerm;
	}

	public String getLmSalesAgent() {
		return this.lmSalesAgent;
	}

	public void setLmSalesAgent(String lmSalesAgent) {
		this.lmSalesAgent = lmSalesAgent;
	}

	public BigDecimal getLmSecurityDeposit() {
		return this.lmSecurityDeposit;
	}

	public void setLmSecurityDeposit(BigDecimal lmSecurityDeposit) {
		this.lmSecurityDeposit = lmSecurityDeposit;
	}

	public BigDecimal getLmSellingPrice() {
		return this.lmSellingPrice;
	}

	public void setLmSellingPrice(BigDecimal lmSellingPrice) {
		this.lmSellingPrice = lmSellingPrice;
	}

	public BigDecimal getLmSellingPriceLm() {
		return this.lmSellingPriceLm;
	}

	public void setLmSellingPriceLm(BigDecimal lmSellingPriceLm) {
		this.lmSellingPriceLm = lmSellingPriceLm;
	}

	public BigDecimal getLmServiceContractFee() {
		return this.lmServiceContractFee;
	}

	public void setLmServiceContractFee(BigDecimal lmServiceContractFee) {
		this.lmServiceContractFee = lmServiceContractFee;
	}

	public String getLmSource() {
		return this.lmSource;
	}

	public void setLmSource(String lmSource) {
		this.lmSource = lmSource;
	}

	public BigDecimal getLmTaxDueAtInception() {
		return this.lmTaxDueAtInception;
	}

	public void setLmTaxDueAtInception(BigDecimal lmTaxDueAtInception) {
		this.lmTaxDueAtInception = lmTaxDueAtInception;
	}

	public BigDecimal getLmTaxDueOnCashCapRed() {
		return this.lmTaxDueOnCashCapRed;
	}

	public void setLmTaxDueOnCashCapRed(BigDecimal lmTaxDueOnCashCapRed) {
		this.lmTaxDueOnCashCapRed = lmTaxDueOnCashCapRed;
	}

	public BigDecimal getLmTaxDueOnPmtsCapCost() {
		return this.lmTaxDueOnPmtsCapCost;
	}

	public void setLmTaxDueOnPmtsCapCost(BigDecimal lmTaxDueOnPmtsCapCost) {
		this.lmTaxDueOnPmtsCapCost = lmTaxDueOnPmtsCapCost;
	}

	public BigDecimal getLmTaxOnFees() {
		return this.lmTaxOnFees;
	}

	public void setLmTaxOnFees(BigDecimal lmTaxOnFees) {
		this.lmTaxOnFees = lmTaxOnFees;
	}

	public BigDecimal getLmTaxOnPayment() {
		return this.lmTaxOnPayment;
	}

	public void setLmTaxOnPayment(BigDecimal lmTaxOnPayment) {
		this.lmTaxOnPayment = lmTaxOnPayment;
	}

	public BigDecimal getLmTaxOnTrade() {
		return this.lmTaxOnTrade;
	}

	public void setLmTaxOnTrade(BigDecimal lmTaxOnTrade) {
		this.lmTaxOnTrade = lmTaxOnTrade;
	}

	public BigDecimal getLmTotalCapitalizedCost() {
		return this.lmTotalCapitalizedCost;
	}

	public void setLmTotalCapitalizedCost(BigDecimal lmTotalCapitalizedCost) {
		this.lmTotalCapitalizedCost = lmTotalCapitalizedCost;
	}

	public BigDecimal getLmTotalDueAtSigning() {
		return this.lmTotalDueAtSigning;
	}

	public void setLmTotalDueAtSigning(BigDecimal lmTotalDueAtSigning) {
		this.lmTotalDueAtSigning = lmTotalDueAtSigning;
	}

	public BigDecimal getLmTotalIncomeLifeOfLease() {
		return this.lmTotalIncomeLifeOfLease;
	}

	public void setLmTotalIncomeLifeOfLease(BigDecimal lmTotalIncomeLifeOfLease) {
		this.lmTotalIncomeLifeOfLease = lmTotalIncomeLifeOfLease;
	}

	public BigDecimal getLmTotalMonthlyPayment() {
		return this.lmTotalMonthlyPayment;
	}

	public void setLmTotalMonthlyPayment(BigDecimal lmTotalMonthlyPayment) {
		this.lmTotalMonthlyPayment = lmTotalMonthlyPayment;
	}

	public BigDecimal getLmTotalReserveLifeOfLease() {
		return this.lmTotalReserveLifeOfLease;
	}

	public void setLmTotalReserveLifeOfLease(BigDecimal lmTotalReserveLifeOfLease) {
		this.lmTotalReserveLifeOfLease = lmTotalReserveLifeOfLease;
	}

	public BigDecimal getLmTotalRevenueLifeOfLease() {
		return this.lmTotalRevenueLifeOfLease;
	}

	public void setLmTotalRevenueLifeOfLease(BigDecimal lmTotalRevenueLifeOfLease) {
		this.lmTotalRevenueLifeOfLease = lmTotalRevenueLifeOfLease;
	}

	public String getLmTrim() {
		return this.lmTrim;
	}

	public void setLmTrim(String lmTrim) {
		this.lmTrim = lmTrim;
	}

	public BigDecimal getLmVehicleApprisedValue() {
		return this.lmVehicleApprisedValue;
	}

	public void setLmVehicleApprisedValue(BigDecimal lmVehicleApprisedValue) {
		this.lmVehicleApprisedValue = lmVehicleApprisedValue;
	}

	public String getLmVin() {
		return this.lmVin;
	}

	public void setLmVin(String lmVin) {
		this.lmVin = lmVin;
	}

	public BigDecimal getLmYear() {
		return this.lmYear;
	}

	public void setLmYear(BigDecimal lmYear) {
		this.lmYear = lmYear;
	}

	public BigDecimal getVdCashCapReduction() {
		return this.vdCashCapReduction;
	}

	public void setVdCashCapReduction(BigDecimal vdCashCapReduction) {
		this.vdCashCapReduction = vdCashCapReduction;
	}

	public BigDecimal getVdDealerTxnFee() {
		return this.vdDealerTxnFee;
	}

	public void setVdDealerTxnFee(BigDecimal vdDealerTxnFee) {
		this.vdDealerTxnFee = vdDealerTxnFee;
	}

	public BigDecimal getVdLeaseCapCost() {
		return this.vdLeaseCapCost;
	}

	public void setVdLeaseCapCost(BigDecimal vdLeaseCapCost) {
		this.vdLeaseCapCost = vdLeaseCapCost;
	}

	public BigDecimal getVdLeaseResidual() {
		return this.vdLeaseResidual;
	}

	public void setVdLeaseResidual(BigDecimal vdLeaseResidual) {
		this.vdLeaseResidual = vdLeaseResidual;
	}

	public BigDecimal getVdLlpFinalResidual() {
		return this.vdLlpFinalResidual;
	}

	public void setVdLlpFinalResidual(BigDecimal vdLlpFinalResidual) {
		this.vdLlpFinalResidual = vdLlpFinalResidual;
	}

	public BigDecimal getVdLlpInitialResidual() {
		return this.vdLlpInitialResidual;
	}

	public void setVdLlpInitialResidual(BigDecimal vdLlpInitialResidual) {
		this.vdLlpInitialResidual = vdLlpInitialResidual;
	}

	public BigDecimal getVdLlpResidualAdjustment() {
		return this.vdLlpResidualAdjustment;
	}

	public void setVdLlpResidualAdjustment(BigDecimal vdLlpResidualAdjustment) {
		this.vdLlpResidualAdjustment = vdLlpResidualAdjustment;
	}

	public BigDecimal getVdMonthlyDepreciation() {
		return this.vdMonthlyDepreciation;
	}

	public void setVdMonthlyDepreciation(BigDecimal vdMonthlyDepreciation) {
		this.vdMonthlyDepreciation = vdMonthlyDepreciation;
	}

	public BigDecimal getVdResidualRevenue() {
		return this.vdResidualRevenue;
	}

	public void setVdResidualRevenue(BigDecimal vdResidualRevenue) {
		this.vdResidualRevenue = vdResidualRevenue;
	}

	public BigDecimal getVdTotalCapReduction() {
		return this.vdTotalCapReduction;
	}

	public void setVdTotalCapReduction(BigDecimal vdTotalCapReduction) {
		this.vdTotalCapReduction = vdTotalCapReduction;
	}

	public BigDecimal getVdTotalPrice() {
		return this.vdTotalPrice;
	}

	public void setVdTotalPrice(BigDecimal vdTotalPrice) {
		this.vdTotalPrice = vdTotalPrice;
	}

	public BigDecimal getVdTradeCredit() {
		return this.vdTradeCredit;
	}

	public void setVdTradeCredit(BigDecimal vdTradeCredit) {
		this.vdTradeCredit = vdTradeCredit;
	}

	public BigDecimal getVdTradePayoff() {
		return this.vdTradePayoff;
	}

	public void setVdTradePayoff(BigDecimal vdTradePayoff) {
		this.vdTradePayoff = vdTradePayoff;
	}

	public BigDecimal getVdTradeValue() {
		return this.vdTradeValue;
	}

	public void setVdTradeValue(BigDecimal vdTradeValue) {
		this.vdTradeValue = vdTradeValue;
	}

	public BigDecimal getVdVehiclePrice() {
		return this.vdVehiclePrice;
	}

	public void setVdVehiclePrice(BigDecimal vdVehiclePrice) {
		this.vdVehiclePrice = vdVehiclePrice;
	}

	public String getStateFipsC() {
		return stateFipsC;
	}

	public void setStateFipsC(String stateFipsC) {
		this.stateFipsC = stateFipsC;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getWorkNumber() {
		return workNumber;
	}

	public void setWorkNumber(String workNumber) {
		this.workNumber = workNumber;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getInhouseCategory() {
		return inhouseCategory;
	}

	public void setInhouseCategory(String inhouseCategory) {
		this.inhouseCategory = inhouseCategory;
	}

	@Override
	public String toString() {
		return "Quote [diId=" + diId + ", atInception=" + atInception + ", atMonth12=" + atMonth12 + ", atMonth24="
				+ atMonth24 + ", atMonth36=" + atMonth36 + ", atMonth48=" + atMonth48 + ", atMonth58=" + atMonth58
				+ ", createdAt=" + createdAt + ", creationUserI=" + creationUserI + ", deAdvancePayments="
				+ deAdvancePayments + ", deCountyTaxRatePct=" + deCountyTaxRatePct + ", deExitEquityTargetPct="
				+ deExitEquityTargetPct + ", deExitWholesaleValue=" + deExitWholesaleValue + ", deFirstAch="
				+ deFirstAch + ", deInitialEquityTargetPct=" + deInitialEquityTargetPct + ", deInitialWholesaleValue="
				+ deInitialWholesaleValue + ", deIsTradeTaxExempt=" + deIsTradeTaxExempt + ", deLastAch=" + deLastAch
				+ ", deLeaseFundingCostPct=" + deLeaseFundingCostPct + ", deLoanFundingCost=" + deLoanFundingCost
				+ ", deNetPayDealer=" + deNetPayDealer + ", dePayDealerDmvFees=" + dePayDealerDmvFees
				+ ", deRemainingPayments=" + deRemainingPayments + ", deStateOfRegistration=" + deStateOfRegistration
				+ ", deStateTaxRatePct=" + deStateTaxRatePct + ", deTotalPayments=" + deTotalPayments
				+ ", deTxTaxPdByDealer=" + deTxTaxPdByDealer + ", deZipTaxRatePct=" + deZipTaxRatePct + ", inactiveD="
				+ inactiveD + ", lastUpdatedAt=" + lastUpdatedAt + ", lastUpdatedUserI=" + lastUpdatedUserI
				+ ", ldAcquisitionFee=" + ldAcquisitionFee + ", ldAdjToMonthlyLeasePayment="
				+ ldAdjToMonthlyLeasePayment + ", ldCashDueUponSigning=" + ldCashDueUponSigning + ", ldDealerFee="
				+ ldDealerFee + ", ldDepreciation=" + ldDepreciation + ", ldEstDmvFee=" + ldEstDmvFee
				+ ", ldFinalMonthlyLeasePayment=" + ldFinalMonthlyLeasePayment + ", ldFinalPreTaxMonthlyLeasePayment="
				+ ldFinalPreTaxMonthlyLeasePayment + ", ldInitialPreTaxLeasePayment=" + ldInitialPreTaxLeasePayment
				+ ", ldLessDealerDeposit=" + ldLessDealerDeposit + ", ldLessTradeCredit=" + ldLessTradeCredit
				+ ", ldOther=" + ldOther + ", ldSecurityDeposit=" + ldSecurityDeposit + ", ldServiceContractFee="
				+ ldServiceContractFee + ", ldSumOfLeasePayments=" + ldSumOfLeasePayments
				+ ", ldSumOfPreTaxLeasePayments=" + ldSumOfPreTaxLeasePayments + ", ldTaxDueAtInception="
				+ ldTaxDueAtInception + ", ldTaxOnFees=" + ldTaxOnFees + ", ldTaxOnInitialLeasePayments="
				+ ldTaxOnInitialLeasePayments + ", ldTaxOnMonthlyLeasePayment=" + ldTaxOnMonthlyLeasePayment
				+ ", ldTotalCapCostReduction=" + ldTotalCapCostReduction + ", ldTotalDueUponSigning="
				+ ldTotalDueUponSigning + ", ldTotalRentalCharge=" + ldTotalRentalCharge + ", ldUpfrontLeasePaymentDue="
				+ ldUpfrontLeasePaymentDue + ", lmAdvanceMadeSigning=" + lmAdvanceMadeSigning
				+ ", lmAdvanceRentalPayments=" + lmAdvanceRentalPayments + ", lmAnnuityIncomeLifeOfLease="
				+ lmAnnuityIncomeLifeOfLease + ", lmAnnuityIncomeMonthly=" + lmAnnuityIncomeMonthly
				+ ", lmAnnuityReserveLifeOfLease=" + lmAnnuityReserveLifeOfLease + ", lmAnnuityReserveMonthly="
				+ lmAnnuityReserveMonthly + ", lmAnnuityRevenueLifeOfLease=" + lmAnnuityRevenueLifeOfLease
				+ ", lmAnnuityRevenueMonthly=" + lmAnnuityRevenueMonthly + ", lmBaseMonthlyPayment="
				+ lmBaseMonthlyPayment + ", lmCapCostReduction=" + lmCapCostReduction + ", lmColor=" + lmColor
				+ ", lmDealerFees=" + lmDealerFees + ", lmDealerName=" + lmDealerName + ", lmEst1yearTaxtitleregFees="
				+ lmEst1yearTaxtitleregFees + ", lmInhouseCategory=" + lmInhouseCategory + ", lmLeaseAcquisitionFee="
				+ lmLeaseAcquisitionFee + ", lmLeaseType=" + lmLeaseType + ", lmLessDealerDeposit="
				+ lmLessDealerDeposit + ", lmLessTradeinAllowance=" + lmLessTradeinAllowance + ", lmLoanAmount="
				+ lmLoanAmount + ", lmLoanAmountLm=" + lmLoanAmountLm + ", lmLoanPaymentEstimate="
				+ lmLoanPaymentEstimate + ", lmMake=" + lmMake + ", lmMiles=" + lmMiles + ", lmMilesCurrentlyVehicle="
				+ lmMilesCurrentlyVehicle + ", lmModel=" + lmModel + ", lmNumPaymentsInAdvance="
				+ lmNumPaymentsInAdvance + ", lmOriginalLeaseTerm=" + lmOriginalLeaseTerm + ", lmOriginationIncome="
				+ lmOriginationIncome + ", lmOriginationReserve=" + lmOriginationReserve + ", lmOriginationRevenue="
				+ lmOriginationRevenue + ", lmOther=" + lmOther + ", lmPersonReceivingQuote=" + lmPersonReceivingQuote
				+ ", lmProposedLesseeName=" + lmProposedLesseeName + ", lmQuote=" + lmQuote + ", lmQuoteConverted="
				+ lmQuoteConverted + ", lmQuoteId=" + lmQuoteId + ", lmQuoteState=" + lmQuoteState + ", lmQuoteStatus="
				+ lmQuoteStatus + ", lmQuoteValidDays=" + lmQuoteValidDays + ", lmRemainingPayments="
				+ lmRemainingPayments + ", lmResidualAtEndOfTerm=" + lmResidualAtEndOfTerm + ", lmSalesAgent="
				+ lmSalesAgent + ", lmSecurityDeposit=" + lmSecurityDeposit + ", lmSellingPrice=" + lmSellingPrice
				+ ", lmSellingPriceLm=" + lmSellingPriceLm + ", lmServiceContractFee=" + lmServiceContractFee
				+ ", lmSource=" + lmSource + ", lmTaxDueAtInception=" + lmTaxDueAtInception + ", lmTaxDueOnCashCapRed="
				+ lmTaxDueOnCashCapRed + ", lmTaxDueOnPmtsCapCost=" + lmTaxDueOnPmtsCapCost + ", lmTaxOnFees="
				+ lmTaxOnFees + ", lmTaxOnPayment=" + lmTaxOnPayment + ", lmTaxOnTrade=" + lmTaxOnTrade
				+ ", lmTotalCapitalizedCost=" + lmTotalCapitalizedCost + ", lmTotalDueAtSigning=" + lmTotalDueAtSigning
				+ ", lmTotalIncomeLifeOfLease=" + lmTotalIncomeLifeOfLease + ", lmTotalMonthlyPayment="
				+ lmTotalMonthlyPayment + ", lmTotalReserveLifeOfLease=" + lmTotalReserveLifeOfLease
				+ ", lmTotalRevenueLifeOfLease=" + lmTotalRevenueLifeOfLease + ", lmTrim=" + lmTrim
				+ ", lmVehicleApprisedValue=" + lmVehicleApprisedValue + ", lmVin=" + lmVin + ", lmYear=" + lmYear
				+ ", overrideFraud=" + overrideFraud + ", vdCashCapReduction=" + vdCashCapReduction
				+ ", vdDealerTxnFee=" + vdDealerTxnFee + ", vdLeaseCapCost=" + vdLeaseCapCost + ", vdLeaseResidual="
				+ vdLeaseResidual + ", vdLlpFinalResidual=" + vdLlpFinalResidual + ", vdLlpInitialResidual="
				+ vdLlpInitialResidual + ", vdLlpResidualAdjustment=" + vdLlpResidualAdjustment
				+ ", vdMonthlyDepreciation=" + vdMonthlyDepreciation + ", vdResidualRevenue=" + vdResidualRevenue
				+ ", vdTotalCapReduction=" + vdTotalCapReduction + ", vdTotalPrice=" + vdTotalPrice + ", vdTradeCredit="
				+ vdTradeCredit + ", vdTradePayoff=" + vdTradePayoff + ", vdTradeValue=" + vdTradeValue
				+ ", vdVehiclePrice=" + vdVehiclePrice + ", stateFipsC=" + stateFipsC + ", street1=" + street1
				+ ", street2=" + street2 + ", workNumber=" + workNumber + ", zipCode=" + zipCode + ", city=" + city
				+ ", country=" + country + ", email=" + email + ", faxNumber=" + faxNumber + ", mobileNumber="
				+ mobileNumber + ", customerId=" + customerId + ", inhouseCategory=" + inhouseCategory + ", employeeId="
				+ employeeId + ", dealerId=" + dealerId + ", businessContactFullName=" + businessContactFullName +  ", creditAnalystId=" + creditAnalystId + "]";
	}

}