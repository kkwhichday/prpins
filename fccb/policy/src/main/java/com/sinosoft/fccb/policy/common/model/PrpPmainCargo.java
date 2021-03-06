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
 * PrpPmainCargo generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prppmain_cargo")
public class PrpPmainCargo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 批单申请号 */
	private String applyNo;
	/** 批单申请号 */
	private PrpPhead prpPhead;
	/** 批单号 */
	private String endorseNo;
	/** 保单号 */
	private String policyNo;
	/** 险种代码 */
	private String riskCode;
	/** 价格条件 */
	private String priceCondition;
	/** 提单号 */
	private String ladingNo;
	/** 发票号 */
	private String invoiceNo;
	/** 发票金额币别 */
	private String invoiceCurrency;
	/** 发票金额 */
	private BigDecimal invoiceAmount;
	/** 加成比例 */
	private BigDecimal plusRate;
	/** 信用证号 */
	private String creditNo;
	/** 起运通知书编号 */
	private String shipNoteNo;
	/** 合同号 */
	private String bargainNo;
	/** 运输工具 */
	private String conveyance;
	/** 运具名称 */
	private String blName;
	/** 货票运单号 */
	private String carryBillNo;
	/** 转运工具 */
	private String transferConveyance;
	/** 运具牌号 */
	private String blNo;
	/** 航次 */
	private String voyageNo;
	/** PreserveInfo */
	private String preserveInfo;
	/** 吨位数 */
	private BigDecimal tonCount;
	/** 起始地编码 */
	private String startSiteCode;
	/** 起运地 */
	private String startSiteName;
	/** 中转地编码 */
	private String viaSiteCode;
	/** 中转地 */
	private String viaSiteName;
	/** 转载地名称 */
	private String reshipSiteName;
	/** 终止地编码 */
	private String endSiteCode;
	/** 目的地 */
	private String endSiteName;
	/** 具体终止地名称 */
	private String endDetailName;
	/** 国外检验代理人代码 */
	private String checkAgentCode;
	/** 赔款偿付地点 */
	private String claimSite;
	/** 过户银行 */
	private String transferBank;
	/** 保单正本份数 */
	private Integer originalCount;
	/** 备注 */
	private String remark;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpPmainCargo() {
	}

	/**       
	 * 批单申请号
	 */
	@Id
	@Column(name = "applyno", unique = true, nullable = false)
	public String getApplyNo() {
		return this.applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	/**       
	 * 批单申请号
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "applyno", unique = true, nullable = false, insertable = false, updatable = false)
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
	 * 价格条件
	 */

	@Column(name = "pricecondition")
	public String getPriceCondition() {
		return this.priceCondition;
	}

	public void setPriceCondition(String priceCondition) {
		this.priceCondition = priceCondition;
	}

	/**       
	 * 提单号
	 */

	@Column(name = "ladingno")
	public String getLadingNo() {
		return this.ladingNo;
	}

	public void setLadingNo(String ladingNo) {
		this.ladingNo = ladingNo;
	}

	/**       
	 * 发票号
	 */

	@Column(name = "invoiceno")
	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	/**       
	 * 发票金额币别
	 */

	@Column(name = "invoicecurrency")
	public String getInvoiceCurrency() {
		return this.invoiceCurrency;
	}

	public void setInvoiceCurrency(String invoiceCurrency) {
		this.invoiceCurrency = invoiceCurrency;
	}

	/**       
	 * 发票金额
	 */

	@Column(name = "invoiceamount")
	public BigDecimal getInvoiceAmount() {
		return this.invoiceAmount;
	}

	public void setInvoiceAmount(BigDecimal invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	/**       
	 * 加成比例
	 */

	@Column(name = "plusrate")
	public BigDecimal getPlusRate() {
		return this.plusRate;
	}

	public void setPlusRate(BigDecimal plusRate) {
		this.plusRate = plusRate;
	}

	/**       
	 * 信用证号
	 */

	@Column(name = "creditno")
	public String getCreditNo() {
		return this.creditNo;
	}

	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}

	/**       
	 * 起运通知书编号
	 */

	@Column(name = "shipnoteno")
	public String getShipNoteNo() {
		return this.shipNoteNo;
	}

	public void setShipNoteNo(String shipNoteNo) {
		this.shipNoteNo = shipNoteNo;
	}

	/**       
	 * 合同号
	 */

	@Column(name = "bargainno")
	public String getBargainNo() {
		return this.bargainNo;
	}

	public void setBargainNo(String bargainNo) {
		this.bargainNo = bargainNo;
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
	 * 运具名称
	 */

	@Column(name = "blname")
	public String getBlName() {
		return this.blName;
	}

	public void setBlName(String blName) {
		this.blName = blName;
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
	 * 转运工具
	 */

	@Column(name = "transferconveyance")
	public String getTransferConveyance() {
		return this.transferConveyance;
	}

	public void setTransferConveyance(String transferConveyance) {
		this.transferConveyance = transferConveyance;
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
	 * PreserveInfo
	 */

	@Column(name = "preserveinfo")
	public String getPreserveInfo() {
		return this.preserveInfo;
	}

	public void setPreserveInfo(String preserveInfo) {
		this.preserveInfo = preserveInfo;
	}

	/**       
	 * 吨位数
	 */

	@Column(name = "toncount")
	public BigDecimal getTonCount() {
		return this.tonCount;
	}

	public void setTonCount(BigDecimal tonCount) {
		this.tonCount = tonCount;
	}

	/**       
	 * 起始地编码
	 */

	@Column(name = "startsitecode")
	public String getStartSiteCode() {
		return this.startSiteCode;
	}

	public void setStartSiteCode(String startSiteCode) {
		this.startSiteCode = startSiteCode;
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
	 * 中转地编码
	 */

	@Column(name = "viasitecode")
	public String getViaSiteCode() {
		return this.viaSiteCode;
	}

	public void setViaSiteCode(String viaSiteCode) {
		this.viaSiteCode = viaSiteCode;
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
	 * 转载地名称
	 */

	@Column(name = "reshipsitename")
	public String getReshipSiteName() {
		return this.reshipSiteName;
	}

	public void setReshipSiteName(String reshipSiteName) {
		this.reshipSiteName = reshipSiteName;
	}

	/**       
	 * 终止地编码
	 */

	@Column(name = "endsitecode")
	public String getEndSiteCode() {
		return this.endSiteCode;
	}

	public void setEndSiteCode(String endSiteCode) {
		this.endSiteCode = endSiteCode;
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
	 * 具体终止地名称
	 */

	@Column(name = "enddetailname")
	public String getEndDetailName() {
		return this.endDetailName;
	}

	public void setEndDetailName(String endDetailName) {
		this.endDetailName = endDetailName;
	}

	/**       
	 * 国外检验代理人代码
	 */

	@Column(name = "checkagentcode")
	public String getCheckAgentCode() {
		return this.checkAgentCode;
	}

	public void setCheckAgentCode(String checkAgentCode) {
		this.checkAgentCode = checkAgentCode;
	}

	/**       
	 * 赔款偿付地点
	 */

	@Column(name = "claimsite")
	public String getClaimSite() {
		return this.claimSite;
	}

	public void setClaimSite(String claimSite) {
		this.claimSite = claimSite;
	}

	/**       
	 * 过户银行
	 */

	@Column(name = "transferbank")
	public String getTransferBank() {
		return this.transferBank;
	}

	public void setTransferBank(String transferBank) {
		this.transferBank = transferBank;
	}

	/**       
	 * 保单正本份数
	 */

	@Column(name = "originalcount")
	public Integer getOriginalCount() {
		return this.originalCount;
	}

	public void setOriginalCount(Integer originalCount) {
		this.originalCount = originalCount;
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
