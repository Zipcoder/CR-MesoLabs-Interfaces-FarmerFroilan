package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;

public class TomatoPlant extends Crop implements Produce {


    public Boolean yield() { return false;}

    public Boolean storeFood() { return false;}

    public Boolean harvested() {return false;}

    public Boolean fertilized() {return false;}
}
