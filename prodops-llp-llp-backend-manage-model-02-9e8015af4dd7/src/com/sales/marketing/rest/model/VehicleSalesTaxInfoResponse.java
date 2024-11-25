package com.sales.marketing.rest.model;

public class VehicleSalesTaxInfoResponse {

	private String stateCode;
	private Double stateTaxRate;
	private Double countyTaxRate;
	private Double zipCodeTaxRate;
	private boolean nextPayDealer;
	private boolean payDealerDMVfees;
	private boolean txPaidByDealer;
	private boolean isTradeTaxExempt;
	
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public Double getStateTaxRate() {
		return stateTaxRate;
	}
	public void setStateTaxRate(Double stateTaxRate) {
		this.stateTaxRate = stateTaxRate;
	}
	public Double getCountyTaxRate() {
		return countyTaxRate;
	}
	public void setCountyTaxRate(Double countyTaxRate) {
		this.countyTaxRate = countyTaxRate;
	}
	public Double getZipCodeTaxRate() {
		return zipCodeTaxRate;
	}
	public void setZipCodeTaxRate(Double zipCodeTaxRate) {
		this.zipCodeTaxRate = zipCodeTaxRate;
	}
	public boolean isNextPayDealer() {
		return nextPayDealer;
	}
	public void setNextPayDealer(boolean nextPayDealer) {
		this.nextPayDealer = nextPayDealer;
	}
	public boolean isPayDealerDMVfees() {
		return payDealerDMVfees;
	}
	public void setPayDealerDMVfees(boolean payDealerDMVfees) {
		this.payDealerDMVfees = payDealerDMVfees;
	}
	public boolean isTxPaidByDealer() {
		return txPaidByDealer;
	}
	public void setTxPaidByDealer(boolean txPaidByDealer) {
		this.txPaidByDealer = txPaidByDealer;
	}
	public boolean isTradeTaxExempt() {
		return isTradeTaxExempt;
	}
	public void setTradeTaxExempt(boolean isTradeTaxExempt) {
		this.isTradeTaxExempt = isTradeTaxExempt;
	}
	
	
	
}
