package com.sales.marketing.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditModel implements Serializable {

	private static final long serialVersionUID = 8949193346268030106L;
    
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="INACTIVE_D")
	private Timestamp inactiveD;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@CreatedDate
	@Column(name="CREATION_D", nullable=false)
	private Timestamp creationD;

	@Column(name="CREATION_USER_I", nullable=false)
	private String creationUserI;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@LastModifiedDate
	@Column(name="LAST_UPDATED_D")
	private Timestamp lastUpdatedD;

	@Column(name="LAST_UPDATED_USER_I")
	private String lastUpdatedUserI;

	public Timestamp getCreationD() {
		return this.creationD;
	}

	public void setCreationD(Timestamp creationD) {
		this.creationD = creationD;
	}

	public String getCreationUserI() {
		return this.creationUserI;
	}

	public void setCreationUserI(String creationUserI) {
		this.creationUserI = creationUserI;
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

}