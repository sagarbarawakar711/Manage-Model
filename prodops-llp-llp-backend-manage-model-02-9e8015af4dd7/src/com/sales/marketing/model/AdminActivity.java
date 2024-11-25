package com.sales.marketing.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;



/**
 * The persistent class for the ADMIN_ACTIVITY database table.
 *
 */
@Entity
@Table(name="ADMIN_ACTIVITY")
@NamedQuery(name="AdminActivity.findAll", query="SELECT a FROM AdminActivity a")
public class AdminActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ADMIN_ACTIVITY_ADMINID_GENERATOR", sequenceName="ADMIN_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ADMIN_ACTIVITY_ADMINID_GENERATOR")
	@Column(name="ADMIN_ID")
	private long adminId;

	@Column(name="ADMIN_NOTES")
	private String adminNotes;

	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@CreatedDate
	@Column(name = "CREATION_D", nullable = false)
	private Timestamp creationD;

	@Column(name="CREATION_USER_I")
	private String creationUserI;

	@Column(name="TARGET_USER_OR_ROLES")
	private String targetUserOrRoles;

	public AdminActivity() {
	}

	public long getAdminId() {
		return this.adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getAdminNotes() {
		return this.adminNotes;
	}

	public void setAdminNotes(String adminNotes) {
		this.adminNotes = adminNotes;
	}

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

	public String getTargetUserOrRoles() {
		return this.targetUserOrRoles;
	}

	public void setTargetUserOrRoles(String targetUserOrRoles) {
		this.targetUserOrRoles = targetUserOrRoles;
	}

}