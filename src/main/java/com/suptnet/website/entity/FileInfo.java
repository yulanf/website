package com.suptnet.website.entity;

import java.util.Date;

public class FileInfo {

    private Integer id;
    private String filename;
    private Integer domain_num;
    private Date upload_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getDomain_num() {
        return domain_num;
    }

    public void setDomain_num(Integer domain_num) {
        this.domain_num = domain_num;
    }

    public Date getUpload_time() {
        return upload_time;
    }

    public void setUpload_time(Date upload_time) {
        this.upload_time = upload_time;
    }

}
