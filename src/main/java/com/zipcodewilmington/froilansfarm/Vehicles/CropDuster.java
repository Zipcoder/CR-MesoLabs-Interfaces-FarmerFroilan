package com.zipcodewilmington.froilansfarm.Vehicles;



import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Crops;

public class CropDuster implements FarmVehicle, Vehicle, NoiseMaker, Flyable {
    public boolean isFarmVehicle() {
        return true;
    }

    public boolean canFly() {
        return true;
    }

    @Override
    public void operate() {

    }
    public Crops fertilize(CropRow cropRow){
        return null;//croprow method is fetilized true
    }


    public String makeNoise() {
        return null;
    }

    public boolean flyingAirCraft() {
        return false;
    }

    public void setFlyAirCraft(boolean flying) {

    }

    public boolean isMounted() {
        return false;
    }

    public void setMounted(boolean mounted) {

    }
}

