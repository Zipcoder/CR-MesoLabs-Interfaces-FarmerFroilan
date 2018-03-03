package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.FarmBuildings.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Farmer extends Person implements Rider, Botanist {

    public Farmer(){
        this.name = "Froilan";
    }
    @Override
    public String makeNoise() {
        return "Hi, I'm a farmer";
    }

    public void eat(Edible edible) {
        this.getFoodFed().add(edible);
    }

    public void plantCrop(CropRow cropRow, Crop crop) {
       cropRow.getCropRow().add(crop);
    }

    public void mount(Rideable rideable){
        rideable.canRide();
    }
    public void dismount(Rideable rideable){
        rideable.stopRide();
    }
}
