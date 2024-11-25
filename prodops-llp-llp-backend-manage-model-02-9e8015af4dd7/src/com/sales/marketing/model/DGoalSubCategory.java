package com.sales.marketing.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the D_GOAL_SUB_CATEGORY database table.
 * 
 */
@Entity
@Table(name="D_GOAL_SUB_CATEGORY")
@NamedQuery(name="DGoalSubCategory.findAll", query="SELECT d FROM DGoalSubCategory d")
public class DGoalSubCategory extends AuditModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DGoalSubCategoryPK id;

	@Column(name="GOAL_SUB_CATEGORY_X", nullable=false, length=50)
	private String goalSubCategoryX;
	
	public DGoalSubCategory() {
	}

	public DGoalSubCategoryPK getId() {
		return this.id;
	}

	public void setId(DGoalSubCategoryPK id) {
		this.id = id;
	}

	public String getGoalSubCategoryX() {
		return this.goalSubCategoryX;
	}

	public void setGoalSubCategoryX(String goalSubCategoryX) {
		this.goalSubCategoryX = goalSubCategoryX;
	}

}