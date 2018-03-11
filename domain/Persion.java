package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * 人员
 */
@Entity
@Table(name = "persion")
public class Persion implements Serializable {
    private static final long serialVersionUID = 137224713198393957L;

    /**
     * 人员ID
     */
    @Id
    @GeneratedValue
    @Column(nullable = false, name = "persion_id")
    private Integer persionId;
    /**
     * 人员编号
     */
    @Column(name = "pin_code")
    private String pinCode;
    /**
     * 条形码ID
     */
    @Column(name = "bar_code_id")
    private String barCodeId;
    /**
     * 二维码ID
     */
    @Column(name = "qr_code_id")
    private String qrCodeId;
    /**
     * 昵称
     */
    @Column(name = "nice_name")
    private String niceName;
    /**
     * 名称
     */
    @Column(name = "lase_name")
    private String laseName;
    /**
     * 姓
     */
    @Column(name = "first_name")
    private String firstName;
    /**
     * 微信号
     */
    @Column(name = "wecat_number")
    private String wecatNumber;
    /**
     * 身份证
     */
    private String sin;
    /**
     * 生日
     */
    private String birthoday;

    /**
     * 人员角色
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persion")
    private List<PersionRole> persionRole = new ArrayList<>();
    /**
     * 供应商的法人
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persion")
    private List<Supplier> supplier = new ArrayList<>();
    /**
     * 用户
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persion")
    private List<User> user = new ArrayList<>();
    /**
     * 优惠成员
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persion")
    private List<PreferentialPersion> preferentialPersion = new ArrayList<>();
    /**
     * 促销规则
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persion")
    private List<SalePromotion> salePromotion = new ArrayList<>();
    /**
     * 店铺
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "store_id")
    private Store store;

    public Integer getPersionId() {
        return persionId;
    }

    public void setPersionId(Integer persionId) {
        this.persionId = persionId;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getBarCodeId() {
        return barCodeId;
    }

    public void setBarCodeId(String barCodeId) {
        this.barCodeId = barCodeId;
    }

    public String getQrCodeId() {
        return qrCodeId;
    }

    public void setQrCodeId(String qrCodeId) {
        this.qrCodeId = qrCodeId;
    }

    public String getNiceName() {
        return niceName;
    }

    public void setNiceName(String niceName) {
        this.niceName = niceName;
    }

    public String getLaseName() {
        return laseName;
    }

    public void setLaseName(String laseName) {
        this.laseName = laseName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getWecatNumber() {
        return wecatNumber;
    }

    public void setWecatNumber(String wecatNumber) {
        this.wecatNumber = wecatNumber;
    }

    public String getSin() {
        return sin;
    }

    public void setSin(String sin) {
        this.sin = sin;
    }

    public String getBirthoday() {
        return birthoday;
    }

    public void setBirthoday(String birthoday) {
        this.birthoday = birthoday;
    }

    public List<PersionRole> getPersionRole() {
        return persionRole;
    }

    public void setPersionRole(List<PersionRole> persionRole) {
        this.persionRole = persionRole;
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

    public List<PreferentialPersion> getPreferentialPersion() {
        return preferentialPersion;
    }

    public void setPreferentialPersion(List<PreferentialPersion> preferentialPersion) {
        this.preferentialPersion = preferentialPersion;
    }

    public List<SalePromotion> getSalePromotion() {
        return salePromotion;
    }

    public void setSalePromotion(List<SalePromotion> salePromotion) {
        this.salePromotion = salePromotion;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
