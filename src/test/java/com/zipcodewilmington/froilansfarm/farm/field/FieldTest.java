package com.zipcodewilmington.froilansfarm.farm.field;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.ArbitrayVegetation;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FieldTest {

    Field test;
    CropRow row1;
    CropRow row2;
    CropRow row3;


    @Before
    public void setUp(){
        row1 = new CropRow(new TomatoPlant(), new TomatoPlant(), new TomatoPlant());
        row2 = new CropRow(new CornStalk(), new CornStalk(), new CornStalk());
        row3 = new CropRow(new ArbitrayVegetation(), new ArbitrayVegetation());
        test = new Field(row1,row2,row3);
    }

    @Test
    public void getRowTest(){
        //Given
        //Field test

        //When
        CropRow expected = row2;
        CropRow actual = test.getRow(row2);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFieldTest(){
        //Given
        //Field test

        //When
        CropRow[] expected = {row1,row2,row3};
        CropRow[] actual = test.getField().toArray(new CropRow[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
    }

}
