package com.zipcodewilmington.froilansfarm.peopletest;

import com.zipcodewilmington.froilansfarm.food.Egg;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FarmerTest
{
    Farmer test = new Farmer();
    @Test
    public void TestEggHarvest()
    {

        ArrayList<Egg> eggNum = new ArrayList<Egg>();
        Assert.assertFalse(eggNum.size() == 0);

    }
}
