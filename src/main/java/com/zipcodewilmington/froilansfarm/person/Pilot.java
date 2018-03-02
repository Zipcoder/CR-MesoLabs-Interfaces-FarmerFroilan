package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;


public class Pilot extends Person implements Rider {

    public Pilot() {
        this.name = "Froilanda";
    }

    public String makeNoise() {
        return "I'm the best pilot ever!";
    }

    public void eatBreakfast(){
        this.eat(Farm.getInstance().getFoodSilo().removeAnEarCorn());
        this.eat(Farm.getInstance().getFoodSilo().removeAnEarCorn());
        this.eat(Farm.getInstance().getFoodSilo().removeATomato());
        this.eat(Farm.getInstance().getFoodSilo().removeAnEgg());
        this.eat(Farm.getInstance().getFoodSilo().removeAnEgg());
    }

}
