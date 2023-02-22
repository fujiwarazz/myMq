package com.peelsannaw.mq.abstarct;

import com.peelsannaw.mq.entity.Channel;
import com.peelsannaw.mq.entity.Message;

/**
 * @Author peelsannaw
 * @create 22/02/2023 15:26
 */
public interface Subscriber {

    /**
     * 订阅者是否对消息感兴趣,感兴趣就TODO
     * @param message 传递来的消息
     * @return flag
     */
    boolean isInteresting(Message<?> message);

    void handleAccept(Message<?> message);


    default void subscribeChannel(Channel channel){
        channel.bindSubscriber(this);
    }
}
