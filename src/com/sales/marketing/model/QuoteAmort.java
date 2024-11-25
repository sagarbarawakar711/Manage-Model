package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;

import java.sql.Timestamp;


/**
 * The persistent class for the "quote_amort" database table.
 *
 */
@Entity
@Table(name="quote_amort")
@NamedQuery(name="QuoteAmort.findAll", query="SELECT q FROM QuoteAmort q")
public class QuoteAmort implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="QUOTE_AMORT_AMRTID_GENERATOR", sequenceName="QUOTE_AMORT_ID_SEQ",allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="QUOTE_AMORT_AMRTID_GENERATOR")
	@Column(name="amrt_id")
	private long amrtId;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="amr_date")
	private Timestamp amrDate;

	@Column(name="created_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Timestamp createdAt;

	@Column(name="creation_user_i")
	private String creationUserI;

	@Column(name="ending_balance")
	private BigDecimal endingBalance;

	@Column(name="interest")
	private BigDecimal interest;

	@Column(name="payment")
	private BigDecimal payment;

	@Column(name="pmt_num")
	private BigDecimal pmtNum;

	@Column(name="principle")
	private BigDecimal principle;

	@Column(name="quote_id")
	private String quoteId;

	public QuoteAmort() {
	}

	public long getAmrtId() {
		return this.amrtId;
	}

	public void setAmrtId(long amrtId) {
		this.amrtId = amrtId;
	}

	public Timestamp getAmrDate() {
		return this.amrDate;
	}

	public void setAmrDate(Timestamp amrDate) {
		this.amrDate = amrDate;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreationUserI() {
		return this.creationUserI;
	}

	public void setCreationUserI(String creationUserI) {
		this.creationUserI = creationUserI;
	}

	public BigDecimal getEndingBalance() {
		return this.endingBalance;
	}

	public void setEndingBalance(BigDecimal endingBalance) {
		this.endingBalance = endingBalance;
	}

	public BigDecimal getInterest() {
		return this.interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public BigDecimal getPayment() {
		return this.payment;
	}

	public void setPayment(BigDecimal payment) {
		this.payment = payment;
	}

	public BigDecimal getPmtNum() {
		return this.pmtNum;
	}

	public void setPmtNum(BigDecimal pmtNum) {
		this.pmtNum = pmtNum;
	}

	public BigDecimal getPrinciple() {
		return this.principle;
	}

	public void setPrinciple(BigDecimal principle) {
		this.principle = principle;
	}

	public String getQuoteId() {
		return this.quoteId;
	}

	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	@Override
	public String toString() {
		return "QuoteAmort [amrtId=" + amrtId + ", amrDate=" + amrDate + ", createdAt=" + createdAt + ", creationUserI="
				+ creationUserI + ", endingBalance=" + endingBalance + ", interest=" + interest + ", payment=" + payment
				+ ", pmtNum=" + pmtNum + ", principle=" + principle + ", quoteId=" + quoteId + "]";
	}

}