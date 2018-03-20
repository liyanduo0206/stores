package com.myshop.store.domain;

import com.myshop.store.utils.Content;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "supplier")
public class Supplier implements Serializable {

    private static final long serialVersionUID = -8428525666912991269L;

    @Id
    @GeneratedValue
    @Column(name = "supplier_id")
    private Long supplierId;
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


}
