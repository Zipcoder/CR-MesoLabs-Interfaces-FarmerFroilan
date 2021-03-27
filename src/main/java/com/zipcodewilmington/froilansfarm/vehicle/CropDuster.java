package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.shelter.CropRow;

public class CropDuster extends Airplane implements FarmVehicle {

    public CropDuster(String name){
        super(name);
    }

    //put pilot as parameter, use pilots name in string output
    public void operate(){
        System.out.println(this.toString()+" is running!");
    }


    public void fertilize(CropRow cropRow){
        if(inAir==true){
        for(int i=0;i<cropRow.size();i++){
            cropRow.get(i).fertilizeCrop();
        }
        }else System.out.println("Still on the ground, genius");
    }

    public void makeNoise(){
        System.out.println("Stupid plane noise");
    }

    @Override
    public String toString(){
        return "Crop Duster";
    }

}
