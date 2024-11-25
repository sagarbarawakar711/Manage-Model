package com.sales.marketing.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "mini_lease_loader")
@NamedQuery(name = "MiniLeaseLoader.findAll", query = "SELECT d FROM MiniLeaseLoader d")
public class MiniLeaseLoader {

	@Id
	@Column(name = "loan")
	private String loan;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "loan_created")
	private Date loan_created;

	@Column(name = "year")
	private BigDecimal year;

	@Column(name = "make")
	private String make;
	@Column(name = "model")
	private String model;
	@Column(name = "trim")
	private String trim;

	@Column(name = "miles")
	private BigDecimal miles;

	@Column(name = "color")
	private String color;
	@Column(name = "vin")
	private String vin;
	@Column(name = "license_plate")
	private String license_plate;
	@Column(name = "borrower_name")
	private String borrower_name;
	@Column(name = "borrower_first_name")
	private String borrower_first_name;
	@Column(name = "borrower_middle_name")
	private String borrower_middle_name;
	@Column(name = "borrower_last_name")
	private String borrower_last_name;
	@Column(name = "borrower_email")
	private String borrower_email;
	@Column(name = "borrower_pri_phone")
	private String borrower_pri_phone;
	@Column(name = "borrower_sec_phone")
	private String borrower_sec_phone;
	@Column(name = "borrower_address")
	private String borrower_address;
	@Column(name = "borrower_city")
	private String borrower_city;
	@Column(name = "borrower_state")
	private String borrower_state;
	@Column(name = "borrower_zipcode")
	private String borrower_zipcode;
	@Column(name = "mailing_address")
	private String mailing_address;
	@Column(name = "mailing_city")
	private String mailing_city;
	@Column(name = "mailing_state")
	private String mailing_state;
	@Column(name = "mailing_zipcode")
	private String mailing_zipcode;
	@Column(name = "borrower_ssn")
	private String borrower_ssn;
	@Column(name = "borrower_additional_email_address")
	private String borrower_additional_email_address;
	@Column(name = "coborrower_name")
	private String coborrower_name;
	@Column(name = "coborrower_first_name")
	private String coborrower_first_name;
	@Column(name = "coborrower_middle_name")
	private String coborrower_middle_name;
	@Column(name = "coborrower_last_name")
	private String coborrower_last_name;
	@Column(name = "coborrower_email")
	private String coborrower_email;
	@Column(name = "coborrower_pri_phone")
	private String coborrower_pri_phone;
	@Column(name = "coborrower_sec_phone")
	private String coborrower_sec_phone;
	@Column(name = "coborrower_address")
	private String coborrower_address;
	@Column(name = "coborrower_city")
	private String coborrower_city;
	@Column(name = "coborrower_state")
	private String coborrower_state;
	@Column(name = "coborrower_zipcode")
	private String coborrower_zipcode;
	@Column(name = "coborrower_mailing_address")
	private String coborrower_mailing_address;
	@Column(name = "coborrower_mailing_city")
	private String coborrower_mailing_city;
	@Column(name = "coborrower_mailing_state")
	private String coborrower_mailing_state;
	@Column(name = "coborrower_mailing_zipcode")
	private String coborrower_mailing_zipcode;
	@Column(name = "coborrower_ssn")
	private String coborrower_ssn;
	@Column(name = "co_borrower_additional_email_address")
	private String co_borrower_additional_email_address;
	@Column(name = "bank_account_number_censored")
	private String bank_account_number_censored;
	@Column(name = "source_company")
	private String source_company;
	@Column(name = "loan_status")
	private String loan_status;
	@Column(name = "loan_substatus")
	private String loan_substatus;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "closed_date")
	private Date closed_date;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "repo_date")
	private Date repo_date;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "liquidation_date")
	private Date liquidation_date;

	@Column(name = "payment_freq")
	private String payment_freq;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "contract_date")
	private Date contract_date;

	@Column(name = "terms_remaining")
	private BigDecimal terms_remaining;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "contract_date_2nd")
	private Date contract_date_2nd;

	@Column(name = "days_past_due")
	private BigDecimal days_past_due;
	@Column(name = "amount_pd")
	private BigDecimal amount_pd;
	@Column(name = "nextscheduledpaymentamount")
	private BigDecimal nextscheduledpaymentamount;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "nextscheduledpaymentdate")
	private Date nextscheduledpaymentdate;

	@Column(name = "nextscheduledpaymentinterest")
	private BigDecimal nextscheduledpaymentinterest;
	@Column(name = "nextscheduledpaymentprincipal")
	private BigDecimal nextscheduledpaymentprincipal;
	@Column(name = "nextscheduledpaymentfees")
	private BigDecimal nextscheduledpaymentfees;
	@Column(name = "nextscheduledpaymentescrow")
	private BigDecimal nextscheduledpaymentescrow;
	@Column(name = "numberofscheduledpayments")
	private BigDecimal numberofscheduledpayments;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "date_last_current")
	private Date date_last_current;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "current_date_res")
	private Date current_date_res;

	@Column(name = "fees_due")
	private BigDecimal fees_due;
	@Column(name = "p_i_due")
	private BigDecimal p_i_due;
	@Column(name = "payoff_fees")
	private BigDecimal payoff_fees;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "last_payment_date")
	private Date last_payment_date;

	@Column(name = "last_payment_amt")
	private BigDecimal last_payment_amt;
	@Column(name = "last_payment_interest_llp")
	private BigDecimal last_payment_interest_llp;
	@Column(name = "last_payment_principal")
	private BigDecimal last_payment_principal;
	@Column(name = "last_payment_fees")
	private BigDecimal last_payment_fees;
	@Column(name = "last_payment_sales_tax")
	private BigDecimal last_payment_sales_tax;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "next_due_date")
	private Date next_due_date;

	@Column(name = "next_due_amount")
	private BigDecimal next_due_amount;
	@Column(name = "next_payment_interest_llp")
	private BigDecimal next_payment_interest_llp;
	@Column(name = "next_payment_principal")
	private BigDecimal next_payment_principal;
	@Column(name = "next_payment_fees")
	private BigDecimal next_payment_fees;
	@Column(name = "next_payment_sales_tax")
	private BigDecimal next_payment_sales_tax;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "insurance_expires")
	private Date insurance_expires;

	@Column(name = "selling_price")
	private BigDecimal selling_price;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "date_of_sale_to_llp")
	private Date date_of_sale_to_llp;

	@Column(name = "title_state")
	private String title_state;

	@Column(name = "dmv_fees")
	private BigDecimal dmv_fees;
	@Column(name = "lease_acquisition_fee")
	private BigDecimal lease_acquisition_fee;
	@Column(name = "initial_sales_tax_at_purchase")
	private BigDecimal initial_sales_tax_at_purchase;
	@Column(name = "dealer_fees")
	private BigDecimal dealer_fees;
	@Column(name = "other_fees_due_at_signing")
	private BigDecimal other_fees_due_at_signing;
	@Column(name = "adjusted_capitalized_cost")
	private BigDecimal adjusted_capitalized_cost;
	@Column(name = "lesse_residual")
	private BigDecimal lesse_residual;
	@Column(name = "appraisal_fee")
	private BigDecimal appraisal_fee;
	@Column(name = "term_in_months")
	private BigDecimal term_in_months;
	@Column(name = "base_monthly_rental_charge")
	private BigDecimal base_monthly_rental_charge;
	@Column(name = "interest_rate_used_to_calculate_lease")
	private BigDecimal interest_rate_used_to_calculate_lease;
	@Column(name = "odometer_reading_at_inception")
	private BigDecimal odometer_reading_at_inception;
	@Column(name = "lease_state_salestaxrate")
	private BigDecimal lease_state_salestaxrate;
	@Column(name = "lease_county_salestaxrate")
	private BigDecimal lease_county_salestaxrate;
	@Column(name = "lease_city_salestaxrate")
	private BigDecimal lease_city_salestaxrate;

	@Column(name = "salesperson")
	private String salesperson;
	@Column(name = "application_type")
	private String application_type;
	@Column(name = "business_guarantor")
	private String business_guarantor;
	@Column(name = "personal_guarantor")
	private String personal_guarantor;

	@Column(name = "dealer_points")
	private BigDecimal dealer_points;
	@Column(name = "monthly_sales_tax")
	private BigDecimal monthly_sales_tax;
	@Column(name = "unapplied_funds")
	private BigDecimal unapplied_funds;

	@Column(name = "unapplied_funds_type")
	private String unapplied_funds_type;
	@Column(name = "title_number")
	private String title_number;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "title_date")
	private Date title_date;

	@Column(name = "referring_dealer")
	private String referring_dealer;
	@Column(name = "lease_dealer_type")
	private String lease_dealer_type;
	@Column(name = "dealer_dmv")
	private String dealer_dmv;
	@Column(name = "dealer_dmv_status")
	private String dealer_dmv_status;
	@Column(name = "sub_status_breakdown")
	private String sub_status_breakdown;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "payoff_request_date")
	private Date payoff_request_date;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "title_sent_to_trust")
	private Date title_sent_to_trust;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "first_ach_date")
	private Date first_ach_date;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "end_ach_date")
	private Date end_ach_date;

	@Column(name = "subi_trust")
	private String subi_trust;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "subi_trust_date")
	private Date subi_trust_date;

	@Column(name = "special_payoff_instructions")
	private String special_payoff_instructions;
	@Column(name = "extension_program")
	private String extension_program;
	@Column(name = "extension_term_months")
	private String extension_term_months;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "extension_start_date")
	private Date extension_start_date;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "etension_end_date")
	private Date etension_end_date;

	@Column(name = "extension_payment")
	private BigDecimal extension_payment;

	@Column(name = "deferred_down_payment")
	private String deferred_down_payment;
	@Column(name = "deferred_down_payment_terms")
	private String deferred_down_payment_terms;
	@Column(name = "new_lease_eligibility")
	private String new_lease_eligibility;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "init_setup_end_of_term_date")
	private Date init_setup_end_of_term_date;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "ap_ad_contract_date")
	private Date ap_ad_contract_date;

	@Column(name = "per_guar_first_name")
	private String per_guar_first_name;
	@Column(name = "per_guar_middle_initial")
	private String per_guar_middle_initial;
	@Column(name = "per_guar_last_name")
	private String per_guar_last_name;
	@Column(name = "per_guar_tax_id")
	private String per_guar_tax_id;
	@Column(name = "per_guar_email")
	private String per_guar_email;
	@Column(name = "per_guar_primary_phone")
	private String per_guar_primary_phone;
	@Column(name = "second_per_guar_first_name")
	private String second_per_guar_first_name;
	@Column(name = "second_per_guar_middle_initial")
	private String second_per_guar_middle_initial;
	@Column(name = "second_per_guar_last_name")
	private String second_per_guar_last_name;
	@Column(name = "second_per_guar_tax_id")
	private String second_per_guar_tax_id;
	@Column(name = "second_per_guar_email_")
	private String second_per_guar_email_;
	@Column(name = "second_per_guar_primary_phone")
	private String second_per_guar_primary_phone;
	@Column(name = "bus_guar_name")
	private String bus_guar_name;
	@Column(name = "bus_guar_tax_id")
	private String bus_guar_tax_id;

	@Column(name = "deferred_down_monthly_payment")
	private BigDecimal deferred_down_monthly_payment;
	@Column(name = "deferred_down_monthly_tax")
	private BigDecimal deferred_down_monthly_tax;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "deferred_down_expire_date")
	private Date deferred_down_expire_date;

	@Column(name = "dmv_or_title_work_still_needed")
	private String dmv_or_title_work_still_needed;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "dmv_status_date")
	private Date dmv_status_date;

	@Column(name = "early_termination_payments")
	private BigDecimal early_termination_payments;

	@Column(name = "number_advanced_payments")
	private Integer number_advanced_payments;

	@Column(name = "registration_street")
	private String registration_street;
	@Column(name = "registration_city")
	private String registration_city;
	@Column(name = "registration_state")
	private String registration_state;
	@Column(name = "registration_zipcode")
	private String registration_zipcode;
	@Column(name = "registration_county")
	private String registration_county;
	@Column(name = "dealbook_registration_state")
	private String dealbook_registration_state;
	@Column(name = "temp_tag_issued_by")
	private String temp_tag_issued_by;
	@Column(name = "temp_tag_number_1")
	private String temp_tag_number_1;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "temp_tag_expire_date_1")
	private Date temp_tag_expire_date_1;

	@Column(name = "temp_tag_number_2")
	private String temp_tag_number_2;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "temp_tag_expire_date_2")
	private Date temp_tag_expire_date_2;

	@Column(name = "ap_ad_colessee")
	private String ap_ad_colessee;
	@Column(name = "red_flag_monitoring_status")
	private String red_flag_monitoring_status;
	@Column(name = "vehicle_weight")
	private BigDecimal vehicle_weight;
	@Column(name = "previous_title_number")
	private String previous_title_number;

	public MiniLeaseLoader() {

	}

	public String getLoan() {
		return loan;
	}

	public void setLoan(String loan) {
		this.loan = loan;
	}

	public Date getLoan_created() {
		return loan_created;
	}

	public void setLoan_created(Date loan_created) {
		this.loan_created = loan_created;
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTrim() {
		return trim;
	}

	public void setTrim(String trim) {
		this.trim = trim;
	}

	public BigDecimal getMiles() {
		return miles;
	}

	public void setMiles(BigDecimal miles) {
		this.miles = miles;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getLicense_plate() {
		return license_plate;
	}

	public void setLicense_plate(String license_plate) {
		this.license_plate = license_plate;
	}

	public String getBorrower_name() {
		return borrower_name;
	}

	public void setBorrower_name(String borrower_name) {
		this.borrower_name = borrower_name;
	}

	public String getBorrower_first_name() {
		return borrower_first_name;
	}

	public void setBorrower_first_name(String borrower_first_name) {
		this.borrower_first_name = borrower_first_name;
	}

	public String getBorrower_middle_name() {
		return borrower_middle_name;
	}

	public void setBorrower_middle_name(String borrower_middle_name) {
		this.borrower_middle_name = borrower_middle_name;
	}

	public String getBorrower_last_name() {
		return borrower_last_name;
	}

	public void setBorrower_last_name(String borrower_last_name) {
		this.borrower_last_name = borrower_last_name;
	}

	public String getBorrower_email() {
		return borrower_email;
	}

	public void setBorrower_email(String borrower_email) {
		this.borrower_email = borrower_email;
	}

	public String getBorrower_pri_phone() {
		return borrower_pri_phone;
	}

	public void setBorrower_pri_phone(String borrower_pri_phone) {
		this.borrower_pri_phone = borrower_pri_phone;
	}

	public String getBorrower_sec_phone() {
		return borrower_sec_phone;
	}

	public void setBorrower_sec_phone(String borrower_sec_phone) {
		this.borrower_sec_phone = borrower_sec_phone;
	}

	public String getBorrower_address() {
		return borrower_address;
	}

	public void setBorrower_address(String borrower_address) {
		this.borrower_address = borrower_address;
	}

	public String getBorrower_city() {
		return borrower_city;
	}

	public void setBorrower_city(String borrower_city) {
		this.borrower_city = borrower_city;
	}

	public String getBorrower_state() {
		return borrower_state;
	}

	public void setBorrower_state(String borrower_state) {
		this.borrower_state = borrower_state;
	}

	public String getBorrower_zipcode() {
		return borrower_zipcode;
	}

	public void setBorrower_zipcode(String borrower_zipcode) {
		this.borrower_zipcode = borrower_zipcode;
	}

	public String getMailing_address() {
		return mailing_address;
	}

	public void setMailing_address(String mailing_address) {
		this.mailing_address = mailing_address;
	}

	public String getMailing_city() {
		return mailing_city;
	}

	public void setMailing_city(String mailing_city) {
		this.mailing_city = mailing_city;
	}

	public String getMailing_state() {
		return mailing_state;
	}

	public void setMailing_state(String mailing_state) {
		this.mailing_state = mailing_state;
	}

	public String getMailing_zipcode() {
		return mailing_zipcode;
	}

	public void setMailing_zipcode(String mailing_zipcode) {
		this.mailing_zipcode = mailing_zipcode;
	}

	public String getBorrower_ssn() {
		return borrower_ssn;
	}

	public void setBorrower_ssn(String borrower_ssn) {
		this.borrower_ssn = borrower_ssn;
	}

	public String getBorrower_additional_email_address() {
		return borrower_additional_email_address;
	}

	public void setBorrower_additional_email_address(String borrower_additional_email_address) {
		this.borrower_additional_email_address = borrower_additional_email_address;
	}

	public String getCoborrower_name() {
		return coborrower_name;
	}

	public void setCoborrower_name(String coborrower_name) {
		this.coborrower_name = coborrower_name;
	}

	public String getCoborrower_first_name() {
		return coborrower_first_name;
	}

	public void setCoborrower_first_name(String coborrower_first_name) {
		this.coborrower_first_name = coborrower_first_name;
	}

	public String getCoborrower_middle_name() {
		return coborrower_middle_name;
	}

	public void setCoborrower_middle_name(String coborrower_middle_name) {
		this.coborrower_middle_name = coborrower_middle_name;
	}

	public String getCoborrower_last_name() {
		return coborrower_last_name;
	}

	public void setCoborrower_last_name(String coborrower_last_name) {
		this.coborrower_last_name = coborrower_last_name;
	}

	public String getCoborrower_email() {
		return coborrower_email;
	}

	public void setCoborrower_email(String coborrower_email) {
		this.coborrower_email = coborrower_email;
	}

	public String getCoborrower_pri_phone() {
		return coborrower_pri_phone;
	}

	public void setCoborrower_pri_phone(String coborrower_pri_phone) {
		this.coborrower_pri_phone = coborrower_pri_phone;
	}

	public String getCoborrower_sec_phone() {
		return coborrower_sec_phone;
	}

	public void setCoborrower_sec_phone(String coborrower_sec_phone) {
		this.coborrower_sec_phone = coborrower_sec_phone;
	}

	public String getCoborrower_address() {
		return coborrower_address;
	}

	public void setCoborrower_address(String coborrower_address) {
		this.coborrower_address = coborrower_address;
	}

	public String getCoborrower_city() {
		return coborrower_city;
	}

	public void setCoborrower_city(String coborrower_city) {
		this.coborrower_city = coborrower_city;
	}

	public String getCoborrower_state() {
		return coborrower_state;
	}

	public void setCoborrower_state(String coborrower_state) {
		this.coborrower_state = coborrower_state;
	}

	public String getCoborrower_zipcode() {
		return coborrower_zipcode;
	}

	public void setCoborrower_zipcode(String coborrower_zipcode) {
		this.coborrower_zipcode = coborrower_zipcode;
	}

	public String getCoborrower_mailing_address() {
		return coborrower_mailing_address;
	}

	public void setCoborrower_mailing_address(String coborrower_mailing_address) {
		this.coborrower_mailing_address = coborrower_mailing_address;
	}

	public String getCoborrower_mailing_city() {
		return coborrower_mailing_city;
	}

	public void setCoborrower_mailing_city(String coborrower_mailing_city) {
		this.coborrower_mailing_city = coborrower_mailing_city;
	}

	public String getCoborrower_mailing_state() {
		return coborrower_mailing_state;
	}

	public void setCoborrower_mailing_state(String coborrower_mailing_state) {
		this.coborrower_mailing_state = coborrower_mailing_state;
	}

	public String getCoborrower_mailing_zipcode() {
		return coborrower_mailing_zipcode;
	}

	public void setCoborrower_mailing_zipcode(String coborrower_mailing_zipcode) {
		this.coborrower_mailing_zipcode = coborrower_mailing_zipcode;
	}

	public String getCoborrower_ssn() {
		return coborrower_ssn;
	}

	public void setCoborrower_ssn(String coborrower_ssn) {
		this.coborrower_ssn = coborrower_ssn;
	}

	public String getCo_borrower_additional_email_address() {
		return co_borrower_additional_email_address;
	}

	public void setCo_borrower_additional_email_address(String co_borrower_additional_email_address) {
		this.co_borrower_additional_email_address = co_borrower_additional_email_address;
	}

	public String getBank_account_number_censored() {
		return bank_account_number_censored;
	}

	public void setBank_account_number_censored(String bank_account_number_censored) {
		this.bank_account_number_censored = bank_account_number_censored;
	}

	public String getSource_company() {
		return source_company;
	}

	public void setSource_company(String source_company) {
		this.source_company = source_company;
	}

	public String getLoan_status() {
		return loan_status;
	}

	public void setLoan_status(String loan_status) {
		this.loan_status = loan_status;
	}

	public String getLoan_substatus() {
		return loan_substatus;
	}

	public void setLoan_substatus(String loan_substatus) {
		this.loan_substatus = loan_substatus;
	}

	public Date getClosed_date() {
		return closed_date;
	}

	public void setClosed_date(Date closed_date) {
		this.closed_date = closed_date;
	}

	public Date getRepo_date() {
		return repo_date;
	}

	public void setRepo_date(Date repo_date) {
		this.repo_date = repo_date;
	}

	public Date getLiquidation_date() {
		return liquidation_date;
	}

	public void setLiquidation_date(Date liquidation_date) {
		this.liquidation_date = liquidation_date;
	}

	public String getPayment_freq() {
		return payment_freq;
	}

	public void setPayment_freq(String payment_freq) {
		this.payment_freq = payment_freq;
	}

	public Date getContract_date() {
		return contract_date;
	}

	public void setContract_date(Date contract_date) {
		this.contract_date = contract_date;
	}

	public BigDecimal getTerms_remaining() {
		return terms_remaining;
	}

	public void setTerms_remaining(BigDecimal terms_remaining) {
		this.terms_remaining = terms_remaining;
	}

	public Date getContract_date_2nd() {
		return contract_date_2nd;
	}

	public void setContract_date_2nd(Date contract_date_2nd) {
		this.contract_date_2nd = contract_date_2nd;
	}

	public BigDecimal getDays_past_due() {
		return days_past_due;
	}

	public void setDays_past_due(BigDecimal days_past_due) {
		this.days_past_due = days_past_due;
	}

	public BigDecimal getAmount_pd() {
		return amount_pd;
	}

	public void setAmount_pd(BigDecimal amount_pd) {
		this.amount_pd = amount_pd;
	}

	public BigDecimal getNextscheduledpaymentamount() {
		return nextscheduledpaymentamount;
	}

	public void setNextscheduledpaymentamount(BigDecimal nextscheduledpaymentamount) {
		this.nextscheduledpaymentamount = nextscheduledpaymentamount;
	}

	

	public Date getNextscheduledpaymentdate() {
		return nextscheduledpaymentdate;
	}

	public void setNextscheduledpaymentdate(Date nextscheduledpaymentdate) {
		this.nextscheduledpaymentdate = nextscheduledpaymentdate;
	}

	public BigDecimal getNextscheduledpaymentinterest() {
		return nextscheduledpaymentinterest;
	}

	public void setNextscheduledpaymentinterest(BigDecimal nextscheduledpaymentinterest) {
		this.nextscheduledpaymentinterest = nextscheduledpaymentinterest;
	}

	public BigDecimal getNextscheduledpaymentprincipal() {
		return nextscheduledpaymentprincipal;
	}

	public void setNextscheduledpaymentprincipal(BigDecimal nextscheduledpaymentprincipal) {
		this.nextscheduledpaymentprincipal = nextscheduledpaymentprincipal;
	}

	public BigDecimal getNextscheduledpaymentfees() {
		return nextscheduledpaymentfees;
	}

	public void setNextscheduledpaymentfees(BigDecimal nextscheduledpaymentfees) {
		this.nextscheduledpaymentfees = nextscheduledpaymentfees;
	}

	public BigDecimal getNextscheduledpaymentescrow() {
		return nextscheduledpaymentescrow;
	}

	public void setNextscheduledpaymentescrow(BigDecimal nextscheduledpaymentescrow) {
		this.nextscheduledpaymentescrow = nextscheduledpaymentescrow;
	}

	public BigDecimal getNumberofscheduledpayments() {
		return numberofscheduledpayments;
	}

	public void setNumberofscheduledpayments(BigDecimal numberofscheduledpayments) {
		this.numberofscheduledpayments = numberofscheduledpayments;
	}

	public Date getDate_last_current() {
		return date_last_current;
	}

	public void setDate_last_current(Date date_last_current) {
		this.date_last_current = date_last_current;
	}

	public Date getCurrent_date_res() {
		return current_date_res;
	}

	public void setCurrent_date_res(Date current_date_res) {
		this.current_date_res = current_date_res;
	}

	public BigDecimal getFees_due() {
		return fees_due;
	}

	public void setFees_due(BigDecimal fees_due) {
		this.fees_due = fees_due;
	}

	public BigDecimal getP_i_due() {
		return p_i_due;
	}

	public void setP_i_due(BigDecimal p_i_due) {
		this.p_i_due = p_i_due;
	}

	public BigDecimal getPayoff_fees() {
		return payoff_fees;
	}

	public void setPayoff_fees(BigDecimal payoff_fees) {
		this.payoff_fees = payoff_fees;
	}

	public Date getLast_payment_date() {
		return last_payment_date;
	}

	public void setLast_payment_date(Date last_payment_date) {
		this.last_payment_date = last_payment_date;
	}

	public BigDecimal getLast_payment_amt() {
		return last_payment_amt;
	}

	public void setLast_payment_amt(BigDecimal last_payment_amt) {
		this.last_payment_amt = last_payment_amt;
	}

	public BigDecimal getLast_payment_interest_llp() {
		return last_payment_interest_llp;
	}

	public void setLast_payment_interest_llp(BigDecimal last_payment_interest_llp) {
		this.last_payment_interest_llp = last_payment_interest_llp;
	}

	public BigDecimal getLast_payment_principal() {
		return last_payment_principal;
	}

	public void setLast_payment_principal(BigDecimal last_payment_principal) {
		this.last_payment_principal = last_payment_principal;
	}

	public BigDecimal getLast_payment_fees() {
		return last_payment_fees;
	}

	public void setLast_payment_fees(BigDecimal last_payment_fees) {
		this.last_payment_fees = last_payment_fees;
	}

	public BigDecimal getLast_payment_sales_tax() {
		return last_payment_sales_tax;
	}

	public void setLast_payment_sales_tax(BigDecimal last_payment_sales_tax) {
		this.last_payment_sales_tax = last_payment_sales_tax;
	}

	public Date getNext_due_date() {
		return next_due_date;
	}

	public void setNext_due_date(Date next_due_date) {
		this.next_due_date = next_due_date;
	}

	public BigDecimal getNext_due_amount() {
		return next_due_amount;
	}

	public void setNext_due_amount(BigDecimal next_due_amount) {
		this.next_due_amount = next_due_amount;
	}

	public BigDecimal getNext_payment_interest_llp() {
		return next_payment_interest_llp;
	}

	public void setNext_payment_interest_llp(BigDecimal next_payment_interest_llp) {
		this.next_payment_interest_llp = next_payment_interest_llp;
	}

	public BigDecimal getNext_payment_principal() {
		return next_payment_principal;
	}

	public void setNext_payment_principal(BigDecimal next_payment_principal) {
		this.next_payment_principal = next_payment_principal;
	}

	public BigDecimal getNext_payment_fees() {
		return next_payment_fees;
	}

	public void setNext_payment_fees(BigDecimal next_payment_fees) {
		this.next_payment_fees = next_payment_fees;
	}

	public BigDecimal getNext_payment_sales_tax() {
		return next_payment_sales_tax;
	}

	public void setNext_payment_sales_tax(BigDecimal next_payment_sales_tax) {
		this.next_payment_sales_tax = next_payment_sales_tax;
	}

	public Date getInsurance_expires() {
		return insurance_expires;
	}

	public void setInsurance_expires(Date insurance_expires) {
		this.insurance_expires = insurance_expires;
	}

	public BigDecimal getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(BigDecimal selling_price) {
		this.selling_price = selling_price;
	}

	public Date getDate_of_sale_to_llp() {
		return date_of_sale_to_llp;
	}

	public void setDate_of_sale_to_llp(Date date_of_sale_to_llp) {
		this.date_of_sale_to_llp = date_of_sale_to_llp;
	}

	public String getTitle_state() {
		return title_state;
	}

	public void setTitle_state(String title_state) {
		this.title_state = title_state;
	}

	public BigDecimal getDmv_fees() {
		return dmv_fees;
	}

	public void setDmv_fees(BigDecimal dmv_fees) {
		this.dmv_fees = dmv_fees;
	}

	public BigDecimal getLease_acquisition_fee() {
		return lease_acquisition_fee;
	}

	public void setLease_acquisition_fee(BigDecimal lease_acquisition_fee) {
		this.lease_acquisition_fee = lease_acquisition_fee;
	}

	public BigDecimal getInitial_sales_tax_at_purchase() {
		return initial_sales_tax_at_purchase;
	}

	public void setInitial_sales_tax_at_purchase(BigDecimal initial_sales_tax_at_purchase) {
		this.initial_sales_tax_at_purchase = initial_sales_tax_at_purchase;
	}

	public BigDecimal getDealer_fees() {
		return dealer_fees;
	}

	public void setDealer_fees(BigDecimal dealer_fees) {
		this.dealer_fees = dealer_fees;
	}

	public BigDecimal getOther_fees_due_at_signing() {
		return other_fees_due_at_signing;
	}

	public void setOther_fees_due_at_signing(BigDecimal other_fees_due_at_signing) {
		this.other_fees_due_at_signing = other_fees_due_at_signing;
	}

	public BigDecimal getAdjusted_capitalized_cost() {
		return adjusted_capitalized_cost;
	}

	public void setAdjusted_capitalized_cost(BigDecimal adjusted_capitalized_cost) {
		this.adjusted_capitalized_cost = adjusted_capitalized_cost;
	}

	public BigDecimal getLesse_residual() {
		return lesse_residual;
	}

	public void setLesse_residual(BigDecimal lesse_residual) {
		this.lesse_residual = lesse_residual;
	}

	public BigDecimal getAppraisal_fee() {
		return appraisal_fee;
	}

	public void setAppraisal_fee(BigDecimal appraisal_fee) {
		this.appraisal_fee = appraisal_fee;
	}

	public BigDecimal getTerm_in_months() {
		return term_in_months;
	}

	public void setTerm_in_months(BigDecimal term_in_months) {
		this.term_in_months = term_in_months;
	}

	public BigDecimal getBase_monthly_rental_charge() {
		return base_monthly_rental_charge;
	}

	public void setBase_monthly_rental_charge(BigDecimal base_monthly_rental_charge) {
		this.base_monthly_rental_charge = base_monthly_rental_charge;
	}

	public BigDecimal getInterest_rate_used_to_calculate_lease() {
		return interest_rate_used_to_calculate_lease;
	}

	public void setInterest_rate_used_to_calculate_lease(BigDecimal interest_rate_used_to_calculate_lease) {
		this.interest_rate_used_to_calculate_lease = interest_rate_used_to_calculate_lease;
	}

	public BigDecimal getOdometer_reading_at_inception() {
		return odometer_reading_at_inception;
	}

	public void setOdometer_reading_at_inception(BigDecimal odometer_reading_at_inception) {
		this.odometer_reading_at_inception = odometer_reading_at_inception;
	}

	public BigDecimal getLease_state_salestaxrate() {
		return lease_state_salestaxrate;
	}

	public void setLease_state_salestaxrate(BigDecimal lease_state_salestaxrate) {
		this.lease_state_salestaxrate = lease_state_salestaxrate;
	}

	public BigDecimal getLease_county_salestaxrate() {
		return lease_county_salestaxrate;
	}

	public void setLease_county_salestaxrate(BigDecimal lease_county_salestaxrate) {
		this.lease_county_salestaxrate = lease_county_salestaxrate;
	}

	public BigDecimal getLease_city_salestaxrate() {
		return lease_city_salestaxrate;
	}

	public void setLease_city_salestaxrate(BigDecimal lease_city_salestaxrate) {
		this.lease_city_salestaxrate = lease_city_salestaxrate;
	}

	public String getSalesperson() {
		return salesperson;
	}

	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}

	public String getApplication_type() {
		return application_type;
	}

	public void setApplication_type(String application_type) {
		this.application_type = application_type;
	}

	public String getBusiness_guarantor() {
		return business_guarantor;
	}

	public void setBusiness_guarantor(String business_guarantor) {
		this.business_guarantor = business_guarantor;
	}

	public String getPersonal_guarantor() {
		return personal_guarantor;
	}

	public void setPersonal_guarantor(String personal_guarantor) {
		this.personal_guarantor = personal_guarantor;
	}

	public BigDecimal getDealer_points() {
		return dealer_points;
	}

	public void setDealer_points(BigDecimal dealer_points) {
		this.dealer_points = dealer_points;
	}

	public BigDecimal getMonthly_sales_tax() {
		return monthly_sales_tax;
	}

	public void setMonthly_sales_tax(BigDecimal monthly_sales_tax) {
		this.monthly_sales_tax = monthly_sales_tax;
	}

	public BigDecimal getUnapplied_funds() {
		return unapplied_funds;
	}

	public void setUnapplied_funds(BigDecimal unapplied_funds) {
		this.unapplied_funds = unapplied_funds;
	}

	public String getUnapplied_funds_type() {
		return unapplied_funds_type;
	}

	public void setUnapplied_funds_type(String unapplied_funds_type) {
		this.unapplied_funds_type = unapplied_funds_type;
	}

	public String getTitle_number() {
		return title_number;
	}

	public void setTitle_number(String title_number) {
		this.title_number = title_number;
	}

	public Date getTitle_date() {
		return title_date;
	}

	public void setTitle_date(Date title_date) {
		this.title_date = title_date;
	}

	public String getReferring_dealer() {
		return referring_dealer;
	}

	public void setReferring_dealer(String referring_dealer) {
		this.referring_dealer = referring_dealer;
	}

	public String getLease_dealer_type() {
		return lease_dealer_type;
	}

	public void setLease_dealer_type(String lease_dealer_type) {
		this.lease_dealer_type = lease_dealer_type;
	}

	public String getDealer_dmv() {
		return dealer_dmv;
	}

	public void setDealer_dmv(String dealer_dmv) {
		this.dealer_dmv = dealer_dmv;
	}

	public String getDealer_dmv_status() {
		return dealer_dmv_status;
	}

	public void setDealer_dmv_status(String dealer_dmv_status) {
		this.dealer_dmv_status = dealer_dmv_status;
	}

	public String getSub_status_breakdown() {
		return sub_status_breakdown;
	}

	public void setSub_status_breakdown(String sub_status_breakdown) {
		this.sub_status_breakdown = sub_status_breakdown;
	}

	public Date getPayoff_request_date() {
		return payoff_request_date;
	}

	public void setPayoff_request_date(Date payoff_request_date) {
		this.payoff_request_date = payoff_request_date;
	}

	public Date getTitle_sent_to_trust() {
		return title_sent_to_trust;
	}

	public void setTitle_sent_to_trust(Date title_sent_to_trust) {
		this.title_sent_to_trust = title_sent_to_trust;
	}

	public Date getFirst_ach_date() {
		return first_ach_date;
	}

	public void setFirst_ach_date(Date first_ach_date) {
		this.first_ach_date = first_ach_date;
	}

	public Date getEnd_ach_date() {
		return end_ach_date;
	}

	public void setEnd_ach_date(Date end_ach_date) {
		this.end_ach_date = end_ach_date;
	}

	public String getSubi_trust() {
		return subi_trust;
	}

	public void setSubi_trust(String subi_trust) {
		this.subi_trust = subi_trust;
	}

	public Date getSubi_trust_date() {
		return subi_trust_date;
	}

	public void setSubi_trust_date(Date subi_trust_date) {
		this.subi_trust_date = subi_trust_date;
	}

	public String getSpecial_payoff_instructions() {
		return special_payoff_instructions;
	}

	public void setSpecial_payoff_instructions(String special_payoff_instructions) {
		this.special_payoff_instructions = special_payoff_instructions;
	}

	public String getExtension_program() {
		return extension_program;
	}

	public void setExtension_program(String extension_program) {
		this.extension_program = extension_program;
	}

	public String getExtension_term_months() {
		return extension_term_months;
	}

	public void setExtension_term_months(String extension_term_months) {
		this.extension_term_months = extension_term_months;
	}

	public Date getExtension_start_date() {
		return extension_start_date;
	}

	public void setExtension_start_date(Date extension_start_date) {
		this.extension_start_date = extension_start_date;
	}

	public Date getEtension_end_date() {
		return etension_end_date;
	}

	public void setEtension_end_date(Date etension_end_date) {
		this.etension_end_date = etension_end_date;
	}

	public BigDecimal getExtension_payment() {
		return extension_payment;
	}

	public void setExtension_payment(BigDecimal extension_payment) {
		this.extension_payment = extension_payment;
	}

	public String getDeferred_down_payment() {
		return deferred_down_payment;
	}

	public void setDeferred_down_payment(String deferred_down_payment) {
		this.deferred_down_payment = deferred_down_payment;
	}

	public String getDeferred_down_payment_terms() {
		return deferred_down_payment_terms;
	}

	public void setDeferred_down_payment_terms(String deferred_down_payment_terms) {
		this.deferred_down_payment_terms = deferred_down_payment_terms;
	}

	public String getNew_lease_eligibility() {
		return new_lease_eligibility;
	}

	public void setNew_lease_eligibility(String new_lease_eligibility) {
		this.new_lease_eligibility = new_lease_eligibility;
	}

	public Date getInit_setup_end_of_term_date() {
		return init_setup_end_of_term_date;
	}

	public void setInit_setup_end_of_term_date(Date init_setup_end_of_term_date) {
		this.init_setup_end_of_term_date = init_setup_end_of_term_date;
	}

	public Date getAp_ad_contract_date() {
		return ap_ad_contract_date;
	}

	public void setAp_ad_contract_date(Date ap_ad_contract_date) {
		this.ap_ad_contract_date = ap_ad_contract_date;
	}

	public String getPer_guar_first_name() {
		return per_guar_first_name;
	}

	public void setPer_guar_first_name(String per_guar_first_name) {
		this.per_guar_first_name = per_guar_first_name;
	}

	public String getPer_guar_middle_initial() {
		return per_guar_middle_initial;
	}

	public void setPer_guar_middle_initial(String per_guar_middle_initial) {
		this.per_guar_middle_initial = per_guar_middle_initial;
	}

	public String getPer_guar_last_name() {
		return per_guar_last_name;
	}

	public void setPer_guar_last_name(String per_guar_last_name) {
		this.per_guar_last_name = per_guar_last_name;
	}

	public String getPer_guar_tax_id() {
		return per_guar_tax_id;
	}

	public void setPer_guar_tax_id(String per_guar_tax_id) {
		this.per_guar_tax_id = per_guar_tax_id;
	}

	public String getPer_guar_email() {
		return per_guar_email;
	}

	public void setPer_guar_email(String per_guar_email) {
		this.per_guar_email = per_guar_email;
	}

	public String getPer_guar_primary_phone() {
		return per_guar_primary_phone;
	}

	public void setPer_guar_primary_phone(String per_guar_primary_phone) {
		this.per_guar_primary_phone = per_guar_primary_phone;
	}

	public String getSecond_per_guar_first_name() {
		return second_per_guar_first_name;
	}

	public void setSecond_per_guar_first_name(String second_per_guar_first_name) {
		this.second_per_guar_first_name = second_per_guar_first_name;
	}

	public String getSecond_per_guar_middle_initial() {
		return second_per_guar_middle_initial;
	}

	public void setSecond_per_guar_middle_initial(String second_per_guar_middle_initial) {
		this.second_per_guar_middle_initial = second_per_guar_middle_initial;
	}

	public String getSecond_per_guar_last_name() {
		return second_per_guar_last_name;
	}

	public void setSecond_per_guar_last_name(String second_per_guar_last_name) {
		this.second_per_guar_last_name = second_per_guar_last_name;
	}

	public String getSecond_per_guar_tax_id() {
		return second_per_guar_tax_id;
	}

	public void setSecond_per_guar_tax_id(String second_per_guar_tax_id) {
		this.second_per_guar_tax_id = second_per_guar_tax_id;
	}

	public String getSecond_per_guar_email_() {
		return second_per_guar_email_;
	}

	public void setSecond_per_guar_email_(String second_per_guar_email_) {
		this.second_per_guar_email_ = second_per_guar_email_;
	}

	public String getSecond_per_guar_primary_phone() {
		return second_per_guar_primary_phone;
	}

	public void setSecond_per_guar_primary_phone(String second_per_guar_primary_phone) {
		this.second_per_guar_primary_phone = second_per_guar_primary_phone;
	}

	public String getBus_guar_name() {
		return bus_guar_name;
	}

	public void setBus_guar_name(String bus_guar_name) {
		this.bus_guar_name = bus_guar_name;
	}

	public String getBus_guar_tax_id() {
		return bus_guar_tax_id;
	}

	public void setBus_guar_tax_id(String bus_guar_tax_id) {
		this.bus_guar_tax_id = bus_guar_tax_id;
	}

	public BigDecimal getDeferred_down_monthly_payment() {
		return deferred_down_monthly_payment;
	}

	public void setDeferred_down_monthly_payment(BigDecimal deferred_down_monthly_payment) {
		this.deferred_down_monthly_payment = deferred_down_monthly_payment;
	}

	public BigDecimal getDeferred_down_monthly_tax() {
		return deferred_down_monthly_tax;
	}

	public void setDeferred_down_monthly_tax(BigDecimal deferred_down_monthly_tax) {
		this.deferred_down_monthly_tax = deferred_down_monthly_tax;
	}

	public Date getDeferred_down_expire_date() {
		return deferred_down_expire_date;
	}

	public void setDeferred_down_expire_date(Date deferred_down_expire_date) {
		this.deferred_down_expire_date = deferred_down_expire_date;
	}

	public String getDmv_or_title_work_still_needed() {
		return dmv_or_title_work_still_needed;
	}

	public void setDmv_or_title_work_still_needed(String dmv_or_title_work_still_needed) {
		this.dmv_or_title_work_still_needed = dmv_or_title_work_still_needed;
	}

	public Date getDmv_status_date() {
		return dmv_status_date;
	}

	public void setDmv_status_date(Date dmv_status_date) {
		this.dmv_status_date = dmv_status_date;
	}

	public BigDecimal getEarly_termination_payments() {
		return early_termination_payments;
	}

	public void setEarly_termination_payments(BigDecimal early_termination_payments) {
		this.early_termination_payments = early_termination_payments;
	}

	public Integer getNumber_advanced_payments() {
		return number_advanced_payments;
	}

	public void setNumber_advanced_payments(Integer number_advanced_payments) {
		this.number_advanced_payments = number_advanced_payments;
	}

	public String getRegistration_street() {
		return registration_street;
	}

	public void setRegistration_street(String registration_street) {
		this.registration_street = registration_street;
	}

	public String getRegistration_city() {
		return registration_city;
	}

	public void setRegistration_city(String registration_city) {
		this.registration_city = registration_city;
	}

	public String getRegistration_state() {
		return registration_state;
	}

	public void setRegistration_state(String registration_state) {
		this.registration_state = registration_state;
	}

	public String getRegistration_zipcode() {
		return registration_zipcode;
	}

	public void setRegistration_zipcode(String registration_zipcode) {
		this.registration_zipcode = registration_zipcode;
	}

	public String getRegistration_county() {
		return registration_county;
	}

	public void setRegistration_county(String registration_county) {
		this.registration_county = registration_county;
	}

	public String getDealbook_registration_state() {
		return dealbook_registration_state;
	}

	public void setDealbook_registration_state(String dealbook_registration_state) {
		this.dealbook_registration_state = dealbook_registration_state;
	}

	public String getTemp_tag_issued_by() {
		return temp_tag_issued_by;
	}

	public void setTemp_tag_issued_by(String temp_tag_issued_by) {
		this.temp_tag_issued_by = temp_tag_issued_by;
	}

	public String getTemp_tag_number_1() {
		return temp_tag_number_1;
	}

	public void setTemp_tag_number_1(String temp_tag_number_1) {
		this.temp_tag_number_1 = temp_tag_number_1;
	}

	public Date getTemp_tag_expire_date_1() {
		return temp_tag_expire_date_1;
	}

	public void setTemp_tag_expire_date_1(Date temp_tag_expire_date_1) {
		this.temp_tag_expire_date_1 = temp_tag_expire_date_1;
	}

	public String getTemp_tag_number_2() {
		return temp_tag_number_2;
	}

	public void setTemp_tag_number_2(String temp_tag_number_2) {
		this.temp_tag_number_2 = temp_tag_number_2;
	}

	public Date getTemp_tag_expire_date_2() {
		return temp_tag_expire_date_2;
	}

	public void setTemp_tag_expire_date_2(Date temp_tag_expire_date_2) {
		this.temp_tag_expire_date_2 = temp_tag_expire_date_2;
	}

	public String getAp_ad_colessee() {
		return ap_ad_colessee;
	}

	public void setAp_ad_colessee(String ap_ad_colessee) {
		this.ap_ad_colessee = ap_ad_colessee;
	}

	public String getRed_flag_monitoring_status() {
		return red_flag_monitoring_status;
	}

	public void setRed_flag_monitoring_status(String red_flag_monitoring_status) {
		this.red_flag_monitoring_status = red_flag_monitoring_status;
	}

	public BigDecimal getVehicle_weight() {
		return vehicle_weight;
	}

	public void setVehicle_weight(BigDecimal vehicle_weight) {
		this.vehicle_weight = vehicle_weight;
	}

	public String getPrevious_title_number() {
		return previous_title_number;
	}

	public void setPrevious_title_number(String previous_title_number) {
		this.previous_title_number = previous_title_number;
	}

	@Override
	public String toString() {
		return "MiniLeaseLoader [loan=" + loan + ", loan_created=" + loan_created + ", year=" + year + ", make=" + make
				+ ", model=" + model + ", trim=" + trim + ", miles=" + miles + ", color=" + color + ", vin=" + vin
				+ ", license_plate=" + license_plate + ", borrower_name=" + borrower_name + ", borrower_first_name="
				+ borrower_first_name + ", borrower_middle_name=" + borrower_middle_name + ", borrower_last_name="
				+ borrower_last_name + ", borrower_email=" + borrower_email + ", borrower_pri_phone="
				+ borrower_pri_phone + ", borrower_sec_phone=" + borrower_sec_phone + ", borrower_address="
				+ borrower_address + ", borrower_city=" + borrower_city + ", borrower_state=" + borrower_state
				+ ", borrower_zipcode=" + borrower_zipcode + ", mailing_address=" + mailing_address + ", mailing_city="
				+ mailing_city + ", mailing_state=" + mailing_state + ", mailing_zipcode=" + mailing_zipcode
				+ ", borrower_ssn=" + borrower_ssn + ", borrower_additional_email_address="
				+ borrower_additional_email_address + ", coborrower_name=" + coborrower_name
				+ ", coborrower_first_name=" + coborrower_first_name + ", coborrower_middle_name="
				+ coborrower_middle_name + ", coborrower_last_name=" + coborrower_last_name + ", coborrower_email="
				+ coborrower_email + ", coborrower_pri_phone=" + coborrower_pri_phone + ", coborrower_sec_phone="
				+ coborrower_sec_phone + ", coborrower_address=" + coborrower_address + ", coborrower_city="
				+ coborrower_city + ", coborrower_state=" + coborrower_state + ", coborrower_zipcode="
				+ coborrower_zipcode + ", coborrower_mailing_address=" + coborrower_mailing_address
				+ ", coborrower_mailing_city=" + coborrower_mailing_city + ", coborrower_mailing_state="
				+ coborrower_mailing_state + ", coborrower_mailing_zipcode=" + coborrower_mailing_zipcode
				+ ", coborrower_ssn=" + coborrower_ssn + ", co_borrower_additional_email_address="
				+ co_borrower_additional_email_address + ", bank_account_number_censored="
				+ bank_account_number_censored + ", source_company=" + source_company + ", loan_status=" + loan_status
				+ ", loan_substatus=" + loan_substatus + ", closed_date=" + closed_date + ", repo_date=" + repo_date
				+ ", liquidation_date=" + liquidation_date + ", payment_freq=" + payment_freq + ", contract_date="
				+ contract_date + ", terms_remaining=" + terms_remaining + ", contract_date_2nd=" + contract_date_2nd
				+ ", days_past_due=" + days_past_due + ", amount_pd=" + amount_pd + ", nextscheduledpaymentamount="
				+ nextscheduledpaymentamount + ", nextscheduledpaymentdate=" + nextscheduledpaymentdate
				+ ", nextscheduledpaymentinterest=" + nextscheduledpaymentinterest + ", nextscheduledpaymentprincipal="
				+ nextscheduledpaymentprincipal + ", nextscheduledpaymentfees=" + nextscheduledpaymentfees
				+ ", nextscheduledpaymentescrow=" + nextscheduledpaymentescrow + ", numberofscheduledpayments="
				+ numberofscheduledpayments + ", date_last_current=" + date_last_current + ", current_date_res="
				+ current_date_res + ", fees_due=" + fees_due + ", p_i_due=" + p_i_due + ", payoff_fees=" + payoff_fees
				+ ", last_payment_date=" + last_payment_date + ", last_payment_amt=" + last_payment_amt
				+ ", last_payment_interest_llp=" + last_payment_interest_llp + ", last_payment_principal="
				+ last_payment_principal + ", last_payment_fees=" + last_payment_fees + ", last_payment_sales_tax="
				+ last_payment_sales_tax + ", next_due_date=" + next_due_date + ", next_due_amount=" + next_due_amount
				+ ", next_payment_interest_llp=" + next_payment_interest_llp + ", next_payment_principal="
				+ next_payment_principal + ", next_payment_fees=" + next_payment_fees + ", next_payment_sales_tax="
				+ next_payment_sales_tax + ", insurance_expires=" + insurance_expires + ", selling_price="
				+ selling_price + ", date_of_sale_to_llp=" + date_of_sale_to_llp + ", title_state=" + title_state
				+ ", dmv_fees=" + dmv_fees + ", lease_acquisition_fee=" + lease_acquisition_fee
				+ ", initial_sales_tax_at_purchase=" + initial_sales_tax_at_purchase + ", dealer_fees=" + dealer_fees
				+ ", other_fees_due_at_signing=" + other_fees_due_at_signing + ", adjusted_capitalized_cost="
				+ adjusted_capitalized_cost + ", lesse_residual=" + lesse_residual + ", appraisal_fee=" + appraisal_fee
				+ ", term_in_months=" + term_in_months + ", base_monthly_rental_charge=" + base_monthly_rental_charge
				+ ", interest_rate_used_to_calculate_lease=" + interest_rate_used_to_calculate_lease
				+ ", odometer_reading_at_inception=" + odometer_reading_at_inception + ", lease_state_salestaxrate="
				+ lease_state_salestaxrate + ", lease_county_salestaxrate=" + lease_county_salestaxrate
				+ ", lease_city_salestaxrate=" + lease_city_salestaxrate + ", salesperson=" + salesperson
				+ ", application_type=" + application_type + ", business_guarantor=" + business_guarantor
				+ ", personal_guarantor=" + personal_guarantor + ", dealer_points=" + dealer_points
				+ ", monthly_sales_tax=" + monthly_sales_tax + ", unapplied_funds=" + unapplied_funds
				+ ", unapplied_funds_type=" + unapplied_funds_type + ", title_number=" + title_number + ", title_date="
				+ title_date + ", referring_dealer=" + referring_dealer + ", lease_dealer_type=" + lease_dealer_type
				+ ", dealer_dmv=" + dealer_dmv + ", dealer_dmv_status=" + dealer_dmv_status + ", sub_status_breakdown="
				+ sub_status_breakdown + ", payoff_request_date=" + payoff_request_date + ", title_sent_to_trust="
				+ title_sent_to_trust + ", first_ach_date=" + first_ach_date + ", end_ach_date=" + end_ach_date
				+ ", subi_trust=" + subi_trust + ", subi_trust_date=" + subi_trust_date
				+ ", special_payoff_instructions=" + special_payoff_instructions + ", extension_program="
				+ extension_program + ", extension_term_months=" + extension_term_months + ", extension_start_date="
				+ extension_start_date + ", etension_end_date=" + etension_end_date + ", extension_payment="
				+ extension_payment + ", deferred_down_payment=" + deferred_down_payment
				+ ", deferred_down_payment_terms=" + deferred_down_payment_terms + ", new_lease_eligibility="
				+ new_lease_eligibility + ", init_setup_end_of_term_date=" + init_setup_end_of_term_date
				+ ", ap_ad_contract_date=" + ap_ad_contract_date + ", per_guar_first_name=" + per_guar_first_name
				+ ", per_guar_middle_initial=" + per_guar_middle_initial + ", per_guar_last_name=" + per_guar_last_name
				+ ", per_guar_tax_id=" + per_guar_tax_id + ", per_guar_email=" + per_guar_email
				+ ", per_guar_primary_phone=" + per_guar_primary_phone + ", second_per_guar_first_name="
				+ second_per_guar_first_name + ", second_per_guar_middle_initial=" + second_per_guar_middle_initial
				+ ", second_per_guar_last_name=" + second_per_guar_last_name + ", second_per_guar_tax_id="
				+ second_per_guar_tax_id + ", second_per_guar_email_=" + second_per_guar_email_
				+ ", second_per_guar_primary_phone=" + second_per_guar_primary_phone + ", bus_guar_name="
				+ bus_guar_name + ", bus_guar_tax_id=" + bus_guar_tax_id + ", deferred_down_monthly_payment="
				+ deferred_down_monthly_payment + ", deferred_down_monthly_tax=" + deferred_down_monthly_tax
				+ ", deferred_down_expire_date=" + deferred_down_expire_date + ", dmv_or_title_work_still_needed="
				+ dmv_or_title_work_still_needed + ", dmv_status_date=" + dmv_status_date
				+ ", early_termination_payments=" + early_termination_payments + ", number_advanced_payments="
				+ number_advanced_payments + ", registration_street=" + registration_street + ", registration_city="
				+ registration_city + ", registration_state=" + registration_state + ", registration_zipcode="
				+ registration_zipcode + ", registration_county=" + registration_county
				+ ", dealbook_registration_state=" + dealbook_registration_state + ", temp_tag_issued_by="
				+ temp_tag_issued_by + ", temp_tag_number_1=" + temp_tag_number_1 + ", temp_tag_expire_date_1="
				+ temp_tag_expire_date_1 + ", temp_tag_number_2=" + temp_tag_number_2 + ", temp_tag_expire_date_2="
				+ temp_tag_expire_date_2 + ", ap_ad_colessee=" + ap_ad_colessee + ", red_flag_monitoring_status="
				+ red_flag_monitoring_status + ", vehicle_weight=" + vehicle_weight + ", previous_title_number="
				+ previous_title_number + "]";
	}

}
