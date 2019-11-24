package com.zipcodewilmington.froilansfarm.vehicles;


import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicles;
import com.zipcodewilmington.froilansfarm.mainFarm.Field;

public class CropDuster extends Aircraft implements FarmVehicles {

    public Boolean fly(Field field) {
        isFlying = true;
        return isFlying;
    }

    public Boolean land(){
        isFlying = false;
        return isFlying;
    }
}
