package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;

public interface Botanist {

      public void plants(Crop crop, CropRow cropRow, Integer numOfCrops);
    }

