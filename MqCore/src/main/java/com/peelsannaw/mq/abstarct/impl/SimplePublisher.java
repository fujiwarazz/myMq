package com.peelsannaw.mq.abstarct.impl;

import com.peelsannaw.mq.abstarct.Publisher;
import com.peelsannaw.mq.entity.Channel;
import com.peelsannaw.mq.entity.Message;

import java.util.HashSet;

/**
 * @Author peelsannaw
 * @create 22/02/2023 23:16
 */
public class SimplePublisher implements Publisher {

    private final HashSet<Channel>channels = new HashSet<>();

    @Override
    public void publishMessage(Message<?> message) {
        for (Channel channel : channels) {
            channel.receiveMessage(message);
        }
    }

    @Override
    public void bindChannel(Channel channel) {
        channels.add(channel);
    }
}
