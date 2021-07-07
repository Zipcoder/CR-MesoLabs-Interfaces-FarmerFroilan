package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Baskets.CornBasket;
import com.zipcodewilmington.froilansfarm.Baskets.EggBasket;
import com.zipcodewilmington.froilansfarm.Baskets.TomatoBasket;

public class Meals {



    public Meals mealHorse (Basket corn) {
        corn.remove(3);

        return new Meals();

    }
    public Meals froilanMeal(Basket corn, Basket tom, Basket egg){
        corn.remove(1);
        tom.remove(2);
        egg.remove(5);

        return new Meals();
    }
    public Meals froilanda(Basket corn, Basket tom, Basket egg){
        corn.remove(2);
        tom.remove(1);
        egg.remove(2);
        return new Meals();
    }

    public Meals feedChicken (Basket corn) {
        corn.remove(1);
        return new Meals();
    }


}
