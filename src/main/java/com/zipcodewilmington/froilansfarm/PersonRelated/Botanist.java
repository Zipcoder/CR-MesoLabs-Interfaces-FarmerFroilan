package com.zipcodewilmington.froilansfarm.PersonRelated;

import com.zipcodewilmington.froilansfarm.FieldRelated.Crop;
import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;

public interface Botanist {

    public void plants(Crop crop, CropRow cropRow,Integer numOfCrops);
}
