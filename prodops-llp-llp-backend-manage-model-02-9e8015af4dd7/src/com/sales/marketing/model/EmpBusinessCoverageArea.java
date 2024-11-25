package com.sales.marketing.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * The persistent class for the EMP_BUSINESS_COVERAGE_AREA database table.
 * 
 */
@Entity
@Table(name = "EMP_BUSINESS_COVERAGE_AREA")
@NamedQuery(name = "EmpBusinessCoverageArea.findAll", query = "SELECT u FROM EmpBusinessCoverageArea u")
public class EmpBusinessCoverageArea extends AuditModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EmpBusinessCoverageAreaPK id;

	//uni-directional many-to-one association to DRegion
	@ManyToOne
	@JoinColumn(name="REGION_C", nullable=false, insertable=false, updatable=false)
	private DRegion DRegion;

	//uni-directional many-to-one association to DStateFip
	@ManyToOne
	@JoinColumn(name="STATE_FIPS_C", nullable=false, insertable=false, updatable=false)
	private DStateFip DStateFip;

	@ManyToOne
	@JoinColumn(name="DEALER_ID", nullable=true, insertable=false, updatable=false)
	private DDealerInfo DDealerInfo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	private Employee employee;
	
	@Column(name = "merge_id")
	private Integer mergeId;

	public Integer getMergeId() {
		return mergeId;
	}

	public void setMergeId(Integer mergeId) {
		this.mergeId = mergeId;
	}
	
	public EmpBusinessCoverageArea() {
	}

	public EmpBusinessCoverageAreaPK getId() {
		return this.id;
	}

	public void setId(EmpBusinessCoverageAreaPK id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
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
	
	public DDealerInfo getDDealerInfo() {
		return DDealerInfo;
	}

	public void setDDealerInfo(DDealerInfo dDealerInfo) {
		DDealerInfo = dDealerInfo;
	}
	@Override
	public String toString() {
		return "EmpBusinessCoverageArea [id=" + id + "]";
	}

}