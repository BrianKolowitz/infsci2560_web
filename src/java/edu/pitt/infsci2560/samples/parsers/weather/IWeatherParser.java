/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.parsers.weather;

import edu.pitt.infsci2560.samples.beans.weather.models.Current;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author kolowitzbj
 */
public interface IWeatherParser {

    Current parseXml(String xml);
    
}
