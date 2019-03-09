package com.zipcodewilmington.froilansfarm.factories;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoops;


public class ChickenFactory {
    private String female;
    private String male;

    public ChickenFactory(){
        this.female = "";
        this.male = "";

    }



    public Chicken createChicken(Chicken chicken, String gender) {


        if (Math.random() < 0.5){
            gender = female;
            return new Chicken(female);
        } else
            gender = male;
            return new Chicken(male);

    }
}
