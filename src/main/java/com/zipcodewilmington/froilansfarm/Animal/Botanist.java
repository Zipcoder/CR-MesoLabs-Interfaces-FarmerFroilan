package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Crops;

public interface Botanist extends Person {

        public void plant(Crops crops, CropRow cropRow);
}
