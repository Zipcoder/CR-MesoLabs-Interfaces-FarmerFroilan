package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Exceptions.NoPilotException;
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

    public void operate(Farm farm) throws NoPilotException {
        confirmDriver();
            //farm.getField.getRows.eachRow {
            //fertilize(thisRow)
    }

    protected void fertilize(CropRow cropRow) {
        cropRow.fertilizeRow();
    }

    @Override
    public void makeNoise() {
        // [Crop Duster engine starts]
    }
}
