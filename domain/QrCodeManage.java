package com.myshop.store.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * 二维码
 */
@Setter
@Getter
@Entity
@Table(name = "qr_code_manage")
public class QrCodeManage implements Serializable {
    private static final long serialVersionUID = 695473794709077228L;
    /**
     * 二维码ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,name = "qr_code_id")
    private Long qrCodeId;
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


}
