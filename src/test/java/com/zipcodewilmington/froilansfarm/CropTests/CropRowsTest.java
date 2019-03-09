package com.zipcodewilmington.froilansfarm.CropTests;

import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.CornStalk;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.PumpkinPlant;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.TomatoPlant;
import com.zipcodewilmington.froilansfarm.storage.CropRows;
import org.junit.Assert;
import org.junit.Test;

public class CropRowsTest {
    @Test
    public void constructorTest(){
        // given
        CropRows cropRows = new CropRows(3, 2, 5);
        Integer expectedNumberOfCornStalk = 3;
        Integer expectedNumberOfTomatoPlant = 2;
        Integer expectedNumberOfPumpkinPlant = 5;
        // when
        Integer actualNumberOfCornStalk = cropRows.getNumberOfCornStalks();
        Integer actualNumberOfTomatoPlant = cropRows.getNumberOfTomatoPlants();
        Integer actualNumberOfPumpkinPlant = cropRows.getNumberOfPumpkinPlant();
        // then
        Assert.assertEquals(expectedNumberOfCornStalk, actualNumberOfCornStalk);
        Assert.assertEquals(expectedNumberOfTomatoPlant, actualNumberOfTomatoPlant);
        Assert.assertEquals(expectedNumberOfPumpkinPlant, actualNumberOfPumpkinPlant);
    }

    @Test
    public void nullaryConstructorTest(){
        // given
        CropRows cropRows = new CropRows();
        Integer expectedNumberOfCornStalk = 0;
        Integer expectedNumberOfTomatoPlant = 0;
        Integer expectedNumberOfPumpkinPlant = 0;
        // when
        Integer actualNumberOfCornStalk = cropRows.getNumberOfCornStalks();
        Integer actualNumberOfTomatoPlant = cropRows.getNumberOfTomatoPlants();
        Integer actualNumberOfPumpkinPlant = cropRows.getNumberOfPumpkinPlant();
        // then
        Assert.assertEquals(expectedNumberOfCornStalk, actualNumberOfCornStalk);
        Assert.assertEquals(expectedNumberOfTomatoPlant, actualNumberOfTomatoPlant);
        Assert.assertEquals(expectedNumberOfPumpkinPlant, actualNumberOfPumpkinPlant);
    }

    @Test
    public void getNumberOfCornStalksTest(){
        // given
        CropRows cropRows = new CropRows(4, 2, 8);
        Integer expected = 4;
        // when
        Integer actual = cropRows.getNumberOfCornStalks();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfTomatoPlantTest(){
        // given
        CropRows cropRows = new CropRows(7, 9, 4);
        Integer expected = 9;
        // when
        Integer actual = cropRows.getNumberOfTomatoPlants();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfPumpkinPlantTest(){
        // given
        CropRows cropRows = new CropRows(7, 9, 5);
        Integer expected = 5;
        // when
        Integer actual = cropRows.getNumberOfPumpkinPlant();
        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void setNumberOfCornStalkTest(){
        // given
        CropRows cropRows = new CropRows();
        Integer initial = cropRows.getNumberOfCornStalks();
        // when
        cropRows.setNumberOfCornStalk(5);
        Integer newValue = cropRows.getNumberOfCornStalks();
        // then
        Assert.assertNotEquals(initial, newValue);
    }

    @Test
    public void setNumberOfTomatoPlantTest(){
        // given
        CropRows cropRows = new CropRows();
        Integer initial = cropRows.getNumberOfTomatoPlants();
        // when
        cropRows.setNumberOfTomatoPlant(3);
        Integer newValue = cropRows.getNumberOfTomatoPlants();
        // then
        Assert.assertNotEquals(initial, newValue);
    }

    @Test
    public void setNumberOfPumpkinPlantTest(){
        // given
        CropRows cropRows = new CropRows();
        Integer initial = cropRows.getNumberOfPumpkinPlant();
        // when
        cropRows.setNumberOfPumpkinPlant(3);
        Integer newValue = cropRows.getNumberOfPumpkinPlant();
        // then
        Assert.assertNotEquals(initial, newValue);
    }

    @Test
    public void addCornStalkTest(){
        // given
        CropRows cropRows = new CropRows(0, 0, 0);
        CornStalk cornStalk = new CornStalk(false, 0);
        Integer expected = 1;
        // when
        cropRows.add(cornStalk);
        Integer actual = cropRows.getNumberOfCornStalks();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTomatoPlantTest(){
        // given
        CropRows cropRows = new CropRows(0, 0, 0);
        TomatoPlant tomatoPlant = new TomatoPlant(false , 0);
        Integer expected = 1;
        // when
        cropRows.add(tomatoPlant);
        Integer actual = cropRows.getNumberOfTomatoPlants();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addPumpkinPlantTest(){
        // given
        CropRows cropRows = new CropRows(0, 0, 0);
        PumpkinPlant pumpkinPlant = new PumpkinPlant(false , 0);
        Integer expected = 1;
        // when
        cropRows.add(pumpkinPlant);
        Integer actual = cropRows.getNumberOfPumpkinPlant();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCornStalkTest(){
        // given
        CropRows cropRows = new CropRows(1, 0, 0);
        CornStalk cornStalk = new CornStalk(true, 5);
        Integer expected = 0;
        // when
        cropRows.remove(cornStalk);
        Integer actual = cropRows.getNumberOfCornStalks();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTomatoPlantTest(){
        // given
        CropRows cropRows = new CropRows(0, 1, 0);
        TomatoPlant tomatoPlant = new TomatoPlant(true, 5);
        Integer expected = 0;
        // when
        cropRows.remove(tomatoPlant);
        Integer actual = cropRows.getNumberOfTomatoPlants();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePumpkinPlantTest(){
        // given
        CropRows cropRows = new CropRows(0, 0, 1);
        PumpkinPlant pumpkinPlant = new PumpkinPlant(true, 5);
        Integer expected = 0;
        // when
        cropRows.remove(pumpkinPlant);
        Integer actual = cropRows.getNumberOfPumpkinPlant();
        // then
        Assert.assertEquals(expected, actual);
    }
}
