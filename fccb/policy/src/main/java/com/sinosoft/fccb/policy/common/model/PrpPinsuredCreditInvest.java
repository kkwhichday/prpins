package com.sinosoft.fccb.policy.common.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "prppinsuredcreditinvest")
public class PrpPinsuredCreditInvest {
	private static final long serialVersionUID = 1L;
	private PrpPinsuredCreditInvestId id;
	private PrpPhead prpPhead;
	/** 批单号 */
	private String endorseNo;
	/** 保单号 */
	private String policyNo;
	private Integer appliAge;
	private String appliHealth;
	private String appliMarriage;
	private String appliEducation;
	private String appliResidence;
	private String appliWork;
	private String appliWorkYears;
	private String appliDuty;
	private String incomeSource;
	private String piscale;
	private BigDecimal monthEconomy;
	private String houseStat;
	private String houseSource;
	private String houseType;
	private String repayRec;
	private String pubRec;
	private String othRec;
	private Integer establishDate;
	private String business;
	private String area;
	private String ownSysNature;
	private String enterpriseType;
	private String fleetComFlag;
	private String reinvestFlag;
	private String honestReward;
	private BigDecimal registeredCapital;
	private BigDecimal totalAssets;
	private BigDecimal currentRatio;
	private BigDecimal quickRatio;
	private BigDecimal assetsDebtRatio;
	private BigDecimal mainTransProfit;
	private String clearProfit;
	private String bankCreditRec;
	private String enterpriseFinancing;
	private String guaranteeStatus;
	private BigDecimal sumScore;
	private String creditManCode;
	private String creditManName;
	private String creditManComment;
	private String remark;
	/**状态标志*/
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;
	/** 统谈资信标志 add by huoran*/
	private String creditFlag;
	
