package com.sales.marketing.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "deal_input_market_value" database table.
 *
 */
@Entity
@Table(name="deal_input_market_value")
@NamedQuery(name="DealInputMarketValue.findAll", query="SELECT d FROM DealInputMarketValue d")
public class DealInputMarketValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DEAL_INPUT_MARKET_VALUE_DIID_GENERATOR", sequenceName="DEAL_INPUT_MARKET_VALUE_DI_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEAL_INPUT_MARKET_VALUE_DIID_GENERATOR")
	@Column(name="di_id")
	private int diId;

	@Column(name="base_valuation")
	private BigDecimal baseValuation;

	@Column(name="blackbook_excellent_price")
	private BigDecimal blackbookExcellentPrice;

	@Column(name="blackbook_fair_price")
	private BigDecimal blackbookFairPrice;

	@Column(name="blackbook_good_price")
	private BigDecimal blackbookGoodPrice;

	@Column(name="created_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Timestamp createdAt;

	@Column(name="creation_user_i")
	private String creationUserI;

	@Column(name="final_valuation")
	private BigDecimal finalValuation;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="inactive_d")
	private Timestamp inactiveD;

	@Column(name="ja_adjust_eqipment")
	private BigDecimal jaAdjustEqipment;

	@Column(name="ja_adjust_market")
	private BigDecimal jaAdjustMarket;

	@Column(name="ja_adjust_other")
	private BigDecimal jaAdjustOther;

	@Column(name="last_updated_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Timestamp lastUpdatedAt;

	@Column(name="last_updated_user_i")
	private String lastUpdatedUserI;

	@Column(name="md_comp1")
	private BigDecimal mdComp1;

	@Column(name="md_comp2")
	private BigDecimal mdComp2;

	@Column(name="md_comp3")
	private BigDecimal mdComp3;

	@Column(name="md_comp4")
	private BigDecimal mdComp4;

	@Column(name="md_comp5")
	private BigDecimal mdComp5;

	@Column(name="md_comp6")
	private BigDecimal mdComp6;

	@Column(name="md_mmr")
	private BigDecimal mdMmr;

	@Column(name="mi_month_year")
	private BigDecimal miMonthYear;

	@Column(name="quote_id")
	private String quoteId;

	@Column(name="valuation_comments")
	private String valuationComments;

	public DealInputMarketValue() {
	}

	public int getDiId() {
		return this.diId;
	}

	public void setDiId(int diId) {
		this.diId = diId;
	}

	public BigDecimal getBaseValuation() {
		return this.baseValuation;
	}

	public void setBaseValuation(BigDecimal baseValuation) {
		this.baseValuation = baseValuation;
	}

	public BigDecimal getBlackbookExcellentPrice() {
		return this.blackbookExcellentPrice;
	}

	public void setBlackbookExcellentPrice(BigDecimal blackbookExcellentPrice) {
		this.blackbookExcellentPrice = blackbookExcellentPrice;
	}

	public BigDecimal getBlackbookFairPrice() {
		return this.blackbookFairPrice;
	}

	public void setBlackbookFairPrice(BigDecimal blackbookFairPrice) {
		this.blackbookFairPrice = blackbookFairPrice;
	}

	public BigDecimal getBlackbookGoodPrice() {
		return this.blackbookGoodPrice;
	}

	public void setBlackbookGoodPrice(BigDecimal blackbookGoodPrice) {
		this.blackbookGoodPrice = blackbookGoodPrice;
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

	public BigDecimal getFinalValuation() {
		return this.finalValuation;
	}

	public void setFinalValuation(BigDecimal finalValuation) {
		this.finalValuation = finalValuation;
	}

	public Timestamp getInactiveD() {
		return this.inactiveD;
	}

	public void setInactiveD(Timestamp inactiveD) {
		this.inactiveD = inactiveD;
	}

	public BigDecimal getJaAdjustEqipment() {
		return this.jaAdjustEqipment;
	}

	public void setJaAdjustEqipment(BigDecimal jaAdjustEqipment) {
		this.jaAdjustEqipment = jaAdjustEqipment;
	}

	public BigDecimal getJaAdjustMarket() {
		return this.jaAdjustMarket;
	}

	public void setJaAdjustMarket(BigDecimal jaAdjustMarket) {
		this.jaAdjustMarket = jaAdjustMarket;
	}

	public BigDecimal getJaAdjustOther() {
		return this.jaAdjustOther;
	}

	public void setJaAdjustOther(BigDecimal jaAdjustOther) {
		this.jaAdjustOther = jaAdjustOther;
	}

	public Timestamp getLastUpdatedAt() {
		return this.lastUpdatedAt;
	}

	public void setLastUpdatedAt(Timestamp lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	public String getLastUpdatedUserI() {
		return this.lastUpdatedUserI;
	}

	public void setLastUpdatedUserI(String lastUpdatedUserI) {
		this.lastUpdatedUserI = lastUpdatedUserI;
	}

	public BigDecimal getMdComp1() {
		return this.mdComp1;
	}

	public void setMdComp1(BigDecimal mdComp1) {
		this.mdComp1 = mdComp1;
	}

	public BigDecimal getMdComp2() {
		return this.mdComp2;
	}

	public void setMdComp2(BigDecimal mdComp2) {
		this.mdComp2 = mdComp2;
	}

	public BigDecimal getMdComp3() {
		return this.mdComp3;
	}

	public void setMdComp3(BigDecimal mdComp3) {
		this.mdComp3 = mdComp3;
	}

	public BigDecimal getMdComp4() {
		return this.mdComp4;
	}

	public void setMdComp4(BigDecimal mdComp4) {
		this.mdComp4 = mdComp4;
	}

	public BigDecimal getMdComp5() {
		return this.mdComp5;
	}

	public void setMdComp5(BigDecimal mdComp5) {
		this.mdComp5 = mdComp5;
	}

	public BigDecimal getMdComp6() {
		return this.mdComp6;
	}

	public void setMdComp6(BigDecimal mdComp6) {
		this.mdComp6 = mdComp6;
	}

	public BigDecimal getMdMmr() {
		return this.mdMmr;
	}

	public void setMdMmr(BigDecimal mdMmr) {
		this.mdMmr = mdMmr;
	}

	public BigDecimal getMiMonthYear() {
		return this.miMonthYear;
	}

	public void setMiMonthYear(BigDecimal miMonthYear) {
		this.miMonthYear = miMonthYear;
	}

	public String getQuoteId() {
		return this.quoteId;
	}

	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	public String getValuationComments() {
		return this.valuationComments;
	}

	public void setValuationComments(String valuationComments) {
		this.valuationComments = valuationComments;
	}

	@Override
	public String toString() {
		return "DealInputMarketValue [diId=" + diId + ", baseValuation=" + baseValuation + ", blackbookExcellentPrice="
				+ blackbookExcellentPrice + ", blackbookFairPrice=" + blackbookFairPrice + ", blackbookGoodPrice="
				+ blackbookGoodPrice + ", createdAt=" + createdAt + ", creationUserI=" + creationUserI
				+ ", finalValuation=" + finalValuation + ", inactiveD=" + inactiveD + ", jaAdjustEqipment="
				+ jaAdjustEqipment + ", jaAdjustMarket=" + jaAdjustMarket + ", jaAdjustOther=" + jaAdjustOther
				+ ", lastUpdatedAt=" + lastUpdatedAt + ", lastUpdatedUserI=" + lastUpdatedUserI + ", mdComp1=" + mdComp1
				+ ", mdComp2=" + mdComp2 + ", mdComp3=" + mdComp3 + ", mdComp4=" + mdComp4 + ", mdComp5=" + mdComp5
				+ ", mdComp6=" + mdComp6 + ", mdMmr=" + mdMmr + ", miMonthYear=" + miMonthYear + ", quoteId=" + quoteId
				+ ", valuationComments=" + valuationComments + "]";
	}
}