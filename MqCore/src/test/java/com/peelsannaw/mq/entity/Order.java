package com.peelsannaw.mq.entity;

import java.math.BigDecimal;

/**
 * @Author peelsannaw
 * @create 22/02/2023 15:03
 */
public class Order {
    String orderId;
    String commodityId;
    Integer count;
    BigDecimal totalPrice;
    String userName;

    public Order() {
    }
    public static Order Builder(){
        return new Order();
    }
    public Order(String orderId, String commodityId, Integer count, BigDecimal totalPrice, String userName) {
        this.orderId = orderId;
        this.commodityId = commodityId;
        this.count = count;
        this.totalPrice = totalPrice;
        this.userName = userName;
    }

    public String getOrderId() {
        return orderId;
    }

    public Order setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getCommodityId() {
        return commodityId;

    }

    public Order setCommodityId(String commodityId) {
        this.commodityId = commodityId;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public Order setCount(Integer count) {
        this.count = count;
        return this;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public Order setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public Order setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", commodityId='" + commodityId + '\'' +
                ", count=" + count +
                ", totalPrice=" + totalPrice +
                ", userName='" + userName + '\'' +
                '}';
    }
}
