package com.myshop.store.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Setter
@Getter
@Entity
@Table(name = "dict_detial")
public class DictDetial implements Serializable {
    private static final long serialVersionUID = 3859426271150128225L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dict_detial_id")
    private Long dictDetialId;
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


}
