package com.zipcodewilmington.froilansfarm.peopletest;

import com.zipcodewilmington.froilansfarm.food.Egg;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FarmerTest
{
    @Test
    public void TestEggHarvest()
    {
        Farmer farmer1 = new Farmer();
        ArrayList<Egg> eggNum = new ArrayList<Egg>();
        Assert.assertFalse(eggNum.size() == 0);

    }
}
