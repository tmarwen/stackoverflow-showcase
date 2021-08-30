package github.tmarwen.stackoverflow.rest.impl;

import github.tmarwen.stackoverflow.rest.WebApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Path;

/**
 * @author <a href="mailto:marouane.trab@gmail.com">Marouane Trabelsi</a>
 * @since 26/09/14
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
