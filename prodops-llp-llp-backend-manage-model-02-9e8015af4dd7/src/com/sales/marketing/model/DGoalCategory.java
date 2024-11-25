package com.sales.marketing.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the D_GOAL_CATEGORY database table.
 * 
 */
@Entity
@Table(name = "D_GOAL_CATEGORY")
@NamedQuery(name = "DGoalCategory.findAll", query = "SELECT d FROM DGoalCategory d")
public class DGoalCategory extends AuditModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "GOAL_CATEGORY_C", unique = true, nullable = false, length = 5)
	private String goalCategoryC;

	@Column(name = "GOAL_CATEGORY_X", nullable = false, length = 50)
	private String goalCategoryX;

	public DGoalCategory() {
	}

	public String getGoalCategoryC() {
		return this.goalCategoryC;
	}

	public void setGoalCategoryC(String goalCategoryC) {
		this.goalCategoryC = goalCategoryC;
	}

	public String getGoalCategoryX() {
		return this.goalCategoryX;
	}

	public void setGoalCategoryX(String goalCategoryX) {
		this.goalCategoryX = goalCategoryX;
	}

	@Override
	public String toString() {
		return "DGoalCategory [goalCategoryC=" + goalCategoryC + ", goalCategoryX=" + goalCategoryX + "]";
	}
}