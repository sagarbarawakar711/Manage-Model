package com.sales.marketing.model;

import java.util.List;

public class FraudCustomerAndDealer {
	
	private List<FraudIndicator> fraudIndicator;
	
	private DealerFraudResponse dealerFraudResponse;

	public FraudCustomerAndDealer() {
		
	}

	public List<FraudIndicator> getFraudIndicator() {
		return fraudIndicator;
	}

	public void setFraudIndicator(List<FraudIndicator> fraudIndicator) {
		this.fraudIndicator = fraudIndicator;
	}

	public DealerFraudResponse getDealerFraudResponse() {
		return dealerFraudResponse;
	}

	public void setDealerFraudResponse(DealerFraudResponse dealerFraudResponse) {
		this.dealerFraudResponse = dealerFraudResponse;
	}

	@Override
	public String toString() {
		return "FraudCustomerAndDealer [fraudIndicator=" + fraudIndicator + ", dealerFraudResponse="
				+ dealerFraudResponse + "]";
	}
	
	
	

}
