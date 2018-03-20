package com.myshop.store.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.*;
import java.util.*;

/**
 * 字典
 */
@Setter
@Getter
@Entity
@Table(name = "dict")
public class Dict implements Serializable {
    private static final long serialVersionUID = -5447317618546056944L;
    @Id
    @GeneratedValue
    @Column(nullable = false, name = "dict_id")
    private Long dictId;
    /**
     * 编号
     */
    private String code;
    /**
     * 名称
     */
    private String name;
    /**
     * 分组
     */
    private String grup;
    /**
     * 备注
     */
    private String remark;

    /**
     * 字典详细信息
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dict")
    private List<DictDetial> dictDetial = new ArrayList<>();

    /**
     * 店铺
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "store_id")
    private Store store;


}
