package com.zipcodewilmington.froilansfarm.factories;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoops;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ChickenFactoryTest {
    String male;
    ArrayList<Chicken> chickenCoop1= new ArrayList<Chicken>();

    @Test
    public void createChicken() {
        //Given
        Chicken chicken = new Chicken(male);
        chickenCoop1.add(chicken);
        Boolean expected = true;
        //When
        Boolean actual = chickenCoop1.contains(chicken);

        //Then
        Assert.assertEquals(expected,actual);

    }
}