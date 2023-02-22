package com.peelsannaw.mq.entity;

import com.peelsannaw.mq.abstarct.Subscriber;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @Author peelsannaw
 * @create 22/02/2023 15:26
 */
public class Channel {

    private final String channelId;

    private final Set<Subscriber> subscribers = new HashSet<>();

    private volatile ConcurrentLinkedQueue<Message<?>> messages = new ConcurrentLinkedQueue<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Channel)) return false;

        Channel channel = (Channel) o;

        return channelId.equals(channel.channelId);
    }

    @Override
    public int hashCode() {
        return channelId.hashCode();
    }

    /**
     * 推送消息
     */
    public Channel(String ChannelId){
        this.channelId = ChannelId;

        this.pushMessage2Subscriber();
    }
    public void pushMessage2Subscriber() {
        Runnable runnable = () -> {
            try {
                while (true) {
                    if (messages.size() != 0) {
                        Message<?> top = messages.poll();
                        subscribers.stream().filter(item->item.isInteresting(top)).forEach(item->item.handleAccept(top));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        Thread s = new Thread(runnable);
        s.start();
    }

    public synchronized void receiveMessage(Message<?> message) {
        this.messages.add(message);
    }

    /**
     * 绑定关注
     *
     * @param subscriber
     */
    public void bindSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

}
