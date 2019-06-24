package com.zipcodewilmington.froilansfarm.Crops;


import com.zipcodewilmington.froilansfarm.Produce.StringBean;
import com.zipcodewilmington.froilansfarm.Produce.StringBeans;

import java.util.Random;

public class StringBeanPlant extends Crops {

    public StringBeanPlant() {}

    @Override
    public StringBeans yield() {
        if(hasEdible()){
            StringBeans stringBeans = new StringBeans();
            Random random = new Random();
            Integer amount = random.nextInt(7) + 6;
            for(int i = 0; i < amount; i++) {
                stringBeans.add(new StringBean());
            }
            return stringBeans;
        }
        return null;
    }

}
