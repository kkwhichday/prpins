package com.sinosoft.fccb.policy.common.model;

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
@Table(name = "prpcopyitem_creditoth")
public class PrpCopyItemCreditOth implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private PrpCopyItemCreditOthId id;
	/** 批单申请号 */
	private PrpCopyMain prpCopyMain;
	/** 保单号 */
	private String policyNo;
	private String carDealerCode;
	private String carDealerName;
	private String affiliatedUnitCode;
	private String affiliatedUnitName;
	private String noFirstFlag;
	private String lastPremiumFlag;
	private Integer enterpQuantity;
	private Integer taxiComQuantity;
	private String remark;
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;
	/**       
	 * SerialNo
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)) })
	public PrpCopyItemCreditOthId getId() {
		return id;
	}
	public void setId(PrpCopyItemCreditOthId id) {
		this.id = id;
	}
	/**
	 * 批单申请号
	 * @return
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "applyno", nullable = false, insertable = false, updatable = false)
	public PrpCopyMain getPrpCopyMain() {
		return prpCopyMain;
	}
	public void setPrpCopyMain(PrpCopyMain prpCopyMain) {
		this.prpCopyMain = prpCopyMain;
	}
	@Column(name="policyno")
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	@Column(name = "cardealercode")
	public String getCarDealerCode() {
		return carDealerCode;
	}
	public void setCarDealerCode(String carDealerCode) {
		this.carDealerCode = carDealerCode;
	}
	@Column(name = "cardealername")
	public String getCarDealerName() {
		return carDealerName;
	}
	public void setCarDealerName(String carDealerName) {
		this.carDealerName = carDealerName;
	}
	@Column(name = "affiliatedunitcode")
	public String getAffiliatedUnitCode() {
		return affiliatedUnitCode;
	}
	public void setAffiliatedUnitCode(String affiliatedUnitCode) {
		this.affiliatedUnitCode = affiliatedUnitCode;
	}
	@Column(name = "affiliatedunitname")
	public String getAffiliatedUnitName() {
		return affiliatedUnitName;
	}
	public void setAffiliatedUnitName(String affiliatedUnitName) {
		this.affiliatedUnitName = affiliatedUnitName;
	}
	@Column(name = "nofirstflag")
	public String getNoFirstFlag() {
		return noFirstFlag;
	}
	public void setNoFirstFlag(String noFirstFlag) {
		this.noFirstFlag = noFirstFlag;
	}
	@Column(name = "lastpremiumflag")
	public String getLastPremiumFlag() {
		return lastPremiumFlag;
	}
	public void setLastPremiumFlag(String lastPremiumFlag) {
		this.lastPremiumFlag = lastPremiumFlag;
	}
	@Column(name = "enterpquantity")
	public Integer getEnterpQuantity() {
		return enterpQuantity;
	}
	public void setEnterpQuantity(Integer enterpQuantity) {
		this.enterpQuantity = enterpQuantity;
	}
	@Column(name = "taxicomquantity")
	public Integer getTaxiComQuantity() {
		return taxiComQuantity;
	}
	public void setTaxiComQuantity(Integer taxiComQuantity) {
		this.taxiComQuantity = taxiComQuantity;
	}
	@Column(name = "remark")
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Column(name = "flag")
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
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
}
