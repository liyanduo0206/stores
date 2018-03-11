package com.myshop.store.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
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

}
