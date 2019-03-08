package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

import java.util.ArrayList;

public class CropDuster implements Aircraft, FarmVehicle{
    private Rider pilot;
    private int fuel;

    public CropDuster(){
        this.fuel = 100;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public String makeNoise() {
        return "Zoom";
    }

    public void setRider() {
        this.pilot = null;
    }

    public void setRider(Rider pilot){
        this.pilot = pilot;
    }

    public Rider getPilot() {
        return pilot;
    }

    @Override
    public void fly() {
        if (pilot != null) {
            System.out.println("The cropduster is flying!");
        } else {
            System.out.println("You need a pilot to fly.");
        }
    }

    public void fertilize(Field field){
        ArrayList<CropRow> rows = field.getRowsList();
        for (CropRow row:rows) {
            row.getCrops().fertilize();
        }
    }

}
