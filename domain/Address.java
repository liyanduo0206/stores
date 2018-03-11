package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * 地址信息
 */
@Entity
@Table(name = "address")
public class Address implements Serializable {

    private static final long serialVersionUID = 5595096622891741150L;

    /**
     * 地址ID
     */
    @Id
    @GeneratedValue
    @Column(nullable = false, name = "address_id")
    private Integer addressId;
    /**
     * 国家
     */
    private String country;
    /**
     * 城市
     */
    private String city;
    /**
     * 县
     */
    private String state;
    /**
     * 街道
     */
    @Column(nullable = false)
    private String street;
    /**
     * 邮编
     */
    private String postal;
    /**
     * 手机
     */
    private String phone1;
    /**
     * 电话
     */
    private String phone2;
    /**
     * 邮件
     */
    private String email;
    /**
     * 地址状态
     */
    private String status;
    /**
     * 备注
     */
    private String remark;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "address")
    private List<AddressRela> address_rela;

    /**
     * 店铺
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "store_id")
    private Store store;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<AddressRela> getAddress_rela() {
        return address_rela;
    }

    public void setAddress_rela(List<AddressRela> address_rela) {
        this.address_rela = address_rela;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", street='" + street + '\'' +
                ", postal='" + postal + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", remark='" + remark + '\'' +
                ", store=" + store +
                '}';
    }
}
