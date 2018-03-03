package com.zipcodewilmington.froilansfarm.farm.buildings;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.*;
import oracle.jvm.hotspot.jfr.ThreadGroupEntry;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WareHouseTest <E extends Edible> {

    EarCorn corny = new EarCorn();
    Tomato mater = new Tomato();
    Vegetable veggie = new Vegetable();

    @Test
    public void getEdibleTest(){
        //Given
        WareHouse house = new WareHouse(corny,mater,veggie);

        //When
        Tomato expected = mater;
        Edible actual = house.getEdible(1);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addEdibleTest(){
        //Given
        WareHouse house = new WareHouse();

        //When
        house.addEdible(veggie);
        Vegetable expected = veggie;
        Edible actual = house.getEdible(0);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getStorageSizeTest(){
        //Given
        WareHouse house = new WareHouse(corny,mater,veggie);

        //When
        int expected = 3;
        int actual = house.getStorageSize();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeEdibleTest(){
        //Given
        WareHouse house = new WareHouse(corny,mater,veggie);

        //When
        house.removeEdible(corny);
        int expected = 2;
        int actual = house.getStorageSize();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeByTypeSuccesfulTest(){
        //Given
        WareHouse house = new WareHouse(corny,mater,veggie);

        //When
        house.removeEdibleByType(EdibleType.TOMATO);
        Edible[] expected = {corny,veggie};
        Edible[] actual = house.getFoodStorageArray();

        //Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void removeByTypeFailTest(){
        //Given
        WareHouse house = new WareHouse(corny,mater,veggie);

        //When
        house.removeEdibleByType(EdibleType.CHICKENFEED);
        Edible[] expected = {corny,mater, veggie};
        Edible[] actual = house.getFoodStorageArray();

        //Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void removeMultipleByTypeTest(){
        //Given
        WareHouse house = new WareHouse(new Tomato(), new Tomato(), new Tomato());

        //When
        house.removeMultipleEdibles(EdibleType.TOMATO, 2);
        int expected = 1;
        int actual = house.getStorageSize();

        //Then
        Assert.assertEquals(expected,actual);


    }

    @Test
    public void isTypeOfEdibleSuccesfulTest(){
        //Given

        //When

        //Then
        Assert.assertTrue(WareHouse.isTypeOfEdible(EdibleType.TOMATO,mater));
    }

    @Test
    public void isTypeOfEdibleFailTest(){
        //Given

        //When

        //Then
        Assert.assertFalse(WareHouse.isTypeOfEdible(EdibleType.CHICKENFEED, mater));
    }

    @Test
    public void removeNullsTest(){
        //Given
        WareHouse testHouse = new WareHouse(new Egg(),new Egg(), null);

        //When
        testHouse.removeNulls();
        int expected = 2;
        int actual = testHouse.getStorageSize();

        //Then
        Assert.assertEquals(expected,actual);
    }


}

