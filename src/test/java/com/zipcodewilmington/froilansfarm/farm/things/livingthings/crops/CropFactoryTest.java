package com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops;

import org.junit.Assert;
import org.junit.Test;

public class CropFactoryTest {

    @Test
    public void createCornStalkTest(){
        //Given
        CropType type = CropType.CORNSTALK;

        //When
        Crop actual = CropFactory.createCrop(type);

        //Then
        Assert.assertTrue(actual instanceof CornStalk);
    }

    @Test
    public void createTomatoPlantTest(){
        //Given
        CropType type = CropType.TOMATOPLANT;

        //When
        Crop actual = CropFactory.createCrop(type);

        //Then
        Assert.assertTrue(actual instanceof TomatoPlant);
    }

    @Test
    public void createArbitraryVegetationTest(){
        //Given
        CropType type = CropType.ARBITRARYVEGETATION;

        //When
        Crop actual = CropFactory.createCrop(type);

        //Then
        Assert.assertTrue(actual instanceof ArbitrayVegetation);
    }

}
