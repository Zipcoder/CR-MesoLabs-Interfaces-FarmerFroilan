package com.zipcodewilmington.froilansfarm.Produce;



public abstract class Produce{

    protected Boolean fertilized = false;

    abstract Edible yield();

    public Boolean hasEdible() {
        return fertilized;
    }

    public Boolean getFertilized() {
        return fertilized;
    }

    public void setFertilized(Boolean fertilized) {
        this.fertilized = fertilized;
    }
}
