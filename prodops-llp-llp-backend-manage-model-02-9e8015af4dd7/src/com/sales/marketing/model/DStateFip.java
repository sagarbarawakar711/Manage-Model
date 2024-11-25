package com.sales.marketing.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;




/**
 * The persistent class for the D_STATE_FIPS database table.
 *
 */
@Entity
@Table(name="D_STATE_FIPS")
@NamedQuery(name="DStateFip.findAll", query="SELECT d FROM DStateFip d")
public class DStateFip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STATE_FIPS_C", unique=true, nullable=false, length=2)
	private String stateFipsC;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="INACTIVE_D")
	private Timestamp inactiveD;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="LAST_UPDATED_D")
	private Timestamp lastUpdatedD;

	@Column(name="LAST_UPDATED_USER_I")
	private String lastUpdatedUserI;

	@Column(name="STATE_ALPHA_C", nullable=false, length=2)
	private String stateAlphaC;

	@Column(name="STATE_N", nullable=false, length=40)
	private String stateN;

	public DStateFip() {
	}

	public String getStateFipsC() {
		return this.stateFipsC;
	}

	public void setStateFipsC(String stateFipsC) {
		this.stateFipsC = stateFipsC;
	}

	public Timestamp getInactiveD() {
		return this.inactiveD;
	}

	public void setInactiveD(Timestamp inactiveD) {
		this.inactiveD = inactiveD;
	}

	public Timestamp getLastUpdatedD() {
		return this.lastUpdatedD;
	}

	public void setLastUpdatedD(Timestamp lastUpdatedD) {
		this.lastUpdatedD = lastUpdatedD;
	}

	public String getLastUpdatedUserI() {
		return this.lastUpdatedUserI;
	}

	public void setLastUpdatedUserI(String lastUpdatedUserI) {
		this.lastUpdatedUserI = lastUpdatedUserI;
	}

	public String getStateAlphaC() {
		return this.stateAlphaC;
	}

	public void setStateAlphaC(String stateAlphaC) {
		this.stateAlphaC = stateAlphaC;
	}

	public String getStateN() {
		return this.stateN;
	}

	public void setStateN(String stateN) {
		this.stateN = stateN;
	}

	@Override
	public String toString() {
		return "DStateFip [stateFipsC=" + stateFipsC + ", inactiveD=" + inactiveD + ", lastUpdatedD=" + lastUpdatedD
				+ ", lastUpdatedUserI=" + lastUpdatedUserI + ", stateAlphaC=" + stateAlphaC + ", stateN=" + stateN
				+ "]";
	}


}