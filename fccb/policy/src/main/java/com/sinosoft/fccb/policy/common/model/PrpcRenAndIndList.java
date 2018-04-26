package com.sinosoft.fccb.policy.common.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "prpcrenandindlist")
public class PrpcRenAndIndList  implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 序号 */
	private Integer serialNo;
	/** 被保险人名称 */
	private String insuredName;
	/** 起保年份 */
	private String year;
	/** 责任类别代码
		0001 死亡残疾
		0002 医疗*/
	private String itemcode;
	/** 已赚承保人数 */
	private BigDecimal quantity_E;
	/** 已赚累计责任限额 */
	private BigDecimal accuamount_Exin;
	/** 已赚保费 */
	private BigDecimal premium_E;
	/** 终极损失 */
	private BigDecimal ultpay;
	/** 地市公司代码 */
	private String dbname;
	/** 人数 */
	private BigDecimal quantity;
	/** 趋势化终极损失 */
	private BigDecimal ultpay_trend;
	/** 区域 */
	private String zone;
	/** 保险期限 */
	private String insuranceDuration;
	/** 备注*/
	private String remark;
	/** 标志字段 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;
	
	public PrpcRenAndIndList(){
	}

	@Id
	@Column(name = "serialNo")
	@GeneratedValue(strategy = IDENTITY)
	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	@Column(name = "insuredName")
	public String getInsuredName() {
		return insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	@Column(name = "year")
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Column(name = "itemcode")
	public String getItemcode() {
		return itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	@Column(name = "quantity_e")
	public BigDecimal getQuantity_E() {
		return quantity_E;
	}

	public void setQuantity_E(BigDecimal quantity_E) {
		this.quantity_E = quantity_E;
	}

	@Column(name = "accuamount_exin")
	public BigDecimal getAccuamount_Exin() {
		return accuamount_Exin;
	}

	public void setAccuamount_Exin(BigDecimal accuamount_Exin) {
		this.accuamount_Exin = accuamount_Exin;
	}

	@Column(name = "premium_e")
	public BigDecimal getPremium_E() {
		return premium_E;
	}

	public void setPremium_E(BigDecimal premium_E) {
		this.premium_E = premium_E;
	}

	@Column(name = "ultpay")
	public BigDecimal getUltpay() {
		return ultpay;
	}

	public void setUltpay(BigDecimal ultpay) {
		this.ultpay = ultpay;
	}

	@Column(name = "dbname")
	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}

	@Column(name = "quantity")
	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	@Column(name = "ultpay_trend")
	public BigDecimal getUltpay_trend() {
		return ultpay_trend;
	}

	public void setUltpay_trend(BigDecimal ultpay_trend) {
		this.ultpay_trend = ultpay_trend;
	}

	@Column(name = "zone")
	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	@Column(name = "insuranceDuration")
	public String getInsuranceDuration() {
		return insuranceDuration;
	}

	public void setInsuranceDuration(String insuranceDuration) {
		this.insuranceDuration = insuranceDuration;
	}

	/**       
	 * 备注
	 */

	@Column(name = "remark")
	@Basic(fetch = FetchType.LAZY)
	@Type(type = "org.springframework.orm.hibernate3.support.ClobStringType")
	public String getRemark() {
		return this.remark;
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

	@Column(name = "operatetimeforhis" , insertable = false)
	public Date getOperateTimeForHis() {
		return this.operateTimeForHis;
	}

	public void setOperateTimeForHis(Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}
	
}
