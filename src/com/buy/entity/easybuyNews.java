package com.buy.entity;

import org.apache.taglibs.standard.extra.spath.Step;

import java.io.Serializable;

/**
 * @Author:JoseZ
 * @Description:
 * @Date:Created in 2020/2/18 11:12
 * @Modified By:
 */
public class easybuyNews implements Serializable {
    private int id;
    private String title;
    private String content;
    private String createTime;
    //封装

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
