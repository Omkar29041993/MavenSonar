package com.spring;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author omkar
 */
@WebServlet("/bye")
public class HelloWorldServlet2 extends HttpServlet {

   private static final long serialVersionUID = 1L;

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
         throws ServletException, IOException {
      resp.setContentType("text/plain");
      resp.getWriter().write("Bye bye World! ");
   }
}