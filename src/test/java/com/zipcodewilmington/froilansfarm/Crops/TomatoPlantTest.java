package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Produce;
import com.zipcodewilmington.froilansfarm.Produce.Tomatoes;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoPlantTest {

    @Test
    public void isProduceAndCropTest() {

        //Given
        TomatoPlant plant = new TomatoPlant();

        //Then
        assertTrue(plant instanceof Produce);
        assertTrue(plant instanceof Crops);

    }

    @Test
    public void hasEdibleTest1() {

        //Given
        TomatoPlant plant = new TomatoPlant();

        //When
        Boolean expected = false;
        Boolean actual = plant.hasEdible();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void hasEdibleTest2() {

        //Given
        TomatoPlant plant = new TomatoPlant();

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
        TomatoPlant plant = new TomatoPlant();

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
        TomatoPlant plant = new TomatoPlant();

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
        TomatoPlant plant = new TomatoPlant();

        //When
        plant.setFertilized(true);
        Tomatoes food = plant.yield();

        //Then
        assertNotNull(food);
        assertTrue(food instanceof Tomatoes);

    }

    @Test
    public void yieldTest2() {

        //Given
        TomatoPlant plant = new TomatoPlant();

        //When
        plant.setFertilized(false);
        Tomatoes food = plant.yield();

        //Then
        assertNull(food);

    }
}
