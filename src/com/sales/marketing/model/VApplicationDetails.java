package com.sales.marketing.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="v_application_details")
@NamedQuery(name="VApplicationDetails.findAll", query="SELECT v FROM VApplicationDetails v")
public class VApplicationDetails {

	@Id
	@Column(name="app_id", nullable = false, unique = true)
	private int appId;

	@Column(name="application_id")
	private String applicationId;
	
	@Column(name="quote_id")
	private String quoteId;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="app_date")
	private Timestamp appDate;
	
	@Column(name="cust_first_name")
	private String custFirstName;
	
	@Column(name="cust_middle_name")
	private String custMiddleName;
	
	@Column(name="cust_last_name")
	private String custlastName;
	
	@Column(name="cust_fraud_ind")
	private String custFraudInd;
	
	@Column(name="cust_fraud_reason")
	private String custFraudReason;
	
	@Column(name="dealer_name")
	private String dealerName;
	
	@Column(name="fraud_ind")
	private String fraudInd;
	
	@Column(name="red_flag_reason")
	private String redFlagReason;
	
	@Column(name="selling_price_lm")
	private BigDecimal sellingPriceLm;
	
	@Column(name="year")
	private BigDecimal year;
	
	
	@Column(name="make")
	private String make;
	
	@Column(name="model")
	private String model;
	
	@Column(name="loan_amount")
	private BigDecimal loanAmount;
	
	@Column(name="source")
	private String source;
	
	@Column(name="sales_agent")
	private long salesAgent;

	@Column(name="inhouse_category")
	private String inhouseCategory;
	
	@Column(name="quote_state")
	private String quoteState;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="app_converted")
	private Timestamp appConverted;

	@Column(name="app_status")
	private String appStatus;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="app_reviwed")
	private Timestamp appReviwed;
	
	@Column(name="app_decline_reason")
	private String appDeclineReason;
	

	@Column(name="app_decline_category")
	private String appDeclineCategory;
	
	@Column(name="deal_decline_reason")
	private String dealDeclineReason;
	
	@Column(name="deal_date")
	private Timestamp dealDate;
	
	@Column(name="funded_date")
	private Timestamp fundedDate;
	
	@Column(name="street1")
	private String street1;
	
	@Column(name="street2")
	private String street2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="zip_code")
	private String zipCode;
	
	@Column(name="state_fips_c")
	private String stateFipsC;
	
	@Column(name="country")
	private String country;
	
	@Column(name="work_number")
	private String workNumber;
	
	@Column(name="mobile_number")
	private String mobileNumber;
	
	@Column(name="fax_number")
	private String faxNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="creation_user_i")
	private String creationUserI;
	
	@Column(name="created_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Timestamp createdAt;
	
	@Column(name="last_updated_user_i")
	private String lastUpdatedUserI;
	
	@Column(name="last_updated_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Timestamp lastUpdatedAt;
	
	@Column(name="deal_status")
	private String dealStatus;
	
	@Column(name="emp_first_name")
	private String empFirstName;
	
	@Column(name="emp_second_name")
	private String empSecondName;
	
	@Column(name="emp_last_name")
	private String empLastName;
	
	@Column(name="customer_id")
	 private Integer customerId;
	
	@Column(name = "dealer_id")
	  private Integer dealerId; 
	
	@Column(name = "customer_type")
	  private String customerType;
	
	@Column(name = "business_name")
	  private String businessName;
	
	@Column(name = "deal_closing_probability_percent")
	  private Integer dealClosingProbabilityPercent;

	@Column(name = "vin")
		private String vin;
	
	@Column(name = "override_fraud")
		private String overrideFraud;
	
	@Column(name = "lease_number")
	  private String leaseNumber; 
	 
	@Column(name="credit_analyst_id")
	private Integer creditAnalystId;
	
	@Column(name="dealer_state")
	private String dealerState;
	
	
	public String getDealerState() {
		return dealerState;
	}

	public void setDealerState(String dealerState) {
		this.dealerState = dealerState;
	}

	public String getCustFraudInd() {
		return custFraudInd;
	}

	public void setCustFraudInd(String custFraudInd) {
		this.custFraudInd = custFraudInd;
	}

	public String getCustFraudReason() {
		return custFraudReason;
	}

	public void setCustFraudReason(String custFraudReason) {
		this.custFraudReason = custFraudReason;
	}

	public String getFraudInd() {
		return fraudInd;
	}

	public void setFraudInd(String fraudInd) {
		this.fraudInd = fraudInd;
	}

	public String getRedFlagReason() {
		return redFlagReason;
	}

	public void setRedFlagReason(String redFlagReason) {
		this.redFlagReason = redFlagReason;
	}

	public Integer getCreditAnalystId() {
		return creditAnalystId;
	}

	public void setCreditAnalystId(Integer creditAnalystId) {
		this.creditAnalystId = creditAnalystId;
	}

	public String getLeaseNumber() {
		return leaseNumber;
	}

	public void setLeaseNumber(String leaseNumber) {
		this.leaseNumber = leaseNumber;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
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

	public VApplicationDetails() {
		 
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	public Timestamp getAppDate() {
		return appDate;
	}

	public void setAppDate(Timestamp appDate) {
		this.appDate = appDate;
	}

	public String getCustFirstName() {
		return custFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	public String getCustMiddleName() {
		return custMiddleName;
	}

	public void setCustMiddleName(String custMiddleName) {
		this.custMiddleName = custMiddleName;
	}

	public String getCustlastName() {
		return custlastName;
	}

	public void setCustlastName(String custlastName) {
		this.custlastName = custlastName;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public BigDecimal getSellingPriceLm() {
		return sellingPriceLm;
	}

	public void setSellingPriceLm(BigDecimal sellingPriceLm) {
		this.sellingPriceLm = sellingPriceLm;
	}

	public BigDecimal getYear() {
		return year;
	}

	public void setYear(BigDecimal year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public BigDecimal getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public long getSalesAgent() {
		return salesAgent;
	}

	public void setSalesAgent(long salesAgent) {
		this.salesAgent = salesAgent;
	}

	public String getInhouseCategory() {
		return inhouseCategory;
	}

	public void setInhouseCategory(String inhouseCategory) {
		this.inhouseCategory = inhouseCategory;
	}

	public String getQuoteState() {
		return quoteState;
	}

	public void setQuoteState(String quoteState) {
		this.quoteState = quoteState;
	}

	public Timestamp getAppConverted() {
		return appConverted;
	}

	public void setAppConverted(Timestamp appConverted) {
		this.appConverted = appConverted;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public Timestamp getAppReviwed() {
		return appReviwed;
	}

	public void setAppReviwed(Timestamp appReviwed) {
		this.appReviwed = appReviwed;
	}

	public String getAppDeclineReason() {
		return appDeclineReason;
	}

	public void setAppDeclineReason(String appDeclineReason) {
		this.appDeclineReason = appDeclineReason;
	}

	public String getAppDeclineCategory() {
		return appDeclineCategory;
	}

	public void setAppDeclineCategory(String appDeclineCategory) {
		this.appDeclineCategory = appDeclineCategory;
	}

	public String getDealDeclineReason() {
		return dealDeclineReason;
	}

	public void setDealDeclineReason(String dealDeclineReason) {
		this.dealDeclineReason = dealDeclineReason;
	}

	public Timestamp getDealDate() {
		return dealDate;
	}

	public void setDealDate(Timestamp dealDate) {
		this.dealDate = dealDate;
	}

	public Timestamp getFundedDate() {
		return fundedDate;
	}

	public void setFundedDate(Timestamp fundedDate) {
		this.fundedDate = fundedDate;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStateFipsC() {
		return stateFipsC;
	}

	public void setStateFipsC(String stateFipsC) {
		this.stateFipsC = stateFipsC;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getWorkNumber() {
		return workNumber;
	}

	public void setWorkNumber(String workNumber) {
		this.workNumber = workNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreationUserI() {
		return creationUserI;
	}

	public void setCreationUserI(String creationUserI) {
		this.creationUserI = creationUserI;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getLastUpdatedUserI() {
		return lastUpdatedUserI;
	}

	public void setLastUpdatedUserI(String lastUpdatedUserI) {
		this.lastUpdatedUserI = lastUpdatedUserI;
	}

	public Timestamp getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedAt(Timestamp lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	public String getDealStatus() {
		return dealStatus;
	}

	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpSecondName() {
		return empSecondName;
	}

	public void setEmpSecondName(String empSecondName) {
		this.empSecondName = empSecondName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getDealerId() {
		return dealerId;
	}

	public void setDealerId(Integer dealerId) {
		this.dealerId = dealerId;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	} 
	
	
}
