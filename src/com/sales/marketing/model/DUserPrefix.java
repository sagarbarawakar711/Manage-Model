package com.sales.marketing.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the D_USER_PREFIX database table.
 * 
 */
@Entity
@Table(name="D_USER_PREFIX")
@NamedQuery(name="DUserPrefix.findAll", query="SELECT d FROM DUserPrefix d")
public class DUserPrefix extends AuditModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_PREFIX_C", unique=true, nullable=false, length=5)
	private String userPrefixC;

	@Column(name="USER_PREFIX_X", nullable=false, length=50)
	private String userPrefixX;

	public DUserPrefix() {
	}

	public String getUserPrefixC() {
		return this.userPrefixC;
	}

	public void setUserPrefixC(String userPrefixC) {
		this.userPrefixC = userPrefixC;
	}

	public String getUserPrefixX() {
		return this.userPrefixX;
	}

	public void setUserPrefixX(String userPrefixX) {
		this.userPrefixX = userPrefixX;
	}

	@Override
	public String toString() {
		return "DUserPrefix [userPrefixC=" + userPrefixC + ", userPrefixX=" + userPrefixX + "]";
	}

	
}