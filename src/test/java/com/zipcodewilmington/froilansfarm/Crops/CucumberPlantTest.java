package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Cucumbers;
import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Produce;
import org.junit.Test;
import static org.junit.Assert.*;

public class CucumberPlantTest {

    @Test
    public void isProduceAndCropTest() {

        //Given
        CucumberPlant plant = new CucumberPlant();

        //Then
        assertTrue(plant instanceof Produce);
        assertTrue(plant instanceof Crops);

    }

    @Test
    public void hasEdibleTest1() {

        //Given
        CucumberPlant plant = new CucumberPlant();

        //When
        Boolean expected = false;
        Boolean actual = plant.hasEdible();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void hasEdibleTest2() {

        //Given
        CucumberPlant plant = new CucumberPlant();

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
        CucumberPlant plant = new CucumberPlant();

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
        CucumberPlant plant = new CucumberPlant();

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
        CucumberPlant plant = new CucumberPlant();

        //When
        plant.setFertilized(true);
        Cucumbers food = plant.yield();

        //Then
        assertNotNull(food);
        assertTrue(food instanceof Cucumbers);

    }

    @Test
    public void yieldTest2() {

        //Given
        CucumberPlant plant = new CucumberPlant();

        //When
        plant.setFertilized(false);
        Cucumbers food = plant.yield();

        //Then
        assertNull(food);

    }
}
