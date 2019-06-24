package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Produce;
import org.junit.Test;
import static org.junit.Assert.*;

public class CornStalkTest {

    @Test
    public void isProduceAndCropTest() {

        //Given
        CornStalk plant = new CornStalk();

        //Then
        assertTrue(plant instanceof Produce);
        assertTrue(plant instanceof Crops);

    }

    @Test
    public void hasEdibleTest1() {

        //Given
        CornStalk plant = new CornStalk();

        //When
        Boolean expected = false;
        Boolean actual = plant.hasEdible();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void hasEdibleTest2() {

        //Given
        CornStalk plant = new CornStalk();

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
        CornStalk plant = new CornStalk();

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
        CornStalk plant = new CornStalk();

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
        CornStalk plant = new CornStalk();

        //When
        plant.setFertilized(true);
        Edible food = plant.yield();

        //Then
        assertNotNull(food);
        assertTrue(food instanceof EarOfCorn);

    }

    @Test
    public void yieldTest2() {

        //Given
        CornStalk plant = new CornStalk();

        //When
        plant.setFertilized(false);
        Edible food = plant.yield();

        //Then
        assertNull(food);

    }
}
