package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the REGION_STATES database table.
 * 
 */
@Embeddable
public class RegionStatePK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="REGION_C", unique=true, nullable=false, length=2)
	private String regionC;

	@Column(name="STATE_FIPS_C", unique=true, nullable=false, length=2)
	private String stateFipsC;

	public RegionStatePK() {
	}

	public RegionStatePK(String regionC, String stateFipsC) {
		this.regionC = regionC;
		this.stateFipsC = stateFipsC;
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
	
	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RegionStatePK)) {
			return false;
		}
		RegionStatePK castOther = (RegionStatePK)other;
		return 
			this.regionC.equals(castOther.regionC)
			&& this.stateFipsC.equals(castOther.stateFipsC);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.regionC.hashCode();
		hash = hash * prime + this.stateFipsC.hashCode();
		
		return hash;
	}
}