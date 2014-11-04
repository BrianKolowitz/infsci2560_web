/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.beans.weather.models;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author kolowitzbj
 */
 public class Wind {
     private Speed speed;
     private Direction direction;
     
     public Wind() { 
         
     }

    /**
     * @return the speed
     */
    public Speed getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    
    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    /**
     * @return the direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

        

        
    }
