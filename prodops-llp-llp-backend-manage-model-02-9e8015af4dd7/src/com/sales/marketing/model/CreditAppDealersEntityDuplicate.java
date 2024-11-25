package com.sales.marketing.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "credit_app_dealers_duplicate")
public class CreditAppDealersEntityDuplicate implements Serializable {

	private static final long serialVersionUID = 5812520934236023556L;

	@Column(name = "dealer_id", unique = true, nullable = false)
	private Integer dealerID;
	
	public Integer getDealerID() {
		return dealerID;
	}

	public void setDealerID(Integer dealerID) {
		this.dealerID = dealerID;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Id
	@Column(name = "lender_id", nullable = false, unique = true)
	private String lenderId;

	@Column(name = "lender_dealer_id")
	private Integer lenderDealerId;

	@Column(name = "legal_dealer_name")
	private String legalDealerName;

	@Column(name = "dba_dealer_name")
	private String dbaDealerName;

	@Column(name = "street")
	private String street;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "zip_code")
	private String zipcode;

	@Column(name = "phone")
	private BigInteger phone;

	@Column(name = "fax")
	private BigInteger fax;

	@Column(name = "status")
	private Character status;

	@Column(name = "dealer_source")
	private String dealersource;

	@Column(name = "creation_user_i")
	private String creationUserI;

	@Column(name = "creation_d")
	private Timestamp creationD;

	@Column(name = "last_updated_user_i")
	private String lastUpdatedUserI;

	@Column(name = "last_updated_d")
	private Timestamp lastUpdatedD;
	
	@Column(name = "merge_id")
	private Integer mergeId;

	public Integer getMergeId() {
		return mergeId;
	}

	public void setMergeId(Integer mergeId) {
		this.mergeId = mergeId;
	}

	public String getLenderId() {
		return lenderId;
	}

	public void setLenderId(String lenderId) {
		this.lenderId = lenderId;
	}

	public Integer getLenderDealerId() {
		return lenderDealerId;
	}

	public void setLenderDealerId(Integer lenderDealerId) {
		this.lenderDealerId = lenderDealerId;
	}

	public String getLegalDealerName() {
		return legalDealerName;
	}

	public void setLegalDealerName(String legalDealerName) {
		this.legalDealerName = legalDealerName;
	}

	public String getDbaDealerName() {
		return dbaDealerName;
	}

	public void setDbaDealerName(String dbaDealerName) {
		this.dbaDealerName = dbaDealerName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public BigInteger getPhone() {
		return phone;
	}

	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}

	public BigInteger getFax() {
		return fax;
	}

	public void setFax(BigInteger fax) {
		this.fax = fax;
	}

	public String getDealersource() {
		return dealersource;
	}

	public void setDealersource(String dealersource) {
		this.dealersource = dealersource;
	}

	public String getCreationUserI() {
		return creationUserI;
	}

	public void setCreationUserI(String creationUserI) {
		this.creationUserI = creationUserI;
	}

	public String getLastUpdatedUserI() {
		return lastUpdatedUserI;
	}

	public void setLastUpdatedUserI(String lastUpdatedUserI) {
		this.lastUpdatedUserI = lastUpdatedUserI;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Timestamp getCreationD() {
		return creationD;
	}

	public void setCreationD(Timestamp creationD) {
		this.creationD = creationD;
	}

	public Timestamp getLastUpdatedD() {
		return lastUpdatedD;
	}

	public void setLastUpdatedD(Timestamp lastUpdatedD) {
		this.lastUpdatedD = lastUpdatedD;
	}

}
