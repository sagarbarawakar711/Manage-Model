package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.sql.Timestamp;



/**
 * The persistent class for the "mileage" database table.
 *
 */
@Entity
@Table(name="mileage")
@NamedQuery(name="Mileage.findAll", query="SELECT m FROM Mileage m")
public class Mileage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MILEAGE_MILEAGEID_GENERATOR", sequenceName="MILEAGE_ID_SEQ",allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MILEAGE_MILEAGEID_GENERATOR")
	@Column(name="mileage_id", unique = true, nullable = false)
	private long mileageId;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="creation_d")
	private Timestamp creationD;

	@Column(name="creation_user_i")
	private String creationUserI;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="from_date")
	private Timestamp fromDate;

	@Column(name="mileage_employee_id")
	private long mileageEmployeeId;

	@Column(name="mileage_notes")
	private String mileageNotes;

	@Column(name="miles")
	private BigDecimal miles;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="to_date")
	private Timestamp toDate;

	public Mileage() {
	}

	public long getMileageId() {
		return this.mileageId;
	}

	public void setMileageId(long mileageId) {
		this.mileageId = mileageId;
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

	public Timestamp getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Timestamp fromDate) {
		this.fromDate = fromDate;
	}

	public long getMileageEmployeeId() {
		return this.mileageEmployeeId;
	}

	public void setMileageEmployeeId(long mileageEmployeeId) {
		this.mileageEmployeeId = mileageEmployeeId;
	}

	public String getMileageNotes() {
		return this.mileageNotes;
	}

	public void setMileageNotes(String mileageNotes) {
		this.mileageNotes = mileageNotes;
	}

	public BigDecimal getMiles() {
		return this.miles;
	}

	public void setMiles(BigDecimal miles) {
		this.miles = miles;
	}

	public Timestamp getToDate() {
		return this.toDate;
	}

	public void setToDate(Timestamp toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "Mileage [mileageId=" + mileageId + ", creationD=" + creationD + ", creationUserI=" + creationUserI
				+ ", fromDate=" + fromDate + ", mileageEmployeeId=" + mileageEmployeeId + ", mileageNotes="
				+ mileageNotes + ", miles=" + miles + ", toDate=" + toDate + "]";
	}

}