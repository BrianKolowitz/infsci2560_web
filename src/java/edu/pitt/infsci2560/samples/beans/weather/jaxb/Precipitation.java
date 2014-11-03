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
public class Precipitation {

        private String mode;
        
        public Precipitation() {
            
        }

    /**
     * @return the mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * @param mode the mode to set
     */
    @XmlAttribute
    public void setMode(String mode) {
        this.mode = mode;
    }
    }