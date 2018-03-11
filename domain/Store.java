package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "store")
public class Store implements Serializable {
    private static final long serialVersionUID = -2639786222770744134L;

    /**
     * 店铺ID
     */
    @Id
    @GeneratedValue
    @Column(name = "store_id")
    private Integer storeId;
    /**
     * 店铺名称
     */
    @Column(name = "ste_name")
    private String steName;
    /**
     * 店铺编号
     */
    @Column(name = "ste_code")
    private String steCode;
    /**
     * 经营状态
     */
    @Column(name = "ste_status")
    private String steStatus;
    /**
     * 状态
     */
    private String status;
    /**
     * 店铺介绍
     */
    private String introduction;
    @Column(name = "ste_desc")
    private String steDesc;
    /**
     * 备注
     */
    private String remark;
    /**
     * 人员
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "store")
    private List<Persion> persion = new ArrayList<>();
    /**
     * 地址
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "store")
    private List<Address> address = new ArrayList<>();
    /**
     * 角色
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "store")
    private List<Role> role = new ArrayList<>();
    /**
     * 供应商
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "store")
    private List<Supplier> supplier = new ArrayList<>();
    /**
     * 用户
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "store")
    private List<User> user = new ArrayList<>();
    /**
     * 字典
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "store")
    private List<Dict> dict = new ArrayList<>();
    /**
     * 产品
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "store")
    private List<Product> product = new ArrayList<>();
    /**
     * 订单
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "store")
    private List<ProductOrder> productOrder = new ArrayList<>();
    /**
     * 品牌
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "store")
    private List<Brand> brand = new ArrayList<>();

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getSteName() {
        return steName;
    }

    public void setSteName(String steName) {
        this.steName = steName;
    }

    public String getSteCode() {
        return steCode;
    }

    public void setSteCode(String steCode) {
        this.steCode = steCode;
    }

    public String getSteStatus() {
        return steStatus;
    }

    public void setSteStatus(String steStatus) {
        this.steStatus = steStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getSteDesc() {
        return steDesc;
    }

    public void setSteDesc(String steDesc) {
        this.steDesc = steDesc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<Persion> getPersion() {
        return persion;
    }

    public void setPersion(List<Persion> persion) {
        this.persion = persion;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    public List<Supplier> getSupplier() {
        return supplier;
    }

    public void setSupplier(List<Supplier> supplier) {
        this.supplier = supplier;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<Dict> getDict() {
        return dict;
    }

    public void setDict(List<Dict> dict) {
        this.dict = dict;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public List<ProductOrder> getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(List<ProductOrder> productOrder) {
        this.productOrder = productOrder;
    }

    public List<Brand> getBrand() {
        return brand;
    }

    public void setBrand(List<Brand> brand) {
        this.brand = brand;
    }
}
