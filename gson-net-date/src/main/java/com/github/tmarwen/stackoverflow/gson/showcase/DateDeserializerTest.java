package com.github.tmarwen.stackoverflow.gson.showcase;

import com.github.tmarwen.stackoverflow.gson.deserializer.DateDeserializer;
import com.github.tmarwen.stackoverflow.gson.model.ObjectWithDate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;

/**
 * @author <a href="mailto:marouane.trab@gmail.com">Marouane Trabelsi</a>
 */
public class DateDeserializerTest {

    public static void main(String[] args) {
        final String input = "{\"date\":\"\\/Date(1630050818893+0300)\\/\"}";
        Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create();
        ObjectWithDate objectWithDate = gson.fromJson(input, ObjectWithDate.class);
        System.out.println(objectWithDate);

    }
}
