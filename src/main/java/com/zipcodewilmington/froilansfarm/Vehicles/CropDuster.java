package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Production.CropRow;
import com.zipcodewilmington.froilansfarm.Production.Field;

public class CropDuster extends Aircraft implements FarmVehicle {

    private boolean isMounted;
    private boolean isOnFarm;

    public CropDuster() {
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


    public void fertilizeCropRow(CropRow aCropRow) {
        if (canOperate()) {
            for (int i = 0; i < aCropRow.getSize(); i++) {
                aCropRow.getCropRow().get(i).beFertilized();
            }
        } else {
            System.out.println("Tractor not currently operable.");
        }
    }

    public void fertilizeField(Field farmField) {
        if (canOperate()) {
            for (int i = 0; i < farmField.getCropField().size(); i++) {
                fertilizeCropRow(farmField.getCropField().get(i));
            }
        } else {
            System.out.println("Tractor not currently operable.");
        }
    }

    public boolean getIsMounted() {
        return isMounted;
    }

    public void fly() {

    }

    public boolean canOperate() {
        return (isMounted && isOnFarm);
    }

    public void makeNoise() {
        System.out.println("whoosh");
    }

}
