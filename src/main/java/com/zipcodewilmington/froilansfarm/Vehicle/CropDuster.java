package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class CropDuster extends Aircraft implements FarmVehicle {

    public CropDuster() {
        super();
    }

    public void operate(Farm farm) {
        try {
            //get the cropRows
            //fertilize the cropRows
        } catch (NullPointerException npe) {
            // this machine is not self operating. where's the driver?
        }
    }

    public void fertilize(CropRow cropRow) {
        //copRow.fertilizeAll
    }

    @Override
    public void makeNoise() {
        // [Crop Duster engine starts]
    }
}
