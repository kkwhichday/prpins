package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpCengageId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpCclauseId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String proposalNo;
	/** 条款编码 */
	private String clauseCode;

	public PrpCclauseId() {
	}

	@Column(name = "proposalno", nullable = false)
	public String getProposalNo() {
		return this.proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}

	@Column(name = "clausecode", nullable = false)
	public String getClauseCode() {
		return this.clauseCode;
	}

	public void setClauseCode(String clauseCode) {
		this.clauseCode = clauseCode;
	}

}
