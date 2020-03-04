package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ChickenCoopTest {

    Chicken chicken1 = new Chicken();
    Chicken chicken2 = new Chicken();

    @Test
    public void addChickensTest(){
        ChickenCoop coop1 = new ChickenCoop();

        Integer expected = 0;
        Integer actual = coop1.getNumOfChickens();
        Assert.assertEquals(expected,actual);

        coop1.addChickens(chicken1);
        coop1.addChickens(chicken2);

        Integer expected2 = 2;
        Integer actual2 = coop1.getNumOfChickens();
        Assert.assertEquals(expected2,actual2);
    }
    @Test
    public void removeChickensTest(){
        ChickenCoop coop2 = new ChickenCoop();
        coop2.addChickens(chicken1);
        coop2.addChickens(chicken2);

        Integer expected = 2;
        Integer actual = coop2.getNumOfChickens();
        Assert.assertEquals(expected,actual);

        coop2.removeChicken(chicken1);
        Integer expected2 = 1;
        Integer actual2 = coop2.getNumOfChickens();
        Assert.assertEquals(expected2,actual2);
    }
    @Test
    public void getChickensTest(){
        ChickenCoop coop3 = new ChickenCoop();
        coop3.addChickens(chicken1);
        coop3.addChickens(chicken2);

        ArrayList<Chicken> ExpectedChickList = new ArrayList<Chicken>();
        ExpectedChickList.add(chicken1);
        ExpectedChickList.add(chicken2);

        ArrayList<Chicken> ActualChickenList = coop3.getChickens();
        Assert.assertEquals(ExpectedChickList , ActualChickenList);
    }
    @Test
    public void getNumOfChickensTest(){
        ChickenCoop coop4 = new ChickenCoop();
        coop4.addChickens(chicken1);
        coop4.addChickens(chicken2);

        Integer expected = 2;
        Integer actual = coop4.getNumOfChickens();
        Assert.assertEquals(expected,actual);
    }

}
