package com.zipcodewilmington.froilansfarm.vehicles;

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

    public boolean operate(Field field) {
        return false;
    }

    public boolean harvest(CropRow croprow) {
        return false;
    }

}
