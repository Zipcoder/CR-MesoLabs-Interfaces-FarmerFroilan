package com.zipcodewilmington.froilansfarm.animalTest.ChickenCoopsTest;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.factories.ChickenFactory;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoops;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ChickenCoopTest {
    ChickenFactory chickenFactory = new ChickenFactory();
    List<Chicken> chickenList = chickenFactory.createChickenList(5);
    Chicken newchicken = new Chicken();
    ChickenCoops chickenCoops = new ChickenCoops(chickenList);

    @Test
    public void addTest(){
        //Given
        chickenList.add(newchicken);
        Integer expected = 6;

        //When
        Integer actual = chickenList.size();

        //Then
        Assert.assertEquals(expected,actual);



    }
}
