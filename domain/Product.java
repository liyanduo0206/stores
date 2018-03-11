package com.myshop.store.domain;

import com.myshop.store.utils.Content;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * 产品
 */
@Setter
@Getter
@Entity
@Table(name = "product")
public class Product implements Serializable {
    private static final long serialVersionUID = 4388951593373472701L;

    /**
     * 产品ID
     */
    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private Integer productId;
    /**
     * 产品编号
     */
    private String pcode;
    /**
     * 商品简称
     */
    private String psname;
    /**
     * 商品名称
     */
    private String pname;
    /**
     * 颜色
     */
    private String color;
    /**
     * 数量
     */
    private int quantity;
    /**
     * 进货价格
     */
    @Column(name = "purchasing_price")
    private double purchasingPrice;
    /**
     * 销售价格
     */
    @Column(name = "sale_price")
    private double salePrice;
    /**
     * 批发价格
     */
    @Column(name = "eholesale_price")
    private double eholesalePrice;
    /**
     * 产品状态
     */
    private String pstatus;
    /**
     * 状态
     */
    private String status = Content.STATUS_EFFECTIVE;
    /**
     * 产品描述
     */
    private String pdesc;
    /**
     * 备注
     */
    private String remark;
    /**
     * 订单详情
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProdcutOrderDetial> prodcutOrderDetial;
    /**
     * 订单
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductDetial> productDetial;

    /**
     * 店铺
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "store_id")
    private Store store;

    /**
     * 条形码
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "bar_code_id")
    private BarCodeManage barCodeManage;
    /**
     * 二维码
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "qr_code_id")
    private QrCodeManage qrCodeManage;
    /**
     * 品牌
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "brand_id")
    private Brand brand;


    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", pcode='" + pcode + '\'' +
                ", psname='" + psname + '\'' +
                ", pname='" + pname + '\'' +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                ", purchasingPrice=" + purchasingPrice +
                ", salePrice=" + salePrice +
                ", eholesalePrice=" + eholesalePrice +
                ", pstatus='" + pstatus + '\'' +
                ", status='" + status + '\'' +
                ", pdesc='" + pdesc + '\'' +
                ", remark='" + remark + '\'' +
                ", store=" + store +
                ", barCodeManage=" + barCodeManage +
                ", qrCodeManage=" + qrCodeManage +
                ", brand=" + brand +
                '}';
    }
}
