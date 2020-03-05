package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.vehicles.Vehicle;

public class Pilot extends Person implements Rider
{
    Boolean mount;
    Boolean dismount;

    public Boolean mount(Vehicle thingToBeMounted)
    {
        return mount;
    }

    public Boolean dismount(Vehicle thingToBeDismounted)
    {
        return dismount;
    }
}

