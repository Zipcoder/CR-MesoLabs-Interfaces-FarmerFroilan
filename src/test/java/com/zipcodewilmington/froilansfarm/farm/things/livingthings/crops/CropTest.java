package com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops;

import org.junit.Assert;
import org.junit.Test;

public class CropTest {

    @Test
    public void fertilzeTest() {
        //Given
        Crop stalky = new CornStalk();

        //When
        stalky.fertilize();

        //Then
        Assert.assertTrue(stalky.isFertilized());
    }

    @Test
    public void harvestTest(){
        //Given
        Crop stalky = new CornStalk();

        //When
        stalky.harvest();

        //Then
        Assert.assertTrue(stalky.isHarvested());
    }

}
