package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the ACTIVITY database table.
 *
 */
@Entity
@NamedQuery(name = "Activity.findAll", query = "SELECT a FROM Activity a")
public class Activity extends AuditModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "ACTIVITY_ACTIVITYID_GENERATOR", sequenceName = "ACTIVITY_ID_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACTIVITY_ACTIVITYID_GENERATOR")
	@Column(name = "ACTIVITY_ID", unique = true, nullable = false)
	private long activityId;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "ACTIVITY_D")
	private Timestamp activityD;

	@Column(name = "ACTIVITY_NOTES")
	private String activityNotes;

	@Column(name = "ACTIVITY_SOURCE_TYPE")
	private String activitySourceType;

	@Column(name = "ACTIVITY_TYPE")
	private String activityType;

	@Column(name = "VISIT_PURPOSE_TYPE")
	private String visitPurposeType;

	@Column(name = "VISIT_QUALITY")
	private BigDecimal visitQuality;

	@Column(name = "DEALER_ID", nullable = true)
	private long dealerId;

	@Column(name = "EMPLOYEE_ID", nullable = false)
	private long employeeId;

	// bi-directional many-to-one association to DDealerInfo
	// @ManyToOne
	// @JoinColumn(name="DEALER_ID", insertable=false, updatable=false)
	private DDealerInfo DDealerInfo;

	// bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name = "EMPLOYEE_ID", nullable = false, insertable = false, updatable = false)
	private Employee employee;

	@Column(name = "merge_id")
	private Integer mergeId;

	public Integer getMergeId() {
		return mergeId;
	}

	public void setMergeId(Integer mergeId) {
		this.mergeId = mergeId;
	}

	public Activity() {
	}

	public long getActivityId() {
		return this.activityId;
	}

	public void setActivityId(long activityId) {
		this.activityId = activityId;
	}

	public Timestamp getActivityD() {
		return this.activityD;
	}

	public void setActivityD(Timestamp activityD) {
		this.activityD = activityD;
	}

	public String getActivityNotes() {
		return this.activityNotes;
	}

	public void setActivityNotes(String activityNotes) {
		this.activityNotes = activityNotes;
	}

	public String getActivitySourceType() {
		return this.activitySourceType;
	}

	public void setActivitySourceType(String activitySourceType) {
		this.activitySourceType = activitySourceType;
	}

	public String getActivityType() {
		return this.activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getVisitPurposeType() {
		return this.visitPurposeType;
	}

	public void setVisitPurposeType(String visitPurposeType) {
		this.visitPurposeType = visitPurposeType;
	}

	public BigDecimal getVisitQuality() {
		return this.visitQuality;
	}

	public void setVisitQuality(BigDecimal visitQuality) {
		this.visitQuality = visitQuality;
	}

	public long getDealerId() {
		return this.dealerId;
	}

	public void setDealerId(long dealerId) {
		this.dealerId = dealerId;
	}

	public long getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public DDealerInfo getDDealerInfo() {
		return this.DDealerInfo;
	}

	public void setDDealerInfo(DDealerInfo DDealerInfo) {
		this.DDealerInfo = DDealerInfo;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Activity [Id=" + activityId + ", Date=" + activityD + ", Notes=" + activityNotes + ", sourceType="
				+ activitySourceType + ", type=" + activityType + ", visitPurpose=" + visitPurposeType
				+ ",visitQuality=" + visitQuality + ",dealer=" + dealerId + ",employee=" + employeeId + "]";
	}

}