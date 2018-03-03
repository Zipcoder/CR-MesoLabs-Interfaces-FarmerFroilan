package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Person.Duster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/3/18
 */
public class CropDusterTest {
    CropDuster cropDuster;
    Duster pilot;
    CropRow cropRow;

    @Before
    public void setup() {
        cropDuster = new CropDuster();
        pilot = new Duster("rin", 10);
        cropRow = new CropRow();
    }

    @Test
    public void testOperate() {
        //GIVEN
        Assert.fail();
    }

    @Test
    public void testFertilize() {
        Assert.fail();
    }
}