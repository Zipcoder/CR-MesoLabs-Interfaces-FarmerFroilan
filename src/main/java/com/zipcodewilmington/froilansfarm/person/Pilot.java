package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;

public class Pilot extends Farmer{

    public Pilot(String name){
        super(name);
    }

    public void fly(CropDuster cropDuster){
        System.out.println(this.getName()+" is flying a "+cropDuster.toString());
    }

    public void operate(CropDuster cropDuster){
    }

}
