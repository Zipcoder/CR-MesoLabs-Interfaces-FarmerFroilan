package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Rideable{

    private boolean isMounted = false;

    public void eat(Edible food) {

    }

    public String makeNoise() {
        return null;
    }

    public boolean mounted() {
        isMounted = true;
        return isMounted;
    }

    public boolean dismounted() {
        isMounted = false;
        return isMounted;
    }

}
