/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.beans.weather.models;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author kolowitzbj
 */
public class Temperature {

        private String value;
        private String min;
        private String max;
        private String unit;
        
        public Temperature() {
            
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
         * @return the min
         */
        public String getMin() {
            return min;
        }

        /**
         * @param min the min to set
         */
        @XmlAttribute
        public void setMin(String min) {
            this.min = min;
        }

        /**
         * @return the max
         */
        public String getMax() {
            return max;
        }

        /**
         * @param max the max to set
         */
        @XmlAttribute
        public void setMax(String max) {
            this.max = max;
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
