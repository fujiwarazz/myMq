package com.peelsannaw.mq.entity;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author peelsannaw
 * @create 22/02/2023 15:26
 */
public class Message<T> {

    private T data;
    private Class<T> dataType;

    private String title;
    private Date publishTime;
    private String topic = "ALL";


    public Class<T> getDataType() {
        return dataType;
    }

    public Message(T data) {
        this.data = data;
    }

    public static <U> Message<U> of(U data) {
        return new Message<U>(data);
    }

    public void setDataType(Class<T> dataType) {
        this.dataType = dataType;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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
