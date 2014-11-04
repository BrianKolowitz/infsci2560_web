/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.parsers.weather;

import edu.pitt.infsci2560.samples.beans.weather.models.*;
import edu.pitt.infsci2560.samples.beans.weather.models.*;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author kolowitzbj
 */
public class WeatherDomParser implements IWeatherParser {
    
    @Override
    public Current parseXml(String xml) {
        try {
            DocumentBuilderFactory factory =
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(xml)));    
            
            Current cur = new Current();
            Element rootXMLNode = document.getDocumentElement();
            
            Node cityNode = rootXMLNode.getElementsByTagName("city").item(0); // assume 1 city
            if ( cityNode != null ) {
                NamedNodeMap attributes = cityNode.getAttributes();
                City city = new City();
                city.setId(attributes.getNamedItem("id").getNodeValue());
                city.setName(attributes.getNamedItem("id").getNodeValue());
                
                for (Node child = cityNode.getFirstChild(); child != null; child = child.getNextSibling()) {
                    NamedNodeMap childAttributes = child.getAttributes();
                    if (child instanceof Element && "coord".compareToIgnoreCase(child.getNodeName()) == 0 ) {
                        Coord coord = new Coord();
                        coord.setLon(childAttributes.getNamedItem("lon").getNodeValue());
                        coord.setLat(childAttributes.getNamedItem("lat").getNodeValue());
                        city.setCoord(coord);
                    } else if (child instanceof Element && "sun".compareToIgnoreCase(child.getNodeName()) == 0 ) {
                        Sun sun = new Sun();
                        sun.setRise(childAttributes.getNamedItem("rise").getNodeValue());
                        sun.setSet(childAttributes.getNamedItem("set").getNodeValue());
                        city.setSun(sun);
                    } else if (child instanceof Element && "country".compareToIgnoreCase(child.getNodeName()) == 0 ) {
                        city.setCountry(child.getNodeValue());
                    }
                }
                
            }
            
            return cur;
        } catch (SAXException | IOException | ParserConfigurationException ex) {
            Logger.getLogger(WeatherDomParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Current();
    }
    
}
