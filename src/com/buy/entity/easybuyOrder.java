package com.buy.entity;

import java.io.Serializable;

/**
 * @Author:JoseZ
 * @Description:
 * @Date:Created in 2020/2/18 11:16
 * @Modified By:
 */
public class easybuyOrder implements Serializable {
    private int id;
    private int userId;
    private String loginName;
    private String userAddress;
    private   String createTime;
    private   float cost;
    private String serialNumber;
    //封装

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
