package com.github.tmarwen.stackoverflow.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class JsonToHtmlTest {

    public static void main(String[] args) throws IOException {
        final JsonToHtmlConverter converter = new JsonToHtmlConverter();
        final InputStream is = converter.getClass().getClassLoader().getResourceAsStream("input.json");
        if (is != null) {
            final InputStreamReader reader = new InputStreamReader(is, StandardCharsets.UTF_8);
            final JsonElement jsonElement = JsonParser.parseReader(reader);
            converter.getJsonData(jsonElement.getAsJsonObject());
            System.out.println(converter.getHtml());
        }
    }
}
