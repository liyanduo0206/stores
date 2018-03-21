package com.myshop.store.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * 人员
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
@Entity
@Table(name = "persion")
public class Persion implements Serializable {
    private static final long serialVersionUID = 137224713198393957L;

    /**
     * 人员ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "persion_id")
    private Long persionId;
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

}
