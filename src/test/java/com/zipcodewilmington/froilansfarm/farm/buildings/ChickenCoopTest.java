package com.zipcodewilmington.froilansfarm.farm.buildings;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {

    @Test
    public void addChickenTest(){
        //Given
        ChickenCoop test = new ChickenCoop();
        Chicken larry = new Chicken("Larry");

        //When
        test.addChicken(larry);
        Chicken expected = larry;
        Chicken actual = test.getChicken(larry);

        //Then
        Assert.assertEquals(expected,actual);


    }

    @Test
    public void removeChickenTest(){
        //Given
        Chicken larry = new Chicken("Larry");
        Chicken lenny = new Chicken ("Lenny");
        ChickenCoop test = new ChickenCoop(larry, lenny);

        //When
        test.removeChicken(lenny);
        int expected = 1;
        int actual = test.getChickenCoopSize();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getChickenTest(){
        //Given
        Chicken larry = new Chicken("Larry");
        ChickenCoop test = new ChickenCoop(larry);

        //When
        Chicken expected = larry;
        Chicken actual = test.getChicken(larry);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getChickenByIndexTest(){
        //Given
        ChickenCoop test = new ChickenCoop(new Chicken("Larry"));

        //When
        String expected = "Larry";
        String actual = test.getChicken(0).getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getChickenByNameTest(){
        //Given
        ChickenCoop test = new ChickenCoop(new Chicken("Larry"));

        //When
        String expected = "Larry";
        String actual = test.getChicken("Larry").getName();

        //Then
        Assert.assertEquals(expected,actual);
    }



}
