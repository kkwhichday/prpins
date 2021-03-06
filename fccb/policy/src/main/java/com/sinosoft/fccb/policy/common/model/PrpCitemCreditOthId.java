package com.sinosoft.fccb.policy.common.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class PrpCitemCreditOthId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String proposalNo;
	private Integer serialNo;

	public PrpCitemCreditOthId() {
	}

	@Column(name = "proposalno", nullable = false)
	public String getProposalNo() {
		return this.proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}

	@Column(name = "serialno", nullable = false)
	public Integer getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrpCitemCreditOthId))
			return false;
		PrpCitemCreditOthId castOther = (PrpCitemCreditOthId) other;

		return ((this.getProposalNo() == castOther.getProposalNo()) || (this
				.getProposalNo() != null
				&& castOther.getProposalNo() != null && this.getProposalNo()
				.equals(castOther.getProposalNo())))
				&& ((this.getSerialNo() == castOther.getSerialNo()) || (this
						.getSerialNo() != null
						&& castOther.getSerialNo() != null && this.getSerialNo()
						.equals(castOther.getSerialNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getProposalNo() == null ? 0 : this.getProposalNo()
						.hashCode());
		result = 37 * result
				+ (getSerialNo() == null ? 0 : this.getSerialNo().hashCode());
		return result;
	}

}

