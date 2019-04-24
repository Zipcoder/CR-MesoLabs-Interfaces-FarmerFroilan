package com.zipcodewilmington.froilansfarm.Field;

public class CornStalk extends Crop {

    public EarCorn earCorn = new EarCorn();

    public boolean hasBeenFertilized() {
        return false;
    }

    public boolean hasBeenHarvested() {
        return false;
    }

    @Override
    public Object yields() {
        return earCorn;
    }

}

