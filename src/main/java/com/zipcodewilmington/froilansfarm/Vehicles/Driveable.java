package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animal.Driver;
import com.zipcodewilmington.froilansfarm.Animal.Rider;

public interface Driveable extends Vehicle {

   public boolean isDriver(Rider rider);
}
