package com.zipcodewilmington.froilansfarm.WeekTest;

import com.zipcodewilmington.froilansfarm.*;
import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Baskets.CornBasket;
import com.zipcodewilmington.froilansfarm.Baskets.EggBasket;
import com.zipcodewilmington.froilansfarm.Baskets.TomatoBasket;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.PersonRelated.Farmer;
import com.zipcodewilmington.froilansfarm.PersonRelated.Person;
import com.zipcodewilmington.froilansfarm.PersonRelated.Pilot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Morning {
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

    @Test
    public void rideHorseTest() {

       // Assert.assertEquals(expected,actual);
    }

    @Test
    public void horseEatTest() {
        Horse fred = new Horse();
        fred.eat(meal.mealHorse(cornbasket));
        Integer expected = 1;
        Integer actual = cornbasket.size();


        Assert.assertEquals(expected,actual);
    }
    @Test
    public void chickenEatTest() {
        Chicken fred = new Chicken();
        fred.eat(meal.feedChicken(cornbasket));
        Integer expected = 3;
        Integer actual = cornbasket.size();


        Assert.assertEquals(expected,actual);
    }

    @Test
    public void FroilanEatTest() {
        Person froilan = new Farmer();

        froilan.eat(meal.froilanMeal(cornbasket,tombasket,eggbasket));
        Integer expected = 2;
        Integer actual = eggbasket.size();





        Assert.assertEquals(expected,actual);
    }
    @Test
    public void FroilanandaEatTest() {
       Pilot froilanda = new Pilot();

       froilanda.eat(meal.froilanda(cornbasket,tombasket,eggbasket));

        Integer expected = 5;
        Integer actual = eggbasket.size();

         Assert.assertEquals(expected,actual);
    }
}
