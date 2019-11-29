package com.zipcodewilmington.froilansfarm.person;
import com.zipcodewilmington.froilansfarm.plants.CropRow;
import com.zipcodewilmington.froilansfarm.miscinterfaces.Rideable;
import com.zipcodewilmington.froilansfarm.plants.Crop;

public class Farmer extends Person {
    private String name;


    public Farmer(String name){
        this.name = name;
    }

    public String makeNoise() {

        return "ahhhhhhhh!";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void plant(Crop crop, CropRow row){

    }

    @Override
    public void unmount(Rideable rideable) {

    }
}
