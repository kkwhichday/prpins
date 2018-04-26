package com.sinosoft.fccb.policy.premiumcal.model;

// Generated by Hibernate Tools 3.2.0.b9 (sinosoft version)

import com.sinosoft.fccb.policy.premiumcal.model.UtiDecisionTableId;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * UtiDecisionTable generated by Tools.Don't edit.
 */
@Entity
@Table(name = "utidecisiontable", uniqueConstraints = @UniqueConstraint(columnNames = {
        "riskcode", "decisionno", "clausecode", "factorcode", "kindcode",
        "comcode" }))
public class UtiDecisionTable implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    /** 因子代码 */
    private UtiDecisionTableId id;
    /** 决策取值范围 */
    private String decisionScope;
    /** 默认值 */
    private String defaultValue;
    /** 条件1 */
    private String condition1;
    /** 条件2 */
    private String condition2;
    /** 条件3 */
    private String condition3;
    /** 条件4 */
    private String condition4;
    /** 条件5 */
    private String condition5;
    /** 条件6 */
    private String condition6;
    /** 条件7 */
    private String condition7;
    /** 条件8 */
    private String condition8;
    /** 条件9 */
    private String condition9;
    /** 条件10 */
    private String condition10;
    /** 创建人 */
    private String creatorCode;
    /** 最后修改人 */
    private String updaterCode;
    /** 生效日期 */
    private Date validDate;
    /** 失效日期 */
    private Date invalidDate;
    /** 有效标志 */
    private String validStatus;
    /** 标志字段 */
    private String flag;
    /** 备注 */
    private String remark;
    /** 插入时间 */
    private Date insertTimeForHis;
    /** 更新时间 */
    private Date operateTimeForHis;

    public UtiDecisionTable() {
    }

    /**
     * 因子代码
     */
    @EmbeddedId
    @AttributeOverrides( {
            @AttributeOverride(name = "decisionNo", column = @Column(name = "decisionno")),
            @AttributeOverride(name = "riskCode", column = @Column(name = "riskcode")),
            @AttributeOverride(name = "clauseCode", column = @Column(name = "clausecode")),
            @AttributeOverride(name = "kindCode", column = @Column(name = "kindcode")),
            @AttributeOverride(name = "comCode", column = @Column(name = "comcode")),
            @AttributeOverride(name = "factorCode", column = @Column(name = "factorcode")) })
    public UtiDecisionTableId getId() {
        return this.id;
    }

    public void setId(UtiDecisionTableId id) {
        this.id = id;
    }

    /**
     * 决策取值范围
     */

    @Column(name = "decisionscope")
    public String getDecisionScope() {
        return this.decisionScope;
    }

    public void setDecisionScope(String decisionScope) {
        this.decisionScope = decisionScope;
    }

    /**
     * 默认值
     */

    @Column(name = "defaultvalue")
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * 条件1
     */

    @Column(name = "condition1")
    public String getCondition1() {
        return this.condition1;
    }

    public void setCondition1(String condition1) {
        this.condition1 = condition1;
    }

    /**
     * 条件2
     */

    @Column(name = "condition2")
    public String getCondition2() {
        return this.condition2;
    }

    public void setCondition2(String condition2) {
        this.condition2 = condition2;
    }

    /**
     * 条件3
     */

    @Column(name = "condition3")
    public String getCondition3() {
        return this.condition3;
    }

    public void setCondition3(String condition3) {
        this.condition3 = condition3;
    }

    /**
     * 条件4
     */

    @Column(name = "condition4")
    public String getCondition4() {
        return this.condition4;
    }

    public void setCondition4(String condition4) {
        this.condition4 = condition4;
    }

    /**
     * 条件5
     */

    @Column(name = "condition5")
    public String getCondition5() {
        return this.condition5;
    }

    public void setCondition5(String condition5) {
        this.condition5 = condition5;
    }

    /**
     * 条件6
     */

    @Column(name = "condition6")
    public String getCondition6() {
        return this.condition6;
    }

    public void setCondition6(String condition6) {
        this.condition6 = condition6;
    }

    /**
     * 条件7
     */

    @Column(name = "condition7")
    public String getCondition7() {
        return this.condition7;
    }

    public void setCondition7(String condition7) {
        this.condition7 = condition7;
    }

    /**
     * 条件8
     */

    @Column(name = "condition8")
    public String getCondition8() {
        return this.condition8;
    }

    public void setCondition8(String condition8) {
        this.condition8 = condition8;
    }

    /**
     * 条件9
     */

    @Column(name = "condition9")
    public String getCondition9() {
        return this.condition9;
    }

    public void setCondition9(String condition9) {
        this.condition9 = condition9;
    }

    /**
     * 条件10
     */

    @Column(name = "condition10")
    public String getCondition10() {
        return this.condition10;
    }

    public void setCondition10(String condition10) {
        this.condition10 = condition10;
    }

    /**
     * 创建人
     */

    @Column(name = "creatorcode")
    public String getCreatorCode() {
        return this.creatorCode;
    }

    public void setCreatorCode(String creatorCode) {
        this.creatorCode = creatorCode;
    }

    /**
     * 最后修改人
     */

    @Column(name = "updatercode")
    public String getUpdaterCode() {
        return this.updaterCode;
    }

    public void setUpdaterCode(String updaterCode) {
        this.updaterCode = updaterCode;
    }

    /**
     * 生效日期
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "validdate")
    public Date getValidDate() {
        return this.validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    /**
     * 失效日期
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "invaliddate")
    public Date getInvalidDate() {
        return this.invalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }

    /**
     * 有效标志
     */

    @Column(name = "validstatus")
    public String getValidStatus() {
        return this.validStatus;
    }

    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus;
    }

    /**
     * 标志字段
     */

    @Column(name = "flag")
    public String getFlag() {
        return this.flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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