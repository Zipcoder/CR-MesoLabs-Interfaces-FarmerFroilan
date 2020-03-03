package com.zipcodewilmington.froilansfarm.peopletest;

import com.zipcodewilmington.froilansfarm.people.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest
{
    @Test
    public void TestFarmer()
    {
        Farmer farmer1 = new Farmer();

        Boolean outcome = farmer1.equals(true);

        Assert.assertTrue(outcome);
    }
}
