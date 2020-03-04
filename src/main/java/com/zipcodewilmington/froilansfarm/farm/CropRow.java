package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crop.*;
import com.zipcodewilmington.froilansfarm.food.Onion;

public class CropRow {
    Crop crop;

    public void setCropType(Crop type){
        if(type instanceof CarrotRoot){
            crop = new CarrotRoot();
        }else if(type instanceof CornStalk){
            crop = new CornStalk();
        }else if(type instanceof OnionRoot){
            crop = new OnionRoot();
        }else if(type instanceof PotatoRoot){
            crop = new PotatoRoot();
        }else{
            crop = new TomatoPlant();
        }
    }
    public Crop getCrop(){
        return this.crop;
    }
    public String checkCropType(){
        if(crop instanceof CarrotRoot){
            return "Carrot Root";
        }else if(crop instanceof CornStalk){
            return "Corn Stalk";
        }else if(crop instanceof OnionRoot){
            return "Onion Root";
        }else if(crop instanceof PotatoRoot){
            return "Potato Root";
        }else{
            return "Tomato Plant";
        }
    }
}

