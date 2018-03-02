package com.zipcodewilmington.froilansfarm.animal;


import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    private boolean mounted = false;
    private boolean hasBeenRidden = false;

    public String makeNoise() {
        return "Neigh!";
    }

    public void ride() {
        this.mounted = true;
    }

    public void stopRiding() {
        this.hasBeenRidden = true;
        this.mounted = false;
    }


    public boolean getHasBeenRidden() {
        return hasBeenRidden;
    }


    public boolean getHasBeenMounted(){
        return mounted;
    }

    public void startOfDayReset(){
        this.hasBeenRidden = false;
        this.mounted = false;
        this.foodEaten.clear();
    }
}
