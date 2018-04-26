package com.sinosoft.unwrt.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
//@Data
public class Customer {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Customer2> getCustomer2s() {
        return Customer2s;
    }

    public void setCustomer2s(List<Customer2> customer2s) {
        Customer2s = customer2s;
    }

    @Id

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String first_name;

    private String last_name;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    @org.hibernate.annotations.CreationTimestamp
    private Date createTime;

    @OneToMany(mappedBy="customer",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Customer2> Customer2s;


}
