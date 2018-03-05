package com.zipcodewilmington.froilansfarm.FoodAndAnimals;

public class CornStalk extends Crop{
    private EarOfCorn earOfCorn;


    public Object yield() {
        earOfCorn = new EarOfCorn();
        return earOfCorn;
    }

    public boolean hasBeenHarvested() {
        return false;
    }

    public boolean hasBeenFertilized() {
        return false;
    }
}
