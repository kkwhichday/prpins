package com.sinosoft.fccb.policy.common.model;


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpcsellerId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class PrpCopysellerId implements java.io.Serializable {

	// Fields

	private String applyNo;
	private Integer serialno;

	// Constructors

	/** default constructor */
	public PrpCopysellerId() {
	}

	/** full constructor */
	public PrpCopysellerId(String applyNo, Integer serialno) {
		this.applyNo = applyNo;
		this.serialno = serialno;
	}

	// Property accessors

	@Column(name = "applyno", nullable = false, length = 22)
	public String getApplyNo() {
		return this.applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	@Column(name = "serialno", nullable = false)
	public Integer getSerialno() {
		return this.serialno;
	}

	public void setSerialno(Integer serialno) {
		this.serialno = serialno;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrpCopysellerId))
			return false;
		PrpCopysellerId castOther = (PrpCopysellerId) other;

		return ((this.getApplyNo() == castOther.getApplyNo()) || (this
				.getApplyNo() != null
				&& castOther.getApplyNo() != null && this.getApplyNo()
				.equals(castOther.getApplyNo())))
				&& ((this.getSerialno() == castOther.getSerialno()) || (this
						.getSerialno() != null
						&& castOther.getSerialno() != null && this
						.getSerialno().equals(castOther.getSerialno())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getApplyNo() == null ? 0 : this.getApplyNo()
						.hashCode());
		result = 37 * result
				+ (getSerialno() == null ? 0 : this.getSerialno().hashCode());
		return result;
	}

}
