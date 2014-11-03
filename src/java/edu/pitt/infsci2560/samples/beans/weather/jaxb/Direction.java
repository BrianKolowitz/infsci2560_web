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
public class Direction {

            private String value;
            private String code;
            private String Name;
            
            public Direction() {
                
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
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    @XmlAttribute
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    @XmlAttribute
    public void setName(String Name) {
        this.Name = Name;
    }
        }
