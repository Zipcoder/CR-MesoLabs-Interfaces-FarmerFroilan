package com.zipcodewilmington.froilansfarm.animalTest.peopleTest;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Horse;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void testRide() {
        // Given
        Farmer farmer = new Farmer();
        Horse horse = new Horse();

        // When
        farmer.mount(horse);
        Boolean actual = horse.getHasBeenRiddenToday();

        // Then
        Assert.assertTrue(actual);
    }
}
