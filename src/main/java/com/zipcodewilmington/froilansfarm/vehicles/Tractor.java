package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.farmland.CropRow;
import com.zipcodewilmington.froilansfarm.farmland.Field;
import com.zipcodewilmington.froilansfarm.food.Edible;

import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle {

    ArrayList<Edible> tractorStorageBin;

    public Tractor() {
        this.tractorStorageBin = new ArrayList<Edible>();
    }

    public String makeNoise() {
        return "KlunkaKlunka";
    }

    public void operate(Farm farm){
    }

    public boolean harvest(Field field) {
        return false;
    }

}
