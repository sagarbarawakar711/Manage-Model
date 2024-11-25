package com.sales.marketing.model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * The persistent class for the SCHEDULE_ACTIVITY database table.
 *
 */
@Entity
@Table(name = "SCHEDULE_ACTIVITY")
@NamedQuery(name = "ScheduleActivity.findAll", query = "SELECT s FROM ScheduleActivity s")
public class ScheduleActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SCHEDULE_ACTIVITY_SCHEDULEID_GENERATOR", sequenceName = "SCHEDULE_ID_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SCHEDULE_ACTIVITY_SCHEDULEID_GENERATOR")
	@Column(name = "SCHEDULE_ID", unique = true, nullable = false)
	private long scheduleId;

	@Column(name = "SCHEDULE_NOTES", length = 150)
	private String scheduleNotes;

	@ManyToOne
	@JoinColumn(name = "SCHEDULE_EMPLOYEE_ID", insertable = false, updatable = false)
	private Employee employee;

	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name="SCHEDULE_D")
	private Timestamp scheduleD;

	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "CREATION_D", nullable = false)
	private Timestamp creationD;

	@Column(name = "CREATION_USER_I", nullable = false, length = 10)
	private String creationUserI;

	@Column(name="SCHEDULE_EMPLOYEE_ID", nullable=false)
	private long employeeId;

	public ScheduleActivity() {
	}

	public long getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(long scheduleId) {
		this.scheduleId = scheduleId;
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

	public String getScheduleNotes() {
		return this.scheduleNotes;
	}

	public void setScheduleNotes(String scheduleNotes) {
		this.scheduleNotes = scheduleNotes;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Timestamp getScheduleD() {
		return this.scheduleD;
	}

	public void setScheduleD(Timestamp scheduleD) {
		this.scheduleD = scheduleD;
	}
	public long getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "ScheduleActivity [scheduleId=" + scheduleId + ", scheduleNotes=" + scheduleNotes + ", employee="
				+ employee + ", scheduleD=" + scheduleD + ", creationD=" + creationD + ", creationUserI="
				+ creationUserI + "]";
	}
}