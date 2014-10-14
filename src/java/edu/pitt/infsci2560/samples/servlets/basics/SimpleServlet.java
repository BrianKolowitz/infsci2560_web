/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.servlets.basics;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;
// a simple servlet

public class SimpleServlet extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        super.init(config);//just accept the parent init

    }
    
    public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     *
     * @param req
     * @param rsp
     * @throws ServletException
     * @throws IOException
     */
    public void processRequest(HttpServletRequest req, 
            HttpServletResponse rsp) throws ServletException, IOException {
        String ms[] = {"one", "two", "three", "four", "five"};
        rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        out.println("<HTML><HEAD><TITLE>Simple</TITLE></HEAD><BODY>");
        for (int i = 1; i <= 5; i++) {
            out.println("<P>" + i + ". This is line " + ms[i - 1]);
        }
        out.close();
    }
}
