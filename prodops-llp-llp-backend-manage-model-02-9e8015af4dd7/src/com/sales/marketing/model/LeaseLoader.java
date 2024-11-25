package com.sales.marketing.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="lease_loader")
@NamedQuery(name="LeaseLoader.findAll", query="SELECT d FROM LeaseLoader d")
public class LeaseLoader {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="loan")
	private String loan;
	
	@Column(name="loan_status")
	private String loanStatus;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="nextscheduledpaymentdate")
	private Date nextScheduledPaymentDate;
	
	@Column(name="borrower_name")
	private String borrowerName;
	
	@Column(name="borrower_email")
	private String borrowerEmail;
	
	@Column(name="borrower_additional_email_address")  
	private String borrowerAdditionalEmailAddress;
	
	@Column(name="co_borrower_additional_email_address")
	private String coborrowerAdditionalEmailAddress;
	
	
	@Column(name="sub_status_breakdown")
	private String subStatusBreakdown;

	@Column(name="nextscheduledpaymentamount")
	private BigDecimal nextScheduledPaymentAmount;
	
	@Column(name="extension_payment")
	private BigDecimal extensionPayment;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="extension_start_date")
	private Date extensionStartDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="etension_end_date")
	private Date extensionEndDate;
	
	@Column(name="year")
	private BigDecimal year;

	@Column(name="make")
	private String make;
	
	@Column(name="extension_program")
	private String extensionProgram;
	
	public LeaseLoader() {
		
	}

	public String getLoan() {
		return loan;
	}

	public void setLoan(String loan) {
		this.loan = loan;
	}
	
	

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public Date getNextScheduledPaymentDate() {
		return nextScheduledPaymentDate;
	}

	public void setNextScheduledPaymentDate(Date nextScheduledPaymentDate) {
		this.nextScheduledPaymentDate = nextScheduledPaymentDate;
	}
	
	public String getBorrowerEmail() {
		return borrowerEmail;
	}

	public void setBorrowerEmail(String borrowerEmail) {
		this.borrowerEmail = borrowerEmail;
	}

	public String getSubStatusBreakdown() {
		return subStatusBreakdown;
	}

	public void setSubStatusBreakdown(String subStatusBreakdown) {
		this.subStatusBreakdown = subStatusBreakdown;
	}

	public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	
	

	public BigDecimal getNextScheduledPaymentAmount() {
		return nextScheduledPaymentAmount;
	}

	public void setNextScheduledPaymentAmount(BigDecimal nextScheduledPaymentAmount) {
		this.nextScheduledPaymentAmount = nextScheduledPaymentAmount;
	}

	
	
	public BigDecimal getExtensionPayment() {
		return extensionPayment;
	}

	public void setExtensionPayment(BigDecimal extensionPayment) {
		this.extensionPayment = extensionPayment;
	}

	
	
	public Date getExtensionStartDate() {
		return extensionStartDate;
	}

	public void setExtensionStartDate(Date extensionStartDate) {
		this.extensionStartDate = extensionStartDate;
	}

	public Date getExtensionEndDate() {
		return extensionEndDate;
	}

	public void setExtensionEndDate(Date extensionEndDate) {
		this.extensionEndDate = extensionEndDate;
	}
	
	

	public BigDecimal getYear() {
		return year;
	}

	public void setYear(BigDecimal year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	

	public String getExtensionProgram() {
		return extensionProgram;
	}

	public void setExtensionProgram(String extensionProgram) {
		this.extensionProgram = extensionProgram;
	}

	public String getBorrowerAdditionalEmailAddress() {
		return borrowerAdditionalEmailAddress;
	}

	public void setBorrowerAdditionalEmailAddress(String borrowerAdditionalEmailAddress) {
		this.borrowerAdditionalEmailAddress = borrowerAdditionalEmailAddress;
	}

	public String getCoborrowerAdditionalEmailAddress() {
		return coborrowerAdditionalEmailAddress;
	}

	public void setCoborrowerAdditionalEmailAddress(String coborrowerAdditionalEmailAddress) {
		this.coborrowerAdditionalEmailAddress = coborrowerAdditionalEmailAddress;
	}
	
	@Override
	public String toString() {
		return "LeaseLoader [loan=" + loan + ", loanStatus=" + loanStatus + ", nextScheduledPaymentDate="
				+ nextScheduledPaymentDate + ", borrowerName=" + borrowerName + ", borrowerEmail=" + borrowerEmail
				+ ", subStatusBreakdown=" + subStatusBreakdown + ", nextScheduledPaymentAmount="
				+ nextScheduledPaymentAmount + ", extensionPayment=" + extensionPayment + ", extensionStartDate="
				+ extensionStartDate + ", extensionEndDate=" + extensionEndDate + ", year=" + year + ", make=" + make
				+ ", extensionProgram=" + extensionProgram 
				+ ", borrowerAdditionalEmailAddress=" + borrowerAdditionalEmailAddress
				+ ", coborrowerAdditionalEmailAddress=" + coborrowerAdditionalEmailAddress + "]";
	}
	
	

}
