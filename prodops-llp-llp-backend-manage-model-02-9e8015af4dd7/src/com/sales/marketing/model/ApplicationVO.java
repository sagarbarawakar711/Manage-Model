package com.sales.marketing.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplicationVO {
	

	private String dateOfApplication;
	

	private String dealerName;
	
	
	private String customerFirstName;
	

	private String customerMiddleName;
	

	private String customerLastName;
	

	private String customerBusinessName;
	
	
	private String customerType;
	
	
	private Integer year;
	

	private String make;
	
	
	private String model;
	
	
	private String dealSource;
	

	private String applicationStatus;
	

	private String appDeclineCategory;

	private String appDeclineReason;
	

	private String expectedAdvance;
	

	private Integer probToClose;
	

	private String dealStatus;
	

	private String dealDeclineReason;
	

	private String appState;
	

	private String fundedDate;
	
	
	
	
	public ApplicationVO() {
		
	}
	public String getDateOfApplication() {
		return dateOfApplication;
	}
	public void setDateOfApplication(String dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerMiddleName() {
		return customerMiddleName;
	}
	public void setCustomerMiddleName(String customerMiddleName) {
		this.customerMiddleName = customerMiddleName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getCustomerBusinessName() {
		return customerBusinessName;
	}
	public void setCustomerBusinessName(String customerBusinessName) {
		this.customerBusinessName = customerBusinessName;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
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
	public String getDealSource() {
		return dealSource;
	}
	public void setDealSource(String dealSource) {
		this.dealSource = dealSource;
	}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public String getAppDeclineCategory() {
		return appDeclineCategory;
	}
	public void setAppDeclineCategory(String appDeclineCategory) {
		this.appDeclineCategory = appDeclineCategory;
	}
	public String getAppDeclineReason() {
		return appDeclineReason;
	}
	public void setAppDeclineReason(String appDeclineReason) {
		this.appDeclineReason = appDeclineReason;
	}
	public String getExpectedAdvance() {
		return expectedAdvance;
	}
	public void setExpectedAdvance(String expectedAdvance) {
		this.expectedAdvance = expectedAdvance;
	}
	
	public Integer getProbToClose() {
		return probToClose;
	}
	public void setProbToClose(Integer probToClose) {
		this.probToClose = probToClose;
	}
	public String getDealStatus() {
		return dealStatus;
	}
	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}
	public String getDealDeclineReason() {
		return dealDeclineReason;
	}
	public void setDealDeclineReason(String dealDeclineReason) {
		this.dealDeclineReason = dealDeclineReason;
	}
	public String getAppState() {
		return appState;
	}
	public void setAppState(String appState) {
		this.appState = appState;
	}
	public String getFundedDate() {
		return fundedDate;
	}
	public void setFundedDate(String fundedDate) {
		this.fundedDate = fundedDate;
	}
	@Override
	public String toString() {
		return "ApplicationVO [dateOfApplication=" + dateOfApplication + ", dealerName=" + dealerName
				+ ", customerFirstName=" + customerFirstName + ", customerMiddleName=" + customerMiddleName
				+ ", customerLastName=" + customerLastName + ", customerBusinessName=" + customerBusinessName
				+ ", customerType=" + customerType + ", year=" + year + ", make=" + make + ", model=" + model
				+ ", dealSource=" + dealSource + ", applicationStatus=" + applicationStatus + ", appDeclineCategory="
				+ appDeclineCategory + ", appDeclineReason=" + appDeclineReason + ", expectedAdvance=" + expectedAdvance
				+ ", probToClose=" + probToClose + ", dealStatus=" + dealStatus + ", dealDeclineReason="
				+ dealDeclineReason + ", appState=" + appState + ", fundedDate=" + fundedDate + "]";
	}
	
	
	

}
