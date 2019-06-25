<<<<<<< HEAD
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
=======
//package com.zipcodewilmington.froilansfarm.Shelter;
//
//import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
//import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;
//import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Garage implements Shelter {
//    List<FarmVehicle>  farmVehicles=new ArrayList<FarmVehicle>();
//
//    public int total(){
//
//        return farmVehicles.size();
//    }
//
//    public Boolean isEmpty() {
//
//        return farmVehicles.isEmpty();
//    }
//
//    public void add() {
//
//    }
//
//    public void remove() {
//
//    }
//
//    public Integer itemCount() {
//        return null;
//    }
//}
>>>>>>> b07e43d8ef723e30886ba667bf1a7e60458453e3
