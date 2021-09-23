package com.github.tmarwen.stackoverflow.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.Objects;

public class JsonToHtmlConverter {

    private final StringBuilder sb;

    public JsonToHtmlConverter() {
        this(new StringBuilder());
    }

    public JsonToHtmlConverter(StringBuilder sb) {
        this.sb = sb;
    }

    public void getJsonData(JsonObject jsonObject) throws IOException {
        jsonObject.keySet().forEach(key ->
        {
            Object value = jsonObject.get(key);
            if (value instanceof JsonObject) {
                try {
                    writeToHtmlFile("<" + key + ">");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    getJsonData((JsonObject) value);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    writeToHtmlFile("</" + key + ">");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("key " + key + " of value " + value + " is a JsonObject");
            } else if (value instanceof JsonArray) {
                try {
                    writeToHtmlFile("<" + key + ">");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("key " + key + " of value " + value + " is a JsonArray");
            } else {
                if (Objects.equals(key, "doctype")) {
                    try {
                        writeToHtmlFile("<!DOCTYPE " + value + ">");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (Objects.equals(key, "language")) {
                    try {
                        writeToHtmlFile("<html lang=" + value + ">");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        writeToHtmlFile("<" + key + ">");
                        writeToHtmlFile(value.toString());
                        writeToHtmlFile("</" + key + ">");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("key " + key + " of value " + value + " is an entry");
            }
        });
    }

    private void writeToHtmlFile(String s) throws IOException {
        sb.append(s);
    }

    public String getHtml() {
        return sb.toString();
    }
}
