package com.sales.marketing.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "DEALER_SECONDARY_CONTACTS")
@NamedQuery(name = "DealerSecondaryContacts.findAll", query = "SELECT u FROM DealerSecondaryContacts u")
public class DealerSecondaryContacts  implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="secon_dealer_id")
	private long dealerContactId;
	
	@Column(name="dealer_contact_id")
	private long dealerId;
	
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
	
	@Column(name="inactive_d")
	private Timestamp inactiveD;
	
	@Column(name="creation_user_i")
	private String creationUserI;
	
	@Column(name="creation_d")
	private Timestamp CreationD;
	
	@Column(name="last_updated_user_i")
	private String lastUpdatedUserI;
	
	@Column(name="last_updated_d")
	private Timestamp lastUpdatedD;
	
	    @ManyToOne
	    @JoinColumn(name = "dealer_contact_id", insertable = false, updatable = false)
	    @JsonIgnore
	    private DDealerInfo dealer;
	
	public DealerSecondaryContacts() {
		
	}
	
	@Column(name="merge_id")
	 private Integer mergeId;

	public Integer getMergeId() {
		return mergeId;
	}

	public void setMergeId(Integer mergeId) {
		this.mergeId = mergeId;
	}


	public long getDealerContactId() {
		return dealerContactId;
	}




	public void setDealerContactId(long dealerContactId) {
		this.dealerContactId = dealerContactId;
	}




	public long getDealerId() {
		return dealerId;
	}




	public void setDealerId(long dealerId) {
		this.dealerId = dealerId;
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

	public Timestamp getInactiveD() {
		return inactiveD;
	}

	public void setInactiveD(Timestamp inactiveD) {
		this.inactiveD = inactiveD;
	}

	public String getCreationUserI() {
		return creationUserI;
	}

	public void setCreationUserI(String creationUserI) {
		this.creationUserI = creationUserI;
	}

	public Timestamp getCreationD() {
		return CreationD;
	}

	public void setCreationD(Timestamp creationD) {
		CreationD = creationD;
	}

	public String getLastUpdatedUserI() {
		return lastUpdatedUserI;
	}

	public void setLastUpdatedUserI(String lastUpdatedUserI) {
		this.lastUpdatedUserI = lastUpdatedUserI;
	}

	public Timestamp getLastUpdatedD() {
		return lastUpdatedD;
	}

	public void setLastUpdatedD(Timestamp lastUpdatedD) {
		this.lastUpdatedD = lastUpdatedD;
	}

	

}
