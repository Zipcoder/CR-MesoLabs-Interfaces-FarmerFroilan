package com.zipcodewilmington.froilansfarm.vehicles;


import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicles;
import com.zipcodewilmington.froilansfarm.mainFarm.Farm;

public abstract class Aircraft implements FarmVehicles {
    public void operate(Farm farm) {
    }

    public abstract void fly();

}
