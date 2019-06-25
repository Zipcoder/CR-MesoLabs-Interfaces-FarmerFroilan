//package com.zipcodewilmington.froilansfarm.Vehicles;
//
//import com.zipcodewilmington.froilansfarm.Animal.Driver;
//import com.zipcodewilmington.froilansfarm.Animal.Farmer;
//import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;
//
//
//import com.zipcodewilmington.froilansfarm.Animal.Rider;
//import com.zipcodewilmington.froilansfarm.Crops.*;
//import com.zipcodewilmington.froilansfarm.Produce.*;
//
//public class Tractor implements FarmVehicle, NoiseMaker {
//    Crops crops;
//    Farmer farmer=new Farmer();
//    public boolean harvested(CropRow cropRow) {
//        crops.getHarvested();
//        return true;
//    }
//
//<<<<<<< HEAD
//    public void operate() {
//
//    }
//
//    public boolean isDriveable() {
//        return true;
//    }
//
//    public boolean vehicleRideable() {
//        return true;
//    }
//    public Crops harvested(CropRow cropRow){
//        return null;//croprow amount of crop  takes croprow.crop-harvest crop. crops return
//    }
//
//    public boolean makesNoise() {
//        return true;
//    }
//
//    public List<Tomato> harvest(TomatoPlant tomatoPlant){
//        Tomatoes harvestedtomatoes = new Tomatoes();
//        return (List<Tomato>) harvestedtomatoes;
//=======
//    public Edible harvest(Crops crops){
//        Edible harvest= (Edible) crops.yield();
//        return  harvest;
//>>>>>>> 007d8a6e73709d8ba566f678aa3543e2c5b49636
//    }
//
//    public String makeNoise() {
//        return "trtrtrrr";
//    }
//
//    public Vehicle operate(Rider rider) {
//        if(rider instanceof Driver)
//            return (Vehicle) this;
//        else
//            return null;
//
//    }
//}
