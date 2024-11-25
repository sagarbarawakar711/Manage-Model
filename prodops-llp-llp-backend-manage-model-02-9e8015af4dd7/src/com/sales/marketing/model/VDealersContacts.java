package com.sales.marketing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="v_dealer_contacts")
@NamedQuery(name="VDealersContacts.findAll", query="SELECT v FROM VDealersContacts v")
public class VDealersContacts {
	
    @Id
	@Column(name="dealer_name")
	private String dealerName;

	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;

	@Column(name="contact_title")
	private String contactTitle;

	
	@Column(name="work_number")
	private String workNumber;

	@Column(name="mobile_number")
	private String mobileNumber;
	
	@Column(name="fax_number")
	private String faxNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="contact_type")
	private String contactType;

	public VDealersContacts() {
		
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactTitle() {
		return contactTitle;
	}

	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
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

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	@Override
	public String toString() {
		return "VDealersContacts [dealerName=" + dealerName + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", contactTitle=" + contactTitle + ", workNumber=" + workNumber
				+ ", mobileNumber=" + mobileNumber + ", faxNumber=" + faxNumber + ", email=" + email + ", contactType="
				+ contactType + "]";
	}
	
	


}
