package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 优惠成员
 */
@Entity
@Table(name = "preferential_persion")
public class PreferentialPersion implements Serializable {

    private static final long serialVersionUID = -954279589981715726L;

    @Id
    @GeneratedValue
    @Column(nullable = false, name = "preferential_relano")
    private Integer preferentialRelano;
    /**
     * 排序
     */
    @Column(name = "order_index")
    private int orderIndex;
    /**
     * 状态
     */
    private String status;
    /**
     * 操作时间
     */
    private Date pdate;
    /**
     * 优惠活动
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "preferential_id")
    private Preferential preferential;
    /**
     * 人员
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "persion_id")
    private Persion persion;

    public Integer getPreferentialRelano() {
        return preferentialRelano;
    }

    public void setPreferentialRelano(Integer preferentialRelano) {
        this.preferentialRelano = preferentialRelano;
    }

    public int getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(int orderIndex) {
        this.orderIndex = orderIndex;
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

    public Preferential getPreferential() {
        return preferential;
    }

    public void setPreferential(Preferential preferential) {
        this.preferential = preferential;
    }

    public Persion getPersion() {
        return persion;
    }

    public void setPersion(Persion persion) {
        this.persion = persion;
    }
}
