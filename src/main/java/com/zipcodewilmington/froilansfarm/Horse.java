package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.food.Edible;

public class Horse extends Animal implements Rideable{
    Rider rider;
    Boolean isMoving = false;
    Integer foodEaten = 0;

    public String makeNoise() {
        return "Neighhh!";
    }

    public void mount(Rider rider) {
        this.rider = rider;
    }

    public void dismount(){
        this.rider = null;
    }

    public void eat(Edible food) {
        if(!food.wasEaten()) {
            food.makeEaten();
            foodEaten++;
        }
    }

    public void gallop (){
        this.isMoving = true;
    }

    public Boolean isMoving() {
        return isMoving;
    }

    public Rider getRider() {
        return rider;
    }

    @Override
    public boolean isMounted() {
        return false;
    }
}
