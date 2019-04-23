package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Silo;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;


public class Pilot extends Person implements Rider {

    public Pilot() {
        this.name = "Froilanda";
    }

    public String makeNoise() {
        return "I'm the best pilot ever!";
    }

    public void eatBreakfast(Silo silo){
        this.eat(silo.removeAnEarCorn());
        this.eat(silo.removeAnEarCorn());
        this.eat(silo.removeATomato());
        this.eat(silo.removeAnEgg());
        this.eat(silo.removeAnEgg());
    }

}
