package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the REGION_STATES database table.
 * 
 */
@Entity
@Table(name="REGION_STATES")
@NamedQuery(name="RegionState.findAll", query="SELECT r FROM RegionState r")
public class RegionState implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RegionStatePK id;

	//uni-directional many-to-one association to DRegion
	@ManyToOne
	@JoinColumn(name="REGION_C", nullable=false, insertable=false, updatable=false)
	private DRegion DRegion;

	//uni-directional many-to-one association to DStateFip
	@ManyToOne
	@JoinColumn(name="STATE_FIPS_C", nullable=false, insertable=false, updatable=false)
	private DStateFip DStateFip;

	public RegionState() {
	}

	
	public RegionState(RegionStatePK id, DRegion dRegion, DStateFip dStateFip) {
		this.id = id;
		DRegion = dRegion;
		DStateFip = dStateFip;
	}


	public RegionStatePK getId() {
		return this.id;
	}

	public void setId(RegionStatePK id) {
		this.id = id;
	}

	public DRegion getDRegion() {
		return this.DRegion;
	}

	public void setDRegion(DRegion DRegion) {
		this.DRegion = DRegion;
	}

	public DStateFip getDStateFip() {
		return this.DStateFip;
	}

	public void setDStateFip(DStateFip DStateFip) {
		this.DStateFip = DStateFip;
	}

}