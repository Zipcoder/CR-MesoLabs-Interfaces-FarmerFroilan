package com.zipcodewilmington.froilansfarm.vehicles;


import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicles;

public class CropDuster extends Aircraft implements FarmVehicles {

    public Boolean fly() {
        isFlying = true;
        return isFlying;
    }

    public Boolean land(){
        isFlying = false;
        return isFlying;
    }
}
