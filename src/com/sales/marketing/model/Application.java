package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;

import java.sql.Timestamp;


/**
 * The persistent class for the "application" database table.
 *
 */
@Entity
@Table(name="application")
@NamedQuery(name="Application.findAll", query="SELECT a FROM Application a")
public class Application implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	/*
	 * @SequenceGenerator(name="APPLICATION_APPID_GENERATOR",
	 * sequenceName="APPLICATION_APP_ID_SEQ", allocationSize = 1)
	 *
	 * @GeneratedValue(strategy=GenerationType.SEQUENCE,
	 * generator="APPLICATION_APPID_GENERATOR")
	 */
	@Column(name="app_id", nullable = false, unique = true)
	private int appId;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="app_converted")
	private Timestamp appConverted;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="app_date")
	private Timestamp appDate;

	@Column(name="app_decline_category")
	private String appDeclineCategory;

	@Column(name="app_decline_reason")
	private String appDeclineReason;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="app_reviwed")
	private Timestamp appReviwed;

	@Column(name="app_status")
	private String appStatus;

	@Column(name="application_id")
	private String applicationId;

	@Column(name="city")
	private String city;

	@Column(name="country")
	private String country;

	@Column(name="created_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Timestamp createdAt;

	@Column(name="creation_user_i")
	private String creationUserI;


	@Column(name="deal_date")
	private Timestamp dealDate;

	@Column(name="deal_decline_reason")
	private String dealDeclineReason;

	@Column(name="deal_status")
	private String dealStatus;

	@Column(name="dealer_name")
	private String dealerName;

	@Column(name="email")
	private String email;

	@Column(name="fax_number")
	private String faxNumber;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="funded_date")
	private Timestamp fundedDate;

	@Column(name="inhouse_category")
	private String inhouseCategory;

	@Column(name="last_updated_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Timestamp lastUpdatedAt;

	@Column(name="last_updated_user_i")
	private String lastUpdatedUserI;

	@Column(name="loan_amount")
	private BigDecimal loanAmount;

	@Column(name="make")
	private String make;

	@Column(name="mobile_number")
	private String mobileNumber;

	@Column(name="model")
	private String model;
	

	@Column(name="vin")
	private String vin;
	
	
	@Column(name="proposed_lessee_name")
	private String proposedLesseeName;

	@Column(name="quote_id")
	private String quoteId;

	@Column(name="quote_state")
	private String quoteState;

	@Column(name="sales_agent")
	private long salesAgent;
	
	@Column(name="sales_agent_name")
	private String salesAgentName;
	
	@Column(name="credit_analyst_id")
	private Integer creditAnalystId;
	
	@Transient
	private String dealerFraudInd;
	
	@Transient
	private String dealerFraudReason;
	
	@Transient
	private String customerFraudInd;
	
	@Transient
	private String customerFraudReason;

	public String getDealerFraudInd() {
		return dealerFraudInd;
	}

	public void setDealerFraudInd(String dealerFraudInd) {
		this.dealerFraudInd = dealerFraudInd;
	}

	public String getDealerFraudReason() {
		return dealerFraudReason;
	}

	public void setDealerFraudReason(String dealerFraudReason) {
		this.dealerFraudReason = dealerFraudReason;
	}

	public String getCustomerFraudInd() {
		return customerFraudInd;
	}

	public void setCustomerFraudInd(String customerFraudInd) {
		this.customerFraudInd = customerFraudInd;
	}

	public String getCustomerFraudReason() {
		return customerFraudReason;
	}

	public void setCustomerFraudReason(String customerFraudReason) {
		this.customerFraudReason = customerFraudReason;
	}

	public Integer getCreditAnalystId() {
		return creditAnalystId;
	}

	public void setCreditAnalystId(Integer creditAnalystId) {
		this.creditAnalystId = creditAnalystId;
	}

	public String getSalesAgentName() {
		return salesAgentName;
	}

	public void setSalesAgentName(String salesAgentName) {
		this.salesAgentName = salesAgentName;
	}

	@Column(name="selling_price_lm")
	private BigDecimal sellingPriceLm;

	@Column(name="source")
	private String source;

	@Column(name="state_fips_c")
	private String stateFipsC;

	@Column(name="street1")
	private String street1;

	@Column(name="street2")
	private String street2;

	@Column(name="work_number")
	private String workNumber;

	@Column(name="year")
	private BigDecimal year;

	@Column(name="zip_code")
	private String zipCode;
	
	@Column(name="customer_id")
	 private Integer customerId;

	@Column(name = "dealer_id")
	  private Integer dealerId; 
	
	@Column(name = "deal_closing_probability_percent")
	  private Integer dealClosingProbabilityPercent; 
	
	@Column(name = "override_fraud")
	private String overrideFraud;
	
	@Column(name = "lease_number")
	private String leaseNumber;
	
	@Column(name = "business_contact_full_name")
	  private String businessContactFullName;
	
	@Column(name="merge_id")
	 private Integer mergeId;
	
	@Column(name = "merge_dealer_id")
	private Integer mergeDealerId;

	public Integer getMergeDealerId() {
		return mergeDealerId;
	}

	public void setMergeDealerId(Integer mergeDealerId) {
		this.mergeDealerId = mergeDealerId;
	}

	public Integer getMergeId() {
		return mergeId;
	}

	public void setMergeId(Integer mergeId) {
		this.mergeId = mergeId;
	}

	public String getLeaseNumber() {
		return leaseNumber;
	}

	public void setLeaseNumber(String leaseNumber) {
		this.leaseNumber = leaseNumber;
	}

	public String getOverrideFraud() {
		return overrideFraud;
	}

	public void setOverrideFraud(String overrideFraud) {
		this.overrideFraud = overrideFraud;
	}

	public Integer getDealClosingProbabilityPercent() {
		return dealClosingProbabilityPercent;
	}

	public void setDealClosingProbabilityPercent(Integer dealClosingProbabilityPercent) {
		this.dealClosingProbabilityPercent = dealClosingProbabilityPercent;
	}

	public Integer getDealerId() {
		return dealerId;
	}

	public void setDealerId(Integer dealerId) {
		this.dealerId = dealerId;
	}
	
	public String getBusinessContactFullName() {
		return businessContactFullName;
	}

	public void setBusinessContactFullName(String businessContactFullName) {
		this.businessContactFullName = businessContactFullName;
	}

	public Application() {
	}
	
	 

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public int getAppId() {
		return this.appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public Timestamp getAppConverted() {
		return this.appConverted;
	}

	public void setAppConverted(Timestamp appConverted) {
		this.appConverted = appConverted;
	}

	public Timestamp getAppDate() {
		return this.appDate;
	}

	public void setAppDate(Timestamp appDate) {
		this.appDate = appDate;
	}

	public String getAppDeclineCategory() {
		return this.appDeclineCategory;
	}

	public void setAppDeclineCategory(String appDeclineCategory) {
		this.appDeclineCategory = appDeclineCategory;
	}

	public String getAppDeclineReason() {
		return this.appDeclineReason;
	}

	public void setAppDeclineReason(String appDeclineReason) {
		this.appDeclineReason = appDeclineReason;
	}

	public Timestamp getAppReviwed() {
		return this.appReviwed;
	}

	public void setAppReviwed(Timestamp appReviwed) {
		this.appReviwed = appReviwed;
	}

	public String getAppStatus() {
		return this.appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public Timestamp getDealDate() {
		return this.dealDate;
	}

	public void setDealDate(Timestamp dealDate) {
		this.dealDate = dealDate;
	}

	public String getDealDeclineReason() {
		return this.dealDeclineReason;
	}

	public void setDealDeclineReason(String dealDeclineReason) {
		this.dealDeclineReason = dealDeclineReason;
	}

	public String getDealStatus() {
		return this.dealStatus;
	}

	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}

	public String getDealerName() {
		return this.dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFaxNumber() {
		return this.faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public Timestamp getFundedDate() {
		return this.fundedDate;
	}

	public void setFundedDate(Timestamp fundedDate) {
		this.fundedDate = fundedDate;
	}

	public String getInhouseCategory() {
		return this.inhouseCategory;
	}

	public void setInhouseCategory(String inhouseCategory) {
		this.inhouseCategory = inhouseCategory;
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

	public BigDecimal getLoanAmount() {
		return this.loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProposedLesseeName() {
		return this.proposedLesseeName;
	}

	public void setProposedLesseeName(String proposedLesseeName) {
		this.proposedLesseeName = proposedLesseeName;
	}

	public String getQuoteId() {
		return this.quoteId;
	}

	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	public String getQuoteState() {
		return this.quoteState;
	}

	public void setQuoteState(String quoteState) {
		this.quoteState = quoteState;
	}

	public long getSalesAgent() {
		return this.salesAgent;
	}

	public void setSalesAgent(long salesAgent) {
		this.salesAgent = salesAgent;
	}

	public BigDecimal getSellingPriceLm() {
		return this.sellingPriceLm;
	}

	public void setSellingPriceLm(BigDecimal sellingPriceLm) {
		this.sellingPriceLm = sellingPriceLm;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStateFipsC() {
		return this.stateFipsC;
	}

	public void setStateFipsC(String stateFipsC) {
		this.stateFipsC = stateFipsC;
	}

	public String getStreet1() {
		return this.street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return this.street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getWorkNumber() {
		return this.workNumber;
	}

	public void setWorkNumber(String workNumber) {
		this.workNumber = workNumber;
	}
	
	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public BigDecimal getYear() {
		return this.year;
	}

	public void setYear(BigDecimal year) {
		this.year = year;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return "Application [appId=" + appId + ", appConverted=" + appConverted + ", appDate=" + appDate
				+ ", appDeclineCategory=" + appDeclineCategory + ", appDeclineReason=" + appDeclineReason
				+ ", appReviwed=" + appReviwed + ", appStatus=" + appStatus + ", applicationId=" + applicationId
				+ ", city=" + city + ", country=" + country + ", createdAt=" + createdAt + ", creationUserI="
				+ creationUserI + ", dealDate=" + dealDate + ", dealDeclineReason=" + dealDeclineReason
				+ ", dealStatus=" + dealStatus + ", dealerName=" + dealerName + ", email=" + email + ", faxNumber="
				+ faxNumber + ", fundedDate=" + fundedDate + ", inhouseCategory=" + inhouseCategory + ", lastUpdatedAt="
				+ lastUpdatedAt + ", lastUpdatedUserI=" + lastUpdatedUserI + ", loanAmount=" + loanAmount + ", make="
				+ make + ", mobileNumber=" + mobileNumber + ", model=" + model + ", vin=" + vin
				+ ", proposedLesseeName=" + proposedLesseeName + ", quoteId=" + quoteId + ", quoteState=" + quoteState
				+ ", salesAgent=" + salesAgent + ", salesAgentName=" + salesAgentName + ", sellingPriceLm="
				+ sellingPriceLm + ", source=" + source + ", stateFipsC=" + stateFipsC + ", street1=" + street1
				+ ", street2=" + street2 + ", workNumber=" + workNumber + ", year=" + year + ", zipCode=" + zipCode
				+ ", customerId=" + customerId + ", dealerId=" + dealerId + ", dealClosingProbabilityPercent="
				+ dealClosingProbabilityPercent + ", overrideFraud=" + overrideFraud + ", leaseNumber=" + leaseNumber
				+ ", businessContactFullName=" + businessContactFullName + ", creditAnalystId=" + creditAnalystId +"]";
	}

	

	
}