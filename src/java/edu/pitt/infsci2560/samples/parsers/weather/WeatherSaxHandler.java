/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.parsers.weather;

import edu.pitt.infsci2560.samples.beans.weather.models.*;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
<current>
    <city id="2053426" name="Xidianzi">
        <coord lon="120" lat="40"/>
        <country>CN</country>
        <sun rise="2014-11-01T22:30:19" set="2014-11-02T08:56:48"/>
    </city>
    <temperature value="273.392" min="273.392" max="273.392" unit="kelvin"/>
    <humidity value="71" unit="%"/>
    <pressure value="1018.4" unit="hPa"/>
    <wind>
        <speed value="2.83" name="Light breeze"/>
        <direction value="263.01" code="W" name="West"/>
    </wind>
    <clouds value="0" name="clear sky"/>
    <visibility/>
    <precipitation mode="no"/>
    <weather number="800" value="Sky is Clear" icon="01n"/>
    <lastupdate value="2014-11-02T18:46:47"/>
</current>
*/
/**
 *
 * @author kolowitzbj
 */
public class WeatherSaxHandler extends DefaultHandler {
    private List<Current> curList = null;
    private Current cur = null;
    private boolean isCountry = false;
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
 
        if (qName.equalsIgnoreCase("Current")) {
            cur = new Current();
            if (getCurList() == null)
                curList = new ArrayList<>();
        } else if (qName.equalsIgnoreCase("city") ) {
            City city = cur.getCity();
            if ( cur.getCity() == null ) {
                city = new City();
                cur.setCity(city);
            }
            city.setId(attributes.getValue("id"));
            city.setName(attributes.getValue("name"));
        } else if (qName.equalsIgnoreCase("coord") ) {
            Coord coord = cur.getCity().getCoord();
            if ( coord == null ) {
                coord = new Coord();
                cur.getCity().setCoord(coord);
            }
            coord.setLon(attributes.getValue("lon"));
            coord.setLat(attributes.getValue("lat"));
            
        } else if ( qName.equalsIgnoreCase("country") ) {
            isCountry = true;
        } else if ( qName.equalsIgnoreCase("sun")) {
            Sun sun = cur.getCity().getSun();
            if ( sun == null ) {
                sun = new Sun();
                cur.getCity().setSun(sun);
            }
            sun.setRise(attributes.getValue("rise"));
            sun.setSet(attributes.getValue("set"));
        }
    }
 
 
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Current")) {
            curList.add(cur);
        } else if ( qName.equalsIgnoreCase("country") ) {
            isCountry = false;
        }
    }
    
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (isCountry) {
            cur.getCity().setCountry(new String(ch, start, length));
        }
    }


    /**
     * @return the curList
     */
    public List<Current> getCurList() {
        return curList;
    }
}
