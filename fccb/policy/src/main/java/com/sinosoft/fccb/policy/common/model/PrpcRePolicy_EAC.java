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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "prpcrepolicy_eac")
public class PrpcRePolicy_EAC implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	private String policyNo;
	private String repolicyNo;
	private Date startDate;
	private Date endDate;
	private BigDecimal mainPremium;
	private BigDecimal mainInsuranceNum;
	private BigDecimal mainInsuranceCoverage;
	private BigDecimal mainInsuranceIndemnity;
	private BigDecimal addPremium;
	private BigDecimal addInsuranceNum;
	private BigDecimal addInsuranceCoverage;
	private BigDecimal addInsuranceIndemnity;
	private BigDecimal addInsuranceFranchiserate;
	private BigDecimal addInsuranceFranchisepremium;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;
	
	@Id
	@Column(name = "policyno")
	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	
	@Column(name = "repolicyno")
	public String getRepolicyNo() {
		return  this.repolicyNo;
	}
	public void setRepolicyNo(String repolicyNo) {
		this.repolicyNo = repolicyNo;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "startdate")
	public Date getStartDate() {
		return  this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "enddate")
	public Date getEndDate() {
		return  this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	@Column(name = "mainpremium")
	public BigDecimal getMainPremium() {
		return  this.mainPremium;
	}
	public void setMainPremium(BigDecimal mainPremium) {
		this.mainPremium = mainPremium;
	}
	
	@Column(name = "maininsurancenum")
	public BigDecimal getMainInsuranceNum() {
		return  this.mainInsuranceNum;
	}
	public void setMainInsuranceNum(BigDecimal mainInsuranceNum) {
		this.mainInsuranceNum = mainInsuranceNum;
	}
	
	@Column(name = "maininsurancecoverage")
	public BigDecimal getMainInsuranceCoverage() {
		return  this.mainInsuranceCoverage;
	}
	public void setMainInsuranceCoverage(BigDecimal mainInsuranceCoverage) {
		this.mainInsuranceCoverage = mainInsuranceCoverage;
	}
	
	@Column(name = "maininsuranceindemnity")
	public BigDecimal getMainInsuranceIndemnity() {
		return  this.mainInsuranceIndemnity;
	}
	public void setMainInsuranceIndemnity(BigDecimal mainInsuranceIndemnity) {
		this.mainInsuranceIndemnity = mainInsuranceIndemnity;
	}
	
	@Column(name = "addpremium")
	public BigDecimal getAddPremium() {
		return  this.addPremium;
	}
	public void setAddPremium(BigDecimal addPremium) {
		this.addPremium = addPremium;
	}
	
	@Column(name = "addinsurancenum")
	public BigDecimal getAddInsuranceNum() {
		return  this.addInsuranceNum;
	}
	public void setAddInsuranceNum(BigDecimal addInsuranceNum) {
		this.addInsuranceNum = addInsuranceNum;
	}
	
	@Column(name = "addinsurancecoverage")
	public BigDecimal getAddInsuranceCoverage() {
		return  this.addInsuranceCoverage;
	}
	public void setAddInsuranceCoverage(BigDecimal addInsuranceCoverage) {
		this.addInsuranceCoverage = addInsuranceCoverage;
	}
	
	@Column(name = "addinsuranceindemnity")
	public BigDecimal getAddInsuranceIndemnity() {
		return  this.addInsuranceIndemnity;
	}
	public void setAddInsuranceIndemnity(BigDecimal addInsuranceIndemnity) {
		this.addInsuranceIndemnity = addInsuranceIndemnity;
	}
	
	@Column(name = "addinsurancefranchiserate")
	public BigDecimal getAddInsuranceFranchiserate() {
		return  this.addInsuranceFranchiserate;
	}
	public void setAddInsuranceFranchiserate(BigDecimal addInsuranceFranchiserate) {
		this.addInsuranceFranchiserate = addInsuranceFranchiserate;
	}
	
	@Column(name = "addinsurancefranchisepremium")
	public BigDecimal getAddInsuranceFranchisepremium() {
		return  this.addInsuranceFranchisepremium;
	}
	public void setAddInsuranceFranchisepremium(
			BigDecimal addInsuranceFranchisepremium) {
		this.addInsuranceFranchisepremium = addInsuranceFranchisepremium;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
