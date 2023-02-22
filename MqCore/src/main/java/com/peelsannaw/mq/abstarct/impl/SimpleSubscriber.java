package com.peelsannaw.mq.abstarct.impl;

import com.peelsannaw.mq.abstarct.Subscriber;
import com.peelsannaw.mq.entity.Channel;
import com.peelsannaw.mq.entity.Message;

/**
 * @Author peelsannaw
 * @create 22/02/2023 23:41
 */
public class SimpleSubscriber implements Subscriber {

    @Override
    public boolean isInteresting(Message<?> message) {
        return false;
    }

    @Override
    public void handleAccept(Message<?> message) {

    }


}
