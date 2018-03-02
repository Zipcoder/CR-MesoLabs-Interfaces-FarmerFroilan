package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Production.Crop;
import com.zipcodewilmington.froilansfarm.Production.CropRow;
import com.zipcodewilmington.froilansfarm.Production.Field;

import java.util.ArrayList;

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

    public void harvest(Field farmField) {

        if (canOperate()) {
//            Farm.
        }

    }

    public void makeNoise() {
        System.out.println("vroom");
    }

}
