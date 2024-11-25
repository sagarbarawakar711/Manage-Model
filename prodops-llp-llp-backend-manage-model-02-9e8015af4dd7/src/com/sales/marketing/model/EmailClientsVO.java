/**
 * 
 */
package com.sales.marketing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author PA
 *
 */
@Entity
@Table(name = "email_clients")
public class EmailClientsVO {

	@Id
	@SequenceGenerator(name = "email_clients_id_generator", sequenceName = "email_clients_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "email_clients_id_generator")
	@Column(name = "id", nullable = false, unique = true)
	private int id;
	
	@Column(name = "to_email_ids")
	private String toEmailds;
	
	@Column(name = "cc_email_ids")
	private String ccEmailIds;
	
	@Column(name = "bcc_email_ids")
	private String bccEmailIds;
	
	@Column(name = "template_id")
	private int templateId;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "active")
	private String active;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the toEmailds
	 */
	public String getToEmailds() {
		return toEmailds;
	}

	/**
	 * @param toEmailds the toEmailds to set
	 */
	public void setToEmailds(String toEmailds) {
		this.toEmailds = toEmailds;
	}

	/**
	 * @return the ccEmailIds
	 */
	public String getCcEmailIds() {
		return ccEmailIds;
	}

	/**
	 * @param ccEmailIds the ccEmailIds to set
	 */
	public void setCcEmailIds(String ccEmailIds) {
		this.ccEmailIds = ccEmailIds;
	}

	/**
	 * @return the bccEmailIds
	 */
	public String getBccEmailIds() {
		return bccEmailIds;
	}

	/**
	 * @param bccEmailIds the bccEmailIds to set
	 */
	public void setBccEmailIds(String bccEmailIds) {
		this.bccEmailIds = bccEmailIds;
	}

	/**
	 * @return the templateId
	 */
	public int getTemplateId() {
		return templateId;
	}

	/**
	 * @param templateId the templateId to set
	 */
	public void setTemplateId(int templateId) {
		this.templateId = templateId;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the active
	 */
	public String getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(String active) {
		this.active = active;
	}
}
