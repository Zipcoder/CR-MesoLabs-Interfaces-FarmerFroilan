package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdiblePackage.EdiblePlant;
import com.zipcodewilmington.froilansfarm.Produce;

import java.util.Random;

public class Crop<E extends EdiblePlant> implements Produce {
    public void addProduce(Produce produce) {
    }
    public void yield(boolean fertilized){
        if(fertilized){
            //gonna do some stuff like add to produce or food
            //times howMush method
        }
    }
    public int howMuch(){
        Random randomAmount = new Random();
        return randomAmount.nextInt(10) + 1;
    }
}
