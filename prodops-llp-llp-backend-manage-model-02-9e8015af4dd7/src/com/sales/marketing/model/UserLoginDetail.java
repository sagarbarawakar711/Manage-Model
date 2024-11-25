package com.sales.marketing.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;



/**
 * The persistent class for the USER_LOGIN_DETAILS database table.
 *
 */
@Entity
@Table(name="USER_LOGIN_DETAILS")
@NamedQuery(name="UserLoginDetail.findAll", query="SELECT u FROM UserLoginDetail u")
public class UserLoginDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID", unique=true, nullable=false)
	private String userId;

	@Column(name="USER_ROLE_C", length=2)
	private String userRoleC;

	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name="USER_LOGIN_TIME")
	private Timestamp userLoginTime;

	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name="USER_LOGOUT_TIME")
	private Timestamp userLogoutTime;

	public UserLoginDetail() {
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Timestamp getUserLoginTime() {
		return this.userLoginTime;
	}

	public void setUserLoginTime(Timestamp userLoginTime) {
		this.userLoginTime = userLoginTime;
	}

	public Timestamp getUserLogoutTime() {
		return this.userLogoutTime;
	}

	public void setUserLogoutTime(Timestamp userLogoutTime) {
		this.userLogoutTime = userLogoutTime;
	}

	public String getUserRoleC() {
		return this.userRoleC;
	}

	public void setUserRoleC(String userRoleC) {
		this.userRoleC = userRoleC;
	}

	@Override
	public String toString() {
		return "UserLoginDetail [userId=" + userId + ", userRoleC=" + userRoleC + ", userLoginTime=" + userLoginTime
				+ ", userLogoutTime=" + userLogoutTime + "]";
	}

}