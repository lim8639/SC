package com.julien.pojo;

public class MyText {
    private String time;
    private String text;
    private String username;

    public MyText() {
    }

    public MyText(String time, String text, String username) {
        this.time = time;
        this.text = text;
        this.username = username;
    }

    public String getTime() {
        return time;
    }

    public String getText() {
        return text;
    }

    public String getUsername() {
        return username;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "MyText{" +
                "time='" + time + '\'' +
                ", com.julien.text='" + text + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
