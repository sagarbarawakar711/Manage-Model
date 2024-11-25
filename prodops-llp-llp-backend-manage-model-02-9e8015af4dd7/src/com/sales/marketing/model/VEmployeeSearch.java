package com.sales.marketing.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;



/**
 * The persistent class for the "v_employee_search" database table.
 * 
 */
@Entity
@Table(name="V_EMPLOYEE_SEARCH")
@NamedQuery(name="VEmployeeSearch.findAll", query="SELECT v FROM VEmployeeSearch v")
public class VEmployeeSearch implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "EMPLOYEE_ID", unique = true, nullable = false)
	private int employeeId;

	@Column(name="first_name")
	private String firstName;

	
	@Column(name="inactive_d")
	private Timestamp inactiveD;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	@Column(name="user_role_c")
	private String userRoleC;

	@Column(name="user_role_x")
	private String userRoleX;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id", referencedColumnName = "employee_id", insertable = false, updatable = false)
	private List<UserRoles> userRoles;
	
	public List<UserRoles> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRoles> userRoles) {
		this.userRoles = userRoles;
	}

	public VEmployeeSearch() {
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Timestamp getInactiveD() {
		return this.inactiveD;
	}

	public void setInactiveD(Timestamp inactiveD) {
		this.inactiveD = inactiveD;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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

}