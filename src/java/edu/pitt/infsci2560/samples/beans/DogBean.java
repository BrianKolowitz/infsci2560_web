/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.beans;

import javax.ejb.Stateless;

/**
 *
 * @author kolowitzbj
 */
@Stateless
public class DogBean { 
    private String breed;
    public DogBean() { this(null); }
    public DogBean(String breed) { this.breed = breed;} 
    public String getBreed() {
        return breed; }
}
