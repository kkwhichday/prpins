package com.sinosoft.fccb.policy.common.model;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Prpcseller entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "prpcseller")
public class PrpCSeller implements java.io.Serializable {

	private PrpcsellerId id;
	private String policyno;
	private String chgfeeno;
	private String sellerno;
	private String sellercode;
	//RLIUBIN2014091801_07 “统一工号”外部系统接口改造 add by huoran 20140926	start
	private String sellercode_uni;
	//RLIUBIN2014091801_07 “统一工号”外部系统接口改造 add by huoran 20140926	end
	private String sellername;
	private String sellertype;
	private String businessnature;
	private String agentcode;
	private String agentname;
	private String payaccount;
	private String bankname;
	private String sellfeetype;
	private BigDecimal sellfeerate;
	private BigDecimal foresellfeerate;
	private BigDecimal sellfee;
	private String mainflag;
	private String batchflag;
	private Date inserttimeforhis;
	private Date operateTimeForHis;
	private String flag;

	// Constructors

	/** default constructor */
	public PrpCSeller() {
	}

	/** minimal constructor */
	public PrpCSeller(PrpcsellerId id, String policyno, String sellername,
			String sellertype, Timestamp inserttimeforhis,
			Timestamp operatetimeforhis) {
		this.id = id;
		this.policyno = policyno;
		this.sellername = sellername;
		this.sellertype = sellertype;
		this.inserttimeforhis = inserttimeforhis;
		this.operateTimeForHis = operatetimeforhis;
	}

	/** full constructor */
	public PrpCSeller(PrpcsellerId id, String policyno, String chgfeeno,
			String sellerno, String sellercode, String sellername,
			String sellertype, String businessnature, String agentcode,
			String agentname, String payaccount, String bankname,
			String sellfeetype, BigDecimal sellfeerate, BigDecimal foresellfeerate,
			BigDecimal sellfee, String mainflag, String batchflag,
			Timestamp inserttimeforhis, Timestamp operatetimeforhis, String flag) {
		this.id = id;
		this.policyno = policyno;
		this.chgfeeno = chgfeeno;
		this.sellerno = sellerno;
		this.sellercode = sellercode;
		this.sellername = sellername;
		this.sellertype = sellertype;
		this.businessnature = businessnature;
		this.agentcode = agentcode;
		this.agentname = agentname;
		this.payaccount = payaccount;
		this.bankname = bankname;
		this.sellfeetype = sellfeetype;
		this.sellfeerate = sellfeerate;
		this.foresellfeerate = foresellfeerate;
		this.sellfee = sellfee;
		this.mainflag = mainflag;
		this.batchflag = batchflag;
		this.inserttimeforhis = inserttimeforhis;
		this.operateTimeForHis = operatetimeforhis;
		this.flag = flag;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "proposalno", column = @Column(name = "proposalno", nullable = false, length = 22)),
			@AttributeOverride(name = "serialno", column = @Column(name = "serialno", nullable = false)) })
	public PrpcsellerId getId() {
		return this.id;
	}

	public void setId(PrpcsellerId id) {
		this.id = id;
	}

	@Column(name = "policyno", nullable = false, length = 22)
	public String getPolicyno() {
		return this.policyno;
	}

	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}

	@Column(name = "chgfeeno", length = 22)
	public String getChgfeeno() {
		return this.chgfeeno;
	}

	public void setChgfeeno(String chgfeeno) {
		this.chgfeeno = chgfeeno;
	}

	@Column(name = "sellerno", length = 25)
	public String getSellerno() {
		return this.sellerno;
	}

	public void setSellerno(String sellerno) {
		this.sellerno = sellerno;
	}

	@Column(name = "sellercode", length = 10)
	public String getSellercode() {
		return this.sellercode;
	}

	public void setSellercode(String sellercode) {
		this.sellercode = sellercode;
	}

	@Column(name = "sellername", nullable = false, length = 20)
	public String getSellername() {
		return this.sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	@Column(name = "sellertype", nullable = false, length = 4)
	public String getSellertype() {
		return this.sellertype;
	}

	public void setSellertype(String sellertype) {
		this.sellertype = sellertype;
	}

	@Column(name = "businessnature", length = 1)
	public String getBusinessnature() {
		return this.businessnature;
	}

	public void setBusinessnature(String businessnature) {
		this.businessnature = businessnature;
	}

	@Column(name = "agentcode", length = 12)
	public String getAgentcode() {
		return this.agentcode;
	}

	public void setAgentcode(String agentcode) {
		this.agentcode = agentcode;
	}

	@Column(name = "agentname", length = 120)
	public String getAgentname() {
		return this.agentname;
	}

	public void setAgentname(String agentname) {
		this.agentname = agentname;
	}

	@Column(name = "payaccount", length = 30)
	public String getPayaccount() {
		return this.payaccount;
	}

	public void setPayaccount(String payaccount) {
		this.payaccount = payaccount;
	}

	@Column(name = "bankname", length = 120)
	public String getBankname() {
		return this.bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	@Column(name = "sellfeetype", length = 3)
	public String getSellfeetype() {
		return this.sellfeetype;
	}

	public void setSellfeetype(String sellfeetype) {
		this.sellfeetype = sellfeetype;
	}

	@Column(name = "sellfeerate", precision = 8, scale = 4)
	public BigDecimal getSellfeerate() {
		return this.sellfeerate;
	}

	public void setSellfeerate(BigDecimal sellfeerate) {
		this.sellfeerate = sellfeerate;
	}

	@Column(name = "foresellfeerate", precision = 8, scale = 4)
	public BigDecimal getForesellfeerate() {
		return this.foresellfeerate;
	}

	public void setForesellfeerate(BigDecimal foresellfeerate) {
		this.foresellfeerate = foresellfeerate;
	}

	@Column(name = "sellfee", precision = 14)
	public BigDecimal getSellfee() {
		return this.sellfee;
	}

	public void setSellfee(BigDecimal sellfee) {
		this.sellfee = sellfee;
	}

	@Column(name = "mainflag", length = 1)
	public String getMainflag() {
		return this.mainflag;
	}

	public void setMainflag(String mainflag) {
		this.mainflag = mainflag;
	}

	@Column(name = "batchflag", length = 1)
	public String getBatchflag() {
		return this.batchflag;
	}

	public void setBatchflag(String batchflag) {
		this.batchflag = batchflag;
	}

	@Column(name = "inserttimeforhis", nullable = false, length = 3594)
	public Date getInserttimeforhis() {
		return this.inserttimeforhis;
	}

	public void setInserttimeforhis(Date inserttimeforhis) {
		this.inserttimeforhis = inserttimeforhis;
	}

	@Column(name = "operatetimeforhis", nullable = false, length = 3594)
	public Date getOperateTimeForHis() {
		return this.operateTimeForHis;
	}

	public void setOperateTimeForHis(Date operatetimeforhis) {
		this.operateTimeForHis = operatetimeforhis;
	}

	@Column(name = "flag", length = 10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	@Column(name = "sellercode_uni", length = 10)
	public String getSellercode_uni() {
		return sellercode_uni;
	}

	public void setSellercode_uni(String sellercode_uni) {
		this.sellercode_uni = sellercode_uni;
	}

}
