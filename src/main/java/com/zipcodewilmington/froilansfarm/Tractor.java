package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class Tractor extends FarmVehicle {

    public void harvest(CropRow cropRow) {

        List<Crop> listToBeRemoved = cropRow.getList();
        cropRow.getList().removeAll(listToBeRemoved);

    }

    public void operate(Farm farm) {
            List<CropRow> cropRowsInField = farm.getField().getList();

        for (CropRow cr : cropRowsInField) {
            harvest(cr);
        }
    }
}
