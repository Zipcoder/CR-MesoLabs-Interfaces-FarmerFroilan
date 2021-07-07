package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Produce;
import com.zipcodewilmington.froilansfarm.Produce.StringBean;
import com.zipcodewilmington.froilansfarm.Produce.StringBeans;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringBeanPlantTest {

    @Test
    public void isProduceAndCropTest() {

        //Given
        StringBeanPlant plant = new StringBeanPlant();

        //Then
        assertTrue(plant instanceof Produce);
        assertTrue(plant instanceof Crops);

    }

    @Test
    public void hasEdibleTest1() {

        //Given
        StringBeanPlant plant = new StringBeanPlant();

        //When
        Boolean expected = false;
        Boolean actual = plant.hasEdible();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void hasEdibleTest2() {

        //Given
        StringBeanPlant plant = new StringBeanPlant();

        //When
        plant.setFertilized(true);
        Boolean expected = true;
        Boolean actual = plant.hasEdible();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void hasEdibleTest3() {

        //Given
        StringBeanPlant plant = new StringBeanPlant();

        //When
        plant.setHarvested(true);
        Boolean expected = false;
        Boolean actual = plant.hasEdible();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void hasEdibleTest4() {

        //Given
        StringBeanPlant plant = new StringBeanPlant();

        //When
        plant.setHarvested(true);
        plant.setFertilized(true);
        Boolean expected = false;
        Boolean actual = plant.hasEdible();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void yieldTest1() {

        //Given
        StringBeanPlant plant = new StringBeanPlant();

        //When
        plant.setFertilized(true);
        StringBeans food = plant.yield();

        //Then
        assertNotNull(food);
        assertTrue(food instanceof StringBeans);

    }

    @Test
    public void yieldTest2() {

        //Given
        StringBeanPlant plant = new StringBeanPlant();

        //When
        plant.setFertilized(false);
        StringBeans food = plant.yield();

        //Then
        assertNull(food);

    }
}
