package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.farm.buildings.BuildingTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)


@Suite.SuiteClasses({
        BuildingTestSuite.class

})
public class TestSuite {
}
