/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.parsers.weather;

import edu.pitt.infsci2560.samples.beans.weather.models.Current;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 *
 * @author kolowitzbj
 */
public class WeatherJaxbParser implements IWeatherParser {
    @Override
    public Current parseXml(String xml) {
        try {
            return (Current)JAXBContext
                    .newInstance(Current.class)
                    .createUnmarshaller() 
                    .unmarshal(new StringReader(xml));
        } catch (JAXBException ex) {
            Logger.getLogger(WeatherJaxbParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Current();
    }
}
