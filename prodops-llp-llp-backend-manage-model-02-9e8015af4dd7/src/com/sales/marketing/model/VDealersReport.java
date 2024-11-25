package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "v_dealer_search" database table.
 * 
 */
@Entity
@Table(name="v_dealer_grading_sales_agent")
@NamedQuery(name="VDealersReport.findAll", query="SELECT v FROM VDealersReport v")
public class VDealersReport implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "DEALER_ID")
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
	
	@Column(name = "employee_id")
	private Integer employeeId;
	
	@Column(name="employee_first_name")
	private String firstName;
	
	@Column(name="employee_last_name")
	private String lastName;

	@Column(name="dealer_activity_level")
	private String dealerActivityLevel;
	
	@Column(name= "days")
	private Integer dealerDays;
	
	@Column(name="work_number")
	private String workNumber;

	@Column(name="mobile_number")
	private String mobileNumber;
	
	@Column(name="fax_number")
	private String faxNumber;
	
	@Column(name="email")
	private String email;
	
	public VDealersReport() {
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

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDealerActivityLevel() {
		return dealerActivityLevel;
	}

	public void setDealerActivityLevel(String dealerActivityLevel) {
		this.dealerActivityLevel = dealerActivityLevel;
	}

	public Integer getDealerDays() {
		return dealerDays;
	}

	public void setDealerDays(Integer dealerDays) {
		this.dealerDays = dealerDays;
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
	
	@Override
	public String toString() {
		return "VDealersReport [dealerId=" + dealerId + ", dealerName=" + dealerName + ", dealerStatus=" + dealerStatus
				+ ", stateName=" + stateName + ", street1=" + street1 + ", street2=" + street2 + ", city=" + city
				+ ", zipCode=" + zipCode + ", stateCode=" + stateCode + ", country=" + country + ", employeeId="
				+ employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", dealerActivityLevel="
				+ dealerActivityLevel + ", dealerDays=" + dealerDays + ", workNumber=" + workNumber + ", mobileNumber="
				+ mobileNumber + ", faxNumber=" + faxNumber + ", email=" + email + "]";
	}

}