package com.zipcodewilmington.froilansfarm.animalTest.peopleTest;

import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    // Failing without sytnax issues - once CropDuster is created - update testCase
    @Test
    public void testPilotRide(){
        // Given
        Pilot pilot = new Pilot();

        // When
        pilot.mount(new CropDuster());


        // Then
        Assert.assertTrue(false);
    }
}
