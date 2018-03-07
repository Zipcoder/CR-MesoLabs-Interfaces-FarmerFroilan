package com.zipcodewilmington.froilansfarm;

public class Farmer implements Person, Rider, Botanist  {

    private Farm farm;

    public Farmer(Farm farm) {
        this.farm = farm;
    }

    public void plant(Crop Crop, CropRow cropRow) {

    }

    public void eat(Edible edible) {
        edible.eat();
    }

    public String makeNoise() {

        return null;
    }
    public void mount(Rideable rideable) {
        rideable.mount();
    }

    public void dismount(Rideable rideable) {
        rideable.dismount();
    }
}
