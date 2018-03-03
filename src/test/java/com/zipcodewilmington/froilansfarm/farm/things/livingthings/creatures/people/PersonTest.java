package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EdibleType;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Egg;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Hay;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void eatTest(){
        //Given
        Farmer froilan = new Farmer("Froilan");
        WareHouse testHouse = new WareHouse(new Egg());

        //When
        froilan.eat(EdibleType.EGG,testHouse);
        int expected = 4;
        int actual = froilan.getEnergyReserves();

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertTrue(froilan.hasBeenFed());

    }

    @Test
    public void dontEatAnimalFeedTest(){
        //Given
        Farmer froilan = new Farmer("Froilan");
        WareHouse testHouse = new WareHouse(new Egg(), new Hay());

        //When
        froilan.eat(EdibleType.HAY, testHouse);
        int expected = 0;
        int actual = froilan.getEnergyReserves();

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertFalse(froilan.hasBeenFed());
    }

}
