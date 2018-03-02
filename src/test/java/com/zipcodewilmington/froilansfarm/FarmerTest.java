package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.People.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void getAndSetNameTest() {
        Farmer farmer = new Farmer("Original name");
        Assert.assertEquals(farmer.getName(), "Original name");
        farmer.setName("New name");
        Assert.assertEquals(farmer.getName(), "New name");
    }

}
