package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Cucumber;
import com.zipcodewilmington.froilansfarm.Produce.Cucumbers;

import java.util.Random;

public class CucumberPlant extends Crops {

    public CucumberPlant() {}

    @Override
    public Cucumbers yield() {
        if(hasEdible()){
            Cucumbers cucumbers = new Cucumbers();
            Random random = new Random();
            Integer amount = random.nextInt(5) + 5;
            for(int i = 0; i < amount; i++) {
                cucumbers.add(new Cucumber());
            }
            return cucumbers;
        }
        return null;
    }
}
