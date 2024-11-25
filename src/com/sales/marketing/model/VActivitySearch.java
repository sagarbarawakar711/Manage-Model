package com.sales.marketing.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * The persistent class for the "v_activity_search" database table.
 *
 */
@Entity
@Table(name="v_activity_search")
@NamedQuery(name="VActivitySearch.findAll", query="SELECT v FROM VActivitySearch v")
public class VActivitySearch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "activity_id", unique = true, nullable = false)
	private int activityId;

	@Column(name="activity_d")
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private Timestamp activityDate;

	@Column(name="activity_type")
	private String activityType;

	@Column(name="activity_source_type")
	private String activitySourceType;

	@Column(name="visit_purpose_type")
	private String visitPurposeType;

	@Column(name="visit_quality")
	private String visitQuality;

	@Column(name="activity_notes")
	private String activityNotes;

	@Column(name="dealer_name")
	private String dealerName;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	@Column(name = "DEALER_ID")
	private Long dealerId;

	@Column(name = "EMPLOYEE_ID")
	private long employeeId;

	public VActivitySearch() {
	}


	public int getActivityId() {
		return activityId;
	}


	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}


	public Timestamp getActivityDate() {
		return activityDate;
	}


	public void setActivityDate(Timestamp activityDate) {
		this.activityDate = activityDate;
	}


	public String getActivityType() {
		return activityType;
	}


	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}


	public String getActivitySourceType() {
		return activitySourceType;
	}


	public void setActivitySourceType(String activitySourceType) {
		this.activitySourceType = activitySourceType;
	}


	public String getVisitPurposeType() {
		return visitPurposeType;
	}


	public void setVisitPurposeType(String visitPurposeType) {
		this.visitPurposeType = visitPurposeType;
	}


	public String getVisitQuality() {
		return visitQuality;
	}


	public void setVisitQuality(String visitQuality) {
		this.visitQuality = visitQuality;
	}


	public String getActivityNotes() {
		return activityNotes;
	}


	public void setActivityNotes(String activityNotes) {
		this.activityNotes = activityNotes;
	}


	public String getDealerName() {
		return dealerName;
	}


	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public long getDealerId() {
		return dealerId;
	}


	public void setDealerId(long dealerId) {
		this.dealerId = dealerId;
	}


	public long getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}


}