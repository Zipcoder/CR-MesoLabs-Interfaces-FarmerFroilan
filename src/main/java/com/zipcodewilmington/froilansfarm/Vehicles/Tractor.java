package com.zipcodewilmington.froilansfarm.Vehicles;
import com.zipcodewilmington.froilansfarm.Buildings.Farm;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {

    boolean isMounted = false;

    public void harvestCrop(Crop crop) {
        crop.hasBeenHarvested = true;
    }

    public void mount() {
        if(!isMounted) {
            isMounted = true;
        }
    }

    public void dismount() {
        if (isMounted) {
            isMounted = false;
        }
    }

    public boolean getMountedStatus() {
        return this.isMounted;
    }

    public String makeNoise() {
        return "tuk tuk tuk";
    }

    @Override
    public void operate(Farm farm) {

    }

    @Override
    public void fertilize(CropRow cropRow) {
        for(int i = 0; i < cropRow.getCropRow().size(); i++) {
            cropRow.getCropRow().get(i).hasBeenFertilized = true;
        }
    }
}
