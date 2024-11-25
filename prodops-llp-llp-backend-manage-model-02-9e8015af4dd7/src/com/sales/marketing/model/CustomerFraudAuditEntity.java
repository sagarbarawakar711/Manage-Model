package com.sales.marketing.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "customer_fraud_audit")
public class CustomerFraudAuditEntity {

	private static final long serialVersionUID = 2L;
	@Id
	@SequenceGenerator(name = "CUSTOMER_FRAUD_AUDIT_ID_SEQ_GENERATOR", sequenceName = "customer_fraud_audit_id_seq", initialValue = 1,allocationSize =1 )
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_FRAUD_AUDIT_ID_SEQ_GENERATOR")
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "customer_id")
	private long customerId;
	
	@Column(name = "fraud_reason")
	private String fraudReason;
	
	@Column(name = "customer_fraud_flag")
	private String customerFraudFlag;
	
	@Column(name = "primary_phone_number")
	private String primaryPhoneNumber;
	
	@Column(name = "primary_phone_fraud_flag")
	private String primaryPhoneFraudFlag;
	
	@Column(name = "updated_user_id")
	private String updatedUserId;
	
	@Column(name = "updated_date")
	private Timestamp updatedD;
	
	@Column(name = "merge_id")
	private Long mergeId;

	public Long getMergeId() {
		return mergeId;
	}

	public void setMergeId(Long mergeId) {
		this.mergeId = mergeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrimaryPhoneNumber() {
		return primaryPhoneNumber;
	}

	public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
		this.primaryPhoneNumber = primaryPhoneNumber;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getFraudReason() {
		return fraudReason;
	}

	public void setFraudReason(String fraudReason) {
		this.fraudReason = fraudReason;
	}

	public String getCustomerFraudFlag() {
		return customerFraudFlag;
	}

	public void setCustomerFraudFlag(String customerFraudFlag) {
		this.customerFraudFlag = customerFraudFlag;
	}

	public String getPrimaryPhoneFraudFlag() {
		return primaryPhoneFraudFlag;
	}

	public void setPrimaryPhoneFraudFlag(String primaryPhoneFraudFlag) {
		this.primaryPhoneFraudFlag = primaryPhoneFraudFlag;
	}

	public String getUpdatedUserId() {
		return updatedUserId;
	}

	public void setUpdatedUserId(String updatedUserId) {
		this.updatedUserId = updatedUserId;
	}

	public Timestamp getUpdatedD() {
		return updatedD;
	}

	public void setUpdatedD(Timestamp updatedD) {
		this.updatedD = updatedD;
	}

	
	
	
	
	
}
