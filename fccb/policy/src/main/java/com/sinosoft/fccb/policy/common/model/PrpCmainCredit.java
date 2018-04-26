package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PrpCmainCredit generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcmain_credit")
public class PrpCmainCredit implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 投保单号码 */
	private String proposalNo;
	/** 投保单号码 */
	private PrpCmain prpCmain;
	/** 险种代码 */
	private String riskCode;
	/** 信用卡类型 */
	private String creditCardType;
	/** 信用卡名称 */
	private String creditCardName;
	/** 信用卡号码 */
	private String creditCardNo;
	/** 币别 */
	private String currency;
	/** 银行名称 */
	private String bankName;
	/** 使用区域 */
	private String useArea;
	/** 总投保面积(种植险) */
	private String insureArea;
	/** 申报方式 */
	private String declareMode;
	/** 信用额度 */
	private BigDecimal creditAmount;
	/** 赔偿比例 */
	private BigDecimal claimRate;
	/** 备注 */
	private String remark;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpCmainCredit() {
	}

	/**       
	 * 投保单号码
	 */
	@Id
	@Column(name = "proposalno", unique = true, nullable = false)
	public String getProposalNo() {
		return this.proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}

	/**       
	 * 投保单号码
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proposalno", unique = true, nullable = false, insertable = false, updatable = false)
	public PrpCmain getPrpCmain() {
		return this.prpCmain;
	}

	public void setPrpCmain(PrpCmain prpCmain) {
		this.prpCmain = prpCmain;
	}

	/**       
	 * 险种代码
	 */

	@Column(name = "riskcode", nullable = false)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	/**       
	 * 信用卡类型
	 */

	@Column(name = "creditcardtype")
	public String getCreditCardType() {
		return this.creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

	/**       
	 * 信用卡名称
	 */

	@Column(name = "creditcardname")
	public String getCreditCardName() {
		return this.creditCardName;
	}

	public void setCreditCardName(String creditCardName) {
		this.creditCardName = creditCardName;
	}

	/**       
	 * 信用卡号码
	 */

	@Column(name = "creditcardno")
	public String getCreditCardNo() {
		return this.creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	/**       
	 * 币别
	 */

	@Column(name = "currency")
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**       
	 * 银行名称
	 */

	@Column(name = "bankname")
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**       
	 * 使用区域
	 */

	@Column(name = "usearea")
	public String getUseArea() {
		return this.useArea;
	}

	public void setUseArea(String useArea) {
		this.useArea = useArea;
	}

	/**       
	 * 总投保面积(种植险)
	 */

	@Column(name = "insurearea")
	public String getInsureArea() {
		return this.insureArea;
	}

	public void setInsureArea(String insureArea) {
		this.insureArea = insureArea;
	}

	/**       
	 * 申报方式
	 */

	@Column(name = "declaremode")
	public String getDeclareMode() {
		return this.declareMode;
	}

	public void setDeclareMode(String declareMode) {
		this.declareMode = declareMode;
	}

	/**       
	 * 信用额度
	 */

	@Column(name = "creditamount")
	public BigDecimal getCreditAmount() {
		return this.creditAmount;
	}

	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}

	/**       
	 * 赔偿比例
	 */

	@Column(name = "claimrate")
	public BigDecimal getClaimRate() {
		return this.claimRate;
	}

	public void setClaimRate(BigDecimal claimRate) {
		this.claimRate = claimRate;
	}

	/**       
	 * 备注
	 */

	@Column(name = "remark")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**       
	 * 短信转存后是否删除标记
	 */

	@Column(name = "flag")
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	/**       
	 * 插入时间
	 */

	@Column(name = "inserttimeforhis", insertable = false, updatable = false)
	public Date getInsertTimeForHis() {
		return this.insertTimeForHis;
	}

	public void setInsertTimeForHis(Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}

	/**       
	 * 更新时间
	 */

	@Column(name = "operatetimeforhis", insertable = false)
	public Date getOperateTimeForHis() {
		return this.operateTimeForHis;
	}

	public void setOperateTimeForHis(Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}

}