package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Production.CropRow;

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
