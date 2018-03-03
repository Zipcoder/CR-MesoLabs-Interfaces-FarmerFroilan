package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.Pilot;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.Tractor;
import org.junit.Before;

public class WorkWeekTest {

    //Developer's Note//

    /*
    These tests were designed to be run in sequence so as to preserve the state of the farm from
    day to day. All except the first test will fail unless all tests are run at once.
    */

    private static final Farm froilandia = new Farm();

    @Before
    public static void setUp(){
       Farmer froilan = (Farmer)froilandia.getFarmHouse().getPerson("Froilan");
       Pilot froilanda = (Pilot)froilandia.getFarmHouse().getPerson("Froilanda");
       CropDuster badLarry = (CropDuster)froilandia.getVehicles().get(0);
       Tractor badLenny = (Tractor) froilandia.getVehicles().get(1);
       WareHouse wareHouse = froilandia.getWareHouse();

    }


}
