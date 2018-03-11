package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dict_detial")
public class DictDetial implements Serializable {
    private static final long serialVersionUID = 3859426271150128225L;
    @Id
    @GeneratedValue
    @Column(name = "dict_detial_id")
    private Integer dictDetialId;
    /**
     * 编号
     */
    private String code;
    /**
     * 名称
     */
    private String name;
    /**
     * 值
     */
    private String valu;
    /**
     * 分组
     */
    private String grup;
    /**
     * 排序
     */
    private int orderIndex;
    /**
     * 字典
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "dict_id")
    private Dict dict;

    public Integer getDictDetialId() {
        return dictDetialId;
    }

    public void setDictDetialId(Integer dictDetialId) {
        this.dictDetialId = dictDetialId;
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

    public String getValu() {
        return valu;
    }

    public void setValu(String valu) {
        this.valu = valu;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public int getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(int orderIndex) {
        this.orderIndex = orderIndex;
    }

    public Dict getDict() {
        return dict;
    }

    public void setDict(Dict dict) {
        this.dict = dict;
    }
}
