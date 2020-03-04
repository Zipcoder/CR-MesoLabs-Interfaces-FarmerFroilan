package com.zipcodewilmington.froilansfarm.vehicle;


import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Rider;

import java.util.logging.Logger;

public class Tractor extends Vehicle implements FarmVehicle, Rideable {

    private static final Logger LOGGER = Logger.getLogger(Tractor.class.getName());

    private Rider rider;

    public Tractor(Rider rider){
        this.rider = rider;
    }

    public void operate(Field field) {
        if (!(rider instanceof Farmer)){
            LOGGER.info("\nOnly a farmer can operate this!");
        }
        else {
            for (Integer i = 1; i < 6; i++) {
                CropRow tempRow = field.getCropRow(i);
                tempRow.getCrop().setHarvested(true);
            }
        }
    }

    public String makeNoise() {
        return " bum bum";

    }
}
