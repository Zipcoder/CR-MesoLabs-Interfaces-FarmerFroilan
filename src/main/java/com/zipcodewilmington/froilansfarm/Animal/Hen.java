package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Hen extends Chicken implements Produce{

    public FertilizedEgg fertilizedEgg = new FertilizedEgg();
    public EdibleEgg edibleEgg = new EdibleEgg();
    public boolean hasBeenFertilized = false;

    Hen hen;

    public Hen(){
        this.hen = new Hen();

    }

    @Override
    public String makeNoise() {
        return "L'Eggo my Eggo";
    }

    @Override
    public void eat() {

    }

    public Egg yields() {
        if(hen.hasBeenFertilized) {
            return fertilizedEgg;
        }
        return edibleEgg;
    }
}
