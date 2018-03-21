package com.myshop.store.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 产品详细参数
 */
@Setter
@Getter
@Entity
@Table(name = "prodcut_detial")
public class ProductDetial implements Serializable {
    private static final long serialVersionUID = 42316177934888807L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "product_relano")
    private Long productRelano;
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


}
