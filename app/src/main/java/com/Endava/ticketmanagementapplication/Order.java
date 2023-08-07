package com.Endava.ticketmanagementapplication;

public class Order {
    private String title;
    private String date;

    public Order(String title, String date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

}