package com.sinosoft.unwrt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
//@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler", "fieldHandler","customer2"})
public class Customer3 implements java.io.Serializable{

    private Integer cid;

    private String first_name;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    @CreationTimestamp
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id",nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    public Customer2 getCustomer2() {
        return customer2;
    }

    public void setCustomer2(Customer2 customer2) {
        this.customer2 = customer2;
    }

    private String last_name;

    private Date createTime;



    private Customer2 customer2;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;
}
