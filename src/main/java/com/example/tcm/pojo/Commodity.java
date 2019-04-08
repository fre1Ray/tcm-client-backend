package com.example.tcm.pojo;

import java.util.Date;

public class Commodity {
    private Integer id;
    private String comName;
    private Integer storeId;
    private Integer comIn;
    private Integer comOut;
    private Date createdAt;
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getComIn() {
        return comIn;
    }

    public void setComIn(Integer comIn) {
        this.comIn = comIn;
    }

    public Integer getComOut() {
        return comOut;
    }

    public void setComOut(Integer comOut) {
        this.comOut = comOut;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
