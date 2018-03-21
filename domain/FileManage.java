package com.myshop.store.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Setter
@Getter
@Entity
@Table(name = "file_manage")
public class FileManage implements Serializable {
    private static final long serialVersionUID = -7170926887220308071L;

    /**
     * 文件ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_id")
    private Long fileId;
    /**
     * 文件类型
     */
    @Column(name = "file_type")
    private String fileType;
    /**
     * 文件名称
     */
    @Column(name = "file_name")
    private String fileName;
    /**
     * 文件原名称
     */
    @Column(name = "file_oldname")
    private String fileOldname;
    /**
     * 文件后缀
     */
    @Column(name = "file_suffix")
    private String fileSuffix;
    /**
     * 文件路径
     */
    @Column(name = "file_path")
    private String filePath;
    /**
     * 访问路径
     */
    @Column(name = "file_url")
    private String fileUrl;
    /**
     * 文件状态
     */
    @Column(name = "file_status")
    private String fileStatus;
    /**
     * 操作人
     */
    private String operator;
    /**
     * 操作时间
     */
    private Date pdate;

    /**
     * 图片关联
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileManage")
    private List<PictureRela> pictureRela = new ArrayList<>();
    /**
     * 条形码
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileManage")
    private List<BarCodeManage> barCodeManage = new ArrayList<>();
    /**
     * 二维码
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileManage")
    private List<QrCodeManage> qrCodeManage = new ArrayList<>();

}
