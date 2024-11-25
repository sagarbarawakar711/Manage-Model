package com.sales.marketing.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "loan_details")
@NamedQuery(name = "LoanDetails.findAll", query = "SELECT a FROM LoanDetails a")
public class LoanDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "loan_details_test_id_generator", sequenceName = "loan_details_test_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loan_details_test_id_generator")
	@Column(name = "loan_number")
	private Integer loanNumber;

	@Column(name = "borrower_name")
	private String borrowerName;

	@Column(name = "first_ach_date")
	private Date firstACHDate;

	@Column(name = "end_ach_date")
	private Date endACHDate;

	@Column(name = "base")
	private Double base;

	@Column(name = "adj_cap_cost")
	private Double adjCapCost;

	@Column(name = "dealer_points")
	private Double dealerPoints;

	@Column(name = "lease_amount")
	private Double lesseeAmount;

	@Column(name = "lessee_residual")
	private Double lesseeResidual;

	@Column(name = "funding_date")
	private Date fundingDate;

	@Column(name = "interest")
	private Double interest;

	@Column(name = "ach_terms")
	private Double achTerms;

	@Column(name = "op1")
	private Double op1;

	@Column(name = "month_no_1")
	private Double monthNo1;

	@Column(name = "month_no_2")
	private Double monthNo2;

	@Column(name = "month_no_3")
	private Double monthNo3;

	@Column(name = "month_no_4")
	private Double monthNo4;

	@Column(name = "month_no_5")
	private Double monthNo5;

	@Column(name = "month_no_6")
	private Double monthNo6;

	@Column(name = "month_no_7")
	private Double monthNo7;
	@Column(name = "month_no_8")
	private Double monthNo8;

	@Column(name = "month_no_9")
	private Double monthNo9;

	@Column(name = "month_no_10")
	private Double monthNo10;

	@Column(name = "month_no_11")
	private Double monthNo11;

	@Column(name = "month_no_12")
	private Double monthNo12;

	@Column(name = "month_no_13")
	private Double monthNo13;

	@Column(name = "month_no_14")
	private Double monthNo14;

	@Column(name = "month_no_15")
	private Double monthNo15;

	@Column(name = "month_no_16")
	private Double monthNo16;

	@Column(name = "month_no_17")
	private Double monthNo17;
	@Column(name = "month_no_18")
	private Double monthNo18;

	@Column(name = "month_no_19")
	private Double monthNo19;

	@Column(name = "month_no_20")
	private Double monthNo20;

	@Column(name = "month_no_21")
	private Double monthNo21;

	@Column(name = "month_no_22")
	private Double monthNo22;

	@Column(name = "month_no_23")
	private Double monthNo23;

	@Column(name = "month_no_24")
	private Double monthNo24;

	@Column(name = "month_no_25")
	private Double monthNo25;

	@Column(name = "month_no_26")
	private Double monthNo26;

	@Column(name = "month_no_27")
	private Double monthNo27;
	@Column(name = "month_no_28")
	private Double monthNo28;

	@Column(name = "month_no_29")
	private Double monthNo29;

	@Column(name = "month_no_30")
	private Double monthNo30;

	@Column(name = "month_no_31")
	private Double monthNo31;

	@Column(name = "month_no_32")
	private Double monthNo32;

	@Column(name = "month_no_33")
	private Double monthNo33;

	@Column(name = "month_no_34")
	private Double monthNo34;

	@Column(name = "month_no_35")
	private Double monthNo35;

	@Column(name = "month_no_36")
	private Double monthNo36;

	@Column(name = "month_no_37")
	private Double monthNo37;
	@Column(name = "month_no_38")
	private Double monthNo38;

	@Column(name = "month_no_39")
	private Double monthNo39;

	@Column(name = "month_no_40")
	private Double monthNo40;

	@Column(name = "month_no_41")
	private Double monthNo41;

	@Column(name = "month_no_42")
	private Double monthNo42;

	@Column(name = "month_no_43")
	private Double monthNo43;

	@Column(name = "month_no_44")
	private Double monthNo44;

	@Column(name = "month_no_45")
	private Double monthNo45;

	@Column(name = "month_no_46")
	private Double monthNo46;

	@Column(name = "month_no_47")
	private Double monthNo47;
	@Column(name = "month_no_48")
	private Double monthNo48;

	@Column(name = "month_no_49")
	private Double monthNo49;

	@Column(name = "month_no_50")
	private Double monthNo50;

	@Column(name = "month_no_51")
	private Double monthNo51;

	@Column(name = "month_no_52")
	private Double monthNo52;

	@Column(name = "month_no_53")
	private Double monthNo53;

	@Column(name = "month_no_54")
	private Double monthNo54;

	@Column(name = "month_no_55")
	private Double monthNo55;

	@Column(name = "month_no_56")
	private Double monthNo56;

	@Column(name = "month_no_57")
	private Double monthNo57;
	@Column(name = "month_no_58")
	private Double monthNo58;

	@Column(name = "month_no_59")
	private Double monthNo59;

	@Column(name = "month_no_60")
	private Double monthNo60;

	@Column(name = "month_no_61")
	private Double monthNo61;

	@Column(name = "month_no_62")
	private Double monthNo62;

	@Column(name = "month_no_63")
	private Double monthNo63;

	@Column(name = "month_no_64")
	private Double monthNo64;

	@Column(name = "month_no_65")
	private Double monthNo65;

	@Column(name = "month_no_66")
	private Double monthNo66;

	@Column(name = "month_no_67")
	private Double monthNo67;
	@Column(name = "month_no_68")
	private Double monthNo68;

	@Column(name = "month_no_69")
	private Double monthNo69;

	@Column(name = "month_no_70")
	private Double monthNo70;

	@Column(name = "month_no_71")
	private Double monthNo71;

	@Column(name = "month_no_72")
	private Double monthNo72;

	@Column(name = "notes")
	private String notes;
	
	@Column(name = "indicators")
	private String indicators;

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(Integer loanNumber) {
		this.loanNumber = loanNumber;
	}

	public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public Date getFirstACHDate() {
		return firstACHDate;
	}

	public void setFirstACHDate(Date date1) {
		this.firstACHDate = date1;
	}

	public Date getEndACHDate() {
		return endACHDate;
	}

	public void setEndACHDate(Date endACHDate) {
		this.endACHDate = endACHDate;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAdjCapCost() {
		return adjCapCost;
	}

	public void setAdjCapCost(Double adjCapCost) {
		this.adjCapCost = adjCapCost;
	}

	public Double getDealerPoints() {
		return dealerPoints;
	}

	public void setDealerPoints(Double dealerPoints) {
		this.dealerPoints = dealerPoints;
	}

	public Double getLesseeAmount() {
		return lesseeAmount;
	}

	public void setLesseeAmount(Double lesseeAmount) {
		this.lesseeAmount = lesseeAmount;
	}

	public Double getLesseeResidual() {
		return lesseeResidual;
	}

	public void setLesseeResidual(Double lesseeResidual) {
		this.lesseeResidual = lesseeResidual;
	}

	public Date getFundingDate() {
		return fundingDate;
	}

	public void setFundingDate(Date fundingDate) {
		this.fundingDate = fundingDate;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	public Double getAchTerms() {
		return achTerms;
	}

	public void setAchTerms(Double achTerms) {
		this.achTerms = achTerms;
	}

	public Double getOp1() {
		return op1;
	}

	public void setOp1(Double op1) {
		this.op1 = op1;
	}

	public Double getMonthNo1() {
		return monthNo1;
	}

	public void setMonthNo1(Double monthNo1) {
		this.monthNo1 = monthNo1;
	}

	public Double getMonthNo2() {
		return monthNo2;
	}

	public void setMonthNo2(Double monthNo2) {
		this.monthNo2 = monthNo2;
	}

	public Double getMonthNo3() {
		return monthNo3;
	}

	public void setMonthNo3(Double monthNo3) {
		this.monthNo3 = monthNo3;
	}

	public Double getMonthNo4() {
		return monthNo4;
	}

	public void setMonthNo4(Double monthNo4) {
		this.monthNo4 = monthNo4;
	}

	public Double getMonthNo5() {
		return monthNo5;
	}

	public void setMonthNo5(Double monthNo5) {
		this.monthNo5 = monthNo5;
	}

	public Double getMonthNo6() {
		return monthNo6;
	}

	public void setMonthNo6(Double monthNo6) {
		this.monthNo6 = monthNo6;
	}

	public Double getMonthNo7() {
		return monthNo7;
	}

	public void setMonthNo7(Double monthNo7) {
		this.monthNo7 = monthNo7;
	}

	public Double getMonthNo8() {
		return monthNo8;
	}

	public void setMonthNo8(Double monthNo8) {
		this.monthNo8 = monthNo8;
	}

	public Double getMonthNo9() {
		return monthNo9;
	}

	public void setMonthNo9(Double monthNo9) {
		this.monthNo9 = monthNo9;
	}

	public Double getMonthNo10() {
		return monthNo10;
	}

	public void setMonthNo10(Double monthNo10) {
		this.monthNo10 = monthNo10;
	}

	public Double getMonthNo11() {
		return monthNo11;
	}

	public void setMonthNo11(Double monthNo11) {
		this.monthNo11 = monthNo11;
	}

	public Double getMonthNo12() {
		return monthNo12;
	}

	public void setMonthNo12(Double monthNo12) {
		this.monthNo12 = monthNo12;
	}

	public Double getMonthNo13() {
		return monthNo13;
	}

	public void setMonthNo13(Double monthNo13) {
		this.monthNo13 = monthNo13;
	}

	public Double getMonthNo14() {
		return monthNo14;
	}

	public void setMonthNo14(Double monthNo14) {
		this.monthNo14 = monthNo14;
	}

	public Double getMonthNo15() {
		return monthNo15;
	}

	public void setMonthNo15(Double monthNo15) {
		this.monthNo15 = monthNo15;
	}

	public Double getMonthNo16() {
		return monthNo16;
	}

	public void setMonthNo16(Double monthNo16) {
		this.monthNo16 = monthNo16;
	}

	public Double getMonthNo17() {
		return monthNo17;
	}

	public void setMonthNo17(Double monthNo17) {
		this.monthNo17 = monthNo17;
	}

	public Double getMonthNo18() {
		return monthNo18;
	}

	public void setMonthNo18(Double monthNo18) {
		this.monthNo18 = monthNo18;
	}

	public Double getMonthNo19() {
		return monthNo19;
	}

	public void setMonthNo19(Double monthNo19) {
		this.monthNo19 = monthNo19;
	}

	public Double getMonthNo20() {
		return monthNo20;
	}

	public void setMonthNo20(Double monthNo20) {
		this.monthNo20 = monthNo20;
	}

	public Double getMonthNo21() {
		return monthNo21;
	}

	public void setMonthNo21(Double monthNo21) {
		this.monthNo21 = monthNo21;
	}

	public Double getMonthNo22() {
		return monthNo22;
	}

	public void setMonthNo22(Double monthNo22) {
		this.monthNo22 = monthNo22;
	}

	public Double getMonthNo23() {
		return monthNo23;
	}

	public void setMonthNo23(Double monthNo23) {
		this.monthNo23 = monthNo23;
	}

	public Double getMonthNo24() {
		return monthNo24;
	}

	public void setMonthNo24(Double monthNo24) {
		this.monthNo24 = monthNo24;
	}

	public Double getMonthNo25() {
		return monthNo25;
	}

	public void setMonthNo25(Double monthNo25) {
		this.monthNo25 = monthNo25;
	}

	public Double getMonthNo26() {
		return monthNo26;
	}

	public void setMonthNo26(Double monthNo26) {
		this.monthNo26 = monthNo26;
	}

	public Double getMonthNo27() {
		return monthNo27;
	}

	public void setMonthNo27(Double monthNo27) {
		this.monthNo27 = monthNo27;
	}

	public Double getMonthNo28() {
		return monthNo28;
	}

	public void setMonthNo28(Double monthNo28) {
		this.monthNo28 = monthNo28;
	}

	public Double getMonthNo29() {
		return monthNo29;
	}

	public void setMonthNo29(Double monthNo29) {
		this.monthNo29 = monthNo29;
	}

	public Double getMonthNo30() {
		return monthNo30;
	}

	public void setMonthNo30(Double monthNo30) {
		this.monthNo30 = monthNo30;
	}

	public Double getMonthNo31() {
		return monthNo31;
	}

	public void setMonthNo31(Double monthNo31) {
		this.monthNo31 = monthNo31;
	}

	public Double getMonthNo32() {
		return monthNo32;
	}

	public void setMonthNo32(Double monthNo32) {
		this.monthNo32 = monthNo32;
	}

	public Double getMonthNo33() {
		return monthNo33;
	}

	public void setMonthNo33(Double monthNo33) {
		this.monthNo33 = monthNo33;
	}

	public Double getMonthNo34() {
		return monthNo34;
	}

	public void setMonthNo34(Double monthNo34) {
		this.monthNo34 = monthNo34;
	}

	public Double getMonthNo35() {
		return monthNo35;
	}

	public void setMonthNo35(Double monthNo35) {
		this.monthNo35 = monthNo35;
	}

	public Double getMonthNo36() {
		return monthNo36;
	}

	public void setMonthNo36(Double monthNo36) {
		this.monthNo36 = monthNo36;
	}

	public Double getMonthNo37() {
		return monthNo37;
	}

	public void setMonthNo37(Double monthNo37) {
		this.monthNo37 = monthNo37;
	}

	public Double getMonthNo38() {
		return monthNo38;
	}

	public void setMonthNo38(Double monthNo38) {
		this.monthNo38 = monthNo38;
	}

	public Double getMonthNo39() {
		return monthNo39;
	}

	public void setMonthNo39(Double monthNo39) {
		this.monthNo39 = monthNo39;
	}

	public Double getMonthNo40() {
		return monthNo40;
	}

	public void setMonthNo40(Double monthNo40) {
		this.monthNo40 = monthNo40;
	}

	public Double getMonthNo41() {
		return monthNo41;
	}

	public void setMonthNo41(Double monthNo41) {
		this.monthNo41 = monthNo41;
	}

	public Double getMonthNo42() {
		return monthNo42;
	}

	public void setMonthNo42(Double monthNo42) {
		this.monthNo42 = monthNo42;
	}

	public Double getMonthNo43() {
		return monthNo43;
	}

	public void setMonthNo43(Double monthNo43) {
		this.monthNo43 = monthNo43;
	}

	public Double getMonthNo44() {
		return monthNo44;
	}

	public void setMonthNo44(Double monthNo44) {
		this.monthNo44 = monthNo44;
	}

	public Double getMonthNo45() {
		return monthNo45;
	}

	public void setMonthNo45(Double monthNo45) {
		this.monthNo45 = monthNo45;
	}

	public Double getMonthNo46() {
		return monthNo46;
	}

	public void setMonthNo46(Double monthNo46) {
		this.monthNo46 = monthNo46;
	}

	public Double getMonthNo47() {
		return monthNo47;
	}

	public void setMonthNo47(Double monthNo47) {
		this.monthNo47 = monthNo47;
	}

	public Double getMonthNo48() {
		return monthNo48;
	}

	public void setMonthNo48(Double monthNo48) {
		this.monthNo48 = monthNo48;
	}

	public Double getMonthNo49() {
		return monthNo49;
	}

	public void setMonthNo49(Double monthNo49) {
		this.monthNo49 = monthNo49;
	}

	public Double getMonthNo50() {
		return monthNo50;
	}

	public void setMonthNo50(Double monthNo50) {
		this.monthNo50 = monthNo50;
	}

	public Double getMonthNo51() {
		return monthNo51;
	}

	public void setMonthNo51(Double monthNo51) {
		this.monthNo51 = monthNo51;
	}

	public Double getMonthNo52() {
		return monthNo52;
	}

	public void setMonthNo52(Double monthNo52) {
		this.monthNo52 = monthNo52;
	}

	public Double getMonthNo53() {
		return monthNo53;
	}

	public void setMonthNo53(Double monthNo53) {
		this.monthNo53 = monthNo53;
	}

	public Double getMonthNo54() {
		return monthNo54;
	}

	public void setMonthNo54(Double monthNo54) {
		this.monthNo54 = monthNo54;
	}

	public Double getMonthNo55() {
		return monthNo55;
	}

	public void setMonthNo55(Double monthNo55) {
		this.monthNo55 = monthNo55;
	}

	public Double getMonthNo56() {
		return monthNo56;
	}

	public void setMonthNo56(Double monthNo56) {
		this.monthNo56 = monthNo56;
	}

	public Double getMonthNo57() {
		return monthNo57;
	}

	public void setMonthNo57(Double monthNo57) {
		this.monthNo57 = monthNo57;
	}

	public Double getMonthNo58() {
		return monthNo58;
	}

	public void setMonthNo58(Double monthNo58) {
		this.monthNo58 = monthNo58;
	}

	public Double getMonthNo59() {
		return monthNo59;
	}

	public void setMonthNo59(Double monthNo59) {
		this.monthNo59 = monthNo59;
	}

	public Double getMonthNo60() {
		return monthNo60;
	}

	public void setMonthNo60(Double monthNo60) {
		this.monthNo60 = monthNo60;
	}

	public Double getMonthNo61() {
		return monthNo61;
	}

	public void setMonthNo61(Double monthNo61) {
		this.monthNo61 = monthNo61;
	}

	public Double getMonthNo62() {
		return monthNo62;
	}

	public void setMonthNo62(Double monthNo62) {
		this.monthNo62 = monthNo62;
	}

	public Double getMonthNo63() {
		return monthNo63;
	}

	public void setMonthNo63(Double monthNo63) {
		this.monthNo63 = monthNo63;
	}

	public Double getMonthNo64() {
		return monthNo64;
	}

	public void setMonthNo64(Double monthNo64) {
		this.monthNo64 = monthNo64;
	}

	public Double getMonthNo65() {
		return monthNo65;
	}

	public void setMonthNo65(Double monthNo65) {
		this.monthNo65 = monthNo65;
	}

	public Double getMonthNo66() {
		return monthNo66;
	}

	public void setMonthNo66(Double monthNo66) {
		this.monthNo66 = monthNo66;
	}

	public Double getMonthNo67() {
		return monthNo67;
	}

	public void setMonthNo67(Double monthNo67) {
		this.monthNo67 = monthNo67;
	}

	public Double getMonthNo68() {
		return monthNo68;
	}

	public void setMonthNo68(Double monthNo68) {
		this.monthNo68 = monthNo68;
	}

	public Double getMonthNo69() {
		return monthNo69;
	}

	public void setMonthNo69(Double monthNo69) {
		this.monthNo69 = monthNo69;
	}

	public Double getMonthNo70() {
		return monthNo70;
	}

	public void setMonthNo70(Double monthNo70) {
		this.monthNo70 = monthNo70;
	}

	public Double getMonthNo72() {
		return monthNo72;
	}

	public void setMonthNo72(Double monthNo72) {
		this.monthNo72 = monthNo72;
	}

	public Double getMonthNo71() {
		return monthNo71;
	}

	public void setMonthNo71(Double monthNo71) {
		this.monthNo71 = monthNo71;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getIndicators() {
		return indicators;
	}

	public void setIndicators(String indicators) {
		this.indicators = indicators;
	}

}
