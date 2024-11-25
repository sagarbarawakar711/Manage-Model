package com.sales.marketing.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * The persistent class for the CUSTOMER database table.
 * 
 */
@Entity
@Table(name = "customer_duplicate")
public class CustomerDuplicate extends AuditModel implements Serializable {
	private static final long serialVersionUID = 2L;
	@Id
	@Column(name = "CUSTOMER_ID", unique = true, nullable = false)
	private long customerId;
	
	@Column(name = "FIRST_NAME", nullable = true, length = 40)
	private String firstName;

	@Column(name = "MIDDLE_NAME", length = 40)
	private String middleName;

	@Column(name = "LAST_NAME", nullable = false, length = 40)
	private String lastName;
	
	@Column(name = "BUSINESS_NAME", nullable = true, length = 40)
	private String businessName;
	
	@Column(name = "CUSTOMER_TYPE", nullable = false, length=1)
	private String customerType;
	
	@Column(name = "fraud_ind", nullable = false, length=1)
	private String fraudInd;
	
	@Column(name = "red_flag_reason")
	private String redFlagReason;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "merge_id")
	private Long mergeId;
	
	@Column(name = "merge_group_id", nullable = true)
	private Long mergeGroupId;
	
	@Transient
	private Date mergeDate;
	
	public Date getMergeDate() {
		return mergeDate;
	}

	public void setMergeDate(Date mergeDate) {
		this.mergeDate = mergeDate;
	}

	public Long getMergeGroupId() {
		return mergeGroupId;
	}

	public void setMergeGroupId(Long mergeGroupId) {
		this.mergeGroupId = mergeGroupId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getMergeId() {
		return mergeId;
	}

	public void setMergeId(Long mergeId) {
		this.mergeId = mergeId;
	}

	public String getFraudInd() {
		return fraudInd;
	}

	public void setFraudInd(String fraudInd) {
		this.fraudInd = fraudInd;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "ADDRESS_ID", nullable = false)
	private Address address;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "DIGITAL_CONTACT_ID", nullable = false)
	private DigitalContactInfo digitalContactInfo;
	
	@ManyToOne
	@JoinColumn(name="DEALER_ID", nullable=true, insertable=false, updatable=false)
	private DDealerInfo DDealerInfo;

	/*--- manually added following attribute ---*/
	@Column(name = "DEALER_ID", nullable = true)
	private Long dealerId;

	/*--- manually added following attribute ---*/
	@Column(name = "USER_PREFIX_C", length = 5)
	private String userPrefixC;

	@ManyToOne
	@JoinColumn(name = "USER_PREFIX_C", insertable = false, updatable = false) 
	private DUserPrefix DUserPrefix;

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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
	
	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public DigitalContactInfo getDigitalContactInfo() {
		return digitalContactInfo;
	}

	public void setDigitalContactInfo(DigitalContactInfo digitalContactInfo) {
		this.digitalContactInfo = digitalContactInfo;
	}

	public DDealerInfo getDDealerInfo() {
		return DDealerInfo;
	}

	public void setDDealerInfo(DDealerInfo dDealerInfo) {
		DDealerInfo = dDealerInfo;
	}

	public String getUserPrefixC() {
		return userPrefixC;
	}

	public void setUserPrefixC(String userPrefixC) {
		this.userPrefixC = userPrefixC;
	}

	public DUserPrefix getDUserPrefix() {
		return DUserPrefix;
	}

	public void setDUserPrefix(DUserPrefix dUserPrefix) {
		DUserPrefix = dUserPrefix;
	}

	public Long getDealerId() {
		return dealerId;
	}

	public void setDealerId(Long dealerId) {
		this.dealerId = dealerId;
	}

	public String getRedFlagReason() {
		return redFlagReason;
	}

	public void setRedFlagReason(String redFlagReason) {
		this.redFlagReason = redFlagReason;
	}
	
}