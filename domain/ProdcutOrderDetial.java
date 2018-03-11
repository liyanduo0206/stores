package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

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

    public Integer getOrderDetialId() {
        return orderDetialId;
    }

    public void setOrderDetialId(Integer orderDetialId) {
        this.orderDetialId = orderDetialId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(ProductOrder productOrder) {
        this.productOrder = productOrder;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
