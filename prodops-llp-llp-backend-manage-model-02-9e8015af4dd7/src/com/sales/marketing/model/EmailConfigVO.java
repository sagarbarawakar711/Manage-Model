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
@Table(name = "email_config")
public class EmailConfigVO {

	@Id
	@SequenceGenerator(name = "email_config_id_generator", sequenceName = "email_config_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "email_config_id_generator")
	@Column(name = "id", nullable = false, unique = true)
	private int id;
	
	@Column(name = "email_user")
    private String emailUser;
	
	@Column(name = "email_password")
    private String password;
	
	@Column(name = "protocol")
    private String protocol;
			
	@Column(name = "smtp_host")
    private String smtpHost;
	
	@Column(name = "smtp_port")
    private String smtpPort;
	
	@Column(name = "smtp_auth")
    private String smtpAuth;
	
	@Column(name = "starttls_enable")
    private String starttlsEnable;
	
	@Column(name = "active")
    private String active;

	@Column(name = "email_server")
    private String emailServer;	
			
	@Column(name = "description")
    private String description;

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
	 * @return the emailUser
	 */
	public String getEmailUser() {
		return emailUser;
	}

	/**
	 * @param emailUser the emailUser to set
	 */
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the protocol
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * @param protocol the protocol to set
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * @return the smtpHost
	 */
	public String getSmtpHost() {
		return smtpHost;
	}

	/**
	 * @param smtpHost the smtpHost to set
	 */
	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}

	/**
	 * @return the smtpPort
	 */
	public String getSmtpPort() {
		return smtpPort;
	}

	/**
	 * @param smtpPort the smtpPort to set
	 */
	public void setSmtpPort(String smtpPort) {
		this.smtpPort = smtpPort;
	}

	/**
	 * @return the smtpAuth
	 */
	public String getSmtpAuth() {
		return smtpAuth;
	}

	/**
	 * @param smtpAuth the smtpAuth to set
	 */
	public void setSmtpAuth(String smtpAuth) {
		this.smtpAuth = smtpAuth;
	}

	/**
	 * @return the starttlsEnable
	 */
	public String getStarttlsEnable() {
		return starttlsEnable;
	}

	/**
	 * @param starttlsEnable the starttlsEnable to set
	 */
	public void setStarttlsEnable(String starttlsEnable) {
		this.starttlsEnable = starttlsEnable;
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
	 * @return the emailServer
	 */
	public String getEmailServer() {
		return emailServer;
	}

	/**
	 * @param emailServer the emailServer to set
	 */
	public void setEmailServer(String emailServer) {
		this.emailServer = emailServer;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
