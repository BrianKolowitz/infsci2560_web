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
public class Sun {

            private String rise;
            private String set;
            
            public Sun () {
               
            }

            /**
             * @return the rise
             */
            public String getRise() {
                return rise;
            }

            /**
             * @param rise the rise to set
             */
            @XmlAttribute
            public void setRise(String rise) {
                this.rise = rise;
            }

            /**
             * @return the set
             */
            public String getSet() {
                return set;
            }

            /**
             * @param set the set to set
             */
            @XmlAttribute
            public void setSet(String set) {
                this.set = set;
            }
        }
