package com.zipcodewilmington.froilansfarm.TestEdiblesPackage;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Moonshine;
import org.junit.Assert;
import org.junit.Test;

public class TestMoonshine {
    @Test
    public void testDistill(){
        //Arrange
        Moonshine moonshine = new Moonshine();

        //Action
        moonshine.distill();
        int expected = 1;
        int actual = moonshine.getNumberOfGrowlers();

        //Assert
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testRemoveGrowler(){
        //Arrange
        Moonshine moonshine = new Moonshine();
        moonshine.distill();
        moonshine.distill();

        //Action
        moonshine.removeGrowler(1);
        int expected = 1;
        int actual = moonshine.getNumberOfGrowlers();

        //Assert
        Assert.assertEquals(expected,actual);
    }
}
