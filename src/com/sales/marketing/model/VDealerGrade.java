package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;



/**
 * The persistent class for the "v_dealer_grading" database table.
 * 
 */
@Entity
@Table(name="V_DEALER_GRADING")
@NamedQuery(name="VDealerGrade.findAll", query="SELECT dg FROM VDealerGrade dg")
public class VDealerGrade implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "EMPLOYEE_ID")
	private int employeeId;

	@Column(name="dealer_name")
	private String dealerName;
	
	@Id
	@Column(name = "DEALER_ID")
	private int dealerId;
	
	@Column(name="dealer_grade")
	private String dealerGrade;
	
	public VDealerGrade() {}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public String getDealerGrade() {
		return dealerGrade;
	}

	public void setDealerGrade(String dealerGrade) {
		this.dealerGrade = dealerGrade;
	}
	
	
	
}