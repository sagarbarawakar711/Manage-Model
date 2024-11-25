package com.sales.marketing.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the D_USER_ROLE database table.
 * 
 */
@Entity
@Table(name = "D_USER_ROLE")
@NamedQuery(name = "DUserRole.findAll", query = "SELECT d FROM DUserRole d")
public class DUserRole extends AuditModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USER_ROLE_C", unique = true, nullable = false, length = 5)
	private String userRoleC;

	@Column(name = "USER_ROLE_X", nullable = false, length = 50)
	private String userRoleX;

	public DUserRole() {
	}

	public String getUserRoleC() {
		return this.userRoleC;
	}

	public void setUserRoleC(String userRoleC) {
		this.userRoleC = userRoleC;
	}

	public String getUserRoleX() {
		return this.userRoleX;
	}

	public void setUserRoleX(String userRoleX) {
		this.userRoleX = userRoleX;
	}

	@Override
	public String toString() {
		return "DUserRole [userRoleC=" + userRoleC + ", userRoleX=" + userRoleX + "]";
	}

}