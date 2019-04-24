package com.zipcodewilmington.froilansfarm.Tests;

import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;


public class AircraftTest {
    Aircraft aircraft = new CropDuster();

    @Test
    public void readyForFlightTest(){
        Farmer farmer = new Farmer("Froilan");
        farmer.mount();
        
        Assert.assertFalse(aircraft.isInFlight());
    }


    @Test
    public void isInFlight(){

    }
}
