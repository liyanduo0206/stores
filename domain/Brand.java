package com.myshop.store.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * 品牌
 */
@Setter
@Getter
@Entity
@Table(name = "brand")
public class Brand implements Serializable {
    private static final long serialVersionUID = 3685671901885638100L;
    /**
     * 品牌
     */
    @Id
    @GeneratedValue
    @Column(name = "brand_id")
    private Long brandId;
    /**
     * 品牌名称
     */
    @Column(name = "brd_name")
    private String brdName;

    /**
     * 品牌编号
     */
    @Column(name = "brd_code")
    private String brdCode;
    /**
     * 品牌描述
     */
    @Column(name = "brd_desc")
    private String brdDesc;
    /**
     * 备注
     */
    private String remark;
    /**
     * 产品
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "brand")
    private List<Product> product = new ArrayList<>();
    /**
     * 店铺
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "store_id")
    private Store store;

}
