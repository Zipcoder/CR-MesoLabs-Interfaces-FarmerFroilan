package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class Tractor extends Vehicle implements FarmVehicle, Rideable {
    public void operate(Farm farm) {

        //farm.getField()
            //field.getRows.each()
                //crops.each -> harvest()
    }

    public void makeNoise() {
        // tractor noise
    }

    public Edible harvest(Crop crop) {
        return crop.yield();
    }
}
