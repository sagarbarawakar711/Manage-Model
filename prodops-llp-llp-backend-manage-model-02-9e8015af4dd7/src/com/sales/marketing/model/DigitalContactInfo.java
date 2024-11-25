package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DIGITAL_CONTACT_INFO database table.
 * 
 */
@Entity
@Table(name="DIGITAL_CONTACT_INFO")
@NamedQuery(name="DigitalContactInfo.findAll", query="SELECT d FROM DigitalContactInfo d")
public class DigitalContactInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIGITAL_CONTACT_INFO_DIGITALCONTACTID_GENERATOR", sequenceName="DIGITAL_CONTACT_ID_SEQ", initialValue = 1,allocationSize =1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIGITAL_CONTACT_INFO_DIGITALCONTACTID_GENERATOR")
	@Column(name="DIGITAL_CONTACT_ID", unique=true, nullable=false, precision=38)
	private long digitalContactId;

	@Column(nullable=false, length=50)
	private String email;

	@Column(name="FAX_NUMBER", length=12)
	private String faxNumber;

	@Column(name="MOBILE_NUMBER", length=12)
	private String mobileNumber;

	@Column(name="PREFERRED_CONTACT", length=25)
	private String preferredContact;

	@Column(name="WORK_NUMBER", length=12)
	private String workNumber;
	

	@Column(name="fraud_mobile_number", length=12)
	private String fraudMobileNumber;

	public String getFraudMobileNumber() {
		return fraudMobileNumber;
	}

	public void setFraudMobileNumber(String fraudMobileNumber) {
		this.fraudMobileNumber = fraudMobileNumber;
	}

	public DigitalContactInfo() {
	}

	public long getDigitalContactId() {
		return this.digitalContactId;
	}

	public void setDigitalContactId(long digitalContactId) {
		this.digitalContactId = digitalContactId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFaxNumber() {
		return this.faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPreferredContact() {
		return this.preferredContact;
	}

	public void setPreferredContact(String preferredContact) {
		this.preferredContact = preferredContact;
	}

	public String getWorkNumber() {
		return this.workNumber;
	}

	public void setWorkNumber(String workNumber) {
		this.workNumber = workNumber;
	}

}