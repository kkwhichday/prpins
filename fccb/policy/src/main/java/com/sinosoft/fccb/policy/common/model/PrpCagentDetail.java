package com.sinosoft.fccb.policy.common.model;

// Generated by Hibernate Tools 3.2.0.b9 (sinosoft version)

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

/**
 * Prpcagentdetail generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcagentdetail")
public class PrpCagentDetail implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 险别代码 */
	private PrpCagentDetailId id;
	/** 投保单号码 */
	private PrpCmain prpCmain;
	private String agreementNo;
	private String roleType;
	/** RoleName */
	private String roleName;
	/** 币别 */
	private String currency;
	/** 保费/储金 */
	private BigDecimal premium;
	private BigDecimal costFee;
	/** 备注 */
	private String remark;
	/** 标志字段 */
	private String flag;
	private Date insertTimeForHis;
	private Date operateTimeForHis;

	public PrpCagentDetail() {
	}

	/**       
	 * 险别代码
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "proposalNo", column = @Column(name = "proposalno")),
			@AttributeOverride(name = "rolecode", column = @Column(name = "rolecode")),
			@AttributeOverride(name = "payNo", column = @Column(name = "payno")),
			@AttributeOverride(name = "clauseCode", column = @Column(name = "clausecode")),
			@AttributeOverride(name = "kindCode", column = @Column(name = "kindcode")),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialNo"))})
	public PrpCagentDetailId getId() {
		return this.id;
	}

	public void setId(PrpCagentDetailId id) {
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

	@Column(name = "agreementno")
	public String getAgreementNo() {
		return this.agreementNo;
	}

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	@Column(name = "roletype")
	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	/**       
	 * RoleName
	 */

	@Column(name = "rolename")
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
	 * 保费/储金
	 */

	@Column(name = "premium")
	public BigDecimal getPremium() {
		return this.premium;
	}

	public void setPremium(BigDecimal premium) {
		this.premium = premium;
	}

	@Column(name = "costfee")
	public BigDecimal getCostFee() {
		return this.costFee;
	}

	public void setCostFee(BigDecimal costFee) {
		this.costFee = costFee;
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
	 * 标志字段
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
