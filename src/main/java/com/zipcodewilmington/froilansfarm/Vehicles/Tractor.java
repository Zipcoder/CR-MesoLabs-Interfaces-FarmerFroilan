package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Production.CropRow;
import com.zipcodewilmington.froilansfarm.Production.EdibleStorage;
import com.zipcodewilmington.froilansfarm.Production.Field;


public class Tractor extends Vehicle implements FarmVehicle {

    private boolean isMounted;
    private boolean isOnFarm;


    public Tractor() {
        this.isMounted = false;
        this.isOnFarm = true;
    }

    public void toggleIsMounted() {
        if (isMounted) {
            this.isMounted = false;
        } else {
            this.isMounted = true;
        }
    }

    public boolean getIsMounted() {
        return isMounted;
    }

    public boolean canOperate() {
        return (isMounted && isOnFarm);
    }

    public void harvestCropRow(CropRow aCropRow, EdibleStorage storage) {

        if (canOperate()) {
            for (int i = 0; i < aCropRow.getSize(); i++) {
                storage.addToEdibleStorage(aCropRow.getCropRow().get(i).yield());
                aCropRow.getCropRow().get(i).beHarvested();
            }
            aCropRow.removeHarvestedCrops();
        } else {
            System.out.println("Tractor not currently operable.");
        }
    }

    public void harvestField(Field farmField, EdibleStorage storage) {

        if (canOperate()) {
            for (int i = 0; i < farmField.getSize(); i++) {
                harvestCropRow(farmField.getCropField().get(i), storage);
            }
        } else {
            System.out.println("Tractor not currently operable.");
        }
    }

    public void makeNoise() {
        System.out.println("vroom");
    }

}
