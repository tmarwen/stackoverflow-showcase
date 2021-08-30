package com.github.tmarwen.stackoverflow.gson.model;

/**
 * @author <a href="mailto:marouane.trab@gmail.com">Marouane Trabelsi</a>
 * @since 26/09/14
 */
public class MyEntity
{
  private int id;
  private String name;
  private Long socialNumber;
  private MyInnerEntity innerEntity;

  public MyEntity(int id, String name, Long socialNumber, MyInnerEntity innerEntity)
  {
    this.id = id;
    this.name = name;
    this.socialNumber = socialNumber;
    this.innerEntity = innerEntity;
  }

  public int getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public Long getSocialNumber()
  {
    return socialNumber;
  }

  public MyInnerEntity getInnerEntity()
  {
    return innerEntity;
  }

  public static class MyInnerEntity {
    @Override
    public String toString()
    {
      return "whateverValue";
    }
  }
}
