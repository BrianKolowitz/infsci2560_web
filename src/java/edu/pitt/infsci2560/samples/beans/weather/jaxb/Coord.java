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
        public class Coord {

            private String lon;
            private String lat;

            public Coord() {
                
            }
            /**
             * @return the lon
             */
            public String getLon() {
                return lon;
            }

            /**
             * @param lon the lon to set
             */
            @XmlAttribute
            public void setLon(String lon) {
                this.lon = lon;
            }

            /**
             * @return the lat
             */
            public String getLat() {
                return lat;
            }

            /**
             * @param lat the lat to set
             */
            @XmlAttribute
            public void setLat(String lat) {
                this.lat = lat;
            }
        }