package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.vehicles.Vehicle;

public class Pilot extends Person implements Rider
{

    public Boolean mount(Vehicle thingToBeMounted)
    {
        if(thingToBeMounted.ride(this))
            return true;
        else
            return false;
    }

    public Boolean dismount(Vehicle thingToBeDismounted)
    {
        thingToBeDismounted.stopRiding();
        return true;
    }
}

