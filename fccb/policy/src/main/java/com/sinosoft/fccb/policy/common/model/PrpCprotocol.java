package com.sinosoft.fccb.policy.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="prpcprotocol")
public class PrpCprotocol implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** SerialNo */
	private String proposalNo;
	/** 投保单号码 */
	private PrpCmain prpCmain;
	/** 协议文本内容 */
	private String content;
	
	/**       
	 * 投保单号码
	 */
	@Id
	@Column(name = "proposalno", unique = true, nullable = false)
	public String getProposalNo() {
		return this.proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}
	/**       
	 * 投保单号码
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proposalno", unique = true, nullable = false, insertable = false, updatable = false)
	public PrpCmain getPrpCmain() {
		return this.prpCmain;
	}

	public void setPrpCmain(PrpCmain prpCmain) {
		this.prpCmain = prpCmain;
	}
	/**       
	 * 协议文本内容
	 */
	@Column(name = "content")
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
