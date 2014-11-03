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
public class Pressure {

        private String value;
        private String unit;
        
        public Pressure() {
            
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
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    @XmlAttribute
    public void setUnit(String unit) {
        this.unit = unit;
    }
    }
