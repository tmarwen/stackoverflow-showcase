package com.github.tmarwen.stackoverflow.upload;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.*;

/**
 * @since 09/11/14.
 */
@Path("file-service")
public class FileUploadService
{

  @GET
  @Path("test")
  public Response testMethod()
  {
    return Response.ok("Hello Marwen").status(200).build();
  }

  @POST
  @Path("/upload")
  @Consumes(MediaType.MULTIPART_FORM_DATA)
  public Response uploadFile(
      @FormDataParam("file") InputStream uploadedInputStream,
      @FormDataParam("file") FormDataContentDisposition fileDetail)
  {

    String uploadedFileLocation = "/uploaded" + fileDetail.getFileName();
    writeToFile(uploadedInputStream, uploadedFileLocation);
    String output = "File uploaded to: " + uploadedFileLocation;
    return Response.ok(output).status(200)
        .header("Access-Control-Allow-Origin", "http://localhost:63342")
        .allow("OPTIONS")
        .build();
  }

  private void writeToFile(InputStream uploadedInputStream,
                           String uploadedFileLocation)
  {
    try
    {
      OutputStream out;
      int read;
      byte[] bytes = new byte[1024];

      out = new FileOutputStream(new File(uploadedFileLocation));
      while ((read = uploadedInputStream.read(bytes)) != -1)
      {
        out.write(bytes, 0, read);
      }
      out.flush();
      out.close();
    } catch (IOException e)
    {

      e.printStackTrace();
    }
  }
}
