package com.sales.marketing.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Entity
@Table(name = "data_report_links")
@NamedQuery(name = "DataReportLinks.findAll", query = "SELECT d FROM DataReportLinks d")
public class DataReportLinks implements Serializable {

	@Id
	@SequenceGenerator(name = "DATA_REPORT_LINKS_LINKS_ID_GENERATOR", sequenceName = "QUOTE_DI_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DATA_REPORT_LINKS_LINKS_ID_GENERATOR")
	@Column(name = "links_id")
	private int linksId;

	@Column(name = "frequency")
	private String frequency;

	@Column(name = "report_year")
	private BigDecimal reportYear;

	@Column(name = "report_month")
	private BigDecimal reportMonth;

	@Column(name = "report_link")
	private String reportLink;

	@Column(name = "roles_access")
	private String rolesAccess;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "inactive_d")
	private Timestamp inactiveD;

	@Column(name = "creation_user_i")
	private String creationUserI;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "creation_d")
	private Timestamp creationD;

	@Column(name = "last_updated_user_i")
	private String lastUpdatedUserI;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "last_updated_d")
	private Timestamp lastUpdatedD;

	@Column(name = "report_name")
	private String reportName;

	@Column(name = "input_source")
	private String inputSource;

	public DataReportLinks() {

	}

	public int getLinksId() {
		return linksId;
	}

	public void setLinksId(int linksId) {
		this.linksId = linksId;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public BigDecimal getReportYear() {
		return reportYear;
	}

	public void setReportYear(BigDecimal reportYear) {
		this.reportYear = reportYear;
	}

	public BigDecimal getReportMonth() {
		return reportMonth;
	}

	public void setReportMonth(BigDecimal reportMonth) {
		this.reportMonth = reportMonth;
	}

	public String getReportLink() {
		return reportLink;
	}

	public void setReportLink(String reportLink) {
		this.reportLink = reportLink;
	}

	public String getRolesAccess() {
		return rolesAccess;
	}

	public void setRolesAccess(String rolesAccess) {
		this.rolesAccess = rolesAccess;
	}

	public Timestamp getInactiveD() {
		return inactiveD;
	}

	public void setInactiveD(Timestamp inactiveD) {
		this.inactiveD = inactiveD;
	}

	public String getCreationUserI() {
		return creationUserI;
	}

	public void setCreationUserI(String creationUserI) {
		this.creationUserI = creationUserI;
	}

	public Timestamp getCreationD() {
		return creationD;
	}

	public void setCreationD(Timestamp creationD) {
		this.creationD = creationD;
	}

	public String getLastUpdatedUserI() {
		return lastUpdatedUserI;
	}

	public void setLastUpdatedUserI(String lastUpdatedUserI) {
		this.lastUpdatedUserI = lastUpdatedUserI;
	}

	public Timestamp getLastUpdatedD() {
		return lastUpdatedD;
	}

	public void setLastUpdatedD(Timestamp lastUpdatedD) {
		this.lastUpdatedD = lastUpdatedD;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getInputSource() {
		return inputSource;
	}

	public void setInputSource(String inputSource) {
		this.inputSource = inputSource;
	}

	@Override
	public String toString() {
		return "DataReportLinks [linksId=" + linksId + ", frequency=" + frequency + ", reportYear=" + reportYear
				+ ", reportMonth=" + reportMonth + ", reportLink=" + reportLink + ", rolesAccess=" + rolesAccess
				+ ", inactiveD=" + inactiveD + ", creationUserI=" + creationUserI + ", creationD=" + creationD
				+ ", lastUpdatedUserI=" + lastUpdatedUserI + ", lastUpdatedD=" + lastUpdatedD + ", reportName="
				+ reportName + ", inputSource=" + inputSource + "]";
	}

}
