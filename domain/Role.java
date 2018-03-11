package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 角色
 */
@Entity
@Table(name = "role")
public class Role implements Serializable {
    private static final long serialVersionUID = 1341583932651569776L;
    /**
     * 角色
     */
    @Id
    @GeneratedValue
    @Column(name = "role_id")
    private Integer roleId;
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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public List<PersionRole> getPersionRole() {
        return persionRole;
    }

    public void setPersionRole(List<PersionRole> persionRole) {
        this.persionRole = persionRole;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
