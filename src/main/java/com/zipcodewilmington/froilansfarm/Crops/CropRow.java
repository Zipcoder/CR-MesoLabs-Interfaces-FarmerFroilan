package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edible.Edible;

public class CropRow<T extends Crop>{
    public T[] crops;

    public T[] getCrops() {
        return crops;
    }

    public void plantCrops(T[] crops) {
        this.crops = crops;
    }
}
