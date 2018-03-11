package com.myshop.store.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "file_manage")
public class FileManage implements Serializable {
    private static final long serialVersionUID = -7170926887220308071L;

    /**
     * 文件ID
     */
    @Id
    @GeneratedValue
    @Column(name = "file_id")
    private Integer fileId;
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

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileOldname() {
        return fileOldname;
    }

    public void setFileOldname(String fileOldname) {
        this.fileOldname = fileOldname;
    }

    public String getFileSuffix() {
        return fileSuffix;
    }

    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public List<PictureRela> getPictureRela() {
        return pictureRela;
    }

    public void setPictureRela(List<PictureRela> pictureRela) {
        this.pictureRela = pictureRela;
    }

    public List<BarCodeManage> getBarCodeManage() {
        return barCodeManage;
    }

    public void setBarCodeManage(List<BarCodeManage> barCodeManage) {
        this.barCodeManage = barCodeManage;
    }

    public List<QrCodeManage> getQrCodeManage() {
        return qrCodeManage;
    }

    public void setQrCodeManage(List<QrCodeManage> qrCodeManage) {
        this.qrCodeManage = qrCodeManage;
    }
}
