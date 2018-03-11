package com.myshop.store.domain;

import com.myshop.store.utils.Content;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * 产品
 */
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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getPsname() {
        return psname;
    }

    public void setPsname(String psname) {
        this.psname = psname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPurchasingPrice() {
        return purchasingPrice;
    }

    public void setPurchasingPrice(double purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getEholesalePrice() {
        return eholesalePrice;
    }

    public void setEholesalePrice(double eholesalePrice) {
        this.eholesalePrice = eholesalePrice;
    }

    public String getPstatus() {
        return pstatus;
    }

    public void setPstatus(String pstatus) {
        this.pstatus = pstatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<ProdcutOrderDetial> getProdcutOrderDetial() {
        return prodcutOrderDetial;
    }

    public void setProdcutOrderDetial(List<ProdcutOrderDetial> prodcutOrderDetial) {
        this.prodcutOrderDetial = prodcutOrderDetial;
    }

    public List<ProductDetial> getProductDetial() {
        return productDetial;
    }

    public void setProductDetial(List<ProductDetial> productDetial) {
        this.productDetial = productDetial;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public BarCodeManage getBarCodeManage() {
        return barCodeManage;
    }

    public void setBarCodeManage(BarCodeManage barCodeManage) {
        this.barCodeManage = barCodeManage;
    }

    public QrCodeManage getQrCodeManage() {
        return qrCodeManage;
    }

    public void setQrCodeManage(QrCodeManage qrCodeManage) {
        this.qrCodeManage = qrCodeManage;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

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
