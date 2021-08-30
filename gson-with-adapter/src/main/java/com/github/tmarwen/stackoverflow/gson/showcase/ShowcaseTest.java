package com.github.tmarwen.stackoverflow.gson.showcase;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.github.tmarwen.stackoverflow.gson.adapter.GenericAdapter;
import com.github.tmarwen.stackoverflow.gson.model.MyEntity;

/**
 * @author <a href="mailto:marouane.trab@gmail.com">Marouane Trabelsi</a>
 * @since 26/09/14
 */
public class ShowcaseTest
{
  public static void main(String[] args)
  {
    Gson gson = new GsonBuilder().registerTypeAdapter(MyEntity.class, new GenericAdapter()).create();
    Object entity = new MyEntity(16, "entity", (long)123, new MyEntity.MyInnerEntity());
    String json = gson.toJson(entity);
    System.out.println(json);

    Object entity2 = new MyEntity(0, null, null, null);
    json = gson.toJson(entity2);
    System.out.println(json);
  }
}
