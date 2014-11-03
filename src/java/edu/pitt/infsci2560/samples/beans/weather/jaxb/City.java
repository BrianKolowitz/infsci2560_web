/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.beans.weather.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author kolowitzbj
 */
public class City {

        private String id;
        private String name;
        private Coord coord;
        private String country;
        private Sun sun;

        public City() {
            
        }
        /**
         * @return the id
         */
        public String getId() {
            return id;
        }

        /**
         * @param id the id to set
         */
        @XmlAttribute
        public void setId(String id) {
            this.id = id;
        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name the name to set
         */
        @XmlAttribute
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return the coord
         */
        public Coord getCoord() {
            return coord;
        }

        /**
         * @param coord the coord to set
         */
        @XmlElement
        public void setCoord(Coord coord) {
            this.coord = coord;
        }

        /**
         * @return the country
         */
        public String getCountry() {
            return country;
        }

        /**
         * @param country the country to set
         */
        @XmlElement
        public void setCountry(String country) {
            this.country = country;
        }

        /**
         * @return the sun
         */
        public Sun getSun() {
            return sun;
        }

        /**
         * @param sun the sun to set
         */
        @XmlElement
        public void setSun(Sun sun) {
            this.sun = sun;
        }

        

    }
