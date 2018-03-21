package com.myshop.store.domain;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

/**
 * 地址关联
 */
@Data
@Entity
@Table(name = "address_rela")
public class AddressRela implements Serializable {

    private static final long serialVersionUID = -1600353225431752953L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long relano;

    /**
     * 关联表类型
     */
    @Column(name = "rela_type")
    private String relaType;
    /**
     * 关联表主键ID
     */
    @Column(nullable = false, name = "rela_id")
    private int relaId;
    /**
     * 状态
     */
    @Column(name = "rela_status")
    private String relaStatus;

    /**
     * 操作人
     */
    private String operator;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "address_id")
    private Address address;

}
