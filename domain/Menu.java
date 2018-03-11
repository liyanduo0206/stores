package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "menu")
public class Menu implements Serializable {

    private static final long serialVersionUID = 5701388260096121441L;

    @Id
    @GeneratedValue
    @Column(nullable = false, name = "menu_id")
    private int menuId;

    @Column(name = "parent_id")
    private int parentId;
    /**
     * 店铺ID
     */
    @Column(name = "store_id")
    private int storeId;
    /**
     * 菜单名称
     */
    @Column(name = "menu_name")
    private String menuName;
    /**
     * 菜单编号
     */
    @Column(name = "menu_code")
    private String menuCode;
    /**
     * 简称
     */
    private String sname;
    /**
     * 请求地址
     */
    private String url;
    /**
     * 菜单状态
     */
    @Column(name = "menu_status")
    private String menuStatus;

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(String menuStatus) {
        this.menuStatus = menuStatus;
    }
}
