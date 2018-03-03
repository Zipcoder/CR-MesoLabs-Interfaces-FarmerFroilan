package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.farm.buildings.BuildingTestSuite;
import com.zipcodewilmington.froilansfarm.farm.field.FieldTestSuite;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.CreatureTestSuite;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.CropTestSuite;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EdibleTest;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.VehicleTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)


@Suite.SuiteClasses({
        BuildingTestSuite.class,
        FieldTestSuite.class,
        CreatureTestSuite.class,
        CropTestSuite.class,
        EdibleTest.class,
        VehicleTestSuite.class


})
public class TestSuite {
}
