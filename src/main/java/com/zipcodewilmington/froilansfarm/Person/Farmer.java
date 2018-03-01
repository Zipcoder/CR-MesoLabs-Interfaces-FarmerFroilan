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

    }

    @Override
    public void mount(Rideable object) {

    }

    @Override
    public void dismount(Rideable object) {

    }
}
