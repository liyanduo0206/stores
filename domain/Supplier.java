package com.myshop.store.domain;

import com.myshop.store.utils.Content;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "supplier")
public class Supplier implements Serializable {

    private static final long serialVersionUID = -8428525666912991269L;

    @Id
    @GeneratedValue
    @Column(name = "supplier_id")
    private Integer supplierId;
    /**
     * 供应商名称
     */
    @Column(name = "slr_name")
    private String slrName;
    /**
     * 供应商简称
     */
    @Column(name = "slr_sname")
    private String slrSname;
    /**
     * 供应商编号
     */
    @Column(name = "slr_code")
    private String slrCode;
    /**
     * 供应商类型
     */
    @Column(name = "slr_type")
    private String slrType;
    /**
     * 二维码ID
     */
    @Column(name = "qr_code_id")
    private String qrCodeId;
    /**
     * 供应商状态
     */
    @Column(name = "slr_status")
    private String slrStatus;
    /**
     * 状态
     */
    private String status = Content.STATUS_EFFECTIVE;
    /**
     * 店铺
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "store_id")
    private Store store;
    /**
     * 人员
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "persion_id")
    private Persion persion;


    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSlrName() {
        return slrName;
    }

    public void setSlrName(String slrName) {
        this.slrName = slrName;
    }

    public String getSlrSname() {
        return slrSname;
    }

    public void setSlrSname(String slrSname) {
        this.slrSname = slrSname;
    }

    public String getSlrCode() {
        return slrCode;
    }

    public void setSlrCode(String slrCode) {
        this.slrCode = slrCode;
    }

    public String getSlrType() {
        return slrType;
    }

    public void setSlrType(String slrType) {
        this.slrType = slrType;
    }

    public String getQrCodeId() {
        return qrCodeId;
    }

    public void setQrCodeId(String qrCodeId) {
        this.qrCodeId = qrCodeId;
    }

    public String getSlrStatus() {
        return slrStatus;
    }

    public void setSlrStatus(String slrStatus) {
        this.slrStatus = slrStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Persion getPersion() {
        return persion;
    }

    public void setPersion(Persion persion) {
        this.persion = persion;
    }
}
