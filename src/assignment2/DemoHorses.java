package assignment2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoHorses {
    public static RaceHorse myHorse;

    public static void main(String[] args) {
        myHorse = new RaceHorse();
        myHorse.setBirthyear(2016);
        myHorse.setColor("brown");
        myHorse.setName("Owaldo");
        myHorse.setRacerNumber(25);
        myHorse.calculateAge();
        writeOverview();
    }
    
    public static void writeOverview() {
        String txt = "The " + myHorse.getColor() + " horse called " + myHorse.getName() + 
               " with only " + myHorse.getHorseAge() +  " years old " +
               " has won " + myHorse.getRacerNumber() +
               " in his career.";
        System.out.print(txt);
        
       
    }
}
