package com.sales.marketing.model;

public class DealerFraudResponse {
	
	private String dealerName;
	
	private String dealerFlag;
	
	private String dealerFlagReason;

	public DealerFraudResponse() {
		
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	

	
	public String getDealerFlag() {
		return dealerFlag;
	}

	public void setDealerFlag(String dealerFlag) {
		this.dealerFlag = dealerFlag;
	}

	



	public String getDealerFlagReason() {
		return dealerFlagReason;
	}

	public void setDealerFlagReason(String dealerFlagReason) {
		this.dealerFlagReason = dealerFlagReason;
	}

	@Override
	public String toString() {
		return "DealerFraudResponse [dealerName=" + dealerName + ", dealerFlag=" + dealerFlag + ", dealerFlagReason="
				+ dealerFlagReason + "]";
	}
	
	

}
