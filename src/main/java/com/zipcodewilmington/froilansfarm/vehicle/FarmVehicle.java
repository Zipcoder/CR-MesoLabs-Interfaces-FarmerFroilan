package com.zipcodewilmington.froilansfarm.vehicle;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Rider;

public abstract class FarmVehicle extends Vehicle {

    Rider rider;

   abstract void operate(Farm farm);
}
