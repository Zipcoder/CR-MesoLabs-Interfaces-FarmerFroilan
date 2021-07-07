package com.zipcodewilmington.froilansfarm.WeekTest;

import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Baskets.CornBasket;
import com.zipcodewilmington.froilansfarm.Baskets.EggBasket;
import com.zipcodewilmington.froilansfarm.Baskets.TomatoBasket;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Meals;
import org.junit.Before;

public class Sims {


    Basket cornbasket = new Basket<CornBasket>();
    Basket tombasket = new Basket<TomatoBasket>();
    Basket eggbasket = new Basket<EggBasket>();
    Meals meal = new Meals();

    @Before
    public void setUp() throws Exception {
        // corn has 4 ears tom has 4 and egg has 7


        cornbasket.add(new EarCorn());
        cornbasket.add(new EarCorn());
        cornbasket.add(new EarCorn());
        cornbasket.add(new EarCorn());

        tombasket.add(new Tomato());
        tombasket.add(new Tomato());
        tombasket.add(new Tomato());
        tombasket.add(new Tomato());

        eggbasket.add(new Egg());
        eggbasket.add(new Egg());
        eggbasket.add(new Egg());
        eggbasket.add(new Egg());
        eggbasket.add(new Egg());
        eggbasket.add(new Egg());
        eggbasket.add(new Egg());



    }
}
