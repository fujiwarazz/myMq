package com.peelsannaw.mq.service;

import com.peelsannaw.mq.abstarct.Publisher;
import com.peelsannaw.mq.entity.Message;
import com.peelsannaw.mq.entity.Order;

import java.math.BigDecimal;

/**
 * @Author peelsannaw
 * @create 22/02/2023 15:03
 */
public class OrderService {

    private final Publisher publisher;

    public OrderService(Publisher publisher) {
        this.publisher = publisher;
    }

    public void place(String orderId, String commodityId, Integer count, BigDecimal totalPrice, String userName) {

        Order order = Order.Builder().setOrderId(orderId)
                .setCommodityId(commodityId)
                .setCount(count)
                .setTotalPrice(totalPrice)
                .setUserName(userName);
        publisher.publicMessage(Message.<Order>of(order));
//        repertoryService.inventoryReduction(order);
//        userService.userPayment(order);
    }
}
