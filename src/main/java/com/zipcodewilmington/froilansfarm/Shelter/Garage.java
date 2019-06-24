package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.ArrayList;
import java.util.List;

public class Garage implements Shelter {
    List<FarmVehicle>  farmVehicles=new ArrayList<FarmVehicle>();
    Tractor tractor1=new Tractor();
    Tractor tractor2=new Tractor();
    CropDuster cropDuster=new CropDuster();
    public int total(){
        farmVehicles.add(tractor1);
        farmVehicles.add(tractor2);
        farmVehicles.add(cropDuster);
        return farmVehicles.size();
    }

    public Boolean isEmpty() {

        return farmVehicles.isEmpty();
    }

    public void add() {

    }

    public void remove() {

    }

    public Integer itemCount() {
        return null;
    }
}
