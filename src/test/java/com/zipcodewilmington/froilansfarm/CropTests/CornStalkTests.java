package com.zipcodewilmington.froilansfarm.CropTests;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.CornStalk;
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

        // when
        // then
    }
}
