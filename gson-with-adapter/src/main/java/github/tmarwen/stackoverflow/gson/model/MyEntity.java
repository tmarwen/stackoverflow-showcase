package github.tmarwen.stackoverflow.gson.model;

/**
 * Created by eXo Platform MEA on 26/09/14.
 *
 * @author <a href="mailto:mtrabelsi@exoplatform.com">Marwen Trabelsi</a>
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
