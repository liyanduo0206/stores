package com.myshop.store.domain;

import com.myshop.store.utils.Content;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * 优惠活动
 */
@Setter
@Getter
@Entity
@Table(name = "preferential")
public class Preferential implements Serializable {

    private static final long serialVersionUID = -2285153672128046376L;
    @Id
    @GeneratedValue
    @Column(nullable = false, name = "preferential_id")
    private Long preferentialId;
    /**
     * 店铺ID
     */
    @Column(name = "store_id")
    private Long storeId;
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


}
