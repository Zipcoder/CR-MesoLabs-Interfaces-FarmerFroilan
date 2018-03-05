package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animal.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Field.EarCorn;
import com.zipcodewilmington.froilansfarm.Field.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    @Test
    public void MakeSomeNoiseTest(){
        //Given
        Farmer farmerTest = new Farmer();

        //When
        String expected = "This farm won't run itself... Good thing I'm a Farmer!";
        String actual = farmerTest.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void PlantCropTest(){
//        //Given
//        Farmer farmerTest = new Farmer();
//        farmerTest.plant();
//        //When
//
//    }

    @Test
    public void mountTest(){
        //Given
        Farmer farmerTest = new Farmer();
        Horse horseTest = new Horse();

        farmerTest.mount(horseTest);

        //When
        boolean actual = horseTest.checkRiding();

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void dismountTest(){
        //Given
        Farmer farmerTest = new Farmer();
        Horse horseTest = new Horse();

        farmerTest.dismount(horseTest);

        //When
        boolean actual = horseTest.checkRiding();

        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void PersonEatTest(){
        //Given
        Farmer farmerTest = new Farmer();

        farmerTest.eat(new EarCorn());
        farmerTest.eat(new EdibleEgg());

        //When
        int expected = 2;
        int actual = farmerTest.getPersonsBelly().size();

        //Then
        Assert.assertEquals(expected, actual);
    }

}