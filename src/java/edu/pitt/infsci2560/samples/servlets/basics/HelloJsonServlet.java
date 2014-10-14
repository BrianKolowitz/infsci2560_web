/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.servlets.basics;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kolobj
 */

public class HelloJsonServlet extends HttpServlet {
 
  private String message;

  public void init() throws ServletException
  {
      // Do required initialization
      message = "{\"instructor\":{\"firstName\":\"Brian\",\"lastName\":\"Kolowitz\"},\"students\":[{\"firstName\":\"John\",\"lastName\":\"Doe\"},{\"firstName\":\"Jane\",\"lastName\":\"Smith\"},{\"firstName\":\"Donald\",\"lastName\":\"Duck\"},{\"firstName\":\"Mickey\",\"lastName\":\"Mouse\"}]}";
  }

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // Set response content type
      response.setContentType("application/json");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println(message);
  }
  
  public void destroy()
  {
      // do nothing.
  }
}