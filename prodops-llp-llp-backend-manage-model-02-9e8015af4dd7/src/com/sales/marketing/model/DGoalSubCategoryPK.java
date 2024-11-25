package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the D_GOAL_SUB_CATEGORY database table.
 * 
 */
@Embeddable
public class DGoalSubCategoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="GOAL_CATEGORY_C", unique=true, nullable=false, length=5)
	private String goalCategoryC;

	@Column(name="GOAL_SUB_CATEGORY_C", unique=true, nullable=false, length=5)
	private String goalSubCategoryC;

	public DGoalSubCategoryPK() {
	}
	public String getGoalCategoryC() {
		return this.goalCategoryC;
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DGoalSubCategoryPK)) {
			return false;
		}
		DGoalSubCategoryPK castOther = (DGoalSubCategoryPK)other;
		return 
			this.goalCategoryC.equals(castOther.goalCategoryC)
			&& this.goalSubCategoryC.equals(castOther.goalSubCategoryC);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.goalCategoryC.hashCode();
		hash = hash * prime + this.goalSubCategoryC.hashCode();
		
		return hash;
	}
}