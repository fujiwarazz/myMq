package com.peelsannaw.mq.service;

import com.peelsannaw.mq.entity.Order;

/**
 * @Author peelsannaw
 * @create 22/02/2023 15:04
 */
public class RepertoryService {

    public void inventoryReduction(Order order){
        String commodityId = order.getCommodityId();
        Integer count = order.getCount();
        System.out.println("Id 为 :["+commodityId+"]的商品库存减少["+count+"]个");
    }
}
