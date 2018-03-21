package com.myshop.store.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 优惠成员
 */
@Setter
@Getter
@Entity
@Table(name = "preferential_persion")
public class PreferentialPersion implements Serializable {

    private static final long serialVersionUID = -954279589981715726L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "preferential_relano")
    private Long preferentialRelano;
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


}
