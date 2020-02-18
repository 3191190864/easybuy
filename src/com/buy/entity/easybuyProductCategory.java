package com.buy.entity;

import java.io.Serializable;

/**
 * @Author:JoseZ
 * @Description:
 * @Date:Created in 2020/2/18 11:24
 * @Modified By:
 */
public class easybuyProductCategory implements Serializable {
    private int id;
    private String name;
    private int parentId;
    private  int type;
    private  String iconClass;
    //封装

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }
}
