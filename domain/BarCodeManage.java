package com.myshop.store.domain;

import com.myshop.store.utils.Content;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * 条形码管理
 */
@Entity
@Table(name = "bar_code_manage")
public class BarCodeManage implements Serializable {
    private static final long serialVersionUID = 5225361906998026083L;
    /**
     * 条形码ID
     */
    @Id
    @GeneratedValue
    @Column(nullable = false, name = "bar_code_id")
    private Integer barCodeId;
    /**
     * 条形码值
     */
    @Column(nullable = false, name = "bar_code_val")
    private String barCodeVal;

    /**
     * 条形码状态
     */
    private String status = Content.STATUS_EFFECTIVE;

    /**
     * 操作时间
     */
    private Date pdate;
    /**
     * 条形码类别
     */
    @Column(name = "bar_code_type")
    private String barCodeType;
    /**
     * 产品
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "barCodeManage")
    private List<Product> product = new ArrayList<>();
    /**
     * 文件
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "file_id")
    private FileManage fileManage;

    public Integer getBarCodeId() {
        return barCodeId;
    }

    public void setBarCodeId(Integer barCodeId) {
        this.barCodeId = barCodeId;
    }

    public String getBarCodeVal() {
        return barCodeVal;
    }

    public void setBarCodeVal(String barCodeVal) {
        this.barCodeVal = barCodeVal;
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

    public String getBarCodeType() {
        return barCodeType;
    }

    public void setBarCodeType(String barCodeType) {
        this.barCodeType = barCodeType;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public FileManage getFileManage() {
        return fileManage;
    }

    public void setFileManage(FileManage fileManage) {
        this.fileManage = fileManage;
    }
}
