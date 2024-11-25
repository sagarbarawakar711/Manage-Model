package com.sales.marketing.model;

public class FraudIndicator {

	public String newLeaseEligibility;
	
	public String redFlagMonitoring;
       
    public String busApplicantBusinessName;
    
    public String busGuarantorBusinessName;
    
    public String indApplicant;      
    
    private String indApplicantMobile;
    
    public String busApplicantTaxId;
    
    public String busGuarantorTaxId;
    
    public String perGuarantor;
    
    public String perGuarantorMobile;
    
    public String secondperGuarantor;
    
    public String secondperGuarantorMobile;
    
    private String dealerName;
	
	private String dealerFlag;
	
	private String dealerFlagReason;
  
	private String fraudMobileFlag;
	
	private String vinFlag;
	
	private String vinFraudReason;
    
    
	

	public String getVinFlag() {
		return vinFlag;
	}

	public void setVinFlag(String vinFlag) {
		this.vinFlag = vinFlag;
	}

	public String getVinFraudReason() {
		return vinFraudReason;
	}

	public void setVinFraudReason(String vinFraudReason) {
		this.vinFraudReason = vinFraudReason;
	}

	public String getIndApplicantMobile() {
		return indApplicantMobile;
	}

	public void setIndApplicantMobile(String indApplicantMobile) {
		this.indApplicantMobile = indApplicantMobile;
	}

	public String getPerGuarantorMobile() {
		return perGuarantorMobile;
	}

	public void setPerGuarantorMobile(String perGuarantorMobile) {
		this.perGuarantorMobile = perGuarantorMobile;
	}

	public String getSecondperGuarantorMobile() {
		return secondperGuarantorMobile;
	}

	public void setSecondperGuarantorMobile(String secondperGuarantorMobile) {
		this.secondperGuarantorMobile = secondperGuarantorMobile;
	}

	public String getNewLeaseEligibility() {
		return newLeaseEligibility;
	}

	public void setNewLeaseEligibility(String newLeaseEligibility) {
		this.newLeaseEligibility = newLeaseEligibility;
	}

	public String getPerGuarantor() {
		return perGuarantor;
	}

	public void setPerGuarantor(String perGuarantor) {
		this.perGuarantor = perGuarantor;
	}

	public String getSecondperGuarantor() {
		return secondperGuarantor;
	}

	public void setSecondperGuarantor(String secondperGuarantor) {
		this.secondperGuarantor = secondperGuarantor;
	}

	public String getRedFlagMonitoring() {
		return redFlagMonitoring;
	}

	public void setRedFlagMonitoring(String redFlagMonitoring) {
		this.redFlagMonitoring = redFlagMonitoring;
	}
	
	
	public String getBusApplicantBusinessName() {
		return busApplicantBusinessName;
	}

	public void setBusApplicantBusinessName(String busApplicantBusinessName) {
		this.busApplicantBusinessName = busApplicantBusinessName;
	}

	public String getBusGuarantorBusinessName() {
		return busGuarantorBusinessName;
	}

	public void setBusGuarantorBusinessName(String busGuarantorBusinessName) {
		this.busGuarantorBusinessName = busGuarantorBusinessName;
	}

	

	public String getIndApplicant() {
		return indApplicant;
	}

	public void setIndApplicant(String indApplicant) {
		this.indApplicant = indApplicant;
	}
	

	public String getBusApplicantTaxId() {
		return busApplicantTaxId;
	}

	public void setBusApplicantTaxId(String busApplicantTaxId) {
		this.busApplicantTaxId = busApplicantTaxId;
	}

	public String getBusGuarantorTaxId() {
		return busGuarantorTaxId;
	}

	public void setBusGuarantorTaxId(String busGuarantorTaxId) {
		this.busGuarantorTaxId = busGuarantorTaxId;
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

	public String getFraudMobileFlag() {
		return fraudMobileFlag;
	}

	public void setFraudMobileFlag(String fraudMobileFlag) {
		this.fraudMobileFlag = fraudMobileFlag;
	}

	@Override
	public String toString() {
		return "FraudIndicator [newLeaseEligibility=" + newLeaseEligibility + ", redFlagMonitoring=" + redFlagMonitoring
				+ ", busApplicantBusinessName=" + busApplicantBusinessName + ", busGuarantorBusinessName="
				+ busGuarantorBusinessName + ", indApplicant=" + indApplicant + ", busApplicantTaxId="
				+ busApplicantTaxId + ", busGuarantorTaxId=" + busGuarantorTaxId + ", perGuarantor=" + perGuarantor
				+ ", secondperGuarantor=" + secondperGuarantor + ", dealerName=" + dealerName + ", dealerFlag="
				+ dealerFlag + ", dealerFlagReason=" + dealerFlagReason + ", fraudMobileFlag=" + fraudMobileFlag + "]";
	}
	
	

	


	
	

	
	
}
