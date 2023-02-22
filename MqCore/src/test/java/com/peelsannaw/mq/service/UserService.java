package com.peelsannaw.mq.service;

import com.peelsannaw.mq.entity.Order;

import java.math.BigDecimal;

/**
 * @Author peelsannaw
 * @create 22/02/2023 15:04
 */
public class UserService {

    public void userPayment(Order order){
        String userName = order.getUserName();
        BigDecimal totalPrice = order.getTotalPrice();
        System.out.println("User["+userName+"] 支付了 ["+totalPrice.toString()+"]RMB");
    }
}
