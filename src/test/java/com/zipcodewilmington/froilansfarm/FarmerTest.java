package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.humans.Farmer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    @Test
    public void farmerConstructorTest() {
        // Given
        String name = "Froilan";

        // When
        Farmer farmer = new Farmer(name);
        String actual = farmer.getName();

        // Then
        Assert.assertEquals(name, actual);

    }

}