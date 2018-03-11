package com.myshop.store.domain;

import com.myshop.store.utils.Content;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * 优惠活动
 */
@Entity
@Table(name = "preferential")
public class Preferential implements Serializable {

    private static final long serialVersionUID = -2285153672128046376L;
    @Id
    @GeneratedValue
    @Column(nullable = false, name = "preferential_id")
    private Integer preferentialId;
    /**
     * 店铺ID
     */
    @Column(name = "store_id")
    private int storeId;
    /**
     * 店铺名称
     */
    private String name;
    /**
     * 优惠类型
     */
    private String type;
    /**
     * 价格
     */
    private double price;
    /**
     * 有效范围（local=本地 ，global=全局）
     */
    private String scope;
    /**
     * 状态
     */
    private String status = Content.STATUS_EFFECTIVE;
    /**
     * 排序
     */
    @Column(name = "order_index")
    private int orderIndex;
    /**
     * 优惠人员
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "preferential")
    private List<PreferentialPersion> preferentialPersion = new ArrayList<>();
    /**
     * 优惠规则
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "preferential")
    private List<SalePromotion> salePromotionnew = new ArrayList<>();

    public Integer getPreferentialId() {
        return preferentialId;
    }

    public void setPreferentialId(Integer preferentialId) {
        this.preferentialId = preferentialId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(int orderIndex) {
        this.orderIndex = orderIndex;
    }

    public List<PreferentialPersion> getPreferentialPersion() {
        return preferentialPersion;
    }

    public void setPreferentialPersion(List<PreferentialPersion> preferentialPersion) {
        this.preferentialPersion = preferentialPersion;
    }

    public List<SalePromotion> getSalePromotionnew() {
        return salePromotionnew;
    }

    public void setSalePromotionnew(List<SalePromotion> salePromotionnew) {
        this.salePromotionnew = salePromotionnew;
    }
}
