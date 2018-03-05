package com.zipcodewilmington.froilansfarm.BuildingAndPlaces;

public class FarmHouse{
    private static FarmHouse ourInstance = new FarmHouse();

    public static FarmHouse getInstance() {
        return ourInstance;
    }

    private FarmHouse() {
    }
}
