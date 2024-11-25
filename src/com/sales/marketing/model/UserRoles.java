package com.sales.marketing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user_roles")
public class UserRoles {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_ROLE_ID_SEQ")
	@SequenceGenerator(name = "USER_ROLE_ID_SEQ", sequenceName = "samdbschema.user_role_id_seq", allocationSize = 1)
	@Column(name = "user_role_id", unique = true, nullable = false)
	private Long userRoleId;

	@ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    @JsonIgnore
    private Employee employee;
	
	@Column(name = "user_role_c", nullable = false, length = 10)
	private String userRoleC;

	public Long getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getUserRoleC() {
		return userRoleC;
	}

	public void setUserRoleC(String userRoleC) {
		this.userRoleC = userRoleC;
	}
	
}