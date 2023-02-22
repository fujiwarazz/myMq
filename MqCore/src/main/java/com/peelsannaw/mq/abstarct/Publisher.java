package com.peelsannaw.mq.abstarct;

/**
 * @Author peelsannaw
 * @create 22/02/2023 15:26
 */

import com.peelsannaw.mq.entity.Channel;
import com.peelsannaw.mq.entity.Message;

/**
 * 消息提供者
 * 1. 发布消息到channel
 * 2.
 */
public interface Publisher {

    void publishMessage(Message<?> message);

    void bindChannel(Channel channel);
}
