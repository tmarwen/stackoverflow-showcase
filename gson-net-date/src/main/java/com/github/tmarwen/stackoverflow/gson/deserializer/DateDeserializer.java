package com.github.tmarwen.stackoverflow.gson.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateDeserializer implements JsonDeserializer<Date> {

    private static final Pattern DATE_PATTERN = Pattern.compile("/Date\\((-?\\d+).*\\)/");

    @Override
    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        final Matcher matcher = DATE_PATTERN.matcher(jsonElement.getAsString());
        if (matcher.matches()) {
            final String timestamp = matcher.group(1);
            return new Date(Long.parseLong(timestamp));
        } else {
            throw new IllegalArgumentException(jsonElement.getAsString() + " does not match /Date(timestamp)/ pattern");
        }
    }
}
