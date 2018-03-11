package com.myshop.store.domain;

import javax.persistence.*;
import java.io.*;
import java.util.*;

/**
 * 字典
 */
@Entity
@Table(name = "dict")
public class Dict implements Serializable {
    private static final long serialVersionUID = -5447317618546056944L;
    @Id
    @GeneratedValue
    @Column(nullable = false, name = "dict_id")
    private Integer dictId;
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

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<DictDetial> getDictDetial() {
        return dictDetial;
    }

    public void setDictDetial(List<DictDetial> dictDetial) {
        this.dictDetial = dictDetial;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
