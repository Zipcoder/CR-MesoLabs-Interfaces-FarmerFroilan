//package com.zipcodewilmington.froilansfarm.Vehicles;
//import com.zipcodewilmington.froilansfarm.Animal.Driver;
//import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;
//import com.zipcodewilmington.froilansfarm.Animal.Pilot;
//import com.zipcodewilmington.froilansfarm.Animal.Rider;
//import com.zipcodewilmington.froilansfarm.Crops.*;
//
//
//public class CropDuster implements FarmVehicle,NoiseMaker, Flyable {
//
//
//    public String makeNoise(){return "vrooom";}
//
//    public CropRow fertilize(CropRow cropRow){
//        cropRow.fertilize();
//        return cropRow;
//    }
//
//<<<<<<< HEAD
//    public void operate() {
//
//=======
//    public void fly() {
//        CropRow cropRow=new CropRow();
//        if(this instanceof Flyable)
//            this.fertilize(cropRow);
//
//    }
//    public boolean fertilizing(){
//        this.fly();
//        return true;
//>>>>>>> 007d8a6e73709d8ba566f678aa3543e2c5b49636
//    }
//
//    public boolean land() {
//        if(fertilizing()==true)
//        return false;
//        else
//            return true;
//    }
//
//
//    public Vehicle operate(Rider rider) {
//        if(rider instanceof Pilot)
//            return (Vehicle) this;
//        else
//        return null;
//    }
//
//
//<<<<<<< HEAD
//    }
//
//    @Override
//    public void setMounted(boolean b) {
//
//    }
//=======
//>>>>>>> 007d8a6e73709d8ba566f678aa3543e2c5b49636
//}



