package com.myshop.store.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * 促销规则
 */
@Data
@Entity
@Table(name = "sale_promotion")
public class SalePromotion implements Serializable {
    private static final long serialVersionUID = -5378577082142037080L;

    @Id
    @GeneratedValue
    @Column(name = "promotion_id")
    private Long promotionId;
    /**
     * 店铺ID
     */
    @Column(name = "store_id")
    private int storeId;
    /**
     * 促销活动编号
     */
    @Column(name = "ptn_code")
    private String ptnCode;
    /**
     * 促销活动名称
     */
    @Column(name = "ptn_name")
    private String ptnName;
    /**
     * 价格
     */
    @Column(name = "total_price")
    private double totalPrice;
    /**
     * 产品
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @Column(name = "product_id")
    private Product product;
    /**
     * 操作时间
     */
    private Date pdate;
    /**
     * 优惠活动
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "preferential_id")
    private Preferential preferential;
    /**
     * 人员
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "persion_id")
    private Persion persion;



}
