package com.zipcodewilmington.froilansfarm.vehicles;


import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicles;
import com.zipcodewilmington.froilansfarm.mainFarm.Farm;
import com.zipcodewilmington.froilansfarm.mainFarm.Field;

public abstract class Aircraft implements FarmVehicles {
    public Boolean isFlying;

    public void operate(Farm farm) {
    }

    public abstract Boolean fly(Field field);

    public abstract Boolean land();

}
