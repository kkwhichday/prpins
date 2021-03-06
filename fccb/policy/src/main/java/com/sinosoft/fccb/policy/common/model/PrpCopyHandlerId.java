package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpCopyHandlerId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpCopyHandlerId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String applyNo;
	private String handlerCode;

	public PrpCopyHandlerId() {
	}

	@Column(name = "applyno", nullable = false)
	public String getApplyNo() {
		return this.applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	@Column(name = "handlercode", nullable = false)
	public String getHandlerCode() {
		return this.handlerCode;
	}

	public void setHandlerCode(String handlerCode) {
		this.handlerCode = handlerCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrpCopyHandlerId))
			return false;
		PrpCopyHandlerId castOther = (PrpCopyHandlerId) other;

		return ((this.getApplyNo() == castOther.getApplyNo()) || (this
				.getApplyNo() != null
				&& castOther.getApplyNo() != null && this.getApplyNo().equals(
				castOther.getApplyNo())))
				&& ((this.getHandlerCode() == castOther.getHandlerCode()) || (this
						.getHandlerCode() != null
						&& castOther.getHandlerCode() != null && this
						.getHandlerCode().equals(castOther.getHandlerCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getApplyNo() == null ? 0 : this.getApplyNo().hashCode());
		result = 37
				* result
				+ (getHandlerCode() == null ? 0 : this.getHandlerCode()
						.hashCode());
		return result;
	}

}
