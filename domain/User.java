package com.myshop.store.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Setter
@Getter
@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 4959683667179766336L;
    /**
     * 用户ID
     */
    @Id
    @GeneratedValue
    @Column(nullable = false, name = "user_id")
    private Integer userId;
    /**
     * 用户编号
     */
    @Column(name = "user_code")
    private String userCode;
    /**
     * 用户名称
     */
    @Column(name = "user_name")
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户状态
     */
    @Column(name = "user_status")
    private String userStatus;
    /**
     * 店铺
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "store_id")
    private Store store;
    /**
     * 人员
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "persion_id")
    private Persion persion;

}
