package com.sinosoft.fccb.policy.common.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PrpCmainCommon
 */
@Entity
@Table(name = "prpcmain_common")
public class PrpCmainCommon implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	/** 业务号码 修改为投保单号 addby xupp 20120831 */
	private String proposalNo;
	/** 投保单号码 */
	private PrpCmain prpCmain;
	/** 审核状态 :
	 * [1]标识佣金审核状态（0-初始值、1-待审核、2-通过、3-不通过），非车占用第15位。
	   [2]是否合并支付
       [3]省外异地（0-否，1-是）
       [4]统保标识（0-否，1-是）
       [5]投保单、保单、批单CBI标识,（0-否，1-是）
       [6]联共保上线后出单标志（0-否，1-是）
       [7]海外标志 （0-否，1-是）
       [8]小保单、发货登记是否使用大保单再保分保条件（0-否，1-是）
       [9]存储是否打折（1打折；0不打折）；
       [10]是否从联方理赔（0-否，1-是）
       [11]联保保单打回标志（0-否，1-是）
       [12]ZBM、ZDS产品电商清分的投保单数据（1-电商清分）
       [13]
       [14]地震标识（0-否，1-是）
       [15]标识当前业务是否为超上限业务。
       [16]是否上传山东预警系统（1-上传）

	 * */
	private String specialFlag;
	private String ext1;
	private String ext2;
	private String ext3;
	//RYANGQH2012111401 录单时增加推荐送修码的选项，并且根据出单员带出所关联的默认值 add by hanzhiwei 2013-01-07 begin
	/** 资源分配码 */
	private String resourceCode;
	/** 资源分配名称 */
	private String resourceName;
	//RYANGQH2012111401 录单时增加推荐送修码的选项，并且根据出单员带出所关联的默认值 add by hanzhiwei 2013-01-07 end
	private Date insertTimeForHis;
	private Date operateTimeForHis;
	//RZHANGT2012121202 新业务来源及周边系统接口变更 add by zhangzemin 2012-12-16 start
	/**** 新业务来源*/
	private String newBusinessNature;
	private String scmsAuditNotion;
	//RZHANGT2012121202 新业务来源及周边系统接口变更 add by zhangzemin 2012-12-16 end
	//RYANGQH2012122502 非车配合车险调整表结构 add by zhuq 2012-12-31 start
	private String pay_method;
	//RYANGQH2012122502 非车配合车险调整表结构 add by zhuq 2012-12-31 end
	//RLIUBIN2013061701 意外健康险各外接系统全面增加平台与项目标识 add by  wangxy 2013-08-12 begin
	private String platformProjectCode ;
	//RLIUBIN2013061701 意外健康险各外接系统全面增加平台与项目标识 add by  wangxy 2013-08-12 end
	//RZHANGT2014061201:“统一工号”系统改造，接口提供方改造 add by dongrui  2014-7-23 begin
	// 归属人集团代码
	private String handler1Code_uni;
	// 经办人集团代码
	private String handlerCode_uni;
	//RZHANGT2014061201:“统一工号”系统改造，接口提供方改造 add by dongrui  2014-7-23 end
	//RLIANGJZ2015082502_04 BFC、BFD、BFE、UBA、UBB、UBC产品联保业务核保流程调整 add by huangna 20151029 begin
	private String commonFlag;
	//RLIANGJZ2015082502_04 BFC、BFD、BFE、UBA、UBB、UBC产品联保业务核保流程调整 add by huangna 20151029 end
	//201607075-005,基本信息界面增加“个性产品名称”字段   add by guanyongliang 2016-09-13 begin
	/** 个性产品名称 */
	private String otherPolicyName;
	//201607075-005,基本信息界面增加“个性产品名称”字段   add by guanyongliang 2016-09-13 end
	public PrpCmainCommon(){
		
	}
	
	/**       
	 * 投保单号码
	 */
	@Id
	@Column(name = "proposalNo", unique = true, nullable = false)
	public String getProposalNo() {
		return proposalNo;
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
		return prpCmain;
	}

	public void setPrpCmain(PrpCmain prpCmain) {
		this.prpCmain = prpCmain;
	}
	
	/** 
	 * 审核状态 
	 */
	@Column(name = "specialflag")
	public String getSpecialFlag() {
		return specialFlag;
	}

	public void setSpecialFlag(String specialFlag) {
		this.specialFlag = specialFlag;
	}
	
	@Column(name = "ext1")
	public String getExt1() {
		return ext1;
	}

	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}
	
	@Column(name = "ext2")
	public String getExt2() {
		return ext2;
	}

	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}
	
	@Column(name = "ext3")
	public String getExt3() {
		return ext3;
	}

	public void setExt3(String ext3) {
		this.ext3 = ext3;
	}
	
	@Column(name = "inserttimeforhis", insertable = false, updatable = false)
	public Date getInsertTimeForHis() {
		return insertTimeForHis;
	}

	public void setInsertTimeForHis(Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}
	
	@Column(name = "operatetimeforhis", insertable = false)
	public Date getOperateTimeForHis() {
		return operateTimeForHis;
	}
	
	public void setOperateTimeForHis(Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}
	@Column(name = "scmsAuditNotion")
	public String getScmsAuditNotion() {
		return scmsAuditNotion;
	}

	public void setScmsAuditNotion(String scmsAuditNotion) {
		this.scmsAuditNotion = scmsAuditNotion;
	}
	@Column(name = "newBusinessNature")
	public String getNewBusinessNature() {
		return newBusinessNature;
	}

	public void setNewBusinessNature(String newBusinessNature) {
		this.newBusinessNature = newBusinessNature;
	}
	@Column(name = "pay_method")
	public String getPay_method() {
		return pay_method;
	}

	public void setPay_method(String pay_method) {
		this.pay_method = pay_method;
	}

	@Column(name = "resourceCode")
	public String getResourceCode() {
		return resourceCode;
	}

	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
	}
	
	@Column(name = "resourceName")
	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	
	@Column(name = "otherPolicyName")
	public String getOtherPolicyName() {
		return otherPolicyName;
	}

	public void setOtherPolicyName(String otherPolicyName) {
		this.otherPolicyName = otherPolicyName;
	}

	/**
	 * @function 
	 * @author 张泽民
	 * @日期：Apr 10, 2013
	 * @param source
	 * @param index
	 * @return void
	 */
	public void ssetSpecialFlagByIndex(char source,int index) {
		if(null==specialFlag){
			StringBuffer sb=new StringBuffer();
			for(int i=0;i<index;i++){
				sb.append(' ');
			}
			sb.append(source);
			this.specialFlag = sb.toString();
		}else{
			StringBuffer sb=new StringBuffer(specialFlag);
			int length=specialFlag.length();
			if((length-1)>=index){
				//RYANGQH2013032001 QAN、QAO、QDF、QEH CBI条款标志 增加标志位 modiy by zhuq 2013-4-16 start
				StringBuilder sbb=new StringBuilder(String.valueOf(source));
				//RYANGQH2013032001 QAN、QAO、QDF、QEH CBI条款标志 增加标志位 modiy by zhuq 2013-4-16 end
				sb.replace(index, index+1, sbb.toString());
			}else{
				for(int i=0;i<index-length;i++){
					sb.append(' ');
				}
				sb.append(source);
			}
			this.specialFlag = sb.toString();
		}
	}
	/**
	 * @function 
	 * @author 张泽民
	 * @日期：Apr 10, 2013
	 * @param index
	 * @return String
	 */
	public String ggetSpecialFlagByIndex(int index) {
		if((specialFlag.length()-1)>=index){
			return specialFlag.substring(index, index+1);
		}else{
			return null;
		}
	}

	@Column(name = "platformProjectCode")
	public String getPlatformProjectCode() {
		return platformProjectCode;
	}

	public void setPlatformProjectCode(String platformProjectCode) {
		this.platformProjectCode = platformProjectCode;
	}

	@Column(name = "handler1Code_uni")
	public String getHandler1Code_uni() {
		return handler1Code_uni;
	}

	public void setHandler1Code_uni(String handler1Code_uni) {
		this.handler1Code_uni = handler1Code_uni;
	}

	@Column(name = "handlerCode_uni")
	public String getHandlerCode_uni() {
		return handlerCode_uni;
	}

	public void setHandlerCode_uni(String handlerCode_uni) {
		this.handlerCode_uni = handlerCode_uni;
	}
    @Column(name = "commonFlag")
	public String getCommonFlag() {
		return commonFlag;
	}

	public void setCommonFlag(String commonFlag) {
		this.commonFlag = commonFlag;
	}
	/**
	 * @function 
	 * @author 黄娜
	 * @日期：2015-10-28
	 * @param source
	 * @param index
	 * @return void
	 */
	public void ssetCommonFlagByIndex(char source,int index) {
		if(null==commonFlag){
			StringBuffer sb=new StringBuffer();
			for(int i=0;i<index;i++){
				sb.append(' ');
			}
			sb.append(source);
			this.commonFlag = sb.toString();
		}else{
			StringBuffer sb=new StringBuffer(commonFlag);
			int length=commonFlag.length();
			if((length-1)>=index){
				StringBuilder sbb=new StringBuilder(String.valueOf(source));
				sb.replace(index, index+1, sbb.toString());
			}else{
				for(int i=0;i<index-length;i++){
					sb.append(' ');
				}
				sb.append(source);
			}
			this.commonFlag = sb.toString();
		}
	}
	/**
	 * @function 
	 * @author 黄娜
	 * @日期：2015-10-28
	 * @param index
	 * @return String
	 */
	public String ggetCommonFlagByIndex(int index) {
		if((commonFlag.length()-1)>=index){
			return commonFlag.substring(index, index+1);
		}else{
			return null;
		}
	}
	
}
