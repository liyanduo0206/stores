package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * 品牌
 */
@Entity
@Table(name = "brand")
public class Brand implements Serializable {
    private static final long serialVersionUID = 3685671901885638100L;
    /**
     * 品牌
     */
    @Id
    @GeneratedValue
    @Column(name = "brand_id")
    private Integer brandId;
    /**
     * 品牌名称
     */
    @Column(name = "brd_name")
    private String brdName;

    /**
     * 品牌编号
     */
    @Column(name = "brd_code")
    private String brdCode;
    /**
     * 品牌描述
     */
    @Column(name = "brd_desc")
    private String brdDesc;
    /**
     * 备注
     */
    private String remark;
    /**
     * 产品
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "brand")
    private List<Product> product = new ArrayList<>();
    /**
     * 店铺
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "store_id")
    private Store store;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrdName() {
        return brdName;
    }

    public void setBrdName(String brdName) {
        this.brdName = brdName;
    }

    public String getBrdCode() {
        return brdCode;
    }

    public void setBrdCode(String brdCode) {
        this.brdCode = brdCode;
    }

    public String getBrdDesc() {
        return brdDesc;
    }

    public void setBrdDesc(String brdDesc) {
        this.brdDesc = brdDesc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
