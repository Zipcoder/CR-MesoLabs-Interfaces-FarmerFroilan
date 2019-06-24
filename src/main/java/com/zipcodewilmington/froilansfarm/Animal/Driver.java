package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Vehicles.Driveable;

public interface Driver extends Person{

    public void drive(Driveable vehicle);
    public void ceaseDrive(Driveable vehicle);
}
