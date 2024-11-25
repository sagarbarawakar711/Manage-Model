package com.sales.marketing.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the D_DEALER_INFO database table.
 * 
 */
@Entity
@Table(name = "D_DEALER_INFO")
public class DDealerInfo extends AuditModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "D_DEALER_INFO_DEALERID_GENERATOR", sequenceName = "DEALER_ID_SEQ", initialValue = 1,allocationSize =1 )
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "D_DEALER_INFO_DEALERID_GENERATOR")
	@Column(name = "DEALER_ID", unique = true, nullable = false, precision = 38)
	private long dealerId;

	@Column(name = "DEALER_NAME", nullable = false, length = 100)
	private String dealerName;

	@Column(name = "PRIORITY", length = 40)
	private String priority;

	@Column(name = "DEALER_STATUS", length = 10, nullable = false)
	private String dealerStatue;
	
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH })
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	
	@Column(name = "FIRST_NAME", length = 50)
	private String firstName;

	@Column(name = "MIDDLE_NAME", length = 50)
	private String middleName;

	@Column(name = "LAST_NAME", length = 50)
	private String lastName;

	@Column(name = "CONTACT_TITLE", length = 50)
	private String contactTitle;
	
	@Column(name = "APP_SOURCE", length = 20)
	private String appSource;
	
	@Column(name = "fraud_ind", nullable = false, length = 1)
	private String fraudInd;
	
	@Column(name = "red_flag_reason")
	private String redFlagReason;
	
	
	public String getFraudInd() {
		return fraudInd;
	}

	public void setFraudInd(String fraudInd) {
		this.fraudInd = fraudInd;
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

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH })	
	@JoinColumn(name = "DIGITAL_CONTACT_ID")
	private DigitalContactInfo digitalContactInfo;
	
	@OneToMany(mappedBy = "dealer")
    private List<DealerSecondaryContacts> dealerSecondaryContacts;

	public DDealerInfo() {
	}

	public long getDealerId() {
		return this.dealerId;
	}

	public void setDealerId(long dealerId) {
		this.dealerId = dealerId;
	}

	public String getDealerName() {
		return this.dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public DigitalContactInfo getDigitalContactInfo() {
		return this.digitalContactInfo;
	}

	public void setDigitalContactInfo(DigitalContactInfo digitalContactInfo) {
		this.digitalContactInfo = digitalContactInfo;
	}

	public String getDealerStatue() {
		return dealerStatue;
	}

	public void setDealerStatue(String dealerStatue) {
		this.dealerStatue = dealerStatue;
	}
	
	public String getAppSource() {
		return appSource;
	}

	public void setAppSource(String appSource) {
		this.appSource = appSource;
	}

	
	
	public List<DealerSecondaryContacts> getDealerSecondaryContacts() {
		return dealerSecondaryContacts;
	}

	public void setDealerSecondaryContacts(List<DealerSecondaryContacts> dealerSecondaryContacts) {
		this.dealerSecondaryContacts = dealerSecondaryContacts;
	}
	
	

	public String getRedFlagReason() {
		return redFlagReason;
	}

	public void setRedFlagReason(String redFlagReason) {
		this.redFlagReason = redFlagReason;
	}
	
	@Column(name = "merge_id")
	private Long mergeId;
	
	@Column(name = "merge_group_id", nullable = true)
	private Long mergeGroupId;

	public Long getMergeId() {
		return mergeId;
	}

	public void setMergeId(Long mergeId) {
		this.mergeId = mergeId;
	}

	public Long getMergeGroupId() {
		return mergeGroupId;
	}

	public void setMergeGroupId(Long mergeGroupId) {
		this.mergeGroupId = mergeGroupId;
	}

	@Override
	public String toString() {
		return "DDealerInfo [dealerId=" + dealerId + ", dealerName=" + dealerName + ", priority=" + priority
				+ ", dealerStatue=" + dealerStatue + ", address=" + address + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", contactTitle=" + contactTitle
				+ ", appSource=" + appSource + ", fraudInd=" + fraudInd + ", redFlagReason=" + redFlagReason
				+ ", digitalContactInfo=" + digitalContactInfo + ", dealerSecondaryContacts=" + dealerSecondaryContacts
				+ "]";
	}

	
	
}