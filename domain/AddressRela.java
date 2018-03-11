package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 地址关联
 */
@Entity
@Table(name = "address_rela")
public class AddressRela implements Serializable {

    private static final long serialVersionUID = -1600353225431752953L;
    @Id
    @GeneratedValue
    private long relano;

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

    public long getRelano() {
        return relano;
    }

    public void setRelano(long relano) {
        this.relano = relano;
    }

    public String getRelaType() {
        return relaType;
    }

    public void setRelaType(String relaType) {
        this.relaType = relaType;
    }

    public int getRelaId() {
        return relaId;
    }

    public void setRelaId(int relaId) {
        this.relaId = relaId;
    }

    public String getRelaStatus() {
        return relaStatus;
    }

    public void setRelaStatus(String relaStatus) {
        this.relaStatus = relaStatus;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
