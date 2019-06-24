package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Produce.Cucumbers;
import com.zipcodewilmington.froilansfarm.Produce.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Produce.StringBeans;
import com.zipcodewilmington.froilansfarm.Produce.Tomatoes;
import com.zipcodewilmington.froilansfarm.Tomato;

import java.util.List;

public class Tractor implements FarmVehicle {
    Crops crops;
    public boolean isFarmVehicle() {
        return true;
    }

    public void farmoperation(){
        System.out.println("call harvest function");
    }

    public void ride(){
        System.out.println(" Hi I can ride");
    }

    public boolean operate() {
        return true;
    }

    public boolean isDriveable() {
        return true;
    }

    public boolean vehicleRideable() {
        return true;
    }
    public boolean harvested(CropRow cropRow){
     crops.getHarvested();
        return true;//croprow amount of crop  takes croprow.crop-harvest crop. crops return
    }
    public boolean makesNoise() {
        return true;
    }

    public Tomatoes harvest(TomatoPlant tomatoPlant){
        Tomatoes harvestedtomatoes = new Tomatoes();
        return  harvestedtomatoes;
    }

    public StringBeans harvest(StringBeanPlant stringBeanPlant){
        StringBeans harvestedStringBeans = new StringBeans();
        return harvestedStringBeans;
    }

    public EarOfCorn harvest(CornStalk cornStalk){
        EarOfCorn harvestedEarOfCorns = new EarOfCorn();
        return harvestedEarOfCorns;
    }

    public Cucumbers harvest(CucumberPlant cucumberPlant){
        Cucumbers harvestedCucumbers = new Cucumbers();
        return  harvestedCucumbers;
    }


    public boolean isMounted() {
        return false;
    }

    public void setMounted(boolean mounted) {

    }

    public String makeNoise() {
        return null;
    }

    public boolean operatingVehicle() {
        return false;
    }

    public void setOperateVehicle(boolean operating) {

    }
}
