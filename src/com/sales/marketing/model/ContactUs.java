package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;


/**
 * The persistent class for the "contact_us" database table.
 *
 */
@Entity
@Table(name="contact_us")
@NamedQuery(name="ContactUs.findAll", query="SELECT c FROM ContactUs c")
public class ContactUs implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="contact_id")
	private int contactId;

	@Column(name="created_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Timestamp createdAt;

	@Column(name="email")
	private String email;

	@Column(name="full_name")
	private String fullName;

	@Column(name="phone_number")
	private String phoneNumber;

	@Column(name="preferred_contact")
	private String preferredContact;

	@Column(name="schedule_notes")
	private String scheduleNotes;

	public ContactUs() {
	}

	public int getContactId() {
		return this.contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	

	public String getPreferredContact() {
		return preferredContact;
	}

	public void setPreferredContact(String preferredContact) {
		this.preferredContact = preferredContact;
	}

	public String getScheduleNotes() {
		return this.scheduleNotes;
	}

	public void setScheduleNotes(String scheduleNotes) {
		this.scheduleNotes = scheduleNotes;
	}

}