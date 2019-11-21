package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicles;
import com.zipcodewilmington.froilansfarm.mainFarm.Farm;
import com.zipcodewilmington.froilansfarm.people.Rider;

public class Tractor extends Vehicle implements FarmVehicles {
    private Rider currentRider;
    private Farm currentFarm;

    public void operate(Farm farm) {
        currentFarm = farm;
    }

    public String makeNoise() {
        return "tractor noises that kinda sound like aggressive heavy honks";
    }

    public Boolean riderRiding(Rider rider) {
        if(currentRider == null) {
            currentRider = rider;
            return true;
        }else {
            return false;
        }
    }

    public void dismount() {
        currentRider = null;

    }
}
