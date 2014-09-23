package github.tmarwen.stackoverflow.rest.impl;

import github.tmarwen.stackoverflow.rest.WebApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Path;

/**
 * Created by eXo Platform MEA on 23/09/14.
 *
 * @author <a href="mailto:mtrabelsi@exoplatform.com">Marwen Trabelsi</a>
 */
@Path("/web")
public class WebApiServer implements WebApi
{
  private final Logger logger = LoggerFactory.getLogger(getClass());

  public String getStuff(String id)
  {
    logger.info("get called with args {}", id);
    return id != null ? id : "Successfully Invoked...";
  }
}
