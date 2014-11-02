package edu.pitt.infsci2560.samples.servlets.basics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kolowitzbj
 */
public class ServletConfig extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String mainEmail = getServletConfig().getInitParameter("mainEmail"); 
        String adminEmail = getServletConfig().getInitParameter("adminEmail");
        
        request.setAttribute("mainEmail", mainEmail);
        request.setAttribute("adminEmail", adminEmail);
   
        RequestDispatcher view = request.getRequestDispatcher("samples/config/displayConfig.jsp");            
        view.forward(request, response);
    }



    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
