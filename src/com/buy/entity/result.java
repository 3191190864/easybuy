package com.buy.entity;

import java.io.Serializable;

/**
 * @Author:JoseZ
 * @Description:
 * @Date:Created in 2020/2/18 11:27
 * @Modified By:
 */
public class result implements Serializable {
    private String stuno;
    private String subjectName;
    private  int score;
    private int age;
    //封装

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
