package com.zipcodewilmington.froilansfarm.FoodAndAnimals;

import java.util.ArrayList;

public class CornStalk extends Crop{
    private EarOfCorn earOfCorn;


    public Object yield() {
        earOfCorn = new EarOfCorn();
        return earOfCorn;
    }
}
