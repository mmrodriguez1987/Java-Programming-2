/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mmrod
 */
public class Horse {
    private String name, color;
    private int birthyear, horseAge;         

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBirthyear() {
        return birthyear;
    }    
    
    public int getHorseAge() {
        return horseAge;
    }
    
    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }
    public Horse(){
       
    }
    
    public void calculateAge(){  
        this.horseAge =  Integer.valueOf(new SimpleDateFormat("yyyy").format(new Date())) - this.birthyear;
    }

}
