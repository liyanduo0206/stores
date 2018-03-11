package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * 二维码
 */
@Entity
@Table(name = "qr_code_manage")
public class QrCodeManage implements Serializable {
    private static final long serialVersionUID = 695473794709077228L;
    /**
     * 二维码ID
     */
    @Id
    @GeneratedValue
    @Column(nullable = false,name = "qr_code_id")
    private Integer qrCodeId;
    /**
     * 二维码值
     */
    @Column(nullable = false,unique =true,name = "qr_code_val")
    private String qrCodeVal;
    private String status = "1";
    private Date pdate;
    /**
     * 二维码类别
     */
    @Column(name = "qr_code_type")
    private String qrCodeType;

    /**
     * 产品
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "qrCodeManage")
    private List<Product> product = new ArrayList<>();
    /**
     * 产品订单
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "qrCodeManage")
    private List<ProductOrder> productOrder = new ArrayList<>();
    /**
     * 文件
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "file_id")
    private FileManage fileManage;

    public Integer getQrCodeId() {
        return qrCodeId;
    }

    public void setQrCodeId(Integer qrCodeId) {
        this.qrCodeId = qrCodeId;
    }

    public String getQrCodeVal() {
        return qrCodeVal;
    }

    public void setQrCodeVal(String qrCodeVal) {
        this.qrCodeVal = qrCodeVal;
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

    public String getQrCodeType() {
        return qrCodeType;
    }

    public void setQrCodeType(String qrCodeType) {
        this.qrCodeType = qrCodeType;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public List<ProductOrder> getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(List<ProductOrder> productOrder) {
        this.productOrder = productOrder;
    }

    public FileManage getFileManage() {
        return fileManage;
    }

    public void setFileManage(FileManage fileManage) {
        this.fileManage = fileManage;
    }
}
