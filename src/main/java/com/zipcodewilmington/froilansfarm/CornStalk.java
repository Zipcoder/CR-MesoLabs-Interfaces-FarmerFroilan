package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop {
    public Edible yield()
    {
        return new EarCorn();
    }
}
