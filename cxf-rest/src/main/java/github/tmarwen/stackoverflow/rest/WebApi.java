package github.tmarwen.stackoverflow.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * @author <a href="mailto:marouane.trab@gmail.com">Marouane Trabelsi</a>
 * @since 26/09/14
 */
public interface WebApi
{
  @GET
  @Path("/{id}/")
  String getStuff(@PathParam("id") String id);
}

