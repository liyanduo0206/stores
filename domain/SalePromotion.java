package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * 促销规则
 */
@Entity
@Table(name = "sale_promotion")
public class SalePromotion implements Serializable {
    private static final long serialVersionUID = -5378577082142037080L;

    @Id
    @GeneratedValue
    @Column(name = "promotion_id")
    private Integer promotionId;
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
     * 产品ID
     */
    @Column(name = "product_id")
    private int productId;
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

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getPtnCode() {
        return ptnCode;
    }

    public void setPtnCode(String ptnCode) {
        this.ptnCode = ptnCode;
    }

    public String getPtnName() {
        return ptnName;
    }

    public void setPtnName(String ptnName) {
        this.ptnName = ptnName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public Preferential getPreferential() {
        return preferential;
    }

    public void setPreferential(Preferential preferential) {
        this.preferential = preferential;
    }

    public Persion getPersion() {
        return persion;
    }

    public void setPersion(Persion persion) {
        this.persion = persion;
    }

    @Override
    public String toString() {
        return "SalePromotion{" +
                "promotionId=" + promotionId +
                ", storeId=" + storeId +
                ", ptnCode='" + ptnCode + '\'' +
                ", ptnName='" + ptnName + '\'' +
                ", totalPrice=" + totalPrice +
                ", productId=" + productId +
                ", pdate=" + pdate +
                ", preferential=" + preferential +
                ", persion=" + persion +
                '}';
    }
}
