package com.myshop.store.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * 地址信息
 */
//Spring Boot在返回JSON的时候默认会返回null字段，这个对客户端一般没什么作用，还会增加服务器带宽压力。使用如下配置可以屏蔽。
@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
@Entity
@Table(name = "address")
public class Address implements Serializable {

    private static final long serialVersionUID = 5595096622891741150L;

    /**
     * 地址ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "address_id")
    private Long addressId;
    /**
     * 国家
     */
    private String country;
    /**
     * 城市
     */
    private String city;
    /**
     * 县
     */
    private String state;
    /**
     * 街道
     */
    @Column(nullable = false)
    private String street;
    /**
     * 邮编
     */
    private String postal;
    /**
     * 手机
     */
    private String phone1;
    /**
     * 电话
     */
    private String phone2;
    /**
     * 邮件
     */
    private String email;
    /**
     * 地址状态
     */
    private String status;
    /**
     * 备注
     */
    private String remark;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "address")
    private List<AddressRela> address_rela;

    /**
     * 店铺
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "store_id")
    private Store store;


    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", street='" + street + '\'' +
                ", postal='" + postal + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", remark='" + remark + '\'' +
                ", store=" + store +
                '}';
    }
}
