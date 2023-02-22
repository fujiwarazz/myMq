package com.peelsannaw.mq.entity;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author peelsannaw
 * @create 22/02/2023 15:26
 */
public class Message<T> {

    private final T data;
    private final Class<T> dataType;

    private final String title;
    private final Date publishTime;
    private final String topic;


    public Class<T> getDataType() {
        return dataType;
    }

    public Message(T data,String title,String topic,Date publishTime) {
        this.data = data;
        this.topic = topic;
        this.dataType = (Class<T>) data.getClass();
        this.publishTime = publishTime;
        this.title = title;
    }

    public static <U> Message<U> of(U data,String title,String topic,Date publishTime) {
        return new Message<U>(data,title,topic,publishTime);
    }


    public T getData() {
        return data;
    }


    public String getTitle() {
        return title;
    }


    public Date getPublishTime() {
        return publishTime;
    }


    public String getTopic() {
        return topic;
    }


    @Override
    public String toString() {
        return "Message{" +
                "data=" + data +
                ", dataType=" + dataType +
                ", title='" + title + '\'' +
                ", publishTime=" + publishTime +
                ", topic='" + topic + '\'' +
                '}';
    }

}
