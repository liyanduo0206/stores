package com.myshop.store.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 角色
 */
@Setter
@Getter
@Entity
@Table(name = "role")
public class Role implements Serializable {
    private static final long serialVersionUID = 1341583932651569776L;
    /**
     * 角色
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;
    /**
     * 角色编号
     */
    @Column(name = "role_code")
    private String roleCode;
    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;
    /**
     * 角色描述
     */
    @Column(name = "role_desc")
    private String roleDesc;
    /**
     * 操作人
     */
    private String operator;
    /**
     * 操作时间
     */
    private Date pdate;
    /**
     * 人员角色
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "role")
    private List<PersionRole> persionRole = new ArrayList<>();
    /**
     * 商店
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "store_id")
    private Store store;

}
