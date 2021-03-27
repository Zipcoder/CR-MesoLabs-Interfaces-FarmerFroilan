package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.factories.CropFactory;
import com.zipcodewilmington.froilansfarm.produce.CarrotPlant;
import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.produce.CropRow;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TractorTest {
    Tractor tractorObj = new Tractor();

    CropRow<CarrotPlant> cropRow;

    @Before
    public void setUp(){
        List<CarrotPlant> crop = new CropFactory().createCarrotPlant(10);
        cropRow = new CropRow<>(crop, false);
    }

    @Test
    public void testHarvest() {
    }

    @Test
    public void testOperate() {
    }

    @Test
    public void testMakeNoise() {


    }

    @Test
    public void testRide() {
    }
}