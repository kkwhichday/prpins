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

/**
 * PrpPitemAgri generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prppitem_agri")
public class PrpPitemAgri implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 标的序号 */
	private PrpPitemAgriId id;
	/** 批单申请号 */
	private PrpPhead prpPhead;
	/** 批单号 */
	private String endorseNo;
	/** 保单号 */
	private String policyNo;
	/** 险种代码 */
	private String riskCode;
	/** 经度起始值 */
	private String longitudeStart;
	/** 经度终止值 */
	private String longitudeEnd;
	/** 纬度起始值 */
	private String latitudeStart;
	/** 纬度终止值 */
	private String latitudeEnd;
	/** 单位生产成本 */
	private BigDecimal unitCost;
	/** 约定单价 */
	private BigDecimal unitPrice;
	/** 单位保险产量(公斤/亩) */
	private BigDecimal unitProduct;
	/** 树龄 */
	private BigDecimal itemAge;
	/** 林木实有密度(林木险)(株/亩) */
	private BigDecimal density;
	/** 标识码 */
	private String identifierCode;
	/** 备注 */
	private String remark;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpPitemAgri() {
	}

	/**       
	 * 标的序号
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno", nullable = false)),
			@AttributeOverride(name = "itemNo", column = @Column(name = "itemno", nullable = false)) })
	public PrpPitemAgriId getId() {
		return this.id;
	}

	public void setId(PrpPitemAgriId id) {
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
	 * 经度起始值
	 */

	@Column(name = "longitudestart")
	public String getLongitudeStart() {
		return this.longitudeStart;
	}

	public void setLongitudeStart(String longitudeStart) {
		this.longitudeStart = longitudeStart;
	}

	/**       
	 * 经度终止值
	 */

	@Column(name = "longitudeend")
	public String getLongitudeEnd() {
		return this.longitudeEnd;
	}

	public void setLongitudeEnd(String longitudeEnd) {
		this.longitudeEnd = longitudeEnd;
	}

	/**       
	 * 纬度起始值
	 */

	@Column(name = "latitudestart")
	public String getLatitudeStart() {
		return this.latitudeStart;
	}

	public void setLatitudeStart(String latitudeStart) {
		this.latitudeStart = latitudeStart;
	}

	/**       
	 * 纬度终止值
	 */

	@Column(name = "latitudeend")
	public String getLatitudeEnd() {
		return this.latitudeEnd;
	}

	public void setLatitudeEnd(String latitudeEnd) {
		this.latitudeEnd = latitudeEnd;
	}

	/**       
	 * 单位生产成本
	 */

	@Column(name = "unitcost")
	public BigDecimal getUnitCost() {
		return this.unitCost;
	}

	public void setUnitCost(BigDecimal unitCost) {
		this.unitCost = unitCost;
	}

	/**       
	 * 约定单价
	 */

	@Column(name = "unitprice")
	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**       
	 * 单位保险产量(公斤/亩)
	 */

	@Column(name = "unitproduct")
	public BigDecimal getUnitProduct() {
		return this.unitProduct;
	}

	public void setUnitProduct(BigDecimal unitProduct) {
		this.unitProduct = unitProduct;
	}

	/**       
	 * 树龄
	 */

	@Column(name = "itemage")
	public BigDecimal getItemAge() {
		return this.itemAge;
	}

	public void setItemAge(BigDecimal itemAge) {
		this.itemAge = itemAge;
	}

	/**       
	 * 林木实有密度(林木险)(株/亩)
	 */

	@Column(name = "density")
	public BigDecimal getDensity() {
		return this.density;
	}

	public void setDensity(BigDecimal density) {
		this.density = density;
	}

	/**       
	 * 标识码
	 */

	@Column(name = "identifiercode")
	public String getIdentifierCode() {
		return this.identifierCode;
	}

	public void setIdentifierCode(String identifierCode) {
		this.identifierCode = identifierCode;
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
