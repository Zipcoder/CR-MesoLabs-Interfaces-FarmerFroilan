package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Farmer extends Person implements Eater, Rider, Botanist {

    @Override
    public void plant(Crop crop, CropRow cropRow) {
        cropRow.addCrops(crop);
    }

    @Override
    public void mount(Rideable object) {
        if(!object.getMountedStatus()) {
            object.mount();
        }
    }

    @Override
    public void dismount(Rideable object) {
        if(object.getMountedStatus()) {
            object.dismount();
        }
    }

    public void fillCropRow(CropRow cropRow, Crop crop) {
        for(int i = 0; i < 30; i++) {
            plant(crop, cropRow);
        }

    }

    @Override
    public String makeNoise() {
        return "I'm a farmer...";
    }
}
