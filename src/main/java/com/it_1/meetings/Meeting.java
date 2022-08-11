package com.it_1.meetings;

import java.util.Objects;

public class Meeting {
    private String time;
    private String data;
    private String topic;

    public Meeting(String time, String topic, String data) {
        this.time = time;
        this.topic = topic;
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public String getTopic() {
        return topic;
    }

    public String getData() {
        return data;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meeting meeting = (Meeting) o;
        return time == meeting.time && data.equals(meeting.data) && topic.equals(meeting.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, data, topic);
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "time=" + time +
                ", data='" + data + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
