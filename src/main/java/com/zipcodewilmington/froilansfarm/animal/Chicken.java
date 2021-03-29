package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {
    boolean isFertilized = false;

    public Chicken(String name){
        super(name);
    }

    //whatever calls yield here has to put the egg in the FoodInventory
    public Egg yield(){
        if(!isFertilized){
            System.out.println(name+" laid an egg!");
            return new Egg();
        }
        return null;
    }

    public void fertilizeEgg(){
        isFertilized = true;
    }

    public boolean isFertilized(){
        return isFertilized;
    }

    public String makeNoise() {
        return "Cock-a-doodle-doo";
    }

    @Override
    public String toString(){
        return "Chicken";
    }

}
