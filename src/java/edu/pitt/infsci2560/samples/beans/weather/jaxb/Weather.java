/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.beans.weather.jaxb;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author kolowitzbj
 */
public class Weather {

        private String number;
        private String value;
        private String icon;
        
        public Weather() {
            
        }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    @XmlAttribute
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    @XmlAttribute
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    @XmlAttribute
    public void setIcon(String icon) {
        this.icon = icon;
    }
    }