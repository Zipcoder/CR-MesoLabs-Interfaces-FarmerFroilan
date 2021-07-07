package com.zipcodewilmington.froilansfarm.Produce;



public abstract class Produce{

    protected Boolean fertilized = false;


    public Boolean hasEdible() {
        return fertilized;
    }

    public Boolean getFertilized() {
        return fertilized;
    }

    public void setFertilized(Boolean fertilized) {
        this.fertilized = fertilized;
    }

    public abstract Bounty yield();
}
