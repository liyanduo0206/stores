package com.myshop.store.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * 产品订单
 */
@Setter
@Getter
@Entity
@Table(name = "product_order")
public class ProductOrder implements Serializable {
    private static final long serialVersionUID = 5867766077759252980L;

    /**
     * 产品订单
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;
    /**
     * 人员ID
     */
    @Column(name = "persion_id")
    private int persionId;
    /**
     * 订单创建时间
     */
    @Column(name = "order_time")
    private Date orderTime;
    /**
     * 合计价格
     */
    @Column(name = "total_price")
    private double totalPrice;
    /**
     * 订单状态
     */
    @Column(name = "order_status")
    private String orderStatus;
    /**
     * 状态
     */
    private String status;
    /**
     * 操作时间
     */
    private Date pdate;
    /**
     * 订单详情
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productOrder")
    private List<ProdcutOrderDetial> prodcutOrderDetial = new ArrayList<>();
    /**
     * 二维码
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "qr_code_id")
    private QrCodeManage qrCodeManage;
    /**
     * 店铺
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "store_id")
    private Store store;



    @Override
    public String toString() {
        return "ProductOrder{" +
                "orderId=" + orderId +
                ", persionId=" + persionId +
                ", orderTime=" + orderTime +
                ", totalPrice=" + totalPrice +
                ", orderStatus='" + orderStatus + '\'' +
                ", status='" + status + '\'' +
                ", pdate=" + pdate +
                ", qrCodeManage=" + qrCodeManage +
                ", store=" + store +
                '}';
    }
}
