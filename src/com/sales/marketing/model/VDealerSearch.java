package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "v_dealer_search" database table.
 * 
 */
@Entity
@Table(name="v_dealer_search")
@NamedQuery(name="VDealerSearch.findAll", query="SELECT v FROM VDealerSearch v")
public class VDealerSearch implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "DEALER_ID", unique = true, nullable = false)
	private int dealerId;

	@Column(name="dealer_name")
	private String dealerName;

	@Column(name="dealer_status")
	private String dealerStatus;

	@Column(name="state_n")
	private String stateName;

	@Column(name="street1")
	private String street1;
	
	@Column(name="street2")
	private String street2;
	
	@Column(name="city")
	private String city;

	@Column(name="zip_code")
	private String zipCode;
	
	@Column(name="STATE_FIPS_C")
	private String stateCode;
	
	@Column(name="country")
	private String country;
	
	@Column(name="sales_employee_id")
	private Integer salesempId;
	
	@Column(name="dealer_fraud_indicator")
	private Character dealerFraudIndicator;
	
	@Column(name="email")
	private String email;
	
	@Column(name="contact_title")
	private String contactTitle;
	
	@Column(name="mobile_number")
	private String mobileNumber;
	
	public Integer  getSalesempId() {
		return salesempId;
	}

	public void setSalesempId(Integer salesempId) {
		this.salesempId = salesempId;
	}

	public VDealerSearch() {
	}

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}



	public String getDealerName() {
		return dealerName;
	}



	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerStatus() {
		return dealerStatus;
	}
	public void setDealerStatus(String dealerStatus) {
		this.dealerStatus = dealerStatus;	
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
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



	public String getStateCode() {
		return stateCode;
	}



	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	

	public Character getDealerFraudIndicator() {
		return dealerFraudIndicator;
	}

	public void setDealerFraudIndicator(Character dealerFraudIndicator) {
		this.dealerFraudIndicator = dealerFraudIndicator;
	}
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactTitle() {
		return contactTitle;
	}

	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "VDealerSearch [dealerId=" + dealerId + ", dealerName=" + dealerName + ", dealerStatus=" + dealerStatus
				+ ", stateName=" + stateName + ", street1=" + street1 + ", street2=" + street2 + ", city=" + city
				+ ", zipCode=" + zipCode + ", stateCode=" + stateCode + ", country=" + country + ", salesempId="
				+ salesempId + ", dealerFraudIndicator=" + dealerFraudIndicator + ", email=" + email + ", contactTitle="
				+ contactTitle + ", mobileNumber=" + mobileNumber + "]";
	}

}