package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Persion getPersion() {
        return persion;
    }

    public void setPersion(Persion persion) {
        this.persion = persion;
    }
}
