package com.zipcodewilmington.froilansfarm.Crops;


import com.zipcodewilmington.froilansfarm.Produce.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Produce.EarsOfCorn;

import java.util.Random;

public class CornStalk extends Crops{

    public CornStalk() {}

    @Override
    public EarsOfCorn yield() {
        if(hasEdible()){
            EarsOfCorn earsOfCorn = new EarsOfCorn();
            Random random = new Random();
            Integer amount = random.nextInt(3) + 1;
            for(int i = 0; i < amount; i++) {
                earsOfCorn.add(new EarOfCorn());
            }
            return earsOfCorn;
        }
        return null;
    }
}
