package github.tmarwen.stackoverflow.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by eXo Platform MEA on 23/09/14.
 *
 * @author <a href="mailto:mtrabelsi@exoplatform.com">Marwen Trabelsi</a>
 */
public interface WebApi
{
  @GET
  @Path("/{id}/")
  String getStuff(@PathParam("id") String id);
}

