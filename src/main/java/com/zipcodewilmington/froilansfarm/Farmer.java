package com.zipcodewilmington.froilansfarm;

public class Farmer implements Person, Rider, Botanist  {
    public void plant(Crop Crop, CropRow cropRow) {

    }

    public void eat(Edible edible) {
        edible.eat();
    }

    public void makeNoise() {

    }
    public void mount(Rideable rideable) {
        rideable.mount();
    }

    public void dismount(Rideable rideable) {
        rideable.dismount();
    }
}
