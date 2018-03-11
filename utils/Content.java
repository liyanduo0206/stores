package com.myshop.store.utils;


import java.io.Serializable;


public class Content implements Serializable {
    private static final long serialVersionUID = 5289548629644476289L;

    /**
     * 有效状态
     */
    public static final String STATUS_EFFECTIVE = "1";
    /**
     * 无效状态
     */
    public static final String STATUS_NON_EFFECTIVE = "0";
    /**
     * 本地
     */
    public static final String SCOPE_LOCAL = "LOCAL";
    /**
     * 全局
     */
    public static final String SCOPE_GLOBAL = "GLOBAL";

    public static final  String relatype_store="01";

    public static final  String relatype_product="02";

    public static final  String relatype_supplier="03";

    public static final  String relatype_persion="04";

    public static final  String relatype_address="05";

}
