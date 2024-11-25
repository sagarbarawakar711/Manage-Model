package com.sales.marketing.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the D_REGION database table.
 * 
 */
@Entity
@Table(name = "D_REGION")
@NamedQuery(name = "DRegion.findAll", query = "SELECT d FROM DRegion d")
public class DRegion extends AuditModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "REGION_C", unique = true, nullable = false, length = 2)
	private String regionC;

	@Column(name = "REGION_X", nullable = false, length = 50)
	private String regionX;

	public DRegion() {
	}

	public String getRegionC() {
		return this.regionC;
	}

	public void setRegionC(String regionC) {
		this.regionC = regionC;
	}

	public String getRegionX() {
		return this.regionX;
	}

	public void setRegionX(String regionX) {
		this.regionX = regionX;
	}

	@Override
	public String toString() {
		return "DRegion [regionC=" + regionC + ", regionX=" + regionX + "]";
	}

}