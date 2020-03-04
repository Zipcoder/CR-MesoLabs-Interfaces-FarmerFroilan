package com.zipcodewilmington.froilansfarm.vehicle;


import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Rider;

import java.util.logging.Logger;

public class Tractor extends Vehicle implements FarmVehicle, Rideable {

    private static final Logger LOGGER = Logger.getLogger(Tractor.class.getName());

    private Rider rider;

    public Tractor(Rider rider){
        this.rider = rider;
    }

    public void operate(CropRow row) {
        if (!(rider instanceof Farmer)){
            //rider.crash();
        }
    }

    public void crash(){
        LOGGER.info("Oh no " + /*rider.getName()*/ " has crashed and died!");
        //rider.die();
    }

    public String makeNoise() {
        return " bum bum";

    }
}
