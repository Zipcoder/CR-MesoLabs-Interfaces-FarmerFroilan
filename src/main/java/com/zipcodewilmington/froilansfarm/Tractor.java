package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Interfaces.Vehicle;

import java.util.ArrayList;

public class Tractor implements Vehicle{

    private int fuelPercent;
    private Rider rider;

    public Tractor(){
        this.fuelPercent = 100;
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public int getFuel() {
        return fuelPercent;
    }

    @Override
    public void setRider() {
        this.rider = null;
    }

    public void setRider(Rider rider){
        this.rider = rider;
    }

    public Rider getRider() {
        return rider;
    }

    public void harvest(CropRow cropRow){
        cropRow.getCrops().harvest();
    }

    public void harvest(Field field){
        ArrayList<CropRow> rows = field.getRowsList();
        for (CropRow cropRow:rows) {
            harvest(cropRow);
        }
    }
}
