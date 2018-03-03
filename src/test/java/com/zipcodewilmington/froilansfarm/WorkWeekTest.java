package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.buildings.Stable;
import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Horse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.Pilot;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.Tractor;
import org.junit.Before;

public class WorkWeekTest {

    //Developer's Note//

    /*
    These tests are designed to be run in sequence so as to preserve the state of the farm from
    day to day. All except the first test will fail unless all tests are run together.
    */

    private static final Farm froilandia = new Farm();
    Farmer froilan;
    Pilot froilanda;
    CropDuster badLarry;
    Tractor badLenny;
    WareHouse wareHouse;
    Stable friendStable;
    Stable workStable;
    Stable eliteStable;
    Horse shadowfax;
    Horse americanPharoh;
    ChickenCoop coop1;
    ChickenCoop coop2;
    ChickenCoop coop3;
    ChickenCoop coop4;

    @Before
    public void setUp(){
       froilan = (Farmer)froilandia.getFarmHouse().getPerson("Froilan");
       froilanda = (Pilot)froilandia.getFarmHouse().getPerson("Froilanda");
       badLarry = (CropDuster)froilandia.getVehicles().get(0);
       badLenny = (Tractor) froilandia.getVehicles().get(1);
       wareHouse = froilandia.getWareHouse();
       friendStable = froilandia.getStables().get(0);
       workStable = froilandia.getStables().get(1);
       eliteStable = froilandia.getStables().get(2);
       shadowfax = froilandia.getStables().get(2).getHorse("Shadowfax");
       americanPharoh = froilandia.getStables().get(2).getHorse("American Pharoh");
       coop1 = froilandia.getChickenCoops().get(0);
       coop2 = froilandia.getChickenCoops().get(1);
       coop3 = froilandia.getChickenCoops().get(2);
       coop4 = froilandia.getChickenCoops().get(3);



    }


}
