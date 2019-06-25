package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.ArrayList;
import java.util.List;

public class Garage implements Shelter {
    List<FarmVehicle>  farmVehicles=new ArrayList<FarmVehicle>();

    public int total(){

        return farmVehicles.size();
    }

    public Boolean isEmpty() {
        return null;
    }

    public Boolean atCapacity() {
        return null;
    }

    public Boolean add() {
        return null;
    }

    public Boolean remove() {
        return null;
    }

    public Integer itemCount() {
        return null;
    }
}
