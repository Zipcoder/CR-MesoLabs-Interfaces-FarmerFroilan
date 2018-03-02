package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FieldTest {
    Field field;
    Field razeField;

    @Before
    public void setup(){
        field = new Field();
        razeField = new Field();
        razeField.plantCrop(new TomatoPlant(), new PotatoPlant(), new CornStalk());
    }

    @Test
    public void plantRowTest(){
        Crop expected = new TomatoPlant();
        field.plantCrop(expected);
        Crop actual = field.getRow(0).getCrops();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void plantRowVarArgsTest(){
        Crop expected = new TomatoPlant();
        field.plantCrop(new PotatoPlant(), expected);
        Crop actaul = field.getRow(1).getCrops();
        Assert.assertEquals(expected, actaul);
    }

}
