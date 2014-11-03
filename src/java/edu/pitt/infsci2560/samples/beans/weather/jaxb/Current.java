/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.beans.weather.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

@XmlRootElement(name = "current")
public class Current {

    private City city;
    private Temperature temperature;
    private Humidity humidity;
    private Pressure pressure;
    private Wind wind;
    private Clouds clouds;
    private Visibility visibility;
    private Precipitation precipitation;
    private Weather weather;
    private LastUpdate lastupdate;
    
    public Current() {
        
    }

    /**
     * @return the city
     */
    public City getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    @XmlElement
    public void setCity(City city) {
        this.city = city;
    }

    /**
     * @return the temperature
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    @XmlElement
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the humidity
     */
    public Humidity getHumidity() {
        return humidity;
    }

    /**
     * @param humidity the humidity to set
     */
    @XmlElement
    public void setHumidity(Humidity humidity) {
        this.humidity = humidity;
    }

    /**
     * @return the pressure
     */
    public Pressure getPressure() {
        return pressure;
    }

    /**
     * @param pressure the pressure to set
     */
    @XmlElement
    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    /**
     * @return the wind
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * @param wind the wind to set
     */
    @XmlElement
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     * @return the clouds
     */
    public Clouds getClouds() {
        return clouds;
    }

    /**
     * @param clouds the clouds to set
     */
    @XmlElement
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    /**
     * @return the visibility
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * @param visibility the visibility to set
     */
    @XmlElement
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    /**
     * @return the precipitation
     */
    public Precipitation getPrecipitation() {
        return precipitation;
    }

    /**
     * @param precipitation the precipitation to set
     */
    @XmlElement
    public void setPrecipitation(Precipitation precipitation) {
        this.precipitation = precipitation;
    }

    /**
     * @return the weather
     */
    public Weather getWeather() {
        return weather;
    }

    /**
     * @param weather the weather to set
     */
    @XmlElement
    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    /**
     * @return the lastupdate
     */
    public LastUpdate getLastupdate() {
        return lastupdate;
    }

    /**
     * @param lastupdate the lastupdate to set
     */
    @XmlElement
    public void setLastupdate(LastUpdate lastupdate) {
        this.lastupdate = lastupdate;
    }
}
