package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.Vehicles.Harvester;
import org.junit.Test;

public class HarvesterTest {

    @Test
    public void fertilizeCropRowTest() {
        Farmer farmer = new Farmer("Farmer guy");
        Harvester harvester = new Harvester();
        farmer.mount(harvester);

    }

    @Test
    public void harvestCropRowTest() {

    }

}
