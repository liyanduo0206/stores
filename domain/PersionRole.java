package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "persion_role")
public class PersionRole implements Serializable {
    private static final long serialVersionUID = -1939412051999752057L;

    @Id
    @GeneratedValue
    @Column(nullable = false, name = "roleno")
    private Integer roleno;
    /**
     * 状态
     */
    private String status;
    /**
     * 操作时间
     */
    private Date pdate;
    /**
     * 人员
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "persion_id")
    private Persion persion;
    /**
     * 角色
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "role_id")
    private Role role;

    public Integer getRoleno() {
        return roleno;
    }

    public void setRoleno(Integer roleno) {
        this.roleno = roleno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public Persion getPersion() {
        return persion;
    }

    public void setPersion(Persion persion) {
        this.persion = persion;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
