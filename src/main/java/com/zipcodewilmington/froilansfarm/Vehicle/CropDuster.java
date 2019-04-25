package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Exceptions.NoPilotException;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

import java.util.List;

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
        List<CropRow> cropRows = farm.getField().getCropRows();
        for (CropRow row : cropRows)
            fertilize(row);
    }

    protected void fertilize(CropRow cropRow) {
        cropRow.fertilizeRow();
    }

    @Override
    public void makeNoise() {
        // [Crop Duster engine starts]
    }
}
