package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Edible.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Edible.Tomato;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WorkWeek {
    Farm farm = Farm.getINSTANCE();
    Farmer froilan = farm.getFroilan();
    Farmer froilanda = farm.getFroilanda();

    @Before
    public void setup(){}

    @Test
    public void breakfast(){
        froilan.eat(new EarCorn(), new Tomato(), new Tomato(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg());
        froilanda.eat(new EarCorn(), new EarCorn(), new Tomato(), new EdibleEgg(), new EdibleEgg());
        Assert.assertEquals(froilan.calories, 540);
        Assert.assertEquals(froilanda.calories, 320);
    }

    @Test
    public void sunday(){

    }


}
