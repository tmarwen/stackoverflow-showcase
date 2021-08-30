package com.github.tmarwen.stackoverflow.gson.adapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author <a href="mailto:marouane.trab@gmail.com">Marouane Trabelsi</a>
 * @since 26/09/14
 */
public class GenericAdapter extends TypeAdapter<Object>
{
  @Override
  public void write(JsonWriter jsonWriter, Object o) throws IOException
  {
    jsonWriter.beginObject();
    for (Field field : o.getClass().getDeclaredFields())
    {
      Object fieldValue = runGetter(field, o);
      jsonWriter.name(field.getName());
      if (fieldValue == null)
      {
        jsonWriter.value("");
      }
      else {
        jsonWriter.value(fieldValue.toString());
      }
    }
    jsonWriter.endObject();
  }

  @Override
  public Object read(JsonReader jsonReader) throws IOException
  {
    /* Don't forget to add implementation here to have your Object back alive :) */
    return null;
  }

  /**
   * A generic field accessor runner.
   * Run the right getter on the field to get its value.
   * @param field
   * @param o {@code Object}
   * @return
   */
  public static Object runGetter(Field field, Object o)
  {
    // MZ: Find the correct method
    for (Method method : o.getClass().getMethods())
    {
      if ((method.getName().startsWith("get")) && (method.getName().length() == (field.getName().length() + 3)))
      {
        if (method.getName().toLowerCase().endsWith(field.getName().toLowerCase()))
        {
          try
          {
            return method.invoke(o);
          }
          catch (IllegalAccessException e)
          { }
          catch (InvocationTargetException e)
          { }
        }
      }
    }
    return null;
  }
}
