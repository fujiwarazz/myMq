package com.peelsannaw.mq.entity;

import com.peelsannaw.mq.abstarct.Subscriber;

import java.util.Set;

/**
 * @Author peelsannaw
 * @create 22/02/2023 15:26
 */
public class Channel {

    private Set<Subscriber>subscribers;

    /**
     * 推送消息
     * @param message
     */
    public void pushMessage2Subscriber(Message<?> message) {

    }

    /**
     * 绑定关注
     * @param subscriber
     */
    public void bindSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

}
