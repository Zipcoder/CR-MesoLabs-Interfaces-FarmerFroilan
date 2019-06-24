package com.zipcodewilmington.froilansfarm.Animal;



import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Egg;
import com.zipcodewilmington.froilansfarm.Produce.Eggs;
import com.zipcodewilmington.froilansfarm.Produce.Produce;


import java.util.ArrayList;
import java.util.List;

public class Chicken extends Produce implements Animal {

    List<Edible> foodEaten = new ArrayList<Edible>();

    public Chicken() {
    }

    public boolean fertilized() {
        //Establish conditions later
        return true;
    }

    public Egg yieldEgg() throws Exception {
        if (!fertilized()) {
            return new Egg();
        } else throw new Exception
                ("This chicken has been fertilized and cannot produce edible eggs.");
    }

    public void eatEdible(Edible food) {
            foodEaten.add(food);
    }

    public List<Edible> getFoodEaten() {
        return foodEaten;
    }

    public String makeNoise() {
            return "Cluck! Cluck! Cluck-a-luck!";
    }

    @Override
    public Boolean hasEdible() {
        return !fertilized;
    }

    @Override
    public Eggs yield() { return null; }

}
