package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the USER_LOGINS database table.
 * 
 */
@Entity
@Table(name = "USER_LOGINS")
@NamedQuery(name = "UserLogin.findAll", query = "SELECT u FROM UserLogin u")
public class UserLogin extends AuditModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "EMPLOYEE_ID", unique = true, nullable = false)
	private long employeeId;

	@Id
	@Column(name = "USER_ID", unique = true, nullable = false)
	private String userId;

	@Column(name = "PASSWORD_HASH", nullable = false)
	private String passwordHash;

	@Column(name = "PASSWORD_SALT", nullable = false)
	private String passwordSalt;

	@ManyToOne
	@JoinColumn(name = "EMPLOYEE_ID", insertable = false, updatable = false)
	private Employee employee;

	private String apiStatusMessage;

	public UserLogin() {
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPasswordHash() {
		return this.passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getPasswordSalt() {
		return this.passwordSalt;
	}

	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getApiStatusMessage() {
		return apiStatusMessage;
	}

	public void setApiStatusMessage(String apiStatusMessage) {
		this.apiStatusMessage = apiStatusMessage;
	}

}