
package com.zipcodewilmington.froilansfarm.Shelter;


import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import com.zipcodewilmington.froilansfarm.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Garage implements Shelter {

    List<Tractor> tractors = new ArrayList<>();
    List<CropDuster> cropDusters = new ArrayList<>();


    public Garage() {}


    public Boolean isEmpty() {
        if (tractors.isEmpty() && cropDusters.isEmpty()){
            return true;
        }
        return false;
    }

    public void add(Tractor tractor) {
        tractors.add(tractor);
    }

    public void remove(Tractor tractor) {
        tractors.remove(tractor);
    }

    public Integer tractorCount(){
        return tractors.size();
    }

    public void add(CropDuster cropDuster) {
        cropDusters.add(cropDuster);
    }

    public void remove(CropDuster cropDuster) {
        cropDusters.remove(cropDuster);
    }

    public Integer cropDusterCount(){
        return cropDusters.size();
    }

    public Integer totalItemCount() {

        return tractorCount() + cropDusterCount();
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {


    }

    @Override
    public Integer itemCount() {
        return null;
    }
}

