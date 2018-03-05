package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Exceptions.NoPilotException;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Person.Duster;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        Farm farm = new Farm();
        Farmer rin = new Farmer("Rin", 10);
        CropRow row = farm.getField().getCropRows().get(0);
        rin.plant(new TomatoPlant(), row);

        pilot.fly(cropDuster);


        Assert.assertFalse(row.getCrops().get(0).hasBeenFertilized());

        try {
            cropDuster.operate(farm);
        } catch (NoPilotException e) {
            Assert.fail();
        }

        Assert.assertTrue(row.getCrops().get(0).hasBeenFertilized());
    }

    @Test
    public void testFertilize() {
        Farmer rin = new Farmer("Rin", 10);
        rin.plant(new CornStalk(), cropRow);

        cropDuster.fertilize(cropRow);

        boolean actual = cropRow.getCrops().get(0).hasBeenFertilized();

        Assert.assertTrue(actual);
    }
}