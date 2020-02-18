package com.buy.entity;

import java.io.Serializable;

/**
 * @Author:JoseZ
 * @Description:
 * @Date:Created in 2020/2/18 11:19
 * @Modified By:
 */
public class easybuyOrderDetaill implements Serializable {
    private int id;
    private int orderId;
    private int productId;
    private int quantity;
    private int cost;
    //封装

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
