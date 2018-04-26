package com.sinosoft.fccb.migrate.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
//@JsonIgnoreProperties(value = {"customer"})
public class Customer2 implements java.io.Serializable{

    private Integer cid;

    private String first_name;

    private String last_name;

    private Date createTime;

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
    @org.hibernate.annotations.CreationTimestamp
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id",nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @OneToMany(mappedBy="customer2",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    public List<Customer3> getCustomer3s() {
        return Customer3s;
    }

    public void setCustomer3s(List<Customer3> customer3s) {
        Customer3s = customer3s;
    }



    private Customer customer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;

    private List<Customer3> Customer3s;


}
