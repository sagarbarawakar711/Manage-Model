package com.sales.marketing.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the CUSTOMER database table.
 * 
 */
@Entity
@Table(name = "CUSTOMER")
public class CustomerReinsert extends AuditModel implements Serializable {
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
	
	@Column(name = "ADDRESS_ID", nullable = false)
	private Long addressId;

	@Column(name = "DIGITAL_CONTACT_ID", nullable = false)
	private Long digitalContactId;
	
	/*--- manually added following attribute ---*/
	@Column(name = "DEALER_ID", nullable = true)
	private Long dealerId;

	/*--- manually added following attribute ---*/
	@Column(name = "USER_PREFIX_C", length = 5)
	private String userPrefixC;

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

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getFraudInd() {
		return fraudInd;
	}

	public void setFraudInd(String fraudInd) {
		this.fraudInd = fraudInd;
	}

	public String getRedFlagReason() {
		return redFlagReason;
	}

	public void setRedFlagReason(String redFlagReason) {
		this.redFlagReason = redFlagReason;
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

	public Long getMergeGroupId() {
		return mergeGroupId;
	}

	public void setMergeGroupId(Long mergeGroupId) {
		this.mergeGroupId = mergeGroupId;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public Long getDigitalContactId() {
		return digitalContactId;
	}

	public void setDigitalContactId(Long digitalContactId) {
		this.digitalContactId = digitalContactId;
	}

	public Long getDealerId() {
		return dealerId;
	}

	public void setDealerId(Long dealerId) {
		this.dealerId = dealerId;
	}

	public String getUserPrefixC() {
		return userPrefixC;
	}

	public void setUserPrefixC(String userPrefixC) {
		this.userPrefixC = userPrefixC;
	}
	
}