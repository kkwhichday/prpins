package com.sinosoft.fccb.policy.common.model;


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpcsellerId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class PrpcsellerId implements java.io.Serializable {

	// Fields

	private String proposalno;
	private Integer serialno;

	// Constructors

	/** default constructor */
	public PrpcsellerId() {
	}

	/** full constructor */
	public PrpcsellerId(String proposalno, Integer serialno) {
		this.proposalno = proposalno;
		this.serialno = serialno;
	}

	// Property accessors

	@Column(name = "proposalno", nullable = false, length = 22)
	public String getProposalno() {
		return this.proposalno;
	}

	public void setProposalno(String proposalno) {
		this.proposalno = proposalno;
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
		if (!(other instanceof PrpcsellerId))
			return false;
		PrpcsellerId castOther = (PrpcsellerId) other;

		return ((this.getProposalno() == castOther.getProposalno()) || (this
				.getProposalno() != null
				&& castOther.getProposalno() != null && this.getProposalno()
				.equals(castOther.getProposalno())))
				&& ((this.getSerialno() == castOther.getSerialno()) || (this
						.getSerialno() != null
						&& castOther.getSerialno() != null && this
						.getSerialno().equals(castOther.getSerialno())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getProposalno() == null ? 0 : this.getProposalno()
						.hashCode());
		result = 37 * result
				+ (getSerialno() == null ? 0 : this.getSerialno().hashCode());
		return result;
	}

}
