package com.zipcodewilmington.froilansfarm.people;

public class Pilot extends Person implements Rider
{
    Boolean mount;
    Boolean dismount;

    public Boolean mount()
    {
        return mount;
    }

    public Boolean dismount()
    {
        return dismount;
    }
}

