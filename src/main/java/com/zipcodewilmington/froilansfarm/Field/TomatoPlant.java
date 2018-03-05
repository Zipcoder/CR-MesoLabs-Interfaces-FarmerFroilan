package com.zipcodewilmington.froilansfarm.Field;

public class TomatoPlant extends Crop {

    public Tomato tomato = new Tomato();

    public boolean hasBeenFertilized() {
        return false;
    }

    public boolean hasBeenHarvested() {
        return false;
    }

    public Object yields() {
        return tomato;
    }
}
