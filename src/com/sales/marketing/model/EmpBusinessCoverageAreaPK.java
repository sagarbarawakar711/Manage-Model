package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the USER_BUSINESS_COVERAGE_AREA database table.
 * 
 */
@Embeddable
public class EmpBusinessCoverageAreaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="EMPLOYEE_ID", nullable=false, length=100)
	private Long employeeId;

	@Column(name="REGION_C", nullable=false, length=2)
	private String regionC;

	@Column(name="STATE_FIPS_C", nullable=false, length=2)
	private String stateFipsC;

	@Column(name="DEALER_ID", nullable=false)
	private long dealerId;

	public EmpBusinessCoverageAreaPK() {
	}

	public String getRegionC() {
		return this.regionC;
	}
	public void setRegionC(String regionC) {
		this.regionC = regionC;
	}
	public String getStateFipsC() {
		return this.stateFipsC;
	}
	public void setStateFipsC(String stateFipsC) {
		this.stateFipsC = stateFipsC;
	}
	public long getDealerId() {
		return this.dealerId;
	}
	public void setDealerId(long dealerId) {
		this.dealerId = dealerId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EmpBusinessCoverageAreaPK)) {
			return false;
		}
		EmpBusinessCoverageAreaPK castOther = (EmpBusinessCoverageAreaPK)other;
		return 
			this.employeeId.equals(castOther.employeeId)
			&& this.regionC.equals(castOther.regionC)
			&& this.stateFipsC.equals(castOther.stateFipsC)
			&& (this.dealerId == castOther.dealerId);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.employeeId.hashCode();
		hash = hash * prime + this.regionC.hashCode();
		hash = hash * prime + this.stateFipsC.hashCode();
		hash = hash * prime + ((int) (this.dealerId ^ (this.dealerId >>> 32)));
		
		return hash;
	}
}