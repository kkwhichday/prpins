package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PrpPplan generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prppplan")
public class PrpPplan implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** SerialNo */
	private PrpPplanId id;
	/** 批单申请号 */
	private PrpPhead prpPhead;
	/** 批单号 */
	private String endorseNo;
	/** 保单号 */
	private String policyNo;
	/** 交费期次 */
	private Integer payNo;
	/** 交费原因(同收付费系统定义) */
	private String payReason;
	/** 计划交费截止日期 */
	private Date planDate;
	/** 币别 */
	private String currency;
	/** 补贴比例 */
	private BigDecimal subsidyrate;
	/** PlanFee */
	private BigDecimal planFee;
	/** 拖欠金额 */
	private BigDecimal delinquentFee;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;
	
	private Date payDate;
	/** 申请类型 */
	private String payType;
	private String exchangeNo;
	/** 是否交费完成 */
	private String paymentcomplete;
	/** 税费 */
	private BigDecimal taxFee;

	public PrpPplan() {
	}

	/**       
	 * SerialNo
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)) })
	public PrpPplanId getId() {
		return this.id;
	}

	public void setId(PrpPplanId id) {
		this.id = id;
	}

	/**       
	 * 批单申请号
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "applyno", nullable = false, insertable = false, updatable = false)
	public PrpPhead getPrpPhead() {
		return this.prpPhead;
	}

	public void setPrpPhead(PrpPhead prpPhead) {
		this.prpPhead = prpPhead;
	}

	/**       
	 * 批单号
	 */

	@Column(name = "endorseno")
	public String getEndorseNo() {
		return this.endorseNo;
	}

	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}

	/**       
	 * 保单号
	 */

	@Column(name = "policyno", nullable = false)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	/**       
	 * 交费期次
	 */

	@Column(name = "payno", nullable = false)
	public Integer getPayNo() {
		return this.payNo;
	}

	public void setPayNo(Integer payNo) {
		this.payNo = payNo;
	}

	/**       
	 * 交费原因(同收付费系统定义)
	 */

	@Column(name = "payreason", nullable = false)
	public String getPayReason() {
		return this.payReason;
	}

	public void setPayReason(String payReason) {
		this.payReason = payReason;
	}

	/**       
	 * 计划交费截止日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "plandate")
	public Date getPlanDate() {
		return this.planDate;
	}

	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}

	/**       
	 * 币别
	 */

	@Column(name = "currency", nullable = false)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**       
	 * 补贴比例
	 */

	@Column(name = "subsidyrate")
	public BigDecimal getSubsidyrate() {
		return this.subsidyrate;
	}

	public void setSubsidyrate(BigDecimal subsidyrate) {
		this.subsidyrate = subsidyrate;
	}
	/**       
	 * PlanFee
	 */

	@Column(name = "planfee")
	public BigDecimal getPlanFee() {
		return this.planFee;
	}

	public void setPlanFee(BigDecimal planFee) {
		this.planFee = planFee;
	}

	/**       
	 * 拖欠金额
	 */

	@Column(name = "delinquentfee")
	public BigDecimal getDelinquentFee() {
		return this.delinquentFee;
	}

	public void setDelinquentFee(BigDecimal delinquentFee) {
		this.delinquentFee = delinquentFee;
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
	@Column(name = "paydate")
	public Date getPayDate() {
		return this.payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	/**       
	 * 申请类型
	 */

	@Column(name = "paytype")
	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	@Column(name = "exchangeno")
	public String getExchangeNo() {
		return this.exchangeNo;
	}

	public void setExchangeNo(String exchangeNo) {
		this.exchangeNo = exchangeNo;
	}
	
	@Column(name = "PAYMENTCOMPLETE")
	public String getPaymentcomplete() {
		return paymentcomplete;
	}

	public void setPaymentcomplete(String paymentcomplete) {
		this.paymentcomplete = paymentcomplete;
	}

	/**       
	 * 税费
	 */
	@Column(name = "taxFee")
	public BigDecimal getTaxFee() {
		return taxFee;
	}

	public void setTaxFee(BigDecimal taxFee) {
		this.taxFee = taxFee;
	}
}
