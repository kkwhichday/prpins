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
@Table(name = "prpcrenewallist")
public class PrpCrenewalList  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** 序号 */
	private Integer serialNo;
	/** 公司代码 */
	private String company;
	/** 投保人名称 */
	private String applicantName;
	/** 险种代码*/
	private String riskCode;
	/** 责任代码 */
	private String clauseCode;
	/** 起保年份*/
	private String startYear;
	/** 终极损失 */
	private BigDecimal ult_loss;
	/** 已赚责任限额 */
	private BigDecimal EA;
	/** 已赚保费 */
	private BigDecimal EP;
	/** 已赚投保座位数 */
	private BigDecimal EQ_aftergb;
	/** 投保座位数 */
	private BigDecimal quantity_applicantName;
	/** 备注*/
	private String remark;
	/** 标志字段 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;
	public PrpCrenewalList(){
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

	@Column(name = "company")
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Column(name = "applicantname")
	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	@Column(name = "riskcode")
	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	@Column(name = "clausecode")
	public String getClauseCode() {
		return clauseCode;
	}

	public void setClauseCode(String clauseCode) {
		this.clauseCode = clauseCode;
	}

	@Column(name = "startyear")
	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	@Column(name = "ult_loss")
	public BigDecimal getUlt_loss() {
		return ult_loss;
	}

	public void setUlt_loss(BigDecimal ultLoss) {
		ult_loss = ultLoss;
	}

	@Column(name = "ea")
	public BigDecimal getEA() {
		return EA;
	}

	public void setEA(BigDecimal eA) {
		EA = eA;
	}

	@Column(name = "ep")
	public BigDecimal getEP() {
		return EP;
	}

	public void setEP(BigDecimal eP) {
		EP = eP;
	}

	@Column(name = "eq_aftergb")
	public BigDecimal getEQ_aftergb() {
		return EQ_aftergb;
	}

	public void setEQ_aftergb(BigDecimal eQAftergb) {
		EQ_aftergb = eQAftergb;
	}

	@Column(name = "quantity_applicantname")
	public BigDecimal getQuantity_applicantName() {
		return quantity_applicantName;
	}

	public void setQuantity_applicantName(BigDecimal quantityApplicantName) {
		quantity_applicantName = quantityApplicantName;
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
