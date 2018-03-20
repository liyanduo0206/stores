package com.myshop.store.domain;

import com.myshop.store.utils.Content;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * 条形码管理
 */
@Getter
@Setter
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
    private Long barCodeId;
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


}
