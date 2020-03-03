package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import com.zipcodewilmington.froilansfarm.person.Rider;

import java.util.logging.Logger;

public class CropDuster extends Aircraft implements FarmVehicle{

    private static final Logger LOGGER = Logger.getLogger(CropDuster.class.getName());

    public CropDuster(Rider rider){
        super(rider);
    }

    public void operate(CropRow row) {
        if (!(rider instanceof Pilot)){
            crash();
        }
    }

    private void crash() {
        LOGGER.info("\nOh no "+/*rider.getname()*/  " has crashed and died!");
        //rider.die();
    }

    public void MakeNoise() {
        System.out.println("bzzzzzzzzzzz");
    }
}
