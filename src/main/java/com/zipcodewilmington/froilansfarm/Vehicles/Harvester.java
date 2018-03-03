package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.Plants.Crop;
import com.zipcodewilmington.froilansfarm.Plants.CropRow;

public class Harvester extends Vehicle implements FarmVehicle {

    public void fertilize(Crop crop) {
        // Harvester cannot precision fertilize
    }

    public void fertilize(CropRow cropRow) {
        // Let's say it has fertilizing functionality too why not
        if (Rideable.isMounted) {
            for (int i = 0; i < cropRow.getCropArrayList().size(); i++) {
                cropRow.getCropArrayList().get(i).fertilize();
            }
        }
    }

    public void harvestCropRow(CropRow cropRow, Farmer harvesterOperator) {
        if (Rideable.isMounted) {
            for (int i = 0; i < cropRow.getCropArrayList().size(); i++) {
                harvesterOperator.getFoodInventory().add(cropRow.getCropArrayList().get(i).yield());
            }
        }
    }
}