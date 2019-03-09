package com.zipcodewilmington.froilansfarm.CropTests;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.CornStalk;
import com.zipcodewilmington.froilansfarm.storage.CornSilo;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTests {

    @Test
    public void nullaryConstructorTest(){
        // given
        CornStalk cornStalk = new CornStalk();
        Boolean expectedFertilized = false;
        Integer expectedNumberOfCorn = 0;
        // when
        Boolean actualFertilized = cornStalk.getIsFertilized();
        Integer actualNumberOfCorn = cornStalk.getNumberOfCorn();
        // then
        Assert.assertEquals(expectedFertilized, actualFertilized);
        Assert.assertEquals(expectedNumberOfCorn, actualNumberOfCorn);
    }

    @Test
    public void constructorTest(){
        // given
        CornStalk cornStalk = new CornStalk(true, 4);
        Boolean expectedFertilized = true;
        Integer expectedNumberOfCorn = 4;
        // when
        Boolean actualFertilized = cornStalk.getIsFertilized();
        Integer actualNumberOfCorn = cornStalk.getNumberOfCorn();
        // then
        Assert.assertEquals(expectedFertilized, actualFertilized);
        Assert.assertEquals(expectedNumberOfCorn, actualNumberOfCorn);
    }

    @Test
    public void getIsFertilizedTest(){
        // given
        CornStalk cornStalk = new CornStalk(false, 6);
        Boolean expected = false;
        // when
        Boolean actual = cornStalk.getIsFertilized();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCornTest(){
        // given
        CornStalk cornStalk = new CornStalk(true, 3);
        Integer expected = 3;
        // when
        Integer actual = cornStalk.getNumberOfCorn();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIsFertilizedTest(){
        // given
        CornStalk cornStalk = new CornStalk(false, 3);
        Boolean initial = cornStalk.getIsFertilized();
        // when
        cornStalk.setIsFertilized(true);
        Boolean newValue = cornStalk.getIsFertilized();
        // then
        Assert.assertNotEquals(initial, newValue);
    }

    @Test
    public void setNumberOfCornTest(){
        // given
        CornStalk cornStalk = new CornStalk(true, 2);
        Integer initial = cornStalk.getNumberOfCorn();
        // when
        cornStalk.setNumberOfCorn(5);
        Integer newValue = cornStalk.getNumberOfCorn();
        // then
        Assert.assertNotEquals(initial, newValue);
    }

    @Test
    public void yieldTest(){
        // given
        CornStalk cornStalk = new CornStalk(true, 4);
        Integer expected = 5;
        // when
        cornStalk.yield();
        Integer actual = cornStalk.getNumberOfCorn();
        // then
        Assert.assertEquals(expected, actual);
    }
}
