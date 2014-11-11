package com.github.tmarwen.stackoverflow.jetty;

import com.github.tmarwen.stackoverflow.upload.FileUploadService;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

/**
 * Created by marwen on 09/11/14.
 */
public class SimpleServer
{
  public static void main(String[] args) throws Exception {
    ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
    context.setContextPath("/");

    Server jettyServer = new Server(4343);
    jettyServer.setHandler(context);

    ServletHolder jerseyServlet = context.addServlet(ServletContainer.class, "/*");
    jerseyServlet.setInitOrder(0);

    // Tells the Jersey Servlet which REST service/class to load.
    jerseyServlet.setInitParameter(
        "com.sun.jersey.config.property.packages",
        FileUploadService.class.getPackage().getName());

    try {
      jettyServer.start();
      jettyServer.join();
    } finally {
      jettyServer.destroy();
    }
  }
}
