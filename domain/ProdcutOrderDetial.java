package com.myshop.store.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;
@Setter
@Getter
@Entity
@Table(name = "product_order_detial")
public class ProdcutOrderDetial implements Serializable {
    private static final long serialVersionUID = -8655640697553135238L;

    /**
     * 详细订单
     */
    @Id
    @GeneratedValue
    @Column(nullable = false, name = "order_detial_id")
    private Integer orderDetialId;
    /**
     * 数量
     */
    private int quantity;
    /**
     * 价格
     */
    @Column(name = "total_price")
    private double totalPrice;
    /**
     * 操作时间
     */
    private Date pdate;

    /**
     * 产品订单
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "order_id")
    private ProductOrder productOrder;
    /**
     * 产品
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "product_id")
    private Product product;

}
