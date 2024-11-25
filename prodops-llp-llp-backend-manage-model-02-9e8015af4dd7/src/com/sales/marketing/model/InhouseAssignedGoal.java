package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the INHOUSE_ASSIGNED_GOALS database table.
 *
 */
@Entity
@Table(name = "INHOUSE_ASSIGNED_GOALS")
@NamedQuery(name = "InhouseAssignedGoal.findAll", query = "SELECT i FROM InhouseAssignedGoal i")
public class InhouseAssignedGoal extends AuditModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "INHOUSE_ASSIGNED_GOALS_INHOUSEID_GENERATOR", sequenceName = "INHOUSE_ID_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INHOUSE_ASSIGNED_GOALS_INHOUSEID_GENERATOR")
	@Column(name = "INHOUSE_ID", unique = true, nullable = false)
	private long inhouseId;

	@Column(name = "INHOUSE_SOURCE_NAME", nullable = false, length = 10)
	private String inhouseSourceName;

	@Column(name = "INHOUSE_SOURCE_SUB_CATEGORY", length = 40)
	private String inhouseSourceSubCategory;

	@Column(name = "GOAL_CATEGORY_C", nullable = false, length = 5)
	private String goalCategoryC;

	@Column(name = "GOAL_SUB_CATEGORY_C", nullable = false, length = 5)
	private String goalSubCategoryC;

	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "GOAL_MONTH", nullable = false)
	private Timestamp goalMonth;

	@Column(name = "EXPECTED_COUNT", nullable = false)
	private BigDecimal expectedCount;

	@ManyToOne
	@JoinColumn(name = "GOAL_CATEGORY_C", insertable = false, updatable = false)
	private DGoalCategory DGoalCategory;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "GOAL_CATEGORY_C", insertable = false, updatable = false, referencedColumnName="GOAL_CATEGORY_C"),
				   @JoinColumn(name = "GOAL_SUB_CATEGORY_C", insertable = false, updatable = false, referencedColumnName="GOAL_SUB_CATEGORY_C")
				})
	private DGoalSubCategory DGoalSubCategory;

	public InhouseAssignedGoal() {
	}

	public long getInhouseId() {
		return this.inhouseId;
	}

	public void setInhouseId(long inhouseId) {
		this.inhouseId = inhouseId;
	}

	public BigDecimal getExpectedCount() {
		return this.expectedCount;
	}

	public void setExpectedCount(BigDecimal expectedCount) {
		this.expectedCount = expectedCount;
	}

	public Timestamp getGoalMonth() {
		return this.goalMonth;
	}

	public void setGoalMonth(Timestamp goalMonth) {
		this.goalMonth = goalMonth;
	}

	public String getInhouseSourceName() {
		return this.inhouseSourceName;
	}

	public void setInhouseSourceName(String inhouseSourceName) {
		this.inhouseSourceName = inhouseSourceName;
	}

	public String getInhouseSourceSubCategory() {
		return this.inhouseSourceSubCategory;
	}

	public void setInhouseSourceSubCategory(String inhouseSourceSubCategory) {
		this.inhouseSourceSubCategory = inhouseSourceSubCategory;
	}

	public DGoalCategory getDGoalCategory() {
		return this.DGoalCategory;
	}

	public void setDGoalCategory(DGoalCategory DGoalCategory) {
		this.DGoalCategory = DGoalCategory;
	}

	public DGoalSubCategory getDGoalSubCategory() {
		return this.DGoalSubCategory;
	}

	public void setDGoalSubCategory(DGoalSubCategory DGoalSubCategory) {
		this.DGoalSubCategory = DGoalSubCategory;
	}

	public String getGoalCategoryC() {
		return goalCategoryC;
	}

	public void setGoalCategoryC(String goalCategoryC) {
		this.goalCategoryC = goalCategoryC;
	}

	public String getGoalSubCategoryC() {
		return this.goalSubCategoryC;
	}

	public void setGoalSubCategoryC(String goalSubCategoryC) {
		this.goalSubCategoryC = goalSubCategoryC;
	}

	@Override
	public String toString() {
		return "InhouseAssignedGoal [inhouseId=" + inhouseId + ", inhouseSourceName=" + inhouseSourceName
				+ ", inhouseSourceSubCategory=" + inhouseSourceSubCategory + ", goalCategoryC=" + goalCategoryC
				+ ", goalSubCategoryC=" + goalSubCategoryC + ", goalMonth=" + goalMonth + ", expectedCount="
				+ expectedCount + ", DGoalCategory=" + DGoalCategory + ", DGoalSubCategory=" + DGoalSubCategory + "]";
	}
}