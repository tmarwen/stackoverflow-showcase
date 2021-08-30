package com.github.tmarwen.stackoverflow.gson.model;

import java.util.Date;

public class ObjectWithDate {

    private final Date date;

    public ObjectWithDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "ObjectWithDate{" +
                "date=" + date +
                '}';
    }
}
