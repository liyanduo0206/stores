package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * 产品订单
 */
@Entity
@Table(name = "product_order")
public class ProductOrder implements Serializable {
    private static final long serialVersionUID = 5867766077759252980L;

    /**
     * 产品订单
     */
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Integer orderId;
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public int getPersionId() {
        return persionId;
    }

    public void setPersionId(int persionId) {
        this.persionId = persionId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public List<ProdcutOrderDetial> getProdcutOrderDetial() {
        return prodcutOrderDetial;
    }

    public void setProdcutOrderDetial(List<ProdcutOrderDetial> prodcutOrderDetial) {
        this.prodcutOrderDetial = prodcutOrderDetial;
    }

    public QrCodeManage getQrCodeManage() {
        return qrCodeManage;
    }

    public void setQrCodeManage(QrCodeManage qrCodeManage) {
        this.qrCodeManage = qrCodeManage;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

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
