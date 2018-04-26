package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpCardSubId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpCardSubId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String businessNo;
	private String certiNo;
	private String certiType;
	private String payRefReason;
	private BigDecimal serialNo;

	public PrpCardSubId() {
	}

	@Column(name = "businessno", nullable = false)
	public String getBusinessNo() {
		return this.businessNo;
	}

	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}

	@Column(name = "certino", nullable = false)
	public String getCertiNo() {
		return this.certiNo;
	}

	public void setCertiNo(String certiNo) {
		this.certiNo = certiNo;
	}

	@Column(name = "certitype", nullable = false)
	public String getCertiType() {
		return this.certiType;
	}

	public void setCertiType(String certiType) {
		this.certiType = certiType;
	}

	@Column(name = "payrefreason", nullable = false)
	public String getPayRefReason() {
		return this.payRefReason;
	}

	public void setPayRefReason(String payRefReason) {
		this.payRefReason = payRefReason;
	}

	@Column(name = "serialno", nullable = false)
	public BigDecimal getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(BigDecimal serialNo) {
		this.serialNo = serialNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrpCardSubId))
			return false;
		PrpCardSubId castOther = (PrpCardSubId) other;

		return ((this.getBusinessNo() == castOther.getBusinessNo()) || (this
				.getBusinessNo() != null
				&& castOther.getBusinessNo() != null && this.getBusinessNo()
				.equals(castOther.getBusinessNo())))
				&& ((this.getCertiNo() == castOther.getCertiNo()) || (this
						.getCertiNo() != null
						&& castOther.getCertiNo() != null && this.getCertiNo()
						.equals(castOther.getCertiNo())))
				&& ((this.getCertiType() == castOther.getCertiType()) || (this
						.getCertiType() != null
						&& castOther.getCertiType() != null && this
						.getCertiType().equals(castOther.getCertiType())))
				&& ((this.getPayRefReason() == castOther.getPayRefReason()) || (this
						.getPayRefReason() != null
						&& castOther.getPayRefReason() != null && this
						.getPayRefReason().equals(castOther.getPayRefReason())))
				&& ((this.getSerialNo() == castOther.getSerialNo()) || (this
						.getSerialNo() != null
						&& castOther.getSerialNo() != null && this
						.getSerialNo().equals(castOther.getSerialNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getBusinessNo() == null ? 0 : this.getBusinessNo()
						.hashCode());
		result = 37 * result
				+ (getCertiNo() == null ? 0 : this.getCertiNo().hashCode());
		result = 37 * result
				+ (getCertiType() == null ? 0 : this.getCertiType().hashCode());
		result = 37
				* result
				+ (getPayRefReason() == null ? 0 : this.getPayRefReason()
						.hashCode());
		result = 37 * result
				+ (getSerialNo() == null ? 0 : this.getSerialNo().hashCode());
		return result;
	}

}