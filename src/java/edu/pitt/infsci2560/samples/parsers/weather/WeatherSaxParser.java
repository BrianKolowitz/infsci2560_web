/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.parsers.weather;

import edu.pitt.infsci2560.samples.beans.weather.models.Current;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author kolowitzbj
 */
public class WeatherSaxParser implements IWeatherParser {
    
    @Override
    public Current parseXml(String xml) {
        try {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();
            WeatherSaxHandler handler = new WeatherSaxHandler();
            saxParser.parse(new InputSource(new StringReader(xml)), handler);
            
            List<Current> curList = handler.getCurList();
            return curList.get(0);
            
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return new Current();
    }
    
}
