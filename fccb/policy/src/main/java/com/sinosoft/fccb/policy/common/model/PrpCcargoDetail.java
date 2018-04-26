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
 * PrpCcargoDetail generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpccargodetail")
public class PrpCcargoDetail implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** SerialNo */
	private PrpCcargoDetailId id;
	/** 投保单号码 */
	private PrpCmain prpCmain;
	/** 险种代码 */
	private String riskCode;
	/** 印刷号 */
	private String printNo;
	/** 保单类型 */
	private String policyType;
	/** 限定产品代码 */
	private String confineRiskCode;
	/** 限定产品名称 */
	private String confineRiskName;
	/** 限定条款代码 */
	private String confineClauseCode; 
	/** 限定条款名称 */
	private String confineClauseName;
	/** 限定责任代码 */
	private String confineKindCode; 
	/** 限定责任名称 */
	private String confineKindName;
	/** 运输工具 */
	private String conveyance;
	/** 运具牌号 */
	private String blNo;
	/** 航次 */
	private String voyageNo;
	/** 货票运单号 */
	private String carryBillNo;
	/** 货物名称 */
	private String detailName;
	/** 起运日期 */
	private Date startDate;
	/** 起运地 */
	private String startSiteName;
	/** 中转地 */
	private String viaSiteName;
	/** 目的地 */
	private String endSiteName;
	/** 数量 */
	private String quantity;
	/** 币别 */
	private String currency;
	/** 货物价值 */
	private BigDecimal sumValue;
	/** 总保额 */
	private BigDecimal sumAmount;
	/** 费率 */
	private BigDecimal rate;
	/** 总保费 */
	private BigDecimal sumPremium;
	/** 结算标志 */
	private String settleFlag;
	/** 第几次协议结算（YAE） */
	private Integer balanceTimes;
	/** 备注 */
	private String remark;
	/** 复核人代码 */
	private String approverCode;
	/** 保单统计年月 */
	private Date statisticsYM;
	/** 发货登记信息是否已经生成小保单的校验字段 */
	private String genPolicyFlag;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpCcargoDetail() {
	}

	/**       
	 * SerialNo
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "proposalNo", column = @Column(name = "proposalno", nullable = false)),
			@AttributeOverride(name = "batchNo", column = @Column(name = "batchno", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)) })
	public PrpCcargoDetailId getId() {
		return this.id;
	}

	public void setId(PrpCcargoDetailId id) {
		this.id = id;
	}

	/**       
	 * 投保单号码
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proposalno", nullable = false, insertable = false, updatable = false)
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
	 * 印刷号
	 */

	@Column(name = "printno")
	public String getPrintNo() {
		return this.printNo;
	}

	public void setPrintNo(String printNo) {
		this.printNo = printNo;
	}

	/**       
	 * 保单类型
	 */

	@Column(name = "policytype")
	public String getPolicyType() {
		return this.policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	/**       
	 * 限定产品代码
	 */

    @Column(name = "confineriskcode")
	public String getConfineRiskCode() {
		return confineRiskCode;
	}

	public void setConfineRiskCode(String confineRiskCode) {
		this.confineRiskCode = confineRiskCode;
	}

	/**       
	 * 限定产品名称
	 */

    @Column(name = "confineriskname")
	public String getConfineRiskName() {
		return confineRiskName;
	}

	public void setConfineRiskName(String confineRiskName) {
		this.confineRiskName = confineRiskName;
	}
	/**       
	 * 限定条款代码
	 */

    @Column(name = "confineclausecode")
	public String getConfineClauseCode() {
		return confineClauseCode;
	}

	public void setConfineClauseCode(String confineClauseCode) {
		this.confineClauseCode = confineClauseCode;
	}
	/**       
	 * 限定条款名称
	 */

    @Column(name = "confineclausename")
	public String getConfineClauseName() {
		return confineClauseName;
	}

	public void setConfineClauseName(String confineClauseName) {
		this.confineClauseName = confineClauseName;
	}
	/**       
	 * 限定责任代码
	 */

    @Column(name = "confinekindcode")
	public String getConfineKindCode() {
		return confineKindCode;
	}

	public void setConfineKindCode(String confineKindCode) {
		this.confineKindCode = confineKindCode;
	}
	/**       
	 * 限定责任名称
	 */

    @Column(name = "confinekindname")
	public String getConfineKindName() {
		return confineKindName;
	}

	public void setConfineKindName(String confineKindName) {
		this.confineKindName = confineKindName;
	}
	/**       
	 * 运输工具
	 */

	@Column(name = "conveyance")
	public String getConveyance() {
		return this.conveyance;
	}

	public void setConveyance(String conveyance) {
		this.conveyance = conveyance;
	}

	/**       
	 * 运具牌号
	 */

	@Column(name = "blno")
	public String getBlNo() {
		return this.blNo;
	}

	public void setBlNo(String blNo) {
		this.blNo = blNo;
	}

	/**       
	 * 航次
	 */

	@Column(name = "voyageno")
	public String getVoyageNo() {
		return this.voyageNo;
	}

	public void setVoyageNo(String voyageNo) {
		this.voyageNo = voyageNo;
	}

	/**       
	 * 货票运单号
	 */

	@Column(name = "carrybillno")
	public String getCarryBillNo() {
		return this.carryBillNo;
	}

	public void setCarryBillNo(String carryBillNo) {
		this.carryBillNo = carryBillNo;
	}

	/**       
	 * 货物名称
	 */

	@Column(name = "detailname")
	public String getDetailName() {
		return this.detailName;
	}

	public void setDetailName(String detailName) {
		this.detailName = detailName;
	}

	/**       
	 * 起运日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "startdate")
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**       
	 * 起运地
	 */

	@Column(name = "startsitename")
	public String getStartSiteName() {
		return this.startSiteName;
	}

	public void setStartSiteName(String startSiteName) {
		this.startSiteName = startSiteName;
	}

	/**       
	 * 中转地
	 */

	@Column(name = "viasitename")
	public String getViaSiteName() {
		return this.viaSiteName;
	}

	public void setViaSiteName(String viaSiteName) {
		this.viaSiteName = viaSiteName;
	}

	/**       
	 * 目的地
	 */

	@Column(name = "endsitename")
	public String getEndSiteName() {
		return this.endSiteName;
	}

	public void setEndSiteName(String endSiteName) {
		this.endSiteName = endSiteName;
	}

	/**       
	 * 数量
	 */

	@Column(name = "quantity")
	public String getQuantity() {
		return this.quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
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
	 * 货物价值
	 */

	@Column(name = "sumvalue")
	public BigDecimal getSumValue() {
		return this.sumValue;
	}

	public void setSumValue(BigDecimal sumValue) {
		this.sumValue = sumValue;
	}

	/**       
	 * 总保额
	 */

	@Column(name = "sumamount")
	public BigDecimal getSumAmount() {
		return this.sumAmount;
	}

	public void setSumAmount(BigDecimal sumAmount) {
		this.sumAmount = sumAmount;
	}

	/**       
	 * 费率
	 */

	@Column(name = "rate")
	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	/**       
	 * 总保费
	 */

	@Column(name = "sumpremium")
	public BigDecimal getSumPremium() {
		return this.sumPremium;
	}

	public void setSumPremium(BigDecimal sumPremium) {
		this.sumPremium = sumPremium;
	}

	/**       
	 * 结算标志
	 */

	@Column(name = "settleflag")
	public String getSettleFlag() {
		return this.settleFlag;
	}

	public void setSettleFlag(String settleFlag) {
		this.settleFlag = settleFlag;
	}

	/**       
	 * 第几次协议结算（YAE）
	 */

	@Column(name = "balancetimes")
	public Integer getBalanceTimes() {
		return this.balanceTimes;
	}

	public void setBalanceTimes(Integer balanceTimes) {
		this.balanceTimes = balanceTimes;
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
	 * 复核人代码
	 */

	@Column(name = "approvercode")
	public String getApproverCode() {
		return this.approverCode;
	}

	public void setApproverCode(String approverCode) {
		this.approverCode = approverCode;
	}

	/**       
	 * 保单统计年月
	 */

	@Column(name = "statisticsym")
	public Date getStatisticsYM() {
		return this.statisticsYM;
	}

	public void setStatisticsYM(Date statisticsYM) {
		this.statisticsYM = statisticsYM;
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
	/** 
	 * 发货登记信息是否已经生成小保单的校验字段 
	 */
	@Column(name = "genpolicyflag")
	public String getGenPolicyFlag() {
		return genPolicyFlag;
	}

	public void setGenPolicyFlag(String genPolicyFlag) {
		this.genPolicyFlag = genPolicyFlag;
	}

}