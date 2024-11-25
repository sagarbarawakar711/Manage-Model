package com.sales.marketing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "email_templates")
public class EmailTemplatesVO {

	@Id
	@SequenceGenerator(name = "email_templates_id_generator", sequenceName = "email_templates_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "email_templates_id_generator")
	@Column(name = "id", nullable = false, unique = true)
	private int id;

	@Column(name = "template_name")
	private String templateName;
	
	@Column(name = "active")
	private String active;
	
	@Column(name = "template_content", columnDefinition = "TEXT")
	private String templateContent;

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
	 * @return the templateName
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * @param templateName the templateName to set
	 */
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
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

	/**
	 * @return the templateContent
	 */
	public String getTemplateContent() {
		return templateContent;
	}

	/**
	 * @param templateContent the templateContent to set
	 */
	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}
}
