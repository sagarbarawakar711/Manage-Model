package com.sales.marketing.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuoteVO {
	

	private String dateOfQuote;
	

	private String dealerName;
	
	
	private String customerFirstName;
	

	private String customerMiddleName;
	

	private String customerLastName;
	

	private String customerBusinessName;
	

	private String customerType;
	
	
	private String capCost;
	

	private String dealerState;
	
	
	
	public String getDateOfQuote() {
		return dateOfQuote;
	}
	public void setDateOfQuote(String dateOfQuote) {
		this.dateOfQuote = dateOfQuote;
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
	public String getCapCost() {
		return capCost;
	}
	public void setCapCost(String capCost) {
		this.capCost = capCost;
	}
	public String getDealerState() {
		return dealerState;
	}
	public void setDealerState(String dealerState) {
		this.dealerState = dealerState;
	}
	@Override
	public String toString() {
		return "QuoteVO [dateOfQuote=" + dateOfQuote + ", dealerName=" + dealerName + ", customerFirstName="
				+ customerFirstName + ", customerMiddleName=" + customerMiddleName + ", customerLastName="
				+ customerLastName + ", customerBusinessName=" + customerBusinessName + ", customerType=" + customerType
				+ ", capCost=" + capCost + ", dealerState=" + dealerState + "]";
	}
	
	

}
