package com.julien.pojo;

public class MyText {
    private String  text;
    private int id;
    private String username;
    private String date;

    public MyText() {
    }

    public MyText(String text, String username, String date) {
        this.text = text;
        this.username = username;
        this.date = date;
    }

    public MyText(String text, int id, String username, String date) {
        this.text = text;
        this.id = id;
        this.username = username;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "MyText{" +
                "text='" + text + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
