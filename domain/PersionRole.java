package com.myshop.store.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;
@Setter
@Getter
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

}