	/**       
	 * SerialNo
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)) })
	public PrpPinsuredCreditInvestId getId() {
		return id;
	}
	public void setId(PrpPinsuredCreditInvestId id) {
		this.id = id;
	}
	/**       
	 * 批单申请号
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "applyno", nullable = false, insertable = false, updatable = false)
	public PrpPhead getPrpPhead() {
		return prpPhead;
	}
	public void setPrpPhead(PrpPhead prpPhead) {
		this.prpPhead = prpPhead;
	}
	@Column(name = "endorseno")
	public String getEndorseNo() {
		return endorseNo;
	}
	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}
	@Column(name = "policyno")
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	@Column(name = "appliage")
	public Integer getAppliAge() {
		return appliAge;
	}
	public void setAppliAge(Integer appliAge) {
		this.appliAge = appliAge;
	}
	@Column(name = "applihealth")
	public String getAppliHealth() {
		return appliHealth;
	}
	public void setAppliHealth(String appliHealth) {
		this.appliHealth = appliHealth;
	}
	@Column(name = "applimarriage")
	public String getAppliMarriage() {
		return appliMarriage;
	}
	public void setAppliMarriage(String appliMarriage) {
		this.appliMarriage = appliMarriage;
	}
	@Column(name = "applieducation")
	public String getAppliEducation() {
		return appliEducation;
	}
	public void setAppliEducation(String appliEducation) {
		this.appliEducation = appliEducation;
	}
	@Column(name = "appliresidence")
	public String getAppliResidence() {
		return appliResidence;
	}
	public void setAppliResidence(String appliResidence) {
		this.appliResidence = appliResidence;
	}
	@Column(name = "appliwork")
	public String getAppliWork() {
		return appliWork;
	}
	public void setAppliWork(String appliWork) {
		this.appliWork = appliWork;
	}
	@Column(name = "appliworkyears")
	public String getAppliWorkYears() {
		return appliWorkYears;
	}
	public void setAppliWorkYears(String appliWorkYears) {
		this.appliWorkYears = appliWorkYears;
	}
	@Column(name = "appliduty")
	public String getAppliDuty() {
		return appliDuty;
	}
	public void setAppliDuty(String appliDuty) {
		this.appliDuty = appliDuty;
	}
	@Column(name = "incomesource")
	public String getIncomeSource() {
		return incomeSource;
	}
	public void setIncomeSource(String incomeSource) {
		this.incomeSource = incomeSource;
	}
	@Column(name = "piscale")
	public String getPiscale() {
		return piscale;
	}
	public void setPiscale(String piscale) {
		this.piscale = piscale;
	}
	@Column(name = "montheconomy")
	public BigDecimal getMonthEconomy() {
		return monthEconomy;
	}
	public void setMonthEconomy(BigDecimal monthEconomy) {
		this.monthEconomy = monthEconomy;
	}
	@Column(name = "housestat")
	public String getHouseStat() {
		return houseStat;
	}
	public void setHouseStat(String houseStat) {
		this.houseStat = houseStat;
	}
	@Column(name = "housesource")
	public String getHouseSource() {
		return houseSource;
	}
	public void setHouseSource(String houseSource) {
		this.houseSource = houseSource;
	}
	@Column(name = "housetype")
	public String getHouseType() {
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	@Column(name = "repayrec")
	public String getRepayRec() {
		return repayRec;
	}
	public void setRepayRec(String repayRec) {
		this.repayRec = repayRec;
	}
	@Column(name = "pubrec")
	public String getPubRec() {
		return pubRec;
	}
	public void setPubRec(String pubRec) {
		this.pubRec = pubRec;
	}
	@Column(name = "othrec")
	public String getOthRec() {
		return othRec;
	}
	public void setOthRec(String othRec) {
		this.othRec = othRec;
	}
	@Column(name = "establishdate")
	public Integer getEstablishDate() {
		return establishDate;
	}
	public void setEstablishDate(Integer establishDate) {
		this.establishDate = establishDate;
	}
	@Column(name = "business")
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	@Column(name = "area")
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Column(name = "ownsysnature")
	public String getOwnSysNature() {
		return ownSysNature;
	}
	public void setOwnSysNature(String ownSysNature) {
		this.ownSysNature = ownSysNature;
	}
	@Column(name = "enterprisetype")
	public String getEnterpriseType() {
		return enterpriseType;
	}
	public void setEnterpriseType(String enterpriseType) {
		this.enterpriseType = enterpriseType;
	}
	@Column(name = "fleetcomflag")
	public String getFleetComFlag() {
		return fleetComFlag;
	}
	public void setFleetComFlag(String fleetComFlag) {
		this.fleetComFlag = fleetComFlag;
	}
	@Column(name = "reinvestflag")
	public String getReinvestFlag() {
		return reinvestFlag;
	}
	public void setReinvestFlag(String reinvestFlag) {
		this.reinvestFlag = reinvestFlag;
	}
	@Column(name = "honestreward")
	public String getHonestReward() {
		return honestReward;
	}
	public void setHonestReward(String honestReward) {
		this.honestReward = honestReward;
	}
	@Column(name = "registeredcapital")
	public BigDecimal getRegisteredCapital() {
		return registeredCapital;
	}
	public void setRegisteredCapital(BigDecimal registeredCapital) {
		this.registeredCapital = registeredCapital;
	}
	@Column(name = "totalassets")
	public BigDecimal getTotalAssets() {
		return totalAssets;
	}
	public void setTotalAssets(BigDecimal totalAssets) {
		this.totalAssets = totalAssets;
	}
	@Column(name = "currentratio")
	public BigDecimal getCurrentRatio() {
		return currentRatio;
	}
	public void setCurrentRatio(BigDecimal currentRatio) {
		this.currentRatio = currentRatio;
	}
	@Column(name = "quickratio")
	public BigDecimal getQuickRatio() {
		return quickRatio;
	}
	public void setQuickRatio(BigDecimal quickRatio) {
		this.quickRatio = quickRatio;
	}
	@Column(name = "assetsdebtratio")
	public BigDecimal getAssetsDebtRatio() {
		return assetsDebtRatio;
	}
	public void setAssetsDebtRatio(BigDecimal assetsDebtRatio) {
		this.assetsDebtRatio = assetsDebtRatio;
	}
	@Column(name = "maintransprofit")
	public BigDecimal getMainTransProfit() {
		return mainTransProfit;
	}
	public void setMainTransProfit(BigDecimal mainTransProfit) {
		this.mainTransProfit = mainTransProfit;
	}
	@Column(name = "clearprofit")
	public String getClearProfit() {
		return clearProfit;
	}
	public void setClearProfit(String clearProfit) {
		this.clearProfit = clearProfit;
	}
	@Column(name = "bankcreditrec")
	public String getBankCreditRec() {
		return bankCreditRec;
	}
	public void setBankCreditRec(String bankCreditRec) {
		this.bankCreditRec = bankCreditRec;
	}
	@Column(name = "enterprisefinancing")
	public String getEnterpriseFinancing() {
		return enterpriseFinancing;
	}
	public void setEnterpriseFinancing(String enterpriseFinancing) {
		this.enterpriseFinancing = enterpriseFinancing;
	}
	@Column(name = "guaranteestatus")
	public String getGuaranteeStatus() {
		return guaranteeStatus;
	}
	public void setGuaranteeStatus(String guaranteeStatus) {
		this.guaranteeStatus = guaranteeStatus;
	}
	@Column(name = "sumscore")
	public BigDecimal getSumScore() {
		return sumScore;
	}
	public void setSumScore(BigDecimal sumScore) {
		this.sumScore = sumScore;
	}
	@Column(name = "creditmancode")
	public String getCreditManCode() {
		return creditManCode;
	}
	public void setCreditManCode(String creditManCode) {
		this.creditManCode = creditManCode;
	}
	@Column(name = "creditmanname")
	public String getCreditManName() {
		return creditManName;
	}
	public void setCreditManName(String creditManName) {
		this.creditManName = creditManName;
	}
	@Column(name = "creditmancomment")
	public String getCreditManComment() {
		return creditManComment;
	}
	public void setCreditManComment(String creditManComment) {
		this.creditManComment = creditManComment;
	}
	@Column(name = "flag")
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	@Column(name = "remark")
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Column(name = "inserttimeforhis", insertable = false, updatable = false)
	public Date getInsertTimeForHis() {
		return insertTimeForHis;
	}
	public void setInsertTimeForHis(Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}
	@Column(name = "operatetimeforhis", insertable = false)
	public Date getOperateTimeForHis() {
		return operateTimeForHis;
	}
	public void setOperateTimeForHis(Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}
	@Column(name = "creditflag")
	public String getCreditFlag() {
		return creditFlag;
	}
	public void setCreditFlag(String creditFlag) {
		this.creditFlag = creditFlag;
	}
}
