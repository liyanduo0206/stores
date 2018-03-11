package com.myshop.store.domain;


import com.myshop.store.utils.Content;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "picture_rela")
public class PictureRela implements Serializable {
    private static final long serialVersionUID = -115920855868907052L;

    /**
     * 图片ID
     */
    @Id
    @GeneratedValue
    private Integer relano;
    /**
     * 图片类型
     */
    @Column(name = "rela_type")
    private String relaType;
    /**
     * 关联表主键ID
     */
    @Column(name = "rela_id")
    private String relaId;
    /**
     * 图片状态
     */
    private String pteStatus = Content.STATUS_EFFECTIVE;
    /**
     * 操作人
     */
    private String operator;
    /**
     * 文件
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "file_id")
    private FileManage fileManage;

    public Integer getRelano() {
        return relano;
    }

    public void setRelano(Integer relano) {
        this.relano = relano;
    }

    public String getRelaType() {
        return relaType;
    }

    public void setRelaType(String relaType) {
        this.relaType = relaType;
    }

    public String getRelaId() {
        return relaId;
    }

    public void setRelaId(String relaId) {
        this.relaId = relaId;
    }

    public String getPteStatus() {
        return pteStatus;
    }

    public void setPteStatus(String pteStatus) {
        this.pteStatus = pteStatus;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public FileManage getFileManage() {
        return fileManage;
    }

    public void setFileManage(FileManage fileManage) {
        this.fileManage = fileManage;
    }
}
