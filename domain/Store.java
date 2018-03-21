package com.myshop.store.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;
@Setter
@Getter
@Entity
@Table(name = "store")
public class Store implements Serializable {
    private static final long serialVersionUID = -2639786222770744134L;

    /**
     * 店铺ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private Long storeId;
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


}
