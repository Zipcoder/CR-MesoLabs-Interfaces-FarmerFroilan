package com.zipcodewilmington.froilansfarm;

public class Vehicle implements NoiseMaker, Rideable{

    private boolean isMounted = false;

    public String makeNoise() {
        return "Vroom";
    }

    public boolean getIsMounted() {
        return isMounted;
    }

    public boolean mounted() {
        this.isMounted = true;
        return isMounted;
    }

    public boolean dismounted() {
        this.isMounted = false;
        return isMounted;
    }

}
