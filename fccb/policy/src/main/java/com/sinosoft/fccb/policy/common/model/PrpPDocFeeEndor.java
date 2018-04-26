package com.sinosoft.fccb.policy.common.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "prppdocfeeendor")
public class PrpPDocFeeEndor implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PrpPDocFeeEndorId id;

	//--** 保单号码
	private String policyNo;
	/** 批单号 */
	private String endorseNo;
	//--** 险种代码▲
	private String riskCode;
	//--** 跟单手续费类型▲
	private String docFeeType;
	//跟单手续费配置表记录号
	private Integer configNo;
	//--** 跟单手续费缺省比例（%）
	private BigDecimal defaultDocFeeRate;
	//--** 跟单手续费比例上限（%）
	private BigDecimal docFeeRateUpper;
	// --** 手续费比例(%)
	private BigDecimal docFeeRate;
	//--** 联共保调整比例
	private BigDecimal coinsRate;
	//--** 是否扣除分保部分费用
	private String reinsFlag;
	//--** 币别代码▲
	private String currency;
	// --** 冲减实付手续费金额 P99
	private BigDecimal mainDocFee;
	//--** 冲减确认手续费金额 P98
	private BigDecimal foreDocFee;
	// --** 支付标志,0：未支付,1：部分支付,2：全部支付,3：无需支付,4：不可支付
	private String paidFlag;
	// --** 超额标志,0：非超限额保单,1：超限额保单
	private String overFlag;
	//-** 分期付费标志, 0：非分期付费,1：分期付费
	private String periodFlag;
	//  --** 标志位
	private String flag;
	//录入时间
	private Date inputTime;
	
	public PrpPDocFeeEndor() {
	}
	
	/**       
	 * SerialNo
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)) })
	public PrpPDocFeeEndorId getId() {
		return id;
	}
	public void setId(PrpPDocFeeEndorId id) {
		this.id = id;
	}
	/**       
	 * 保单号
	 */
	@Column(name = "policyno", nullable = false)
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	/**       
	 * 险种代码
	 */
	@Column(name = "riskcode")
	public String getRiskCode() {
		return riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	/**       
	 * 跟单手续费类型
	 */
	@Column(name = "docFeeType")
	public String getDocFeeType() {
		return docFeeType;
	}
	public void setDocFeeType(String docFeeType) {
		this.docFeeType = docFeeType;
	}
	/**       
	 * 跟单手续费配置表记录号
	 */
	@Column(name = "configNo")
	public Integer getConfigNo() {
		return configNo;
	}
	public void setConfigNo(Integer configNo) {
		this.configNo = configNo;
	}
	/**       
	 * 跟单手续费缺省比例（%）
	 */
	@Column(name = "defaultDocFeeRate")
	public BigDecimal getDefaultDocFeeRate() {
		return defaultDocFeeRate;
	}
	public void setDefaultDocFeeRate(BigDecimal defaultDocFeeRate) {
		this.defaultDocFeeRate = defaultDocFeeRate;
	}
	/**       
	 * 跟单手续费比例上限（%）
	 */
	@Column(name = "docFeeRateUpper")
	public BigDecimal getDocFeeRateUpper() {
		return docFeeRateUpper;
	}
	public void setDocFeeRateUpper(BigDecimal docFeeRateUpper) {
		this.docFeeRateUpper = docFeeRateUpper;
	}
	/**       
	 * 手续费比例(%)
	 */
	@Column(name = "docFeeRate")
	public BigDecimal getDocFeeRate() {
		return docFeeRate;
	}
	public void setDocFeeRate(BigDecimal docFeeRate) {
		this.docFeeRate = docFeeRate;
	}
	/**       
	 * 联共保调整比例
	 */
	@Column(name = "coinsRate")
	public BigDecimal getCoinsRate() {
		return coinsRate;
	}
	public void setCoinsRate(BigDecimal coinsRate) {
		this.coinsRate = coinsRate;
	}
	/**       
	 * 是否扣除分保部分费用
	 */
	@Column(name = "reinsFlag")
	public String getReinsFlag() {
		return reinsFlag;
	}
	public void setReinsFlag(String reinsFlag) {
		this.reinsFlag = reinsFlag;
	}
	/**       
	 * 币别代码▲
	 */
	@Column(name = "currency")
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**       
	 * 冲减实付手续费金额 P99
	 */
	@Column(name = "mainDocFee")
	public BigDecimal getMainDocFee() {
		return mainDocFee;
	}
	public void setMainDocFee(BigDecimal mainDocFee) {
		this.mainDocFee = mainDocFee;
	}
	/**       
	 * 冲减确认手续费金额 P98
	 */
	@Column(name = "foreDocFee")
	public BigDecimal getForeDocFee() {
		return foreDocFee;
	}
	public void setForeDocFee(BigDecimal foreDocFee) {
		this.foreDocFee = foreDocFee;
	}
	/**       
	 * 支付标志,0：未支付,1：部分支付,2：全部支付,3：无需支付,4：不可支付
	 */
	@Column(name = "paidFlag")
	public String getPaidFlag() {
		return paidFlag;
	}
	public void setPaidFlag(String paidFlag) {
		this.paidFlag = paidFlag;
	}
	/**       
	 * 超额标志,0：非超限额保单,1：超限额保单
	 */
	@Column(name = "overFlag")
	public String getOverFlag() {
		return overFlag;
	}
	public void setOverFlag(String overFlag) {
		this.overFlag = overFlag;
	}
	/**       
	 * 分期付费标志, 0：非分期付费,1：分期付费
	 */
	@Column(name = "periodFlag")
	public String getPeriodFlag() {
		return periodFlag;
	}
	public void setPeriodFlag(String periodFlag) {
		this.periodFlag = periodFlag;
	}
	/**       
	 * 标志位
	 */
	@Column(name = "flag")
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	/**       
	 * 录入时间
	 */
	@Column(name = "inputTime")
	public Date getInputTime() {
		return inputTime;
	}
	public void setInputTime(Date inputTime) {
		this.inputTime = inputTime;
	}
	/**       
	 * 批单号
	 */
	@Column(name = "endorseNo")
	public String getEndorseNo() {
		return endorseNo;
	}
	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}
	
}
