package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Tomato;
import com.zipcodewilmington.froilansfarm.Produce.Tomatoes;

import java.util.Random;

public class TomatoPlant extends Crops {

    public TomatoPlant() {}

    @Override
    public Tomatoes yield() {
        if(hasEdible()){
            Tomatoes tomatoes = new Tomatoes();
            Random random = new Random();
            Integer amount = random.nextInt(5) + 5;
            for(int i = 0; i < amount; i++) {
                tomatoes.add(new Tomato());
            }
            return tomatoes;
        }
        return null;
    }

}
