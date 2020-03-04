package com.zipcodewilmington.froilansfarm.Production;

public class TomatoPlant extends Crop {


    public TomatoPlant() {

    }

    public Tomato yield() {
        if (this.getHasBeenFertilized()) {
            return new Tomato();
        } else {
            System.out.println("Tomato Plant not fertilized.");
            return null;
        }
    }

}
