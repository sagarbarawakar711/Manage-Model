package com.sales.marketing.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="support_inc")
@NamedQuery(name="SupportInc.findAll", query="SELECT s FROM SupportInc s")
public class SupportInc implements Serializable{

	@Id
	@SequenceGenerator(name="SUPPORT_INC_SI_ID_GENERATOR", sequenceName="SUPPORT_INC_SI_ID_SEQ",allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SUPPORT_INC_SI_ID_GENERATOR")
	@Column(name="si_id")
	private int siId;
	
	@Column(name = "employee_id")
	  private int employeeId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="severity")
	private String severity;
	
	@Column(name="screen_name")
	private String screenName;
	
	@Column(name="inc_desc")
	private String incDesc;
	
	@Column(name="creation_user_i")
	private String creationUserI;
	
	public String getCaseStatus() {
		return caseStatus;
	}

	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}

	@Column(name="case_status")
	private String caseStatus;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="created_at")
	private Timestamp createdAt;
	
	@Column(name="last_updated_user_i")
	private String lastUpdatedUserI;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="last_updated_at")
	private Timestamp lastUpdatedAt;

	public int getSiId() {
		return siId;
	}

	public void setSiId(int siId) {
		this.siId = siId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getIncDesc() {
		return incDesc;
	}

	public void setIncDesc(String incDesc) {
		this.incDesc = incDesc;
	}

	public String getCreationUserI() {
		return creationUserI;
	}

	public void setCreationUserI(String creationUserI) {
		this.creationUserI = creationUserI;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getLastUpdatedUserI() {
		return lastUpdatedUserI;
	}

	public void setLastUpdatedUserI(String lastUpdatedUserI) {
		this.lastUpdatedUserI = lastUpdatedUserI;
	}

	public Timestamp getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedAt(Timestamp lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	@Override
	public String toString() {
		return "SupportInc [siId=" + siId + ", employeeId=" + employeeId + ", title=" + title + ", severity=" + severity
				+ ", screenName=" + screenName + ", incDesc=" + incDesc + ", creationUserI=" + creationUserI
				+ ", caseStatus=" + caseStatus + ", createdAt=" + createdAt + ", lastUpdatedUserI=" + lastUpdatedUserI
				+ ", lastUpdatedAt=" + lastUpdatedAt + "]";
	}
	
	
	
}
