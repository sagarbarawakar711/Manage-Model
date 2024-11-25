package com.sales.marketing.model;

import java.io.Serializable;
import java.sql.Timestamp;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * The persistent class for the EMPLOYEE_ASSIGNED_GOALS database table.
 *
 */
@Entity
@Table(name = "EMPLOYEE_ASSIGNED_GOALS")
@NamedQuery(name = "EmployeeAssignedGoal.findAll", query = "SELECT e FROM EmployeeAssignedGoal e")
public class EmployeeAssignedGoal extends AuditModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "EMPLOYEE_ASSIGNED_GOALS_GOALID_GENERATOR", sequenceName = "GOAL_ID_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEE_ASSIGNED_GOALS_GOALID_GENERATOR")
	@Column(name = "GOAL_ID", unique = true, nullable = false)
	private long goalId;

	@Column(name = "EMPLOYEE_ID", nullable = false)
	private Long employeeId;

	@Column(name = "STATE_FIPS_C", length = 2)
	private String stateFipsC;

	@Column(name = "GOAL_CATEGORY_C", nullable = false, length = 5)
	private String goalCategoryC;

	@Column(name = "GOAL_SUB_CATEGORY_C", length = 5)
	private String goalSubCategoryC;

	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "GOAL_ACTIVE_FROM_MONTH", nullable = false)
	private Timestamp goalActiveFromMonth;

	@Column(name = "WEIGHTAGE_PCT")
	private long weightagePct;

	@Column(name = "EXPECTED_COUNT")
	private long expectedCount;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	private Employee employee;

	public EmployeeAssignedGoal() {
	}

	public long getGoalId() {
		return this.goalId;
	}

	public void setGoalId(long goalId) {
		this.goalId = goalId;
	}

	public long getExpectedCount() {
		return this.expectedCount;
	}

	public void setExpectedCount(long expectedCount) {
		this.expectedCount = expectedCount;
	}

	public Timestamp getGoalActiveFromMonth() {
		return this.goalActiveFromMonth;
	}

	public void setGoalActiveFromMonth(Timestamp goalActiveFromMonth) {
		this.goalActiveFromMonth = goalActiveFromMonth;
	}

	public String getGoalSubCategoryC() {
		return this.goalSubCategoryC;
	}

	public void setGoalSubCategoryC(String goalSubCategoryC) {
		this.goalSubCategoryC = goalSubCategoryC;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getGoalCategoryC() {
		return goalCategoryC;
	}

	public void setGoalCategoryC(String goalCategoryC) {
		this.goalCategoryC = goalCategoryC;
	}

	public long getWeightagePct() {
		return this.weightagePct;
	}

	public void setWeightagePct(long weightagePct) {
		this.weightagePct = weightagePct;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getStateFipsC() {
		return this.stateFipsC;
	}

	public void setStateFipsC(String stateFipsC) {
		this.stateFipsC = stateFipsC;
	}

	@Override
	public String toString() {
		return "EmployeeAssignedGoal [goalId=" + goalId + ", employeeId=" + employeeId + ", goalCategoryC="
				+ goalCategoryC + ", stateFipsC=" + stateFipsC + ", goalSubCategoryC=" + goalSubCategoryC
				+ ", goalActiveFromMonth=" + goalActiveFromMonth + ", weightagePct=" + weightagePct + ", expectedCount="
				+ expectedCount + ", employee=" + employee + "]";
	}

}