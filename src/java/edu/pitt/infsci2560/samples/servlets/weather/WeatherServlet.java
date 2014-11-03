/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.servlets.weather;

import java.io.IOException;
import java.io.StringReader;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;



/**
 *
 * @author kolowitzbj
 */

public class WeatherServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        
        String latitude = request.getParameter("latitude");
        String longitude = request.getParameter("longitude");
        String unitType = request.getParameter("unitRadios");

        Client client;
        client = ClientBuilder.newClient();
        String url = String.format("http://api.openweathermap.org/data/2.5/weather?lat=%s&lon=%s&mode=xml",
                latitude,
                longitude);

        String xml = client.target(url)
            .request(MediaType.APPLICATION_XML)
            .get(String.class);

        if ( false ) {
            
            try {
                edu.pitt.infsci2560.samples.beans.weather.sax.Current cur = parseXml(xml);          
                
                request.setAttribute("current", cur);
                RequestDispatcher view = request.getRequestDispatcher("samples/weather/weather.jsp");
                view.forward(request, response);
            } catch (Exception ex) {
                Logger.getLogger(WeatherServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else { 
            
            try {
                edu.pitt.infsci2560.samples.beans.weather.jaxb.Current cur = 
                    (edu.pitt.infsci2560.samples.beans.weather.jaxb.Current)JAXBContext
                        .newInstance(edu.pitt.infsci2560.samples.beans.weather.jaxb.Current.class)
                        .createUnmarshaller()
                        .unmarshal(new StringReader(xml)); 
                
                request.setAttribute("current", cur);
                RequestDispatcher view = request.getRequestDispatcher("samples/weather/weather.jsp");
                view.forward(request, response);
            } catch (JAXBException ex) {
                Logger.getLogger(WeatherServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    protected edu.pitt.infsci2560.samples.beans.weather.sax.Current parseXml(String xml) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            WeatherHandler handler = new WeatherHandler();
            saxParser.parse(new InputSource(new StringReader(xml)), handler);
            
            List<edu.pitt.infsci2560.samples.beans.weather.sax.Current> curList = handler.getCurList();
            return curList.get(0);
            
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return null;
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
