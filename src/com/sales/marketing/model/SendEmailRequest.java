package com.sales.marketing.model;

import java.util.Map;

public class SendEmailRequest {

	private int emailConfigId;
	private int emailClientId;
	private String[] toEmailIds;
	private String[] ccEmailIds;
	private String[] bccEmailsIds;
	private String subject;
	private Map<String, String> valueParams;
	private String[] attachementFileUrls;

	// private MultipartFile[] attachmentFiles;
	/**
	 * @return the emailConfigId
	 */
	public int getEmailConfigId() {
		return emailConfigId;
	}

	/**
	 * @param emailConfigId the emailConfigId to set
	 */
	public void setEmailConfigId(int emailConfigId) {
		this.emailConfigId = emailConfigId;
	}

	/**
	 * @return the emailClientId
	 */
	public int getEmailClientId() {
		return emailClientId;
	}

	/**
	 * @param emailClientId the emailClientId to set
	 */
	public void setEmailClientId(int emailClientId) {
		this.emailClientId = emailClientId;
	}

	/**
	 * @return the toEmailIds
	 */
	public String[] getToEmailIds() {
		return toEmailIds;
	}

	/**
	 * @param toEmailIds the toEmailIds to set
	 */
	public void setToEmailIds(String[] toEmailIds) {
		this.toEmailIds = toEmailIds;
	}

	/**
	 * @return the ccEmailIds
	 */
	public String[] getCcEmailIds() {
		return ccEmailIds;
	}

	/**
	 * @param ccEmailIds the ccEmailIds to set
	 */
	public void setCcEmailIds(String[] ccEmailIds) {
		this.ccEmailIds = ccEmailIds;
	}

	/**
	 * @return the bccEmailsIds
	 */
	public String[] getBccEmailsIds() {
		return bccEmailsIds;
	}

	/**
	 * @param bccEmailsIds the bccEmailsIds to set
	 */
	public void setBccEmailsIds(String[] bccEmailsIds) {
		this.bccEmailsIds = bccEmailsIds;
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
	 * @return the valueParams
	 */
	public Map<String, String> getValueParams() {
		return valueParams;
	}

	/**
	 * @param valueParams the valueParams to set
	 */
	public void setValueParams(Map<String, String> valueParams) {
		this.valueParams = valueParams;
	}

	/**
	 * @return the attachementFileUrls
	 */
	public String[] getAttachementFileUrls() {
		return attachementFileUrls;
	}

	/**
	 * @param attachementFileUrls the attachementFileUrls to set
	 */
	public void setAttachementFileUrls(String[] attachementFileUrls) {
		this.attachementFileUrls = attachementFileUrls;
	}	
}
