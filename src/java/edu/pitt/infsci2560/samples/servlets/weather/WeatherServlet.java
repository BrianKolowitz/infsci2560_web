/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.servlets.weather;

import edu.pitt.infsci2560.samples.beans.weather.models.Current;
import edu.pitt.infsci2560.samples.parsers.weather.IWeatherParser;
import edu.pitt.infsci2560.samples.parsers.weather.WeatherSaxParser;
import edu.pitt.infsci2560.samples.parsers.weather.WeatherJaxbParser;
import edu.pitt.infsci2560.samples.parsers.weather.WeatherDomParser;
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
        String url = String.format("http://api.openweathermap.org/data/2.5/weather?lat=%s&lon=%s&mode=xml&units=%s",
                latitude,
                longitude,
                "celsius".compareToIgnoreCase(unitType) == 0 ? "metric" : "imperial");

        String xml = client.target(url)
            .request(MediaType.APPLICATION_XML)
            .get(String.class);
        
        
        final String SAX_PARSER = "sax";
        final String JAXB_PARSER = "jaxb";
        final String DOM_PARSER = "dom";
        
        String currentParser = DOM_PARSER; // todo : inject parser using JNDI
        
        IWeatherParser parser = null;
        if ( currentParser.compareToIgnoreCase(SAX_PARSER) == 0 ) {
            parser = new WeatherSaxParser();
        } else if (currentParser.compareToIgnoreCase(JAXB_PARSER) == 0 ) { 
            parser = new WeatherJaxbParser();
        } else if ( currentParser.compareToIgnoreCase(DOM_PARSER) == 0 ) {
            parser = new WeatherDomParser();
        }
        
        if ( parser != null ) {
            Current cur = parser.parseXml(xml);
            request.setAttribute("current", cur);
        }
        
        RequestDispatcher view = request.getRequestDispatcher("samples/weather/weather.jsp");
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
