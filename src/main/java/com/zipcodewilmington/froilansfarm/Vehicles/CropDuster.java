package com.zipcodewilmington.froilansfarm.Vehicles;
import com.zipcodewilmington.froilansfarm.Buildings.Farm;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements FarmVehicle {

    @Override
    public void fly() {
    }

    public String makeNoise() {
        return "Swoosh";
    }

    public void fertilize(CropRow cropRow) {

    }

    @Override
    public void operate(Farm farm) {

    }
}
