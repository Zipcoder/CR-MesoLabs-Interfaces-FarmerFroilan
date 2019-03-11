package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Pilot extends Person  {

    public void doMorningChores(Farm farm) {
        ArrayList<Horse> horses = farm.getHorses();

        for(Horse h : horses){
            mount(h);
            unmount(h);
            h.eat(new EarCorn());
            h.eat(new EarCorn());
            h.eat(new EarCorn());
        }
        eatBreakfast();
    }

    public void eatBreakfast() {
        eat(new EarCorn());
        eat(new Tomato());
        eat(new Tomato());
        eat(new Egg());
    }

    public String makeNoise() {
        return "Weeee!";
    }

    public void mount(Rideable rideable) {
            rideable.setRideStatus(true);
    }

    public void unmount(Rideable rideable) {
            rideable.setRideStatus(false);
    }

    public void mondayChores(Farm farm){
        doMorningChores(farm);
        CropDuster cropDuster=farm.getCropDuster();
        cropDuster.fly(farm.getField());
    }
}
