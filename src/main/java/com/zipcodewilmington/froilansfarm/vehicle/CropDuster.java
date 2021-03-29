package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import com.zipcodewilmington.froilansfarm.shelter.CropRow;

public class CropDuster extends Airplane implements FarmVehicle {

    public CropDuster(String name){
        super(name);
    }

    //put pilot as parameter, use pilots name in string output -> DONE
    public void operate(Pilot pilot){
        pilotOnBoard(pilot);
        System.out.println(pilot.getName()+" is flying a "+this.toString());
    }

    //Added this one to satisfy operate() method in FarmVehicle interface
    public void operate(){
        if(properPilot){System.out.println("The "+this.toString()+" is on now!");}
    }


    public void fertilize(CropRow cropRow){
        if(inAir==true){
        for(int i=0;i<cropRow.size();i++){
            cropRow.get(i).fertilizeCrop();
        }
        }else System.out.println("Still on the ground, genius");
    }

    public String makeNoise(){
        return "nnneeaoowww";
    }

    @Override
    public String toString(){
        return "Crop Duster";
    }

}
