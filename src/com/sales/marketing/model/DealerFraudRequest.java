package com.sales.marketing.model;

public class DealerFraudRequest {
	
	private String dealerName;

	public DealerFraudRequest() {
		
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	@Override
	public String toString() {
		return "DealerFraudRequest [dealerName=" + dealerName + "]";
	}
	
	

}
