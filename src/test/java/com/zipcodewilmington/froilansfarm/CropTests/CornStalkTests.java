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
        CornStalk cornStalk = new CornStalk(true, 4, 1L);
        Boolean expectedFertilized = true;
        Integer expectedNumberOfCorn = 4;
        Long expectedId = 1L;
        // when
        Boolean actualFertilized = cornStalk.getIsFertilized();
        Integer actualNumberOfCorn = cornStalk.getNumberOfCorn();
        Long actualId = cornStalk.getId();
        // then
        Assert.assertEquals(expectedFertilized, actualFertilized);
        Assert.assertEquals(expectedNumberOfCorn, actualNumberOfCorn);
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void getIsFertilizedTest(){
        // given
        CornStalk cornStalk = new CornStalk(false, 6, 2L);
        Boolean expected = false;
        // when
        Boolean actual = cornStalk.getIsFertilized();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCornTest(){
        // given
        CornStalk cornStalk = new CornStalk(true, 3, 3L);
        Integer expected = 3;
        // when
        Integer actual = cornStalk.getNumberOfCorn();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest(){
        // given
        CornStalk cornStalk = new CornStalk(false, 2, 4L);
        Long expected = 4L;
        // when
        Long actual = cornStalk.getId();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIsFertilizedTest(){
        // given
        CornStalk cornStalk = new CornStalk(false, 3, 5L);
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
        CornStalk cornStalk = new CornStalk(true, 2, 6L);
        Integer initial = cornStalk.getNumberOfCorn();
        // when
        cornStalk.setNumberOfCorn(5);
        Integer newValue = cornStalk.getNumberOfCorn();
        // then
        Assert.assertNotEquals(initial, newValue);
    }

    @Test
    public void setIdTest(){
        // given
        CornStalk cornStalk = new CornStalk(true, 3, 0L);
        Long initial = cornStalk.getId();
        // when
        cornStalk.setId(7L);
        Long newValue = cornStalk.getId();
        // then
        Assert.assertNotEquals(initial, newValue);
    }

    @Test
    public void yieldTest(){
        // given
        CornStalk cornStalk = new CornStalk(true, 4, 8L);
        Integer initial = cornStalk.getNumberOfCorn();
        // when
        cornStalk.yield();
        Integer newValue = cornStalk.getNumberOfCorn();
        // then
        Assert.assertNotEquals(initial, newValue);
    }
}
