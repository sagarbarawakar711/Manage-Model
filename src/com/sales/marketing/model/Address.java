package com.sales.marketing.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the ADDRESS database table.
 * 
 */
@Entity
@Table(name = "ADDRESS")
@NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a")
public class Address extends AuditModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "ADDRESS_ADDRESSID_GENERATOR", sequenceName = "ADDRESS_ID_SEQ", initialValue = 1,allocationSize =1 )
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADDRESS_ADDRESSID_GENERATOR" )
	@Column(name = "ADDRESS_ID", unique = true, nullable = false)
	private long addressId;

	@Column(nullable = false, length = 50)
	private String street1;

	@Column(length = 50)
	private String street2;

	@Column(nullable = false, length = 50)
	private String city;

	@Column(name = "ZIP_CODE", length = 15)
	private String zipCode;

	@Column(name = "STATE_FIPS_C", length = 2)
	private String stateFipsC;

	@Column(nullable = false, length = 40)
	private String country;

	@Column(name = "ADDRESS_TYPE", length = 10)
	private String addressType;

	@ManyToOne
	@JoinColumn(name="STATE_FIPS_C", insertable=false, updatable=false)
	private DStateFip DStateFip;
	
	public Address() {
	}

	public long getAddressId() {
		return this.addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStateFipsC() {
		return this.stateFipsC;
	}

	public void setStateFipsC(String stateFipsC) {
		this.stateFipsC = stateFipsC;
	}

	public String getStreet1() {
		return this.street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return this.street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public DStateFip getDStateFip() {
		return this.DStateFip;
	}

	public void setDStateFip(DStateFip DStateFip) {
		this.DStateFip = DStateFip;
	}
}