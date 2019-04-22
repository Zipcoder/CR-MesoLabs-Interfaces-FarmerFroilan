package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.buildings.Stable;
import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Chicken;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Horse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.ChickenFeed;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Hay;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PilotTest {

    Pilot froilanda;
    CropDuster badLarry;


    @Before
    public void setUp(){
        froilanda = new Pilot("Froilanda");
        badLarry = new CropDuster("Bad Larry");
    }

    @Test
    public void makeNoiseTest(){
        //Given
        //Pilot froilanda

        //When
        String expected = "Talk to me Goose";
        String actual = froilanda.makeNoise();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void mountTest(){
        //Given
        //Pilot froilanda

        //When
        froilanda.mount(badLarry);

        //Then
        Assert.assertTrue(badLarry.isBeingRidden());
    }

    @Test
    public void dismountTest(){
        //Given
        //Pilot froilanda

        //When
        froilanda.mount(badLarry);
        froilanda.dismount(badLarry);

        //Then
        Assert.assertFalse(badLarry.isBeingRidden());
    }

    @Test
    public void flyTest(){
        //Given
        //Pilot froilanda

        //When
        froilanda.mount(badLarry);
        froilanda.flyAircraft(badLarry);

        //Then
        Assert.assertTrue(badLarry.isFlying());

    }

    @Test
    public void landTest(){
        //Given
        //Pilot froilanda

        //When
        froilanda.mount(badLarry);
        froilanda.flyAircraft(badLarry);
        froilanda.landAircraft(badLarry);

        //Then
        Assert.assertFalse(badLarry.isFlying());

    }

    @Test
    public void feedChickensTest(){
        //Given
        WareHouse house = new WareHouse(new ChickenFeed(), new ChickenFeed(), new ChickenFeed());
        ChickenCoop coop = new ChickenCoop(new Chicken(), new Chicken());

        //When
        froilanda.feedChickens(coop,house);

        //Then
        Assert.assertTrue(coop.getChicken(0).hasBeenFed());
        Assert.assertTrue(house.getStorageSize() == 1);
    }

    @Test
    public void feedHorsesTest(){
        //Given
        WareHouse house = new WareHouse(new Hay(), new Hay(), new Hay(), new Hay());
        Stable stable = new Stable(new Horse(""), new Horse(""), new Horse(""), new Horse(""));

        //When
        froilanda.feedHorses(stable,house);

        //Then
        Assert.assertTrue(stable.getHorse(0).hasBeenFed());
        Assert.assertTrue(stable.getHorse(3).hasBeenFed());
        Assert.assertTrue(house.getStorageSize() == 0);
    }

    @Test
    public void exerciseHorsesTest(){
        //Given
        Stable stable = new Stable(new Horse(""), new Horse(""), new Horse(""), new Horse(""));

        //When
        froilanda.exerciseHorses(stable);

        //Then
        Assert.assertTrue(stable.getHorse(3).wasExercised());


    }




}
