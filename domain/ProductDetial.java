package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 产品详细参数
 */
@Entity
@Table(name = "prodcut_detial")
public class ProductDetial implements Serializable {
    private static final long serialVersionUID = 42316177934888807L;


    @Id
    @GeneratedValue
    @Column(nullable = false, name = "product_relano")
    private Integer productRelano;
    /**
     * 材质
     */
    private String material;
    /**
     * 适用机型
     */
    @Column(name = "applicable_models")
    private String applicableModels;
    /**
     * 型号
     */
    private String model;
    /**
     * 尺寸
     */
    private String size;
    /**
     * 容量
     */
    private String capacity;

    /**
     * 产品
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "product_id")
    private Product product;

    public Integer getProductRelano() {
        return productRelano;
    }

    public void setProductRelano(Integer productRelano) {
        this.productRelano = productRelano;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getApplicableModels() {
        return applicableModels;
    }

    public void setApplicableModels(String applicableModels) {
        this.applicableModels = applicableModels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
